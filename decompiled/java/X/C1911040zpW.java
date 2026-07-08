package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.compliance.api.model.Donor;
import com.ss.android.ugc.aweme.compliance.api.model.FundraiserStruct;
import com.ss.android.ugc.aweme.compliance.api.model.NgoStruct;
import com.ss.android.ugc.aweme.compliance.api.model.UserStruct;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zpW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1911040zpW {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final int LJ;
    public final String LJFF;
    public final EnumC1911020zpU LJI;
    public final FundraiserStruct LJII;
    public final UserStruct LJIIIIZZ;
    public final NgoStruct LJIIIZ;
    public final boolean LJIIJ;
    public final boolean LJIIJJI;
    public final List<Donor> LJIIL;
    public final int LJIILIIL;
    public final boolean LJIILJJIL;
    public final int LJIILL;
    public final long LJIILLIIL;
    public final String LJIIZILJ;
    public final String LJIJ;
    public final int LJIJI;
    public final Integer LJIJJ;
    public final Integer LJIJJLI;
    public final boolean LJIL;
    public final int LJJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1911040zpW)) {
            return false;
        }
        C1911040zpW c1911040zpW = (C1911040zpW) obj;
        return Intrinsics.LJFF(this.LIZ, c1911040zpW.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1911040zpW.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1911040zpW.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1911040zpW.LIZLLL) && this.LJ == c1911040zpW.LJ && Intrinsics.LJFF(this.LJFF, c1911040zpW.LJFF) && this.LJI == c1911040zpW.LJI && Intrinsics.LJFF(this.LJII, c1911040zpW.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c1911040zpW.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c1911040zpW.LJIIIZ) && this.LJIIJ == c1911040zpW.LJIIJ && this.LJIIJJI == c1911040zpW.LJIIJJI && Intrinsics.LJFF(this.LJIIL, c1911040zpW.LJIIL) && this.LJIILIIL == c1911040zpW.LJIILIIL && this.LJIILJJIL == c1911040zpW.LJIILJJIL && this.LJIILL == c1911040zpW.LJIILL && this.LJIILLIIL == c1911040zpW.LJIILLIIL && Intrinsics.LJFF(this.LJIIZILJ, c1911040zpW.LJIIZILJ) && Intrinsics.LJFF(this.LJIJ, c1911040zpW.LJIJ) && this.LJIJI == c1911040zpW.LJIJI && Intrinsics.LJFF(this.LJIJJ, c1911040zpW.LJIJJ) && Intrinsics.LJFF(this.LJIJJLI, c1911040zpW.LJIJJLI) && this.LJIL == c1911040zpW.LJIL && this.LJJ == c1911040zpW.LJJ;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31;
        FundraiserStruct fundraiserStruct = this.LJII;
        int iHashCode2 = (iHashCode + (fundraiserStruct == null ? 0 : fundraiserStruct.hashCode())) * 31;
        UserStruct userStruct = this.LJIIIIZZ;
        int iHashCode3 = (iHashCode2 + (userStruct == null ? 0 : userStruct.hashCode())) * 31;
        NgoStruct ngoStruct = this.LJIIIZ;
        int iHashCode4 = (((((((((((((((iHashCode3 + (ngoStruct == null ? 0 : ngoStruct.hashCode())) * 31) + C786410Ut5.Z2(this.LJIIJ)) * 31) + C786410Ut5.Z2(this.LJIIJJI)) * 31) + this.LJIIL.hashCode()) * 31) + this.LJIILIIL) * 31) + C786410Ut5.Z2(this.LJIILJJIL)) * 31) + this.LJIILL) * 31) + C786410Ut5.Y2(this.LJIILLIIL)) * 31;
        String str = this.LJIIZILJ;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJIJ;
        int iHashCode6 = (((iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.LJIJI) * 31;
        Integer num = this.LJIJJ;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LJIJJLI;
        return ((((iHashCode7 + (num2 != null ? num2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJIL)) * 31) + this.LJJ;
    }

    public final String toString() {
        return "FundraiserContainerViewState(organizationId=" + this.LIZ + ", fundraiserId=" + this.LIZIZ + ", enterFrom=" + this.LIZJ + ", enterMethod=" + this.LIZLLL + ", itemType=" + this.LJ + ", itemId=" + this.LJFF + ", currentPage=" + this.LJI + ", fundraiser=" + this.LJII + ", fundraiserCreator=" + this.LJIIIIZZ + ", organization=" + this.LJIIIZ + ", isLoading=" + this.LJIIJ + ", hasError=" + this.LJIIJJI + ", donors=" + this.LJIIL + ", cursor=" + this.LJIILIIL + ", hasMore=" + this.LJIILJJIL + ", sheetHeight=" + this.LJIILL + ", progress=" + this.LJIILLIIL + ", raisedAmountWithUnit=" + this.LJIIZILJ + ", goalAmountWithUnit=" + this.LJIJ + ", donationCount=" + this.LJIJI + ", donationOptimize=" + this.LJIJJ + ", isAnchor=" + this.LJIJJLI + ", canDonate=" + this.LJIL + ", disableReason=" + this.LJJ + ')';
    }

    public static C1911040zpW LIZ(C1911040zpW c1911040zpW, String str, String str2, EnumC1911020zpU enumC1911020zpU, FundraiserStruct fundraiserStruct, UserStruct userStruct, NgoStruct ngoStruct, boolean z, boolean z2, List list, int i, boolean z3, int i2, long j, String str3, String str4, int i3, boolean z4, int i4, int i5) {
        String str5;
        String str6;
        int i6;
        String str7;
        Integer num;
        Integer num2;
        int i7 = i4;
        boolean z5 = z4;
        String str8 = str4;
        String str9 = str3;
        long j2 = j;
        int i8 = i3;
        boolean z6 = z3;
        int i9 = i;
        boolean z7 = z;
        NgoStruct ngoStruct2 = ngoStruct;
        UserStruct userStruct2 = userStruct;
        FundraiserStruct fundraiserStruct2 = fundraiserStruct;
        EnumC1911020zpU enumC1911020zpU2 = enumC1911020zpU;
        List list2 = list;
        String str10 = str2;
        boolean z8 = z2;
        int i10 = i2;
        String str11 = str;
        if ((i5 & 1) != 0) {
            str11 = c1911040zpW.LIZ;
        }
        if ((i5 & 2) != 0) {
            str10 = c1911040zpW.LIZIZ;
        }
        if ((i5 & 4) != 0) {
            str5 = c1911040zpW.LIZJ;
        } else {
            str5 = null;
        }
        if ((i5 & 8) != 0) {
            str6 = c1911040zpW.LIZLLL;
        } else {
            str6 = null;
        }
        if ((i5 & 16) != 0) {
            i6 = c1911040zpW.LJ;
        } else {
            i6 = 0;
        }
        if ((i5 & 32) != 0) {
            str7 = c1911040zpW.LJFF;
        } else {
            str7 = null;
        }
        if ((i5 & 64) != 0) {
            enumC1911020zpU2 = c1911040zpW.LJI;
        }
        if ((i5 & 128) != 0) {
            fundraiserStruct2 = c1911040zpW.LJII;
        }
        if ((i5 & 256) != 0) {
            userStruct2 = c1911040zpW.LJIIIIZZ;
        }
        if ((i5 & 512) != 0) {
            ngoStruct2 = c1911040zpW.LJIIIZ;
        }
        if ((i5 & 1024) != 0) {
            z7 = c1911040zpW.LJIIJ;
        }
        if ((i5 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            z8 = c1911040zpW.LJIIJJI;
        }
        if ((i5 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            list2 = c1911040zpW.LJIIL;
        }
        if ((i5 & 8192) != 0) {
            i9 = c1911040zpW.LJIILIIL;
        }
        if ((i5 & 16384) != 0) {
            z6 = c1911040zpW.LJIILJJIL;
        }
        if ((32768 & i5) != 0) {
            i10 = c1911040zpW.LJIILL;
        }
        if ((65536 & i5) != 0) {
            j2 = c1911040zpW.LJIILLIIL;
        }
        if ((131072 & i5) != 0) {
            str9 = c1911040zpW.LJIIZILJ;
        }
        if ((262144 & i5) != 0) {
            str8 = c1911040zpW.LJIJ;
        }
        if ((524288 & i5) != 0) {
            i8 = c1911040zpW.LJIJI;
        }
        if ((1048576 & i5) != 0) {
            num = c1911040zpW.LJIJJ;
        } else {
            num = null;
        }
        if ((2097152 & i5) != 0) {
            num2 = c1911040zpW.LJIJJLI;
        } else {
            num2 = null;
        }
        if ((4194304 & i5) != 0) {
            z5 = c1911040zpW.LJIL;
        }
        if ((i5 & 8388608) != 0) {
            i7 = c1911040zpW.LJJ;
        }
        boolean z9 = z6;
        return new C1911040zpW(str11, str10, str5, str6, i6, str7, enumC1911020zpU2, fundraiserStruct2, userStruct2, ngoStruct2, z7, z8, list2, i9, z9, i10, j2, str9, str8, i8, num, num2, z5, i7);
    }

    public C1911040zpW(String str, String str2, String str3, String str4, int i, String str5, EnumC1911020zpU enumC1911020zpU, FundraiserStruct fundraiserStruct, UserStruct userStruct, NgoStruct ngoStruct, boolean z, boolean z2, List<Donor> list, int i2, boolean z3, int i3, long j, String str6, String str7, int i4, Integer num, Integer num2, boolean z4, int i5) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = i;
        this.LJFF = str5;
        this.LJI = enumC1911020zpU;
        this.LJII = fundraiserStruct;
        this.LJIIIIZZ = userStruct;
        this.LJIIIZ = ngoStruct;
        this.LJIIJ = z;
        this.LJIIJJI = z2;
        this.LJIIL = list;
        this.LJIILIIL = i2;
        this.LJIILJJIL = z3;
        this.LJIILL = i3;
        this.LJIILLIIL = j;
        this.LJIIZILJ = str6;
        this.LJIJ = str7;
        this.LJIJI = i4;
        this.LJIJJ = num;
        this.LJIJJLI = num2;
        this.LJIL = z4;
        this.LJJ = i5;
    }
}
