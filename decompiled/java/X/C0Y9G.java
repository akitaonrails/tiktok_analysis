package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Y9G, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y9G {
    public static final /* synthetic */ int LJIIJJI = 0;
    public final String LIZ;
    public final long LIZIZ;
    public final int LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final C869590Y9l LJIIIIZZ;
    public final long LJIIIZ;
    public final Boolean LJIIJ = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0Y9G)) {
            return false;
        }
        C0Y9G c0y9g = (C0Y9G) obj;
        return Intrinsics.LJFF(this.LIZ, c0y9g.LIZ) && this.LIZIZ == c0y9g.LIZIZ && this.LIZJ == c0y9g.LIZJ && this.LIZLLL == c0y9g.LIZLLL && this.LJ == c0y9g.LJ && this.LJFF == c0y9g.LJFF && this.LJI == c0y9g.LJI && this.LJII == c0y9g.LJII && Intrinsics.LJFF(this.LJIIIIZZ, c0y9g.LJIIIIZZ) && this.LJIIIZ == c0y9g.LJIIIZ && Intrinsics.LJFF(this.LJIIJ, c0y9g.LJIIJ);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + C786410Ut5.Y2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + C786410Ut5.Z2(this.LJI)) * 31) + C786410Ut5.Z2(this.LJII)) * 31;
        C869590Y9l c869590Y9l = this.LJIIIIZZ;
        int iHashCode2 = (((iHashCode + (c869590Y9l == null ? 0 : c869590Y9l.hashCode())) * 31) + C786410Ut5.Y2(this.LJIIIZ)) * 31;
        Boolean bool = this.LJIIJ;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "MessageRequestSimConvInfo(conversationId=" + this.LIZ + ", shortId=" + this.LIZIZ + ", conversationType=" + this.LIZJ + ", unreadCount=" + this.LIZLLL + ", lastUpdateTime=" + this.LJ + ", isStranger=" + this.LJFF + ", isRisky=" + this.LJI + ", isMute=" + this.LJII + ", lastShowMsg=" + this.LJIIIIZZ + ", minIndex=" + this.LJIIIZ + ", isPeerUserBlocked=" + this.LJIIJ + ')';
    }

    public C0Y9G(String str, long j, int i, long j2, long j3, boolean z, boolean z2, boolean z3, C869590Y9l c869590Y9l, long j4) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = i;
        this.LIZLLL = j2;
        this.LJ = j3;
        this.LJFF = z;
        this.LJI = z2;
        this.LJII = z3;
        this.LJIIIIZZ = c869590Y9l;
        this.LJIIIZ = j4;
    }
}
