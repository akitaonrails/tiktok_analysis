package X;

import com.bytedance.android.live.base.model.ImageModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fxk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1147340fxk {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final long LJ;
    public final long LJFF;
    public final long LJI;
    public final long LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final ImageModel LJIIJ;
    public final ImageModel LJIIJJI;
    public final ImageModel LJIIL;
    public final boolean LJIILIIL;
    public final long LJIILJJIL;
    public final long LJIILL;
    public final long LJIILLIIL;
    public final long LJIIZILJ;
    public final long LJIJ;
    public final boolean LJIJI;
    public final boolean LJIJJ;
    public final String LJIJJLI;
    public final boolean LJIL;
    public final String LJJ;
    public final boolean LJJI;
    public final InterfaceC1664360tPe<C1147620fyC> LJJIFFI;
    public final InterfaceC1664360tPe<C1147630fyD> LJJII;
    public final InterfaceC1664360tPe<C1147640fyE> LJJIII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1147340fxk)) {
            return false;
        }
        C1147340fxk c1147340fxk = (C1147340fxk) obj;
        return Intrinsics.LJFF(this.LIZ, c1147340fxk.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1147340fxk.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1147340fxk.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1147340fxk.LIZLLL) && this.LJ == c1147340fxk.LJ && this.LJFF == c1147340fxk.LJFF && this.LJI == c1147340fxk.LJI && this.LJII == c1147340fxk.LJII && this.LJIIIIZZ == c1147340fxk.LJIIIIZZ && this.LJIIIZ == c1147340fxk.LJIIIZ && Intrinsics.LJFF(this.LJIIJ, c1147340fxk.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c1147340fxk.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c1147340fxk.LJIIL) && this.LJIILIIL == c1147340fxk.LJIILIIL && this.LJIILJJIL == c1147340fxk.LJIILJJIL && this.LJIILL == c1147340fxk.LJIILL && this.LJIILLIIL == c1147340fxk.LJIILLIIL && this.LJIIZILJ == c1147340fxk.LJIIZILJ && this.LJIJ == c1147340fxk.LJIJ && this.LJIJI == c1147340fxk.LJIJI && this.LJIJJ == c1147340fxk.LJIJJ && Intrinsics.LJFF(this.LJIJJLI, c1147340fxk.LJIJJLI) && this.LJIL == c1147340fxk.LJIL && Intrinsics.LJFF(this.LJJ, c1147340fxk.LJJ) && this.LJJI == c1147340fxk.LJJI && Intrinsics.LJFF(this.LJJIFFI, c1147340fxk.LJJIFFI) && Intrinsics.LJFF(this.LJJII, c1147340fxk.LJJII) && Intrinsics.LJFF(this.LJJIII, c1147340fxk.LJJIII);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + C786410Ut5.Y2(this.LJ)) * 31) + C786410Ut5.Y2(this.LJFF)) * 31) + C786410Ut5.Y2(this.LJI)) * 31) + C786410Ut5.Y2(this.LJII)) * 31) + C786410Ut5.Z2(this.LJIIIIZZ)) * 31) + C786410Ut5.Z2(this.LJIIIZ)) * 31;
        ImageModel imageModel = this.LJIIJ;
        int iHashCode2 = (iHashCode + (imageModel == null ? 0 : imageModel.hashCode())) * 31;
        ImageModel imageModel2 = this.LJIIJJI;
        int iHashCode3 = (iHashCode2 + (imageModel2 == null ? 0 : imageModel2.hashCode())) * 31;
        ImageModel imageModel3 = this.LJIIL;
        int iHashCode4 = (((((((((((((((((iHashCode3 + (imageModel3 == null ? 0 : imageModel3.hashCode())) * 31) + C786410Ut5.Z2(this.LJIILIIL)) * 31) + C786410Ut5.Y2(this.LJIILJJIL)) * 31) + C786410Ut5.Y2(this.LJIILL)) * 31) + C786410Ut5.Y2(this.LJIILLIIL)) * 31) + C786410Ut5.Y2(this.LJIIZILJ)) * 31) + C786410Ut5.Y2(this.LJIJ)) * 31) + C786410Ut5.Z2(this.LJIJI)) * 31) + C786410Ut5.Z2(this.LJIJJ)) * 31;
        String str = this.LJIJJLI;
        int iHashCode5 = (((iHashCode4 + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LJIL)) * 31;
        String str2 = this.LJJ;
        return ((((((((iHashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJJI)) * 31) + this.LJJIFFI.hashCode()) * 31) + this.LJJII.hashCode()) * 31) + this.LJJIII.hashCode();
    }

    public final String toString() {
        return "MusicGiftDetailUiState(moodTitle=" + this.LIZ + ", lyricHeadline=" + this.LIZIZ + ", lyricSubline=" + this.LIZJ + ", artistName=" + this.LIZLLL + ", artistUserId=" + this.LJ + ", selectedMoodId=" + this.LJFF + ", selectedTabId=" + this.LJI + ", selectedItemId=" + this.LJII + ", isPlaying=" + this.LJIIIIZZ + ", shouldShowPause=" + this.LJIIIZ + ", headerArtistAvatar=" + this.LJIIJ + ", headerOuterDisc=" + this.LJIIJJI + ", headerCoverImage=" + this.LJIIL + ", headerIsPinned=" + this.LJIILIIL + ", sendButtonCoinCount=" + this.LJIILJJIL + ", heroStartColor=" + this.LJIILL + ", heroEndColor=" + this.LJIILLIIL + ", sendButtonColor=" + this.LJIIZILJ + ", listSelectedColor=" + this.LJIJ + ", isPageLoading=" + this.LJIJI + ", isPageEmpty=" + this.LJIJJ + ", pageErrorMessage=" + this.LJIJJLI + ", isLoadingMore=" + this.LJIL + ", loadMoreErrorMessage=" + this.LJJ + ", hasMore=" + this.LJJI + ", moods=" + this.LJJIFFI + ", tabs=" + this.LJJII + ", items=" + this.LJJIII + ')';
    }

    public C1147340fxk(String str, String str2, String str3, String str4, long j, long j2, long j3, long j4, boolean z, boolean z2, ImageModel imageModel, ImageModel imageModel2, ImageModel imageModel3, boolean z3, long j5, long j6, long j7, long j8, long j9, boolean z4, boolean z5, String str5, boolean z6, String str6, boolean z7, InterfaceC1664360tPe<C1147620fyC> interfaceC1664360tPe, InterfaceC1664360tPe<C1147630fyD> interfaceC1664360tPe2, InterfaceC1664360tPe<C1147640fyE> interfaceC1664360tPe3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = j;
        this.LJFF = j2;
        this.LJI = j3;
        this.LJII = j4;
        this.LJIIIIZZ = z;
        this.LJIIIZ = z2;
        this.LJIIJ = imageModel;
        this.LJIIJJI = imageModel2;
        this.LJIIL = imageModel3;
        this.LJIILIIL = z3;
        this.LJIILJJIL = j5;
        this.LJIILL = j6;
        this.LJIILLIIL = j7;
        this.LJIIZILJ = j8;
        this.LJIJ = j9;
        this.LJIJI = z4;
        this.LJIJJ = z5;
        this.LJIJJLI = str5;
        this.LJIL = z6;
        this.LJJ = str6;
        this.LJJI = z7;
        this.LJJIFFI = interfaceC1664360tPe;
        this.LJJII = interfaceC1664360tPe2;
        this.LJJIII = interfaceC1664360tPe3;
    }
}
