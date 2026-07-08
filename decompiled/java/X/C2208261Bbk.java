package X;

/* JADX INFO: renamed from: X.1Bbk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2208261Bbk {
    public final long LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public long LIZLLL = 0;
    public long LJ = 0;
    public long LJFF = 0;
    public long LJI = 0;
    public long LJII = 0;
    public long LJIIIIZZ = 0;
    public long LJIIIZ = 0;
    public boolean LJIIJ = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2208261Bbk)) {
            return false;
        }
        C2208261Bbk c2208261Bbk = (C2208261Bbk) obj;
        return this.LIZ == c2208261Bbk.LIZ && this.LIZIZ == c2208261Bbk.LIZIZ && this.LIZJ == c2208261Bbk.LIZJ && this.LIZLLL == c2208261Bbk.LIZLLL && this.LJ == c2208261Bbk.LJ && this.LJFF == c2208261Bbk.LJFF && this.LJI == c2208261Bbk.LJI && this.LJII == c2208261Bbk.LJII && this.LJIIIIZZ == c2208261Bbk.LJIIIIZZ && this.LJIIIZ == c2208261Bbk.LJIIIZ && this.LJIIJ == c2208261Bbk.LJIIJ;
    }

    public final int hashCode() {
        return (((((((((((((((((((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + C786410Ut5.Y2(this.LJ)) * 31) + C786410Ut5.Y2(this.LJFF)) * 31) + C786410Ut5.Y2(this.LJI)) * 31) + C786410Ut5.Y2(this.LJII)) * 31) + C786410Ut5.Y2(this.LJIIIIZZ)) * 31) + C786410Ut5.Y2(this.LJIIIZ)) * 31) + C786410Ut5.Z2(this.LJIIJ);
    }

    public final String toString() {
        return "UploadSession(startMs=" + this.LIZ + ", isRetry=" + this.LIZIZ + ", expectsLivePhotoVideo=" + this.LIZJ + ", imageLoadEndMs=" + this.LIZLLL + ", livePhotoVideoStartMs=" + this.LJ + ", livePhotoVideoLoadEndMs=" + this.LJFF + ", imageMs=" + this.LJI + ", livePhotoVideoMs=" + this.LJII + ", imageSizeKb=" + this.LJIIIIZZ + ", livePhotoVideoSizeKb=" + this.LJIIIZ + ", reported=" + this.LJIIJ + ')';
    }

    public C2208261Bbk(long j, boolean z, boolean z2) {
        this.LIZ = j;
        this.LIZIZ = z;
        this.LIZJ = z2;
    }
}
