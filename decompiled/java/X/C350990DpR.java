package X;

import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: renamed from: X.0DpR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C350990DpR {
    public final Long LIZ;
    public final Long LIZIZ;
    public final Integer LIZJ;
    public final Boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final NLETrack LJIIJ;
    public final boolean LJIIJJI;

    public C350990DpR(Long l, Long l2, Integer num, Boolean bool, boolean z, boolean z2, boolean z3, NLETrack nLETrack, int i) {
        boolean z4;
        boolean z5;
        l = (i & 1) != 0 ? null : l;
        l2 = (i & 2) != 0 ? null : l2;
        num = (i & 4) != 0 ? null : num;
        bool = (i & 8) != 0 ? Boolean.FALSE : bool;
        z = (i & 32) != 0 ? false : z;
        z2 = (i & 64) != 0 ? false : z2;
        z3 = (i & 128) != 0 ? false : z3;
        if ((i & 256) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if ((i & 512) != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        nLETrack = (i & 1024) != 0 ? null : nLETrack;
        boolean z6 = (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0;
        this.LIZ = l;
        this.LIZIZ = l2;
        this.LIZJ = num;
        this.LIZLLL = bool;
        this.LJ = false;
        this.LJFF = z;
        this.LJI = z2;
        this.LJII = z3;
        this.LJIIIIZZ = z4;
        this.LJIIIZ = z5;
        this.LJIIJ = nLETrack;
        this.LJIIJJI = z6;
    }
}
