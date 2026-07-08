package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cfq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1020920cfq {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1020920cfq)) {
            return false;
        }
        C1020920cfq c1020920cfq = (C1020920cfq) obj;
        return Intrinsics.LJFF(this.LIZ, c1020920cfq.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1020920cfq.LIZIZ) && this.LIZJ == c1020920cfq.LIZJ && this.LIZLLL == c1020920cfq.LIZLLL && Intrinsics.LJFF(this.LJ, c1020920cfq.LJ) && Intrinsics.LJFF(this.LJFF, c1020920cfq.LJFF) && Intrinsics.LJFF(this.LJI, c1020920cfq.LJI);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31;
        String str = this.LJI;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UgenImageTrackTag(componentInstanceId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", exposureKey=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", slideIndex=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", imageIndex=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", url=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", productId=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", nodeId=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1020920cfq(String str, String str2, int i, int i2, String str3, String str4, String str5) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = str3;
        this.LJFF = str4;
        this.LJI = str5;
    }
}
