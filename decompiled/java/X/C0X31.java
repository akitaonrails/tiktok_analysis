package X;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0X31, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X31 {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final boolean LJIIIZ;
    public final boolean LJIIJ;
    public final boolean LJIIJJI;
    public String LJIIL;

    static {
        C0X32 c0x32 = new C0X32();
        c0x32.LIZ = true;
        new C0X31(c0x32);
        C0X32 c0x322 = new C0X32();
        c0x322.LIZJ = true;
        c0x322.LIZ(TimeUnit.SECONDS);
        new C0X31(c0x322);
    }

    public final String toString() {
        String string = this.LJIIL;
        if (string == null) {
            StringBuilder sb = new StringBuilder();
            if (this.LIZ) {
                sb.append("no-cache, ");
            }
            if (this.LIZIZ) {
                sb.append("no-store, ");
            }
            if (this.LIZJ != -1) {
                sb.append("max-age=");
                sb.append(this.LIZJ);
                sb.append(", ");
            }
            if (this.LIZLLL != -1) {
                sb.append("s-maxage=");
                sb.append(this.LIZLLL);
                sb.append(", ");
            }
            if (this.LJ) {
                sb.append("private, ");
            }
            if (this.LJFF) {
                sb.append("public, ");
            }
            if (this.LJI) {
                sb.append("must-revalidate, ");
            }
            if (this.LJII != -1) {
                sb.append("max-stale=");
                sb.append(this.LJII);
                sb.append(", ");
            }
            if (this.LJIIIIZZ != -1) {
                sb.append("min-fresh=");
                sb.append(this.LJIIIIZZ);
                sb.append(", ");
            }
            if (this.LJIIIZ) {
                sb.append("only-if-cached, ");
            }
            if (this.LJIIJ) {
                sb.append("no-transform, ");
            }
            if (this.LJIIJJI) {
                sb.append("immutable, ");
            }
            if (sb.length() == 0) {
                string = "";
            } else {
                sb.delete(sb.length() - 2, sb.length());
                string = sb.toString();
            }
            this.LJIIL = string;
        }
        return string;
    }

    public C0X31(C0X32 c0x32) {
        this.LIZ = c0x32.LIZ;
        c0x32.getClass();
        this.LIZIZ = false;
        this.LIZJ = -1;
        this.LIZLLL = -1;
        this.LJII = c0x32.LIZIZ;
        this.LJIIIIZZ = -1;
        this.LJIIIZ = c0x32.LIZJ;
        this.LJIIJ = false;
        this.LJIIJJI = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C0X31 LIZ(X.C0X1V r21) {
        /*
            Method dump skipped, instruction units count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0X31.LIZ(X.0X1V):X.0X31");
    }

    public C0X31(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = z3;
        this.LJFF = z4;
        this.LJI = z5;
        this.LJII = i3;
        this.LJIIIIZZ = i4;
        this.LJIIIZ = z6;
        this.LJIIJ = z7;
        this.LJIIJJI = z8;
        this.LJIIL = str;
    }
}
