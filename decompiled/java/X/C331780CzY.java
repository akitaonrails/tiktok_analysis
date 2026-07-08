package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.model.UcpRecommendationItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CzY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.components.recommend.RecommendSlotResolver$resolve$2$1$1$1$updatedSlot$1$result$1", f = "RecommendSlotResolver.kt", l = {45}, m = "invokeSuspend")
public final class C331780CzY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends UcpRecommendationItem>>, Object> {
    public int LL;
    public final /* synthetic */ Function2<UcpRecommendationItem, InterfaceC1364105Vn<? super C189200o6<UcpRecommendationItem>>, Object> LLILLJJLI;
    public final /* synthetic */ UcpRecommendationItem LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C331780CzY(Function2<? super UcpRecommendationItem, ? super InterfaceC1364105Vn<? super C189200o6<UcpRecommendationItem>>, ? extends Object> function2, UcpRecommendationItem ucpRecommendationItem, InterfaceC1364105Vn<? super C331780CzY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = function2;
        this.LLILLL = ucpRecommendationItem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C331780CzY(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecommendSlotResolver@e1d2.resolve$2$1$1$1$updatedSlot$1$result$1");
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
                C1C7U.LIZIZ("RecommendSlotResolver@e1d2.resolve$2$1$1$1$updatedSlot$1$result$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("RecommendSlotResolver@e1d2.resolve$2$1$1$1$updatedSlot$1$result$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends UcpRecommendationItem>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
