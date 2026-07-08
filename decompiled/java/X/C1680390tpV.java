package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tpV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1680390tpV {
    public InterfaceC1690500u5o LIZ;
    public EnumC1671200tag LIZIZ;
    public InterfaceC1686290tz1 LIZJ;
    public long LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1680390tpV)) {
            return false;
        }
        C1680390tpV c1680390tpV = (C1680390tpV) obj;
        return Intrinsics.LJFF(this.LIZ, c1680390tpV.LIZ) && this.LIZIZ == c1680390tpV.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1680390tpV.LIZJ) && C1680770tq7.LIZ(this.LIZLLL, c1680390tpV.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DrawParams(density=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", layoutDirection=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", canvas=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", size=");
        sbLIZ.append((Object) C1680770tq7.LJFF(this.LIZLLL));
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1680390tpV() {
        C1516420pZ2 c1516420pZ2 = C1680440tpa.LIZ;
        EnumC1671200tag enumC1671200tag = EnumC1671200tag.Ltr;
        C1676500tjE c1676500tjE = new InterfaceC1686290tz1() { // from class: X.0tjE
            @Override // X.InterfaceC1686290tz1
            public final void LIZ() {
                throw new UnsupportedOperationException();
            }

            @Override // X.InterfaceC1686290tz1
            public final void LJIIJ() {
                throw new UnsupportedOperationException();
            }

            @Override // X.InterfaceC1686290tz1
            public final void LJIILLIIL() {
                throw new UnsupportedOperationException();
            }

            @Override // X.InterfaceC1686290tz1
            public final void save() {
                throw new UnsupportedOperationException();
            }

            @Override // X.InterfaceC1686290tz1
            public final void LJ(float[] fArr) {
                throw new UnsupportedOperationException();
            }

            @Override // X.InterfaceC1686290tz1
            public final void jv(float f) {
                throw new UnsupportedOperationException();
            }

            @Override // X.InterfaceC1686290tz1
            public final void LIZJ(float f, float f2) {
                throw new UnsupportedOperationException();
            }

            @Override // X.InterfaceC1686290tz1
            public final void LIZLLL(C1683130ttv c1683130ttv, InterfaceC1695240uDS interfaceC1695240uDS) {
                throw new UnsupportedOperationException();
            }

            @Override // X.InterfaceC1686290tz1
            public final void LJII(InterfaceC1680960tqQ interfaceC1680960tqQ, InterfaceC1695240uDS interfaceC1695240uDS) {
                throw new UnsupportedOperationException();
            }

            @Override // X.InterfaceC1686290tz1
            public final void LJIILIIL(InterfaceC1680960tqQ interfaceC1680960tqQ, int i) {
                throw new UnsupportedOperationException();
            }

            @Override // X.InterfaceC1686290tz1
            public final void LJIILJJIL(float f, float f2) {
                throw new UnsupportedOperationException();
            }

            @Override // X.InterfaceC1686290tz1
            public final void LJIILL(int i, C1683130ttv c1683130ttv) {
                LJIIIZ(c1683130ttv.LIZ, c1683130ttv.LIZIZ, c1683130ttv.LIZJ, c1683130ttv.LIZLLL, i);
                throw null;
            }

            @Override // X.InterfaceC1686290tz1
            public final void LIZIZ(float f, long j, InterfaceC1695240uDS interfaceC1695240uDS) {
                throw new UnsupportedOperationException();
            }

            @Override // X.InterfaceC1686290tz1
            public final void LJFF(InterfaceC1680820tqC interfaceC1680820tqC, long j, InterfaceC1695240uDS interfaceC1695240uDS) {
                throw new UnsupportedOperationException();
            }

            @Override // X.InterfaceC1686290tz1
            public final void LJIIJJI(long j, long j2, InterfaceC1695240uDS interfaceC1695240uDS) {
                throw new UnsupportedOperationException();
            }

            @Override // X.InterfaceC1686290tz1
            public final void LJIIIIZZ(float f, float f2, float f3, float f4, InterfaceC1695240uDS interfaceC1695240uDS) {
                throw new UnsupportedOperationException();
            }

            @Override // X.InterfaceC1686290tz1
            public final void LJIIIZ(float f, float f2, float f3, float f4, int i) {
                throw new UnsupportedOperationException();
            }

            @Override // X.InterfaceC1686290tz1
            public final void LJI(InterfaceC1680820tqC interfaceC1680820tqC, long j, long j2, long j3, long j4, InterfaceC1695240uDS interfaceC1695240uDS) {
                throw new UnsupportedOperationException();
            }

            @Override // X.InterfaceC1686290tz1
            public final void LJIIZILJ(float f, float f2, float f3, float f4, float f5, float f6, InterfaceC1695240uDS interfaceC1695240uDS) {
                throw new UnsupportedOperationException();
            }

            @Override // X.InterfaceC1686290tz1
            public final void LJIIL(float f, float f2, float f3, float f4, float f5, float f6, boolean z, InterfaceC1695240uDS interfaceC1695240uDS) {
                throw new UnsupportedOperationException();
            }
        };
        this.LIZ = c1516420pZ2;
        this.LIZIZ = enumC1671200tag;
        this.LIZJ = c1676500tjE;
        this.LIZLLL = 0L;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZLLL);
    }
}
