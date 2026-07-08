package X;

import androidx.compose.foundation.layout.c;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0MAH, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MAH extends C09AY implements InterfaceC1631620sYq<InterfaceC1691180u6u, InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ float LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MAH(float f) {
        super(3);
        this.LL = f;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(InterfaceC1691180u6u interfaceC1691180u6u, InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        InterfaceC1680500tpg interfaceC1680500tpg2 = interfaceC1680500tpg;
        if ((num.intValue() & 17) == 16 && interfaceC1680500tpg2.LIZ()) {
            interfaceC1680500tpg2.LIZJ();
        } else {
            C1665790tRx.LIZ(c.LJI(c.LJ(InterfaceC1685750ty9.LIZ, 1.0f), this.LL), interfaceC1680500tpg2);
        }
        return Unit.LIZ;
    }
}
