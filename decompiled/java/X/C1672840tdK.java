package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tdK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1672840tdK implements InterfaceC1672820tdI {
    public final InterfaceC1672820tdI LIZIZ;
    public final InterfaceC1672820tdI LIZJ;

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (this.LIZJ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('(');
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(" ∪ ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1672820tdI
    public final int LIZ(InterfaceC1690500u5o interfaceC1690500u5o) {
        return Math.max(this.LIZIZ.LIZ(interfaceC1690500u5o), this.LIZJ.LIZ(interfaceC1690500u5o));
    }

    @Override // X.InterfaceC1672820tdI
    public final int LIZLLL(InterfaceC1690500u5o interfaceC1690500u5o) {
        return Math.max(this.LIZIZ.LIZLLL(interfaceC1690500u5o), this.LIZJ.LIZLLL(interfaceC1690500u5o));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1672840tdK)) {
            return false;
        }
        C1672840tdK c1672840tdK = (C1672840tdK) obj;
        if (Intrinsics.LJFF(c1672840tdK.LIZIZ, this.LIZIZ) && Intrinsics.LJFF(c1672840tdK.LIZJ, this.LIZJ)) {
            return true;
        }
        return false;
    }

    public C1672840tdK(InterfaceC1672820tdI interfaceC1672820tdI, InterfaceC1672820tdI interfaceC1672820tdI2) {
        this.LIZIZ = interfaceC1672820tdI;
        this.LIZJ = interfaceC1672820tdI2;
    }

    @Override // X.InterfaceC1672820tdI
    public final int LIZIZ(InterfaceC1690500u5o interfaceC1690500u5o, EnumC1671200tag enumC1671200tag) {
        return Math.max(this.LIZIZ.LIZIZ(interfaceC1690500u5o, enumC1671200tag), this.LIZJ.LIZIZ(interfaceC1690500u5o, enumC1671200tag));
    }

    @Override // X.InterfaceC1672820tdI
    public final int LIZJ(InterfaceC1690500u5o interfaceC1690500u5o, EnumC1671200tag enumC1671200tag) {
        return Math.max(this.LIZIZ.LIZJ(interfaceC1690500u5o, enumC1671200tag), this.LIZJ.LIZJ(interfaceC1690500u5o, enumC1671200tag));
    }
}
