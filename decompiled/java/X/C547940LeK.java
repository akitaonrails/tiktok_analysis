package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.aikit.api.common.task.TaskLifecycleInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.aigc.AICrtInfo;
import com.ss.android.ugc.aweme.creative.model.common.InputBlock;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LeK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C547940LeK {
    public final boolean LIZ;
    public final String LIZIZ;
    public final Function1<CreativeModel, List<InputBlock>> LIZJ;
    public final Function1<CreativeModel, Boolean> LIZLLL;
    public final Function1<CreativeModel, String> LJ;
    public final Function1<CreativeModel, Map<String, String>> LJFF;
    public final Function1<CreativeModel, List<AICrtInfo>> LJI;
    public final Function2<CreativeModel, TaskLifecycleInfo, Unit> LJII;
    public final Function2<CreativeModel, Integer, Unit> LJIIIIZZ;
    public final C547950LeL LJIIIZ;
    public final C547960LeM LJIIJ;
    public final C1895707bf LJIIJJI;
    public final Function1<CreativeModel, Unit> LJIIL;

    public C547940LeK() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 8191);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C547940LeK)) {
            return false;
        }
        C547940LeK c547940LeK = (C547940LeK) obj;
        return this.LIZ == c547940LeK.LIZ && Intrinsics.LJFF(this.LIZIZ, c547940LeK.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c547940LeK.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c547940LeK.LIZLLL) && Intrinsics.LJFF(this.LJ, c547940LeK.LJ) && Intrinsics.LJFF(this.LJFF, c547940LeK.LJFF) && Intrinsics.LJFF(this.LJI, c547940LeK.LJI) && Intrinsics.LJFF(this.LJII, c547940LeK.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c547940LeK.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c547940LeK.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c547940LeK.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c547940LeK.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c547940LeK.LJIIL);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LIZ) * 31;
        String str = this.LIZIZ;
        int iHashCode = (iZ2 + (str == null ? 0 : str.hashCode())) * 31;
        Function1<CreativeModel, List<InputBlock>> function1 = this.LIZJ;
        int iHashCode2 = (iHashCode + (function1 == null ? 0 : function1.hashCode())) * 31;
        Function1<CreativeModel, Boolean> function12 = this.LIZLLL;
        int iHashCode3 = (iHashCode2 + (function12 == null ? 0 : function12.hashCode())) * 31;
        Function1<CreativeModel, String> function13 = this.LJ;
        int iHashCode4 = (iHashCode3 + (function13 == null ? 0 : function13.hashCode())) * 31;
        Function1<CreativeModel, Map<String, String>> function14 = this.LJFF;
        int iHashCode5 = (iHashCode4 + (function14 == null ? 0 : function14.hashCode())) * 31;
        Function1<CreativeModel, List<AICrtInfo>> function15 = this.LJI;
        int iHashCode6 = (iHashCode5 + (function15 == null ? 0 : function15.hashCode())) * 31;
        Function2<CreativeModel, TaskLifecycleInfo, Unit> function2 = this.LJII;
        int iHashCode7 = (iHashCode6 + (function2 == null ? 0 : function2.hashCode())) * 31;
        Function2<CreativeModel, Integer, Unit> function22 = this.LJIIIIZZ;
        int iHashCode8 = (iHashCode7 + (function22 == null ? 0 : function22.hashCode())) * 31;
        C547950LeL c547950LeL = this.LJIIIZ;
        int iHashCode9 = (iHashCode8 + (c547950LeL == null ? 0 : c547950LeL.hashCode())) * 31;
        C547960LeM c547960LeM = this.LJIIJ;
        int iHashCode10 = (iHashCode9 + (c547960LeM == null ? 0 : c547960LeM.hashCode())) * 31;
        C1895707bf c1895707bf = this.LJIIJJI;
        int iHashCode11 = (iHashCode10 + (c1895707bf == null ? 0 : c1895707bf.hashCode())) * 31;
        Function1<CreativeModel, Unit> function16 = this.LJIIL;
        return iHashCode11 + (function16 != null ? function16.hashCode() : 0);
    }

    public final String toString() {
        return "PublishConfig(supportInviteCollab=" + this.LIZ + ", aigcSafetyConst=" + this.LIZIZ + ", promptTextInPublishPage=" + this.LIZJ + ", forceNoneDeleteCaptionPrefix=" + this.LIZLLL + ", hashTagInPublish=" + this.LJ + ", awemeField=" + this.LJFF + ", awemeAICrtField=" + this.LJI + ", onTaskDetailInfo=" + this.LJII + ", onPublishAuthError=" + this.LJIIIIZZ + ", watermarkConfig=" + this.LJIIIZ + ", anchorConfig=" + this.LJIIJ + ", videoVisibilityConfig=" + this.LJIIJJI + ", onPublishStart=" + this.LJIIL + ')';
    }

    public C547940LeK(String str, Function1 function1, Function1 function12, AFwS232S0000000_4 aFwS232S0000000_4, Function1 function13, Function1 function14, Function2 function2, Function2 function22, C547950LeL c547950LeL, C547960LeM c547960LeM, C1895707bf c1895707bf, AFwS239S0000000_8 aFwS239S0000000_8, int i) {
        boolean z;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        str = (i & 2) != 0 ? null : str;
        function1 = (i & 4) != 0 ? null : function1;
        function12 = (i & 8) != 0 ? null : function12;
        aFwS232S0000000_4 = (i & 16) != 0 ? null : aFwS232S0000000_4;
        function13 = (i & 32) != 0 ? null : function13;
        function14 = (i & 64) != 0 ? null : function14;
        function2 = (i & 128) != 0 ? null : function2;
        function22 = (i & 256) != 0 ? null : function22;
        c547950LeL = (i & 512) != 0 ? null : c547950LeL;
        c547960LeM = (i & 1024) != 0 ? null : c547960LeM;
        c1895707bf = (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : c1895707bf;
        AFwS239S0000000_8 aFwS239S0000000_82 = (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0 ? aFwS239S0000000_8 : null;
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZJ = function1;
        this.LIZLLL = function12;
        this.LJ = aFwS232S0000000_4;
        this.LJFF = function13;
        this.LJI = function14;
        this.LJII = function2;
        this.LJIIIIZZ = function22;
        this.LJIIIZ = c547950LeL;
        this.LJIIJ = c547960LeM;
        this.LJIIJJI = c1895707bf;
        this.LJIIL = aFwS239S0000000_82;
    }
}
