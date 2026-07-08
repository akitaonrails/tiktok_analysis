package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: renamed from: X.0oAd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1462850oAd {
    public final boolean LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final int LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;
    public final String LJIIJ;
    public final int LJIIJJI;
    public final int LJIIL;
    public final int LJIILIIL;
    public final int LJIILJJIL;
    public final int LJIILL;
    public final Integer LJIILLIIL;

    public C1462850oAd(boolean z, String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, int i4, String str6, int i5, int i6, int i7, int i8, int i9, Integer num, int i10) {
        String str7 = str3;
        String str8 = str2;
        String str9 = str;
        int i11 = i2;
        int i12 = i;
        String str10 = str5;
        String str11 = str4;
        int i13 = i6;
        int i14 = i5;
        int i15 = i4;
        int i16 = i3;
        Integer num2 = num;
        int i17 = i8;
        int i18 = i9;
        int i19 = i7;
        boolean z2 = (i10 & 1) != 0 ? false : z;
        str9 = (i10 & 2) != 0 ? "" : str9;
        str8 = (i10 & 4) != 0 ? "" : str8;
        str7 = (i10 & 8) != 0 ? "" : str7;
        str11 = (i10 & 16) != 0 ? "" : str11;
        str10 = (i10 & 32) != 0 ? "" : str10;
        i12 = (i10 & 64) != 0 ? 0 : i12;
        i11 = (i10 & 128) != 0 ? 0 : i11;
        i16 = (i10 & 256) != 0 ? 0 : i16;
        i15 = (i10 & 512) != 0 ? 0 : i15;
        String str12 = (i10 & 1024) == 0 ? str6 : "";
        i14 = (i10 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? 0 : i14;
        i13 = (i10 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? 0 : i13;
        i19 = (i10 & 8192) != 0 ? 0 : i19;
        i17 = (i10 & 16384) != 0 ? 0 : i17;
        i18 = (32768 & i10) != 0 ? 0 : i18;
        num2 = (i10 & 65536) != 0 ? null : num2;
        this.LIZ = z2;
        this.LIZIZ = str9;
        this.LIZJ = str8;
        this.LIZLLL = str7;
        this.LJ = str11;
        this.LJFF = str10;
        this.LJI = i12;
        this.LJII = i11;
        this.LJIIIIZZ = i16;
        this.LJIIIZ = i15;
        this.LJIIJ = str12;
        this.LJIIJJI = i14;
        this.LJIIL = i13;
        this.LJIILIIL = i19;
        this.LJIILJJIL = i17;
        this.LJIILL = i18;
        this.LJIILLIIL = num2;
    }
}
