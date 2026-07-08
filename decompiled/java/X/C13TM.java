package X;

import java.io.File;

/* JADX INFO: renamed from: X.13TM, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13TM {
    public final String LIZ;
    public final long[] LIZIZ;
    public final File[] LIZJ;
    public final File[] LIZLLL;
    public boolean LJ;
    public C13TO LJFF;
    public final /* synthetic */ C13TL LJI;

    public final String LIZ() {
        StringBuilder sb = new StringBuilder();
        for (long j : this.LIZIZ) {
            sb.append(' ');
            sb.append(j);
        }
        return sb.toString();
    }

    public C13TM(C13TL c13tl, String str) {
        this.LJI = c13tl;
        this.LIZ = str;
        int i = c13tl.LLIZ;
        this.LIZIZ = new long[i];
        this.LIZJ = new File[i];
        this.LIZLLL = new File[i];
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i2 = 0; i2 < c13tl.LLIZ; i2++) {
            sb.append(i2);
            this.LIZJ[i2] = new C0VSJ(c13tl.LL, sb.toString());
            sb.append(".tmp");
            this.LIZLLL[i2] = new C0VSJ(c13tl.LL, sb.toString());
            sb.setLength(length);
        }
    }
}
