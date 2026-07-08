package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.ReviewInteractResponseDto;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.network.PdpReviewApiService;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Czq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.source.review.ReviewRealDataSource$fetchReviews$2$response$1", f = "ReviewRealDataSource.kt", l = {44}, m = "invokeSuspend")
public final class C331960Czq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super ReviewInteractResponseDto>, Object> {
    public int LL;
    public final /* synthetic */ PdpReviewApiService LLILLJJLI;
    public final /* synthetic */ Map<String, String> LLILLL;
    public final /* synthetic */ Map<String, String> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C331960Czq(PdpReviewApiService pdpReviewApiService, Map<String, String> map, Map<String, String> map2, InterfaceC1364105Vn<? super C331960Czq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pdpReviewApiService;
        this.LLILLL = map;
        this.LLILZ = map2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C331960Czq(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ReviewRealDataSource@d099.fetchReviews$2$response$1");
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
            PdpReviewApiService pdpReviewApiService = this.LLILLJJLI;
            Map<String, String> map = this.LLILLL;
            Map<String, String> map2 = this.LLILZ;
            this.LL = 1;
            obj = pdpReviewApiService.getRealReviews(map, map2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ReviewRealDataSource@d099.fetchReviews$2$response$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ReviewRealDataSource@d099.fetchReviews$2$response$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super ReviewInteractResponseDto> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
