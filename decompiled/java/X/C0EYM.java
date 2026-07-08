package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.0EYM, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EYM {
    public int[] LIZ;
    public String[] LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public long LJ;
    public long LJFF;
    public int LJI;
    public boolean LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public String LJIIL;
    public String LJIILIIL;
    public String LJIILJJIL;
    public String LJIILL;
    public int LJIILLIIL;
    public String LJIIZILJ;
    public String LJIJ;
    public String LJIJI;
    public String LJIIJ = "";
    public String LJIIJJI = "";
    public Boolean LJIJJ = Boolean.FALSE;
    public boolean LJIJJLI = true;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VEFilterEffectOp{mEffectIndexes=");
        sbLIZ.append(Arrays.toString(this.LIZ));
        sbLIZ.append(", mStartTimePoint=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", mOp=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", mReverse=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", mColor=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", mResource='");
        sbLIZ.append(this.LJIIL);
        sbLIZ.append('\'');
        sbLIZ.append(", mName='");
        sbLIZ.append(this.LJIILL);
        sbLIZ.append('\'');
        sbLIZ.append(", mKey='");
        sbLIZ.append(this.LJIILIIL);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C0EYM LIZJ(long j) {
        C0EYM c0eym = new C0EYM();
        c0eym.LJI = 1;
        c0eym.LIZJ = j;
        return c0eym;
    }

    public static C0EYM LIZIZ(long j, String str) {
        C0EYM c0eym = new C0EYM();
        c0eym.LJI = 0;
        if (str == null) {
            str = "";
        }
        c0eym.LJIIL = str;
        c0eym.LIZJ = j;
        return c0eym;
    }

    public static C0EYM LIZLLL(int i, int i2, String str) {
        C0EYM c0eym = new C0EYM();
        c0eym.LJI = 2;
        c0eym.LIZ = new int[]{i};
        c0eym.LIZIZ = new String[]{str};
        c0eym.LJ = i2;
        return c0eym;
    }

    public static C0EYM LIZ(int i, long j, String str, String str2) {
        C0EYM c0eym = new C0EYM();
        c0eym.LJI = 8;
        c0eym.LJIIL = str;
        c0eym.LIZJ = 0L;
        c0eym.LIZLLL = j;
        c0eym.LIZ = new int[]{i};
        c0eym.LIZIZ = new String[]{str2};
        return c0eym;
    }
}
