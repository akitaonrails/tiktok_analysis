package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01q5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C456301q5 {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final int LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C456301q5)) {
            return false;
        }
        C456301q5 c456301q5 = (C456301q5) obj;
        return this.LIZ == c456301q5.LIZ && this.LIZIZ == c456301q5.LIZIZ && this.LIZJ == c456301q5.LIZJ && this.LIZLLL == c456301q5.LIZLLL && Intrinsics.LJFF(this.LJ, c456301q5.LJ) && Intrinsics.LJFF(this.LJFF, c456301q5.LJFF) && this.LJI == c456301q5.LJI;
    }

    public final int hashCode() {
        return (((((((((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CropResult(streamW=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", streamH=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", viewW=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", viewH=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", hasCrop=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", scaleType=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", boardItemsCount=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C456301q5(int i, int i2, String str, String str2, int i3, int i4, int i5) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i4;
        this.LJ = str;
        this.LJFF = str2;
        this.LJI = i5;
    }
}
