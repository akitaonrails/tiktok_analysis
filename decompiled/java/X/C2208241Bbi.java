package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1Bbi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2208241Bbi {
    public final long LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public final boolean LIZLLL;
    public long LJIIJ;
    public long LJIIJJI;
    public int LJ = 1;
    public String LJFF = "";
    public long LJI = 0;
    public String LJII = "";
    public long LJIIIIZZ = 0;
    public long LJIIIZ = 0;
    public boolean LJIIL = false;
    public boolean LJIILIIL = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2208241Bbi)) {
            return false;
        }
        C2208241Bbi c2208241Bbi = (C2208241Bbi) obj;
        return this.LIZ == c2208241Bbi.LIZ && this.LIZIZ == c2208241Bbi.LIZIZ && this.LIZJ == c2208241Bbi.LIZJ && this.LIZLLL == c2208241Bbi.LIZLLL && this.LJ == c2208241Bbi.LJ && Intrinsics.LJFF(this.LJFF, c2208241Bbi.LJFF) && this.LJI == c2208241Bbi.LJI && Intrinsics.LJFF(this.LJII, c2208241Bbi.LJII) && this.LJIIIIZZ == c2208241Bbi.LJIIIIZZ && this.LJIIIZ == c2208241Bbi.LJIIIZ && this.LJIIJ == c2208241Bbi.LJIIJ && this.LJIIJJI == c2208241Bbi.LJIIJJI && this.LJIIL == c2208241Bbi.LJIIL && this.LJIILIIL == c2208241Bbi.LJIILIIL;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + this.LJ) * 31) + this.LJFF.hashCode()) * 31) + C786410Ut5.Y2(this.LJI)) * 31) + this.LJII.hashCode()) * 31) + C786410Ut5.Y2(this.LJIIIIZZ)) * 31) + C786410Ut5.Y2(this.LJIIIZ)) * 31) + C786410Ut5.Y2(this.LJIIJ)) * 31) + C786410Ut5.Y2(this.LJIIJJI)) * 31) + C786410Ut5.Z2(this.LJIIL)) * 31) + C786410Ut5.Z2(this.LJIILIIL);
    }

    public final String toString() {
        return "ProduceSession(startMs=" + this.LIZ + ", imageDone=" + this.LIZIZ + ", livePhotoVideoDone=" + this.LIZJ + ", expectsLivePhotoVideo=" + this.LIZLLL + ", status=" + this.LJ + ", failReason=" + this.LJFF + ", errorCode=" + this.LJI + ", errorDomain=" + this.LJII + ", imageMs=" + this.LJIIIIZZ + ", livePhotoVideoMs=" + this.LJIIIZ + ", imageSizeKb=" + this.LJIIJ + ", livePhotoVideoSizeKb=" + this.LJIIJJI + ", produceReported=" + this.LJIIL + ", cancelReported=" + this.LJIILIIL + ')';
    }

    public C2208241Bbi(long j, boolean z, boolean z2, boolean z3, long j2, long j3) {
        this.LIZ = j;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = z3;
        this.LJIIJ = j2;
        this.LJIIJJI = j3;
    }
}
