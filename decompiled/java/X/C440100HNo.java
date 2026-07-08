package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HNo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C440100HNo implements InterfaceC440090HNn {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C440100HNo)) {
            return false;
        }
        C440100HNo c440100HNo = (C440100HNo) obj;
        return Intrinsics.LJFF(this.LIZ, c440100HNo.LIZ) && Intrinsics.LJFF(this.LIZIZ, c440100HNo.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c440100HNo.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HiddenTextElement(prompt=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", deviceImageAbsolutePath=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", deviceImageLocalPath=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C440100HNo(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
