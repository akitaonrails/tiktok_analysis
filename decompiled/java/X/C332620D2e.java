package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS604S0100000_25;
import njp.a;

/* JADX INFO: renamed from: X.0D2e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.slideslip.BaseCarouselBottomFuncComponent$extractColorAndUpdate$1$1", f = "BaseCarouselBottomFuncComponent.kt", l = {}, m = "invokeSuspend")
public final class C332620D2e extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AbstractC1628090sT9 LL;
    public final /* synthetic */ Integer LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C332620D2e(AbstractC1628090sT9 abstractC1628090sT9, Integer num, InterfaceC1364105Vn<? super C332620D2e> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = abstractC1628090sT9;
        this.LLILLJJLI = num;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C332620D2e(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseCarouselBottomFuncComponent@84.extractColorAndUpdate$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.i3(new AwS604S0100000_25(this.LLILLJJLI, 435));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseCarouselBottomFuncComponent@84.extractColorAndUpdate$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
