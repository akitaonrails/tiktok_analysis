package X;

import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0tml, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1678690tml extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ InterfaceC1685750ty9 LL;
    public final /* synthetic */ InterfaceC1680710tq1 LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ float LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ C1668470tWH LLILZLL;
    public final /* synthetic */ float LLIZ;
    public final /* synthetic */ Function2<InterfaceC1680500tpg, Integer, Unit> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1678690tml(InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680710tq1 interfaceC1680710tq1, long j, float f, int i, C1668470tWH c1668470tWH, float f2, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2) {
        super(2);
        this.LL = interfaceC1685750ty9;
        this.LLILLJJLI = interfaceC1680710tq1;
        this.LLILLL = j;
        this.LLILZ = f;
        this.LLILZIL = i;
        this.LLILZLL = c1668470tWH;
        this.LLIZ = f2;
        this.LLIZLLLIL = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        InterfaceC1680500tpg interfaceC1680500tpg2 = interfaceC1680500tpg;
        if ((num.intValue() & 11) == 2 && interfaceC1680500tpg2.LIZ()) {
            interfaceC1680500tpg2.LIZJ();
        } else {
            InterfaceC1685750ty9 interfaceC1685750ty9LIZ = C1689740u4a.LIZIZ(C1678670tmj.LIZJ(this.LL, this.LLILLJJLI, C1678670tmj.LIZLLL(this.LLILLL, (InterfaceC1678720tmo) interfaceC1680500tpg2.LJJIL(C1678700tmm.LIZ), this.LLILZ, interfaceC1680500tpg2, (this.LLILZIL >> 6) & 14), this.LLILZLL, this.LLIZ), false, AFwS266S0000000_25.get$arr$(65)).LIZ(new SuspendPointerInputElement(Unit.LIZ, null, null, new C1639806bU(new C01W6(null)), 6));
            Function2<InterfaceC1680500tpg, Integer, Unit> function2 = this.LLIZLLLIL;
            int i = this.LLILZIL;
            interfaceC1680500tpg2.LJJIJIIJIL(733328855);
            InterfaceC1668050tVb.LIZ.getClass();
            C1674920tgg c1674920tggLJ = k.LJ(C1668040tVa.LIZIZ, true, interfaceC1680500tpg2, 48);
            interfaceC1680500tpg2.LJJIJIIJIL(-1323940314);
            int iLIZ = C0MXE.LIZ(interfaceC1680500tpg2);
            C13D2 c13d2LJJIFFI = interfaceC1680500tpg2.LJJIFFI();
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            C19719212De c19719212DeLIZIZ = C1672420tce.LIZIZ(interfaceC1685750ty9LIZ);
            if (interfaceC1680500tpg2.LJIIJJI() instanceof InterfaceC20032213Zo) {
                interfaceC1680500tpg2.LJJIII();
                if (interfaceC1680500tpg2.LJJIIZ()) {
                    interfaceC1680500tpg2.LJJI(aFwS214S0000000_25);
                } else {
                    interfaceC1680500tpg2.LJIILJJIL();
                }
                C1665930tSB.LIZ(interfaceC1680500tpg2, c1674920tggLJ, g.a.LJI);
                C1665930tSB.LIZ(interfaceC1680500tpg2, c13d2LJJIFFI, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (interfaceC1680500tpg2.LJJIIZ() || !Intrinsics.LJFF(interfaceC1680500tpg2.LJJ(), Integer.valueOf(iLIZ))) {
                    interfaceC1680500tpg2.LJJIJIIJI(Integer.valueOf(iLIZ));
                    interfaceC1680500tpg2.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                c19719212DeLIZIZ.invoke(new C1156530gCZ(interfaceC1680500tpg2), interfaceC1680500tpg2, 0);
                interfaceC1680500tpg2.LJJIJIIJIL(2058660585);
                function2.invoke(interfaceC1680500tpg2, Integer.valueOf((i >> 18) & 14));
                interfaceC1680500tpg2.LJJIJLIJ();
                interfaceC1680500tpg2.LJIIIZ();
                interfaceC1680500tpg2.LJJIJLIJ();
                interfaceC1680500tpg2.LJJIJLIJ();
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        return Unit.LIZ;
    }
}
