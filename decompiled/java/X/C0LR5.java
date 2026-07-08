package X;

import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LR5, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LR5 {
    public final String LIZ;
    public final List<String> LIZIZ;
    public final Float LIZJ;
    public final Float LIZLLL;
    public final Integer LJ;
    public final Integer LJFF;
    public final Long LJI;
    public final int LJII;
    public final List<Integer> LJIIIIZZ;
    public final float LJIIIZ;
    public final int LJIIJ;
    public final Long LJIIJJI;

    public C0LR5() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0LR5)) {
            return false;
        }
        C0LR5 c0lr5 = (C0LR5) obj;
        return Intrinsics.LJFF(this.LIZ, c0lr5.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0lr5.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0lr5.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0lr5.LIZLLL) && Intrinsics.LJFF(this.LJ, c0lr5.LJ) && Intrinsics.LJFF(this.LJFF, c0lr5.LJFF) && Intrinsics.LJFF(this.LJI, c0lr5.LJI) && this.LJII == c0lr5.LJII && Intrinsics.LJFF(this.LJIIIIZZ, c0lr5.LJIIIIZZ) && Float.compare(this.LJIIIZ, c0lr5.LJIIIZ) == 0 && this.LJIIJ == c0lr5.LJIIJ && Intrinsics.LJFF(this.LJIIJJI, c0lr5.LJIIJJI);
    }

    public final String toString() {
        return "PreprocessConfig(targetDir=" + this.LIZ + ", formatWhitelist=" + this.LIZIZ + ", aspectRatioMin=" + this.LIZJ + ", aspectRatioMax=" + this.LIZLLL + ", minEdgePx=" + this.LJ + ", maxEdgePx=" + this.LJFF + ", maxFileSizeBytes=" + this.LJI + ", imageQuality=" + this.LJII + ", imageQualityFallbackSteps=" + this.LJIIIIZZ + ", downsampleRatioOnOverflow=" + this.LJIIIZ + ", maxIterations=" + this.LJIIJ + ", timeoutMs=" + this.LJIIJJI + ')';
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        List<String> list = this.LIZIZ;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Float f = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Integer num = this.LJ;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LJFF;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.LJI;
        int iHashCode7 = (((((((((iHashCode6 + (l == null ? 0 : l.hashCode())) * 31) + this.LJII) * 31) + this.LJIIIIZZ.hashCode()) * 31) + Float.floatToIntBits(this.LJIIIZ)) * 31) + this.LJIIJ) * 31;
        Long l2 = this.LJIIJJI;
        return iHashCode7 + (l2 != null ? l2.hashCode() : 0);
    }

    public C0LR5(String str, List list, Float f, Float f2, Integer num, Integer num2, Long l, int i, List list2, float f3, int i2) {
        Long lValueOf = Long.valueOf(Mp4ScreenVideoLoadTimeout.CONTROL);
        this.LIZ = str;
        this.LIZIZ = list;
        this.LIZJ = f;
        this.LIZLLL = f2;
        this.LJ = num;
        this.LJFF = num2;
        this.LJI = l;
        this.LJII = i;
        this.LJIIIIZZ = list2;
        this.LJIIIZ = f3;
        this.LJIIJ = i2;
        this.LJIIJJI = lValueOf;
    }
}
