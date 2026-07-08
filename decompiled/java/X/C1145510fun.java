package X;

import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fun, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1145510fun {
    public final long LIZ;
    public final String LIZIZ;
    public int LIZJ = 0;
    public Long LIZLLL = null;
    public Integer LJ = null;
    public int LJFF = 0;
    public Long LJI = null;
    public Long LJII = null;
    public int LJIIIIZZ = 0;
    public int LJIIIZ = 0;
    public int LJIIJ = 0;
    public int LJIIJJI = 0;
    public int LJIIL = 0;
    public int LJIILIIL = 0;
    public boolean LJIILJJIL = true;
    public Integer LJIILL = null;
    public final HashSet<String> LJIILLIIL = new HashSet<>();
    public final HashSet<String> LJIIZILJ = new HashSet<>();
    public boolean LJIJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1145510fun)) {
            return false;
        }
        C1145510fun c1145510fun = (C1145510fun) obj;
        return this.LIZ == c1145510fun.LIZ && Intrinsics.LJFF(this.LIZIZ, c1145510fun.LIZIZ) && this.LIZJ == c1145510fun.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1145510fun.LIZLLL) && Intrinsics.LJFF(this.LJ, c1145510fun.LJ) && this.LJFF == c1145510fun.LJFF && Intrinsics.LJFF(this.LJI, c1145510fun.LJI) && Intrinsics.LJFF(this.LJII, c1145510fun.LJII) && this.LJIIIIZZ == c1145510fun.LJIIIIZZ && this.LJIIIZ == c1145510fun.LJIIIZ && this.LJIIJ == c1145510fun.LJIIJ && this.LJIIJJI == c1145510fun.LJIIJJI && this.LJIIL == c1145510fun.LJIIL && this.LJIILIIL == c1145510fun.LJIILIIL && this.LJIILJJIL == c1145510fun.LJIILJJIL && Intrinsics.LJFF(this.LJIILL, c1145510fun.LJIILL);
    }

    public final int hashCode() {
        int iY2 = ((((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ) * 31;
        Long l = this.LIZLLL;
        int iHashCode = (iY2 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.LJ;
        int iHashCode2 = (((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.LJFF) * 31;
        Long l2 = this.LJI;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.LJII;
        int iHashCode4 = (((((((((((((((iHashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31) + this.LJIIIIZZ) * 31) + this.LJIIIZ) * 31) + this.LJIIJ) * 31) + this.LJIIJJI) * 31) + this.LJIIL) * 31) + this.LJIILIIL) * 31) + C786410Ut5.Z2(this.LJIILJJIL)) * 31;
        Integer num2 = this.LJIILL;
        return iHashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "ItemState(itemId=" + this.LIZ + ", itemType=" + this.LIZIZ + ", status=" + this.LIZJ + ", attachedMs=" + this.LIZLLL + ", itemErrorCode=" + this.LJ + ", resourceErrorCode=" + this.LJFF + ", firstResourceStartMs=" + this.LJI + ", lastResourceTerminalMs=" + this.LJII + ", imageRemoteAttempt=" + this.LJIIIIZZ + ", imageRemoteSuccess=" + this.LJIIIZ + ", fontRemoteAttempt=" + this.LJIIJ + ", fontRemoteSuccess=" + this.LJIIJJI + ", textRenderAttempt=" + this.LJIIL + ", textRenderSuccessCount=" + this.LJIILIIL + ", textRenderSuccess=" + this.LJIILJJIL + ", imageDownloadSizeBytes=" + this.LJIILL + ')';
    }

    public final boolean LIZ() {
        return this.LJIJ || ((this.LJIILLIIL.isEmpty() ^ true) && this.LJIIZILJ.size() >= this.LJIILLIIL.size());
    }

    public final void LIZJ(long j) {
        if (LIZ()) {
            return;
        }
        if (this.LJI == null) {
            this.LJI = Long.valueOf(j);
        }
        this.LJII = Long.valueOf(j);
        this.LJIJ = true;
    }

    public C1145510fun(long j, String str) {
        this.LIZ = j;
        this.LIZIZ = str;
    }

    public final boolean LIZIZ(long j, String str) {
        if (!this.LJIIZILJ.add(str)) {
            return false;
        }
        this.LJIILLIIL.add(str);
        if (this.LJI == null) {
            this.LJI = Long.valueOf(j);
        }
        this.LJII = Long.valueOf(j);
        return true;
    }
}
