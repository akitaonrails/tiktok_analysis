package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tdL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1672850tdL implements InterfaceC1672820tdI {
    public final InterfaceC1672820tdI LIZIZ;
    public final InterfaceC1672820tdI LIZJ;

    public final int hashCode() {
        return (this.LIZIZ.hashCode() * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('(');
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(" - ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1672820tdI
    public final int LIZ(InterfaceC1690500u5o interfaceC1690500u5o) {
        int iLIZ = this.LIZIZ.LIZ(interfaceC1690500u5o) - this.LIZJ.LIZ(interfaceC1690500u5o);
        if (iLIZ < 0) {
            return 0;
        }
        return iLIZ;
    }

    @Override // X.InterfaceC1672820tdI
    public final int LIZLLL(InterfaceC1690500u5o interfaceC1690500u5o) {
        int iLIZLLL = this.LIZIZ.LIZLLL(interfaceC1690500u5o) - this.LIZJ.LIZLLL(interfaceC1690500u5o);
        if (iLIZLLL < 0) {
            return 0;
        }
        return iLIZLLL;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1672850tdL)) {
            return false;
        }
        C1672850tdL c1672850tdL = (C1672850tdL) obj;
        if (Intrinsics.LJFF(c1672850tdL.LIZIZ, this.LIZIZ) && Intrinsics.LJFF(c1672850tdL.LIZJ, this.LIZJ)) {
            return true;
        }
        return false;
    }

    public C1672850tdL(InterfaceC1672820tdI interfaceC1672820tdI, InterfaceC1672820tdI interfaceC1672820tdI2) {
        this.LIZIZ = interfaceC1672820tdI;
        this.LIZJ = interfaceC1672820tdI2;
    }

    @Override // X.InterfaceC1672820tdI
    public final int LIZIZ(InterfaceC1690500u5o interfaceC1690500u5o, EnumC1671200tag enumC1671200tag) {
        int iLIZIZ = this.LIZIZ.LIZIZ(interfaceC1690500u5o, enumC1671200tag) - this.LIZJ.LIZIZ(interfaceC1690500u5o, enumC1671200tag);
        if (iLIZIZ < 0) {
            return 0;
        }
        return iLIZIZ;
    }

    @Override // X.InterfaceC1672820tdI
    public final int LIZJ(InterfaceC1690500u5o interfaceC1690500u5o, EnumC1671200tag enumC1671200tag) {
        int iLIZJ = this.LIZIZ.LIZJ(interfaceC1690500u5o, enumC1671200tag) - this.LIZJ.LIZJ(interfaceC1690500u5o, enumC1671200tag);
        if (iLIZJ < 0) {
            return 0;
        }
        return iLIZJ;
    }
}
