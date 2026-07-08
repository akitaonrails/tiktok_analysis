package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ivV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1261270ivV {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public String LJ;
    public boolean LJFF;
    public String LJI;
    public String LJII;
    public boolean LJIIIIZZ;
    public final int LJIIIZ;
    public String LJIIJ;
    public final String LJIIJJI;
    public final String LJIIL;
    public final String LJIILIIL;
    public final String LJIILJJIL;
    public boolean LJIILL;
    public String LJIILLIIL;
    public final String LJIIZILJ;
    public String LJIJ;
    public String LJIJI;
    public Integer LJIJJ;
    public String LJIJJLI;
    public boolean LJIL;
    public int LJJ;
    public String LJJI;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public C1261270ivV() {
        String str = null;
        this(str, str, str, str, false, str, str, str, 0 == true ? 1 : 0, 33554431);
    }

    public final Map<String, String> LIZJ() {
        String str;
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("enter_from", this.LIZ));
        if (this.LIZLLL.length() > 0) {
            mapLJIIJ.put("previous_page", this.LIZLLL);
        }
        if (this.LIZIZ.length() > 0) {
            mapLJIIJ.put("enter_method", this.LIZIZ);
        }
        if (this.LJ.length() > 0) {
            mapLJIIJ.put("homepage_uid", this.LJ);
        }
        if (this.LJIIJ.length() > 0) {
            mapLJIIJ.put("author_id", this.LJIIJ);
        }
        if (this.LJI.length() > 0) {
            mapLJIIJ.put("previous_position", this.LJI);
        }
        if (this.LJII.length() > 0) {
            mapLJIIJ.put("position", this.LJII);
        }
        if (this.LJIIJJI.length() > 0) {
            mapLJIIJ.put("source_page", this.LJIIJJI);
        }
        if (C123100dR.LIZ(this.LJIIL) && (str = this.LJIIL) != null) {
            mapLJIIJ.put("search_id", str);
        }
        int i = this.LJJ;
        if (i >= 0) {
            mapLJIIJ.put("to_user_id_follower_cnt", String.valueOf(i));
        }
        return mapLJIIJ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1261270ivV)) {
            return false;
        }
        C1261270ivV c1261270ivV = (C1261270ivV) obj;
        return Intrinsics.LJFF(this.LIZ, c1261270ivV.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1261270ivV.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1261270ivV.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1261270ivV.LIZLLL) && Intrinsics.LJFF(this.LJ, c1261270ivV.LJ) && this.LJFF == c1261270ivV.LJFF && Intrinsics.LJFF(this.LJI, c1261270ivV.LJI) && Intrinsics.LJFF(this.LJII, c1261270ivV.LJII) && this.LJIIIIZZ == c1261270ivV.LJIIIIZZ && this.LJIIIZ == c1261270ivV.LJIIIZ && Intrinsics.LJFF(this.LJIIJ, c1261270ivV.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c1261270ivV.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c1261270ivV.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c1261270ivV.LJIILIIL) && Intrinsics.LJFF(this.LJIILJJIL, c1261270ivV.LJIILJJIL) && this.LJIILL == c1261270ivV.LJIILL && Intrinsics.LJFF(this.LJIILLIIL, c1261270ivV.LJIILLIIL) && Intrinsics.LJFF(this.LJIIZILJ, c1261270ivV.LJIIZILJ) && Intrinsics.LJFF(this.LJIJ, c1261270ivV.LJIJ) && Intrinsics.LJFF(this.LJIJI, c1261270ivV.LJIJI) && Intrinsics.LJFF(this.LJIJJ, c1261270ivV.LJIJJ) && Intrinsics.LJFF(this.LJIJJLI, c1261270ivV.LJIJJLI) && this.LJIL == c1261270ivV.LJIL && this.LJJ == c1261270ivV.LJJ && Intrinsics.LJFF(this.LJJI, c1261270ivV.LJJI);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        String str = this.LIZJ;
        int iHashCode2 = (((((((((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31) + C786410Ut5.Z2(this.LJIIIIZZ)) * 31) + this.LJIIIZ) * 31) + this.LJIIJ.hashCode()) * 31) + this.LJIIJJI.hashCode()) * 31;
        String str2 = this.LJIIL;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJIILIIL;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJIILJJIL;
        int iHashCode5 = (((((((((((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + C786410Ut5.Z2(this.LJIILL)) * 31) + this.LJIILLIIL.hashCode()) * 31) + this.LJIIZILJ.hashCode()) * 31) + this.LJIJ.hashCode()) * 31) + this.LJIJI.hashCode()) * 31;
        Integer num = this.LJIJJ;
        int iHashCode6 = (((((((iHashCode5 + (num == null ? 0 : num.hashCode())) * 31) + this.LJIJJLI.hashCode()) * 31) + C786410Ut5.Z2(this.LJIL)) * 31) + this.LJJ) * 31;
        String str5 = this.LJJI;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        return "TrackerConfig(enterFrom=" + this.LIZ + ", enterMethod=" + this.LIZIZ + ", relationEnterMethod=" + this.LIZJ + ", previousPage=" + this.LIZLLL + ", homepageUid=" + this.LJ + ", isFromPopup=" + this.LJFF + ", previousPosition=" + this.LJI + ", position=" + this.LJII + ", useVShot=" + this.LJIIIIZZ + ", followFrom=" + this.LJIIIZ + ", authorId=" + this.LJIIJ + ", sourcePage=" + this.LJIIJJI + ", searchId=" + this.LJIIL + ", searchResultId=" + this.LJIILIIL + ", searchKeyWord=" + this.LJIILJJIL + ", isRecParamSeparate=" + this.LJIILL + ", newRecEnterFrom=" + this.LJIILLIIL + ", newRecPosition=" + this.LJIIZILJ + ", lightInteractionEnterMethod=" + this.LJIJ + ", lightInteractionPosition=" + this.LJIJI + ", siteId=" + this.LJIJJ + ", friendsTabVersion=" + this.LJIJJLI + ", isFromFriendsV3=" + this.LJIL + ", followerCount=" + this.LJJ + ", authCardPosition=" + this.LJJI + ')';
    }

    public final String LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append('-');
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append('-');
        sbLIZ.append(this.LJII);
        sbLIZ.append('-');
        sbLIZ.append(this.LJ);
        sbLIZ.append('-');
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append('-');
        sbLIZ.append(this.LJFF);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C1261270ivV LIZ(C1261270ivV c1261270ivV, String str, String str2, String str3, int i) {
        String str4;
        String str5;
        String str6;
        boolean z;
        String str7;
        String str8;
        boolean z2;
        int i2;
        String str9;
        String str10;
        String str11;
        String str12;
        boolean z3;
        String str13;
        String str14;
        String str15;
        String str16;
        Integer num;
        String str17;
        boolean z4;
        int i3;
        String str18;
        String str19 = str3;
        String str20 = str2;
        String str21 = str;
        if ((i & 1) != 0) {
            str21 = c1261270ivV.LIZ;
        }
        if ((i & 2) != 0) {
            str4 = c1261270ivV.LIZIZ;
        } else {
            str4 = null;
        }
        if ((i & 4) != 0) {
            str5 = c1261270ivV.LIZJ;
        } else {
            str5 = null;
        }
        if ((i & 8) != 0) {
            str6 = c1261270ivV.LIZLLL;
        } else {
            str6 = null;
        }
        if ((i & 16) != 0) {
            str20 = c1261270ivV.LJ;
        }
        if ((i & 32) != 0) {
            z = c1261270ivV.LJFF;
        } else {
            z = false;
        }
        if ((i & 64) != 0) {
            str7 = c1261270ivV.LJI;
        } else {
            str7 = null;
        }
        if ((i & 128) != 0) {
            str8 = c1261270ivV.LJII;
        } else {
            str8 = null;
        }
        if ((i & 256) != 0) {
            z2 = c1261270ivV.LJIIIIZZ;
        } else {
            z2 = false;
        }
        if ((i & 512) != 0) {
            i2 = c1261270ivV.LJIIIZ;
        } else {
            i2 = 0;
        }
        if ((i & 1024) != 0) {
            str19 = c1261270ivV.LJIIJ;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str9 = c1261270ivV.LJIIJJI;
        } else {
            str9 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str10 = c1261270ivV.LJIIL;
        } else {
            str10 = null;
        }
        if ((i & 8192) != 0) {
            str11 = c1261270ivV.LJIILIIL;
        } else {
            str11 = null;
        }
        if ((i & 16384) != 0) {
            str12 = c1261270ivV.LJIILJJIL;
        } else {
            str12 = null;
        }
        if ((32768 & i) != 0) {
            z3 = c1261270ivV.LJIILL;
        } else {
            z3 = false;
        }
        if ((65536 & i) != 0) {
            str13 = c1261270ivV.LJIILLIIL;
        } else {
            str13 = null;
        }
        if ((131072 & i) != 0) {
            str14 = c1261270ivV.LJIIZILJ;
        } else {
            str14 = null;
        }
        if ((262144 & i) != 0) {
            str15 = c1261270ivV.LJIJ;
        } else {
            str15 = null;
        }
        if ((524288 & i) != 0) {
            str16 = c1261270ivV.LJIJI;
        } else {
            str16 = null;
        }
        if ((1048576 & i) != 0) {
            num = c1261270ivV.LJIJJ;
        } else {
            num = null;
        }
        if ((2097152 & i) != 0) {
            str17 = c1261270ivV.LJIJJLI;
        } else {
            str17 = null;
        }
        if ((4194304 & i) != 0) {
            z4 = c1261270ivV.LJIL;
        } else {
            z4 = false;
        }
        if ((8388608 & i) != 0) {
            i3 = c1261270ivV.LJJ;
        } else {
            i3 = 0;
        }
        if ((i & 16777216) != 0) {
            str18 = c1261270ivV.LJJI;
        } else {
            str18 = null;
        }
        c1261270ivV.getClass();
        String str22 = str20;
        String str23 = str19;
        return new C1261270ivV(str21, str4, str5, str6, str22, z, str7, str8, z2, i2, str23, str9, str10, str11, str12, z3, str13, str14, str15, str16, num, str17, z4, i3, str18);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1261270ivV(String str, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, int i, int i2) {
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        int i3 = i;
        String str13 = str7;
        String str14 = str6;
        String str15 = str5;
        boolean z2 = z;
        String str16 = str4;
        String str17 = str3;
        String str18 = str2;
        String str19 = (i2 & 1) != 0 ? "" : str;
        str18 = (i2 & 2) != 0 ? "" : str18;
        str17 = (i2 & 8) != 0 ? "" : str17;
        str16 = (i2 & 16) != 0 ? "" : str16;
        z2 = (i2 & 32) != 0 ? false : z2;
        if ((i2 & 64) != 0) {
            str8 = "";
        } else {
            str8 = null;
        }
        str15 = (i2 & 128) != 0 ? "" : str15;
        boolean z3 = (i2 & 256) != 0;
        if ((i2 & 1024) != 0) {
            str9 = "";
        } else {
            str9 = null;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str10 = "";
        } else {
            str10 = null;
        }
        if ((65536 & i2) != 0) {
            str11 = "";
        } else {
            str11 = null;
        }
        if ((131072 & i2) != 0) {
            str12 = "";
        } else {
            str12 = null;
        }
        this(str19, str18, null, str17, str16, z2, str8, str15, z3, 0, str9, str10, null, null, null, false, str11, str12, (262144 & i2) != 0 ? "" : str14, (524288 & i2) != 0 ? "" : str13, null, (2097152 & i2) == 0 ? null : "", false, (i2 & 8388608) != 0 ? -1 : i3, null);
    }

    public C1261270ivV(String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, boolean z2, int i, String str8, String str9, String str10, String str11, String str12, boolean z3, String str13, String str14, String str15, String str16, Integer num, String str17, boolean z4, int i2, String str18) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = z;
        this.LJI = str6;
        this.LJII = str7;
        this.LJIIIIZZ = z2;
        this.LJIIIZ = i;
        this.LJIIJ = str8;
        this.LJIIJJI = str9;
        this.LJIIL = str10;
        this.LJIILIIL = str11;
        this.LJIILJJIL = str12;
        this.LJIILL = z3;
        this.LJIILLIIL = str13;
        this.LJIIZILJ = str14;
        this.LJIJ = str15;
        this.LJIJI = str16;
        this.LJIJJ = num;
        this.LJIJJLI = str17;
        this.LJIL = z4;
        this.LJJ = i2;
        this.LJJI = str18;
    }
}
