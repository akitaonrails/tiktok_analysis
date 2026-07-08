package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.StylePrompt;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ezi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C382840Ezi {
    public final EnumC378720Et4 LIZ;
    public final boolean LIZIZ;
    public final EnumC382880Ezm LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final Integer LJFF;
    public final C375830EoP<Integer> LJI;
    public final StylePrompt LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final Integer LJIIJ;
    public final boolean LJIIJJI;
    public final Integer LJIIL;
    public final C380190EvR LJIILIIL;
    public final C379430EuD LJIILJJIL;
    public final int LJIILL;
    public final boolean LJIILLIIL;
    public final boolean LJIIZILJ;
    public final boolean LJIJ;
    public final boolean LJIJI;
    public final boolean LJIJJ;
    public final Integer LJIJJLI;
    public final List<String> LJIL;
    public final List<Integer> LJJ;
    public final String LJJI;
    public final Integer LJJIFFI;

    public C382840Ezi() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C382840Ezi)) {
            return false;
        }
        C382840Ezi c382840Ezi = (C382840Ezi) obj;
        return this.LIZ == c382840Ezi.LIZ && this.LIZIZ == c382840Ezi.LIZIZ && this.LIZJ == c382840Ezi.LIZJ && Intrinsics.LJFF(this.LIZLLL, c382840Ezi.LIZLLL) && Intrinsics.LJFF(this.LJ, c382840Ezi.LJ) && Intrinsics.LJFF(this.LJFF, c382840Ezi.LJFF) && Intrinsics.LJFF(this.LJI, c382840Ezi.LJI) && Intrinsics.LJFF(this.LJII, c382840Ezi.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c382840Ezi.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c382840Ezi.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c382840Ezi.LJIIJ) && this.LJIIJJI == c382840Ezi.LJIIJJI && Intrinsics.LJFF(this.LJIIL, c382840Ezi.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c382840Ezi.LJIILIIL) && Intrinsics.LJFF(this.LJIILJJIL, c382840Ezi.LJIILJJIL) && this.LJIILL == c382840Ezi.LJIILL && this.LJIILLIIL == c382840Ezi.LJIILLIIL && this.LJIIZILJ == c382840Ezi.LJIIZILJ && this.LJIJ == c382840Ezi.LJIJ && this.LJIJI == c382840Ezi.LJIJI && this.LJIJJ == c382840Ezi.LJIJJ && Intrinsics.LJFF(this.LJIJJLI, c382840Ezi.LJIJJLI) && Intrinsics.LJFF(this.LJIL, c382840Ezi.LJIL) && Intrinsics.LJFF(this.LJJ, c382840Ezi.LJJ) && Intrinsics.LJFF(this.LJJI, c382840Ezi.LJJI) && Intrinsics.LJFF(this.LJJIFFI, c382840Ezi.LJJIFFI);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + this.LIZJ.hashCode()) * 31;
        String str = this.LIZLLL;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJ;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.LJFF;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        C375830EoP<Integer> c375830EoP = this.LJI;
        int iHashCode5 = (iHashCode4 + (c375830EoP == null ? 0 : c375830EoP.hashCode())) * 31;
        StylePrompt stylePrompt = this.LJII;
        int iHashCode6 = (iHashCode5 + (stylePrompt == null ? 0 : stylePrompt.hashCode())) * 31;
        String str3 = this.LJIIIIZZ;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJIIIZ;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.LJIIJ;
        int iHashCode9 = (((iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31) + C786410Ut5.Z2(this.LJIIJJI)) * 31;
        Integer num3 = this.LJIIL;
        int iHashCode10 = (iHashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        C380190EvR c380190EvR = this.LJIILIIL;
        int iHashCode11 = (iHashCode10 + (c380190EvR == null ? 0 : c380190EvR.hashCode())) * 31;
        C379430EuD c379430EuD = this.LJIILJJIL;
        int iHashCode12 = (((((((((((((iHashCode11 + (c379430EuD == null ? 0 : c379430EuD.hashCode())) * 31) + this.LJIILL) * 31) + C786410Ut5.Z2(this.LJIILLIIL)) * 31) + C786410Ut5.Z2(this.LJIIZILJ)) * 31) + C786410Ut5.Z2(this.LJIJ)) * 31) + C786410Ut5.Z2(this.LJIJI)) * 31) + C786410Ut5.Z2(this.LJIJJ)) * 31;
        Integer num4 = this.LJIJJLI;
        int iHashCode13 = (((((iHashCode12 + (num4 == null ? 0 : num4.hashCode())) * 31) + this.LJIL.hashCode()) * 31) + this.LJJ.hashCode()) * 31;
        String str5 = this.LJJI;
        int iHashCode14 = (iHashCode13 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num5 = this.LJJIFFI;
        return iHashCode14 + (num5 != null ? num5.hashCode() : 0);
    }

    public final String toString() {
        return "EPAIGCConfigurationState(panelUIType=" + this.LIZ + ", isCreateTemplate=" + this.LIZIZ + ", promptUpdateSource=" + this.LIZJ + ", imageAspectRatioValue=" + this.LIZLLL + ", videoAspectRatioValue=" + this.LJ + ", aspectRatioState=" + this.LJFF + ", aspectRatioStateAuto=" + this.LJI + ", stylePromptState=" + this.LJII + ", styleEffectIdState=" + this.LJIIIIZZ + ", styleNameState=" + this.LJIIIZ + ", stylePositionState=" + this.LJIIJ + ", isStylePanelEntryVisible=" + this.LJIIJJI + ", durationState=" + this.LJIIL + ", model=" + this.LJIILIIL + ", promptRephraser=" + this.LJIILJJIL + ", imageCount=" + this.LJIILL + ", showModelPanel=" + this.LJIILLIIL + ", showPanel=" + this.LJIIZILJ + ", hideModelContainer=" + this.LJIJ + ", aspectRatioContainerKeepOriginal=" + this.LJIJI + ", hideRewritePromptContainer=" + this.LJIJJ + ", promptEditTextHintResId=" + this.LJIJJLI + ", supportedAspectRatios=" + this.LJIL + ", supportedDurationsSec=" + this.LJJ + ", aspectRatio=" + this.LJJI + ", duration=" + this.LJJIFFI + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C382840Ezi(int i) {
        EnumC378720Et4 enumC378720Et4 = EnumC378720Et4.TEXT_TO_VIDEO_CREATION;
        EnumC382880Ezm enumC382880Ezm = EnumC382880Ezm.BY_USER;
        C13BV c13bv = C13BV.INSTANCE;
        this(enumC378720Et4, false, enumC382880Ezm, null, null, null, null, null, null, null, null, true, null, null, null, 0, false, false, false, false, false, null, c13bv, c13bv, null, null);
    }

    public static C382840Ezi LIZ(C382840Ezi c382840Ezi, EnumC378720Et4 enumC378720Et4, boolean z, EnumC382880Ezm enumC382880Ezm, String str, String str2, Integer num, C375830EoP c375830EoP, String str3, boolean z2, Integer num2, C380190EvR c380190EvR, C379430EuD c379430EuD, int i, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, Integer num3, List list, List list2, String str4, Integer num4, int i2) {
        StylePrompt stylePrompt;
        String str5;
        List list3 = list2;
        Integer num5 = num3;
        boolean z8 = z7;
        String str6 = str2;
        boolean z9 = z5;
        EnumC378720Et4 enumC378720Et42 = enumC378720Et4;
        int i3 = i;
        C379430EuD c379430EuD2 = c379430EuD;
        boolean z10 = z6;
        Integer num6 = num4;
        C380190EvR c380190EvR2 = c380190EvR;
        C375830EoP c375830EoP2 = c375830EoP;
        String str7 = str4;
        Integer num7 = num2;
        Integer num8 = num;
        boolean z11 = z2;
        boolean z12 = z4;
        String str8 = str;
        boolean z13 = z3;
        String str9 = str3;
        List list4 = list;
        EnumC382880Ezm enumC382880Ezm2 = enumC382880Ezm;
        boolean z14 = z;
        if ((i2 & 1) != 0) {
            enumC378720Et42 = c382840Ezi.LIZ;
        }
        if ((i2 & 2) != 0) {
            z14 = c382840Ezi.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            enumC382880Ezm2 = c382840Ezi.LIZJ;
        }
        if ((i2 & 8) != 0) {
            str8 = c382840Ezi.LIZLLL;
        }
        if ((i2 & 16) != 0) {
            str6 = c382840Ezi.LJ;
        }
        if ((i2 & 32) != 0) {
            num8 = c382840Ezi.LJFF;
        }
        if ((i2 & 64) != 0) {
            c375830EoP2 = c382840Ezi.LJI;
        }
        Integer num9 = null;
        if ((i2 & 128) != 0) {
            stylePrompt = c382840Ezi.LJII;
        } else {
            stylePrompt = null;
        }
        if ((i2 & 256) != 0) {
            str5 = c382840Ezi.LJIIIIZZ;
        } else {
            str5 = null;
        }
        if ((i2 & 512) != 0) {
            str9 = c382840Ezi.LJIIIZ;
        }
        if ((i2 & 1024) != 0) {
            num9 = c382840Ezi.LJIIJ;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            z11 = c382840Ezi.LJIIJJI;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            num7 = c382840Ezi.LJIIL;
        }
        if ((i2 & 8192) != 0) {
            c380190EvR2 = c382840Ezi.LJIILIIL;
        }
        if ((i2 & 16384) != 0) {
            c379430EuD2 = c382840Ezi.LJIILJJIL;
        }
        if ((32768 & i2) != 0) {
            i3 = c382840Ezi.LJIILL;
        }
        if ((65536 & i2) != 0) {
            z13 = c382840Ezi.LJIILLIIL;
        }
        if ((131072 & i2) != 0) {
            z12 = c382840Ezi.LJIIZILJ;
        }
        if ((262144 & i2) != 0) {
            z9 = c382840Ezi.LJIJ;
        }
        if ((524288 & i2) != 0) {
            z10 = c382840Ezi.LJIJI;
        }
        if ((1048576 & i2) != 0) {
            z8 = c382840Ezi.LJIJJ;
        }
        if ((2097152 & i2) != 0) {
            num5 = c382840Ezi.LJIJJLI;
        }
        if ((4194304 & i2) != 0) {
            list4 = c382840Ezi.LJIL;
        }
        if ((8388608 & i2) != 0) {
            list3 = c382840Ezi.LJJ;
        }
        if ((16777216 & i2) != 0) {
            str7 = c382840Ezi.LJJI;
        }
        if ((i2 & 33554432) != 0) {
            num6 = c382840Ezi.LJJIFFI;
        }
        c382840Ezi.getClass();
        return new C382840Ezi(enumC378720Et42, z14, enumC382880Ezm2, str8, str6, num8, c375830EoP2, stylePrompt, str5, str9, num9, z11, num7, c380190EvR2, c379430EuD2, i3, z13, z12, z9, z10, z8, num5, list4, list3, str7, num6);
    }

    public C382840Ezi(EnumC378720Et4 enumC378720Et4, boolean z, EnumC382880Ezm enumC382880Ezm, String str, String str2, Integer num, C375830EoP<Integer> c375830EoP, StylePrompt stylePrompt, String str3, String str4, Integer num2, boolean z2, Integer num3, C380190EvR c380190EvR, C379430EuD c379430EuD, int i, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, Integer num4, List<String> list, List<Integer> list2, String str5, Integer num5) {
        this.LIZ = enumC378720Et4;
        this.LIZIZ = z;
        this.LIZJ = enumC382880Ezm;
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = num;
        this.LJI = c375830EoP;
        this.LJII = stylePrompt;
        this.LJIIIIZZ = str3;
        this.LJIIIZ = str4;
        this.LJIIJ = num2;
        this.LJIIJJI = z2;
        this.LJIIL = num3;
        this.LJIILIIL = c380190EvR;
        this.LJIILJJIL = c379430EuD;
        this.LJIILL = i;
        this.LJIILLIIL = z3;
        this.LJIIZILJ = z4;
        this.LJIJ = z5;
        this.LJIJI = z6;
        this.LJIJJ = z7;
        this.LJIJJLI = num4;
        this.LJIL = list;
        this.LJJ = list2;
        this.LJJI = str5;
        this.LJJIFFI = num5;
    }
}
