package X;

import android.os.SystemClock;

/* JADX INFO: renamed from: X.0aaB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C940530aaB {
    public String LIZ;
    public long LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public String LJ;
    public String LJFF;
    public int LJI;
    public int LJII;
    public C948800anW LJIIIIZZ;
    public long LJIIIZ;
    public String LJIIJ;
    public long LJIIJJI;
    public long LJIIL;
    public long LJIILIIL;
    public String LJIILJJIL;

    public C940530aaB() {
        this(null, 0L, 0L, 0L, null, 511);
    }

    static {
        new Object() { // from class: X.0aaU
        };
    }

    public final void LIZ() {
        this.LJIIIZ = SystemClock.uptimeMillis();
        this.LJIIJ = this.LIZ;
        this.LJIIJJI = this.LIZIZ;
        this.LJIIL = this.LIZJ;
        this.LJIILIIL = this.LIZLLL;
        this.LJIILJJIL = this.LJ;
        this.LIZ = "normal";
        this.LIZIZ = 0L;
        this.LIZJ = 0L;
        this.LIZLLL = 0L;
        this.LJ = "";
        this.LJFF = "normal";
        this.LJII = 0;
        this.LJIIIIZZ = null;
    }

    public C940530aaB(String str, long j, long j2, long j3, String str2, int i) {
        String str3;
        str = (i & 1) != 0 ? "normal" : str;
        j = (i & 2) != 0 ? 0L : j;
        j2 = (i & 4) != 0 ? 0L : j2;
        j3 = (i & 8) != 0 ? 0L : j3;
        str2 = (i & 16) != 0 ? "" : str2;
        if ((i & 32) != 0) {
            str3 = "";
        } else {
            str3 = null;
        }
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = j3;
        this.LJ = str2;
        this.LJFF = str3;
        this.LJI = 0;
        this.LJII = 0;
        this.LJIIIIZZ = null;
        this.LJIIJ = "normal";
        this.LJIILJJIL = "";
    }
}
