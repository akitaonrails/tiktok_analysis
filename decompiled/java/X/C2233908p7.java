package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08p7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2233908p7 {
    public final String LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final boolean LJ;
    public final int LJFF;
    public volatile long LJI = 0;
    public volatile String LJII = null;
    public volatile boolean LJIIIIZZ = false;
    public volatile long LJIIIZ = 0;
    public volatile String LJIIJ = null;
    public volatile boolean LJIIJJI = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2233908p7)) {
            return false;
        }
        C2233908p7 c2233908p7 = (C2233908p7) obj;
        return Intrinsics.LJFF(this.LIZ, c2233908p7.LIZ) && this.LIZIZ == c2233908p7.LIZIZ && this.LIZJ == c2233908p7.LIZJ && this.LIZLLL == c2233908p7.LIZLLL && this.LJ == c2233908p7.LJ && this.LJFF == c2233908p7.LJFF && this.LJI == c2233908p7.LJI && Intrinsics.LJFF(this.LJII, c2233908p7.LJII) && this.LJIIIIZZ == c2233908p7.LJIIIIZZ && this.LJIIIZ == c2233908p7.LJIIIZ && Intrinsics.LJFF(this.LJIIJ, c2233908p7.LJIIJ) && this.LJIIJJI == c2233908p7.LJIIJJI;
    }

    public final int hashCode() {
        return (((((((((((((((((((((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + this.LJFF) * 31) + C786410Ut5.Y2(this.LJI)) * 31) + (this.LJII == null ? 0 : this.LJII.hashCode())) * 31) + C786410Ut5.Z2(this.LJIIIIZZ)) * 31) + C786410Ut5.Y2(this.LJIIIZ)) * 31) + (this.LJIIJ != null ? this.LJIIJ.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJIIJJI);
    }

    public final String toString() {
        return "CellPerfSession(vid=" + this.LIZ + ", bulletinBoardId=" + this.LIZIZ + ", messageId=" + this.LIZJ + ", exposeTsMs=" + this.LIZLLL + ", isCreator=" + this.LJ + ", identityType=" + this.LJFF + ", downloadStartTsMs=" + this.LJI + ", downloadTrigger=" + this.LJII + ", downloadJoinedPreload=" + this.LJIIIIZZ + ", clickTsMs=" + this.LJIIIZ + ", clickCacheState=" + this.LJIIJ + ", clickResolved=" + this.LJIIJJI + ')';
    }

    public C2233908p7(String str, long j, long j2, long j3, boolean z, int i) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = j3;
        this.LJ = z;
        this.LJFF = i;
    }
}
