package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0E7P, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E7P {
    public final C350050Dnv LIZ;
    public final C350070Dnx LIZIZ;
    public final List<C350030Dnt> LIZJ;
    public final List<C350030Dnt> LIZLLL;
    public final List<C350030Dnt> LJ;
    public final List<C350030Dnt> LJFF;
    public final List<C350030Dnt> LJI;
    public final List<C350030Dnt> LJII;
    public final List<C350030Dnt> LJIIIIZZ;
    public final List<C350030Dnt> LJIIIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0E7P)) {
            return false;
        }
        C0E7P c0e7p = (C0E7P) obj;
        return Intrinsics.LJFF(this.LIZ, c0e7p.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0e7p.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0e7p.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0e7p.LIZLLL) && Intrinsics.LJFF(this.LJ, c0e7p.LJ) && Intrinsics.LJFF(this.LJFF, c0e7p.LJFF) && Intrinsics.LJFF(this.LJI, c0e7p.LJI) && Intrinsics.LJFF(this.LJII, c0e7p.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c0e7p.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c0e7p.LJIIIZ);
    }

    public final int hashCode() {
        return (((((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ.hashCode()) * 31) + this.LJIIIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubTrackData(diffResult=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", dropTrackState=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", subVideoTrackList=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", infoOrImageStickerTrackList=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", filterTrackList=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", adjustTrackList=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", audioTrackList=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", textStickerTrackList=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", videoEffectList=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", lyricTrackList=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0E7P(C350050Dnv c350050Dnv, C350070Dnx c350070Dnx, List<C350030Dnt> list, List<C350030Dnt> list2, List<C350030Dnt> list3, List<C350030Dnt> list4, List<C350030Dnt> list5, List<C350030Dnt> list6, List<C350030Dnt> list7, List<C350030Dnt> list8) {
        this.LIZ = c350050Dnv;
        this.LIZIZ = c350070Dnx;
        this.LIZJ = list;
        this.LIZLLL = list2;
        this.LJ = list3;
        this.LJFF = list4;
        this.LJI = list5;
        this.LJII = list6;
        this.LJIIIIZZ = list7;
        this.LJIIIZ = list8;
    }
}
