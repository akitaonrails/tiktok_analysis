package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: renamed from: X.03IP, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03IP {
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

    public C03IP() {
        this(0, 0, 0, 0, 0, 0, 0, 4095);
    }

    public final int hashCode() {
        return (((((((((((((((((((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + this.LJ) * 31) + this.LJFF) * 31) + this.LJI) * 31) + this.LJII) * 31) + this.LJIIIIZZ) * 31) + this.LJIIIZ) * 31) + this.LJIIJ) * 31) + this.LJIIJJI;
    }

    public C03IP(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        i = (i8 & 1) != 0 ? -1 : i;
        if ((i8 & 2) != 0) {
            i9 = -2;
        } else {
            i9 = 0;
        }
        int i10 = (i8 & 4) == 0 ? 0 : -2;
        i2 = (i8 & 32) != 0 ? 0 : i2;
        i3 = (i8 & 128) != 0 ? 0 : i3;
        i4 = (i8 & 256) != 0 ? 0 : i4;
        i5 = (i8 & 512) != 0 ? 0 : i5;
        i6 = (i8 & 1024) != 0 ? 0 : i6;
        i7 = (i8 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? 17 : i7;
        this.LIZ = i;
        this.LIZIZ = i9;
        this.LIZJ = i10;
        this.LIZLLL = 0;
        this.LJ = 0;
        this.LJFF = i2;
        this.LJI = 0;
        this.LJII = i3;
        this.LJIIIIZZ = i4;
        this.LJIIIZ = i5;
        this.LJIIJ = i6;
        this.LJIIJJI = i7;
    }
}
