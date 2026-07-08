package X;

import com.bytedance.touchpoint.api.model.TaskEvent;
import com.bytedance.touchpoint.api.model.TaskEventContent;
import com.bytedance.touchpoint.api.model.UserActionContent;
import java.util.UUID;

/* JADX INFO: renamed from: X.0zVr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1898850zVr {
    public static final /* synthetic */ int LIZ = 0;

    public static TaskEventContent LIZ(TaskEvent taskEvent, String str, UserActionContent userActionContent, String str2) {
        String str3 = taskEvent.id;
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        String str5 = taskEvent.taskEventKey;
        if (str5 != null) {
            str4 = str5;
        }
        return new TaskEventContent(str3, str4, System.currentTimeMillis(), UUID.randomUUID().toString(), str2, str, taskEvent.validRules, taskEvent.reportInstruction, userActionContent);
    }
}
