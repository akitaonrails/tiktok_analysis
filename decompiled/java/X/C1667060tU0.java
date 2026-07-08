package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.Intrinsics;
import p2.g;

/* JADX INFO: renamed from: X.0tU0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1667060tU0 extends C09AY implements InterfaceC1631620sYq<InterfaceC1669590tY5, InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ C05P0<Integer> LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1667060tU0(C05P0<Integer> c05p0, String str, String str2) {
        super(3);
        this.LL = c05p0;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(InterfaceC1669590tY5 interfaceC1669590tY5, InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        InterfaceC1680500tpg interfaceC1680500tpg2 = interfaceC1680500tpg;
        if ((num.intValue() & 17) == 16 && interfaceC1680500tpg2.LIZ()) {
            interfaceC1680500tpg2.LIZJ();
        } else {
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            interfaceC1680500tpg2.LJJIIJZLJL(5004770);
            C05P0<Integer> c05p0 = this.LL;
            Object objLJJ = interfaceC1680500tpg2.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            if (objLJJ == C1680510tph.LIZIZ) {
                objLJJ = new AwS581S0100000_2((C05P0) c05p0, (C05P0<InterfaceC1692950u9l>) 256);
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ);
            }
            interfaceC1680500tpg2.LJ();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZ = C1685330txT.LIZ(c1685760tyA, (Function1) objLJJ);
            String str = this.LLILLJJLI;
            String str2 = this.LLILLL;
            C1680030tov c1680030tov = C1679930tol.LIZJ;
            InterfaceC1668050tVb.LIZ.getClass();
            C1688130u1z c1688130u1zLIZ = C1665740tRs.LIZ(c1680030tov, C1668040tVa.LJIILIIL, interfaceC1680500tpg2, 0);
            int iLIZ = C0MXE.LIZ(interfaceC1680500tpg2);
            C13D2 c13d2LJJIFFI = interfaceC1680500tpg2.LJJIFFI();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(interfaceC1680500tpg2, interfaceC1685750ty9LIZ);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (interfaceC1680500tpg2.LJIIJJI() instanceof InterfaceC20032213Zo) {
                interfaceC1680500tpg2.LJJIII();
                if (interfaceC1680500tpg2.LJJIIZ()) {
                    interfaceC1680500tpg2.LJJI(aFwS214S0000000_25);
                } else {
                    interfaceC1680500tpg2.LJIILJJIL();
                }
                C1665930tSB.LIZ(interfaceC1680500tpg2, c1688130u1zLIZ, g.a.LJI);
                C1665930tSB.LIZ(interfaceC1680500tpg2, c13d2LJJIFFI, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (interfaceC1680500tpg2.LJJIIZ() || !Intrinsics.LJFF(interfaceC1680500tpg2.LJJ(), Integer.valueOf(iLIZ))) {
                    interfaceC1680500tpg2.LJJIJIIJI(Integer.valueOf(iLIZ));
                    interfaceC1680500tpg2.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                C1665930tSB.LIZ(interfaceC1680500tpg2, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                C1685190txF.LIZ(str, C1682520tsw.LJIIL(c1685760tyA, 0.0f, 0.0f, 0.0f, 8, 7), C1670400tZO.LIZIZ(interfaceC1680500tpg2).L3(), new C1693430uAX(0L, C1682430tsn.LJ(38), C1680190tpB.LLJ, null, null, 0L, null, 0, 0L, 16777209), 0L, 0, 0, false, 0, null, null, interfaceC1680500tpg2, 3120, 0, 2032);
                C1685190txF.LIZ(str2, C1682520tsw.LJIIL(c1685760tyA, 0.0f, 0.0f, 0.0f, 16, 7), C1670400tZO.LIZIZ(interfaceC1680500tpg2).M3(), C1670400tZO.LJ(interfaceC1680500tpg2).LJFF, 0L, 0, 0, false, 0, null, null, interfaceC1680500tpg2, 48, 0, 2032);
                interfaceC1680500tpg2.LJIIIZ();
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        return Unit.LIZ;
    }
}
