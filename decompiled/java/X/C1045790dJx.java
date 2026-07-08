package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0dJx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1045790dJx {
    public final C1BUP LIZ;

    public C1045790dJx(C1BUP c1bup) {
        this.LIZ = c1bup;
    }

    public final void LIZIZ() {
        C1045780dJw.LIZLLL(this.LIZ);
        C1045760dJu c1045760dJu = this.LIZ.LIZIZ;
        c1045760dJu.getClass();
        if (EnumC1046030dKL.NATIVE != c1045760dJu.LIZ) {
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
        C1BUP c1bup = this.LIZ;
        if (!c1bup.LJFF || c1bup.LJI) {
            try {
                c1bup.LJI();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        C1BUP c1bup2 = this.LIZ;
        if (!c1bup2.LJFF || c1bup2.LJI) {
            return;
        }
        if (c1bup2.LJIIIIZZ) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
        C1BUI c1bui = c1bup2.LJ;
        c1bui.getClass();
        C1287860jcO.LIZ.LIZ(c1bui.LJI(), "publishImpressionEvent", c1bui.LIZ);
        c1bup2.LJIIIIZZ = true;
    }

    public static C1045790dJx LIZ(AbstractC1045430dJN abstractC1045430dJN) {
        C1BUP c1bup = (C1BUP) abstractC1045430dJN;
        C1045780dJw.LIZ(abstractC1045430dJN, "AdSession is null");
        if (c1bup.LJ.LIZJ == null) {
            C1045780dJw.LIZLLL(c1bup);
            C1045790dJx c1045790dJx = new C1045790dJx(c1bup);
            c1bup.LJ.LIZJ = c1045790dJx;
            return c1045790dJx;
        }
        throw new IllegalStateException("AdEvents already exists for AdSession");
    }
}
