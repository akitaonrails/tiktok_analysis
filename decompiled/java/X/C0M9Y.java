package X;

import androidx.compose.foundation.layout.c;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0M9Y, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M9Y extends C09AY implements InterfaceC1631620sYq<InterfaceC1669590tY5, InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ InterfaceC1631630sYr<Object, InterfaceC1685750ty9, InterfaceC1680500tpg, Integer, Unit> LL;
    public final /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ float LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0M9Y(InterfaceC1631630sYr<Object, ? super InterfaceC1685750ty9, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631630sYr, Object obj, float f) {
        super(3);
        this.LL = interfaceC1631630sYr;
        this.LLILLJJLI = obj;
        this.LLILLL = f;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(InterfaceC1669590tY5 interfaceC1669590tY5, InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        InterfaceC1680500tpg interfaceC1680500tpg2 = interfaceC1680500tpg;
        if ((num.intValue() & 17) == 16 && interfaceC1680500tpg2.LIZ()) {
            interfaceC1680500tpg2.LIZJ();
        } else {
            this.LL.invoke(this.LLILLJJLI, c.LJIILLIIL(InterfaceC1685750ty9.LIZ, this.LLILLL), interfaceC1680500tpg2, 0);
        }
        return Unit.LIZ;
    }
}
