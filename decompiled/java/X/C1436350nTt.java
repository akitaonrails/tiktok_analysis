package X;

import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0nTt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1436350nTt {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public final VideoPublishEditModel LJ;
    public final NLENode LJFF;
    public final boolean LJI;
    public final SynthetiseResult LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final long LJIIJ;
    public final int LJIIJJI;

    public final String toString() {
        return "SaveLocalInfo(creationId=" + this.LIZ + ", publishId=" + this.LIZIZ + ", flowId=" + this.LIZJ + ", isEdited=" + this.LIZLLL + ", realModel=" + this.LJ + ", originalNode=" + this.LJFF + ", needRestart=" + this.LJI + ", compileResult=" + this.LJII + ", isImageMode=" + this.LJIIIIZZ + ", hasStickers=" + this.LJIIIZ + ", startTime=" + this.LJIIJ + ", lastProgress=" + this.LJIIJJI + ')';
    }

    public static C1436350nTt LIZ(C1436350nTt c1436350nTt, String str, boolean z, VideoPublishEditModel videoPublishEditModel, boolean z2, SynthetiseResult synthetiseResult, int i, int i2) {
        String str2;
        String str3;
        boolean z3;
        boolean z4;
        long j;
        int i3 = i;
        boolean z5 = z;
        SynthetiseResult synthetiseResult2 = synthetiseResult;
        boolean z6 = z2;
        VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
        String str4 = str;
        NLENode nLENode = null;
        if ((i2 & 1) != 0) {
            str2 = c1436350nTt.LIZ;
        } else {
            str2 = null;
        }
        if ((i2 & 2) != 0) {
            str4 = c1436350nTt.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            str3 = c1436350nTt.LIZJ;
        } else {
            str3 = null;
        }
        if ((i2 & 8) != 0) {
            z5 = c1436350nTt.LIZLLL;
        }
        if ((i2 & 16) != 0) {
            videoPublishEditModel2 = c1436350nTt.LJ;
        }
        if ((i2 & 32) != 0) {
            nLENode = c1436350nTt.LJFF;
        }
        if ((i2 & 64) != 0) {
            z6 = c1436350nTt.LJI;
        }
        if ((i2 & 128) != 0) {
            synthetiseResult2 = c1436350nTt.LJII;
        }
        if ((i2 & 256) != 0) {
            z3 = c1436350nTt.LJIIIIZZ;
        } else {
            z3 = false;
        }
        if ((i2 & 512) != 0) {
            z4 = c1436350nTt.LJIIIZ;
        } else {
            z4 = false;
        }
        if ((i2 & 1024) != 0) {
            j = c1436350nTt.LJIIJ;
        } else {
            j = 0;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            i3 = c1436350nTt.LJIIJJI;
        }
        return new C1436350nTt(str2, str4, str3, z5, videoPublishEditModel2, nLENode, z6, synthetiseResult2, z3, z4, j, i3);
    }

    public C1436350nTt(String str, String str2, String str3, boolean z, VideoPublishEditModel videoPublishEditModel, NLENode nLENode, boolean z2, SynthetiseResult synthetiseResult, boolean z3, boolean z4, long j, int i) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = z;
        this.LJ = videoPublishEditModel;
        this.LJFF = nLENode;
        this.LJI = z2;
        this.LJII = synthetiseResult;
        this.LJIIIIZZ = z3;
        this.LJIIIZ = z4;
        this.LJIIJ = j;
        this.LJIIJJI = i;
    }
}
