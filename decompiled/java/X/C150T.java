package X;

import com.ss.android.ugc.aweme.ecommercelive.audience.common.preload.NativePreloadController;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.150T, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.common.preload.NativePreloadController$destroyPreloadController$1", f = "ShopListPreloadManager.kt", l = {}, m = "invokeSuspend")
public final class C150T extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ NativePreloadController LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C150T(NativePreloadController nativePreloadController, InterfaceC1364105Vn<? super C150T> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = nativePreloadController;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C150T(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NativePreloadController@2d31.destroyPreloadController$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C150V c150vLIZ = C150V.LIZIZ.LIZ();
        c150vLIZ.LIZ.remove(this.LL.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NativePreloadController@2d31.destroyPreloadController$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
