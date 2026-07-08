package X;

import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LJ2, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LJ2 {
    public final List<SocMediaResource> LIZ;
    public final List<SocMediaResource> LIZIZ;
    public final C0L20 LIZJ;
    public final C0L20 LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final List<C563580M8m> LJI;
    public final List<SocMediaResource> LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final boolean LJIIJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0LJ2)) {
            return false;
        }
        C0LJ2 c0lj2 = (C0LJ2) obj;
        return Intrinsics.LJFF(this.LIZ, c0lj2.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0lj2.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0lj2.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0lj2.LIZLLL) && this.LJ == c0lj2.LJ && this.LJFF == c0lj2.LJFF && Intrinsics.LJFF(this.LJI, c0lj2.LJI) && Intrinsics.LJFF(this.LJII, c0lj2.LJII) && this.LJIIIIZZ == c0lj2.LJIIIIZZ && this.LJIIIZ == c0lj2.LJIIIZ && this.LJIIJ == c0lj2.LJIIJ;
    }

    public final int hashCode() {
        return (((((((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31) + C786410Ut5.Z2(this.LJIIIIZZ)) * 31) + C786410Ut5.Z2(this.LJIIIZ)) * 31) + C786410Ut5.Z2(this.LJIIJ);
    }

    public final String toString() {
        return "WarmedFirstScreenSnapshot(photoList=" + this.LIZ + ", videoList=" + this.LIZIZ + ", imageState=" + this.LIZJ + ", videoState=" + this.LIZLLL + ", supportGif=" + this.LJ + ", supportLivePhoto=" + this.LJFF + ", mediaBuckets=" + this.LJI + ", allMediaList=" + this.LJII + ", isFinished=" + this.LJIIIIZZ + ", imageFreshFromDisk=" + this.LJIIIZ + ", videoFreshFromDisk=" + this.LJIIJ + ')';
    }

    public C0LJ2(List<SocMediaResource> list, List<SocMediaResource> list2, C0L20 c0l20, C0L20 c0l202, boolean z, boolean z2, List<C563580M8m> list3, List<SocMediaResource> list4, boolean z3, boolean z4, boolean z5) {
        this.LIZ = list;
        this.LIZIZ = list2;
        this.LIZJ = c0l20;
        this.LIZLLL = c0l202;
        this.LJ = z;
        this.LJFF = z2;
        this.LJI = list3;
        this.LJII = list4;
        this.LJIIIIZZ = z3;
        this.LJIIIZ = z4;
        this.LJIIJ = z5;
    }
}
