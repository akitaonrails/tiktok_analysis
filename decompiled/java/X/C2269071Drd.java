package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.services.performance.ICrashCustomTagListener;
import com.ss.android.ugc.aweme.services.performance.ICrashReportService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Drd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2269071Drd extends C09AY implements Function0<C2259608tG> {
    public C2269071Drd() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.08tG] */
    @Override // kotlin.jvm.functions.Function0
    public final C2259608tG invoke() {
        return new ICrashReportService() { // from class: X.08tG
            public final ArrayList<ICrashCustomTagListener> LIZ = new ArrayList<>();

            @Override // com.ss.android.ugc.aweme.services.performance.ICrashReportService
            public final void addCrashCustomTagListener(ICrashCustomTagListener iCrashCustomTagListener) {
                synchronized (this.LIZ) {
                    try {
                        this.LIZ.add(iCrashCustomTagListener);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }

            @Override // com.ss.android.ugc.aweme.services.performance.ICrashReportService
            public final void report(int i) throws Exception {
                String str;
                String string;
                HashMap<String, Object> map = C2265108u9.LIZ.get(i);
                if (map != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<String, Object> entry : map.entrySet()) {
                        Object value = entry.getValue();
                        if (value != null && (string = value.toString()) != null && string.length() > 0) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    String str2 = "java_crash_detected";
                    if (i == 1) {
                        str = "oom_detected";
                    } else if (i == 2) {
                        str = "native_crash_detected";
                    } else if (i == 3) {
                        str = "java_crash_detected";
                    } else {
                        throw new Exception("Unknown error type");
                    }
                    sbLIZ.append(str);
                    sbLIZ.append(": ");
                    sbLIZ.append(linkedHashMap);
                    C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
                    List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
                    if (i == 1) {
                        str2 = "oom_detected";
                    } else if (i == 2) {
                        str2 = "native_crash_detected";
                    }
                    C0LAB c0lab = new C0LAB();
                    c0lab.LJI(linkedHashMap);
                    C2341909Fp.LIZ(str2, c0lab.LIZ);
                }
            }

            @Override // com.ss.android.ugc.aweme.services.performance.ICrashReportService
            public final void setCustomTag(String str, String str2) {
                synchronized (this.LIZ) {
                    try {
                        Iterator<ICrashCustomTagListener> it2 = this.LIZ.iterator();
                        while (it2.hasNext()) {
                            it2.next().setCustomTag(str, str2);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
        };
    }
}
