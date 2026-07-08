package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: renamed from: X.0Ke9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C522350Ke9 {
    public final String LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final long LJI;
    public String LJII;
    public final String LJIIIIZZ;
    public boolean LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;

    public C522350Ke9(String str, int i, String str2, String str3, String str4, String str5, long j, String str6, String str7, int i2, int i3, int i4) {
        str = (i4 & 1) != 0 ? "" : str;
        i = (i4 & 2) != 0 ? -1 : i;
        str2 = (i4 & 4) != 0 ? "" : str2;
        str3 = (i4 & 8) != 0 ? "" : str3;
        str4 = (i4 & 16) != 0 ? "" : str4;
        str5 = (i4 & 32) != 0 ? "" : str5;
        j = (i4 & 64) != 0 ? 0L : j;
        str6 = (i4 & 128) != 0 ? "" : str6;
        str7 = (i4 & 256) != 0 ? "" : str7;
        i2 = (i4 & 1024) != 0 ? 0 : i2;
        i3 = (i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? 0 : i3;
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = str5;
        this.LJI = j;
        this.LJII = str6;
        this.LJIIIIZZ = str7;
        this.LJIIIZ = false;
        this.LJIIJ = i2;
        this.LJIIJJI = i3;
    }
}
