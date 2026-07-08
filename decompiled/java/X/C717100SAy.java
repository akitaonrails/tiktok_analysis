package X;

import android.os.MessageQueue;

/* JADX INFO: renamed from: X.0SAy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C717100SAy implements MessageQueue.IdleHandler {
    public final /* synthetic */ Runnable LL;

    public C717100SAy(Runnable runnable) {
        this.LL = runnable;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        this.LL.run();
        return false;
    }
}
