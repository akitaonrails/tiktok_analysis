package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mCG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1386980mCG extends AbstractC1387030mCL {
    public final String LIZ;
    public final String LIZIZ;

    public C1386980mCG() {
        this(null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1386980mCG)) {
            return false;
        }
        C1386980mCG c1386980mCG = (C1386980mCG) obj;
        return Intrinsics.LJFF(this.LIZ, c1386980mCG.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1386980mCG.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Fail(name=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorMessage=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1386980mCG(String str, int i) {
        String str2;
        if ((i & 1) != 0) {
            str2 = "fail";
        } else {
            str2 = null;
        }
        str = (i & 2) != 0 ? "" : str;
        this.LIZ = str2;
        this.LIZIZ = str;
    }
}
