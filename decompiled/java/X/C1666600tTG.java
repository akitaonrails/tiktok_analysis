package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0tTG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1666600tTG extends C09AY implements InterfaceC1631630sYr<InterfaceC1669590tY5, Integer, InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ List LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ Function1 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1666600tTG(List list, int i, Function1 function1) {
        super(4);
        this.LL = list;
        this.LLILLJJLI = i;
        this.LLILLL = function1;
    }

    @Override // X.InterfaceC1631630sYr
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC1669590tY5 interfaceC1669590tY5, Integer num, InterfaceC1680500tpg interfaceC1680500tpg, Integer num2) {
        int i;
        boolean z;
        int i2;
        int i3;
        int iIntValue = num.intValue();
        InterfaceC1680500tpg interfaceC1680500tpg2 = interfaceC1680500tpg;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 6) == 0) {
            if (interfaceC1680500tpg2.LJJIIJ(interfaceC1669590tY5)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i = i3 | iIntValue2;
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
        boolean z2 = false;
        if ((i & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (interfaceC1680500tpg2.LJIJJLI(i & 1, z)) {
            Object obj = ListProtector.get(this.LL, iIntValue);
            int i4 = i & 14;
            int iIntValue3 = ((Number) obj).intValue();
            interfaceC1680500tpg2.LJJIIJZLJL(414871284);
            if (this.LLILLJJLI == iIntValue3) {
                z2 = true;
            }
            C1666590tTF.LIZ(iIntValue3, (i4 >> 3) & 14, interfaceC1680500tpg2, this.LLILLL, z2);
            interfaceC1680500tpg2.LJ();
        } else {
            interfaceC1680500tpg2.LIZJ();
        }
        return Unit.LIZ;
    }
}
