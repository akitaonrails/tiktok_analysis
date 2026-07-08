package X;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0SL2, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SL2 implements Runnable {
    public final WeakReference<C0SLU> LL;
    public String LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("PhotoFeedLayoutHooker$WeakRefDelayRun@fae7.run");
        try {
            C0SLU c0slu = this.LL.get();
            if (c0slu != null) {
                if (this.LLILZ) {
                    c0slu.LJJIIZ(this.LLILLJJLI);
                } else if (c0slu.LJIILIIL(this.LLILLJJLI, this.LLILLL)) {
                    this.LLILLL = false;
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PhotoFeedLayoutHooker$WeakRefDelayRun@fae7.run");
    }

    public C0SL2(C0SLU c0slu) {
        this.LL = new WeakReference<>(c0slu);
    }
}
