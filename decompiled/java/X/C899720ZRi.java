package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZRi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C899720ZRi {
    public final int LIZ;
    public final int LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C899720ZRi)) {
            return false;
        }
        C899720ZRi c899720ZRi = (C899720ZRi) obj;
        return this.LIZ == c899720ZRi.LIZ && this.LIZIZ == c899720ZRi.LIZIZ && Intrinsics.LJFF(this.LIZJ, c899720ZRi.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Duration(durationMilliseconds=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", durationSeconds=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", totalDurationText=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C899720ZRi(int i, int i2, String str) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = str;
    }
}
