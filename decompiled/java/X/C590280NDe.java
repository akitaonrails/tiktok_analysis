package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: renamed from: X.0NDe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C590280NDe {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final C5186020i LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final boolean LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final long LJIIIZ;
    public final long LJIIJ;
    public final String LJIIJJI;
    public final int LJIIL;
    public final String LJIILIIL;
    public final double LJIILJJIL;
    public final String LJIILL;
    public final float LJIILLIIL;
    public final String LJIIZILJ;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C590280NDe(String str, int i, C5186020i c5186020i, String str2, String str3, long j, String str4, String str5, float f, String str6, int i2) {
        String str7;
        int i3;
        float f2 = f;
        String str8 = str5;
        String str9 = str4;
        long j2 = j;
        String str10 = str3;
        String str11 = str2;
        C5186020i c5186020i2 = c5186020i;
        int i4 = i;
        if ((i2 & 2) != 0) {
            str7 = "";
        } else {
            str7 = null;
        }
        i4 = (i2 & 4) != 0 ? 0 : i4;
        c5186020i2 = (i2 & 8) != 0 ? null : c5186020i2;
        str11 = (i2 & 16) != 0 ? null : str11;
        str10 = (i2 & 32) != 0 ? null : str10;
        j2 = (i2 & 512) != 0 ? 0L : j2;
        str9 = (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? "" : str9;
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            i3 = -1;
        } else {
            i3 = 0;
        }
        this(str, str7, i4, c5186020i2, str11, str10, false, 0, 0, j2, 0L, str9, i3, (i2 & 8192) != 0 ? "" : null, 0.0d, (32768 & i2) != 0 ? "" : str8, (65536 & i2) != 0 ? 0.0f : f2, (i2 & 131072) == 0 ? str6 : "");
    }

    public C590280NDe(String str, String str2, int i, C5186020i c5186020i, String str3, String str4, boolean z, int i2, int i3, long j, long j2, String str5, int i4, String str6, double d, String str7, float f, String str8) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i;
        this.LIZLLL = c5186020i;
        this.LJ = str3;
        this.LJFF = str4;
        this.LJI = z;
        this.LJII = i2;
        this.LJIIIIZZ = i3;
        this.LJIIIZ = j;
        this.LJIIJ = j2;
        this.LJIIJJI = str5;
        this.LJIIL = i4;
        this.LJIILIIL = str6;
        this.LJIILJJIL = d;
        this.LJIILL = str7;
        this.LJIILLIIL = f;
        this.LJIIZILJ = str8;
    }
}
