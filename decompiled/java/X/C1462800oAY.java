package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: renamed from: X.0oAY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1462800oAY {
    public final boolean LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final boolean LJI;
    public final String LJII;
    public final boolean LJIIIIZZ;
    public final int LJIIIZ;
    public final String LJIIJ;
    public final int LJIIJJI;
    public final String LJIIL;
    public final int LJIILIIL;
    public final String LJIILJJIL;
    public final String LJIILL;
    public final Boolean LJIILLIIL;

    public C1462800oAY(boolean z, String str, int i, String str2, String str3, String str4, boolean z2, String str5, boolean z3, int i2, String str6, int i3, String str7, int i4, String str8, String str9, Boolean bool) {
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZJ = i;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = str4;
        this.LJI = z2;
        this.LJII = str5;
        this.LJIIIIZZ = z3;
        this.LJIIIZ = i2;
        this.LJIIJ = str6;
        this.LJIIJJI = i3;
        this.LJIIL = str7;
        this.LJIILIIL = i4;
        this.LJIILJJIL = str8;
        this.LJIILL = str9;
        this.LJIILLIIL = bool;
    }

    public /* synthetic */ C1462800oAY(boolean z, String str, int i, String str2, String str3, String str4, boolean z2, String str5, boolean z3, int i2, String str6, int i3, String str7, int i4, String str8, String str9, Boolean bool, String str10, int i5) {
        this((i5 & 1) != 0 ? false : z, str, (i5 & 4) != 0 ? 0 : i, (i5 & 8) != 0 ? null : str2, (i5 & 16) != 0 ? null : str3, str4, z2, (i5 & 128) != 0 ? "" : str5, (i5 & 256) != 0 ? false : z3, (i5 & 512) != 0 ? 0 : i2, (i5 & 1024) == 0 ? str6 : "", (i5 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? 0 : i3, (i5 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : str7, (i5 & 8192) != 0 ? 0 : i4, (i5 & 16384) != 0 ? null : str8, (32768 & i5) == 0 ? str9 : null, (i5 & 65536) != 0 ? Boolean.FALSE : bool);
    }
}
