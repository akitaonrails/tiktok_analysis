package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NTr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.mixhome.diversion.bubble.view.EcMixMallCommonBubble$postForceRefreshBubblePosition$1", f = "EcMixMallCommonBubble.kt", l = {}, m = "invokeSuspend")
public final class C594570NTr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ViewTreeObserverOnScrollChangedListenerC21156017qg LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C594570NTr(ViewTreeObserverOnScrollChangedListenerC21156017qg viewTreeObserverOnScrollChangedListenerC21156017qg, boolean z, InterfaceC1364105Vn<? super C594570NTr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = viewTreeObserverOnScrollChangedListenerC21156017qg;
        this.LLILLJJLI = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C594570NTr(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcMixMallCommonBubble@4ae6.postForceRefreshBubblePosition$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJJ(true, this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcMixMallCommonBubble@4ae6.postForceRefreshBubblePosition$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
