package X;

import com.mammon.audiosdk.SAMICore;

/* JADX INFO: renamed from: X.09TS, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09TS {
    public final C09TE LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final int LJ;
    public final SAMICore LJFF;
    public final float LJI;
    public final int LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;

    public C09TS(C09TE c09te, String str, String str2, SAMICore sAMICore, float f, int i, boolean z, int i2) {
        int i3;
        str = (i2 & 4) != 0 ? "" : str;
        str2 = (i2 & 8) != 0 ? "" : str2;
        if ((i2 & 16) != 0) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        sAMICore = (i2 & 32) != 0 ? null : sAMICore;
        f = (i2 & 128) != 0 ? 1.0f : f;
        i = (i2 & 256) != 0 ? 24000 : i;
        z = (i2 & 1024) != 0 ? true : z;
        this.LIZ = c09te;
        this.LIZIZ = false;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = i3;
        this.LJFF = sAMICore;
        this.LJI = f;
        this.LJII = i;
        this.LJIIIIZZ = false;
        this.LJIIIZ = z;
    }
}
