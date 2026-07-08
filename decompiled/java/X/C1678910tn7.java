package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0tn7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1678910tn7 extends C09AY implements InterfaceC1631620sYq<InterfaceC1685750ty9, InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ float LL;
    public final /* synthetic */ InterfaceC1679000tnG LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ Function2<InterfaceC1680500tpg, Integer, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1678910tn7(float f, InterfaceC1679000tnG interfaceC1679000tnG, boolean z, int i, int i2, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2) {
        super(3);
        this.LL = f;
        this.LLILLJJLI = interfaceC1679000tnG;
        this.LLILLL = z;
        this.LLILZ = i;
        this.LLILZIL = function2;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        int i;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        InterfaceC1680500tpg interfaceC1680500tpg2 = interfaceC1680500tpg;
        int iIntValue = num.intValue();
        if ((iIntValue & 14) == 0) {
            if (interfaceC1680500tpg2.LJJIIJ(interfaceC1685750ty92)) {
                i = 4;
            } else {
                i = 2;
            }
            iIntValue |= i;
        }
        if ((iIntValue & 91) == 18 && interfaceC1680500tpg2.LIZ()) {
            interfaceC1680500tpg2.LIZJ();
        } else {
            InterfaceC1685750ty9 interfaceC1685750ty9LIZ = C1665900tS8.LIZ(interfaceC1685750ty92, this.LL);
            InterfaceC1679000tnG interfaceC1679000tnG = this.LLILLJJLI;
            boolean z = this.LLILLL;
            int i2 = this.LLILZ;
            Function2<InterfaceC1680500tpg, Integer, Unit> function2 = this.LLILZIL;
            interfaceC1680500tpg2.LJJIJIIJIL(733328855);
            InterfaceC1668050tVb.LIZ.getClass();
            C1674920tgg c1674920tggLJ = k.LJ(C1668040tVa.LIZIZ, false, interfaceC1680500tpg2, 0);
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
                C1678940tnA.LIZIZ(((C1685910tyP) interfaceC1679000tnG.LIZLLL(z, interfaceC1680500tpg2).getValue()).LIZ, C1680090tp1.LIZJ(interfaceC1680500tpg2).LJI, null, function2, interfaceC1680500tpg2, (i2 >> 6) & 7168, 4);
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
