package X;

import com.bytedance.android.livesdk.guide.model.TaskInfo;
import com.bytedance.android.livesdk.guide.model.TaskInfoResponse;
import com.bytedance.android.livesdk.impl.revenue.strategy.base.TaskManagerV2;
import com.bytedance.android.livesdk.livesetting.revenuestrategy.LiveIncentiveTaskMonitorBlacklist;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0fck, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1134320fck {
    public static final C1134320fck LIZ = new C1134320fck();
    public static final LinkedList<AbstractC1124390fMj> LIZIZ = new LinkedList<>();

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJ() {
        /*
            X.0fc8 r0 = X.C1133940fc8.LIZIZ
            boolean r0 = r0.LIZIZ()
            r3 = 0
            if (r0 == 0) goto L5d
            java.lang.String r7 = "frozen_coin_campaign"
        Lb:
            java.lang.String r0 = "livesdk_incentive_page_show_rd"
            X.0IjA r6 = X.C0IJT.LIZ(r0)
            java.util.LinkedList<X.0fMj> r1 = X.C1134320fck.LIZIZ
            int r0 = r1.size()
            java.util.ListIterator r2 = r1.listIterator(r0)
        L1b:
            boolean r0 = r2.hasPrevious()
            if (r0 == 0) goto L5b
            java.lang.Object r1 = r2.previous()
            boolean r0 = r1 instanceof X.C1124380fMi
            if (r0 == 0) goto L1b
        L29:
            X.0fMj r1 = (X.AbstractC1124390fMj) r1
            if (r1 == 0) goto L58
            long r0 = r1.LIZ
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            long r3 = r5.longValue()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L58
            long r2 = r5.longValue()
            long r0 = X.C158B.LIZ()
            long r0 = r0 - r2
        L46:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "duration_ms"
            r6.LJJII(r1, r0)
            java.lang.String r0 = "task_type"
            r6.LJJII(r7, r0)
            r6.LIZ()
            return
        L58:
            r0 = -1
            goto L46
        L5b:
            r1 = r3
            goto L29
        L5d:
            boolean r0 = X.C1133940fc8.LJIIJJI()
            if (r0 == 0) goto L66
            java.lang.String r7 = "first_recharge_task"
            goto Lb
        L66:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1134320fck.LJ():void");
    }

    public static final void LIZ(C1124380fMi c1124380fMi) {
        LIZIZ.add(c1124380fMi);
    }

    public static Map LIZIZ(TaskInfoResponse.Data data) {
        List<TaskInfo> list;
        TaskInfoResponse.UserTaskInfo userTaskInfo = data.userTaskInfo;
        if (userTaskInfo != null && (list = userTaskInfo.taskInfos) != null) {
            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
            if (iLIZIZ < 16) {
                iLIZIZ = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
            for (TaskInfo taskInfo : list) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('|');
                sbLIZ.append(taskInfo.taskType);
                sbLIZ.append('|');
                Pair pair = new Pair(C2188811AlT.LIZIZ(sbLIZ), String.valueOf(taskInfo.taskStatus));
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
            return linkedHashMap;
        }
        return null;
    }

    public static String LIZJ(Map map) {
        Object obj = null;
        try {
            if (map.isEmpty()) {
                return null;
            }
            StringBuilder sb = new StringBuilder("{");
            for (Map.Entry entry : map.entrySet()) {
                sb.append((String) entry.getKey());
                sb.append(":");
                sb.append((String) entry.getValue());
                sb.append(", ");
            }
            sb.setLength(sb.length() - 2);
            sb.append("}");
            return sb.toString();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                obj = c098200Yq;
            }
            return (String) obj;
        }
    }

    public static final void LJFF(EnumC1134330fcl enumC1134330fcl, HashMap<String, Object> map) {
        try {
            if (LiveIncentiveTaskMonitorBlacklist.INSTANCE.disable(enumC1134330fcl.getErrorCode())) {
                return;
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_incentive_common_error");
            c474500IjALIZ.LJJII(Integer.valueOf(enumC1134330fcl.getErrorCode()), "error_code");
            c474500IjALIZ.LJJII(enumC1134330fcl.getErrorMsg(), "error_msg");
            if (map != null) {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    c474500IjALIZ.LJJII(entry.getValue(), entry.getKey());
                }
            }
            c474500IjALIZ.LIZ();
            C1149560g1K.LJ(c474500IjALIZ);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void LJI(EnumC1134330fcl enumC1134330fcl, String str, boolean z, String str2, String str3) {
        Map mapLIZIZ;
        HashMap map = new HashMap();
        map.put("charge_reason", str);
        map.put("from_quick_gift", Boolean.valueOf(z));
        map.put("gift_enter_from", str2);
        map.put("notification_type", str3);
        TaskManagerV2.LIZ.getClass();
        TaskInfoResponse.Data data = TaskManagerV2.LIZLLL;
        if (data != null) {
            mapLIZIZ = LIZIZ(data);
        } else {
            mapLIZIZ = null;
        }
        map.put("strategy_task_type", mapLIZIZ);
        LJFF(enumC1134330fcl, map);
    }

    public static void LIZLLL(C1134320fck c1134320fck, String str, boolean z, long j, int i, long j2, String str2, int i2, boolean z2, TaskInfoResponse.Data data, boolean z3, int i3) {
        String str3;
        Boolean boolValueOf;
        boolean z4;
        String strSubstring;
        Map mapLIZIZ;
        TaskInfoResponse.UserTaskInfo userTaskInfo;
        List<TaskInfo> list;
        TaskInfoResponse.WidgetInfo widgetInfo;
        c1134320fck.getClass();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_incentive_task_info_result");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(str, Scene.SCENE_SERVICE);
        if (z) {
            str3 = "success";
        } else {
            str3 = "fail";
        }
        c474500IjALIZ.LJJII(str3, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "error_code");
        c474500IjALIZ.LJJII(str2, "log_id");
        c474500IjALIZ.LJJII(Long.valueOf(j2), "daily_watch_duration");
        c474500IjALIZ.LJJII(Long.valueOf(j), "duration_ms");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "retry_count");
        c474500IjALIZ.LJJII(0, "use_cache");
        String strLIZJ = null;
        if (data != null && (widgetInfo = data.widgetInfo) != null) {
            boolValueOf = Boolean.valueOf(widgetInfo.showWidgetEntry);
        } else {
            boolValueOf = null;
        }
        c474500IjALIZ.LJJII(Boolean.valueOf(C176600m4.LIZIZ(boolValueOf)), "show_widget_entry");
        if (data != null && (userTaskInfo = data.userTaskInfo) != null && (list = userTaskInfo.taskInfos) != null && !list.isEmpty()) {
            z4 = false;
        } else {
            z4 = true;
        }
        c474500IjALIZ.LJJII(Boolean.valueOf(z4), "tasks_is_empty");
        c474500IjALIZ.LJJII(Boolean.valueOf(z2), "tasks_is_valid");
        c474500IjALIZ.LJJII("liveroom_widget", "entrance");
        c474500IjALIZ.LJJII("", "exceptionMsg");
        c474500IjALIZ.LJJII("", "exceptionType");
        C1134320fck c1134320fck2 = LIZ;
        if (data != null) {
            strSubstring = data.monitorTag;
        } else {
            strSubstring = null;
        }
        c1134320fck2.getClass();
        if (strSubstring == null) {
            strSubstring = null;
        } else if (strSubstring.length() > 50) {
            strSubstring = strSubstring.substring(0, 50);
        }
        c474500IjALIZ.LJJII(strSubstring, "monitor_tag");
        if (data != null && (mapLIZIZ = LIZIZ(data)) != null) {
            strLIZJ = LIZJ(mapLIZIZ);
        }
        c474500IjALIZ.LJJII(strLIZJ, "strategy_task_detail");
        c474500IjALIZ.LJJII(Boolean.valueOf(z3), "is_first_request");
        c474500IjALIZ.LJJII(Integer.valueOf(i3), "scene_type");
        c474500IjALIZ.LIZ();
        C1149560g1K.LJ(c474500IjALIZ);
    }
}
