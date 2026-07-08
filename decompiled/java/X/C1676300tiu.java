package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tiu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1676300tiu extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ InterfaceC1685750ty9 LL;
    public final /* synthetic */ float LLILLJJLI;
    public final /* synthetic */ C1668650tWZ LLILLL;
    public final /* synthetic */ C1668650tWZ LLILZ;
    public final /* synthetic */ Function2<InterfaceC1680500tpg, Integer, Unit> LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1676300tiu(InterfaceC1685750ty9 interfaceC1685750ty9, float f, C1668650tWZ c1668650tWZ, C1668650tWZ c1668650tWZ2, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2, int i, int i2) {
        super(2);
        this.LL = interfaceC1685750ty9;
        this.LLILLJJLI = f;
        this.LLILLL = c1668650tWZ;
        this.LLILZ = c1668650tWZ2;
        this.LLILZIL = function2;
        this.LLILZLL = i;
        this.LLIZ = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1676290tit.LIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1680500tpg, C341440Da2.LIZ(this.LLILZLL | 1), this.LLIZ);
        return Unit.LIZ;
    }
}
