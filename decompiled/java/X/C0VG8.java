package X;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0VG8, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0VG8 implements Executor {
    public final /* synthetic */ C0VG9 LL;

    public C0VG8(C0VG9 c0vg9) {
        this.LL = c0vg9;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        C786410Ut5.LJJZZIII(this.LL.LIZIZ, runnable);
    }
}
