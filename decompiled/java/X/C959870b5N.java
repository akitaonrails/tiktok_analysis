package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0b5N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C959870b5N {
    public final int LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C959870b5N)) {
            return false;
        }
        C959870b5N c959870b5N = (C959870b5N) obj;
        return this.LIZ == c959870b5N.LIZ && Intrinsics.LJFF(this.LIZIZ, c959870b5N.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MatchedPreferenceTagCapture(tag=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", logSource=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C959870b5N(int i, String str) {
        this.LIZ = i;
        this.LIZIZ = str;
    }
}
