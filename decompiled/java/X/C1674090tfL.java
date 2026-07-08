package X;

import android.text.SpannableStringBuilder;
import androidx.compose.foundation.layout.c;
import com.ss.android.ugc.aweme.components.purchasebutton.PurchaseButtonParams;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS181S0101000_25;
import kotlin.jvm.internal.AwS390S0200000_24;
import kotlin.jvm.internal.AwS391S0200000_25;
import kotlin.jvm.internal.AwS425S0200000_24;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import p2.g;

/* JADX INFO: renamed from: X.0tfL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1674090tfL {
    public static final void LIZ(C1674030tfF c1674030tfF, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        String str;
        String str2;
        String str3;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1311842557);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(c1674030tfF)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            PurchaseButtonParams purchaseButtonParams = c1674030tfF.LIZIZ.purchaseButtonComponent;
            C1615420s8i c1615420s8i = c1674030tfF.LIZJ;
            Function1<? super AbstractC1556970qcR, Unit> function1 = c1674030tfF.LIZLLL;
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = C20028913Yh.LJI(Boolean.FALSE);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            C05P0 c05p0 = (C05P0) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            Unit unit = Unit.LIZ;
            c13zcLJIIJ.LJJIIJZLJL(5004770);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (objLJJ2 == c1680520tpi) {
                objLJJ2 = new AwS597S0100000_18(c05p0, (C05P0<List<String>>) 993);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1680540tpk.LIZIZ(unit, (Function1) objLJJ2, c13zcLJIIJ);
            InterfaceC1668050tVb.LIZ.getClass();
            C1296860jqu c1296860jqu = C1668040tVa.LJIILJJIL;
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            float f = 16;
            InterfaceC1685750ty9 interfaceC1685750ty9LJIIJ = C1682520tsw.LJIIJ(c1685760tyA, f, 0.0f, 2);
            C1688130u1z c1688130u1zLIZ = C1665740tRs.LIZ(C1679930tol.LIZJ, c1296860jqu, c13zcLJIIJ, 48);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJIIJ);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                c13zcLJIIJ.LJJIII();
                if (c13zcLJIIJ.LJJJI) {
                    c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                } else {
                    c13zcLJIIJ.LJIILJJIL();
                }
                C1665930tSB.LIZ(c13zcLJIIJ, c1688130u1zLIZ, g.a.LJI);
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                if (purchaseButtonParams != null) {
                    str = purchaseButtonParams.buttonText;
                } else {
                    str = null;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                c13zcLJIIJ.LJJIIJZLJL(-1633490746);
                boolean zLJII = c13zcLJIIJ.LJII(c1615420s8i) | c13zcLJIIJ.LJJIIJ(purchaseButtonParams);
                Object objLJJ3 = c13zcLJIIJ.LJJ();
                if (zLJII || objLJJ3 == c1680520tpi) {
                    objLJJ3 = new C1615800s9K(c1615420s8i, purchaseButtonParams, null);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ3);
                }
                c13zcLJIIJ.LJJJJL(false);
                C05P0 c05p0LJII = C20028913Yh.LJII(spannableStringBuilder, (Function2) objLJJ3, c13zcLJIIJ);
                c13zcLJIIJ.LJJIIJZLJL(-1795759286);
                if (purchaseButtonParams != null && (str3 = purchaseButtonParams.aboveButtonText) != null && (!a0.LJJJIL(C1692990u9p.LIZ(C19298910ep.LIZ(str3, 0)))) && 1 != 0) {
                    InterfaceC1685750ty9 interfaceC1685750ty9LJIIL = C1682520tsw.LJIIL(c1685760tyA, 0.0f, 8, 0.0f, 0.0f, 13);
                    c13zcLJIIJ.LJJIIJZLJL(-1633490746);
                    boolean zLJJIIJ = c13zcLJIIJ.LJJIIJ(function1) | c13zcLJIIJ.LJJIIJ(purchaseButtonParams);
                    Object objLJJ4 = c13zcLJIIJ.LJJ();
                    if (zLJJIIJ || objLJJ4 == c1680520tpi) {
                        objLJJ4 = new AwS425S0200000_24((Function1) function1, (Function1<? super AbstractC1556970qcR, Unit>) purchaseButtonParams, (PurchaseButtonParams) 92);
                        c13zcLJIIJ.LJJIJIIJI(objLJJ4);
                    }
                    c13zcLJIIJ.LJJJJL(false);
                    C1685190txF.LIZIZ(C1692990u9p.LIZ(C19298910ep.LIZ(purchaseButtonParams.aboveButtonText, 0)), C634380OuS.LIZJ(interfaceC1685750ty9LJIIL, false, null, (Function0) objLJJ4, 7), C1670400tZO.LIZIZ(c13zcLJIIJ).M3(), C1670400tZO.LJ(c13zcLJIIJ).LJIJJ, 0L, 0, 0, false, 0, null, null, c13zcLJIIJ, 0, 0, 2032);
                    C1665790tRx.LIZ(c.LJI(c1685760tyA, f), c13zcLJIIJ);
                }
                c13zcLJIIJ.LJJJJL(false);
                c13zcLJIIJ.LJJIIJZLJL(-1633490746);
                boolean zLJJIIJ2 = c13zcLJIIJ.LJJIIJ(function1);
                Object objLJJ5 = c13zcLJIIJ.LJJ();
                if (zLJJIIJ2 || objLJJ5 == c1680520tpi) {
                    objLJJ5 = new AwS390S0200000_24(c05p0, (C05P0<Boolean>) function1, (Function1<? super AbstractC1556970qcR, Unit>) 109);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ5);
                }
                Function1 function12 = (Function1) objLJJ5;
                c13zcLJIIJ.LJJJJL(false);
                InterfaceC1685750ty9 interfaceC1685750ty9LJ = c.LJ(c1685760tyA, 1.0f);
                c13zcLJIIJ.LJJIIJZLJL(-1633490746);
                boolean zLJJIIJ3 = c13zcLJIIJ.LJJIIJ(c05p0LJII);
                Object objLJJ6 = c13zcLJIIJ.LJJ();
                if (zLJJIIJ3 || objLJJ6 == c1680520tpi) {
                    objLJJ6 = new AwS391S0200000_25(c05p0LJII, (C05P0<C1680470tpd>) c05p0, (C05P0<C1680470tpd>) 364);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ6);
                }
                c13zcLJIIJ.LJJJJL(false);
                C20084413iE.LIZ(48, 0, c13zcLJIIJ, interfaceC1685750ty9LJ, function12, (Function1) objLJJ6);
                c13zcLJIIJ.LJJIIJZLJL(-1795715554);
                if (purchaseButtonParams != null && (str2 = purchaseButtonParams.belowButtonText) != null && (!a0.LJJJIL(C1692990u9p.LIZ(C19298910ep.LIZ(str2, 0))))) {
                    C1665790tRx.LIZ(c.LJI(c1685760tyA, 8), c13zcLJIIJ);
                    C1685190txF.LIZIZ(C1692990u9p.LIZ(C19298910ep.LIZ(purchaseButtonParams.belowButtonText, 0)), null, 0L, C1670400tZO.LJ(c13zcLJIIJ).LJIJJ, 0L, 0, 0, false, 0, null, null, c13zcLJIIJ, 0, 0, 2038);
                }
                c13zcLJIIJ.LJJJJL(false);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS181S0101000_25(c1674030tfF, i, 91);
        }
    }
}
