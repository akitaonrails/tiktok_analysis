package X;

import com.bytedance.ies.powerpreload.task.TaskTraceMetric;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0hPU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1202980hPU {
    public static final void LIZ(String str, String str2, long j, long j2, long j3, boolean z, InterfaceC1164020gOe interfaceC1164020gOe) {
        boolean z2;
        boolean z3 = true;
        if (str2.length() != 0 && j2 > 0 && j3 > 0 && j > 0) {
            if (str == null) {
                str = "";
            }
            TaskTraceMetric taskTraceMetricRemove = C1203000hPW.LIZ.remove(str);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (taskTraceMetricRemove != null) {
                Long lValueOf = Long.valueOf(taskTraceMetricRemove.taskExecuteStartTime);
                if (lValueOf.longValue() >= j) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    linkedHashMap.put("to_execute_stime", String.valueOf(lValueOf.longValue() - j));
                }
                Long lValueOf2 = Long.valueOf(taskTraceMetricRemove.taskExecuteEndTime);
                if (lValueOf2.longValue() >= j) {
                    linkedHashMap.put("to_execute_etime", String.valueOf(lValueOf2.longValue() - j));
                }
                Long lValueOf3 = Long.valueOf(taskTraceMetricRemove.shootStartTime);
                if (lValueOf3.longValue() >= j) {
                    linkedHashMap.put("to_shoot_stime", String.valueOf(lValueOf3.longValue() - j));
                }
                Long lValueOf4 = Long.valueOf(taskTraceMetricRemove.shootEndTime);
                if (lValueOf4.longValue() >= j) {
                    linkedHashMap.put("to_shoot_etime", String.valueOf(lValueOf4.longValue() - j));
                }
                if (taskTraceMetricRemove.taskExecuteEndTime <= 0) {
                    z3 = false;
                }
                linkedHashMap.put("preload_ab_open", String.valueOf(z3));
            }
            linkedHashMap.put("to_request_time", String.valueOf(j2 - j));
            linkedHashMap.put("to_response_time", String.valueOf(j3 - j));
            linkedHashMap.put("page_name", str2);
            linkedHashMap.put("preload_ab_setting", String.valueOf(z));
            interfaceC1164020gOe.onEvent(linkedHashMap);
        }
    }
}
