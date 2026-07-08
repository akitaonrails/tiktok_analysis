package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0art, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C951510art extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ C941230abJ LL;
    public final /* synthetic */ Function2<C941240abK, Integer, Unit> LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C951510art(C941230abJ c941230abJ, Function2<? super C941240abK, ? super Integer, Unit> function2, int i) {
        super(2);
        this.LL = c941230abJ;
        this.LLILLJJLI = function2;
        this.LLILLL = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1669910tYb.LIZ(this.LL, this.LLILLJJLI, interfaceC1680500tpg, C341440Da2.LIZ(this.LLILLL | 1));
        return Unit.LIZ;
    }
}
