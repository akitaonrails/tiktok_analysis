package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bv4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C991920bv4 {
    public final int LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C991920bv4)) {
            return false;
        }
        C991920bv4 c991920bv4 = (C991920bv4) obj;
        return this.LIZ == c991920bv4.LIZ && Intrinsics.LJFF(this.LIZIZ, c991920bv4.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PollPercentResult(percentInt=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", displayText=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C991920bv4(int i, String str) {
        this.LIZ = i;
        this.LIZIZ = str;
    }
}
