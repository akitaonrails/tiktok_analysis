package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: renamed from: X.0SmA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C731160SmA {
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public final float LJFF;
    public final boolean LJI;
    public final float LJII;
    public final float LJIIIIZZ;
    public final float LJIIIZ;
    public final float LJIIJ;
    public final boolean LJIIJJI;
    public final boolean LJIIL;
    public final boolean LJIILIIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C731160SmA)) {
            return false;
        }
        C731160SmA c731160SmA = (C731160SmA) obj;
        return Float.compare(this.LIZ, c731160SmA.LIZ) == 0 && Float.compare(this.LIZIZ, c731160SmA.LIZIZ) == 0 && Float.compare(this.LIZJ, c731160SmA.LIZJ) == 0 && Float.compare(this.LIZLLL, c731160SmA.LIZLLL) == 0 && Float.compare(this.LJ, c731160SmA.LJ) == 0 && Float.compare(this.LJFF, c731160SmA.LJFF) == 0 && this.LJI == c731160SmA.LJI && Float.compare(this.LJII, c731160SmA.LJII) == 0 && Float.compare(this.LJIIIIZZ, c731160SmA.LJIIIIZZ) == 0 && Float.compare(this.LJIIIZ, c731160SmA.LJIIIZ) == 0 && Float.compare(this.LJIIJ, c731160SmA.LJIIJ) == 0 && this.LJIIJJI == c731160SmA.LJIIJJI && this.LJIIL == c731160SmA.LJIIL && this.LJIILIIL == c731160SmA.LJIILIIL;
    }

    public static C731160SmA LIZ(C731160SmA c731160SmA, float f, boolean z, boolean z2, int i) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        boolean z3;
        float f8;
        float f9;
        boolean z4;
        boolean z5 = z2;
        boolean z6 = z;
        float f10 = f;
        float f11 = 0.0f;
        if ((i & 1) != 0) {
            f2 = c731160SmA.LIZ;
        } else {
            f2 = 0.0f;
        }
        if ((i & 2) != 0) {
            f3 = c731160SmA.LIZIZ;
        } else {
            f3 = 0.0f;
        }
        if ((i & 4) != 0) {
            f4 = c731160SmA.LIZJ;
        } else {
            f4 = 0.0f;
        }
        if ((i & 8) != 0) {
            f5 = c731160SmA.LIZLLL;
        } else {
            f5 = 0.0f;
        }
        if ((i & 16) != 0) {
            f6 = c731160SmA.LJ;
        } else {
            f6 = 0.0f;
        }
        if ((i & 32) != 0) {
            f7 = c731160SmA.LJFF;
        } else {
            f7 = 0.0f;
        }
        if ((i & 64) != 0) {
            z3 = c731160SmA.LJI;
        } else {
            z3 = false;
        }
        if ((i & 128) != 0) {
            f8 = c731160SmA.LJII;
        } else {
            f8 = 0.0f;
        }
        if ((i & 256) != 0) {
            f9 = c731160SmA.LJIIIIZZ;
        } else {
            f9 = 0.0f;
        }
        if ((i & 512) != 0) {
            f11 = c731160SmA.LJIIIZ;
        }
        if ((i & 1024) != 0) {
            f10 = c731160SmA.LJIIJ;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            z6 = c731160SmA.LJIIJJI;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            z5 = c731160SmA.LJIIL;
        }
        if ((i & 8192) != 0) {
            z4 = c731160SmA.LJIILIIL;
        } else {
            z4 = false;
        }
        c731160SmA.getClass();
        return new C731160SmA(f2, f3, f4, f5, f6, f7, z3, f8, f9, f11, f10, z6, z5, z4);
    }

    public /* synthetic */ C731160SmA(float f, float f2, float f3, float f4, float f5, float f6, boolean z, float f7, float f8, float f9, float f10, boolean z2, int i) {
        this(f, f2, (i & 4) != 0 ? 0.0f : f3, (i & 8) != 0 ? 0.0f : f4, (i & 16) != 0 ? 0.0f : f5, f6, (i & 64) != 0 ? false : z, (i & 128) != 0 ? 0.0f : f7, (i & 256) != 0 ? 0.0f : f8, (i & 512) != 0 ? 0.0f : f9, (i & 1024) != 0 ? 0.0f : f10, false, false, (i & 8192) != 0 ? false : z2);
    }

    public C731160SmA(float f, float f2, float f3, float f4, float f5, float f6, boolean z, float f7, float f8, float f9, float f10, boolean z2, boolean z3, boolean z4) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = f3;
        this.LIZLLL = f4;
        this.LJ = f5;
        this.LJFF = f6;
        this.LJI = z;
        this.LJII = f7;
        this.LJIIIIZZ = f8;
        this.LJIIIZ = f9;
        this.LJIIJ = f10;
        this.LJIIJJI = z2;
        this.LJIIL = z3;
        this.LJIILIIL = z4;
    }
}
