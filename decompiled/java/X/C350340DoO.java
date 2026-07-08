package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: renamed from: X.0DoO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C350340DoO {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public long LIZLLL;
    public long LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final long LJIIIIZZ;
    public final long LJIIIZ;
    public final int LJIIJ;
    public final boolean LJIIJJI;
    public final Long LJIIL;
    public final String LJIILIIL;
    public float LJIILJJIL;
    public final float LJIILL;
    public final boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public String LJIJ;
    public final Float LJIJI;

    public static C350340DoO LIZ(C350340DoO c350340DoO, int i) {
        String str = c350340DoO.LIZ;
        String str2 = c350340DoO.LIZIZ;
        String str3 = c350340DoO.LIZJ;
        long j = c350340DoO.LIZLLL;
        long j2 = c350340DoO.LJ;
        boolean z = c350340DoO.LJFF;
        boolean z2 = c350340DoO.LJI;
        boolean z3 = c350340DoO.LJII;
        long j3 = c350340DoO.LJIIIIZZ;
        long j4 = c350340DoO.LJIIIZ;
        boolean z4 = c350340DoO.LJIIJJI;
        Long l = c350340DoO.LJIIL;
        String str4 = c350340DoO.LJIILIIL;
        float f = c350340DoO.LJIILJJIL;
        float f2 = c350340DoO.LJIILL;
        boolean z5 = c350340DoO.LJIILLIIL;
        boolean z6 = c350340DoO.LJIIZILJ;
        String str5 = c350340DoO.LJIJ;
        Float f3 = c350340DoO.LJIJI;
        c350340DoO.getClass();
        return new C350340DoO(str, str2, str3, j, j2, z, z2, z3, j3, j4, i, z4, l, str4, f, f2, z5, z6, str5, f3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C350340DoO(String str, String str2, String str3, long j, long j2, boolean z, boolean z2, long j3, long j4, int i, boolean z3, Long l, String str4, float f, boolean z4, Float f2, int i2) {
        float f3;
        String str5;
        boolean z5 = z4;
        float f4 = f;
        Long l2 = l;
        long j5 = j4;
        long j6 = j3;
        String str6 = str4;
        long j7 = j2;
        boolean z6 = z2;
        boolean z7 = z3;
        long j8 = j;
        boolean z8 = z;
        int i3 = i;
        String str7 = (i2 & 4) != 0 ? null : str3;
        j8 = (i2 & 8) != 0 ? 0L : j8;
        j7 = (i2 & 16) != 0 ? 0L : j7;
        z8 = (i2 & 64) != 0 ? false : z8;
        z6 = (i2 & 128) != 0 ? false : z6;
        j6 = (i2 & 256) != 0 ? 0L : j6;
        j5 = (i2 & 512) != 0 ? 0L : j5;
        i3 = (i2 & 1024) != 0 ? 0 : i3;
        z7 = (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? false : z7;
        l2 = (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : l2;
        str6 = (i2 & 8192) != 0 ? null : str6;
        if ((i2 & 16384) != 0) {
            f3 = 1.0f;
        } else {
            f3 = 0.0f;
        }
        f4 = (32768 & i2) != 0 ? 1.0f : f4;
        z5 = (65536 & i2) != 0 ? false : z5;
        if ((262144 & i2) != 0) {
            str5 = "";
        } else {
            str5 = null;
        }
        this(str, str2, str7, j8, j7, false, z8, z6, j6, j5, i3, z7, l2, str6, f3, f4, z5, false, str5, (i2 & 524288) == 0 ? f2 : null);
    }

    public C350340DoO(String str, String str2, String str3, long j, long j2, boolean z, boolean z2, boolean z3, long j3, long j4, int i, boolean z4, Long l, String str4, float f, float f2, boolean z5, boolean z6, String str5, Float f3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = j;
        this.LJ = j2;
        this.LJFF = z;
        this.LJI = z2;
        this.LJII = z3;
        this.LJIIIIZZ = j3;
        this.LJIIIZ = j4;
        this.LJIIJ = i;
        this.LJIIJJI = z4;
        this.LJIIL = l;
        this.LJIILIIL = str4;
        this.LJIILJJIL = f;
        this.LJIILL = f2;
        this.LJIILLIIL = z5;
        this.LJIIZILJ = z6;
        this.LJIJ = str5;
        this.LJIJI = f3;
    }
}
