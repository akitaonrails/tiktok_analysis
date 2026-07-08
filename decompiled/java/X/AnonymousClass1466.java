package X;

import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.experiment.ColdBootAppLogReportConfig;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.performanceopt.api.IBootFinishTaskHippoMetricReporter;
import com.ss.android.ugc.aweme.performanceopt.api.IEventTrackApi;
import com.ss.android.ugc.aweme.performanceopt.api.IPerformanceExperimentApi;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1466, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class AnonymousClass1466 {
    public static final AnonymousClass1466 LIZ = new AnonymousClass1466();

    public static final void LIZ(AnonymousClass1469 anonymousClass1469, boolean z) throws JSONException {
        if (z) {
            LIZ.getClass();
            ColdBootAppLogReportConfig coldBootAppLogReportConfig = (ColdBootAppLogReportConfig) AnonymousClass1463.LIZIZ.getValue();
            JSONObject jSONObject = new JSONObject();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('(');
            C202098145w c202098145wLIZ = C08TN.LIZ();
            String str = anonymousClass1469.LJIIIIZZ;
            c202098145wLIZ.getClass();
            sbLIZ.append(C202098145w.LJJJJJ(str));
            sbLIZ.append(')');
            sbLIZ.append(anonymousClass1469.LIZ);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append('(');
            C202098145w c202098145wLIZ2 = C08TN.LIZ();
            String str2 = anonymousClass1469.LJIIIIZZ;
            c202098145wLIZ2.getClass();
            sbLIZ2.append(C202098145w.LJJJJJ(str2));
            sbLIZ2.append(")(cpu)");
            sbLIZ2.append(anonymousClass1469.LIZ);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            double d = anonymousClass1469.LIZIZ;
            double d2 = anonymousClass1469.LJII;
            double d3 = anonymousClass1469.LIZJ;
            String str3 = anonymousClass1469.LIZ;
            if (coldBootAppLogReportConfig != null && coldBootAppLogReportConfig.enable) {
                Iterator<String> it2 = coldBootAppLogReportConfig.bootFinishTaskList.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.LJFF(it2.next(), str3)) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(str3);
                        sbLIZ3.append("_cost");
                        jSONObject.put(C2188811AlT.LIZIZ(sbLIZ3), d);
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append(str3);
                        sbLIZ4.append("_start_time");
                        jSONObject.put(C2188811AlT.LIZIZ(sbLIZ4), d2);
                    }
                }
            }
            IBootFinishTaskHippoMetricReporter iBootFinishTaskHippoMetricReporter = (IBootFinishTaskHippoMetricReporter) PluggableExtentionKt.pluggableSpi$default(IBootFinishTaskHippoMetricReporter.class, false, false, false, 14, null);
            IPerformanceExperimentApi iPerformanceExperimentApi = (IPerformanceExperimentApi) PluggableExtentionKt.pluggableSpi$default(IPerformanceExperimentApi.class, false, false, false, 14, null);
            if (iPerformanceExperimentApi != null && iPerformanceExperimentApi.LIZ() && iBootFinishTaskHippoMetricReporter != null) {
                iBootFinishTaskHippoMetricReporter.LIZ(strLIZIZ, strLIZIZ2, d, d3, d2);
            } else {
                ArrayList<C1909907dx> arrayListLJ = C1697810uHb.LJ(new C1909907dx(strLIZIZ, d), new C1909907dx(strLIZIZ2, d3));
                ArrayList<C1909907dx> arrayListLJ2 = C1697810uHb.LJ(new C1909907dx(strLIZIZ, d2));
                C202103146b.LIZ(0, "feed_total").LJFF("boot_finish_task_cost", arrayListLJ);
                C202103146b.LIZ(0, "feed_total").LJFF("boot_finish_task_time", arrayListLJ2);
            }
            if (jSONObject.length() > 0) {
                AppLogNewUtils.onEventV3("perf_boot_finish_task_info", jSONObject);
            }
        }
        LIZ.getClass();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("task_name", anonymousClass1469.LIZ);
        jSONObject2.put("wall_duration", anonymousClass1469.LIZIZ);
        jSONObject2.put("cpu_duration", anonymousClass1469.LIZJ);
        jSONObject2.put("is_used_and_executed", anonymousClass1469.LIZLLL);
        jSONObject2.put("is_used", anonymousClass1469.LJ);
        jSONObject2.put("is_analysis_on", anonymousClass1469.LJFF);
        jSONObject2.put("start_time", anonymousClass1469.LJII);
        jSONObject2.put("thread_name", anonymousClass1469.LJIIIIZZ);
        jSONObject2.put("is_metadata", anonymousClass1469.LJI);
        IEventTrackApi iEventTrackApi = (IEventTrackApi) PluggableExtentionKt.pluggableSpi$default(IEventTrackApi.class, false, false, false, 14, null);
        if (iEventTrackApi != null) {
            iEventTrackApi.LIZ(jSONObject2);
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("reportToTEA: ");
        sbLIZ5.append(jSONObject2);
        C2188811AlT.LIZIZ(sbLIZ5);
    }
}
