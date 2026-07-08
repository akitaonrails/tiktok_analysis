package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.19OE, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19OE extends C19OF {
    public final C19OL LJIIJ;
    public C21531019Oa LJIIJJI;

    @Override // X.C19OF
    public final void LJFF() {
        this.LIZJ = null;
        this.LJII.LIZJ();
        this.LJIIIIZZ.LIZJ();
        this.LJIIJ.LIZJ();
        this.LJ.LIZJ();
        this.LJI = false;
    }

    public final void LJIIL() {
        this.LJI = false;
        this.LJII.LIZJ();
        this.LJII.LJIIIZ = false;
        this.LJIIIIZZ.LIZJ();
        this.LJIIIIZZ.LJIIIZ = false;
        this.LJIIJ.LIZJ();
        this.LJIIJ.LJIIIZ = false;
        this.LJ.LJIIIZ = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v216, types: [X.19Oa] */
    @Override // X.C19OF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL() {
        /*
            Method dump skipped, instruction units count: 1085
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19OE.LIZLLL():void");
    }

    @Override // X.C19OF
    public final void LJ() {
        C19OL c19ol = this.LJII;
        if (c19ol.LJIIIZ) {
            this.LIZIZ.mY = c19ol.LJI;
        }
    }

    @Override // X.C19OF
    public final boolean LJIIJ() {
        return this.LIZLLL != C19O3.MATCH_CONSTRAINT || this.LIZIZ.mMatchConstraintDefaultHeight == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VerticalRun ");
        sbLIZ.append(this.LIZIZ.mDebugName);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C19OE(C19OA c19oa) {
        super(c19oa);
        C19OL c19ol = new C19OL(this);
        this.LJIIJ = c19ol;
        this.LJIIJJI = null;
        this.LJII.LJ = C19OW.TOP;
        this.LJIIIIZZ.LJ = C19OW.BOTTOM;
        c19ol.LJ = C19OW.BASELINE;
        this.LJFF = 1;
    }

    @Override // X.C19OF, X.InterfaceC21531119Ob
    public final void LIZ(InterfaceC21531119Ob interfaceC21531119Ob) {
        float f;
        float f2;
        float f3;
        int i;
        if (this.LJIIIZ.ordinal() != 3) {
            C19OX c19ox = this.LJ;
            if (c19ox.LIZJ && !c19ox.LJIIIZ && this.LIZLLL == C19O3.MATCH_CONSTRAINT) {
                C19OA c19oa = this.LIZIZ;
                int i2 = c19oa.mMatchConstraintDefaultHeight;
                if (i2 != 2) {
                    if (i2 == 3) {
                        C19OX c19ox2 = c19oa.horizontalRun.LJ;
                        if (c19ox2.LJIIIZ) {
                            int i3 = c19oa.mDimensionRatioSide;
                            if (i3 != -1) {
                                if (i3 != 0) {
                                    if (i3 != 1) {
                                        i = 0;
                                        c19ox.LIZLLL(i);
                                    } else {
                                        f = c19ox2.LJI;
                                        f2 = c19oa.mDimensionRatio;
                                    }
                                } else {
                                    f3 = c19ox2.LJI * c19oa.mDimensionRatio;
                                    i = (int) (f3 + 0.5f);
                                    c19ox.LIZLLL(i);
                                }
                            } else {
                                f = c19ox2.LJI;
                                f2 = c19oa.mDimensionRatio;
                            }
                            f3 = f / f2;
                            i = (int) (f3 + 0.5f);
                            c19ox.LIZLLL(i);
                        }
                    }
                } else {
                    C19OA c19oa2 = c19oa.mParent;
                    if (c19oa2 != null) {
                        if (c19oa2.verticalRun.LJ.LJIIIZ) {
                            c19ox.LIZLLL((int) ((r2.LJI * c19oa.mMatchConstraintPercentHeight) + 0.5f));
                        }
                    }
                }
            }
            C19OL c19ol = this.LJII;
            if (c19ol.LIZJ) {
                C19OL c19ol2 = this.LJIIIIZZ;
                if (c19ol2.LIZJ) {
                    if (c19ol.LJIIIZ && c19ol2.LJIIIZ && this.LJ.LJIIIZ) {
                        return;
                    }
                    if (!this.LJ.LJIIIZ && this.LIZLLL == C19O3.MATCH_CONSTRAINT) {
                        C19OA c19oa3 = this.LIZIZ;
                        if (c19oa3.mMatchConstraintDefaultWidth == 0 && !c19oa3.isInVerticalChain()) {
                            C19OL c19ol3 = (C19OL) ListProtector.get(this.LJII.LJIIJJI, 0);
                            C19OL c19ol4 = (C19OL) ListProtector.get(this.LJIIIIZZ.LJIIJJI, 0);
                            int i4 = c19ol3.LJI;
                            C19OL c19ol5 = this.LJII;
                            int i5 = i4 + c19ol5.LJFF;
                            int i6 = c19ol4.LJI + this.LJIIIIZZ.LJFF;
                            c19ol5.LIZLLL(i5);
                            this.LJIIIIZZ.LIZLLL(i6);
                            this.LJ.LIZLLL(i6 - i5);
                            return;
                        }
                    }
                    if (!this.LJ.LJIIIZ && this.LIZLLL == C19O3.MATCH_CONSTRAINT && this.LIZ == 1 && ((ArrayList) this.LJII.LJIIJJI).size() > 0 && ((ArrayList) this.LJIIIIZZ.LJIIJJI).size() > 0) {
                        C19OL c19ol6 = (C19OL) ListProtector.get(this.LJII.LJIIJJI, 0);
                        int i7 = (((C19OL) ListProtector.get(this.LJIIIIZZ.LJIIJJI, 0)).LJI + this.LJIIIIZZ.LJFF) - (c19ol6.LJI + this.LJII.LJFF);
                        C19OX c19ox3 = this.LJ;
                        int i8 = c19ox3.LJIIL;
                        if (i7 < i8) {
                            c19ox3.LIZLLL(i7);
                        } else {
                            c19ox3.LIZLLL(i8);
                        }
                    }
                    if (this.LJ.LJIIIZ && ((ArrayList) this.LJII.LJIIJJI).size() > 0 && ((ArrayList) this.LJIIIIZZ.LJIIJJI).size() > 0) {
                        C19OL c19ol7 = (C19OL) ListProtector.get(this.LJII.LJIIJJI, 0);
                        C19OL c19ol8 = (C19OL) ListProtector.get(this.LJIIIIZZ.LJIIJJI, 0);
                        int i9 = c19ol7.LJI;
                        C19OL c19ol9 = this.LJII;
                        int i10 = c19ol9.LJFF + i9;
                        int i11 = c19ol8.LJI;
                        int i12 = this.LJIIIIZZ.LJFF + i11;
                        float f4 = this.LIZIZ.mVerticalBiasPercent;
                        if (c19ol7 == c19ol8) {
                            f4 = 0.5f;
                        } else {
                            i9 = i10;
                            i11 = i12;
                        }
                        c19ol9.LIZLLL((int) (i9 + 0.5f + (((i11 - i9) - this.LJ.LJI) * f4)));
                        this.LJIIIIZZ.LIZLLL(this.LJII.LJI + this.LJ.LJI);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        C19OA c19oa4 = this.LIZIZ;
        LJIIJJI(c19oa4.mTop, c19oa4.mBottom, 1);
    }
}
