package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.12E8, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12E8 {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;
    public final List<String> LJIIL;
    public final Integer LJIILIIL;
    public final String LJIILJJIL;
    public final String LJIILL;
    public final String LJIILLIIL;
    public final String LJIIZILJ;
    public final String LJIJ;
    public final String LJIJI;

    public C12E8() {
        this(false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048575);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12E8)) {
            return false;
        }
        C12E8 c12e8 = (C12E8) obj;
        return this.LIZ == c12e8.LIZ && this.LIZIZ == c12e8.LIZIZ && Intrinsics.LJFF(this.LIZJ, c12e8.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c12e8.LIZLLL) && Intrinsics.LJFF(this.LJ, c12e8.LJ) && Intrinsics.LJFF(this.LJFF, c12e8.LJFF) && Intrinsics.LJFF(this.LJI, c12e8.LJI) && Intrinsics.LJFF(this.LJII, c12e8.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c12e8.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c12e8.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c12e8.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c12e8.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c12e8.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c12e8.LJIILIIL) && Intrinsics.LJFF(this.LJIILJJIL, c12e8.LJIILJJIL) && Intrinsics.LJFF(this.LJIILL, c12e8.LJIILL) && Intrinsics.LJFF(this.LJIILLIIL, c12e8.LJIILLIIL) && Intrinsics.LJFF(this.LJIIZILJ, c12e8.LJIIZILJ) && Intrinsics.LJFF(this.LJIJ, c12e8.LJIJ) && Intrinsics.LJFF(this.LJIJI, c12e8.LJIJI);
    }

    public final int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31;
        String str = this.LIZJ;
        int iHashCode = (iZ2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZLLL;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJ;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJFF;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJI;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.LJII;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.LJIIIIZZ;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.LJIIIZ;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.LJIIJ;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.LJIIJJI;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        List<String> list = this.LJIIL;
        int iHashCode11 = (iHashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.LJIILIIL;
        int iHashCode12 = (iHashCode11 + (num == null ? 0 : num.hashCode())) * 31;
        String str11 = this.LJIILJJIL;
        int iHashCode13 = (iHashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.LJIILL;
        int iHashCode14 = (iHashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.LJIILLIIL;
        int iHashCode15 = (iHashCode14 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.LJIIZILJ;
        int iHashCode16 = (iHashCode15 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.LJIJ;
        int iHashCode17 = (iHashCode16 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.LJIJI;
        return iHashCode17 + (str16 != null ? str16.hashCode() : 0);
    }

    public final String toString() {
        return "GuideCreateVideoWithEffectModel(isLoading=" + this.LIZ + ", needFallback=" + this.LIZIZ + ", effectID=" + this.LIZJ + ", effectResoruceID=" + this.LIZLLL + ", effectCategory=" + this.LJ + ", effectPostCount=" + this.LJFF + ", searchTopicId=" + this.LJI + ", recoId=" + this.LJII + ", title=" + this.LJIIIIZZ + ", description=" + this.LJIIIZ + ", buttonText=" + this.LJIIJ + ", primaryScene=" + this.LJIIJJI + ", scenes=" + this.LJIIL + ", topicType=" + this.LJIILIIL + ", activityName=" + this.LJIILJJIL + ", coverUrl=" + this.LJIILL + ", businessInfo=" + this.LJIILLIIL + ", searchExtra=" + this.LJIIZILJ + ", debugInfoJson=" + this.LJIJ + ", logId=" + this.LJIJI + ')';
    }

    public C12E8(boolean z, boolean z2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List list, Integer num, String str11, String str12, String str13, String str14, String str15, String str16, int i) {
        String str17 = str;
        String str18 = str9;
        String str19 = str8;
        String str20 = str7;
        String str21 = str6;
        String str22 = str5;
        String str23 = str4;
        String str24 = str3;
        String str25 = str2;
        String str26 = str16;
        String str27 = str15;
        String str28 = str14;
        String str29 = str13;
        Integer num2 = num;
        String str30 = str12;
        String str31 = str11;
        List list2 = list;
        boolean z3 = (i & 1) != 0 ? false : z;
        boolean z4 = (i & 2) == 0 ? z2 : false;
        str17 = (i & 4) != 0 ? null : str17;
        str25 = (i & 8) != 0 ? null : str25;
        str24 = (i & 16) != 0 ? null : str24;
        str23 = (i & 32) != 0 ? null : str23;
        str22 = (i & 64) != 0 ? "" : str22;
        str21 = (i & 128) != 0 ? "" : str21;
        str20 = (i & 256) != 0 ? "" : str20;
        str19 = (i & 512) != 0 ? "" : str19;
        str18 = (i & 1024) != 0 ? "" : str18;
        String str32 = (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 0 ? str10 : "";
        list2 = (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : list2;
        num2 = (i & 8192) != 0 ? null : num2;
        str31 = (i & 16384) != 0 ? null : str31;
        str30 = (32768 & i) != 0 ? null : str30;
        str29 = (65536 & i) != 0 ? null : str29;
        str28 = (131072 & i) != 0 ? null : str28;
        str27 = (262144 & i) != 0 ? null : str27;
        str26 = (i & 524288) != 0 ? null : str26;
        this.LIZ = z3;
        this.LIZIZ = z4;
        this.LIZJ = str17;
        this.LIZLLL = str25;
        this.LJ = str24;
        this.LJFF = str23;
        this.LJI = str22;
        this.LJII = str21;
        this.LJIIIIZZ = str20;
        this.LJIIIZ = str19;
        this.LJIIJ = str18;
        this.LJIIJJI = str32;
        this.LJIIL = list2;
        this.LJIILIIL = num2;
        this.LJIILJJIL = str31;
        this.LJIILL = str30;
        this.LJIILLIIL = str29;
        this.LJIIZILJ = str28;
        this.LJIJ = str27;
        this.LJIJI = str26;
    }
}
