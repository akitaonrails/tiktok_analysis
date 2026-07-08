package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Exi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C381600Exi {
    public final String LIZ;
    public final EnumC378030Erx LIZIZ;
    public final EnumC381960EyI LIZJ;
    public final EnumC377680ErO LIZLLL;
    public final EnumC377820Erc LJ;
    public final EnumC381980EyK LJFF;
    public final String LJI;
    public final String LJII;
    public final C378470Esf LJIIIIZZ;
    public final String LJIIIZ;
    public final int LJIIJ;
    public final String LJIIJJI;
    public final List<String> LJIIL;
    public final EnumC378310EsP LJIILIIL;
    public final boolean LJIILJJIL;
    public final boolean LJIILL;
    public final String LJIILLIIL;
    public final EnumC378140Es8 LJIIZILJ;
    public final List<C381710Ext> LJIJ;
    public final C382180Eye LJIJI;
    public final Function2<String, InterfaceC1364105Vn<? super Boolean>, Object> LJIJJ;

    public C381600Exi() {
        this(null, null, null, null, null, null, null, 0, null, null, null, false, false, null, null, null, null, null, 2097151);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C381600Exi)) {
            return false;
        }
        C381600Exi c381600Exi = (C381600Exi) obj;
        return Intrinsics.LJFF(this.LIZ, c381600Exi.LIZ) && this.LIZIZ == c381600Exi.LIZIZ && this.LIZJ == c381600Exi.LIZJ && this.LIZLLL == c381600Exi.LIZLLL && this.LJ == c381600Exi.LJ && this.LJFF == c381600Exi.LJFF && Intrinsics.LJFF(this.LJI, c381600Exi.LJI) && Intrinsics.LJFF(this.LJII, c381600Exi.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c381600Exi.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c381600Exi.LJIIIZ) && this.LJIIJ == c381600Exi.LJIIJ && Intrinsics.LJFF(this.LJIIJJI, c381600Exi.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c381600Exi.LJIIL) && this.LJIILIIL == c381600Exi.LJIILIIL && this.LJIILJJIL == c381600Exi.LJIILJJIL && this.LJIILL == c381600Exi.LJIILL && Intrinsics.LJFF(this.LJIILLIIL, c381600Exi.LJIILLIIL) && this.LJIIZILJ == c381600Exi.LJIIZILJ && Intrinsics.LJFF(this.LJIJ, c381600Exi.LJIJ) && Intrinsics.LJFF(this.LJIJI, c381600Exi.LJIJI) && Intrinsics.LJFF(this.LJIJJ, c381600Exi.LJIJJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        EnumC381960EyI enumC381960EyI = this.LIZJ;
        int iHashCode2 = (iHashCode + (enumC381960EyI == null ? 0 : enumC381960EyI.hashCode())) * 31;
        EnumC377680ErO enumC377680ErO = this.LIZLLL;
        int iHashCode3 = (iHashCode2 + (enumC377680ErO == null ? 0 : enumC377680ErO.hashCode())) * 31;
        EnumC377820Erc enumC377820Erc = this.LJ;
        int iHashCode4 = (iHashCode3 + (enumC377820Erc == null ? 0 : enumC377820Erc.hashCode())) * 31;
        EnumC381980EyK enumC381980EyK = this.LJFF;
        int iHashCode5 = (((((((((((((((iHashCode4 + (enumC381980EyK == null ? 0 : enumC381980EyK.hashCode())) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ.hashCode()) * 31) + this.LJIIIZ.hashCode()) * 31) + this.LJIIJ) * 31) + this.LJIIJJI.hashCode()) * 31) + this.LJIIL.hashCode()) * 31;
        EnumC378310EsP enumC378310EsP = this.LJIILIIL;
        int iHashCode6 = (((((((((((iHashCode5 + (enumC378310EsP == null ? 0 : enumC378310EsP.hashCode())) * 31) + C786410Ut5.Z2(this.LJIILJJIL)) * 31) + C786410Ut5.Z2(this.LJIILL)) * 31) + this.LJIILLIIL.hashCode()) * 31) + this.LJIIZILJ.hashCode()) * 31) + this.LJIJ.hashCode()) * 31;
        C382180Eye c382180Eye = this.LJIJI;
        int iHashCode7 = (iHashCode6 + (c382180Eye == null ? 0 : c382180Eye.hashCode())) * 31;
        Function2<String, InterfaceC1364105Vn<? super Boolean>, Object> function2 = this.LJIJJ;
        return iHashCode7 + (function2 != null ? function2.hashCode() : 0);
    }

    public final String toString() {
        return "GenAIGenerationParam(generateReqKey=" + this.LIZ + ", mediaType=" + this.LIZIZ + ", source=" + this.LIZJ + ", jobType=" + this.LIZLLL + ", businessScene=" + this.LJ + ", taskType=" + this.LJFF + ", imagePath=" + this.LJI + ", promptDescription=" + this.LJII + ", stylePrompt=" + this.LJIIIIZZ + ", styleEffectId=" + this.LJIIIZ + ", duration=" + this.LJIIJ + ", aspectRatio=" + this.LJIIJJI + ", imagePathList=" + this.LJIIL + ", subGenerateType=" + this.LJIILIIL + ", needsFaceDetect=" + this.LJIILJJIL + ", shouldPersistImage=" + this.LJIILL + ", rewriteType=" + this.LJIILLIIL + ", aiCreateStylizedType=" + this.LJIIZILJ + ", stylizedStages=" + this.LJIJ + ", i2vParam=" + this.LJIJI + ", effectI2VBeforeSubmit=" + this.LJIJJ + ')';
    }

    public final Map<String, String> LIZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (this.LJIILJJIL) {
            linkedHashMap.put("needs_face_detect", "true");
        }
        if (this.LJIILL) {
            linkedHashMap.put("should_persist_image", "true");
        }
        if (!a0.LJJJIL(this.LJIILLIIL)) {
            linkedHashMap.put("rewrite_type", this.LJIILLIIL);
        }
        return linkedHashMap;
    }

    public C381600Exi(String str, EnumC378030Erx enumC378030Erx, EnumC381960EyI enumC381960EyI, String str2, String str3, C378470Esf c378470Esf, String str4, int i, String str5, List list, EnumC378310EsP enumC378310EsP, boolean z, boolean z2, String str6, EnumC378140Es8 enumC378140Es8, List list2, C382180Eye c382180Eye, C354230Duf c354230Duf, int i2) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? EnumC378030Erx.NONE : enumC378030Erx, (i2 & 4) != 0 ? null : enumC381960EyI, null, null, null, (i2 & 64) != 0 ? "" : str2, (i2 & 128) != 0 ? "" : str3, (i2 & 256) != 0 ? new C378470Esf(0) : c378470Esf, (i2 & 512) != 0 ? "" : str4, (i2 & 1024) != 0 ? 0 : i, (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? "" : str5, (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? C13BV.INSTANCE : list, (i2 & 8192) != 0 ? null : enumC378310EsP, (i2 & 16384) != 0 ? false : z, (32768 & i2) != 0 ? false : z2, (65536 & i2) == 0 ? str6 : "", (131072 & i2) != 0 ? EnumC378140Es8.NONE : enumC378140Es8, (262144 & i2) != 0 ? C13BV.INSTANCE : list2, (524288 & i2) != 0 ? null : c382180Eye, (i2 & 1048576) != 0 ? null : c354230Duf);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C381600Exi(String str, EnumC378030Erx enumC378030Erx, EnumC381960EyI enumC381960EyI, EnumC377680ErO enumC377680ErO, EnumC377820Erc enumC377820Erc, EnumC381980EyK enumC381980EyK, String str2, String str3, C378470Esf c378470Esf, String str4, int i, String str5, List<String> list, EnumC378310EsP enumC378310EsP, boolean z, boolean z2, String str6, EnumC378140Es8 enumC378140Es8, List<C381710Ext> list2, C382180Eye c382180Eye, Function2<? super String, ? super InterfaceC1364105Vn<? super Boolean>, ? extends Object> function2) {
        this.LIZ = str;
        this.LIZIZ = enumC378030Erx;
        this.LIZJ = enumC381960EyI;
        this.LIZLLL = enumC377680ErO;
        this.LJ = enumC377820Erc;
        this.LJFF = enumC381980EyK;
        this.LJI = str2;
        this.LJII = str3;
        this.LJIIIIZZ = c378470Esf;
        this.LJIIIZ = str4;
        this.LJIIJ = i;
        this.LJIIJJI = str5;
        this.LJIIL = list;
        this.LJIILIIL = enumC378310EsP;
        this.LJIILJJIL = z;
        this.LJIILL = z2;
        this.LJIILLIIL = str6;
        this.LJIIZILJ = enumC378140Es8;
        this.LJIJ = list2;
        this.LJIJI = c382180Eye;
        this.LJIJJ = function2;
    }
}
