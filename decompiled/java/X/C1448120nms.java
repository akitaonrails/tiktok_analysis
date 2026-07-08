package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nms, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1448120nms {
    public final String LIZ;
    public final long LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final long LJFF;
    public final long LJI;
    public final long LJII;
    public final long LJIIIIZZ;
    public final long LJIIIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1448120nms)) {
            return false;
        }
        C1448120nms c1448120nms = (C1448120nms) obj;
        return Intrinsics.LJFF(this.LIZ, c1448120nms.LIZ) && this.LIZIZ == c1448120nms.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1448120nms.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1448120nms.LIZLLL) && Intrinsics.LJFF(this.LJ, c1448120nms.LJ) && this.LJFF == c1448120nms.LJFF && this.LJI == c1448120nms.LJI && this.LJII == c1448120nms.LJII && this.LJIIIIZZ == c1448120nms.LJIIIIZZ && this.LJIIIZ == c1448120nms.LJIIIZ;
    }

    public final int hashCode() {
        return (((((((((((((((((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + C786410Ut5.Y2(this.LJFF)) * 31) + C786410Ut5.Y2(this.LJI)) * 31) + C786410Ut5.Y2(this.LJII)) * 31) + C786410Ut5.Y2(this.LJIIIIZZ)) * 31) + C786410Ut5.Y2(this.LJIIIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AlbumSnapshot(sessionId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", openTime=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", inspirationEnterFrom=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", inspirationEnterMethod=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", searchExtra=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", setAtMs=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", nativeRecvTs=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", pluginCost=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", prefetchCost=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", launchStartTs=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C1448120nms LIZ(C1448120nms c1448120nms, long j, long j2, long j3, int i) {
        String str;
        long j4;
        String str2;
        String str3;
        long j5;
        long j6 = j3;
        long j7 = j2;
        long j8 = j;
        String str4 = null;
        if ((i & 1) != 0) {
            str = c1448120nms.LIZ;
        } else {
            str = null;
        }
        long j9 = 0;
        if ((i & 2) != 0) {
            j4 = c1448120nms.LIZIZ;
        } else {
            j4 = 0;
        }
        if ((i & 4) != 0) {
            str2 = c1448120nms.LIZJ;
        } else {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = c1448120nms.LIZLLL;
        } else {
            str3 = null;
        }
        if ((i & 16) != 0) {
            str4 = c1448120nms.LJ;
        }
        if ((i & 32) != 0) {
            j5 = c1448120nms.LJFF;
        } else {
            j5 = 0;
        }
        if ((i & 64) != 0) {
            j9 = c1448120nms.LJI;
        }
        if ((i & 128) != 0) {
            j8 = c1448120nms.LJII;
        }
        if ((i & 256) != 0) {
            j7 = c1448120nms.LJIIIIZZ;
        }
        if ((i & 512) != 0) {
            j6 = c1448120nms.LJIIIZ;
        }
        return new C1448120nms(str, j4, str2, str3, str4, j5, j9, j8, j7, j6);
    }

    public C1448120nms(String str, long j, String str2, String str3, String str4, long j2, long j3, long j4, long j5, long j6) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = j2;
        this.LJI = j3;
        this.LJII = j4;
        this.LJIIIIZZ = j5;
        this.LJIIIZ = j6;
    }
}
