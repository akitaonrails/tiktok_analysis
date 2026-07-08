package X;

import android.graphics.RectF;
import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: renamed from: X.19mE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21638019mE {
    public final RectF LIZ;
    public final RectF LIZIZ;
    public final RectF LIZJ;
    public final RectF LIZLLL;
    public final RectF LJ;
    public final RectF LJFF;
    public final RectF LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final boolean LJIIJ;
    public final boolean LJIIJJI;
    public final boolean LJIIL;
    public final boolean LJIILIIL;
    public final float LJIILJJIL;
    public final float LJIILL;
    public final float LJIILLIIL;
    public final float LJIIZILJ;
    public final float LJIJ;
    public final float LJIJI;
    public final float LJIJJ;

    public C21638019mE() {
        this(0);
    }

    public /* synthetic */ C21638019mE(int i) {
        this(new RectF(), new RectF(), new RectF(), new RectF(), new RectF(), new RectF(), new RectF(), false, false, false, false, false, false, false, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
    }

    public static C21638019mE LIZ(C21638019mE c21638019mE, RectF rectF, RectF rectF2, RectF rectF3, RectF rectF4, RectF rectF5, RectF rectF6, RectF rectF7, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, float f, float f2, float f3, float f4, int i) {
        float f5;
        float f6;
        float f7;
        float f8 = f4;
        float f9 = f;
        boolean z8 = z7;
        boolean z9 = z6;
        boolean z10 = z5;
        boolean z11 = z4;
        float f10 = f3;
        boolean z12 = z3;
        boolean z13 = z2;
        boolean z14 = z;
        RectF rectF8 = rectF7;
        RectF rectF9 = rectF6;
        RectF rectF10 = rectF5;
        RectF rectF11 = rectF4;
        RectF rectF12 = rectF3;
        RectF rectF13 = rectF2;
        float f11 = f2;
        RectF rectF14 = rectF;
        if ((i & 1) != 0) {
            rectF14 = c21638019mE.LIZ;
        }
        if ((i & 2) != 0) {
            rectF13 = c21638019mE.LIZIZ;
        }
        if ((i & 4) != 0) {
            rectF12 = c21638019mE.LIZJ;
        }
        if ((i & 8) != 0) {
            rectF11 = c21638019mE.LIZLLL;
        }
        if ((i & 16) != 0) {
            rectF10 = c21638019mE.LJ;
        }
        if ((i & 32) != 0) {
            rectF9 = c21638019mE.LJFF;
        }
        if ((i & 64) != 0) {
            rectF8 = c21638019mE.LJI;
        }
        if ((i & 128) != 0) {
            z14 = c21638019mE.LJII;
        }
        if ((i & 256) != 0) {
            z13 = c21638019mE.LJIIIIZZ;
        }
        if ((i & 512) != 0) {
            z12 = c21638019mE.LJIIIZ;
        }
        if ((i & 1024) != 0) {
            z11 = c21638019mE.LJIIJ;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            z10 = c21638019mE.LJIIJJI;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            z9 = c21638019mE.LJIIL;
        }
        if ((i & 8192) != 0) {
            z8 = c21638019mE.LJIILIIL;
        }
        if ((i & 16384) != 0) {
            f9 = c21638019mE.LJIILJJIL;
        }
        if ((32768 & i) != 0) {
            f11 = c21638019mE.LJIILL;
        }
        if ((65536 & i) != 0) {
            f10 = c21638019mE.LJIILLIIL;
        }
        if ((131072 & i) != 0) {
            f8 = c21638019mE.LJIIZILJ;
        }
        if ((262144 & i) != 0) {
            f5 = c21638019mE.LJIJ;
        } else {
            f5 = 0.0f;
        }
        if ((524288 & i) != 0) {
            f6 = c21638019mE.LJIJI;
        } else {
            f6 = 0.0f;
        }
        if ((i & 1048576) != 0) {
            f7 = c21638019mE.LJIJJ;
        } else {
            f7 = 0.0f;
        }
        c21638019mE.getClass();
        return new C21638019mE(rectF14, rectF13, rectF12, rectF11, rectF10, rectF9, rectF8, z14, z13, z12, z11, z10, z9, z8, f9, f11, f10, f8, f5, f6, f7);
    }

    public C21638019mE(RectF rectF, RectF rectF2, RectF rectF3, RectF rectF4, RectF rectF5, RectF rectF6, RectF rectF7, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.LIZ = rectF;
        this.LIZIZ = rectF2;
        this.LIZJ = rectF3;
        this.LIZLLL = rectF4;
        this.LJ = rectF5;
        this.LJFF = rectF6;
        this.LJI = rectF7;
        this.LJII = z;
        this.LJIIIIZZ = z2;
        this.LJIIIZ = z3;
        this.LJIIJ = z4;
        this.LJIIJJI = z5;
        this.LJIIL = z6;
        this.LJIILIIL = z7;
        this.LJIILJJIL = f;
        this.LJIILL = f2;
        this.LJIILLIIL = f3;
        this.LJIIZILJ = f4;
        this.LJIJ = f5;
        this.LJIJI = f6;
        this.LJIJJ = f7;
    }
}
