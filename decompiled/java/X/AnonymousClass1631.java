package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.1631, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class AnonymousClass1631 extends AnonymousClass1635<C207108162o, C207047160f> implements InterfaceC585880MyQ {
    public final boolean LJIIJ;
    public final AnonymousClass1631 LJIIJJI;

    @Override // X.InterfaceC585880MyQ
    public final void LIZ(String str) {
    }

    @Override // X.AnonymousClass1637
    public final C164G LIZJ() {
        return new C207047160f("", 0, null, false, false);
    }

    @Override // X.AnonymousClass1637
    public final boolean LIZLLL() {
        return this.LJIIJ;
    }

    @Override // X.AnonymousClass1635
    public final InterfaceC585880MyQ LJI() {
        return this.LJIIJJI;
    }

    public AnonymousClass1631(C207108162o c207108162o) {
        super(c207108162o, new C1055510dZd());
        this.LJIIJ = true;
        this.LJIIJJI = this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AnonymousClass1635
    public final void LJIIIIZZ(String str) {
        super.LJIIIIZZ(str);
        Aweme aweme = (Aweme) this.LIZLLL;
        if (((aweme != null && aweme.isAd()) || !C161T.LIZ().LIZ()) && ((C207047160f) this.LJI.getValue()).LIZIZ) {
            LJ(this.LJFF, EnumC715680S5m.NOT_OVERWRITTEN);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AnonymousClass1637
    public final C164G LIZIZ(C0S5Q c0s5q, C0S5Q c0s5q2, Aweme aweme, EnumC715680S5m enumC715680S5m) {
        Aweme aweme2;
        C0S5P c0s5p = (C0S5P) c0s5q;
        C0S5P c0s5p2 = (C0S5P) c0s5q2;
        Aweme aweme3 = aweme;
        C0SKK c0skk = null;
        if (aweme3 == null) {
            return null;
        }
        int i = C0SBG.LIZ[c0s5p.LIZ.ordinal()];
        boolean z = true;
        if (i != 1 && i != 2) {
            if (i == 3) {
                return null;
            }
            if (i == 4) {
                aweme3.getAid();
                C207138163s c207138163s = new C207138163s(true);
                ((C207108162o) this.LIZ).LJIIL(aweme3, c207138163s);
                return c207138163s.LIZ();
            }
            throw new C1954807lC();
        }
        if (c0s5p2 != null) {
            c0skk = c0s5p2.LIZ;
        }
        if (c0skk == C0SKK.TRANSLATED || (((aweme2 = (Aweme) this.LIZLLL) != null && aweme2.isAd()) || !C161T.LIZ().LIZ())) {
            z = false;
        }
        aweme3.getAid();
        C207138163s c207138163s2 = new C207138163s(z);
        ((C207108162o) this.LIZ).LJIIL(aweme3, c207138163s2);
        return c207138163s2.LIZ();
    }
}
