package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.17r4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.mixhome.diversion.bubble.view.EcMixMallCommonBubble$onPageRenderCompleted$2", f = "EcMixMallCommonBubble.kt", l = {}, m = "invokeSuspend")
public final class C21158417r4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ViewTreeObserverOnScrollChangedListenerC21156017qg LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21158417r4(ViewTreeObserverOnScrollChangedListenerC21156017qg viewTreeObserverOnScrollChangedListenerC21156017qg, InterfaceC1364105Vn<? super C21158417r4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = viewTreeObserverOnScrollChangedListenerC21156017qg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21158417r4(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcMixMallCommonBubble@4ae6.onPageRenderCompleted$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.LLILZ.isAttachedToWindow()) {
            this.LL.LJIL(false);
        } else {
            C786410Ut5.g2(this.LL.LLJILJIL, 8);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcMixMallCommonBubble@4ae6.onPageRenderCompleted$2");
        return unit;
    }
}
