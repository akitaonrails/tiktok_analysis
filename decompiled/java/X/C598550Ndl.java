package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ndl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.sea.billboard.widget.SeaLiveBillboardBroadcastBaseWidget$onSlotCreated$1$1", f = "SeaLiveBillboardBroadcastBaseWidget.kt", l = {}, m = "invokeSuspend")
public final class C598550Ndl extends C09AX implements Function2<InterfaceC598890NeJ, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AbstractC1732350vBJ LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C598550Ndl(AbstractC1732350vBJ abstractC1732350vBJ, InterfaceC1364105Vn<? super C598550Ndl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = abstractC1732350vBJ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C598550Ndl(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeaLiveBillboardBroadcastBaseWidget@110.onSlotCreated$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LLILLIZIL(false);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SeaLiveBillboardBroadcastBaseWidget@110.onSlotCreated$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC598890NeJ interfaceC598890NeJ, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC598890NeJ, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
