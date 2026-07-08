package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tdG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1672800tdG implements InterfaceC1679150tnV {
    public final InterfaceC1672820tdI LIZ;
    public final InterfaceC1690500u5o LIZIZ;

    @Override // X.InterfaceC1679150tnV
    public final float LIZIZ() {
        InterfaceC1690500u5o interfaceC1690500u5o = this.LIZIZ;
        return interfaceC1690500u5o.LJJI(this.LIZ.LIZLLL(interfaceC1690500u5o));
    }

    @Override // X.InterfaceC1679150tnV
    public final float LIZLLL() {
        InterfaceC1690500u5o interfaceC1690500u5o = this.LIZIZ;
        return interfaceC1690500u5o.LJJI(this.LIZ.LIZ(interfaceC1690500u5o));
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InsetsPaddingValues(insets=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", density=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1679150tnV
    public final float LIZ(EnumC1671200tag enumC1671200tag) {
        InterfaceC1690500u5o interfaceC1690500u5o = this.LIZIZ;
        return interfaceC1690500u5o.LJJI(this.LIZ.LIZJ(interfaceC1690500u5o, enumC1671200tag));
    }

    @Override // X.InterfaceC1679150tnV
    public final float LIZJ(EnumC1671200tag enumC1671200tag) {
        InterfaceC1690500u5o interfaceC1690500u5o = this.LIZIZ;
        return interfaceC1690500u5o.LJJI(this.LIZ.LIZIZ(interfaceC1690500u5o, enumC1671200tag));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1672800tdG)) {
            return false;
        }
        C1672800tdG c1672800tdG = (C1672800tdG) obj;
        if (Intrinsics.LJFF(this.LIZ, c1672800tdG.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1672800tdG.LIZIZ)) {
            return true;
        }
        return false;
    }

    public C1672800tdG(C1683830tv3 c1683830tv3, InterfaceC1690500u5o interfaceC1690500u5o) {
        this.LIZ = c1683830tv3;
        this.LIZIZ = interfaceC1690500u5o;
    }
}
