package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tXN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1669150tXN implements InterfaceC1680710tq1 {
    public final InterfaceC1160240gIY LIZ;
    public final InterfaceC1160240gIY LIZIZ;
    public final InterfaceC1160240gIY LIZJ;
    public final InterfaceC1160240gIY LIZLLL;

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SmoothRoundedCornerShape(topStart = ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", topEnd = ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", bottomEnd = ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", bottomStart = ");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1669150tXN)) {
            return false;
        }
        C1669150tXN c1669150tXN = (C1669150tXN) obj;
        if (Intrinsics.LJFF(this.LIZ, c1669150tXN.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1669150tXN.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1669150tXN.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1669150tXN.LIZLLL)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1680710tq1
    public final AbstractC1680810tqB LIZ(long j, EnumC1671200tag enumC1671200tag, InterfaceC1690500u5o interfaceC1690500u5o) {
        InterfaceC1160240gIY interfaceC1160240gIY;
        InterfaceC1160240gIY interfaceC1160240gIY2;
        InterfaceC1160240gIY interfaceC1160240gIY3;
        InterfaceC1160240gIY interfaceC1160240gIY4;
        boolean z;
        float f;
        EnumC1671200tag enumC1671200tag2 = EnumC1671200tag.Ltr;
        if (enumC1671200tag == enumC1671200tag2) {
            interfaceC1160240gIY = this.LIZ;
        } else {
            interfaceC1160240gIY = this.LIZIZ;
        }
        float fLIZ = interfaceC1160240gIY.LIZ(j, interfaceC1690500u5o);
        if (enumC1671200tag == enumC1671200tag2) {
            interfaceC1160240gIY2 = this.LIZIZ;
        } else {
            interfaceC1160240gIY2 = this.LIZ;
        }
        float fLIZ2 = interfaceC1160240gIY2.LIZ(j, interfaceC1690500u5o);
        if (enumC1671200tag == enumC1671200tag2) {
            interfaceC1160240gIY3 = this.LIZJ;
        } else {
            interfaceC1160240gIY3 = this.LIZLLL;
        }
        float fLIZ3 = interfaceC1160240gIY3.LIZ(j, interfaceC1690500u5o);
        if (enumC1671200tag == enumC1671200tag2) {
            interfaceC1160240gIY4 = this.LIZLLL;
        } else {
            interfaceC1160240gIY4 = this.LIZJ;
        }
        float fLIZ4 = interfaceC1160240gIY4.LIZ(j, interfaceC1690500u5o);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        C1695950uEb c1695950uEbLIZ = C1695940uEa.LIZ();
        float f2 = fLIZ * 1.6f;
        float f3 = 0.0f;
        c1695950uEbLIZ.LIZJ(0.0f, f2);
        if (fLIZ == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            float f4 = fLIZ * 1.03995f;
            float f5 = fLIZ * 0.759921f;
            float f6 = fLIZ * 0.108993f;
            float f7 = fLIZ * 0.546009f;
            c1695950uEbLIZ.LJI(0.0f, f4, 0.0f, f5, f6, f7);
            float f8 = fLIZ * 0.204867f;
            float f9 = fLIZ * 0.357847f;
            c1695950uEbLIZ.LJI(f8, f9, f9, f8, f7, f6);
            f3 = 0.0f;
            c1695950uEbLIZ.LJI(f5, 0.0f, f4, 0.0f, f2, 0.0f);
        }
        float f10 = fLIZ2 * 1.6f;
        c1695950uEbLIZ.LJIIL(fIntBitsToFloat - f10, f3);
        if (fLIZ2 == f3) {
            f = 0.0f;
        } else {
            float f11 = fLIZ2 * 1.03995f;
            float f12 = fLIZ2 * 0.759921f;
            float f13 = fLIZ2 * 0.546009f;
            float f14 = fLIZ2 * 0.108993f;
            f = 0.0f;
            c1695950uEbLIZ.LJI(fIntBitsToFloat - f11, f3, fIntBitsToFloat - f12, f3, fIntBitsToFloat - f13, f14);
            float f15 = fLIZ2 * 0.357847f;
            float f16 = fLIZ2 * 0.204867f;
            c1695950uEbLIZ.LJI(fIntBitsToFloat - f15, f16, fIntBitsToFloat - f16, f15, fIntBitsToFloat - f14, f13);
            c1695950uEbLIZ.LJI(fIntBitsToFloat, f12, fIntBitsToFloat, f11, fIntBitsToFloat, f10);
        }
        float f18 = fLIZ3 * 1.6f;
        c1695950uEbLIZ.LJIIL(fIntBitsToFloat, fIntBitsToFloat2 - f18);
        if (fLIZ3 != f) {
            float f19 = fLIZ3 * 1.03995f;
            float f20 = fLIZ3 * 0.759921f;
            float f21 = fLIZ3 * 0.108993f;
            float f22 = fLIZ3 * 0.546009f;
            c1695950uEbLIZ.LJI(fIntBitsToFloat, fIntBitsToFloat2 - f19, fIntBitsToFloat, fIntBitsToFloat2 - f20, fIntBitsToFloat - f21, fIntBitsToFloat2 - f22);
            float f23 = fLIZ3 * 0.204867f;
            float f24 = fLIZ3 * 0.357847f;
            c1695950uEbLIZ.LJI(fIntBitsToFloat - f23, fIntBitsToFloat2 - f24, fIntBitsToFloat - f24, fIntBitsToFloat2 - f23, fIntBitsToFloat - f22, fIntBitsToFloat2 - f21);
            c1695950uEbLIZ.LJI(fIntBitsToFloat - f20, fIntBitsToFloat2, fIntBitsToFloat - f19, fIntBitsToFloat2, fIntBitsToFloat - f18, fIntBitsToFloat2);
        }
        float f25 = 1.6f * fLIZ4;
        c1695950uEbLIZ.LJIIL(f25, fIntBitsToFloat2);
        if (fLIZ4 != f) {
            float f26 = 1.03995f * fLIZ4;
            float f27 = 0.759921f * fLIZ4;
            float f28 = 0.546009f * fLIZ4;
            float f29 = fLIZ4 * 0.108993f;
            c1695950uEbLIZ.LJI(f26, fIntBitsToFloat2, f27, fIntBitsToFloat2, f28, fIntBitsToFloat2 - f29);
            float f30 = fLIZ4 * 0.357847f;
            float f31 = fLIZ4 * 0.204867f;
            c1695950uEbLIZ.LJI(f30, fIntBitsToFloat2 - f31, f31, fIntBitsToFloat2 - f30, f29, fIntBitsToFloat2 - f28);
            c1695950uEbLIZ = c1695950uEbLIZ;
            c1695950uEbLIZ.LJI(f, fIntBitsToFloat2 - f27, f, fIntBitsToFloat2 - f26, f, fIntBitsToFloat2 - f25);
        }
        c1695950uEbLIZ.close();
        return new C1680800tqA(c1695950uEbLIZ);
    }

    public C1669150tXN(C1669040tXC c1669040tXC, C1669040tXC c1669040tXC2, C1669040tXC c1669040tXC3, C1669040tXC c1669040tXC4) {
        this.LIZ = c1669040tXC;
        this.LIZIZ = c1669040tXC2;
        this.LIZJ = c1669040tXC3;
        this.LIZLLL = c1669040tXC4;
    }
}
