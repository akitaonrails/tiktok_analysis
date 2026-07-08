package X;

import androidx.compose.foundation.layout.c;
import java.util.HashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.Intrinsics;
import p2.g;

/* JADX INFO: renamed from: X.0tZv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1670730tZv extends C09AY implements InterfaceC1631620sYq<InterfaceC1668850tWt, InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ List<C1670750tZx> LLILLJJLI;
    public final /* synthetic */ HashSet<Long> LLILLL;
    public final /* synthetic */ Function1<Long, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1670730tZv(List list, boolean z, HashSet hashSet, Function1 function1) {
        super(3);
        this.LL = z;
        this.LLILLJJLI = list;
        this.LLILLL = hashSet;
        this.LLILZ = function1;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(InterfaceC1668850tWt interfaceC1668850tWt, InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        float fLJI;
        int i;
        InterfaceC1668850tWt interfaceC1668850tWt2 = interfaceC1668850tWt;
        InterfaceC1680500tpg interfaceC1680500tpg2 = interfaceC1680500tpg;
        int iIntValue = num.intValue();
        if ((iIntValue & 6) == 0) {
            if (interfaceC1680500tpg2.LJJIIJ(interfaceC1668850tWt2)) {
                i = 4;
            } else {
                i = 2;
            }
            iIntValue |= i;
        }
        if ((iIntValue & 19) == 18 && interfaceC1680500tpg2.LIZ()) {
            interfaceC1680500tpg2.LIZJ();
        } else {
            float f = C1670720tZu.LIZ;
            if (this.LL) {
                fLJI = (interfaceC1668850tWt2.LJI() - ((this.LLILLJJLI.size() - 1) * f)) / this.LLILLJJLI.size();
            } else {
                fLJI = C1670720tZu.LIZIZ;
            }
            InterfaceC1685750ty9 interfaceC1685750ty9LJ = c.LJ(InterfaceC1685750ty9.LIZ, 1.0f);
            C1666950tTp c1666950tTpLJI = C1679930tol.LJI(f);
            List<C1670750tZx> list = this.LLILLJJLI;
            HashSet<Long> hashSet = this.LLILLL;
            boolean z = this.LL;
            Function1<Long, Unit> function1 = this.LLILZ;
            InterfaceC1668050tVb.LIZ.getClass();
            C1688120u1y c1688120u1yLIZ = C1665750tRt.LIZ(c1666950tTpLJI, C1668040tVa.LJIIJ, interfaceC1680500tpg2, 6);
            int iLIZ = C0MXE.LIZ(interfaceC1680500tpg2);
            C13D2 c13d2LJJIFFI = interfaceC1680500tpg2.LJJIFFI();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(interfaceC1680500tpg2, interfaceC1685750ty9LJ);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (interfaceC1680500tpg2.LJIIJJI() instanceof InterfaceC20032213Zo) {
                interfaceC1680500tpg2.LJJIII();
                if (interfaceC1680500tpg2.LJJIIZ()) {
                    interfaceC1680500tpg2.LJJI(aFwS214S0000000_25);
                } else {
                    interfaceC1680500tpg2.LJIILJJIL();
                }
                C1665930tSB.LIZ(interfaceC1680500tpg2, c1688120u1yLIZ, g.a.LJI);
                C1665930tSB.LIZ(interfaceC1680500tpg2, c13d2LJJIFFI, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (interfaceC1680500tpg2.LJJIIZ() || !Intrinsics.LJFF(interfaceC1680500tpg2.LJJ(), Integer.valueOf(iLIZ))) {
                    interfaceC1680500tpg2.LJJIJIIJI(Integer.valueOf(iLIZ));
                    interfaceC1680500tpg2.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                C1665930tSB.LIZ(interfaceC1680500tpg2, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                interfaceC1680500tpg2.LJJIIJZLJL(104835579);
                for (C1670750tZx c1670750tZx : list) {
                    long j = c1670750tZx.LIZ;
                    C1670720tZu.LIZIZ(j, c1670750tZx.LIZIZ, c1670750tZx.LIZJ, hashSet.contains(Long.valueOf(j)), c1670750tZx.LIZLLL, z, fLJI, function1, interfaceC1680500tpg2, 12582912);
                }
                interfaceC1680500tpg2.LJ();
                interfaceC1680500tpg2.LJIIIZ();
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        return Unit.LIZ;
    }
}
