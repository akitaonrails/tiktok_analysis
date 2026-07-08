package X;

import androidx.compose.foundation.layout.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tYF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1669690tYF extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ float LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1669690tYF(float f) {
        super(2);
        this.LL = f;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        InterfaceC1680500tpg interfaceC1680500tpg2 = interfaceC1680500tpg;
        if ((num.intValue() & 3) == 2 && interfaceC1680500tpg2.LIZ()) {
            interfaceC1680500tpg2.LIZJ();
        } else {
            C1668930tX1.LIZIZ(C1669660tYC.LLLLLZL, null, c.LJIILIIL(InterfaceC1685750ty9.LIZ, this.LL), C1670400tZO.LIZIZ(interfaceC1680500tpg2).K3(), 0.0f, 0.0f, false, interfaceC1680500tpg2, 432, 112);
        }
        return Unit.LIZ;
    }
}
