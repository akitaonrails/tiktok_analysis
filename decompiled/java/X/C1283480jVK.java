package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0jVK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1283480jVK {
    public final String LIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final double LJ;
    public final double LJFF;
    public final long LJII;
    public final long LJIIIIZZ;
    public final long LJIIIZ;
    public final long LJIIJ;
    public final long LJIIJJI;
    public final boolean LJIIL;
    public final long LJIILIIL;
    public final long LJIILJJIL;
    public final long LJIILL;
    public final long LJIILLIIL;
    public final long LIZIZ = 0;
    public final long LJI = 0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1283480jVK)) {
            return false;
        }
        C1283480jVK c1283480jVK = (C1283480jVK) obj;
        return Intrinsics.LJFF(this.LIZ, c1283480jVK.LIZ) && this.LIZIZ == c1283480jVK.LIZIZ && this.LIZJ == c1283480jVK.LIZJ && this.LIZLLL == c1283480jVK.LIZLLL && Double.compare(this.LJ, c1283480jVK.LJ) == 0 && Double.compare(this.LJFF, c1283480jVK.LJFF) == 0 && this.LJI == c1283480jVK.LJI && this.LJII == c1283480jVK.LJII && this.LJIIIIZZ == c1283480jVK.LJIIIIZZ && this.LJIIIZ == c1283480jVK.LJIIIZ && this.LJIIJ == c1283480jVK.LJIIJ && this.LJIIJJI == c1283480jVK.LJIIJJI && this.LJIIL == c1283480jVK.LJIIL && this.LJIILIIL == c1283480jVK.LJIILIIL && this.LJIILJJIL == c1283480jVK.LJIILJJIL && this.LJIILL == c1283480jVK.LJIILL && this.LJIILLIIL == c1283480jVK.LJIILLIIL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [int] */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v37 */
    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (((((((((((((((((((((((str == null ? 0 : str.hashCode()) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + C786410Ut5.X2(this.LJ)) * 31) + C786410Ut5.X2(this.LJFF)) * 31) + C786410Ut5.Y2(this.LJI)) * 31) + C786410Ut5.Y2(this.LJII)) * 31) + C786410Ut5.Y2(this.LJIIIIZZ)) * 31) + C786410Ut5.Y2(this.LJIIIZ)) * 31) + C786410Ut5.Y2(this.LJIIJ)) * 31) + C786410Ut5.Y2(this.LJIIJJI)) * 31;
        boolean z = this.LJIIL;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return ((((((((iHashCode + r0) * 31) + C786410Ut5.Y2(this.LJIILIIL)) * 31) + C786410Ut5.Y2(this.LJIILJJIL)) * 31) + C786410Ut5.Y2(this.LJIILL)) * 31) + C786410Ut5.Y2(this.LJIILLIIL);
    }

    public final String toString() {
        return "LinkMicRtcRemoteVideoStats(linkMicId=" + this.LIZ + ", delay=" + this.LIZIZ + ", width=" + this.LIZJ + ", height=" + this.LIZLLL + ", videoLossRate=" + this.LJ + ", receivedKb=" + this.LJFF + ", receivedFrameRate=" + this.LJI + ", decoderOutputFrameRate=" + this.LJII + ", renderOutputFrameRate=" + this.LJIIIIZZ + ", stallCount=" + this.LJIIIZ + ", stallDuration=" + this.LJIIJ + ", e2eDelay=" + this.LJIIJJI + ", isScreen=" + this.LJIIL + ", statsInterval=" + this.LJIILIIL + ", rtt=" + this.LJIILJJIL + ", frozenRate=" + this.LJIILL + ", videoIndex=" + this.LJIILLIIL + ')';
    }

    public C1283480jVK(String str, long j, long j2, double d, double d2, long j3, long j4, long j5, long j6, long j7, boolean z, long j8, long j9, long j10, long j11) {
        this.LIZ = str;
        this.LIZJ = j;
        this.LIZLLL = j2;
        this.LJ = d;
        this.LJFF = d2;
        this.LJII = j3;
        this.LJIIIIZZ = j4;
        this.LJIIIZ = j5;
        this.LJIIJ = j6;
        this.LJIIJJI = j7;
        this.LJIIL = z;
        this.LJIILIIL = j8;
        this.LJIILJJIL = j9;
        this.LJIILL = j10;
        this.LJIILLIIL = j11;
    }
}
