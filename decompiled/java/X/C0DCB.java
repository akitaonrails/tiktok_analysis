package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DCB, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DCB implements C0DCS {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0DCB)) {
            return false;
        }
        C0DCB c0dcb = (C0DCB) obj;
        return Intrinsics.LJFF(this.LIZ, c0dcb.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0dcb.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0dcb.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        String str = this.LIZJ;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Ready(titleText=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", amountText=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", savedSuffixText=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0DCB(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
