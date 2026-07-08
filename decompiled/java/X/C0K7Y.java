package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0K7Y, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K7Y {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final long LJ;
    public final long LJFF;
    public final int LJI;
    public final int LJII;
    public final boolean LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0K7Y)) {
            return false;
        }
        C0K7Y c0k7y = (C0K7Y) obj;
        return Intrinsics.LJFF(this.LIZ, c0k7y.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0k7y.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0k7y.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0k7y.LIZLLL) && this.LJ == c0k7y.LJ && this.LJFF == c0k7y.LJFF && this.LJI == c0k7y.LJI && this.LJII == c0k7y.LJII && this.LJIIIIZZ == c0k7y.LJIIIIZZ;
    }

    public final int hashCode() {
        return (((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + C786410Ut5.Y2(this.LJ)) * 31) + C786410Ut5.Y2(this.LJFF)) * 31) + this.LJI) * 31) + this.LJII) * 31) + C786410Ut5.Z2(this.LJIIIIZZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MediaItem(mediaId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", localUri=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", remoteUrl=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", mimeType=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", sizeBytes=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", durationMs=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", width=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", height=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", isRemote=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0K7Y() {
        this("", "", "", "", 0L, 0L, 0, 0, false);
    }

    public C0K7Y(String str, String str2, String str3, String str4, long j, long j2, int i, int i2, boolean z) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = j;
        this.LJFF = j2;
        this.LJI = i;
        this.LJII = i2;
        this.LJIIIIZZ = z;
    }
}
