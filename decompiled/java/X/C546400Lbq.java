package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AFwS291S0000000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Lbq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C546400Lbq<AWEME_DRAFT> {
    public final String LIZ;
    public final int LIZIZ;
    public final Function1<AWEME_DRAFT, Boolean> LIZJ;
    public final Function1<CreativeModel, Boolean> LIZLLL;
    public final Function1<CreativeModel, Boolean> LJ;
    public final Function1<CreativeModel, Boolean> LJFF;
    public final Function2<CreativeModel, InterfaceC1364105Vn<? super Unit>, Object> LJI;
    public final InterfaceC546480Lby<Object> LJII;
    public final C1280904zn LJIIIIZZ;
    public final Function1<CreativeModel, Unit> LJIIIZ;
    public final Function2<CreativeModel, Map<String, String>, Unit> LJIIJ;
    public final Function1<CreativeModel, Boolean> LJIIJJI;
    public final Function1<CreativeModel, Boolean> LJIIL;

    public C546400Lbq() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C546400Lbq)) {
            return false;
        }
        C546400Lbq c546400Lbq = (C546400Lbq) obj;
        return Intrinsics.LJFF(this.LIZ, c546400Lbq.LIZ) && this.LIZIZ == c546400Lbq.LIZIZ && Intrinsics.LJFF(this.LIZJ, c546400Lbq.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c546400Lbq.LIZLLL) && Intrinsics.LJFF(this.LJ, c546400Lbq.LJ) && Intrinsics.LJFF(this.LJFF, c546400Lbq.LJFF) && Intrinsics.LJFF(this.LJI, c546400Lbq.LJI) && Intrinsics.LJFF(this.LJII, c546400Lbq.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c546400Lbq.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c546400Lbq.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c546400Lbq.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c546400Lbq.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c546400Lbq.LJIIL);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31;
        Function1<AWEME_DRAFT, Boolean> function1 = this.LIZJ;
        int iHashCode2 = (iHashCode + (function1 == null ? 0 : function1.hashCode())) * 31;
        Function1<CreativeModel, Boolean> function12 = this.LIZLLL;
        int iHashCode3 = (iHashCode2 + (function12 == null ? 0 : function12.hashCode())) * 31;
        Function1<CreativeModel, Boolean> function13 = this.LJ;
        int iHashCode4 = (iHashCode3 + (function13 == null ? 0 : function13.hashCode())) * 31;
        Function1<CreativeModel, Boolean> function14 = this.LJFF;
        int iHashCode5 = (iHashCode4 + (function14 == null ? 0 : function14.hashCode())) * 31;
        Function2<CreativeModel, InterfaceC1364105Vn<? super Unit>, Object> function2 = this.LJI;
        int iHashCode6 = (iHashCode5 + (function2 == null ? 0 : function2.hashCode())) * 31;
        InterfaceC546480Lby<Object> interfaceC546480Lby = this.LJII;
        int iHashCode7 = (iHashCode6 + (interfaceC546480Lby == null ? 0 : interfaceC546480Lby.hashCode())) * 31;
        C1280904zn c1280904zn = this.LJIIIIZZ;
        int iHashCode8 = (iHashCode7 + (c1280904zn == null ? 0 : c1280904zn.hashCode())) * 31;
        Function1<CreativeModel, Unit> function15 = this.LJIIIZ;
        int iHashCode9 = (iHashCode8 + (function15 == null ? 0 : function15.hashCode())) * 31;
        Function2<CreativeModel, Map<String, String>, Unit> function22 = this.LJIIJ;
        int iHashCode10 = (iHashCode9 + (function22 == null ? 0 : function22.hashCode())) * 31;
        Function1<CreativeModel, Boolean> function16 = this.LJIIJJI;
        int iHashCode11 = (iHashCode10 + (function16 == null ? 0 : function16.hashCode())) * 31;
        Function1<CreativeModel, Boolean> function17 = this.LJIIL;
        return iHashCode11 + (function17 != null ? function17.hashCode() : 0);
    }

    public final String toString() {
        return "DraftConfig(saveScene=" + this.LIZ + ", saveFrom=" + this.LIZIZ + ", isAIGCDraft=" + this.LIZJ + ", enableDraftRouter=" + this.LIZLLL + ", skipBackToDraftBox=" + this.LJ + ", shouldLandingToEditPage=" + this.LJFF + ", onLocalDraftDeleted=" + this.LJI + ", onLocalDraftRestored=" + this.LJII + ", onLocalDraftRouted=" + this.LJIIIIZZ + ", onLocalDraftSaved=" + this.LJIIIZ + ", onLocalDraftRestoreFailed=" + this.LJIIJ + ", shouldFillNLEDataInSaveDraft=" + this.LJIIJJI + ", forceStartSaaWithSingleTop=" + this.LJIIL + ')';
    }

    public C546400Lbq(String str, int i, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function2 function2, InterfaceC546480Lby interfaceC546480Lby, C1280904zn c1280904zn, AFwS239S0000000_8 aFwS239S0000000_8, AFwS291S0000000_8 aFwS291S0000000_8, Function1 function15, AFwS239S0000000_8 aFwS239S0000000_82, int i2) {
        function1 = (i2 & 4) != 0 ? null : function1;
        function12 = (i2 & 8) != 0 ? null : function12;
        function13 = (i2 & 16) != 0 ? null : function13;
        function14 = (i2 & 32) != 0 ? null : function14;
        function2 = (i2 & 64) != 0 ? null : function2;
        interfaceC546480Lby = (i2 & 128) != 0 ? null : interfaceC546480Lby;
        c1280904zn = (i2 & 256) != 0 ? null : c1280904zn;
        aFwS239S0000000_8 = (i2 & 512) != 0 ? null : aFwS239S0000000_8;
        aFwS291S0000000_8 = (i2 & 1024) != 0 ? null : aFwS291S0000000_8;
        function15 = (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : function15;
        AFwS239S0000000_8 aFwS239S0000000_83 = (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0 ? aFwS239S0000000_82 : null;
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = function1;
        this.LIZLLL = function12;
        this.LJ = function13;
        this.LJFF = function14;
        this.LJI = function2;
        this.LJII = interfaceC546480Lby;
        this.LJIIIIZZ = c1280904zn;
        this.LJIIIZ = aFwS239S0000000_8;
        this.LJIIJ = aFwS291S0000000_8;
        this.LJIIJJI = function15;
        this.LJIIL = aFwS239S0000000_83;
    }
}
