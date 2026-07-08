package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Eyd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C382170Eyd {
    public final CreativeInfo LIZ;
    public final String LIZIZ;
    public final List<C382120EyY> LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final int LJFF;
    public final int LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final EnumC377820Erc LJIIIZ;
    public final EnumC377680ErO LJIIJ;
    public final String LJIIJJI;
    public final String LJIIL;
    public final String LJIILIIL;
    public final String LJIILJJIL;
    public final String LJIILL;
    public final int LJIILLIIL;
    public final String LJIIZILJ;
    public final String LJIJ;
    public final String LJIJI;
    public final Map<String, String> LJIJJ;
    public final boolean LJIJJLI;
    public final int LJIL;
    public final Map<String, String> LJJ;
    public final String LJJI;
    public final boolean LJJIFFI;
    public final boolean LJJII;
    public final String LJJIII;
    public final int LJJIIJ;
    public final List<C381710Ext> LJJIIJZLJL;

    public C382170Eyd() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C382170Eyd)) {
            return false;
        }
        C382170Eyd c382170Eyd = (C382170Eyd) obj;
        return Intrinsics.LJFF(this.LIZ, c382170Eyd.LIZ) && Intrinsics.LJFF(this.LIZIZ, c382170Eyd.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c382170Eyd.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c382170Eyd.LIZLLL) && Intrinsics.LJFF(this.LJ, c382170Eyd.LJ) && this.LJFF == c382170Eyd.LJFF && this.LJI == c382170Eyd.LJI && Intrinsics.LJFF(this.LJII, c382170Eyd.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c382170Eyd.LJIIIIZZ) && this.LJIIIZ == c382170Eyd.LJIIIZ && this.LJIIJ == c382170Eyd.LJIIJ && Intrinsics.LJFF(this.LJIIJJI, c382170Eyd.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c382170Eyd.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c382170Eyd.LJIILIIL) && Intrinsics.LJFF(this.LJIILJJIL, c382170Eyd.LJIILJJIL) && Intrinsics.LJFF(this.LJIILL, c382170Eyd.LJIILL) && this.LJIILLIIL == c382170Eyd.LJIILLIIL && Intrinsics.LJFF(this.LJIIZILJ, c382170Eyd.LJIIZILJ) && Intrinsics.LJFF(this.LJIJ, c382170Eyd.LJIJ) && Intrinsics.LJFF(this.LJIJI, c382170Eyd.LJIJI) && Intrinsics.LJFF(this.LJIJJ, c382170Eyd.LJIJJ) && this.LJIJJLI == c382170Eyd.LJIJJLI && this.LJIL == c382170Eyd.LJIL && Intrinsics.LJFF(this.LJJ, c382170Eyd.LJJ) && Intrinsics.LJFF(this.LJJI, c382170Eyd.LJJI) && this.LJJIFFI == c382170Eyd.LJJIFFI && this.LJJII == c382170Eyd.LJJII && Intrinsics.LJFF(this.LJJIII, c382170Eyd.LJJIII) && this.LJJIIJ == c382170Eyd.LJJIIJ && Intrinsics.LJFF(this.LJJIIJZLJL, c382170Eyd.LJJIIJZLJL);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        List<C382120EyY> list = this.LIZJ;
        int iHashCode2 = (((((((((((((((((((((((((((((((((((((((((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF) * 31) + this.LJI) * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ.hashCode()) * 31) + this.LJIIIZ.hashCode()) * 31) + this.LJIIJ.hashCode()) * 31) + this.LJIIJJI.hashCode()) * 31) + this.LJIIL.hashCode()) * 31) + this.LJIILIIL.hashCode()) * 31) + this.LJIILJJIL.hashCode()) * 31) + this.LJIILL.hashCode()) * 31) + this.LJIILLIIL) * 31) + this.LJIIZILJ.hashCode()) * 31) + this.LJIJ.hashCode()) * 31) + this.LJIJI.hashCode()) * 31) + this.LJIJJ.hashCode()) * 31) + C786410Ut5.Z2(this.LJIJJLI)) * 31) + this.LJIL) * 31;
        Map<String, String> map = this.LJJ;
        return ((((((((((((iHashCode2 + (map != null ? map.hashCode() : 0)) * 31) + this.LJJI.hashCode()) * 31) + C786410Ut5.Z2(this.LJJIFFI)) * 31) + C786410Ut5.Z2(this.LJJII)) * 31) + this.LJJIII.hashCode()) * 31) + this.LJJIIJ) * 31) + this.LJJIIJZLJL.hashCode();
    }

    public final String toString() {
        return "GenAIParentTaskInput(creativeInfo=" + this.LIZ + ", algoReq=" + this.LIZIZ + ", inputItems=" + this.LIZJ + ", videoSlotId=" + this.LIZLLL + ", promptText=" + this.LJ + ", style=" + this.LJFF + ", duration=" + this.LJI + ", aspectRatio=" + this.LJII + ", effectId=" + this.LJIIIIZZ + ", businessScene=" + this.LJIIIZ + ", jobType=" + this.LJIIJ + ", entranceScene=" + this.LJIIJJI + ", resourceId=" + this.LJIIL + ", serverTaskId=" + this.LJIILIIL + ", creationId=" + this.LJIILJJIL + ", reqJson=" + this.LJIILL + ", templateType=" + this.LJIILLIIL + ", templateId=" + this.LJIIZILJ + ", triggerType=" + this.LJIJ + ", taskType=" + this.LJIJI + ", bizExtras=" + this.LJIJJ + ", ignorePostProcessingFailure=" + this.LJIJJLI + ", outputCount=" + this.LJIL + ", generateExtra=" + this.LJJ + ", resourceKey=" + this.LJJI + ", isFromGradeDown=" + this.LJJIFFI + ", shouldSkipToPolling=" + this.LJJII + ", gradeDownServerTaskId=" + this.LJJIII + ", aiCreateStylizedType=" + this.LJJIIJ + ", stylizedAiStages=" + this.LJJIIJZLJL + ')';
    }

    public C382170Eyd(CreativeInfo creativeInfo, String str, List list, String str2, int i, String str3, String str4, EnumC377820Erc enumC377820Erc, EnumC377680ErO enumC377680ErO, Map map, int i2, List list2, int i3) {
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        boolean z;
        String str14;
        List list3 = list2;
        int i4 = i2;
        Map mapLJ = map;
        String str15 = str4;
        String str16 = str3;
        int i5 = i;
        String str17 = str2;
        List list4 = list;
        String str18 = (i3 & 2) != 0 ? "" : str;
        list4 = (i3 & 4) != 0 ? null : list4;
        if ((i3 & 8) != 0) {
            str5 = "";
        } else {
            str5 = null;
        }
        str17 = (i3 & 16) != 0 ? "" : str17;
        i5 = (i3 & 64) != 0 ? 0 : i5;
        str16 = (i3 & 128) != 0 ? "" : str16;
        str15 = (i3 & 256) != 0 ? "" : str15;
        if ((i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str6 = "";
        } else {
            str6 = null;
        }
        if ((i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str7 = "";
        } else {
            str7 = null;
        }
        if ((i3 & 8192) != 0) {
            str8 = "";
        } else {
            str8 = null;
        }
        if ((i3 & 16384) != 0) {
            str9 = "";
        } else {
            str9 = null;
        }
        if ((32768 & i3) != 0) {
            str10 = "";
        } else {
            str10 = null;
        }
        if ((131072 & i3) != 0) {
            str11 = "";
        } else {
            str11 = null;
        }
        if ((262144 & i3) != 0) {
            str12 = "";
        } else {
            str12 = null;
        }
        if ((524288 & i3) != 0) {
            str13 = "";
        } else {
            str13 = null;
        }
        mapLJ = (1048576 & i3) != 0 ? C2097608Jq.LJ() : mapLJ;
        if ((2097152 & i3) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((16777216 & i3) != 0) {
            str14 = "";
        } else {
            str14 = null;
        }
        String str19 = (134217728 & i3) == 0 ? null : "";
        i4 = (268435456 & i3) != 0 ? 0 : i4;
        list3 = (i3 & 536870912) != 0 ? C13BV.INSTANCE : list3;
        this.LIZ = creativeInfo;
        this.LIZIZ = str18;
        this.LIZJ = list4;
        this.LIZLLL = str5;
        this.LJ = str17;
        this.LJFF = 0;
        this.LJI = i5;
        this.LJII = str16;
        this.LJIIIIZZ = str15;
        this.LJIIIZ = enumC377820Erc;
        this.LJIIJ = enumC377680ErO;
        this.LJIIJJI = str6;
        this.LJIIL = str7;
        this.LJIILIIL = str8;
        this.LJIILJJIL = str9;
        this.LJIILL = str10;
        this.LJIILLIIL = 0;
        this.LJIIZILJ = str11;
        this.LJIJ = str12;
        this.LJIJI = str13;
        this.LJIJJ = mapLJ;
        this.LJIJJLI = z;
        this.LJIL = 0;
        this.LJJ = null;
        this.LJJI = str14;
        this.LJJIFFI = false;
        this.LJJII = false;
        this.LJJIII = str19;
        this.LJJIIJ = i4;
        this.LJJIIJZLJL = list3;
    }
}
