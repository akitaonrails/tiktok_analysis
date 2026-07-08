package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.1Dh6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2262541Dh6 {
    public final C2267081DoQ LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJIIZILJ;
    public float LJFF = Float.NaN;
    public float LJI = Float.NaN;
    public float LJII = Float.NaN;
    public float LJIIIIZZ = Float.NaN;
    public float LJIIIZ = Float.NaN;
    public float LJIIJ = Float.NaN;
    public float LJIIJJI = Float.NaN;
    public float LJIIL = Float.NaN;
    public float LJIILIIL = Float.NaN;
    public float LJIILJJIL = Float.NaN;
    public float LJIILL = Float.NaN;
    public final float LJIILLIIL = Float.NaN;
    public final HashMap<String, C2255501DPw> LJIJ = new HashMap<>();

    public C2262541Dh6() {
    }

    public C2262541Dh6(C2262541Dh6 c2262541Dh6) {
        this.LIZ = c2262541Dh6.LIZ;
        this.LIZIZ = c2262541Dh6.LIZIZ;
        this.LIZJ = c2262541Dh6.LIZJ;
        this.LIZLLL = c2262541Dh6.LIZLLL;
        this.LJ = c2262541Dh6.LJ;
        LIZJ(c2262541Dh6);
    }

    public final void LIZJ(C2262541Dh6 c2262541Dh6) {
        this.LJFF = c2262541Dh6.LJFF;
        this.LJI = c2262541Dh6.LJI;
        this.LJII = c2262541Dh6.LJII;
        this.LJIIIIZZ = c2262541Dh6.LJIIIIZZ;
        this.LJIIIZ = c2262541Dh6.LJIIIZ;
        this.LJIIJ = c2262541Dh6.LJIIJ;
        this.LJIIJJI = c2262541Dh6.LJIIJJI;
        this.LJIIL = c2262541Dh6.LJIIL;
        this.LJIILIIL = c2262541Dh6.LJIILIIL;
        this.LJIILJJIL = c2262541Dh6.LJIILJJIL;
        this.LJIILL = c2262541Dh6.LJIILL;
        this.LJIIZILJ = c2262541Dh6.LJIIZILJ;
        this.LJIJ.clear();
        for (C2255501DPw c2255501DPw : c2262541Dh6.LJIJ.values()) {
            this.LJIJ.put(c2255501DPw.LIZ, new C2255501DPw(c2255501DPw));
        }
    }

    public C2262541Dh6(C2267081DoQ c2267081DoQ) {
        this.LIZ = c2267081DoQ;
    }

    public static void LIZ(StringBuilder sb, String str, float f) {
        if (Float.isNaN(f)) {
            return;
        }
        sb.append(str);
        sb.append(": ");
        sb.append(f);
        sb.append(",\n");
    }

    public static void LIZIZ(StringBuilder sb, String str, int i) {
        sb.append(str);
        sb.append(": ");
        sb.append(i);
        sb.append(",\n");
    }
}
