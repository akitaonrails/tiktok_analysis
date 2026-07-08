package X;

import android.graphics.drawable.Drawable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: renamed from: X.0EcP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C368390EcP {
    public final Drawable LIZ;
    public final Drawable LIZIZ;
    public final Integer LIZJ;
    public final Integer LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final int LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;
    public final int LJIIJ;
    public final Integer LJIIJJI;
    public final Integer LJIIL;

    public C368390EcP() {
        this(null, null, null, 0, 0, 0, 0, 0, 0, 0, null, null, 8191);
    }

    public C368390EcP(C368780Ed2 c368780Ed2, C368780Ed2 c368780Ed22, Integer num, int i, int i2, int i3, int i4, int i5, int i6, int i7, Integer num2, Integer num3, int i8) {
        Integer num4 = num;
        C368780Ed2 c368780Ed23 = c368780Ed22;
        int iLIZ = i2;
        int iLIZ2 = i;
        int iLIZ3 = i4;
        int iLIZ4 = i3;
        int iLIZ5 = i6;
        int iLIZ6 = i5;
        Integer num5 = num2;
        int iLIZ7 = i7;
        Integer num6 = num3;
        C368780Ed2 c368780Ed24 = (i8 & 1) != 0 ? null : c368780Ed2;
        c368780Ed23 = (i8 & 2) != 0 ? null : c368780Ed23;
        num4 = (i8 & 4) != 0 ? null : num4;
        iLIZ2 = (i8 & 16) != 0 ? C390810FTz.LIZ(4.0f) : iLIZ2;
        iLIZ = (i8 & 32) != 0 ? C390810FTz.LIZ(16.0f) : iLIZ;
        iLIZ4 = (i8 & 64) != 0 ? C390810FTz.LIZ(2.0f) : iLIZ4;
        iLIZ3 = (i8 & 128) != 0 ? C390810FTz.LIZ(1.0f) : iLIZ3;
        iLIZ6 = (i8 & 256) != 0 ? C390810FTz.LIZ(1.0f) : iLIZ6;
        iLIZ5 = (i8 & 512) != 0 ? C390810FTz.LIZ(5.0f) : iLIZ5;
        iLIZ7 = (i8 & 1024) != 0 ? C390810FTz.LIZ(2.0f) : iLIZ7;
        num5 = (i8 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : num5;
        num6 = (i8 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : num6;
        this.LIZ = c368780Ed24;
        this.LIZIZ = c368780Ed23;
        this.LIZJ = num4;
        this.LIZLLL = null;
        this.LJ = iLIZ2;
        this.LJFF = iLIZ;
        this.LJI = iLIZ4;
        this.LJII = iLIZ3;
        this.LJIIIIZZ = iLIZ6;
        this.LJIIIZ = iLIZ5;
        this.LJIIJ = iLIZ7;
        this.LJIIJJI = num5;
        this.LJIIL = num6;
    }
}
