package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: renamed from: X.0gJw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1161100gJw {
    public final int LIZ;
    public final int LIZIZ;
    public final EnumC1160590gJ7 LIZJ;
    public final String LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final int LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;
    public final int LJIIJ;
    public final int LJIIJJI;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1161100gJw() {
        int i = 0;
        this(i, i, null, 4095);
    }

    public /* synthetic */ C1161100gJw(int i, int i2, EnumC1160590gJ7 enumC1160590gJ7, int i3) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? EnumC1160590gJ7.LIST : enumC1160590gJ7, null, (i3 & 16) != 0 ? 1 : 0, 0, 0, 0, 0, 0, 0, 0);
    }

    public C1161100gJw(int i, int i2, EnumC1160590gJ7 enumC1160590gJ7, String str, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = enumC1160590gJ7;
        this.LIZLLL = str;
        this.LJ = i3;
        this.LJFF = i4;
        this.LJI = i5;
        this.LJII = i6;
        this.LJIIIIZZ = i7;
        this.LJIIIZ = i8;
        this.LJIIJ = i9;
        this.LJIIJJI = i10;
    }

    public static C1161100gJw LIZ(C1161100gJw c1161100gJw, int i, int i2, EnumC1160590gJ7 enumC1160590gJ7, String str, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        int i12 = i10;
        int i13 = i9;
        int i14 = i8;
        int i15 = i7;
        int i16 = i6;
        int i17 = i5;
        int i18 = i4;
        int i19 = i3;
        String str2 = str;
        EnumC1160590gJ7 enumC1160590gJ72 = enumC1160590gJ7;
        int i20 = i2;
        int i21 = i;
        if ((i11 & 1) != 0) {
            i21 = c1161100gJw.LIZ;
        }
        if ((i11 & 2) != 0) {
            i20 = c1161100gJw.LIZIZ;
        }
        if ((i11 & 4) != 0) {
            enumC1160590gJ72 = c1161100gJw.LIZJ;
        }
        if ((i11 & 8) != 0) {
            str2 = c1161100gJw.LIZLLL;
        }
        if ((i11 & 16) != 0) {
            i19 = c1161100gJw.LJ;
        }
        if ((i11 & 32) != 0) {
            i18 = c1161100gJw.LJFF;
        }
        if ((i11 & 64) != 0) {
            i17 = c1161100gJw.LJI;
        }
        if ((i11 & 128) != 0) {
            i16 = c1161100gJw.LJII;
        }
        if ((i11 & 256) != 0) {
            i15 = c1161100gJw.LJIIIIZZ;
        }
        if ((i11 & 512) != 0) {
            i14 = c1161100gJw.LJIIIZ;
        }
        if ((i11 & 1024) != 0) {
            i13 = c1161100gJw.LJIIJ;
        }
        if ((i11 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            i12 = c1161100gJw.LJIIJJI;
        }
        c1161100gJw.getClass();
        return new C1161100gJw(i21, i20, enumC1160590gJ72, str2, i19, i18, i17, i16, i15, i14, i13, i12);
    }
}
