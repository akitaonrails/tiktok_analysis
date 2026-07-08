package X;

import Y.ALAdapterS6S0110000_17;

/* JADX INFO: renamed from: X.0fPv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1126370fPv {
    public final C1126380fPw LIZ;

    public final void LIZ() {
        this.LIZ.LIZIZ.cancel();
    }

    public final boolean LIZIZ() {
        return this.LIZ.LIZIZ.isRunning();
    }

    public final void LIZJ() {
        C1126380fPw c1126380fPw = this.LIZ;
        c1126380fPw.LIZIZ.cancel();
        c1126380fPw.LIZIZ.removeAllListeners();
        if (c1126380fPw.LIZLLL != null || c1126380fPw.LJ != null) {
            c1126380fPw.LIZIZ.addListener(new ALAdapterS6S0110000_17(c1126380fPw, 0));
        }
        c1126380fPw.LIZIZ.playSequentially(c1126380fPw.LIZJ);
        c1126380fPw.LIZIZ.start();
    }

    public C1126370fPv(C1126380fPw c1126380fPw) {
        this.LIZ = c1126380fPw;
    }
}
