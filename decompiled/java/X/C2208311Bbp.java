package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1Bbp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2208311Bbp {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final long LJFF;
    public final boolean LJI;
    public final boolean LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2208311Bbp)) {
            return false;
        }
        C2208311Bbp c2208311Bbp = (C2208311Bbp) obj;
        return Intrinsics.LJFF(this.LIZ, c2208311Bbp.LIZ) && this.LIZIZ == c2208311Bbp.LIZIZ && this.LIZJ == c2208311Bbp.LIZJ && this.LIZLLL == c2208311Bbp.LIZLLL && this.LJ == c2208311Bbp.LJ && this.LJFF == c2208311Bbp.LJFF && this.LJI == c2208311Bbp.LJI && this.LJII == c2208311Bbp.LJII;
    }

    public final int hashCode() {
        return (((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + C786410Ut5.Y2(this.LJ)) * 31) + C786410Ut5.Y2(this.LJFF)) * 31) + C786410Ut5.Z2(this.LJI)) * 31) + C786410Ut5.Z2(this.LJII);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProcessedLivePhotoVideoInfo(filePath=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", width=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", height=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", bitrate=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", durationMs=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", fileSize=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", isAudioRemoved=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", isCompressed=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2208311Bbp(long j, boolean z, long j2, boolean z2, int i, long j3, int i2, String str) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = j;
        this.LJ = j2;
        this.LJFF = j3;
        this.LJI = z;
        this.LJII = z2;
    }
}
