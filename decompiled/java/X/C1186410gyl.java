package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gyl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1186410gyl implements InterfaceC1186470gyr {
    public final String LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final String LIZLLL;
    public final long LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1186410gyl)) {
            return false;
        }
        C1186410gyl c1186410gyl = (C1186410gyl) obj;
        return Intrinsics.LJFF(this.LIZ, c1186410gyl.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1186410gyl.LIZIZ) && this.LIZJ == c1186410gyl.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1186410gyl.LIZLLL) && this.LJ == c1186410gyl.LJ;
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31;
        String str2 = this.LIZLLL;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChunkDurationTrackAction(business=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", chunkName=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", fromInstanceId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", stayTime=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1186410gyl(long j, long j2, String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = j;
        this.LIZLLL = str3;
        this.LJ = j2;
    }
}
