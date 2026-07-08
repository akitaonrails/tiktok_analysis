package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.model.UcpRecommendationItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0D0N, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.components.waterfall.WaterfallRecommendationLoader$load$resolveResult$1", f = "WaterfallRecommendationLoader.kt", l = {41}, m = "invokeSuspend")
public final class C0D0N extends C09AX implements Function2<UcpRecommendationItem, InterfaceC1364105Vn<? super C189200o6<? extends UcpRecommendationItem>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0D0E LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0D0N(C0D0E c0d0e, InterfaceC1364105Vn<? super C0D0N> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0d0e;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0D0N c0d0n = new C0D0N(this.LLILLL, interfaceC1364105Vn);
        c0d0n.LLILLJJLI = obj;
        return c0d0n;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZLLL;
        C1C7U.LIZ("WaterfallRecommendationLoader@fa8a.load$resolveResult$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                objLIZLLL = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            UcpRecommendationItem ucpRecommendationItem = (UcpRecommendationItem) this.LLILLJJLI;
            C0D0E c0d0e = this.LLILLL;
            this.LL = 1;
            objLIZLLL = c0d0e.LIZLLL(ucpRecommendationItem, this);
            if (objLIZLLL == objLJFF) {
                C1C7U.LIZIZ("WaterfallRecommendationLoader@fa8a.load$resolveResult$1");
                return objLJFF;
            }
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZLLL);
        C1C7U.LIZIZ("WaterfallRecommendationLoader@fa8a.load$resolveResult$1");
        return c189200o6M1boximpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UcpRecommendationItem ucpRecommendationItem, InterfaceC1364105Vn<? super C189200o6<? extends UcpRecommendationItem>> interfaceC1364105Vn) {
        return ((a) create(ucpRecommendationItem, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
