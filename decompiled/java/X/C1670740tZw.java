package X;

import androidx.compose.foundation.layout.c;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.HashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0tZw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1670740tZw extends C09AY implements InterfaceC1631630sYr<InterfaceC1669590tY5, Integer, InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ List LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ HashSet LLILLL;
    public final /* synthetic */ Function1 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1670740tZw(List list, boolean z, HashSet hashSet, Function1 function1) {
        super(4);
        this.LL = list;
        this.LLILLJJLI = z;
        this.LLILLL = hashSet;
        this.LLILZ = function1;
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
        if ((i & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (interfaceC1680500tpg2.LJIJJLI(i & 1, z)) {
            List list = (List) ListProtector.get(this.LL, iIntValue);
            interfaceC1680500tpg2.LJJIIJZLJL(1502920171);
            C1668160tVm.LIZ(c.LJ(InterfaceC1685750ty9.LIZ, 1.0f), null, false, C13Z4.LIZJ(-605879987, new C1670730tZv(list, this.LLILLJJLI, this.LLILLL, this.LLILZ), interfaceC1680500tpg2), interfaceC1680500tpg2, 3078, 6);
            interfaceC1680500tpg2.LJ();
        } else {
            interfaceC1680500tpg2.LIZJ();
        }
        return Unit.LIZ;
    }
}
