package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06T5, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.component.nativeproducttilescomponent.AnoleNativeProductTilesComponent$preloadImage$1$2", f = "AnoleNativeProductTilesComponent.kt", l = {}, m = "invokeSuspend")
public final class C06T5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1021680ch4 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06T5(C1021680ch4 c1021680ch4, InterfaceC1364105Vn<? super C06T5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1021680ch4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06T5(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AnoleNativeProductTilesComponent@3712.preloadImage$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJIJJLI();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AnoleNativeProductTilesComponent@3712.preloadImage$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
