package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cMZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1008970cMZ extends AbstractC1009010cMd {
    public final int LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1008970cMZ)) {
            return false;
        }
        C1008970cMZ c1008970cMZ = (C1008970cMZ) obj;
        return this.LIZ == c1008970cMZ.LIZ && Intrinsics.LJFF(this.LIZIZ, c1008970cMZ.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SetPhotoPosition(position=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", aid=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1008970cMZ(int i, String str) {
        this.LIZ = i;
        this.LIZIZ = str;
    }
}
