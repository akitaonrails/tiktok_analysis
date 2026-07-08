package X;

import com.bytedance.android.starship.engine.graph.foundation.Task;

/* JADX INFO: renamed from: X.0k7d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1307230k7d extends Exception {
    public final Task LL;

    public final Task getTask() {
        return this.LL;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1307230k7d(Task task) {
        String message;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Task ");
        sbLIZ.append(task.LLILLJJLI);
        sbLIZ.append(" failed for node ");
        sbLIZ.append(task.LL.getId());
        sbLIZ.append(" because ");
        Throwable th = task.LLILZLL.LIZ;
        if (th != null) {
            message = th.getMessage();
        } else {
            message = null;
        }
        sbLIZ.append(message);
        super(C2188811AlT.LIZIZ(sbLIZ), task.LLILZLL.LIZ);
        this.LL = task;
    }
}
