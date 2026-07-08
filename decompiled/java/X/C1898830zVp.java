package X;

import com.bytedance.keva.Keva;
import com.bytedance.touchpoint.api.model.TaskEvent;
import com.bytedance.touchpoint.api.model.TaskEventContent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0zVp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1898830zVp {
    public static final Keva LIZ = Keva.getRepo("task_event_storage");

    public static String LIZ(TaskEvent taskEvent) {
        String str = taskEvent.userActionType;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = taskEvent.id;
        if (str3 != null) {
            str2 = str3;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(str2);
        sbLIZ.append('_');
        sbLIZ.append("content");
        return C1894310zOX.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LIZIZ(TaskEvent taskEvent) {
        LIZ.storeString(LIZ(taskEvent), "");
    }

    public static TaskEventContent LIZJ(TaskEvent taskEvent) {
        String string = LIZ.getString(LIZ(taskEvent), "");
        if (string.length() > 0) {
            try {
                return (TaskEventContent) C20484080s.LIZ(string, TaskEventContent.class);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return null;
            }
        }
        return null;
    }

    public static void LIZLLL(TaskEvent taskEvent, TaskEventContent taskEventContent) {
        LIZ.storeString(LIZ(taskEvent), C20484080s.LIZJ(taskEventContent));
    }
}
