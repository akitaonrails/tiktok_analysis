package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.096O, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C096O extends C096Q {
    public final String LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C096O)) {
            return false;
        }
        C096O c096o = (C096O) obj;
        return Intrinsics.LJFF(this.LIZ, c096o.LIZ) && this.LIZIZ == c096o.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(compressedPath=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isFromCache=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C096O(String str, boolean z) {
        this.LIZ = str;
        this.LIZIZ = z;
    }
}
