package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tnD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1678970tnD extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ C1693430uAX LLILLJJLI;
    public final /* synthetic */ Float LLILLL;
    public final /* synthetic */ Function2<InterfaceC1680500tpg, Integer, Unit> LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1678970tnD(long j, C1693430uAX c1693430uAX, Float f, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2, int i, int i2) {
        super(2);
        this.LL = j;
        this.LLILLJJLI = c1693430uAX;
        this.LLILLL = f;
        this.LLILZ = function2;
        this.LLILZIL = i;
        this.LLILZLL = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1678940tnA.LIZIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1680500tpg, C341440Da2.LIZ(this.LLILZIL | 1), this.LLILZLL);
        return Unit.LIZ;
    }
}
