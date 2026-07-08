package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tO3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1663370tO3 extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ InterfaceC1665500tRU<C1661930tLj<InterfaceC1660190tIv, InterfaceC1461640o8g<? extends InterfaceC1660190tIv>>> LL;
    public final /* synthetic */ InterfaceC1665500tRU<C1661930tLj<InterfaceC1660190tIv, InterfaceC1461640o8g<? extends InterfaceC1660190tIv>>> LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ Function2<InterfaceC1660190tIv, InterfaceC1660090tIl, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1663370tO3(InterfaceC1665500tRU<C1661930tLj<InterfaceC1660190tIv, InterfaceC1461640o8g<? extends InterfaceC1660190tIv>>> interfaceC1665500tRU, InterfaceC1665500tRU<C1661930tLj<InterfaceC1660190tIv, InterfaceC1461640o8g<? extends InterfaceC1660190tIv>>> interfaceC1665500tRU2, boolean z, boolean z2, Function2<? super InterfaceC1660190tIv, ? super InterfaceC1660090tIl, Unit> function2) {
        super(2);
        this.LL = interfaceC1665500tRU;
        this.LLILLJJLI = interfaceC1665500tRU2;
        this.LLILLL = z;
        this.LLILZ = z2;
        this.LLILZIL = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        InterfaceC1680500tpg interfaceC1680500tpg2 = interfaceC1680500tpg;
        if ((num.intValue() & 3) == 2 && interfaceC1680500tpg2.LIZ()) {
            interfaceC1680500tpg2.LIZJ();
        } else {
            List listLJLIL = C13LP.LJLIL(this.LLILLJJLI, this.LL);
            boolean z = this.LLILLL;
            boolean z2 = this.LLILZ;
            Function2<InterfaceC1660190tIv, InterfaceC1660090tIl, Unit> function2 = this.LLILZIL;
            int i = 0;
            for (Object obj : (ArrayList) listLJLIL) {
                int i2 = i + 1;
                if (i >= 0) {
                    C1661930tLj c1661930tLj = (C1661930tLj) obj;
                    interfaceC1680500tpg2.LJIIL(-1687841583, interfaceC1680500tpg2.LJJIIZI(Integer.valueOf(i), c1661930tLj.LIZJ));
                    C1666810tTb.LJFF(z, c1661930tLj, z2, function2, interfaceC1680500tpg2, 0);
                    interfaceC1680500tpg2.LJJIJL();
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        return Unit.LIZ;
    }
}
