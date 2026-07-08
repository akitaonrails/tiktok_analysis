package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0ttQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1682820ttQ extends C09AY implements InterfaceC1631630sYr<InterfaceC1691180u6u, Integer, InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ List LL;
    public final /* synthetic */ C1684960tws LLILLJJLI;
    public final /* synthetic */ C1677480tko LLILLL;
    public final /* synthetic */ Function1 LLILZ;
    public final /* synthetic */ C1693430uAX LLILZIL;
    public final /* synthetic */ C1693430uAX LLILZLL;
    public final /* synthetic */ Function0 LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1682820ttQ(List list, C1684960tws c1684960tws, C1677480tko c1677480tko, Function1 function1, C1693430uAX c1693430uAX, C1693430uAX c1693430uAX2, Function0 function0) {
        super(4);
        this.LL = list;
        this.LLILLJJLI = c1684960tws;
        this.LLILLL = c1677480tko;
        this.LLILZ = function1;
        this.LLILZIL = c1693430uAX;
        this.LLILZLL = c1693430uAX2;
        this.LLIZ = function0;
    }

    @Override // X.InterfaceC1631630sYr
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC1691180u6u interfaceC1691180u6u, Integer num, InterfaceC1680500tpg interfaceC1680500tpg, Integer num2) {
        int i;
        boolean z;
        InterfaceC1685750ty9 interfaceC1685750ty9;
        float fFloatValue;
        int i2;
        int i3;
        int iIntValue = num.intValue();
        InterfaceC1680500tpg interfaceC1680500tpg2 = interfaceC1680500tpg;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 6) == 0) {
            if (interfaceC1680500tpg2.LJJIIJ(interfaceC1691180u6u)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i = iIntValue2 | i3;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            if (interfaceC1680500tpg2.LJIJI(iIntValue)) {
                i2 = 32;
            } else {
                i2 = 16;
            }
            i |= i2;
        }
        if ((i & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (interfaceC1680500tpg2.LJIJJLI(i & 1, z)) {
            int i4 = (i & 112) | (i & 14);
            C1146350fw9 c1146350fw9 = (C1146350fw9) ListProtector.get(this.LL, iIntValue);
            interfaceC1680500tpg2.LJJIIJZLJL(-1700390757);
            int i5 = iIntValue % 4;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 != 3) {
                        interfaceC1685750ty9 = this.LLILLJJLI.LJIILIIL;
                    } else {
                        interfaceC1685750ty9 = this.LLILLJJLI.LJIIL;
                    }
                } else {
                    interfaceC1685750ty9 = this.LLILLJJLI.LJIIJJI;
                }
            } else {
                interfaceC1685750ty9 = this.LLILLJJLI.LJIIJ;
            }
            if (Intrinsics.LJFF(c1146350fw9.LLJJI, C1146470fwL.LIZ)) {
                fFloatValue = ((Number) this.LLILLL.LIZLLL()).floatValue();
            } else {
                fFloatValue = 1.0f;
            }
            InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = C1679660toK.LIZIZ(interfaceC1685750ty9, fFloatValue, fFloatValue, 0.0f, 0.0f, 0.0f, 0L, null, false, 0, 131068);
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LIZIZ, false);
            int iLIZ = C0MXE.LIZ(interfaceC1680500tpg2);
            C13D2 c13d2LJJIFFI = interfaceC1680500tpg2.LJJIFFI();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(interfaceC1680500tpg2, interfaceC1685750ty9LIZIZ);
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
                C1684920two.LIZJ(c1146350fw9, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLILLJJLI, interfaceC1680500tpg2, ((i4 >> 6) & 14) | 24576);
                interfaceC1680500tpg2.LJIIIZ();
                interfaceC1680500tpg2.LJ();
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        } else {
            interfaceC1680500tpg2.LIZJ();
        }
        return Unit.LIZ;
    }
}
