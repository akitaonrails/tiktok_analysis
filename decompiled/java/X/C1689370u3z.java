package X;

import androidx.compose.foundation.ScrollingLayoutElement;

/* JADX INFO: renamed from: X.0u3z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1689370u3z {
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C1689390u41 LIZIZ(X.InterfaceC1680500tpg r5) {
        /*
            r4 = 0
            java.lang.Object[] r3 = new java.lang.Object[r4]
            X.0u0K r2 = X.C1689390u41.LJIIIIZZ
            boolean r0 = r5.LJIJI(r4)
            if (r0 != 0) goto L2d
            r0 = 0
        Lc:
            java.lang.Object r1 = r5.LJJ()
            if (r0 != 0) goto L1b
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r1 != r0) goto L23
        L1b:
            X.0u40 r1 = new X.0u40
            r1.<init>(r4)
            r5.LJJIJIIJI(r1)
        L23:
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            r0 = 4
            java.lang.Object r0 = X.C20041813bM.LIZ(r3, r2, r1, r5, r0)
            X.0u41 r0 = (X.C1689390u41) r0
            return r0
        L2d:
            r0 = 1
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1689370u3z.LIZIZ(X.0tpg):X.0u41");
    }

    public static InterfaceC1685750ty9 LIZ(InterfaceC1685750ty9 interfaceC1685750ty9, C1689390u41 c1689390u41) {
        return LIZJ(interfaceC1685750ty9, c1689390u41, false, null, true, false);
    }

    public static InterfaceC1685750ty9 LIZLLL(InterfaceC1685750ty9 interfaceC1685750ty9, C1689390u41 c1689390u41, boolean z, int i) {
        boolean z2 = z;
        if ((i & 2) != 0) {
            z2 = true;
        }
        return LIZJ(interfaceC1685750ty9, c1689390u41, false, null, z2, true);
    }

    public static InterfaceC1685750ty9 LIZJ(InterfaceC1685750ty9 interfaceC1685750ty9, C1689390u41 c1689390u41, boolean z, InterfaceC633750OtR interfaceC633750OtR, boolean z2, boolean z3) {
        EnumC1684030tvN enumC1684030tvN;
        if (z3) {
            enumC1684030tvN = EnumC1684030tvN.Vertical;
        } else {
            enumC1684030tvN = EnumC1684030tvN.Horizontal;
        }
        return C1689860u4m.LIZ(interfaceC1685750ty9, c1689390u41, enumC1684030tvN, z2, z, interfaceC633750OtR, c1689390u41.LIZJ, true, null, null).LIZ(new ScrollingLayoutElement(c1689390u41, z, z3));
    }
}
