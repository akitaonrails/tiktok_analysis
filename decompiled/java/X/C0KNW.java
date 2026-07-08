package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KNW, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KNW {
    public final String LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0KNW)) {
            return false;
        }
        C0KNW c0knw = (C0KNW) obj;
        return Intrinsics.LJFF(this.LIZ, c0knw.LIZ) && this.LIZIZ == c0knw.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AdditionalData(contractId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", startTime=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0KNW(String str, long j) {
        this.LIZ = str;
        this.LIZIZ = j;
    }
}
