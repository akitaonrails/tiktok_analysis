package X;

import kotlin.jvm.internal.Intrinsics;
import p2.x;

/* JADX INFO: renamed from: X.13fL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20066513fL {
    public final InterfaceC1692950u9l LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public final C13B1<AbstractC20055413dY> LJFF = new C13B1<>((Object) null);
    public final C20067213fS LJI = new C20067213fS();
    public final C13L7<C13B1<C20066613fM>> LJII = new C13L7<>(10);

    public final void LIZJ() {
        if (this.LIZIZ) {
            this.LIZJ = true;
            return;
        }
        C19968013Aw<C20066613fM> c19968013Aw = this.LJI.LIZ;
        C20066613fM[] c20066613fMArr = c19968013Aw.LL;
        int i = c19968013Aw.LLILLL;
        for (int i2 = 0; i2 < i; i2++) {
            c20066613fMArr[i2].LIZJ();
        }
        if (this.LIZLLL) {
            this.LIZLLL = true;
        } else {
            this.LJI.LIZ.LJIIIZ();
        }
    }

    public C20066513fL(x xVar) {
        this.LIZ = xVar;
    }

    public final void LIZLLL(AbstractC20055413dY abstractC20055413dY) {
        if (this.LIZIZ) {
            this.LJ = true;
            this.LJFF.LJI(abstractC20055413dY);
            return;
        }
        C20067213fS c20067213fS = this.LJI;
        c20067213fS.LIZIZ.LJIIIIZZ();
        c20067213fS.LIZIZ.LJI(c20067213fS);
        while (true) {
            C13B1<C20067213fS> c13b1 = c20067213fS.LIZIZ;
            int i = c13b1.LIZIZ;
            int i2 = 0;
            if (i != 0) {
                C20067213fS c20067213fSLJIIJ = c13b1.LJIIJ(i - 1);
                while (true) {
                    C19968013Aw<C20066613fM> c19968013Aw = c20067213fSLJIIJ.LIZ;
                    if (i2 < c19968013Aw.LLILLL) {
                        C20066613fM c20066613fM = c19968013Aw.LL[i2];
                        if (Intrinsics.LJFF(c20066613fM.LIZJ, abstractC20055413dY)) {
                            c20067213fSLJIIJ.LIZ.LJIIL(c20066613fM);
                            c20066613fM.LIZJ();
                        } else {
                            c20067213fS.LIZIZ.LJI(c20066613fM);
                            i2++;
                        }
                    }
                }
            } else {
                return;
            }
        }
    }

    public final boolean LIZIZ(C20067413fU c20067413fU, boolean z) {
        if (!this.LJI.LIZ(c20067413fU.LIZ, this.LIZ, c20067413fU, z)) {
            return false;
        }
        boolean z2 = true;
        this.LIZIZ = true;
        C19968013Aw<C20066613fM> c19968013Aw = this.LJI.LIZ;
        C20066613fM[] c20066613fMArr = c19968013Aw.LL;
        int i = c19968013Aw.LLILLL;
        boolean z3 = false;
        for (int i2 = 0; i2 < i; i2++) {
            if (!c20066613fMArr[i2].LJ(c20067413fU, z) && !z3) {
                z3 = false;
            } else {
                z3 = true;
            }
        }
        C20067213fS c20067213fS = this.LJI;
        C19968013Aw<C20066613fM> c19968013Aw2 = c20067213fS.LIZ;
        C20066613fM[] c20066613fMArr2 = c19968013Aw2.LL;
        int i3 = c19968013Aw2.LLILLL;
        boolean z4 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            if (!c20066613fMArr2[i4].LIZLLL(c20067413fU) && !z4) {
                z4 = false;
            } else {
                z4 = true;
            }
        }
        c20067213fS.LIZIZ(c20067413fU);
        if (!z4 && !z3) {
            z2 = false;
        }
        this.LIZIZ = false;
        if (this.LJ) {
            this.LJ = false;
            int i5 = this.LJFF.LIZIZ;
            for (int i6 = 0; i6 < i5; i6++) {
                LIZLLL(this.LJFF.LIZIZ(i6));
            }
            this.LJFF.LJIIIIZZ();
        }
        if (this.LIZJ) {
            this.LIZJ = false;
            LIZJ();
        }
        if (this.LIZLLL) {
            this.LIZLLL = false;
            this.LJI.LIZ.LJIIIZ();
        }
        return z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(long r18, X.C13B8 r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20066513fL.LIZ(long, X.13B8, boolean):void");
    }
}
