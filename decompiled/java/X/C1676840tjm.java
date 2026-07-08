package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tjm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1676840tjm extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ InterfaceC1668050tVb LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ C1686720tzi LLILZ;
    public final /* synthetic */ Function2<InterfaceC1680500tpg, Integer, Unit> LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1676840tjm(InterfaceC1668050tVb interfaceC1668050tVb, long j, Function0<Unit> function0, C1686720tzi c1686720tzi, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2, int i, int i2) {
        super(2);
        this.LL = interfaceC1668050tVb;
        this.LLILLJJLI = j;
        this.LLILLL = function0;
        this.LLILZ = c1686720tzi;
        this.LLILZIL = function2;
        this.LLILZLL = i;
        this.LLIZ = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1680580tpo.LIZIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1680500tpg, C341440Da2.LIZ(this.LLILZLL | 1), this.LLIZ);
        return Unit.LIZ;
    }
}
