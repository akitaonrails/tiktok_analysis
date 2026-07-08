package X;

import androidx.compose.foundation.layout.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0tgR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1674770tgR extends C09AY implements InterfaceC1631620sYq<Function2<? super InterfaceC1680500tpg, ? super Integer, ? extends Unit>, InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ C1686970u07 LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1674770tgR(C1686970u07 c1686970u07, String str) {
        super(3);
        this.LL = c1686970u07;
        this.LLILLJJLI = str;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(Function2<? super InterfaceC1680500tpg, ? super Integer, ? extends Unit> function2, InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        int i;
        Function2<? super InterfaceC1680500tpg, ? super Integer, ? extends Unit> function22 = function2;
        InterfaceC1680500tpg interfaceC1680500tpg2 = interfaceC1680500tpg;
        int iIntValue = num.intValue();
        if ((iIntValue & 6) == 0) {
            if (interfaceC1680500tpg2.LJII(function22)) {
                i = 4;
            } else {
                i = 2;
            }
            iIntValue |= i;
        }
        if ((iIntValue & 19) == 18 && interfaceC1680500tpg2.LIZ()) {
            interfaceC1680500tpg2.LIZJ();
        } else {
            InterfaceC1685750ty9 interfaceC1685750ty9LJIJI = c.LJIJI(c.LJIIIIZZ(c.LJ(InterfaceC1685750ty9.LIZ, 1.0f), 21, 0.0f, 2), null, 3);
            InterfaceC1668050tVb.LIZ.getClass();
            C1296870jqv c1296870jqv = C1668040tVa.LJ;
            C1686970u07 c1686970u07 = this.LL;
            String str = this.LLILLJJLI;
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(c1296870jqv, false);
            int iLIZ = C0MXE.LIZ(interfaceC1680500tpg2);
            C13D2 c13d2LJJIFFI = interfaceC1680500tpg2.LJJIFFI();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(interfaceC1680500tpg2, interfaceC1685750ty9LJIJI);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (interfaceC1680500tpg2.LJIIJJI() instanceof InterfaceC20032213Zo) {
                interfaceC1680500tpg2.LJJIII();
                if (interfaceC1680500tpg2.LJJIIZ()) {
                    interfaceC1680500tpg2.LJJI(aFwS214S0000000_25);
                } else {
                    interfaceC1680500tpg2.LJIILJJIL();
                }
                C1665930tSB.LIZ(interfaceC1680500tpg2, interfaceC20053113dBLIZLLL, g.a.LJI);
                C1665930tSB.LIZ(interfaceC1680500tpg2, c13d2LJJIFFI, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (interfaceC1680500tpg2.LJJIIZ() || !Intrinsics.LJFF(interfaceC1680500tpg2.LJJ(), Integer.valueOf(iLIZ))) {
                    interfaceC1680500tpg2.LJJIJIIJI(Integer.valueOf(iLIZ));
                    interfaceC1680500tpg2.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                C1665930tSB.LIZ(interfaceC1680500tpg2, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                interfaceC1680500tpg2.LJJIIJZLJL(-1582335793);
                if (c1686970u07.LIZ.LLILLJJLI.length() == 0) {
                    C1685190txF.LIZ(str, null, C1670400tZO.LIZIZ(interfaceC1680500tpg2).D2(), C1670400tZO.LJ(interfaceC1680500tpg2).LJJIIJZLJL, 0L, 0, 0, false, 0, null, null, interfaceC1680500tpg2, 0, 0, 2034);
                }
                interfaceC1680500tpg2.LJ();
                function22.invoke(interfaceC1680500tpg2, Integer.valueOf(iIntValue & 14));
                interfaceC1680500tpg2.LJIIIZ();
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        return Unit.LIZ;
    }
}
