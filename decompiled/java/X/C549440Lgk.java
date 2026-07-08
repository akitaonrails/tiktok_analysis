package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS291S0000000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Lgk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C549440Lgk {
    public final Function1<CreativeModel, String> LIZ;
    public final Function2<C0LAB, CreativeModel, Unit> LIZIZ;
    public final Function2<C0LAB, CreativeModel, Unit> LIZJ;
    public final Function2<C0LAB, CreativeModel, Unit> LIZLLL;
    public final Function2<C0LAB, CreativeModel, Unit> LJ;
    public final Function2<C0LAB, CreativeModel, Unit> LJFF;
    public final Function2<C0LAB, CreativeModel, Unit> LJI;
    public final Function2<C0LAB, CreativeModel, Unit> LJII;
    public final Function2<C0LAB, CreativeModel, Unit> LJIIIIZZ;
    public final Function2<C0LAB, CreativeModel, Unit> LJIIIZ;
    public final Function2<C0LAB, CreativeModel, Unit> LJIIJ;
    public final Function1<CreativeModel, String> LJIIJJI;
    public final Function2<C0LAB, CreativeModel, Unit> LJIIL;
    public final Function2<C2344009Gk, Aweme, Unit> LJIILIIL;

    public C549440Lgk() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C549440Lgk)) {
            return false;
        }
        C549440Lgk c549440Lgk = (C549440Lgk) obj;
        return Intrinsics.LJFF(this.LIZ, c549440Lgk.LIZ) && Intrinsics.LJFF(this.LIZIZ, c549440Lgk.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c549440Lgk.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c549440Lgk.LIZLLL) && Intrinsics.LJFF(this.LJ, c549440Lgk.LJ) && Intrinsics.LJFF(this.LJFF, c549440Lgk.LJFF) && Intrinsics.LJFF(this.LJI, c549440Lgk.LJI) && Intrinsics.LJFF(this.LJII, c549440Lgk.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c549440Lgk.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c549440Lgk.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c549440Lgk.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c549440Lgk.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c549440Lgk.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c549440Lgk.LJIILIIL);
    }

    public final int hashCode() {
        Function1<CreativeModel, String> function1 = this.LIZ;
        int iHashCode = (function1 == null ? 0 : function1.hashCode()) * 31;
        Function2<C0LAB, CreativeModel, Unit> function2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (function2 == null ? 0 : function2.hashCode())) * 31;
        Function2<C0LAB, CreativeModel, Unit> function22 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (function22 == null ? 0 : function22.hashCode())) * 31;
        Function2<C0LAB, CreativeModel, Unit> function23 = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (function23 == null ? 0 : function23.hashCode())) * 31;
        Function2<C0LAB, CreativeModel, Unit> function24 = this.LJ;
        int iHashCode5 = (iHashCode4 + (function24 == null ? 0 : function24.hashCode())) * 31;
        Function2<C0LAB, CreativeModel, Unit> function25 = this.LJFF;
        int iHashCode6 = (iHashCode5 + (function25 == null ? 0 : function25.hashCode())) * 31;
        Function2<C0LAB, CreativeModel, Unit> function26 = this.LJI;
        int iHashCode7 = (iHashCode6 + (function26 == null ? 0 : function26.hashCode())) * 31;
        Function2<C0LAB, CreativeModel, Unit> function27 = this.LJII;
        int iHashCode8 = (iHashCode7 + (function27 == null ? 0 : function27.hashCode())) * 31;
        Function2<C0LAB, CreativeModel, Unit> function28 = this.LJIIIIZZ;
        int iHashCode9 = (iHashCode8 + (function28 == null ? 0 : function28.hashCode())) * 31;
        Function2<C0LAB, CreativeModel, Unit> function29 = this.LJIIIZ;
        int iHashCode10 = (iHashCode9 + (function29 == null ? 0 : function29.hashCode())) * 31;
        Function2<C0LAB, CreativeModel, Unit> function210 = this.LJIIJ;
        int iHashCode11 = (iHashCode10 + (function210 == null ? 0 : function210.hashCode())) * 31;
        Function1<CreativeModel, String> function12 = this.LJIIJJI;
        int iHashCode12 = (iHashCode11 + (function12 == null ? 0 : function12.hashCode())) * 31;
        Function2<C0LAB, CreativeModel, Unit> function211 = this.LJIIL;
        int iHashCode13 = (iHashCode12 + (function211 == null ? 0 : function211.hashCode())) * 31;
        Function2<C2344009Gk, Aweme, Unit> function212 = this.LJIILIIL;
        return iHashCode13 + (function212 != null ? function212.hashCode() : 0);
    }

    public final String toString() {
        return "MobConfig(fetchAIContentSource=" + this.LIZ + ", appendPublishParams=" + this.LIZIZ + ", appendEnterVideoPostPageParams=" + this.LIZJ + ", appendPublishFinishParams=" + this.LIZLLL + ", appendDownloadParams=" + this.LJ + ", appendSaveDraftParams=" + this.LJFF + ", appendEditDraftParams=" + this.LJI + ", appendEnterVideoEditPageParams=" + this.LJII + ", appendClickSaveLocalOnEditPageParams=" + this.LJIIIIZZ + ", onDmSharePanelClickMobParams=" + this.LJIIIZ + ", onSendToDMClicked=" + this.LJIIJ + ", getEditPageEnterFrom=" + this.LJIIJJI + ", appendDraftSubEventParams=" + this.LJIIL + ", appendAICreationParam=" + this.LJIILIIL + ')';
    }

    public C549440Lgk(Function1 function1, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25, AFwS291S0000000_8 aFwS291S0000000_8, Function2 function26, Function2 function27, Function2 function28, Function2 function29, Function1 function12, Function2 function210, AFwS291S0000000_8 aFwS291S0000000_82, int i) {
        Function2 function211 = function2;
        Function2 function212 = function22;
        Function2 function213 = function23;
        Function2 function214 = function24;
        Function2 function215 = function25;
        AFwS291S0000000_8 aFwS291S0000000_83 = aFwS291S0000000_8;
        Function2 function216 = function26;
        Function2 function217 = function27;
        Function2 function218 = function28;
        Function2 function219 = function29;
        Function1 function13 = function12;
        Function2 function220 = function210;
        Function1 function14 = (i & 1) != 0 ? null : function1;
        function211 = (i & 2) != 0 ? null : function211;
        function212 = (i & 4) != 0 ? null : function212;
        function213 = (i & 8) != 0 ? null : function213;
        function214 = (i & 16) != 0 ? null : function214;
        function215 = (i & 32) != 0 ? null : function215;
        aFwS291S0000000_83 = (i & 64) != 0 ? null : aFwS291S0000000_83;
        function216 = (i & 128) != 0 ? null : function216;
        function217 = (i & 256) != 0 ? null : function217;
        function218 = (i & 512) != 0 ? null : function218;
        function219 = (i & 1024) != 0 ? null : function219;
        function13 = (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : function13;
        function220 = (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : function220;
        AFwS291S0000000_8 aFwS291S0000000_84 = (i & 8192) == 0 ? aFwS291S0000000_82 : null;
        this.LIZ = function14;
        this.LIZIZ = function211;
        this.LIZJ = function212;
        this.LIZLLL = function213;
        this.LJ = function214;
        this.LJFF = function215;
        this.LJI = aFwS291S0000000_83;
        this.LJII = function216;
        this.LJIIIIZZ = function217;
        this.LJIIIZ = function218;
        this.LJIIJ = function219;
        this.LJIIJJI = function13;
        this.LJIIL = function220;
        this.LJIILIIL = aFwS291S0000000_84;
    }
}
