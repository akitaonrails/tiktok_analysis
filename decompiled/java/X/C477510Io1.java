package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Io1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C477510Io1 {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C477510Io1)) {
            return false;
        }
        C477510Io1 c477510Io1 = (C477510Io1) obj;
        return Intrinsics.LJFF(this.LIZ, c477510Io1.LIZ) && Intrinsics.LJFF(this.LIZIZ, c477510Io1.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CardCellLabelInfo(topLabel=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", middleLabel=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C477510Io1(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
