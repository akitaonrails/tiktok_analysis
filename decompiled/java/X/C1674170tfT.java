package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.compliance.api.model.Donor;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tfT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1674170tfT {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final List<Donor> LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final boolean LJIIIIZZ;
    public final String LJIIIZ;
    public final boolean LJIIJ;
    public final long LJIIJJI;
    public final String LJIIL;
    public final long LJIILIIL;
    public final String LJIILJJIL;
    public final int LJIILL;
    public final boolean LJIILLIIL;
    public final boolean LJIIZILJ;
    public final boolean LJIJ;
    public final boolean LJIJI;
    public final boolean LJIJJ;
    public final boolean LJIJJLI;
    public final boolean LJIL;
    public final boolean LJJ;
    public final boolean LJJI;
    public final boolean LJJIFFI;
    public final boolean LJJII;
    public final int LJJIII;
    public final boolean LJJIIJ;
    public final boolean LJJIIJZLJL;

    public C1674170tfT() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1674170tfT)) {
            return false;
        }
        C1674170tfT c1674170tfT = (C1674170tfT) obj;
        return Intrinsics.LJFF(this.LIZ, c1674170tfT.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1674170tfT.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1674170tfT.LIZJ) && this.LIZLLL == c1674170tfT.LIZLLL && Intrinsics.LJFF(this.LJ, c1674170tfT.LJ) && Intrinsics.LJFF(this.LJFF, c1674170tfT.LJFF) && Intrinsics.LJFF(this.LJI, c1674170tfT.LJI) && Intrinsics.LJFF(this.LJII, c1674170tfT.LJII) && this.LJIIIIZZ == c1674170tfT.LJIIIIZZ && Intrinsics.LJFF(this.LJIIIZ, c1674170tfT.LJIIIZ) && this.LJIIJ == c1674170tfT.LJIIJ && this.LJIIJJI == c1674170tfT.LJIIJJI && Intrinsics.LJFF(this.LJIIL, c1674170tfT.LJIIL) && this.LJIILIIL == c1674170tfT.LJIILIIL && Intrinsics.LJFF(this.LJIILJJIL, c1674170tfT.LJIILJJIL) && this.LJIILL == c1674170tfT.LJIILL && this.LJIILLIIL == c1674170tfT.LJIILLIIL && this.LJIIZILJ == c1674170tfT.LJIIZILJ && this.LJIJ == c1674170tfT.LJIJ && this.LJIJI == c1674170tfT.LJIJI && this.LJIJJ == c1674170tfT.LJIJJ && this.LJIJJLI == c1674170tfT.LJIJJLI && this.LJIL == c1674170tfT.LJIL && this.LJJ == c1674170tfT.LJJ && this.LJJI == c1674170tfT.LJJI && this.LJJIFFI == c1674170tfT.LJJIFFI && this.LJJII == c1674170tfT.LJJII && this.LJJIII == c1674170tfT.LJJIII && this.LJJIIJ == c1674170tfT.LJJIIJ && this.LJJIIJZLJL == c1674170tfT.LJJIIJZLJL;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL) * 31) + this.LJ.hashCode()) * 31;
        String str = this.LJFF;
        int iHashCode2 = (((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31) + C786410Ut5.Z2(this.LJIIIIZZ)) * 31) + this.LJIIIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LJIIJ)) * 31) + C786410Ut5.Y2(this.LJIIJJI)) * 31;
        String str2 = this.LJIIL;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + C786410Ut5.Y2(this.LJIILIIL)) * 31;
        String str3 = this.LJIILJJIL;
        return ((((((((((((((((((((((((((((((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.LJIILL) * 31) + C786410Ut5.Z2(this.LJIILLIIL)) * 31) + C786410Ut5.Z2(this.LJIIZILJ)) * 31) + C786410Ut5.Z2(this.LJIJ)) * 31) + C786410Ut5.Z2(this.LJIJI)) * 31) + C786410Ut5.Z2(this.LJIJJ)) * 31) + C786410Ut5.Z2(this.LJIJJLI)) * 31) + C786410Ut5.Z2(this.LJIL)) * 31) + C786410Ut5.Z2(this.LJJ)) * 31) + C786410Ut5.Z2(this.LJJI)) * 31) + C786410Ut5.Z2(this.LJJIFFI)) * 31) + C786410Ut5.Z2(this.LJJII)) * 31) + this.LJJIII) * 31) + C786410Ut5.Z2(this.LJJIIJ)) * 31) + C786410Ut5.Z2(this.LJJIIJZLJL);
    }

    public final String toString() {
        return "FundraiserPageViewState(title=" + this.LIZ + ", creatorName=" + this.LIZIZ + ", creatorProfileImageUrl=" + this.LIZJ + ", donorCount=" + this.LIZLLL + ", donors=" + this.LJ + ", description=" + this.LJFF + ", organizationName=" + this.LJI + ", organizationIconUrl=" + this.LJII + ", organizationVerified=" + this.LJIIIIZZ + ", organizationUid=" + this.LJIIIZ + ", showOrganizationName=" + this.LJIIJ + ", goalAmount=" + this.LJIIJJI + ", goalAmountWithUnit=" + this.LJIIL + ", progress=" + this.LJIILIIL + ", raisedAmountWithUnit=" + this.LJIILJJIL + ", donationCount=" + this.LJIILL + ", showFooter=" + this.LJIILLIIL + ", shouldShowEditButton=" + this.LJIIZILJ + ", isDonateLoading=" + this.LJIJ + ", isLoading=" + this.LJIJI + ", useRedColor=" + this.LJIJJ + ", showAvatarStackAboveTitle=" + this.LJIJJLI + ", shouldCenterUi=" + this.LJIL + ", showRaisedAmount=" + this.LJJ + ", showOffsiteDonationTooltip=" + this.LJJI + ", hasError=" + this.LJJIFFI + ", canDonate=" + this.LJJII + ", disableReason=" + this.LJJIII + ", showDonateDisableToast=" + this.LJJIIJ + ", shouldShowEmptyState=" + this.LJJIIJZLJL + ')';
    }

    public C1674170tfT(int i) {
        this("", "", "", 0, C13BV.INSTANCE, null, "", "", false, "", true, 0L, null, 0L, null, 0, false, false, false, true, true, false, false, true, false, false, true, 0, false, true);
    }

    public static C1674170tfT LIZ(C1674170tfT c1674170tfT, String str, String str2, String str3, int i, List list, String str4, String str5, String str6, boolean z, String str7, boolean z2, long j, String str8, long j2, String str9, int i2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, int i3, int i4) {
        boolean z13;
        boolean z14;
        boolean z15;
        int i5 = i3;
        boolean z16 = z11;
        boolean z17 = z10;
        String str10 = str7;
        boolean z18 = z8;
        boolean z19 = z6;
        String str11 = str4;
        boolean z20 = z5;
        boolean z21 = z3;
        long j3 = j;
        boolean z22 = z2;
        String str12 = str2;
        int i6 = i2;
        boolean z23 = z7;
        boolean z24 = z;
        String str13 = str6;
        long j4 = j2;
        String str14 = str5;
        String str15 = str8;
        boolean z25 = z4;
        List list2 = list;
        boolean z26 = z9;
        int i7 = i;
        String str16 = str3;
        String str17 = str9;
        boolean z27 = z12;
        String str18 = str;
        if ((i4 & 1) != 0) {
            str18 = c1674170tfT.LIZ;
        }
        if ((i4 & 2) != 0) {
            str12 = c1674170tfT.LIZIZ;
        }
        if ((i4 & 4) != 0) {
            str16 = c1674170tfT.LIZJ;
        }
        if ((i4 & 8) != 0) {
            i7 = c1674170tfT.LIZLLL;
        }
        if ((i4 & 16) != 0) {
            list2 = c1674170tfT.LJ;
        }
        if ((i4 & 32) != 0) {
            str11 = c1674170tfT.LJFF;
        }
        if ((i4 & 64) != 0) {
            str14 = c1674170tfT.LJI;
        }
        if ((i4 & 128) != 0) {
            str13 = c1674170tfT.LJII;
        }
        if ((i4 & 256) != 0) {
            z24 = c1674170tfT.LJIIIIZZ;
        }
        if ((i4 & 512) != 0) {
            str10 = c1674170tfT.LJIIIZ;
        }
        if ((i4 & 1024) != 0) {
            z22 = c1674170tfT.LJIIJ;
        }
        if ((i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            j3 = c1674170tfT.LJIIJJI;
        }
        if ((i4 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str15 = c1674170tfT.LJIIL;
        }
        if ((i4 & 8192) != 0) {
            j4 = c1674170tfT.LJIILIIL;
        }
        if ((i4 & 16384) != 0) {
            str17 = c1674170tfT.LJIILJJIL;
        }
        if ((32768 & i4) != 0) {
            i6 = c1674170tfT.LJIILL;
        }
        if ((65536 & i4) != 0) {
            z21 = c1674170tfT.LJIILLIIL;
        }
        if ((131072 & i4) != 0) {
            z25 = c1674170tfT.LJIIZILJ;
        }
        if ((262144 & i4) != 0) {
            z20 = c1674170tfT.LJIJ;
        }
        if ((524288 & i4) != 0) {
            z19 = c1674170tfT.LJIJI;
        }
        if ((1048576 & i4) != 0) {
            z23 = c1674170tfT.LJIJJ;
        }
        if ((2097152 & i4) != 0) {
            z18 = c1674170tfT.LJIJJLI;
        }
        if ((4194304 & i4) != 0) {
            z26 = c1674170tfT.LJIL;
        }
        if ((8388608 & i4) != 0) {
            z13 = c1674170tfT.LJJ;
        } else {
            z13 = false;
        }
        if ((16777216 & i4) != 0) {
            z17 = c1674170tfT.LJJI;
        }
        if ((33554432 & i4) != 0) {
            z16 = c1674170tfT.LJJIFFI;
        }
        if ((67108864 & i4) != 0) {
            z27 = c1674170tfT.LJJII;
        }
        if ((134217728 & i4) != 0) {
            i5 = c1674170tfT.LJJIII;
        }
        if ((268435456 & i4) != 0) {
            z14 = c1674170tfT.LJJIIJ;
        } else {
            z14 = false;
        }
        if ((i4 & 536870912) != 0) {
            z15 = c1674170tfT.LJJIIJZLJL;
        } else {
            z15 = false;
        }
        c1674170tfT.getClass();
        return new C1674170tfT(str18, str12, str16, i7, list2, str11, str14, str13, z24, str10, z22, j3, str15, j4, str17, i6, z21, z25, z20, z19, z23, z18, z26, z13, z17, z16, z27, i5, z14, z15);
    }

    public C1674170tfT(String str, String str2, String str3, int i, List<Donor> list, String str4, String str5, String str6, boolean z, String str7, boolean z2, long j, String str8, long j2, String str9, int i2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, int i3, boolean z14, boolean z15) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = i;
        this.LJ = list;
        this.LJFF = str4;
        this.LJI = str5;
        this.LJII = str6;
        this.LJIIIIZZ = z;
        this.LJIIIZ = str7;
        this.LJIIJ = z2;
        this.LJIIJJI = j;
        this.LJIIL = str8;
        this.LJIILIIL = j2;
        this.LJIILJJIL = str9;
        this.LJIILL = i2;
        this.LJIILLIIL = z3;
        this.LJIIZILJ = z4;
        this.LJIJ = z5;
        this.LJIJI = z6;
        this.LJIJJ = z7;
        this.LJIJJLI = z8;
        this.LJIL = z9;
        this.LJJ = z10;
        this.LJJI = z11;
        this.LJJIFFI = z12;
        this.LJJII = z13;
        this.LJJIII = i3;
        this.LJJIIJ = z14;
        this.LJJIIJZLJL = z15;
    }
}
