package X;

import com.ss.android.ugc.aweme.creative.model.common.InputBlock;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1ANT, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1ANT {
    public final EnumC2178381ANg LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final List<String> LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final int LJI;
    public final int LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;
    public final C0LN8 LJIIL;
    public final boolean LJIILIIL;
    public final boolean LJIILJJIL;
    public final List<InputBlock> LJIILL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1ANT)) {
            return false;
        }
        C1ANT c1ant = (C1ANT) obj;
        return this.LIZ == c1ant.LIZ && Intrinsics.LJFF(this.LIZIZ, c1ant.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1ant.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1ant.LIZLLL) && Intrinsics.LJFF(this.LJ, c1ant.LJ) && Intrinsics.LJFF(this.LJFF, c1ant.LJFF) && this.LJI == c1ant.LJI && this.LJII == c1ant.LJII && Intrinsics.LJFF(this.LJIIIIZZ, c1ant.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c1ant.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c1ant.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c1ant.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c1ant.LJIIL) && this.LJIILIIL == c1ant.LJIILIIL && this.LJIILJJIL == c1ant.LJIILJJIL && Intrinsics.LJFF(this.LJIILL, c1ant.LJIILL);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI) * 31) + this.LJII) * 31) + this.LJIIIIZZ.hashCode()) * 31;
        String str = this.LJIIIZ;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LJIIJ.hashCode()) * 31) + this.LJIIJJI.hashCode()) * 31;
        C0LN8 c0ln8 = this.LJIIL;
        int iHashCode3 = (((((iHashCode2 + (c0ln8 == null ? 0 : c0ln8.hashCode())) * 31) + C786410Ut5.Z2(this.LJIILIIL)) * 31) + C786410Ut5.Z2(this.LJIILJJIL)) * 31;
        List<InputBlock> list = this.LJIILL;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "CameoPlayerUiState(playerState=" + this.LIZ + ", sourceId=" + this.LIZIZ + ", videoUrl=" + this.LIZJ + ", videoUrls=" + this.LIZLLL + ", videoUri=" + this.LJ + ", videoCoverUrl=" + this.LJFF + ", videoWidth=" + this.LJI + ", videoHeight=" + this.LJII + ", authorName=" + this.LJIIIIZZ + ", authorUid=" + this.LJIIIZ + ", avatarUrl=" + this.LJIIJ + ", description=" + this.LJIIJJI + ", resourceType=" + this.LJIIL + ", avatarVisible=" + this.LJIILIIL + ", authorNameVisible=" + this.LJIILJJIL + ", mentionBlocks=" + this.LJIILL + ')';
    }

    public static C1ANT LIZ(C1ANT c1ant, EnumC2178381ANg enumC2178381ANg) {
        String str = c1ant.LIZIZ;
        String str2 = c1ant.LIZJ;
        List<String> list = c1ant.LIZLLL;
        String str3 = c1ant.LJ;
        String str4 = c1ant.LJFF;
        int i = c1ant.LJI;
        int i2 = c1ant.LJII;
        String str5 = c1ant.LJIIIIZZ;
        String str6 = c1ant.LJIIIZ;
        String str7 = c1ant.LJIIJ;
        String str8 = c1ant.LJIIJJI;
        C0LN8 c0ln8 = c1ant.LJIIL;
        boolean z = c1ant.LJIILIIL;
        boolean z2 = c1ant.LJIILJJIL;
        List<InputBlock> list2 = c1ant.LJIILL;
        c1ant.getClass();
        return new C1ANT(enumC2178381ANg, str, str2, list, str3, str4, i, i2, str5, str6, str7, str8, c0ln8, z, z2, list2);
    }

    public C1ANT(EnumC2178381ANg enumC2178381ANg, String str, String str2, List<String> list, String str3, String str4, int i, int i2, String str5, String str6, String str7, String str8, C0LN8 c0ln8, boolean z, boolean z2, List<InputBlock> list2) {
        this.LIZ = enumC2178381ANg;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = list;
        this.LJ = str3;
        this.LJFF = str4;
        this.LJI = i;
        this.LJII = i2;
        this.LJIIIIZZ = str5;
        this.LJIIIZ = str6;
        this.LJIIJ = str7;
        this.LJIIJJI = str8;
        this.LJIIL = c0ln8;
        this.LJIILIIL = z;
        this.LJIILJJIL = z2;
        this.LJIILL = list2;
    }
}
