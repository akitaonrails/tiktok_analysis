package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0EDv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C361130EDv {
    public final boolean LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public int LIZLLL;
    public final Integer LJ;
    public final int LJFF;
    public final int LJI;
    public final int LJII;
    public final boolean LJIIIIZZ;
    public final float LJIIIZ;
    public final float LJIIJ;
    public final Integer LJIIJJI;

    public static C361130EDv LIZ(C361130EDv c361130EDv, int i, int i2, int i3) {
        boolean z;
        int i4;
        Integer num;
        int i5;
        int i6;
        int i7;
        float f;
        float f2;
        int i8 = i2;
        int i9 = i;
        boolean z2 = false;
        if ((i3 & 1) != 0) {
            z = c361130EDv.LIZ;
        } else {
            z = false;
        }
        if ((i3 & 2) != 0) {
            i9 = c361130EDv.LIZIZ;
        }
        if ((i3 & 4) != 0) {
            i8 = c361130EDv.LIZJ;
        }
        if ((i3 & 8) != 0) {
            i4 = c361130EDv.LIZLLL;
        } else {
            i4 = 0;
        }
        Integer num2 = null;
        if ((i3 & 16) != 0) {
            num = c361130EDv.LJ;
        } else {
            num = null;
        }
        if ((i3 & 32) != 0) {
            i5 = c361130EDv.LJFF;
        } else {
            i5 = 0;
        }
        if ((i3 & 64) != 0) {
            i6 = c361130EDv.LJI;
        } else {
            i6 = 0;
        }
        if ((i3 & 128) != 0) {
            i7 = c361130EDv.LJII;
        } else {
            i7 = 0;
        }
        if ((i3 & 256) != 0) {
            z2 = c361130EDv.LJIIIIZZ;
        }
        if ((i3 & 512) != 0) {
            f = c361130EDv.LJIIIZ;
        } else {
            f = 0.34f;
        }
        if ((i3 & 1024) != 0) {
            f2 = c361130EDv.LJIIJ;
        } else {
            f2 = 0.0f;
        }
        if ((i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            num2 = c361130EDv.LJIIJJI;
        }
        return new C361130EDv(z, i9, i8, i4, num, i5, i6, i7, z2, f, f2, num2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C361130EDv(int i, int i2, int i3, Integer num, int i4, int i5, float f, Integer num2, int i6) {
        boolean z;
        float f2;
        float f3 = f;
        int i7 = i5;
        int i8 = i4;
        Integer num3 = num;
        int i9 = i3;
        int i10 = i2;
        int i11 = i;
        if ((i6 & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        i11 = (i6 & 2) != 0 ? 45 : i11;
        i10 = (i6 & 4) != 0 ? 45 : i10;
        i9 = (i6 & 8) != 0 ? 0 : i9;
        num3 = (i6 & 16) != 0 ? num : num3;
        i8 = (i6 & 32) != 0 ? R.drawable.bpm : i8;
        i7 = (i6 & 64) != 0 ? R.drawable.bpm : i7;
        if ((i6 & 512) != 0) {
            f2 = 0.3f;
        } else {
            f2 = 0.0f;
        }
        this(z, i11, i10, i9, num3, i8, i7, 0, false, f2, (i6 & 1024) != 0 ? 1.0f : f3, (i6 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 0 ? num2 : 0);
    }

    public C361130EDv(boolean z, int i, int i2, int i3, Integer num, int i4, int i5, int i6, boolean z2, float f, float f2, Integer num2) {
        this.LIZ = z;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = i3;
        this.LJ = num;
        this.LJFF = i4;
        this.LJI = i5;
        this.LJII = i6;
        this.LJIIIIZZ = z2;
        this.LJIIIZ = f;
        this.LJIIJ = f2;
        this.LJIIJJI = num2;
    }
}
