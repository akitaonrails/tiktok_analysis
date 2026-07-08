package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.ReviewInteractItemDto;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.ReviewInteractPicsDto;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.ReviewInteractResponseDto;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.ReviewItemDto;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.ReviewPicsDto;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.ReviewsDto;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.network.PdpReviewApiService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Czr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.source.review.ReviewRealDataSource$fetchReviews$2", f = "ReviewRealDataSource.kt", l = {43}, m = "invokeSuspend")
public final class C331970Czr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends ReviewsDto>>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C331970Czr(String str, String str2, InterfaceC1364105Vn<? super C331970Czr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C331970Czr(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        ReviewInteractResponseDto reviewInteractResponseDto;
        ArrayList arrayList;
        ReviewPicsDto reviewPicsDto;
        Object objLIZJ = obj;
        C1C7U.LIZ("ReviewRealDataSource@d099.fetchReviews$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objLIZJ);
            } else {
                C155000ia.LIZIZ(objLIZJ);
                PdpReviewApiService pdpReviewApiService = (PdpReviewApiService) C334130D7z.LJII.getValue();
                Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("channel_name", this.LLILLJJLI), new Pair("cursor", this.LLILLL));
                C0D8X.LIZJ().LIZ();
                C331960Czq c331960Czq = new C331960Czq(pdpReviewApiService, C2097608Jq.LJ(), mapLJIIIIZZ, null);
                this.LL = 1;
                objLIZJ = C099A.LIZJ(10000L, c331960Czq, this);
                if (objLIZJ == objLJFF) {
                    C1C7U.LIZIZ("ReviewRealDataSource@d099.fetchReviews$2");
                    return objLJFF;
                }
            }
            reviewInteractResponseDto = (ReviewInteractResponseDto) objLIZJ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            c098200Yq = new C098200Yq(e);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (reviewInteractResponseDto == null) {
            C098200Yq c098200Yq2 = new C098200Yq(new Exception("Review API request timed out (10s)"));
            C189200o6.m2constructorimpl(c098200Yq2);
            C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(c098200Yq2);
            C1C7U.LIZIZ("ReviewRealDataSource@d099.fetchReviews$2");
            return c189200o6M1boximpl;
        }
        Integer statusCode = reviewInteractResponseDto.getStatusCode();
        if (statusCode != null && statusCode.intValue() == 0) {
            List<ReviewInteractItemDto> reviews = reviewInteractResponseDto.getReviews();
            if (reviews != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(reviews, 10));
                for (ReviewInteractItemDto reviewInteractItemDto : reviews) {
                    Double d = reviewInteractItemDto.star;
                    String str = reviewInteractItemDto.starStr;
                    String str2 = reviewInteractItemDto.content;
                    String str3 = reviewInteractItemDto.author;
                    Long l = reviewInteractItemDto.timestamp;
                    ReviewInteractPicsDto reviewInteractPicsDto = reviewInteractItemDto.pics;
                    if (reviewInteractPicsDto != null) {
                        reviewPicsDto = new ReviewPicsDto(reviewInteractPicsDto.image);
                    } else {
                        reviewPicsDto = null;
                    }
                    arrayList.add(new ReviewItemDto(d, str, str2, str3, l, reviewPicsDto));
                }
            } else {
                arrayList = null;
            }
            c098200Yq = new ReviewsDto(reviewInteractResponseDto.getStatusCode(), reviewInteractResponseDto.getMessage(), arrayList, reviewInteractResponseDto.getNextCursor(), Boolean.valueOf(reviewInteractResponseDto.getHasMore()), C2286608xc.LJ(reviewInteractResponseDto.getTotal()));
            C189200o6.m2constructorimpl(c098200Yq);
        } else {
            String message = reviewInteractResponseDto.getMessage();
            if (message == null) {
                message = "Failed to fetch reviews";
            }
            c098200Yq = new C098200Yq(new RuntimeException(message));
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6 c189200o6M1boximpl2 = C189200o6.m1boximpl(c098200Yq);
        C1C7U.LIZIZ("ReviewRealDataSource@d099.fetchReviews$2");
        return c189200o6M1boximpl2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends ReviewsDto>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
