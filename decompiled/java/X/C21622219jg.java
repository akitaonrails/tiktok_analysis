package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: renamed from: X.19jg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21622219jg {
    public static final C21622219jg LJI = new C21622219jg(4201, SpeechEngineDefines.TTS_WORK_MODE_BOTH, 1);
    public static final C21622219jg LJII = new C21622219jg(1033, 1024, 1);
    public static final C21622219jg LJIIIIZZ = new C21622219jg(67, 64, 1);
    public static final C21622219jg LJIIIZ = new C21622219jg(19, 16, 1);
    public static final C21622219jg LJIIJ = new C21622219jg(285, 256, 0);
    public static final C21622219jg LJIIJJI = new C21622219jg(301, 256, 1);
    public final int[] LIZ;
    public final int[] LIZIZ;
    public final C21622419ji LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;

    public final String toString() {
        return "GF(0x" + Integer.toHexString(this.LJ) + ',' + this.LIZLLL + ')';
    }

    public final int LIZ(int i, int i2) {
        if (i != 0 && i2 != 0) {
            int[] iArr = this.LIZ;
            int[] iArr2 = this.LIZIZ;
            return iArr[(iArr2[i] + iArr2[i2]) % (this.LIZLLL - 1)];
        }
        return 0;
    }

    public C21622219jg(int i, int i2, int i3) {
        this.LJ = i;
        this.LIZLLL = i2;
        this.LJFF = i3;
        this.LIZ = new int[i2];
        this.LIZIZ = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.LIZ[i5] = i4;
            i4 <<= 1;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            this.LIZIZ[this.LIZ[i6]] = i6;
        }
        this.LIZJ = new C21622419ji(this, new int[]{0});
        new C21622419ji(this, new int[]{1});
    }
}
