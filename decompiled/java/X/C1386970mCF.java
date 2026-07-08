package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mCF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1386970mCF extends AbstractC1387030mCL {
    public final String LIZ;
    public final int LIZIZ;

    public C1386970mCF() {
        this(0, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1386970mCF)) {
            return false;
        }
        C1386970mCF c1386970mCF = (C1386970mCF) obj;
        return Intrinsics.LJFF(this.LIZ, c1386970mCF.LIZ) && this.LIZIZ == c1386970mCF.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NoPermission(name=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", unReadCount=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1386970mCF(int i, int i2) {
        String str;
        if ((i2 & 1) != 0) {
            str = "no permission";
        } else {
            str = null;
        }
        i = (i2 & 2) != 0 ? 0 : i;
        this.LIZ = str;
        this.LIZIZ = i;
    }
}
