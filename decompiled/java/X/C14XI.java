package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS146S1200000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14XI, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14XI implements InterfaceC0148002o {
    public final boolean LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;
    public final boolean LLILZIL;
    public final boolean LLILZLL;
    public final boolean LLIZ;
    public final String LLIZLLLIL;
    public final Function0<Unit> LLJ;
    public final boolean LLJI;
    public final String LLJIJIL;
    public final Function0<Unit> LLJILJIL;
    public final String LLJILJILJ;
    public final Function0<Unit> LLJILLL;

    public C14XI() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14XI)) {
            return false;
        }
        C14XI c14xi = (C14XI) obj;
        return this.LL == c14xi.LL && this.LLILLJJLI == c14xi.LLILLJJLI && this.LLILLL == c14xi.LLILLL && this.LLILZ == c14xi.LLILZ && this.LLILZIL == c14xi.LLILZIL && this.LLILZLL == c14xi.LLILZLL && this.LLIZ == c14xi.LLIZ && Intrinsics.LJFF(this.LLIZLLLIL, c14xi.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c14xi.LLJ) && this.LLJI == c14xi.LLJI && Intrinsics.LJFF(this.LLJIJIL, c14xi.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c14xi.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c14xi.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c14xi.LLJILLL);
    }

    public final int hashCode() {
        int iZ2 = ((((((((((((((C786410Ut5.Z2(this.LL) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31) + C786410Ut5.Z2(this.LLILZLL)) * 31) + C786410Ut5.Z2(this.LLIZ)) * 31) + this.LLIZLLLIL.hashCode()) * 31;
        Function0<Unit> function0 = this.LLJ;
        int iHashCode = (((((iZ2 + (function0 == null ? 0 : function0.hashCode())) * 31) + C786410Ut5.Z2(this.LLJI)) * 31) + this.LLJIJIL.hashCode()) * 31;
        Function0<Unit> function02 = this.LLJILJIL;
        int iHashCode2 = (((iHashCode + (function02 == null ? 0 : function02.hashCode())) * 31) + this.LLJILJILJ.hashCode()) * 31;
        Function0<Unit> function03 = this.LLJILLL;
        return iHashCode2 + (function03 != null ? function03.hashCode() : 0);
    }

    public final String toString() {
        return "DisplayAndCaptionState(preferredLanguagesVisible=" + this.LL + ", translationSectionVisible=" + this.LLILLJJLI + ", alwaysTranslateCellVisible=" + this.LLILLL + ", alwaysTranslateCommentCellVisible=" + this.LLILZ + ", alwaysTranslateDMCellVisible=" + this.LLILZIL + ", translateToCellVisible=" + this.LLILZLL + ", doNotTranslateCellVisible=" + this.LLIZ + ", preferredLanguagesLabel=" + this.LLIZLLLIL + ", preferredLanguagesClick=" + this.LLJ + ", translationsGroupVisible=" + this.LLJI + ", translationLabel=" + this.LLJIJIL + ", translationClick=" + this.LLJILJIL + ", doNotTranslateLabel=" + this.LLJILJILJ + ", doNotTranslateClick=" + this.LLJILLL + ')';
    }

    public /* synthetic */ C14XI(int i) {
        this(false, false, false, false, false, false, false, "", null, false, "", null, "", null);
    }

    public C14XI(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str, Function0<Unit> function0, boolean z8, String str2, Function0<Unit> function02, String str3, Function0<Unit> function03) {
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = z3;
        this.LLILZ = z4;
        this.LLILZIL = z5;
        this.LLILZLL = z6;
        this.LLIZ = z7;
        this.LLIZLLLIL = str;
        this.LLJ = function0;
        this.LLJI = z8;
        this.LLJIJIL = str2;
        this.LLJILJIL = function02;
        this.LLJILJILJ = str3;
        this.LLJILLL = function03;
    }

    public static C14XI LIZ(C14XI c14xi, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str, C14XK c14xk, boolean z7, String str2, AwS146S1200000_31 awS146S1200000_31, String str3, Function0 function0, int i) {
        boolean z8;
        Function0 function02 = function0;
        String str4 = str3;
        Function0<Unit> function03 = awS146S1200000_31;
        String str5 = str2;
        boolean z9 = z7;
        Function0<Unit> function04 = c14xk;
        String str6 = str;
        boolean z10 = z6;
        boolean z11 = z5;
        boolean z12 = z4;
        boolean z13 = z3;
        boolean z14 = z2;
        boolean z15 = z;
        if ((i & 1) != 0) {
            z8 = c14xi.LL;
        } else {
            z8 = false;
        }
        if ((i & 2) != 0) {
            z15 = c14xi.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            z14 = c14xi.LLILLL;
        }
        if ((i & 8) != 0) {
            z13 = c14xi.LLILZ;
        }
        if ((i & 16) != 0) {
            z12 = c14xi.LLILZIL;
        }
        if ((i & 32) != 0) {
            z11 = c14xi.LLILZLL;
        }
        if ((i & 64) != 0) {
            z10 = c14xi.LLIZ;
        }
        if ((i & 128) != 0) {
            str6 = c14xi.LLIZLLLIL;
        }
        if ((i & 256) != 0) {
            function04 = c14xi.LLJ;
        }
        if ((i & 512) != 0) {
            z9 = c14xi.LLJI;
        }
        if ((i & 1024) != 0) {
            str5 = c14xi.LLJIJIL;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            function03 = c14xi.LLJILJIL;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str4 = c14xi.LLJILJILJ;
        }
        if ((i & 8192) != 0) {
            function02 = c14xi.LLJILLL;
        }
        c14xi.getClass();
        return new C14XI(z8, z15, z14, z13, z12, z11, z10, str6, function04, z9, str5, function03, str4, function02);
    }
}
