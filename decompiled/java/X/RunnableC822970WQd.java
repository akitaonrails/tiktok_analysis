package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0WQd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class RunnableC822970WQd implements Runnable, Comparable {
    public final Runnable LL;
    public final C0WPM LLILLJJLI;
    public final long LLILLL = SystemClock.uptimeMillis();
    public Thread LLILZ;

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a8 A[Catch: all -> 0x011a, TryCatch #0 {all -> 0x011a, blocks: (B:30:0x0064, B:32:0x0070, B:34:0x0078, B:36:0x0080, B:37:0x0088, B:39:0x0099, B:46:0x00aa, B:45:0x00a8, B:47:0x00d1, B:49:0x00e3, B:52:0x00ed, B:53:0x00ef), top: B:60:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ed A[Catch: all -> 0x011a, TryCatch #0 {all -> 0x011a, blocks: (B:30:0x0064, B:32:0x0070, B:34:0x0078, B:36:0x0080, B:37:0x0088, B:39:0x0099, B:46:0x00aa, B:45:0x00a8, B:47:0x00d1, B:49:0x00e3, B:52:0x00ed, B:53:0x00ef), top: B:60:0x0064 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ() {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC822970WQd.LIZJ():void");
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            LIZJ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Runnable runnable = this.LL;
        if ((runnable instanceof Comparable) && (obj instanceof RunnableC822970WQd)) {
            return ((Comparable) runnable).compareTo(((RunnableC822970WQd) obj).LL);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof RunnableC822970WQd) && this.LL.equals(((RunnableC822970WQd) obj).LL)) {
            return true;
        }
        return false;
    }

    public RunnableC822970WQd(Runnable runnable, C0WPM c0wpm) {
        this.LL = runnable;
        this.LLILLJJLI = c0wpm;
    }
}
