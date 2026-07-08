package X;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: renamed from: X.0zio, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1906880zio {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final int LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;
    public final int LJIIJ;
    public final int LJIIJJI;
    public final Drawable LJIIL;
    public final int LJIILIIL;
    public final Typeface LJIILJJIL;
    public final int LJIILL;
    public final int LJIILLIIL;
    public final float LJIIZILJ;
    public final int LJIJ;
    public final int LJIJI;
    public final int LJIJJ;
    public final int LJIJJLI;
    public final int LJIL;

    public C1906880zio() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, 0.0f, 0, 0, 0, 0, 0, 33554431);
    }

    public C1906880zio(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, Typeface typeface, int i12, int i13, float f, int i14, int i15, int i16, int i17, int i18, int i19) {
        int i20;
        int i21 = i11;
        int i22 = i10;
        int i23 = i9;
        int i24 = i8;
        int i25 = i7;
        int i26 = i6;
        int i27 = i5;
        int i28 = i4;
        int i29 = i3;
        int i30 = i2;
        int i31 = i18;
        int i32 = i17;
        int i33 = i16;
        int i34 = i15;
        int i35 = i14;
        float f2 = f;
        int i36 = i13;
        int i37 = i12;
        Typeface typeface2 = typeface;
        int i38 = (i19 & 2) != 0 ? -1 : i;
        i30 = (i19 & 4) != 0 ? -1 : i30;
        i29 = (i19 & 8) != 0 ? -1 : i29;
        i28 = (i19 & 16) != 0 ? -1 : i28;
        i27 = (i19 & 32) != 0 ? -1 : i27;
        i26 = (i19 & 64) != 0 ? -1 : i26;
        if ((i19 & 128) != 0) {
            i20 = -1;
        } else {
            i20 = 0;
        }
        i25 = (i19 & 256) != 0 ? -1 : i25;
        i24 = (i19 & 512) != 0 ? -1 : i24;
        i23 = (i19 & 1024) != 0 ? -1 : i23;
        i22 = (i19 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? -1 : i22;
        i21 = (i19 & 8192) != 0 ? -1 : i21;
        int i39 = (32768 & i19) != 0 ? 1 : 0;
        typeface2 = (i19 & 65536) != 0 ? null : typeface2;
        i37 = (i19 & 131072) != 0 ? -1 : i37;
        i36 = (i19 & 262144) != 0 ? -1 : i36;
        f2 = (i19 & 524288) != 0 ? -1.0f : f2;
        i35 = (i19 & 1048576) != 0 ? -1 : i35;
        i34 = (i19 & 2097152) != 0 ? -1 : i34;
        i33 = (i19 & 4194304) != 0 ? -1 : i33;
        i32 = (i19 & 8388608) != 0 ? -1 : i32;
        i31 = (i19 & 16777216) != 0 ? -1 : i31;
        this.LIZ = i38;
        this.LIZIZ = i30;
        this.LIZJ = i29;
        this.LIZLLL = i28;
        this.LJ = i27;
        this.LJFF = i26;
        this.LJI = i20;
        this.LJII = i25;
        this.LJIIIIZZ = i24;
        this.LJIIIZ = i23;
        this.LJIIJ = i22;
        this.LJIIJJI = i21;
        this.LJIIL = null;
        this.LJIILIIL = i39;
        this.LJIILJJIL = typeface2;
        this.LJIILL = i37;
        this.LJIILLIIL = i36;
        this.LJIIZILJ = f2;
        this.LJIJ = i35;
        this.LJIJI = i34;
        this.LJIJJ = i33;
        this.LJIJJLI = i32;
        this.LJIL = i31;
    }
}
