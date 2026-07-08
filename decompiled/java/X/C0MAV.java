package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0MAV, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MAV extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ InterfaceC1685750ty9 LL;
    public final /* synthetic */ InterfaceC1665500tRU<T> LLILLJJLI;
    public final /* synthetic */ Function2<T, Integer, Object> LLILLL;
    public final /* synthetic */ InterfaceC1631630sYr<T, InterfaceC1685750ty9, InterfaceC1680500tpg, Integer, Unit> LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0MAV(InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1665500tRU<? extends T> interfaceC1665500tRU, Function2<? super T, ? super Integer, ? extends Object> function2, InterfaceC1631630sYr<? super T, ? super InterfaceC1685750ty9, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631630sYr, int i) {
        super(2);
        this.LL = interfaceC1685750ty9;
        this.LLILLJJLI = interfaceC1665500tRU;
        this.LLILLL = function2;
        this.LLILZ = interfaceC1631630sYr;
        this.LLILZIL = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1666410tSx.LIZIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1680500tpg, C341440Da2.LIZ(this.LLILZIL | 1));
        return Unit.LIZ;
    }
}
