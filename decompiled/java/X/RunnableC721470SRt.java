package X;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0SRt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class RunnableC721470SRt implements Runnable {
    public final WeakReference<C0SS8> LL;
    public int LLILLJJLI;
    public Integer LLILLL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("WeakRefOffsetRunnable@9f41.run");
        try {
            C0SS8 c0ss8 = this.LL.get();
            if (c0ss8 != null) {
                c0ss8.LIZLLL(this.LLILLJJLI, this.LLILLL);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("WeakRefOffsetRunnable@9f41.run");
    }

    public RunnableC721470SRt(C0SS8 c0ss8) {
        this.LL = new WeakReference<>(c0ss8);
    }
}
