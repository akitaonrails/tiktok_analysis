package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1A1l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2172711A1l implements InterfaceC2172841A1y {
    public final C06WA LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL = 0;
    public final boolean LJ = false;
    public final boolean LJFF = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2172711A1l)) {
            return false;
        }
        C2172711A1l c2172711A1l = (C2172711A1l) obj;
        return Intrinsics.LJFF(this.LIZ, c2172711A1l.LIZ) && this.LIZIZ == c2172711A1l.LIZIZ && this.LIZJ == c2172711A1l.LIZJ && this.LIZLLL == c2172711A1l.LIZLLL && this.LJ == c2172711A1l.LJ && this.LJFF == c2172711A1l.LJFF;
    }

    public final int hashCode() {
        return (((((((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChatDetailSwitchUiConfig(type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", titleRes=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", iconRes=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", iconTintColor=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isChecked=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", negative=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC2172841A1y
    public final Integer LIZIZ() {
        return Integer.valueOf(this.LIZIZ);
    }

    @Override // X.InterfaceC2172841A1y
    public final C06WA getType() {
        return this.LIZ;
    }

    public C2172711A1l(C06WA c06wa, int i, int i2) {
        this.LIZ = c06wa;
        this.LIZIZ = i;
        this.LIZJ = i2;
    }
}
