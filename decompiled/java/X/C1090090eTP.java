package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: renamed from: X.0eTP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1090090eTP {
    public long LIZ;
    public String LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public long LJ;
    public String LJFF;
    public boolean LJI;
    public boolean LJII;
    public final long LJIIIIZZ;
    public final Integer LJIIIZ;
    public final Integer LJIIJ;
    public final String LJIIJJI;
    public final String LJIIL;

    public C1090090eTP(long j, String str, long j2, long j3, long j4, long j5, Integer num, Integer num2, String str2, String str3, int i) {
        long j6 = j2;
        String str4 = str;
        long j7 = j3;
        long j8 = j4;
        String str5 = str3;
        String str6 = str2;
        Integer num3 = num2;
        Integer num4 = num;
        long j9 = (i & 1) != 0 ? 0L : j;
        str4 = (i & 2) != 0 ? "" : str4;
        j6 = (i & 4) != 0 ? 0L : j6;
        j7 = (i & 8) != 0 ? 0L : j7;
        j8 = (i & 16) != 0 ? -1L : j8;
        String str7 = (i & 32) == 0 ? null : "";
        long j10 = (i & 256) == 0 ? j5 : 0L;
        num4 = (i & 512) != 0 ? null : num4;
        num3 = (i & 1024) != 0 ? null : num3;
        str6 = (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : str6;
        str5 = (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : str5;
        this.LIZ = j9;
        this.LIZIZ = str4;
        this.LIZJ = j6;
        this.LIZLLL = j7;
        this.LJ = j8;
        this.LJFF = str7;
        this.LJI = false;
        this.LJII = false;
        this.LJIIIIZZ = j10;
        this.LJIIIZ = num4;
        this.LJIIJ = num3;
        this.LJIIJJI = str6;
        this.LJIIL = str5;
    }
}
