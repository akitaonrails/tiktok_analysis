package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: renamed from: X.0dEV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1042410dEV {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final C1035880d3y LJFF;
    public final int LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final Boolean LJIIIZ;
    public long LJIIJ;

    public C1042410dEV(String str, String str2, String str3, String str4, String str5, C1035880d3y c1035880d3y, int i, String str6, String str7, Boolean bool, int i2) {
        long jCurrentTimeMillis;
        i = (i2 & 64) != 0 ? 0 : i;
        str6 = (i2 & 128) != 0 ? "" : str6;
        str7 = (i2 & 512) != 0 ? "" : str7;
        bool = (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : bool;
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
        } else {
            jCurrentTimeMillis = 0;
        }
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = c1035880d3y;
        this.LJI = i;
        this.LJII = str6;
        this.LJIIIIZZ = str7;
        this.LJIIIZ = bool;
        this.LJIIJ = jCurrentTimeMillis;
    }
}
