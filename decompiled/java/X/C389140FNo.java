package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FNo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C389140FNo {
    public final String LIZ;
    public final C389150FNp LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C389140FNo)) {
            return false;
        }
        C389140FNo c389140FNo = (C389140FNo) obj;
        return Intrinsics.LJFF(this.LIZ, c389140FNo.LIZ) && Intrinsics.LJFF(this.LIZIZ, c389140FNo.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ResItemLoadStateChangeEvent(resourceId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", status=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C389140FNo(C389150FNp c389150FNp, String str) {
        this.LIZ = str;
        this.LIZIZ = c389150FNp;
    }
}
