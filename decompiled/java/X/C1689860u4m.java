package X;

import androidx.compose.foundation.ScrollingContainerElement;

/* JADX INFO: renamed from: X.0u4m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1689860u4m {
    public static final InterfaceC1685750ty9 LIZ(InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1420105h9 interfaceC1420105h9, EnumC1684030tvN enumC1684030tvN, boolean z, boolean z2, InterfaceC633750OtR interfaceC633750OtR, C612270Nzt c612270Nzt, boolean z3, InterfaceC1681290tqx interfaceC1681290tqx, InterfaceC20063613es interfaceC20063613es) {
        InterfaceC1685750ty9 interfaceC1685750ty9LIZ;
        if (enumC1684030tvN == EnumC1684030tvN.Vertical) {
            interfaceC1685750ty9LIZ = C1667200tUE.LIZ(InterfaceC1685750ty9.LIZ, new InterfaceC1680710tq1() { // from class: X.0u4n
                @Override // X.InterfaceC1680710tq1
                public final AbstractC1680810tqB LIZ(long j, EnumC1671200tag enumC1671200tag, InterfaceC1690500u5o interfaceC1690500u5o) {
                    float fLJLLJ = interfaceC1690500u5o.LJLLJ(C1689890u4p.LIZ);
                    return new C1680780tq8(new C1683130ttv(-fLJLLJ, 0.0f, Float.intBitsToFloat((int) (j >> 32)) + fLJLLJ, Float.intBitsToFloat((int) (j & 4294967295L))));
                }
            });
        } else {
            interfaceC1685750ty9LIZ = C1667200tUE.LIZ(InterfaceC1685750ty9.LIZ, new InterfaceC1680710tq1() { // from class: X.0u4o
                @Override // X.InterfaceC1680710tq1
                public final AbstractC1680810tqB LIZ(long j, EnumC1671200tag enumC1671200tag, InterfaceC1690500u5o interfaceC1690500u5o) {
                    float fLJLLJ = interfaceC1690500u5o.LJLLJ(C1689890u4p.LIZ);
                    return new C1680780tq8(new C1683130ttv(0.0f, -fLJLLJ, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)) + fLJLLJ));
                }
            });
        }
        return interfaceC1685750ty9.LIZ(interfaceC1685750ty9LIZ).LIZ(new ScrollingContainerElement(interfaceC1681290tqx, interfaceC20063613es, interfaceC633750OtR, enumC1684030tvN, interfaceC1420105h9, c612270Nzt, z, z2, z3));
    }
}
