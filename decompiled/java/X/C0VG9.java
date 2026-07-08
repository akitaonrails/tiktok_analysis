package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0VG9, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VG9 implements InterfaceC787600Uv0 {
    public final C0VJ8 LIZ;
    public final Handler LIZIZ = new Handler(Looper.getMainLooper());
    public final C0VG8 LIZJ = new C0VG8(this);

    public C0VG9(Executor executor) {
        this.LIZ = new C0VJ8(executor);
    }

    public final void LIZ(Runnable runnable) {
        this.LIZ.execute(runnable);
    }
}
