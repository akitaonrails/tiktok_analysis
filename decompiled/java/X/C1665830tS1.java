package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0tS1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1665830tS1 extends C09AY implements InterfaceC1631630sYr<InterfaceC1669590tY5, Integer, InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ List LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ float LLILLL;
    public final /* synthetic */ float LLILZ;
    public final /* synthetic */ InterfaceC1685750ty9 LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1665830tS1(List list, int i, float f, float f2, InterfaceC1685750ty9 interfaceC1685750ty9) {
        super(4);
        this.LL = list;
        this.LLILLJJLI = i;
        this.LLILLL = f;
        this.LLILZ = f2;
        this.LLILZIL = interfaceC1685750ty9;
    }

    @Override // X.InterfaceC1631630sYr
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC1669590tY5 interfaceC1669590tY5, Integer num, InterfaceC1680500tpg interfaceC1680500tpg, Integer num2) {
        int i;
        boolean z;
        float f;
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
            int i4 = (i & 112) | (i & 14);
            InterfaceC1627880sSo interfaceC1627880sSo = (InterfaceC1627880sSo) ListProtector.get(this.LL, iIntValue);
            interfaceC1680500tpg2.LJJIIJZLJL(745493478);
            if (iIntValue == this.LLILLJJLI) {
                f = this.LLILLL;
            } else {
                f = this.LLILZ;
            }
            C1666200tSc.LIZIZ(interfaceC1627880sSo, this.LLILZIL, f, interfaceC1680500tpg2, (i4 >> 6) & 14);
            interfaceC1680500tpg2.LJ();
        } else {
            interfaceC1680500tpg2.LIZJ();
        }
        return Unit.LIZ;
    }
}
