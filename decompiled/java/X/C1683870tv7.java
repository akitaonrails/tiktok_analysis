package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tv7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1683870tv7 implements InterfaceC1672820tdI {
    public final String LIZIZ;
    public final C05P0 LIZJ;

    public final C1683880tv8 LJ() {
        return (C1683880tv8) this.LIZJ.getValue();
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append("(left=");
        sbLIZ.append(LJ().LIZ);
        sbLIZ.append(", top=");
        sbLIZ.append(LJ().LIZIZ);
        sbLIZ.append(", right=");
        sbLIZ.append(LJ().LIZJ);
        sbLIZ.append(", bottom=");
        sbLIZ.append(LJ().LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1672820tdI
    public final int LIZ(InterfaceC1690500u5o interfaceC1690500u5o) {
        return LJ().LIZIZ;
    }

    @Override // X.InterfaceC1672820tdI
    public final int LIZLLL(InterfaceC1690500u5o interfaceC1690500u5o) {
        return LJ().LIZLLL;
    }

    public final void LJFF(C1683880tv8 c1683880tv8) {
        ((C13FE) this.LIZJ).setValue(c1683880tv8);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1683870tv7)) {
            return false;
        }
        return Intrinsics.LJFF(LJ(), ((C1683870tv7) obj).LJ());
    }

    public C1683870tv7(C1683880tv8 c1683880tv8, String str) {
        this.LIZIZ = str;
        this.LIZJ = C20028913Yh.LJI(c1683880tv8);
    }

    @Override // X.InterfaceC1672820tdI
    public final int LIZIZ(InterfaceC1690500u5o interfaceC1690500u5o, EnumC1671200tag enumC1671200tag) {
        return LJ().LIZJ;
    }

    @Override // X.InterfaceC1672820tdI
    public final int LIZJ(InterfaceC1690500u5o interfaceC1690500u5o, EnumC1671200tag enumC1671200tag) {
        return LJ().LIZ;
    }
}
