package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.gamora.editorpro.aiediting.aigc.logic.dynamicmodel.AICreateModelTag;
import com.ss.android.ugc.gamora.editorpro.aiediting.aigc.logic.dynamicmodel.ImageGenTaskConfig;
import com.ss.android.ugc.gamora.editorpro.aiediting.aigc.logic.dynamicmodel.VideoGenTaskConfig;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EvR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C380190EvR {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final Boolean LJIIIIZZ;
    public final List<ImageGenTaskConfig> LJIIIZ;
    public final List<VideoGenTaskConfig> LJIIJ;
    public final List<AICreateModelTag> LJIIJJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C380190EvR)) {
            return false;
        }
        C380190EvR c380190EvR = (C380190EvR) obj;
        return Intrinsics.LJFF(this.LIZ, c380190EvR.LIZ) && Intrinsics.LJFF(this.LIZIZ, c380190EvR.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c380190EvR.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c380190EvR.LIZLLL) && this.LJ == c380190EvR.LJ && this.LJFF == c380190EvR.LJFF && this.LJI == c380190EvR.LJI && this.LJII == c380190EvR.LJII && Intrinsics.LJFF(this.LJIIIIZZ, c380190EvR.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c380190EvR.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c380190EvR.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c380190EvR.LJIIJJI);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        String str = this.LIZLLL;
        int iHashCode2 = (((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LJ) * 31) + this.LJFF) * 31) + C786410Ut5.Z2(this.LJI)) * 31) + C786410Ut5.Z2(this.LJII)) * 31;
        Boolean bool = this.LJIIIIZZ;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<ImageGenTaskConfig> list = this.LJIIIZ;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<VideoGenTaskConfig> list2 = this.LJIIJ;
        return ((iHashCode4 + (list2 != null ? list2.hashCode() : 0)) * 31) + this.LJIIJJI.hashCode();
    }

    public final String toString() {
        return "EPAIGCModelItem(displayName=" + this.LIZ + ", displayRemark=" + this.LIZIZ + ", reqKey=" + this.LIZJ + ", iconUrl=" + this.LIZLLL + ", quota=" + this.LJ + ", quotaTotal=" + this.LJFF + ", isVideoModel=" + this.LJI + ", modelByOwn=" + this.LJII + ", haveAudio=" + this.LJIIIIZZ + ", imageGenTasks=" + this.LJIIIZ + ", videoGenTasks=" + this.LJIIJ + ", modelTags=" + this.LJIIJJI + ')';
    }

    public static C380190EvR LIZ(C380190EvR c380190EvR, String str, int i, int i2, int i3) {
        String str2;
        String str3;
        String str4;
        boolean z;
        boolean z2;
        Boolean bool;
        List<ImageGenTaskConfig> list;
        List<VideoGenTaskConfig> list2;
        int i4 = i2;
        int i5 = i;
        String str5 = str;
        List<AICreateModelTag> list3 = null;
        if ((i3 & 1) != 0) {
            str2 = c380190EvR.LIZ;
        } else {
            str2 = null;
        }
        if ((i3 & 2) != 0) {
            str5 = c380190EvR.LIZIZ;
        }
        if ((i3 & 4) != 0) {
            str3 = c380190EvR.LIZJ;
        } else {
            str3 = null;
        }
        if ((i3 & 8) != 0) {
            str4 = c380190EvR.LIZLLL;
        } else {
            str4 = null;
        }
        if ((i3 & 16) != 0) {
            i5 = c380190EvR.LJ;
        }
        if ((i3 & 32) != 0) {
            i4 = c380190EvR.LJFF;
        }
        if ((i3 & 64) != 0) {
            z = c380190EvR.LJI;
        } else {
            z = false;
        }
        if ((i3 & 128) != 0) {
            z2 = c380190EvR.LJII;
        } else {
            z2 = false;
        }
        if ((i3 & 256) != 0) {
            bool = c380190EvR.LJIIIIZZ;
        } else {
            bool = null;
        }
        if ((i3 & 512) != 0) {
            list = c380190EvR.LJIIIZ;
        } else {
            list = null;
        }
        if ((i3 & 1024) != 0) {
            list2 = c380190EvR.LJIIJ;
        } else {
            list2 = null;
        }
        if ((i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            list3 = c380190EvR.LJIIJJI;
        }
        return new C380190EvR(str2, str5, str3, str4, i5, i4, z, z2, bool, list, list2, list3);
    }

    public C380190EvR(String str, String str2, String str3, String str4, int i, int i2, boolean z, boolean z2, Boolean bool, List<ImageGenTaskConfig> list, List<VideoGenTaskConfig> list2, List<AICreateModelTag> list3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = i;
        this.LJFF = i2;
        this.LJI = z;
        this.LJII = z2;
        this.LJIIIIZZ = bool;
        this.LJIIIZ = list;
        this.LJIIJ = list2;
        this.LJIIJJI = list3;
    }
}
