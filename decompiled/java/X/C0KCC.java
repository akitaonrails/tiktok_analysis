package X;

import android.net.Uri;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KCC, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KCC {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public final int LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final Integer LJIIIIZZ;
    public final Integer LJIIIZ;
    public final String LJIIJ;
    public Boolean LJIIJJI;
    public final String LJIIL;
    public final String LJIILIIL;
    public final String LJIILJJIL;
    public final String LJIILL;
    public final String LJIILLIIL;
    public final boolean LJIIZILJ;
    public final String LJIJ;
    public final boolean LJIJI;
    public final String LJIJJ;
    public final int LJIJJLI;
    public final String LJIL;
    public final String LJJ;
    public final String LJJI;
    public final String LJJIFFI;
    public final String LJJII;
    public final String LJJIII;
    public final boolean LJJIIJ;
    public final int LJJIIJZLJL;
    public final Uri LJJIIZ;
    public final long LJJIIZI;
    public final long LJJIJ;
    public final boolean LJJIJIIJI;
    public final String LJJIJIIJIL;
    public final String LJJIJIL;

    public C0KCC() {
        this(null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, 0, null, null, null, null, null, null, false, 0, null, 0L, 0L, false, -1, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0KCC)) {
            return false;
        }
        C0KCC c0kcc = (C0KCC) obj;
        return Intrinsics.LJFF(this.LIZ, c0kcc.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0kcc.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0kcc.LIZJ) && this.LIZLLL == c0kcc.LIZLLL && this.LJ == c0kcc.LJ && Intrinsics.LJFF(this.LJFF, c0kcc.LJFF) && Intrinsics.LJFF(this.LJI, c0kcc.LJI) && Intrinsics.LJFF(this.LJII, c0kcc.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c0kcc.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c0kcc.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c0kcc.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c0kcc.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c0kcc.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c0kcc.LJIILIIL) && Intrinsics.LJFF(this.LJIILJJIL, c0kcc.LJIILJJIL) && Intrinsics.LJFF(this.LJIILL, c0kcc.LJIILL) && Intrinsics.LJFF(this.LJIILLIIL, c0kcc.LJIILLIIL) && this.LJIIZILJ == c0kcc.LJIIZILJ && Intrinsics.LJFF(this.LJIJ, c0kcc.LJIJ) && this.LJIJI == c0kcc.LJIJI && Intrinsics.LJFF(this.LJIJJ, c0kcc.LJIJJ) && this.LJIJJLI == c0kcc.LJIJJLI && Intrinsics.LJFF(this.LJIL, c0kcc.LJIL) && Intrinsics.LJFF(this.LJJ, c0kcc.LJJ) && Intrinsics.LJFF(this.LJJI, c0kcc.LJJI) && Intrinsics.LJFF(this.LJJIFFI, c0kcc.LJJIFFI) && Intrinsics.LJFF(this.LJJII, c0kcc.LJJII) && Intrinsics.LJFF(this.LJJIII, c0kcc.LJJIII) && this.LJJIIJ == c0kcc.LJJIIJ && this.LJJIIJZLJL == c0kcc.LJJIIJZLJL && Intrinsics.LJFF(this.LJJIIZ, c0kcc.LJJIIZ) && this.LJJIIZI == c0kcc.LJJIIZI && this.LJJIJ == c0kcc.LJJIJ && this.LJJIJIIJI == c0kcc.LJJIJIIJI && Intrinsics.LJFF(this.LJJIJIIJIL, c0kcc.LJJIJIIJIL) && Intrinsics.LJFF(this.LJJIJIL, c0kcc.LJJIJIL);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + this.LJ) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31;
        Integer num = this.LJIIIIZZ;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LJIIIZ;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.LJIIJ;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.LJIIJJI;
        int iHashCode5 = (((((((((((((((((((((((((((((((((((((iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31) + this.LJIIL.hashCode()) * 31) + this.LJIILIIL.hashCode()) * 31) + this.LJIILJJIL.hashCode()) * 31) + this.LJIILL.hashCode()) * 31) + this.LJIILLIIL.hashCode()) * 31) + C786410Ut5.Z2(this.LJIIZILJ)) * 31) + this.LJIJ.hashCode()) * 31) + C786410Ut5.Z2(this.LJIJI)) * 31) + this.LJIJJ.hashCode()) * 31) + this.LJIJJLI) * 31) + this.LJIL.hashCode()) * 31) + this.LJJ.hashCode()) * 31) + this.LJJI.hashCode()) * 31) + this.LJJIFFI.hashCode()) * 31) + this.LJJII.hashCode()) * 31) + this.LJJIII.hashCode()) * 31) + C786410Ut5.Z2(this.LJJIIJ)) * 31) + this.LJJIIJZLJL) * 31;
        Uri uri = this.LJJIIZ;
        int iHashCode6 = (((((((iHashCode5 + (uri == null ? 0 : uri.hashCode())) * 31) + C786410Ut5.Y2(this.LJJIIZI)) * 31) + C786410Ut5.Y2(this.LJJIJ)) * 31) + C786410Ut5.Z2(this.LJJIJIIJI)) * 31;
        String str2 = this.LJJIJIIJIL;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJJIJIL;
        return iHashCode7 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "PgcPackagePageData(secUid=" + this.LIZ + ", anchorId=" + this.LIZIZ + ", fromId=" + this.LIZJ + ", allowCache=" + this.LIZLLL + ", subScene=" + this.LJ + ", subSource=" + this.LJFF + ", packageId=" + this.LJI + ", showEntrance=" + this.LJII + ", awemeType=" + this.LJIIIIZZ + ", isStory=" + this.LJIIIZ + ", groupId=" + this.LJIIJ + ", isInLiveRoom=" + this.LJIIJJI + ", fromSubEnter=" + this.LJIIL + ", subscribeState=" + this.LJIILIIL + ", privilegeShowType=" + this.LJIILJJIL + ", privilegePageType=" + this.LJIILL + ", roomId=" + this.LJIILLIIL + ", showBack=" + this.LJIIZILJ + ", backPage=" + this.LJIJ + ", isFromNative=" + this.LJIJI + ", backNativeScheme=" + this.LJIJJ + ", openBenefitPage=" + this.LJIJJLI + ", logParam=" + this.LJIL + ", requestExtraParam=" + this.LJJ + ", currentPackageId=" + this.LJJI + ", pageType=" + this.LJJIFFI + ", anchorName=" + this.LJJII + ", privilegeDetailTimeStamp=" + this.LJJIII + ", needRefreshPrecheckOnDialogClose=" + this.LJJIIJ + ", pageLinkId=" + this.LJJIIJZLJL + ", originalSchemaUri=" + this.LJJIIZ + ", liveSubOnlyLiveTier=" + this.LJJIIZI + ", liveSubOnlyLiveMonth=" + this.LJJIJ + ", canUseDefaultPackage=" + this.LJJIJIIJI + ", purchaseSchema=" + this.LJJIJIIJIL + ", creatorId=" + this.LJJIJIL + ')';
    }

    public C0KCC(String str, String str2, String str3, boolean z, int i, String str4, String str5, String str6, Integer num, Integer num2, String str7, Boolean bool, String str8, String str9, String str10, String str11, String str12, boolean z2, String str13, boolean z3, String str14, int i2, String str15, String str16, String str17, String str18, String str19, String str20, boolean z4, int i3, Uri uri, long j, long j2, boolean z5, int i4, int i5) {
        Boolean bool2 = bool;
        String str21 = str7;
        Integer num3 = num2;
        Integer num4 = num;
        String str22 = str6;
        String str23 = str5;
        String str24 = str4;
        int i6 = i;
        boolean z6 = z;
        String str25 = str3;
        String str26 = str2;
        long j3 = j2;
        long j4 = j;
        Uri uri2 = uri;
        int i7 = i3;
        boolean z7 = z4;
        String str27 = str19;
        String str28 = str17;
        String str29 = str15;
        int i8 = i2;
        String str30 = str14;
        boolean z8 = z3;
        String str31 = str13;
        boolean z9 = z2;
        String str32 = str12;
        String str33 = str11;
        String str34 = str10;
        String str35 = str16;
        String str36 = str9;
        boolean z10 = z5;
        String str37 = str8;
        String str38 = (i4 & 1) != 0 ? "" : str;
        str26 = (i4 & 2) != 0 ? "" : str26;
        str25 = (i4 & 4) != 0 ? "" : str25;
        z6 = (i4 & 8) != 0 ? true : z6;
        i6 = (i4 & 16) != 0 ? 0 : i6;
        str24 = (i4 & 32) != 0 ? "unknown" : str24;
        str23 = (i4 & 64) != 0 ? "" : str23;
        str22 = (i4 & 128) != 0 ? "" : str22;
        num4 = (i4 & 256) != 0 ? null : num4;
        num3 = (i4 & 512) != 0 ? null : num3;
        str21 = (i4 & 1024) != 0 ? "" : str21;
        bool2 = (i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : bool2;
        str37 = (i4 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? "" : str37;
        str36 = (i4 & 8192) != 0 ? "" : str36;
        str34 = (i4 & 16384) != 0 ? "" : str34;
        str33 = (32768 & i4) != 0 ? "" : str33;
        str32 = (65536 & i4) != 0 ? "" : str32;
        z9 = (131072 & i4) != 0 ? true : z9;
        str31 = (262144 & i4) != 0 ? "" : str31;
        z8 = (524288 & i4) != 0 ? false : z8;
        str30 = (1048576 & i4) != 0 ? "" : str30;
        i8 = (2097152 & i4) != 0 ? 0 : i8;
        str29 = (4194304 & i4) != 0 ? "" : str29;
        str35 = (8388608 & i4) != 0 ? "" : str35;
        str28 = (16777216 & i4) != 0 ? "" : str28;
        String str39 = (33554432 & i4) == 0 ? str18 : "unknown";
        str27 = (67108864 & i4) != 0 ? "" : str27;
        String str40 = (134217728 & i4) == 0 ? str20 : "";
        z7 = (268435456 & i4) != 0 ? false : z7;
        i7 = (536870912 & i4) != 0 ? LSPassThroughRecordSizeConfig.DEFAULT : i7;
        uri2 = (1073741824 & i4) != 0 ? null : uri2;
        j4 = (i4 & Integer.MIN_VALUE) != 0 ? 0L : j4;
        j3 = (i5 & 1) != 0 ? 0L : j3;
        z10 = (i5 & 2) != 0 ? false : z10;
        this.LIZ = str38;
        this.LIZIZ = str26;
        this.LIZJ = str25;
        this.LIZLLL = z6;
        this.LJ = i6;
        this.LJFF = str24;
        this.LJI = str23;
        this.LJII = str22;
        this.LJIIIIZZ = num4;
        this.LJIIIZ = num3;
        this.LJIIJ = str21;
        this.LJIIJJI = bool2;
        this.LJIIL = str37;
        this.LJIILIIL = str36;
        this.LJIILJJIL = str34;
        this.LJIILL = str33;
        this.LJIILLIIL = str32;
        this.LJIIZILJ = z9;
        this.LJIJ = str31;
        this.LJIJI = z8;
        this.LJIJJ = str30;
        this.LJIJJLI = i8;
        this.LJIL = str29;
        this.LJJ = str35;
        this.LJJI = str28;
        this.LJJIFFI = str39;
        this.LJJII = str27;
        this.LJJIII = str40;
        this.LJJIIJ = z7;
        this.LJJIIJZLJL = i7;
        this.LJJIIZ = uri2;
        this.LJJIIZI = j4;
        this.LJJIJ = j3;
        this.LJJIJIIJI = z10;
        this.LJJIJIIJIL = null;
        this.LJJIJIL = null;
    }
}
