package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00AM, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00AM {
    public final String LIZ;
    public final String LIZIZ;
    public final float LIZJ;

    public C00AM() {
        this("", "", 0.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C00AM)) {
            return false;
        }
        C00AM c00am = (C00AM) obj;
        return Intrinsics.LJFF(this.LIZ, c00am.LIZ) && Intrinsics.LJFF(this.LIZIZ, c00am.LIZIZ) && Float.compare(this.LIZJ, c00am.LIZJ) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ScanTag(id=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", name=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", confidence=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + Float.floatToIntBits(this.LIZJ);
    }

    public C00AM(String str, String str2, float f) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = f;
    }
}
