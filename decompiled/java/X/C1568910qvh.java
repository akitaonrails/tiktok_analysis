package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0qvh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.broadcaster.beforelive.slot.preview.widget.ECProductBeforeLiveWidget$onECJsBroadCastEvent$1$1", f = "ECProductBeforeLiveWidget.kt", l = {263}, m = "invokeSuspend")
public final class C1568910qvh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C180N LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1568910qvh(C180N c180n, String str, InterfaceC1364105Vn<? super C1568910qvh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c180n;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1568910qvh(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ECProductBeforeLiveWidget@6602.onECJsBroadCastEvent$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(1000L, this) == objLJFF) {
                C1C7U.LIZIZ("ECProductBeforeLiveWidget@6602.onECJsBroadCastEvent$1$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.LLILLJJLI.LJFF("GO_LIVE_CARD_ADD_PRODUCT", this.LLILLL, new InterfaceC1123790fLl() { // from class: X.0qvi
            @Override // X.InterfaceC1123790fLl
            public final void onDismiss() {
            }

            @Override // X.InterfaceC1123790fLl
            public final void onShow() {
            }
        });
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECProductBeforeLiveWidget@6602.onECJsBroadCastEvent$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
