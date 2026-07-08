package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.model.UcpRecommendationItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Czd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.components.waterfall.WaterfallProgressiveSlotResolver$resolve$2$1$1$1$resolved$1", f = "WaterfallProgressiveSlotResolver.kt", l = {61}, m = "invokeSuspend")
public final class C331830Czd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0D0F>, Object> {
    public int LL;
    public final /* synthetic */ Function2<UcpRecommendationItem, InterfaceC1364105Vn<? super C189200o6<UcpRecommendationItem>>, Object> LLILLJJLI;
    public final /* synthetic */ UcpRecommendationItem LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C331830Czd(Function2<? super UcpRecommendationItem, ? super InterfaceC1364105Vn<? super C189200o6<UcpRecommendationItem>>, ? extends Object> function2, UcpRecommendationItem ucpRecommendationItem, int i, InterfaceC1364105Vn<? super C331830Czd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = function2;
        this.LLILLL = ucpRecommendationItem;
        this.LLILZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C331830Czd(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("WaterfallProgressiveSlotResolver@5c7c.resolve$2$1$1$1$resolved$1");
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
            Function2<UcpRecommendationItem, InterfaceC1364105Vn<? super C189200o6<UcpRecommendationItem>>, Object> function2 = this.LLILLJJLI;
            UcpRecommendationItem ucpRecommendationItem = this.LLILLL;
            this.LL = 1;
            obj = function2.invoke(ucpRecommendationItem, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("WaterfallProgressiveSlotResolver@5c7c.resolve$2$1$1$1$resolved$1");
                return objLJFF;
            }
        }
        Object objM10unboximpl = ((C189200o6) obj).m10unboximpl();
        C0D0F c0d0f = null;
        if (C189200o6.m8isSuccessimpl(objM10unboximpl)) {
            if (C189200o6.m7isFailureimpl(objM10unboximpl)) {
                objM10unboximpl = null;
            }
            UcpRecommendationItem ucpRecommendationItem2 = (UcpRecommendationItem) objM10unboximpl;
            if (ucpRecommendationItem2 == null) {
                ucpRecommendationItem2 = this.LLILLL;
            }
            c0d0f = new C0D0F(ucpRecommendationItem2, this.LLILZ);
        }
        C1C7U.LIZIZ("WaterfallProgressiveSlotResolver@5c7c.resolve$2$1$1$1$resolved$1");
        return c0d0f;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0D0F> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
