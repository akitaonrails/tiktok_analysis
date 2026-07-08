package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.ReviewApi;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0vv5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.review.lynx.ReviewAssemVM$fetchReviewData$2$ssResponse$1$1", f = "ReviewAssemVM.kt", l = {136}, m = "invokeSuspend")
public final class C1760730vv5 extends C09AX implements Function1<InterfaceC1364105Vn<? super C0X52<Response<Map<String, ? extends Object>>>>, Object> {
    public int LL;
    public final /* synthetic */ ReviewApi.ReviewRequest LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1760730vv5(ReviewApi.ReviewRequest reviewRequest, InterfaceC1364105Vn<? super C1760730vv5> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = reviewRequest;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1760730vv5(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super C0X52<Response<Map<String, ? extends Object>>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ReviewAssemVM@4f4a.fetchReviewData$2$ssResponse$1$1");
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
            C1760770vv9 c1760770vv9 = ReviewApi.LIZ;
            ReviewApi.ReviewRequest reviewRequest = this.LLILLJJLI;
            this.LL = 1;
            c1760770vv9.getClass();
            obj = ((ReviewApi) C1760770vv9.LIZIZ.create(ReviewApi.class)).LJ(reviewRequest, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ReviewAssemVM@4f4a.fetchReviewData$2$ssResponse$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ReviewAssemVM@4f4a.fetchReviewData$2$ssResponse$1$1");
        return obj;
    }
}
