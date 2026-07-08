package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.1DoQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public class C2267081DoQ {
    public boolean LIZ;
    public C2267071DoP LIZIZ;
    public C2267071DoP LIZJ;
    public C2267101DoS LIZLLL;
    public C2267111DoT LJ;
    public final boolean[] LJFF;
    public boolean LJI;
    public final boolean LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public final C2262541Dh6 LJIIJ;
    public String LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public int LJIILLIIL;
    public int LJIIZILJ;
    public int LJIJ;
    public int LJIJI;
    public final int[] LJIJJ;
    public int LJIJJLI;
    public int LJIL;
    public float LJJ;
    public int LJJI;
    public int LJJIFFI;
    public float LJJII;
    public int LJJIII;
    public float LJJIIJ;
    public final int[] LJJIIJZLJL;
    public float LJJIIZ;
    public boolean LJJIIZI;
    public final C2267141DoW LJJIJ;
    public final C2267141DoW LJJIJIIJI;
    public final C2267141DoW LJJIJIIJIL;
    public final C2267141DoW LJJIJIL;
    public final C2267141DoW LJJIJL;
    public final C2267141DoW LJJIJLIJ;
    public final C2267141DoW LJJIL;
    public final C2267141DoW LJJIZ;
    public final C2267141DoW[] LJJJ;
    public final ArrayList<C2267141DoW> LJJJI;
    public final boolean[] LJJJIL;
    public final EnumC2266981DoG[] LJJJJ;
    public C2267271Doj LJJJJI;
    public int LJJJJIZL;
    public int LJJJJJ;
    public float LJJJJJL;
    public int LJJJJL;
    public int LJJJJLI;
    public int LJJJJLL;
    public int LJJJJZ;
    public int LJJJJZI;
    public int LJJJLIIL;
    public float LJJJLL;
    public float LJJJLZIJ;
    public Object LJJJZ;
    public int LJJL;
    public String LJJLI;
    public int LJJLIIIIJ;
    public int LJJLIIIJ;
    public final float[] LJJLIIIJILLIZJL;
    public final C2267081DoQ[] LJJLIIIJJI;
    public final C2267081DoQ[] LJJLIIIJJIZ;
    public int LJJLIIIJL;
    public int LJJLIIIJLJLI;

    public final void LJJI() {
        this.LJIIL = false;
        this.LJIILIIL = false;
        this.LJIILJJIL = false;
        this.LJIILL = false;
        int size = this.LJJJI.size();
        for (int i = 0; i < size; i++) {
            C2267141DoW c2267141DoW = (C2267141DoW) ListProtector.get(this.LJJJI, i);
            c2267141DoW.LIZJ = false;
            c2267141DoW.LIZIZ = 0;
        }
    }

    public final void LIZ() {
        this.LJJJI.add(this.LJJIJ);
        this.LJJJI.add(this.LJJIJIIJI);
        this.LJJJI.add(this.LJJIJIIJIL);
        this.LJJJI.add(this.LJJIJIL);
        this.LJJJI.add(this.LJJIJLIJ);
        this.LJJJI.add(this.LJJIL);
        this.LJJJI.add(this.LJJIZ);
        this.LJJJI.add(this.LJJIJL);
    }

    public boolean LIZLLL() {
        return this.LJJL != 8;
    }

    public final int LJIIIIZZ() {
        if (this.LJJL == 8) {
            return 0;
        }
        return this.LJJJJJ;
    }

    public final int LJIIJJI() {
        if (this.LJJL == 8) {
            return 0;
        }
        return this.LJJJJIZL;
    }

    public final int LJIIL() {
        C2267271Doj c2267271Doj = this.LJJJJI;
        return (c2267271Doj == null || !(c2267271Doj instanceof C2267091DoR)) ? this.LJJJJLI : ((C2267091DoR) c2267271Doj).LJJZ + this.LJJJJLI;
    }

    public final int LJIILIIL() {
        C2267271Doj c2267271Doj = this.LJJJJI;
        return (c2267271Doj == null || !(c2267271Doj instanceof C2267091DoR)) ? this.LJJJJLL : ((C2267091DoR) c2267271Doj).LJJZZI + this.LJJJJLL;
    }

    public final boolean LJIJ() {
        C2267141DoW c2267141DoW = this.LJJIJ;
        C2267141DoW c2267141DoW2 = c2267141DoW.LJFF;
        if (c2267141DoW2 != null && c2267141DoW2.LJFF == c2267141DoW) {
            return true;
        }
        C2267141DoW c2267141DoW3 = this.LJJIJIIJIL;
        C2267141DoW c2267141DoW4 = c2267141DoW3.LJFF;
        return c2267141DoW4 != null && c2267141DoW4.LJFF == c2267141DoW3;
    }

    public final boolean LJIJI() {
        C2267141DoW c2267141DoW = this.LJJIJIIJI;
        C2267141DoW c2267141DoW2 = c2267141DoW.LJFF;
        if (c2267141DoW2 != null && c2267141DoW2.LJFF == c2267141DoW) {
            return true;
        }
        C2267141DoW c2267141DoW3 = this.LJJIJIL;
        C2267141DoW c2267141DoW4 = c2267141DoW3.LJFF;
        return c2267141DoW4 != null && c2267141DoW4.LJFF == c2267141DoW3;
    }

    public final boolean LJIJJ() {
        return this.LJI && this.LJJL != 8;
    }

    public boolean LJIJJLI() {
        if (this.LJIIL) {
            return true;
        }
        return this.LJJIJ.LIZJ && this.LJJIJIIJIL.LIZJ;
    }

    public boolean LJIL() {
        if (this.LJIILIIL) {
            return true;
        }
        return this.LJJIJIIJI.LIZJ && this.LJJIJIL.LIZJ;
    }

    public void LJJ() {
        this.LJJIJ.LJI();
        this.LJJIJIIJI.LJI();
        this.LJJIJIIJIL.LJI();
        this.LJJIJIL.LJI();
        this.LJJIJL.LJI();
        this.LJJIJLIJ.LJI();
        this.LJJIL.LJI();
        this.LJJIZ.LJI();
        this.LJJJJI = null;
        this.LJJIIZ = 0.0f;
        this.LJJJJIZL = 0;
        this.LJJJJJ = 0;
        this.LJJJJJL = 0.0f;
        this.LJJJJL = -1;
        this.LJJJJLI = 0;
        this.LJJJJLL = 0;
        this.LJJJJZ = 0;
        this.LJJJJZI = 0;
        this.LJJJLIIL = 0;
        this.LJJJLL = 0.5f;
        this.LJJJLZIJ = 0.5f;
        EnumC2266981DoG[] enumC2266981DoGArr = this.LJJJJ;
        EnumC2266981DoG enumC2266981DoG = EnumC2266981DoG.FIXED;
        enumC2266981DoGArr[0] = enumC2266981DoG;
        enumC2266981DoGArr[1] = enumC2266981DoG;
        this.LJJJZ = null;
        this.LJJL = 0;
        this.LJJLIIIIJ = 0;
        this.LJJLIIIJ = 0;
        float[] fArr = this.LJJLIIIJILLIZJL;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.LJIILLIIL = -1;
        this.LJIIZILJ = -1;
        int[] iArr = this.LJJIIJZLJL;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.LJIJ = 0;
        this.LJIJI = 0;
        this.LJJ = 1.0f;
        this.LJJII = 1.0f;
        this.LJIL = Integer.MAX_VALUE;
        this.LJJIFFI = Integer.MAX_VALUE;
        this.LJIJJLI = 0;
        this.LJJI = 0;
        this.LJJIII = -1;
        this.LJJIIJ = 1.0f;
        boolean[] zArr = this.LJFF;
        zArr[0] = true;
        zArr[1] = true;
        boolean[] zArr2 = this.LJJJIL;
        zArr2[0] = false;
        zArr2[1] = false;
        this.LJI = true;
        int[] iArr2 = this.LJIJJ;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.LJIIIIZZ = -1;
        this.LJIIIZ = -1;
    }

    public C2267081DoQ() {
        this.LJFF = new boolean[]{true, true};
        this.LJI = true;
        this.LJII = true;
        this.LJIIIIZZ = -1;
        this.LJIIIZ = -1;
        this.LJIIJ = new C2262541Dh6(this);
        this.LJIIL = false;
        this.LJIILIIL = false;
        this.LJIILJJIL = false;
        this.LJIILL = false;
        this.LJIILLIIL = -1;
        this.LJIIZILJ = -1;
        this.LJIJ = 0;
        this.LJIJI = 0;
        this.LJIJJ = new int[2];
        this.LJIJJLI = 0;
        this.LJIL = 0;
        this.LJJ = 1.0f;
        this.LJJI = 0;
        this.LJJIFFI = 0;
        this.LJJII = 1.0f;
        this.LJJIII = -1;
        this.LJJIIJ = 1.0f;
        this.LJJIIJZLJL = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.LJJIIZ = 0.0f;
        this.LJJIIZI = false;
        C2267141DoW c2267141DoW = new C2267141DoW(this, EnumC2266931DoB.LEFT);
        this.LJJIJ = c2267141DoW;
        C2267141DoW c2267141DoW2 = new C2267141DoW(this, EnumC2266931DoB.TOP);
        this.LJJIJIIJI = c2267141DoW2;
        C2267141DoW c2267141DoW3 = new C2267141DoW(this, EnumC2266931DoB.RIGHT);
        this.LJJIJIIJIL = c2267141DoW3;
        C2267141DoW c2267141DoW4 = new C2267141DoW(this, EnumC2266931DoB.BOTTOM);
        this.LJJIJIL = c2267141DoW4;
        C2267141DoW c2267141DoW5 = new C2267141DoW(this, EnumC2266931DoB.BASELINE);
        this.LJJIJL = c2267141DoW5;
        this.LJJIJLIJ = new C2267141DoW(this, EnumC2266931DoB.CENTER_X);
        this.LJJIL = new C2267141DoW(this, EnumC2266931DoB.CENTER_Y);
        C2267141DoW c2267141DoW6 = new C2267141DoW(this, EnumC2266931DoB.CENTER);
        this.LJJIZ = c2267141DoW6;
        this.LJJJ = new C2267141DoW[]{c2267141DoW, c2267141DoW3, c2267141DoW2, c2267141DoW4, c2267141DoW5, c2267141DoW6};
        this.LJJJI = new ArrayList<>();
        this.LJJJIL = new boolean[2];
        EnumC2266981DoG enumC2266981DoG = EnumC2266981DoG.FIXED;
        this.LJJJJ = new EnumC2266981DoG[]{enumC2266981DoG, enumC2266981DoG};
        this.LJJJJI = null;
        this.LJJJJIZL = 0;
        this.LJJJJJ = 0;
        this.LJJJJJL = 0.0f;
        this.LJJJJL = -1;
        this.LJJJJLI = 0;
        this.LJJJJLL = 0;
        this.LJJJJZ = 0;
        this.LJJJLL = 0.5f;
        this.LJJJLZIJ = 0.5f;
        this.LJJL = 0;
        this.LJJLI = null;
        this.LJJLIIIIJ = 0;
        this.LJJLIIIJ = 0;
        this.LJJLIIIJILLIZJL = new float[]{-1.0f, -1.0f};
        this.LJJLIIIJJI = new C2267081DoQ[]{null, null};
        this.LJJLIIIJJIZ = new C2267081DoQ[]{null, null};
        this.LJJLIIIJL = -1;
        this.LJJLIIIJLJLI = -1;
        LIZ();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String strLIZIZ = "";
        sbLIZ.append("");
        if (this.LJJLI != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("id: ");
            sbLIZ2.append(this.LJJLI);
            sbLIZ2.append(" ");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        sbLIZ.append(strLIZIZ);
        sbLIZ.append(e3.h);
        sbLIZ.append(this.LJJJJLI);
        sbLIZ.append(", ");
        sbLIZ.append(this.LJJJJLL);
        sbLIZ.append(") - (");
        sbLIZ.append(this.LJJJJIZL);
        sbLIZ.append(" x ");
        sbLIZ.append(this.LJJJJJ);
        sbLIZ.append(")");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LJFF(C21536919Qh c21536919Qh) {
        c21536919Qh.LJIIJ(this.LJJIJ);
        c21536919Qh.LJIIJ(this.LJJIJIIJI);
        c21536919Qh.LJIIJ(this.LJJIJIIJIL);
        c21536919Qh.LJIIJ(this.LJJIJIL);
        if (this.LJJJJZ > 0) {
            c21536919Qh.LJIIJ(this.LJJIJL);
        }
    }

    public C2267141DoW LJI(EnumC2266931DoB enumC2266931DoB) {
        switch (C2266971DoF.LIZ[enumC2266931DoB.ordinal()]) {
            case 1:
                return this.LJJIJ;
            case 2:
                return this.LJJIJIIJI;
            case 3:
                return this.LJJIJIIJIL;
            case 4:
                return this.LJJIJIL;
            case 5:
                return this.LJJIJL;
            case 6:
                return this.LJJIZ;
            case 7:
                return this.LJJIJLIJ;
            case 8:
                return this.LJJIL;
            case BdTuring.TYPE_ECAF /* 9 */:
                return null;
            default:
                throw new AssertionError(enumC2266931DoB.name());
        }
    }

    public final EnumC2266981DoG LJII(int i) {
        if (i == 0) {
            return this.LJJJJ[0];
        }
        if (i == 1) {
            return this.LJJJJ[1];
        }
        return null;
    }

    public final C2267081DoQ LJIIIZ(int i) {
        C2267141DoW c2267141DoW;
        C2267141DoW c2267141DoW2;
        if (i == 0) {
            C2267141DoW c2267141DoW3 = this.LJJIJIIJIL;
            C2267141DoW c2267141DoW4 = c2267141DoW3.LJFF;
            if (c2267141DoW4 != null && c2267141DoW4.LJFF == c2267141DoW3) {
                return c2267141DoW4.LIZLLL;
            }
            return null;
        }
        if (i == 1 && (c2267141DoW2 = (c2267141DoW = this.LJJIJIL).LJFF) != null && c2267141DoW2.LJFF == c2267141DoW) {
            return c2267141DoW2.LIZLLL;
        }
        return null;
    }

    public final C2267081DoQ LJIIJ(int i) {
        C2267141DoW c2267141DoW;
        C2267141DoW c2267141DoW2;
        if (i == 0) {
            C2267141DoW c2267141DoW3 = this.LJJIJ;
            C2267141DoW c2267141DoW4 = c2267141DoW3.LJFF;
            if (c2267141DoW4 != null && c2267141DoW4.LJFF == c2267141DoW3) {
                return c2267141DoW4.LIZLLL;
            }
            return null;
        }
        if (i == 1 && (c2267141DoW2 = (c2267141DoW = this.LJJIJIIJI).LJFF) != null && c2267141DoW2.LJFF == c2267141DoW) {
            return c2267141DoW2.LIZLLL;
        }
        return null;
    }

    public final boolean LJIILJJIL(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (i == 0) {
            if (this.LJJIJ.LJFF != null) {
                i5 = 1;
            } else {
                i5 = 0;
            }
            if (this.LJJIJIIJIL.LJFF != null) {
                i6 = 1;
            } else {
                i6 = 0;
            }
            if (i5 + i6 < 2) {
                return true;
            }
            return false;
        }
        if (this.LJJIJIIJI.LJFF != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (this.LJJIJIL.LJFF != null) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        int i7 = i2 + i3;
        if (this.LJJIJL.LJFF != null) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        if (i7 + i4 < 2) {
            return true;
        }
        return false;
    }

    public final boolean LJIIZILJ(int i) {
        C2267141DoW c2267141DoW;
        C2267141DoW c2267141DoW2;
        int i2 = i * 2;
        C2267141DoW[] c2267141DoWArr = this.LJJJ;
        C2267141DoW c2267141DoW3 = c2267141DoWArr[i2];
        C2267141DoW c2267141DoW4 = c2267141DoW3.LJFF;
        if (c2267141DoW4 != null && c2267141DoW4.LJFF != c2267141DoW3 && (c2267141DoW2 = (c2267141DoW = c2267141DoWArr[i2 + 1]).LJFF) != null && c2267141DoW2.LJFF == c2267141DoW) {
            return true;
        }
        return false;
    }

    public void LJJIFFI(C21537219Qk c21537219Qk) {
        this.LJJIJ.LJII();
        this.LJJIJIIJI.LJII();
        this.LJJIJIIJIL.LJII();
        this.LJJIJIL.LJII();
        this.LJJIJL.LJII();
        this.LJJIZ.LJII();
        this.LJJIJLIJ.LJII();
        this.LJJIL.LJII();
    }

    public final void LJJIIJ(int i) {
        this.LJJJJJ = i;
        int i2 = this.LJJJLIIL;
        if (i < i2) {
            this.LJJJJJ = i2;
        }
    }

    public final void LJJIIJZLJL(EnumC2266981DoG enumC2266981DoG) {
        this.LJJJJ[0] = enumC2266981DoG;
    }

    public final void LJJIIZ(EnumC2266981DoG enumC2266981DoG) {
        this.LJJJJ[1] = enumC2266981DoG;
    }

    public final void LJJIIZI(int i) {
        this.LJJJJIZL = i;
        int i2 = this.LJJJJZI;
        if (i < i2) {
            this.LJJJJIZL = i2;
        }
    }

    public C2267081DoQ(int i, int i2) {
        this.LJFF = new boolean[]{true, true};
        this.LJI = true;
        this.LJII = true;
        this.LJIIIIZZ = -1;
        this.LJIIIZ = -1;
        this.LJIIJ = new C2262541Dh6(this);
        this.LJIIL = false;
        this.LJIILIIL = false;
        this.LJIILJJIL = false;
        this.LJIILL = false;
        this.LJIILLIIL = -1;
        this.LJIIZILJ = -1;
        this.LJIJ = 0;
        this.LJIJI = 0;
        this.LJIJJ = new int[2];
        this.LJIJJLI = 0;
        this.LJIL = 0;
        this.LJJ = 1.0f;
        this.LJJI = 0;
        this.LJJIFFI = 0;
        this.LJJII = 1.0f;
        this.LJJIII = -1;
        this.LJJIIJ = 1.0f;
        this.LJJIIJZLJL = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.LJJIIZ = 0.0f;
        this.LJJIIZI = false;
        C2267141DoW c2267141DoW = new C2267141DoW(this, EnumC2266931DoB.LEFT);
        this.LJJIJ = c2267141DoW;
        C2267141DoW c2267141DoW2 = new C2267141DoW(this, EnumC2266931DoB.TOP);
        this.LJJIJIIJI = c2267141DoW2;
        C2267141DoW c2267141DoW3 = new C2267141DoW(this, EnumC2266931DoB.RIGHT);
        this.LJJIJIIJIL = c2267141DoW3;
        C2267141DoW c2267141DoW4 = new C2267141DoW(this, EnumC2266931DoB.BOTTOM);
        this.LJJIJIL = c2267141DoW4;
        C2267141DoW c2267141DoW5 = new C2267141DoW(this, EnumC2266931DoB.BASELINE);
        this.LJJIJL = c2267141DoW5;
        this.LJJIJLIJ = new C2267141DoW(this, EnumC2266931DoB.CENTER_X);
        this.LJJIL = new C2267141DoW(this, EnumC2266931DoB.CENTER_Y);
        C2267141DoW c2267141DoW6 = new C2267141DoW(this, EnumC2266931DoB.CENTER);
        this.LJJIZ = c2267141DoW6;
        this.LJJJ = new C2267141DoW[]{c2267141DoW, c2267141DoW3, c2267141DoW2, c2267141DoW4, c2267141DoW5, c2267141DoW6};
        this.LJJJI = new ArrayList<>();
        this.LJJJIL = new boolean[2];
        EnumC2266981DoG enumC2266981DoG = EnumC2266981DoG.FIXED;
        this.LJJJJ = new EnumC2266981DoG[]{enumC2266981DoG, enumC2266981DoG};
        this.LJJJJI = null;
        this.LJJJJJL = 0.0f;
        this.LJJJJL = -1;
        this.LJJJJZ = 0;
        this.LJJJLL = 0.5f;
        this.LJJJLZIJ = 0.5f;
        this.LJJL = 0;
        this.LJJLI = null;
        this.LJJLIIIIJ = 0;
        this.LJJLIIIJ = 0;
        this.LJJLIIIJILLIZJL = new float[]{-1.0f, -1.0f};
        this.LJJLIIIJJI = new C2267081DoQ[]{null, null};
        this.LJJLIIIJJIZ = new C2267081DoQ[]{null, null};
        this.LJJLIIIJL = -1;
        this.LJJLIIIJLJLI = -1;
        this.LJJJJLI = 0;
        this.LJJJJLL = 0;
        this.LJJJJIZL = i;
        this.LJJJJJ = i2;
        LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0344 A[PHI: r7 r39
      0x0344: PHI (r7v7 int) = (r7v36 int), (r7v37 int) binds: [B:322:0x065c, B:210:0x0342] A[DONT_GENERATE, DONT_INLINE]
      0x0344: PHI (r39v0 boolean) = (r39v3 boolean), (r39v4 boolean) binds: [B:322:0x065c, B:210:0x0342] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0405 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x05e9 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Removed duplicated region for block: B:306:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0623  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0660 A[PHI: r39
      0x0660: PHI (r39v2 boolean) = (r39v0 boolean), (r39v3 boolean) binds: [B:213:0x0349, B:322:0x065c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:348:0x06c7 A[PHI: r14 r19 r20 r21
      0x06c7: PHI (r14v1 int) = (r14v0 int), (r14v0 int), (r14v4 int), (r14v6 int) binds: [B:155:0x02a8, B:157:0x02ae, B:357:0x06e5, B:347:0x06c6] A[DONT_GENERATE, DONT_INLINE]
      0x06c7: PHI (r19v1 int) = (r19v0 int), (r19v0 int), (r19v4 int), (r19v3 int) binds: [B:155:0x02a8, B:157:0x02ae, B:357:0x06e5, B:347:0x06c6] A[DONT_GENERATE, DONT_INLINE]
      0x06c7: PHI (r20v2 int) = (r20v1 int), (r20v1 int), (r20v6 int), (r20v1 int) binds: [B:155:0x02a8, B:157:0x02ae, B:357:0x06e5, B:347:0x06c6] A[DONT_GENERATE, DONT_INLINE]
      0x06c7: PHI (r21v2 int) = (r21v1 int), (r21v1 int), (r21v1 int), (r21v6 int) binds: [B:155:0x02a8, B:157:0x02ae, B:357:0x06e5, B:347:0x06c6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:359:0x06ed  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x06f1  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0701  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LIZJ(X.C21536919Qh r79, boolean r80) {
        /*
            Method dump skipped, instruction units count: 1799
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2267081DoQ.LIZJ(X.19Qh, boolean):void");
    }

    public final boolean LJIILL(int i, int i2) {
        C2267141DoW c2267141DoW;
        C2267141DoW c2267141DoW2;
        if (i == 0) {
            C2267141DoW c2267141DoW3 = this.LJJIJ.LJFF;
            if (c2267141DoW3 != null && c2267141DoW3.LIZJ && (c2267141DoW2 = this.LJJIJIIJIL.LJFF) != null && c2267141DoW2.LIZJ && (c2267141DoW2.LIZJ() - this.LJJIJIIJIL.LIZLLL()) - (this.LJJIJ.LJFF.LIZJ() + this.LJJIJ.LIZLLL()) >= i2) {
                return true;
            }
            return false;
        }
        C2267141DoW c2267141DoW4 = this.LJJIJIIJI.LJFF;
        if (c2267141DoW4 != null && c2267141DoW4.LIZJ && (c2267141DoW = this.LJJIJIL.LJFF) != null && c2267141DoW.LIZJ && (c2267141DoW.LIZJ() - this.LJJIJIL.LIZLLL()) - (this.LJJIJIIJI.LJFF.LIZJ() + this.LJJIJIIJI.LIZLLL()) >= i2) {
            return true;
        }
        return false;
        return false;
    }

    public final void LJJII(int i, int i2) {
        if (this.LJIIL) {
            return;
        }
        this.LJJIJ.LJIIIIZZ(i);
        this.LJJIJIIJIL.LJIIIIZZ(i2);
        this.LJJJJLI = i;
        this.LJJJJIZL = i2 - i;
        this.LJIIL = true;
    }

    public final void LJJIII(int i, int i2) {
        if (this.LJIILIIL) {
            return;
        }
        this.LJJIJIIJI.LJIIIIZZ(i);
        this.LJJIJIL.LJIIIIZZ(i2);
        this.LJJJJLL = i;
        this.LJJJJJ = i2 - i;
        if (this.LJJIIZI) {
            this.LJJIJL.LJIIIIZZ(i + this.LJJJJZ);
        }
        this.LJIILIIL = true;
    }

    public void LJJIJ(boolean z, boolean z2) {
        int i;
        int i2;
        C2267101DoS c2267101DoS = this.LIZLLL;
        boolean z3 = z & c2267101DoS.LJI;
        C2267111DoT c2267111DoT = this.LJ;
        boolean z4 = z2 & c2267111DoT.LJI;
        int i3 = c2267101DoS.LJII.LJI;
        int i4 = c2267111DoT.LJII.LJI;
        int i5 = c2267101DoS.LJIIIIZZ.LJI;
        int i6 = c2267111DoT.LJIIIIZZ.LJI;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (z3) {
            this.LJJJJLI = i3;
        }
        if (z4) {
            this.LJJJJLL = i4;
        }
        if (this.LJJL == 8) {
            this.LJJJJIZL = 0;
            this.LJJJJJ = 0;
            return;
        }
        if (z3) {
            if (this.LJJJJ[0] == EnumC2266981DoG.FIXED && i8 < (i2 = this.LJJJJIZL)) {
                i8 = i2;
            }
            this.LJJJJIZL = i8;
            int i10 = this.LJJJJZI;
            if (i8 < i10) {
                this.LJJJJIZL = i10;
            }
        }
        if (z4) {
            if (this.LJJJJ[1] == EnumC2266981DoG.FIXED && i9 < (i = this.LJJJJJ)) {
                i9 = i;
            }
            this.LJJJJJ = i9;
            int i11 = this.LJJJLIIL;
            if (i9 < i11) {
                this.LJJJJJ = i11;
            }
        }
    }

    public void LJJIJIIJI(C21536919Qh c21536919Qh, boolean z) {
        int i;
        int i2;
        C2267141DoW c2267141DoW = this.LJJIJ;
        c21536919Qh.getClass();
        int iLJIILIIL = C21536919Qh.LJIILIIL(c2267141DoW);
        int iLJIILIIL2 = C21536919Qh.LJIILIIL(this.LJJIJIIJI);
        int iLJIILIIL3 = C21536919Qh.LJIILIIL(this.LJJIJIIJIL);
        int iLJIILIIL4 = C21536919Qh.LJIILIIL(this.LJJIJIL);
        if (z) {
            C2267101DoS c2267101DoS = this.LIZLLL;
            if (c2267101DoS != null) {
                C2267191Dob c2267191Dob = c2267101DoS.LJII;
                if (c2267191Dob.LJIIIZ) {
                    C2267191Dob c2267191Dob2 = c2267101DoS.LJIIIIZZ;
                    if (c2267191Dob2.LJIIIZ) {
                        iLJIILIIL = c2267191Dob.LJI;
                        iLJIILIIL3 = c2267191Dob2.LJI;
                    }
                }
            }
            C2267111DoT c2267111DoT = this.LJ;
            if (c2267111DoT != null) {
                C2267191Dob c2267191Dob3 = c2267111DoT.LJII;
                if (c2267191Dob3.LJIIIZ) {
                    C2267191Dob c2267191Dob4 = c2267111DoT.LJIIIIZZ;
                    if (c2267191Dob4.LJIIIZ) {
                        iLJIILIIL2 = c2267191Dob3.LJI;
                        iLJIILIIL4 = c2267191Dob4.LJI;
                    }
                }
            }
        }
        int i3 = iLJIILIIL4 - iLJIILIIL2;
        if (iLJIILIIL3 - iLJIILIIL < 0 || i3 < 0 || iLJIILIIL == Integer.MIN_VALUE || iLJIILIIL == Integer.MAX_VALUE || iLJIILIIL2 == Integer.MIN_VALUE || iLJIILIIL2 == Integer.MAX_VALUE || iLJIILIIL3 == Integer.MIN_VALUE || iLJIILIIL3 == Integer.MAX_VALUE || iLJIILIIL4 == Integer.MIN_VALUE || iLJIILIIL4 == Integer.MAX_VALUE) {
            iLJIILIIL = 0;
            iLJIILIIL2 = 0;
            iLJIILIIL3 = 0;
            iLJIILIIL4 = 0;
        }
        int i4 = iLJIILIIL3 - iLJIILIIL;
        int i5 = iLJIILIIL4 - iLJIILIIL2;
        this.LJJJJLI = iLJIILIIL;
        this.LJJJJLL = iLJIILIIL2;
        if (this.LJJL == 8) {
            this.LJJJJIZL = 0;
            this.LJJJJJ = 0;
            return;
        }
        EnumC2266981DoG[] enumC2266981DoGArr = this.LJJJJ;
        EnumC2266981DoG enumC2266981DoG = enumC2266981DoGArr[0];
        EnumC2266981DoG enumC2266981DoG2 = EnumC2266981DoG.FIXED;
        if (enumC2266981DoG == enumC2266981DoG2 && i4 < (i2 = this.LJJJJIZL)) {
            i4 = i2;
        }
        if (enumC2266981DoGArr[1] == enumC2266981DoG2 && i5 < (i = this.LJJJJJ)) {
            i5 = i;
        }
        this.LJJJJIZL = i4;
        this.LJJJJJ = i5;
        int i6 = this.LJJJLIIL;
        if (i5 < i6) {
            this.LJJJJJ = i6;
        }
        int i7 = this.LJJJJZI;
        if (i4 < i7) {
            this.LJJJJIZL = i7;
        }
        int i8 = this.LJIL;
        if (i8 > 0 && enumC2266981DoG == EnumC2266981DoG.MATCH_CONSTRAINT) {
            this.LJJJJIZL = Math.min(this.LJJJJIZL, i8);
        }
        int i9 = this.LJJIFFI;
        if (i9 > 0 && this.LJJJJ[1] == EnumC2266981DoG.MATCH_CONSTRAINT) {
            this.LJJJJJ = Math.min(this.LJJJJJ, i9);
        }
        int i10 = this.LJJJJIZL;
        if (i4 != i10) {
            this.LJIIIIZZ = i10;
        }
        int i11 = this.LJJJJJ;
        if (i5 == i11) {
            return;
        }
        this.LJIIIZ = i11;
    }

    public final void LIZIZ(C2267091DoR c2267091DoR, C21536919Qh c21536919Qh, HashSet<C2267081DoQ> hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            C2267231Dof.LIZ(c2267091DoR, c21536919Qh, this);
            hashSet.remove(this);
            LIZJ(c21536919Qh, c2267091DoR.LJJIL(64));
        }
        if (i == 0) {
            HashSet<C2267141DoW> hashSet2 = this.LJJIJ.LIZ;
            if (hashSet2 != null) {
                Iterator<C2267141DoW> it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZLLL.LIZIZ(c2267091DoR, c21536919Qh, hashSet, 0, true);
                }
            }
            HashSet<C2267141DoW> hashSet3 = this.LJJIJIIJIL.LIZ;
            if (hashSet3 != null) {
                Iterator<C2267141DoW> it3 = hashSet3.iterator();
                while (it3.hasNext()) {
                    it3.next().LIZLLL.LIZIZ(c2267091DoR, c21536919Qh, hashSet, 0, true);
                }
                return;
            }
            return;
        }
        HashSet<C2267141DoW> hashSet4 = this.LJJIJIIJI.LIZ;
        if (hashSet4 != null) {
            Iterator<C2267141DoW> it4 = hashSet4.iterator();
            while (it4.hasNext()) {
                it4.next().LIZLLL.LIZIZ(c2267091DoR, c21536919Qh, hashSet, i, true);
            }
        }
        HashSet<C2267141DoW> hashSet5 = this.LJJIJIL.LIZ;
        if (hashSet5 != null) {
            Iterator<C2267141DoW> it5 = hashSet5.iterator();
            while (it5.hasNext()) {
                it5.next().LIZLLL.LIZIZ(c2267091DoR, c21536919Qh, hashSet, i, true);
            }
        }
        HashSet<C2267141DoW> hashSet6 = this.LJJIJL.LIZ;
        if (hashSet6 != null) {
            Iterator<C2267141DoW> it6 = hashSet6.iterator();
            while (it6.hasNext()) {
                it6.next().LIZLLL.LIZIZ(c2267091DoR, c21536919Qh, hashSet, i, true);
            }
        }
    }

    public final void LJIILLIIL(EnumC2266931DoB enumC2266931DoB, C2267081DoQ c2267081DoQ, EnumC2266931DoB enumC2266931DoB2, int i, int i2) {
        LJI(enumC2266931DoB).LIZ(c2267081DoQ.LJI(enumC2266931DoB2), i, i2, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x0202 A[PHI: r2 r3 r4 r11 r18 r33
      0x0202: PHI (r2v26 int) = (r2v27 int), (r2v28 int) binds: [B:154:0x0200, B:107:0x0168] A[DONT_GENERATE, DONT_INLINE]
      0x0202: PHI (r3v72 int) = (r3v73 int), (r3v86 int) binds: [B:154:0x0200, B:107:0x0168] A[DONT_GENERATE, DONT_INLINE]
      0x0202: PHI (r4v42 int) = (r4v43 int), (r4v57 int) binds: [B:154:0x0200, B:107:0x0168] A[DONT_GENERATE, DONT_INLINE]
      0x0202: PHI (r11v11 boolean) = (r11v12 boolean), (r11v15 boolean) binds: [B:154:0x0200, B:107:0x0168] A[DONT_GENERATE, DONT_INLINE]
      0x0202: PHI (r18v3 boolean) = (r18v4 boolean), (r18v6 boolean) binds: [B:154:0x0200, B:107:0x0168] A[DONT_GENERATE, DONT_INLINE]
      0x0202: PHI (r33v6 int) = (r33v7 int), (r33v15 int) binds: [B:154:0x0200, B:107:0x0168] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0206 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02ec A[PHI: r2 r3 r4 r11 r18 r33
      0x02ec: PHI (r2v22 int) = (r2v26 int), (r2v26 int), (r2v27 int) binds: [B:156:0x0204, B:157:0x0206, B:154:0x0200] A[DONT_GENERATE, DONT_INLINE]
      0x02ec: PHI (r3v58 int) = (r3v72 int), (r3v72 int), (r3v73 int) binds: [B:156:0x0204, B:157:0x0206, B:154:0x0200] A[DONT_GENERATE, DONT_INLINE]
      0x02ec: PHI (r4v26 int) = (r4v42 int), (r4v42 int), (r4v43 int) binds: [B:156:0x0204, B:157:0x0206, B:154:0x0200] A[DONT_GENERATE, DONT_INLINE]
      0x02ec: PHI (r11v6 boolean) = (r11v11 boolean), (r11v11 boolean), (r11v12 boolean) binds: [B:156:0x0204, B:157:0x0206, B:154:0x0200] A[DONT_GENERATE, DONT_INLINE]
      0x02ec: PHI (r18v1 boolean) = (r18v3 boolean), (r18v3 boolean), (r18v4 boolean) binds: [B:156:0x0204, B:157:0x0206, B:154:0x0200] A[DONT_GENERATE, DONT_INLINE]
      0x02ec: PHI (r33v2 int) = (r33v6 int), (r33v6 int), (r33v7 int) binds: [B:156:0x0204, B:157:0x0206, B:154:0x0200] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0438 A[PHI: r3
      0x0438: PHI (r3v39 boolean) = (r3v40 boolean), (r3v43 boolean) binds: [B:304:0x0418, B:302:0x0412] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:316:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:317:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:321:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(X.C21536919Qh r36, boolean r37, boolean r38, boolean r39, boolean r40, X.C21537019Qi r41, X.C21537019Qi r42, X.EnumC2266981DoG r43, boolean r44, X.C2267141DoW r45, X.C2267141DoW r46, int r47, int r48, int r49, int r50, float r51, boolean r52, boolean r53, boolean r54, boolean r55, boolean r56, int r57, int r58, int r59, int r60, float r61, boolean r62) {
        /*
            Method dump skipped, instruction units count: 1085
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2267081DoQ.LJ(X.19Qh, boolean, boolean, boolean, boolean, X.19Qi, X.19Qi, X.1DoG, boolean, X.1DoW, X.1DoW, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }
}
