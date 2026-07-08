package X;

import java.io.Closeable;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0jqF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1296450jqF implements Closeable {
    public int LL;
    public final int[] LLILLJJLI = new int[32];
    public final String[] LLILLL = new String[32];
    public final int[] LLILZ = new int[32];
    public boolean LLILZIL;
    public boolean LLILZLL;

    public abstract void LIZ();

    public abstract void LIZIZ();

    public abstract void LIZLLL();

    public abstract void LJFF();

    public abstract boolean LJII();

    public abstract boolean LJIILL();

    public abstract double LJIILLIIL();

    public abstract int LJIIZILJ();

    public abstract String LJIJJ();

    public abstract void LJIJJLI();

    public abstract String LJJ();

    public abstract EnumC1296400jqA LJJIL();

    public abstract int LJJJJ(C1296760jqk c1296760jqk);

    public abstract void LJJJJJ();

    public final String LJI() {
        return C1888307aT.LIZ(this.LL, this.LLILLJJLI, this.LLILZ, this.LLILLL);
    }

    public final Object LJJJ() {
        switch (C1296410jqB.LIZ[LJJIL().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                LIZ();
                while (LJII()) {
                    arrayList.add(LJJJ());
                }
                LIZLLL();
                return arrayList;
            case 2:
                C13X5 c13x5 = new C13X5();
                LIZIZ();
                while (LJII()) {
                    String strLJIJJ = LJIJJ();
                    Object objLJJJ = LJJJ();
                    Object objPut = c13x5.put(strLJIJJ, objLJJJ);
                    if (objPut != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Map key '");
                        sbLIZ.append(strLJIJJ);
                        sbLIZ.append("' has multiple values at path ");
                        sbLIZ.append(LJI());
                        sbLIZ.append(": ");
                        sbLIZ.append(objPut);
                        sbLIZ.append(" and ");
                        sbLIZ.append(objLJJJ);
                        throw new C1296420jqC(C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
                LJFF();
                return c13x5;
            case 3:
                return LJJ();
            case 4:
                return Double.valueOf(LJIILLIIL());
            case 5:
                return Boolean.valueOf(LJIILL());
            case 6:
                LJIJJLI();
                return null;
            default:
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Expected a value but was ");
                sbLIZ2.append(LJJIL());
                sbLIZ2.append(" at path ");
                sbLIZ2.append(LJI());
                throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public final void LJJIZ(int i) {
        int i2 = this.LL;
        int[] iArr = this.LLILLJJLI;
        if (i2 != iArr.length) {
            this.LL = i2 + 1;
            iArr[i2] = i;
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Nesting too deep at ");
            sbLIZ.append(LJI());
            throw new C1296420jqC(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LJJJJJL(String str) throws C1296430jqD {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(" at path ");
        sbLIZ.append(LJI());
        throw new C1296430jqD(C2188811AlT.LIZIZ(sbLIZ));
    }
}
