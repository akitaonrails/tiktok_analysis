package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hPk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1203140hPk implements InterfaceC1203220hPs {
    public final CharSequence LIZ;
    public final InterfaceC1183704k7 LIZIZ;
    public final InterfaceC1183704k7 LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1203140hPk)) {
            return false;
        }
        C1203140hPk c1203140hPk = (C1203140hPk) obj;
        return Intrinsics.LJFF(this.LIZ, c1203140hPk.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1203140hPk.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1203140hPk.LIZJ) && this.LIZLLL == c1203140hPk.LIZLLL;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        InterfaceC1183704k7 interfaceC1183704k7 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (interfaceC1183704k7 == null ? 0 : interfaceC1183704k7.hashCode())) * 31;
        InterfaceC1183704k7 interfaceC1183704k72 = this.LIZJ;
        return ((iHashCode2 + (interfaceC1183704k72 != null ? interfaceC1183704k72.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LabelChip(label=");
        sbLIZ.append((Object) this.LIZ);
        sbLIZ.append(", leadingIcon=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", trailingIcon=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isEnabled=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1203140hPk(CharSequence charSequence, C1183604k6 c1183604k6, int i) {
        boolean z;
        c1183604k6 = (i & 2) != 0 ? null : c1183604k6;
        if ((i & 8) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.LIZ = charSequence;
        this.LIZIZ = c1183604k6;
        this.LIZJ = null;
        this.LIZLLL = z;
    }
}
