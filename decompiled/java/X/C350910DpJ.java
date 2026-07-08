package X;

import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: renamed from: X.0DpJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C350910DpJ {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public final Long LJFF;
    public final Long LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final int LJIIIZ;
    public final int LJIIJ;
    public final NLETrack LJIIJJI;
    public final NLETrackSlot LJIIL;

    public C350910DpJ(String str, String str2, String str3, float f, float f2, Long l, Long l2, String str4, String str5, int i, int i2, NLETrack nLETrack, NLETrackSlot nLETrackSlot, int i3) {
        Long l3 = l;
        Long l4 = l2;
        String str6 = str4;
        String str7 = str5;
        int i4 = i;
        NLETrack nLETrack2 = nLETrack;
        str3 = (i3 & 4) != 0 ? null : str3;
        f = (i3 & 8) != 0 ? 0.5f : f;
        float f3 = (i3 & 16) == 0 ? f2 : 0.5f;
        l3 = (i3 & 32) != 0 ? null : l3;
        l4 = (i3 & 64) != 0 ? null : l4;
        str6 = (i3 & 128) != 0 ? null : str6;
        str7 = (i3 & 512) != 0 ? null : str7;
        i4 = (i3 & 1024) != 0 ? 0 : i4;
        int i5 = (i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 0 ? i2 : 0;
        nLETrack2 = (i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : nLETrack2;
        NLETrackSlot nLETrackSlot2 = (i3 & 8192) == 0 ? nLETrackSlot : null;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = f;
        this.LJ = f3;
        this.LJFF = l3;
        this.LJI = l4;
        this.LJII = str6;
        this.LJIIIIZZ = str7;
        this.LJIIIZ = i4;
        this.LJIIJ = i5;
        this.LJIIJJI = nLETrack2;
        this.LJIIL = nLETrackSlot2;
    }
}
