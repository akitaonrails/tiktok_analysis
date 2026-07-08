package X;

/* JADX INFO: renamed from: X.0kKX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class RunnableC1315230kKX implements Runnable {
    public final float LL;
    public final float LLILLJJLI;
    public final /* synthetic */ C1315200kKU LLILLL;

    public final void LIZ() {
        C1315200kKU c1315200kKU = this.LLILLL;
        c1315200kKU.LLJJJIL = true;
        c1315200kKU.LLJJIJI.set(this.LL, this.LLILLJJLI);
        this.LLILLL.LLJJIJIIJIL.set(this.LL, this.LLILLJJLI);
        C1315200kKU c1315200kKU2 = this.LLILLL;
        int offsetForPosition = c1315200kKU2.getOffsetForPosition(this.LL, this.LLILLJJLI);
        c1315200kKU2.LLJILLL = offsetForPosition;
        c1315200kKU2.LLJJ = offsetForPosition;
        C1315200kKU c1315200kKU3 = this.LLILLL;
        c1315200kKU3.LLJJJJLIIL = true;
        c1315200kKU3.requestDisallowInterceptTouchEvent(true);
        this.LLILLL.LLJJL = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("MarkdownView$CheckForLongPress@a669.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MarkdownView$CheckForLongPress@a669.run");
    }

    public RunnableC1315230kKX(C1315200kKU c1315200kKU, float f, float f2) {
        this.LLILLL = c1315200kKU;
        this.LL = f;
        this.LLILLJJLI = f2;
    }
}
