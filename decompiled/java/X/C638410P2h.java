package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0P2h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C638410P2h extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ Function0<Boolean> LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C638410P2h(int i, boolean z, Function0 function0) {
        super(2);
        this.LL = z;
        this.LLILLJJLI = function0;
        this.LLILLL = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1671390taz.LIZ(this.LL, this.LLILLJJLI, interfaceC1680500tpg, C341440Da2.LIZ(this.LLILLL | 1));
        return Unit.LIZ;
    }
}
