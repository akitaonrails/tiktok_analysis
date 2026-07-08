package X;

import java.util.ArrayList;

/* JADX INFO: renamed from: X.19OF, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public abstract class C19OF implements InterfaceC21531119Ob {
    public int LIZ;
    public C19OA LIZIZ;
    public C19OR LIZJ;
    public C19O3 LIZLLL;
    public final C19OX LJ = new C19OX(this);
    public int LJFF = 0;
    public boolean LJI = false;
    public final C19OL LJII = new C19OL(this);
    public final C19OL LJIIIIZZ = new C19OL(this);
    public C18JW LJIIIZ = C18JW.NONE;

    @Override // X.InterfaceC21531119Ob
    public void LIZ(InterfaceC21531119Ob interfaceC21531119Ob) {
    }

    public abstract void LIZLLL();

    public abstract void LJ();

    public abstract void LJFF();

    public abstract boolean LJIIJ();

    public long LJIIIZ() {
        if (this.LJ.LJIIIZ) {
            return r1.LJI;
        }
        return 0L;
    }

    public C19OF(C19OA c19oa) {
        this.LIZIZ = c19oa;
    }

    public static C19OL LJII(C19OG c19og) {
        C19OG c19og2 = c19og.LJFF;
        if (c19og2 == null) {
            return null;
        }
        C19OA c19oa = c19og2.LIZLLL;
        int i = C19OY.LIZ[c19og2.LJ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return null;
                        }
                        return c19oa.verticalRun.LJIIIIZZ;
                    }
                    return c19oa.verticalRun.LJIIJ;
                }
                return c19oa.verticalRun.LJII;
            }
            return c19oa.horizontalRun.LJIIIIZZ;
        }
        return c19oa.horizontalRun.LJII;
    }

    public static C19OL LJIIIIZZ(C19OG c19og, int i) {
        C19OF c19of;
        C19OG c19og2 = c19og.LJFF;
        if (c19og2 == null) {
            return null;
        }
        C19OA c19oa = c19og2.LIZLLL;
        if (i == 0) {
            c19of = c19oa.horizontalRun;
        } else {
            c19of = c19oa.verticalRun;
        }
        int i2 = C19OY.LIZ[c19og2.LJ.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        return null;
                    }
                }
            }
            return c19of.LJIIIIZZ;
        }
        return c19of.LJII;
    }

    public final int LJI(int i, int i2) {
        if (i2 == 0) {
            C19OA c19oa = this.LIZIZ;
            int i3 = c19oa.mMatchConstraintMaxWidth;
            int iMax = Math.max(c19oa.mMatchConstraintMinWidth, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax != i) {
                return iMax;
            }
        } else {
            C19OA c19oa2 = this.LIZIZ;
            int i4 = c19oa2.mMatchConstraintMaxHeight;
            int iMax2 = Math.max(c19oa2.mMatchConstraintMinHeight, i);
            if (i4 > 0) {
                iMax2 = Math.min(i4, i);
            }
            if (iMax2 != i) {
                return iMax2;
            }
        }
        return i;
    }

    public static void LIZIZ(C19OL c19ol, C19OL c19ol2, int i) {
        ((ArrayList) c19ol.LJIIJJI).add(c19ol2);
        c19ol.LJFF = i;
        ((ArrayList) c19ol2.LJIIJ).add(c19ol);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(X.C19OG r16, X.C19OG r17, int r18) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19OF.LJIIJJI(X.19OG, X.19OG, int):void");
    }

    public final void LIZJ(C19OL c19ol, C19OL c19ol2, int i, C19OX c19ox) {
        ((ArrayList) c19ol.LJIIJJI).add(c19ol2);
        ((ArrayList) c19ol.LJIIJJI).add(this.LJ);
        c19ol.LJII = i;
        c19ol.LJIIIIZZ = c19ox;
        ((ArrayList) c19ol2.LJIIJ).add(c19ol);
        ((ArrayList) c19ox.LJIIJ).add(c19ol);
    }
}
