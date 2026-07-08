package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: renamed from: X.0bgX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C982910bgX {
    public final long LIZ;
    public final ImageModel LIZIZ;
    public final String LIZJ;
    public final long LIZLLL;
    public final boolean LJ;
    public boolean LJFF;
    public final boolean LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public String LJIIIZ;
    public final boolean LJIIJ;
    public String LJIIJJI;
    public final boolean LJIIL;
    public boolean LJIILIIL;
    public String LJIILJJIL;
    public String LJIILL;
    public final boolean LJIILLIIL;
    public final boolean LJIIZILJ;
    public final int LJIJ;

    public C982910bgX(long j, ImageModel imageModel, String str, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str2, boolean z6, String str3, boolean z7, boolean z8, String str4, String str5, boolean z9, boolean z10, int i, int i2) {
        boolean z11 = z6;
        String str6 = str2;
        boolean z12 = z5;
        boolean z13 = z4;
        boolean z14 = z3;
        boolean z15 = z2;
        int i3 = i;
        boolean z16 = z10;
        boolean z17 = z8;
        boolean z18 = z9;
        String str7 = str4;
        boolean z19 = z7;
        String str8 = str3;
        boolean z20 = (i2 & 16) != 0 ? false : z;
        z15 = (i2 & 32) != 0 ? false : z15;
        z14 = (i2 & 64) != 0 ? false : z14;
        z13 = (i2 & 128) != 0 ? false : z13;
        z12 = (i2 & 256) != 0 ? false : z12;
        str6 = (i2 & 512) != 0 ? "" : str6;
        z11 = (i2 & 1024) != 0 ? false : z11;
        str8 = (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? "" : str8;
        z19 = (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? false : z19;
        z17 = (i2 & 8192) != 0 ? false : z17;
        str7 = (i2 & 16384) != 0 ? "" : str7;
        String str9 = (32768 & i2) == 0 ? str5 : "";
        z18 = (65536 & i2) != 0 ? false : z18;
        z16 = (131072 & i2) != 0 ? false : z16;
        i3 = (i2 & 262144) != 0 ? 0 : i3;
        this.LIZ = j;
        this.LIZIZ = imageModel;
        this.LIZJ = str;
        this.LIZLLL = j2;
        this.LJ = z20;
        this.LJFF = z15;
        this.LJI = z14;
        this.LJII = z13;
        this.LJIIIIZZ = z12;
        this.LJIIIZ = str6;
        this.LJIIJ = z11;
        this.LJIIJJI = str8;
        this.LJIIL = z19;
        this.LJIILIIL = z17;
        this.LJIILJJIL = str7;
        this.LJIILL = str9;
        this.LJIILLIIL = z18;
        this.LJIIZILJ = z16;
        this.LJIJ = i3;
    }
}
