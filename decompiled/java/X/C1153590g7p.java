package X;

import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.Npth;
import com.bytedance.tt.reliability.monitor.viewchecker.ExceptionInfoReporter;
import com.bytedance.tt.reliability.monitor.viewchecker.FragmentChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.model.FragmentCheckerConfig;
import com.ss.android.ugc.aweme.experiment.Config;
import com.ss.android.ugc.aweme.experiment.FragmentFilter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0g7p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1153590g7p {
    public static void LIZ() {
        Config config = (Config) C1153570g7n.LIZIZ.getValue();
        ArrayList arrayList = new ArrayList();
        if (config.enable) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("init add fragment checker ");
            sbLIZ.append(config);
            C1720106oR.LJI("crash_trace_info", C2188811AlT.LIZIZ(sbLIZ));
            List<FragmentFilter> list = config.fragmentFilters;
            if (list != null) {
                for (FragmentFilter fragmentFilter : list) {
                    arrayList.add(new FragmentCheckerConfig(fragmentFilter.tag, fragmentFilter.fragmentName));
                }
            }
            FragmentChecker.init(true, config.maxDumpCount, arrayList, new ExceptionInfoReporter() { // from class: X.1B0Z
                @Override // com.bytedance.tt.reliability.monitor.viewchecker.ExceptionInfoReporter
                public final void report(String str) {
                    Npth.addTag("has_custom_crash_trace_info", "true");
                    final LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("crash_trace_info", str);
                    AttachUserData attachUserData = new AttachUserData() { // from class: X.1B0a
                        @Override // com.bytedance.crash.AttachUserData
                        public final Map<? extends String, ? extends String> getUserData(CrashType crashType) {
                            return linkedHashMap;
                        }
                    };
                    Npth.addAttachUserData(attachUserData, CrashType.JAVA);
                    Npth.addAttachUserData(attachUserData, CrashType.LAUNCH);
                    int i2 = C2187451AjH.LIZ;
                    C1720106oR.LIZ("crash_trace_info", str);
                }
            });
        }
    }
}
