package X;

import Y.ACallableS436S0100000_34;

/* JADX INFO: renamed from: X.1BiN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class RunnableC2212371BiN implements Runnable {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ boolean LLILLJJLI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("BDASplashWebService@dab3.sendStockRequest$1");
        try {
            C2212231Bi9.LJ.submit(new ACallableS436S0100000_34(this, 0));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BDASplashWebService@dab3.sendStockRequest$1");
    }

    public RunnableC2212371BiN(boolean z, boolean z2) {
        this.LL = z;
        this.LLILLJJLI = z2;
    }
}
