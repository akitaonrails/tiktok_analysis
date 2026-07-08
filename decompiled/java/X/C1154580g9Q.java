package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0g9Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1154580g9Q {
    public final String LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1154580g9Q)) {
            return false;
        }
        C1154580g9Q c1154580g9Q = (C1154580g9Q) obj;
        return Intrinsics.LJFF(this.LIZ, c1154580g9Q.LIZ) && this.LIZIZ == c1154580g9Q.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TwoLineEndsIn(text=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", durationStart=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1154580g9Q(String str, int i) {
        this.LIZ = str;
        this.LIZIZ = i;
    }
}
