package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0tuI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1683360tuI extends C09AY implements InterfaceC1631630sYr<InterfaceC1669590tY5, Integer, InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ List LL;
    public final /* synthetic */ Function1 LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Function0 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1683360tuI(List list, Function1 function1, String str, Function0 function0) {
        super(4);
        this.LL = list;
        this.LLILLJJLI = function1;
        this.LLILLL = str;
        this.LLILZ = function0;
    }

    @Override // X.InterfaceC1631630sYr
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC1669590tY5 interfaceC1669590tY5, Integer num, InterfaceC1680500tpg interfaceC1680500tpg, Integer num2) {
        int i;
        boolean z;
        int i2;
        int i3;
        InterfaceC1669590tY5 interfaceC1669590tY52 = interfaceC1669590tY5;
        int iIntValue = num.intValue();
        InterfaceC1680500tpg interfaceC1680500tpg2 = interfaceC1680500tpg;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 6) == 0) {
            if (interfaceC1680500tpg2.LJJIIJ(interfaceC1669590tY52)) {
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
            int i4 = i & 14;
            C1683450tuR c1683450tuR = (C1683450tuR) ListProtector.get(this.LL, iIntValue);
            interfaceC1680500tpg2.LJJIIJZLJL(1433303228);
            C1683340tuG.LJIIIZ(interfaceC1669590tY52, c1683450tuR, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1680500tpg2, (i4 & 14) | (i4 & 112));
            interfaceC1680500tpg2.LJ();
        } else {
            interfaceC1680500tpg2.LIZJ();
        }
        return Unit.LIZ;
    }
}
