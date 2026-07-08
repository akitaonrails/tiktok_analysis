package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LY5, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LY5 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final int LJFF;
    public final int LJI;
    public final boolean LJII;
    public final String LJIIIIZZ;
    public final int LJIIIZ;
    public final long LJIIJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0LY5)) {
            return false;
        }
        C0LY5 c0ly5 = (C0LY5) obj;
        return Intrinsics.LJFF(this.LIZ, c0ly5.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0ly5.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0ly5.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0ly5.LIZLLL) && Intrinsics.LJFF(this.LJ, c0ly5.LJ) && this.LJFF == c0ly5.LJFF && this.LJI == c0ly5.LJI && this.LJII == c0ly5.LJII && Intrinsics.LJFF(this.LJIIIIZZ, c0ly5.LJIIIIZZ) && this.LJIIIZ == c0ly5.LJIIIZ && this.LJIIJ == c0ly5.LJIIJ;
    }

    public final int hashCode() {
        return (((((((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF) * 31) + this.LJI) * 31) + C786410Ut5.Z2(this.LJII)) * 31) + this.LJIIIIZZ.hashCode()) * 31) + this.LJIIIZ) * 31) + C786410Ut5.Y2(this.LJIIJ);
    }

    public final String toString() {
        return "CreationAsyncTaskInfoAdapterModel(id=" + this.LIZ + ", creationId=" + this.LIZIZ + ", serverTaskId=" + this.LIZJ + ", taskStep=" + this.LIZLLL + ", taskStatus=" + this.LJ + ", serverTaskStatus=" + this.LJFF + ", queueTime=" + this.LJI + ", isAsync=" + this.LJII + ", result=" + this.LJIIIIZZ + ", progress=" + this.LJIIIZ + ", createTime=" + this.LJIIJ + ')';
    }

    public C0LY5(String str, String str2, String str3, String str4, String str5, int i, int i2, boolean z, String str6, int i3, long j) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = i;
        this.LJI = i2;
        this.LJII = z;
        this.LJIIIIZZ = str6;
        this.LJIIIZ = i3;
        this.LJIIJ = j;
    }
}
