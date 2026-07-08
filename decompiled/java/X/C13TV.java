package X;

import java.io.File;

/* JADX INFO: renamed from: X.13TV, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13TV {
    public static C13TV LJFF;
    public final File LIZIZ;
    public C13TL LJ;
    public final C13TT LIZLLL = new C13TT();
    public final int LIZJ = 524288000;
    public final C13TZ LIZ = new C13TZ();

    public final synchronized C13TL LIZ() {
        if (this.LJ == null) {
            this.LJ = C13TL.LJII(this.LIZIZ, this.LIZJ);
        }
        return this.LJ;
    }

    public C13TV(C0VSJ c0vsj) {
        this.LIZIZ = c0vsj;
    }
}
