package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.1DoT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2267111DoT extends AbstractC2267131DoV {
    public final C2267191Dob LJIIJ;
    public C2267371Dot LJIIJJI;

    @Override // X.AbstractC2267131DoV
    public final void LJ() {
        this.LIZJ = null;
        this.LJII.LIZJ();
        this.LJIIIIZZ.LIZJ();
        this.LJIIJ.LIZJ();
        this.LJ.LIZJ();
        this.LJI = false;
    }

    public final void LJIIIZ() {
        this.LJI = false;
        this.LJII.LIZJ();
        this.LJII.LJIIIZ = false;
        this.LJIIIIZZ.LIZJ();
        this.LJIIIIZZ.LJIIIZ = false;
        this.LJIIJ.LIZJ();
        this.LJIIJ.LJIIIZ = false;
        this.LJ.LJIIIZ = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v215, types: [X.1Dot] */
    @Override // X.AbstractC2267131DoV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL() {
        /*
            Method dump skipped, instruction units count: 1083
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2267111DoT.LIZLLL():void");
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VerticalRun ");
        sbLIZ.append(this.LIZIZ.LJJLI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2267111DoT(C2267081DoQ c2267081DoQ) {
        super(c2267081DoQ);
        C2267191Dob c2267191Dob = new C2267191Dob(this);
        this.LJIIJ = c2267191Dob;
        this.LJIIJJI = null;
        this.LJII.LJ = EnumC21532519Op.TOP;
        this.LJIIIIZZ.LJ = EnumC21532519Op.BOTTOM;
        c2267191Dob.LJ = EnumC21532519Op.BASELINE;
        this.LJFF = 1;
    }

    @Override // X.AbstractC2267131DoV, X.InterfaceC2267401Dow
    public final void LIZ(InterfaceC2267401Dow interfaceC2267401Dow) {
        float f;
        float f2;
        float f3;
        int i;
        if (this.LJIIIZ.ordinal() != 3) {
            C2267281Dok c2267281Dok = this.LJ;
            if (c2267281Dok.LIZJ && !c2267281Dok.LJIIIZ && this.LIZLLL == EnumC2266981DoG.MATCH_CONSTRAINT) {
                C2267081DoQ c2267081DoQ = this.LIZIZ;
                int i2 = c2267081DoQ.LJIJI;
                if (i2 != 2) {
                    if (i2 == 3) {
                        C2267281Dok c2267281Dok2 = c2267081DoQ.LIZLLL.LJ;
                        if (c2267281Dok2.LJIIIZ) {
                            int i3 = c2267081DoQ.LJJJJL;
                            if (i3 != -1) {
                                if (i3 != 0) {
                                    if (i3 != 1) {
                                        i = 0;
                                        c2267281Dok.LIZLLL(i);
                                    } else {
                                        f = c2267281Dok2.LJI;
                                        f2 = c2267081DoQ.LJJJJJL;
                                    }
                                } else {
                                    f3 = c2267281Dok2.LJI * c2267081DoQ.LJJJJJL;
                                    i = (int) (f3 + 0.5f);
                                    c2267281Dok.LIZLLL(i);
                                }
                            } else {
                                f = c2267281Dok2.LJI;
                                f2 = c2267081DoQ.LJJJJJL;
                            }
                            f3 = f / f2;
                            i = (int) (f3 + 0.5f);
                            c2267281Dok.LIZLLL(i);
                        }
                    }
                } else {
                    C2267271Doj c2267271Doj = c2267081DoQ.LJJJJI;
                    if (c2267271Doj != null) {
                        if (c2267271Doj.LJ.LJ.LJIIIZ) {
                            c2267281Dok.LIZLLL((int) ((r2.LJI * c2267081DoQ.LJJII) + 0.5f));
                        }
                    }
                }
            }
            C2267191Dob c2267191Dob = this.LJII;
            if (c2267191Dob.LIZJ) {
                C2267191Dob c2267191Dob2 = this.LJIIIIZZ;
                if (c2267191Dob2.LIZJ) {
                    if (c2267191Dob.LJIIIZ && c2267191Dob2.LJIIIZ && this.LJ.LJIIIZ) {
                        return;
                    }
                    if (!this.LJ.LJIIIZ && this.LIZLLL == EnumC2266981DoG.MATCH_CONSTRAINT) {
                        C2267081DoQ c2267081DoQ2 = this.LIZIZ;
                        if (c2267081DoQ2.LJIJ == 0 && !c2267081DoQ2.LJIJI()) {
                            C2267191Dob c2267191Dob3 = (C2267191Dob) ListProtector.get(this.LJII.LJIIJJI, 0);
                            C2267191Dob c2267191Dob4 = (C2267191Dob) ListProtector.get(this.LJIIIIZZ.LJIIJJI, 0);
                            int i4 = c2267191Dob3.LJI;
                            C2267191Dob c2267191Dob5 = this.LJII;
                            int i5 = i4 + c2267191Dob5.LJFF;
                            int i6 = c2267191Dob4.LJI + this.LJIIIIZZ.LJFF;
                            c2267191Dob5.LIZLLL(i5);
                            this.LJIIIIZZ.LIZLLL(i6);
                            this.LJ.LIZLLL(i6 - i5);
                            return;
                        }
                    }
                    if (!this.LJ.LJIIIZ && this.LIZLLL == EnumC2266981DoG.MATCH_CONSTRAINT && this.LIZ == 1 && ((ArrayList) this.LJII.LJIIJJI).size() > 0 && ((ArrayList) this.LJIIIIZZ.LJIIJJI).size() > 0) {
                        C2267191Dob c2267191Dob6 = (C2267191Dob) ListProtector.get(this.LJII.LJIIJJI, 0);
                        int i7 = (((C2267191Dob) ListProtector.get(this.LJIIIIZZ.LJIIJJI, 0)).LJI + this.LJIIIIZZ.LJFF) - (c2267191Dob6.LJI + this.LJII.LJFF);
                        C2267281Dok c2267281Dok3 = this.LJ;
                        int i8 = c2267281Dok3.LJIIL;
                        if (i7 < i8) {
                            c2267281Dok3.LIZLLL(i7);
                        } else {
                            c2267281Dok3.LIZLLL(i8);
                        }
                    }
                    if (this.LJ.LJIIIZ && ((ArrayList) this.LJII.LJIIJJI).size() > 0 && ((ArrayList) this.LJIIIIZZ.LJIIJJI).size() > 0) {
                        C2267191Dob c2267191Dob7 = (C2267191Dob) ListProtector.get(this.LJII.LJIIJJI, 0);
                        C2267191Dob c2267191Dob8 = (C2267191Dob) ListProtector.get(this.LJIIIIZZ.LJIIJJI, 0);
                        int i9 = c2267191Dob7.LJI;
                        C2267191Dob c2267191Dob9 = this.LJII;
                        int i10 = c2267191Dob9.LJFF + i9;
                        int i11 = c2267191Dob8.LJI;
                        int i12 = this.LJIIIIZZ.LJFF + i11;
                        float f4 = this.LIZIZ.LJJJLZIJ;
                        if (c2267191Dob7 == c2267191Dob8) {
                            f4 = 0.5f;
                        } else {
                            i9 = i10;
                            i11 = i12;
                        }
                        c2267191Dob9.LIZLLL((int) (i9 + 0.5f + (((i11 - i9) - this.LJ.LJI) * f4)));
                        this.LJIIIIZZ.LIZLLL(this.LJII.LJI + this.LJ.LJI);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        C2267081DoQ c2267081DoQ3 = this.LIZIZ;
        LJIIIIZZ(c2267081DoQ3.LJJIJIIJI, c2267081DoQ3.LJJIJIL, 1);
    }
}
