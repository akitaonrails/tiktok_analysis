package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RiV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C703410RiV {
    public final String LIZ;
    public final EnumC703190Ri9 LIZIZ;
    public final String LIZJ;
    public final C703510Rif LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C703410RiV)) {
            return false;
        }
        C703410RiV c703410RiV = (C703410RiV) obj;
        return Intrinsics.LJFF(this.LIZ, c703410RiV.LIZ) && this.LIZIZ == c703410RiV.LIZIZ && Intrinsics.LJFF(this.LIZJ, c703410RiV.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c703410RiV.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        String str = this.LIZJ;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SlotOperation(slotId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", actionType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", timingKey=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", rawData=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C703410RiV(String str, EnumC703190Ri9 enumC703190Ri9, String str2, C703510Rif c703510Rif) {
        this.LIZ = str;
        this.LIZIZ = enumC703190Ri9;
        this.LIZJ = str2;
        this.LIZLLL = c703510Rif;
    }
}
