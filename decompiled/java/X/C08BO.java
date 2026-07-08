package X;

import android.os.Looper;
import android.util.Log;
import java.io.PrintStream;
import java.lang.Thread;

/* JADX INFO: renamed from: X.08BO, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08BO implements Thread.UncaughtExceptionHandler {
    public final Thread.UncaughtExceptionHandler LIZ;
    public final long LIZIZ = Looper.getMainLooper().getThread().getId();

    public C08BO(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.LIZ = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        PrintStream printStream = System.err;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("currentActivity=");
        sbLIZ.append(C2214201BlK.LJFF());
        printStream.println(C2188811AlT.LIZIZ(sbLIZ));
        PrintStream printStream2 = System.err;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("uncaughtException=");
        sbLIZ2.append(Log.getStackTraceString(th));
        printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
        if ((th instanceof IllegalStateException) && thread != null && thread.getId() != this.LIZIZ && th.getMessage() != null && "Results have already been set".equals(th.getMessage().trim())) {
            C794240VDq.LIZJ("gms_crash_results_have_already_been_set", null);
            return;
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.LIZ;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
