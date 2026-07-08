package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tcr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1672550tcr implements InterfaceC1668850tWt, InterfaceC1665870tS5 {
    public final InterfaceC1690500u5o LIZ;
    public final long LIZIZ;
    public final /* synthetic */ C1672220tcK LIZJ = C1672220tcK.LIZ;

    @Override // X.InterfaceC1665870tS5
    public final InterfaceC1685750ty9 LIZ(InterfaceC1685750ty9 interfaceC1685750ty9) {
        return this.LIZJ.LIZ(interfaceC1685750ty9);
    }

    @Override // X.InterfaceC1665870tS5
    public final InterfaceC1685750ty9 LIZIZ(InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1668050tVb interfaceC1668050tVb) {
        return this.LIZJ.LIZIZ(interfaceC1685750ty9, interfaceC1668050tVb);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1672550tcr)) {
            return false;
        }
        C1672550tcr c1672550tcr = (C1672550tcr) obj;
        return Intrinsics.LJFF(this.LIZ, c1672550tcr.LIZ) && C1682380tsi.LIZJ(this.LIZIZ, c1672550tcr.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BoxWithConstraintsScopeImpl(density=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", constraints=");
        sbLIZ.append((Object) C1682380tsi.LJIIJJI(this.LIZIZ));
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1668850tWt
    public final float LJ() {
        InterfaceC1690500u5o interfaceC1690500u5o = this.LIZ;
        if (C1682380tsi.LIZLLL(this.LIZIZ)) {
            return interfaceC1690500u5o.LJJI(C1682380tsi.LJII(this.LIZIZ));
        }
        return Float.POSITIVE_INFINITY;
    }

    @Override // X.InterfaceC1668850tWt
    public final float LJFF() {
        return this.LIZ.LJJI(C1682380tsi.LJIIIZ(this.LIZIZ));
    }

    @Override // X.InterfaceC1668850tWt
    public final float LJI() {
        InterfaceC1690500u5o interfaceC1690500u5o = this.LIZ;
        if (C1682380tsi.LJ(this.LIZIZ)) {
            return interfaceC1690500u5o.LJJI(C1682380tsi.LJIIIIZZ(this.LIZIZ));
        }
        return Float.POSITIVE_INFINITY;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    @Override // X.InterfaceC1668850tWt
    public final long LIZLLL() {
        return this.LIZIZ;
    }

    public C1672550tcr(InterfaceC1690500u5o interfaceC1690500u5o, long j) {
        this.LIZ = interfaceC1690500u5o;
        this.LIZIZ = j;
    }
}
