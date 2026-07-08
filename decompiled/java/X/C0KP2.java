package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KP2, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KP2 {
    public final String LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0KP2)) {
            return false;
        }
        C0KP2 c0kp2 = (C0KP2) obj;
        return Intrinsics.LJFF(this.LIZ, c0kp2.LIZ) && this.LIZIZ == c0kp2.LIZIZ;
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

    public C0KP2(String str, long j) {
        this.LIZ = str;
        this.LIZIZ = j;
    }
}
