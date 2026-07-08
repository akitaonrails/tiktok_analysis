package X;

import android.graphics.Matrix;
import android.graphics.Shader;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS15S0300100_25;

/* JADX INFO: renamed from: X.0u8Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1692200u8Y {
    public final C1692210u8Z LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public final int LJFF;
    public final List<C1683130ttv> LJI;
    public final List<C1692260u8e> LJII;

    public final float LIZIZ(int i) {
        LJIILJJIL(i);
        C1692260u8e c1692260u8e = (C1692260u8e) ListProtector.get(this.LJII, C1692240u8c.LIZIZ(i, this.LJII));
        return c1692260u8e.LIZ.LJIIIIZZ(i - c1692260u8e.LIZLLL) + c1692260u8e.LJFF;
    }

    public final int LIZLLL(int i) {
        int iLIZ;
        if (i >= this.LIZ.LIZ.length()) {
            iLIZ = C1697810uHb.LJIIJ(this.LJII);
        } else if (i < 0) {
            iLIZ = 0;
        } else {
            iLIZ = C1692240u8c.LIZ(i, this.LJII);
        }
        C1692260u8e c1692260u8e = (C1692260u8e) ListProtector.get(this.LJII, iLIZ);
        return c1692260u8e.LIZ.LJIIL(c1692260u8e.LIZLLL(i)) + c1692260u8e.LIZLLL;
    }

    public final int LJ(float f) {
        C1692260u8e c1692260u8e = (C1692260u8e) ListProtector.get(this.LJII, C1692240u8c.LIZJ(this.LJII, f));
        if (c1692260u8e.LIZJ - c1692260u8e.LIZIZ == 0) {
            return c1692260u8e.LIZLLL;
        }
        return c1692260u8e.LIZ.LJIJ(f - c1692260u8e.LJFF) + c1692260u8e.LIZLLL;
    }

    public final float LJFF(int i) {
        LJIILJJIL(i);
        C1692260u8e c1692260u8e = (C1692260u8e) ListProtector.get(this.LJII, C1692240u8c.LIZIZ(i, this.LJII));
        return c1692260u8e.LIZ.LJIIIZ(i - c1692260u8e.LIZLLL) + c1692260u8e.LJFF;
    }

    public final int LJI(long j) {
        int i = (int) (j & 4294967295L);
        C1692260u8e c1692260u8e = (C1692260u8e) ListProtector.get(this.LJII, C1692240u8c.LIZJ(this.LJII, Float.intBitsToFloat(i)));
        int i2 = c1692260u8e.LIZJ;
        int i3 = c1692260u8e.LIZIZ;
        if (i2 - i3 != 0) {
            InterfaceC1692190u8X interfaceC1692190u8X = c1692260u8e.LIZ;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            return interfaceC1692190u8X.LJIILL((((long) Float.floatToRawIntBits(Float.intBitsToFloat(i) - c1692260u8e.LJFF)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)) + c1692260u8e.LIZIZ;
        }
        return i3;
    }

    public final void LJIIL(int i) {
        if (i >= 0 && i < this.LIZ.LIZ.LLILLJJLI.length()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("offset(");
        sbLIZ.append(i);
        sbLIZ.append(") is out of bounds [0, ");
        sbLIZ.append(this.LIZ.LIZ.length());
        sbLIZ.append(')');
        C1681000tqU.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJIILIIL(int i) {
        if (i >= 0 && i <= this.LIZ.LIZ.LLILLJJLI.length()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("offset(");
        sbLIZ.append(i);
        sbLIZ.append(") is out of bounds [0, ");
        sbLIZ.append(this.LIZ.LIZ.length());
        sbLIZ.append(']');
        C1681000tqU.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJIILJJIL(int i) {
        if (i >= 0 && i < this.LJFF) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("lineIndex(");
        sbLIZ.append(i);
        sbLIZ.append(") is out of bounds [0, ");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        C1681000tqU.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LIZ(long j, float[] fArr) {
        LJIIL(C1692280u8g.LJI(j));
        LJIILIIL(C1692280u8g.LJFF(j));
        C118300cf c118300cf = new C118300cf();
        c118300cf.element = 0;
        C1692240u8c.LIZLLL(this.LJII, j, new AwS15S0300100_25(j, fArr, c118300cf, new C817403Hg(), 1));
    }

    public final int LIZJ(int i, boolean z) {
        LJIILJJIL(i);
        C1692260u8e c1692260u8e = (C1692260u8e) ListProtector.get(this.LJII, C1692240u8c.LIZIZ(i, this.LJII));
        return c1692260u8e.LIZ.LJIILLIIL(i - c1692260u8e.LIZLLL, z) + c1692260u8e.LIZIZ;
    }

    public final long LJII(C1683130ttv c1683130ttv, int i, InterfaceC1694730uCd interfaceC1694730uCd) {
        long jLIZIZ;
        long j;
        int iLIZJ = C1692240u8c.LIZJ(this.LJII, c1683130ttv.LIZIZ);
        if (((C1692260u8e) ListProtector.get(this.LJII, iLIZJ)).LJI < c1683130ttv.LIZLLL && iLIZJ != C1697810uHb.LJIIJ(this.LJII)) {
            int iLIZJ2 = C1692240u8c.LIZJ(this.LJII, c1683130ttv.LIZLLL);
            long jLIZIZ2 = C1692280u8g.LIZIZ;
            while (true) {
                jLIZIZ = C1692280u8g.LIZIZ;
                if (!C1692280u8g.LIZIZ(jLIZIZ2, jLIZIZ) || iLIZJ > iLIZJ2) {
                    break;
                }
                C1692260u8e c1692260u8e = (C1692260u8e) ListProtector.get(this.LJII, iLIZJ);
                jLIZIZ2 = c1692260u8e.LIZIZ(c1692260u8e.LIZ.LJIILIIL(c1692260u8e.LIZJ(c1683130ttv), i, interfaceC1694730uCd), true);
                iLIZJ++;
            }
            if (C1692280u8g.LIZIZ(jLIZIZ2, jLIZIZ)) {
                return jLIZIZ;
            }
            while (true) {
                j = C1692280u8g.LIZIZ;
                if (!C1692280u8g.LIZIZ(jLIZIZ, j) || iLIZJ > iLIZJ2) {
                    break;
                }
                C1692260u8e c1692260u8e2 = (C1692260u8e) ListProtector.get(this.LJII, iLIZJ2);
                jLIZIZ = c1692260u8e2.LIZIZ(c1692260u8e2.LIZ.LJIILIIL(c1692260u8e2.LIZJ(c1683130ttv), i, interfaceC1694730uCd), true);
                iLIZJ2--;
            }
            if (C1692280u8g.LIZIZ(jLIZIZ, j)) {
                return jLIZIZ2;
            }
            return C1680680tpy.LIZ((int) (jLIZIZ2 >> 32), C1692280u8g.LIZLLL(jLIZIZ));
        }
        C1692260u8e c1692260u8e3 = (C1692260u8e) ListProtector.get(this.LJII, iLIZJ);
        return c1692260u8e3.LIZIZ(c1692260u8e3.LIZ.LJIILIIL(c1692260u8e3.LIZJ(c1683130ttv), i, interfaceC1694730uCd), true);
    }

    public C1692200u8Y(C1692210u8Z c1692210u8Z, long j, int i, int i2) {
        boolean z;
        C1683130ttv c1683130ttvLIZ;
        int iLJII;
        this.LIZ = c1692210u8Z;
        this.LIZIZ = i;
        if (C1682380tsi.LJIIJ(j) != 0 || C1682380tsi.LJIIIZ(j) != 0) {
            C1681000tqU.LIZ("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) c1692210u8Z.LJ;
        int size = arrayList2.size();
        int i3 = 0;
        float f = 0.0f;
        int i4 = 0;
        while (i4 < size) {
            C1692590u9B c1692590u9B = (C1692590u9B) ListProtector.get(arrayList2, i4);
            InterfaceC1692630u9F interfaceC1692630u9F = c1692590u9B.LIZ;
            int iLJIIIIZZ = C1682380tsi.LJIIIIZZ(j);
            if (C1682380tsi.LIZLLL(j)) {
                iLJII = C1682380tsi.LJII(j) - ((int) Math.ceil(f));
                if (iLJII < 0) {
                    iLJII = 0;
                }
            } else {
                iLJII = C1682380tsi.LJII(j);
            }
            C1695170uDL c1695170uDL = new C1695170uDL((C1695120uDG) interfaceC1692630u9F, this.LIZIZ - i3, i2, C1682390tsj.LIZ(0, iLJIIIIZZ, 0, iLJII));
            float height = f + c1695170uDL.getHeight();
            int i5 = i3 + c1695170uDL.LIZLLL.LJII;
            arrayList.add(new C1692260u8e(c1695170uDL, c1692590u9B.LIZIZ, c1692590u9B.LIZJ, i3, i5, f, height));
            if (c1695170uDL.LIZLLL.LJ || (i5 == this.LIZIZ && i4 != C1697810uHb.LJIIJ(this.LIZ.LJ))) {
                i3 = i5;
                f = height;
                z = true;
                break;
            } else {
                i4++;
                i3 = i5;
                f = height;
            }
        }
        z = false;
        this.LJ = f;
        this.LJFF = i3;
        this.LIZJ = z;
        this.LJII = arrayList;
        this.LIZLLL = C1682380tsi.LJIIIIZZ(j);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i6 = 0; i6 < size2; i6++) {
            C1692260u8e c1692260u8e = (C1692260u8e) ListProtector.get(arrayList, i6);
            List<C1683130ttv> listLJJI = c1692260u8e.LIZ.LJJI();
            ArrayList arrayList4 = new ArrayList(listLJJI.size());
            int size3 = listLJJI.size();
            for (int i7 = 0; i7 < size3; i7++) {
                C1683130ttv c1683130ttv = (C1683130ttv) ListProtector.get(listLJJI, i7);
                if (c1683130ttv != null) {
                    c1683130ttvLIZ = c1692260u8e.LIZ(c1683130ttv);
                } else {
                    c1683130ttvLIZ = null;
                }
                arrayList4.add(c1683130ttvLIZ);
            }
            C19719612Di.LJJI(arrayList4, arrayList3);
        }
        int size4 = arrayList3.size();
        List<C1683130ttv> listLJLIL = arrayList3;
        if (size4 < this.LIZ.LIZIZ.size()) {
            int size5 = this.LIZ.LIZIZ.size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size5);
            for (int i8 = 0; i8 < size5; i8++) {
                arrayList5.add(null);
            }
            listLJLIL = C13LP.LJLIL(arrayList5, arrayList3);
        }
        this.LJI = listLJLIL;
    }

    public static void LJIIIZ(C1692200u8Y c1692200u8Y, InterfaceC1686290tz1 interfaceC1686290tz1, long j, C1693340uAO c1693340uAO, C1693510uAf c1693510uAf, AbstractC1695860uES abstractC1695860uES) {
        InterfaceC1675870tiD.LLILL.getClass();
        c1692200u8Y.LJIIIIZZ(interfaceC1686290tz1, j, c1693340uAO, c1693510uAf, abstractC1695860uES, C1668240tVu.LIZIZ);
    }

    public final void LJIIIIZZ(InterfaceC1686290tz1 interfaceC1686290tz1, long j, C1693340uAO c1693340uAO, C1693510uAf c1693510uAf, AbstractC1695860uES abstractC1695860uES, int i) {
        interfaceC1686290tz1.save();
        List<C1692260u8e> list = this.LJII;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1692260u8e c1692260u8e = (C1692260u8e) ListProtector.get(list, i2);
            c1692260u8e.LIZ.LJI(interfaceC1686290tz1, j, c1693340uAO, c1693510uAf, abstractC1695860uES, i);
            interfaceC1686290tz1.LJIILJJIL(0.0f, c1692260u8e.LIZ.getHeight());
        }
        interfaceC1686290tz1.LJIIJ();
    }

    public static void LJIIJJI(C1692200u8Y c1692200u8Y, InterfaceC1686290tz1 interfaceC1686290tz1, AbstractC1668700tWe abstractC1668700tWe, float f, C1693340uAO c1693340uAO, C1693510uAf c1693510uAf, AbstractC1695860uES abstractC1695860uES) {
        InterfaceC1675870tiD.LLILL.getClass();
        c1692200u8Y.LJIIJ(interfaceC1686290tz1, abstractC1668700tWe, f, c1693340uAO, c1693510uAf, abstractC1695860uES, C1668240tVu.LIZIZ);
    }

    public final void LJIIJ(InterfaceC1686290tz1 interfaceC1686290tz1, AbstractC1668700tWe abstractC1668700tWe, float f, C1693340uAO c1693340uAO, C1693510uAf c1693510uAf, AbstractC1695860uES abstractC1695860uES, int i) {
        InterfaceC1686290tz1 interfaceC1686290tz12 = interfaceC1686290tz1;
        interfaceC1686290tz12.save();
        int i2 = i;
        AbstractC1695860uES abstractC1695860uES2 = abstractC1695860uES;
        C1693510uAf c1693510uAf2 = c1693510uAf;
        C1693340uAO c1693340uAO2 = c1693340uAO;
        float f2 = f;
        if (((ArrayList) this.LJII).size() <= 1 || (abstractC1668700tWe instanceof C1680950tqP)) {
            C1692310u8j.LIZ(this, interfaceC1686290tz12, abstractC1668700tWe, f2, c1693340uAO2, c1693510uAf2, abstractC1695860uES2, i2);
        } else if (abstractC1668700tWe instanceof AbstractC1682800ttO) {
            ArrayList arrayList = (ArrayList) this.LJII;
            int size = arrayList.size();
            float fMax = 0.0f;
            float height = 0.0f;
            for (int i3 = 0; i3 < size; i3++) {
                C1692260u8e c1692260u8e = (C1692260u8e) ListProtector.get(arrayList, i3);
                height += c1692260u8e.LIZ.getHeight();
                fMax = Math.max(fMax, c1692260u8e.LIZ.getWidth());
            }
            Shader shaderLIZIZ = ((AbstractC1682800ttO) abstractC1668700tWe).LIZIZ((((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(height)) & 4294967295L));
            Matrix matrix = new Matrix();
            shaderLIZIZ.getLocalMatrix(matrix);
            ArrayList arrayList2 = (ArrayList) this.LJII;
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                C1692260u8e c1692260u8e2 = (C1692260u8e) ListProtector.get(arrayList2, i4);
                interfaceC1686290tz12 = interfaceC1686290tz12;
                f2 = f2;
                c1693340uAO2 = c1693340uAO2;
                c1693510uAf2 = c1693510uAf2;
                abstractC1695860uES2 = abstractC1695860uES2;
                i2 = i2;
                c1692260u8e2.LIZ.LJII(interfaceC1686290tz12, new C1692640u9G(shaderLIZIZ), f2, c1693340uAO2, c1693510uAf2, abstractC1695860uES2, i2);
                interfaceC1686290tz12.LJIILJJIL(0.0f, c1692260u8e2.LIZ.getHeight());
                matrix.setTranslate(0.0f, -c1692260u8e2.LIZ.getHeight());
                shaderLIZIZ.setLocalMatrix(matrix);
            }
        }
        interfaceC1686290tz12.LJIIJ();
    }
}
