package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00AL, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00AL {
    public final C00BZ LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final float LIZLLL;
    public final Long LJ = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C00AL)) {
            return false;
        }
        C00AL c00al = (C00AL) obj;
        return this.LIZ == c00al.LIZ && Intrinsics.LJFF(this.LIZIZ, c00al.LIZIZ) && this.LIZJ == c00al.LIZJ && Float.compare(this.LIZLLL, c00al.LIZLLL) == 0 && Intrinsics.LJFF(this.LJ, c00al.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AssetTag(tagType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", tagName=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", tagId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", confidence=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", timestamp=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ) * 31) + Float.floatToIntBits(this.LIZLLL)) * 31;
        Long l = this.LJ;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    public C00AL(C00BZ c00bz, String str, int i, float f) {
        this.LIZ = c00bz;
        this.LIZIZ = str;
        this.LIZJ = i;
        this.LIZLLL = f;
    }
}
