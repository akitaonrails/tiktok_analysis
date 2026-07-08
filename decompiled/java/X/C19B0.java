package X;

import Y.ARunnableS101S0200000_32;

/* JADX INFO: renamed from: X.19B0, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19B0 extends AbstractRunnableC21499319Bv {
    public final /* synthetic */ C19B6 LL;
    public final /* synthetic */ C21495919An LLILLJJLI;
    public final /* synthetic */ AbstractRunnableC21499319Bv LLILLL;
    public final /* synthetic */ C21496419As LLILZ;

    public final void LIZ() {
        String strLIZLLL = this.LLILZ.LIZ.LIZLLL("NavigationManager execute operation directly");
        this.LLILZ.LIZ.LJIILJJIL(this.LL, null);
        this.LLILZ.LIZ.LJIILJJIL(this.LLILLJJLI, new ARunnableS101S0200000_32(this, this.LLILLL, 45));
        this.LLILZ.LIZ.LJIIL(strLIZLLL);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("CoordinatePopCountOperation@e739.execute$4");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CoordinatePopCountOperation@e739.execute$4");
    }

    public C19B0(C21496419As c21496419As, C19B6 c19b6, C21495919An c21495919An, C19B3 c19b3) {
        this.LLILZ = c21496419As;
        this.LL = c19b6;
        this.LLILLJJLI = c21495919An;
        this.LLILLL = c19b3;
    }
}
