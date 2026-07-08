package X;

import android.text.TextUtils;

/* JADX INFO: renamed from: X.0wni, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public abstract class AbstractC1794600wni {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public boolean LJ;
    public String LJFF;
    public boolean LJI;
    public String LJII;
    public boolean LJIIIZ;
    public String LJIIJ;
    public String LJIIJJI;
    public int LIZLLL = 1;
    public String LJIIIIZZ = "";

    public abstract String LIZ();

    public abstract void LIZIZ();

    public abstract String LIZJ();

    public abstract String LIZLLL();

    public abstract int LJ();

    public long LJFF() {
        return 0L;
    }

    public abstract String LJII();

    public abstract String LJIIIIZZ();

    public abstract boolean LJIIJ();

    public abstract boolean LJIIJJI();

    public final String LJI() {
        String str = this.LIZIZ;
        return str != null ? str : "";
    }

    public final String LJIIIZ() {
        return (!this.LJIIIZ || TextUtils.isEmpty(this.LJIIJJI)) ? !TextUtils.isEmpty(this.LIZIZ) ? this.LIZIZ : this.LIZJ : this.LJIIJJI;
    }
}
