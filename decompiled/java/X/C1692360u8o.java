package X;

import kotlin.jvm.internal.AwS163S0101000_25;

/* JADX INFO: renamed from: X.0u8o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1692360u8o {
    public static final C1692450u8x LIZ(C1692350u8n c1692350u8n, InterfaceC1692690u9L interfaceC1692690u9L) {
        boolean z;
        if (c1692350u8n.LIZIZ() == EnumC1692390u8r.CROSSED) {
            z = true;
        } else {
            z = false;
        }
        return new C1692450u8x(LIZJ(c1692350u8n.LJ, z, true, c1692350u8n.LIZIZ, interfaceC1692690u9L), LIZJ(c1692350u8n.LJ, z, false, c1692350u8n.LIZJ, interfaceC1692690u9L), z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007f, code lost:
    
        if (r2.element == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
    
        if (r2.LIZ == r8.LIZ) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C1692450u8x LJ(X.C1692450u8x r9, X.C1692350u8n r10) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1692360u8o.LJ(X.0u8x, X.0u8n):X.0u8x");
    }

    public static final C1692580u9A LIZIZ(C1692350u8n c1692350u8n, C1692300u8i c1692300u8i, C1692580u9A c1692580u9A) {
        int i;
        int i2;
        int i3;
        EnumC1692390u8r enumC1692390u8r;
        boolean z;
        if (c1692350u8n.LIZ) {
            i = c1692300u8i.LIZJ;
            i2 = c1692350u8n.LIZIZ;
        } else {
            i = c1692300u8i.LIZLLL;
            i2 = c1692350u8n.LIZJ;
        }
        if (i2 != c1692300u8i.LIZIZ) {
            return c1692300u8i.LIZ(i);
        }
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        C01GW c01gwLIZ = C452501pT.LIZ(enumC452301pR, new AwS163S0101000_25(c1692300u8i, i, 0));
        if (c1692350u8n.LIZ) {
            i3 = c1692300u8i.LIZLLL;
        } else {
            i3 = c1692300u8i.LIZJ;
        }
        C01GW c01gwLIZ2 = C452501pT.LIZ(enumC452301pR, new C1692370u8p(c1692300u8i, i, i3, c1692350u8n, c01gwLIZ));
        if (c1692300u8i.LIZ != c1692580u9A.LIZIZ) {
            return (C1692580u9A) c01gwLIZ2.getValue();
        }
        int i4 = c1692300u8i.LJ;
        if (i == i4) {
            return c1692580u9A;
        }
        if (((Number) c01gwLIZ.getValue()).intValue() != c1692300u8i.LJFF.LJII(i4)) {
            return (C1692580u9A) c01gwLIZ2.getValue();
        }
        int i5 = c1692580u9A.LIZ;
        long jLJIILL = c1692300u8i.LJFF.LJIILL(i5);
        boolean z2 = c1692350u8n.LIZ;
        int i6 = c1692300u8i.LJ;
        if (i6 != -1) {
            if (i != i6) {
                int i7 = c1692300u8i.LIZJ;
                int i8 = c1692300u8i.LIZLLL;
                if (i7 < i8) {
                    enumC1692390u8r = EnumC1692390u8r.NOT_CROSSED;
                } else if (i7 > i8) {
                    enumC1692390u8r = EnumC1692390u8r.CROSSED;
                } else {
                    enumC1692390u8r = EnumC1692390u8r.COLLAPSED;
                }
                if (enumC1692390u8r == EnumC1692390u8r.CROSSED) {
                    z = true;
                } else {
                    z = false;
                }
                if (!(z2 ^ z)) {
                }
            }
            return c1692300u8i.LIZ(i);
        }
        int i9 = C1692280u8g.LIZJ;
        if (i5 != ((int) (jLJIILL >> 32)) && i5 != C1692280u8g.LIZLLL(jLJIILL)) {
            return c1692300u8i.LIZ(i);
        }
        return (C1692580u9A) c01gwLIZ2.getValue();
    }

    public static final C1692580u9A LIZLLL(C1692580u9A c1692580u9A, C1692300u8i c1692300u8i, int i) {
        return new C1692580u9A(c1692300u8i.LJFF.LIZ(i), i, c1692580u9A.LIZIZ);
    }

    public static final C1692580u9A LIZJ(C1692300u8i c1692300u8i, boolean z, boolean z2, int i, InterfaceC1692690u9L interfaceC1692690u9L) {
        int i2;
        int iLIZLLL;
        if (z2) {
            i2 = c1692300u8i.LIZJ;
        } else {
            i2 = c1692300u8i.LIZLLL;
        }
        if (i != c1692300u8i.LIZIZ) {
            return c1692300u8i.LIZ(i2);
        }
        long jLIZ = interfaceC1692690u9L.LIZ(c1692300u8i, i2);
        if (z ^ z2) {
            int i3 = C1692280u8g.LIZJ;
            iLIZLLL = (int) (jLIZ >> 32);
        } else {
            iLIZLLL = C1692280u8g.LIZLLL(jLIZ);
        }
        return c1692300u8i.LIZ(iLIZLLL);
    }
}
