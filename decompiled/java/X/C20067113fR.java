package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.13fR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20067113fR {
    public final C20066713fN<C20067713fX> LIZ = new C20066713fN<>((Object) null);

    public final C20067413fU LIZ(C20067813fY c20067813fY, InterfaceC20057813dw interfaceC20057813dw) {
        long j;
        boolean z;
        long jLJIIL;
        C20066713fN c20066713fN = new C20066713fN(c20067813fY.LIZ.size());
        List<C20066913fP> list = c20067813fY.LIZ;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C20066913fP c20066913fP = (C20066913fP) ListProtector.get(list, i);
            C20067713fX c20067713fXLJ = this.LIZ.LJ(c20066913fP.LIZ);
            if (c20067713fXLJ == null) {
                j = c20066913fP.LIZIZ;
                jLJIIL = c20066913fP.LIZLLL;
                z = false;
            } else {
                j = c20067713fXLJ.LIZ;
                z = c20067713fXLJ.LIZJ;
                jLJIIL = interfaceC20057813dw.LJIIL(c20067713fXLJ.LIZIZ);
            }
            long j2 = c20066913fP.LIZ;
            c20066713fN.LJIIIZ(j2, new C20066813fO(j2, c20066913fP.LIZIZ, c20066913fP.LIZLLL, c20066913fP.LJ, c20066913fP.LJFF, j, jLJIIL, z, c20066913fP.LJI, c20066913fP.LJIIIIZZ, c20066913fP.LJIIIZ, c20066913fP.LJIIJ));
            boolean z2 = c20066913fP.LJ;
            if (z2) {
                this.LIZ.LJIIIZ(c20066913fP.LIZ, new C20067713fX(c20066913fP.LIZIZ, c20066913fP.LIZJ, z2));
            } else {
                this.LIZ.LJIIJ(c20066913fP.LIZ);
            }
        }
        return new C20067413fU(c20066713fN, c20067813fY);
    }
}
