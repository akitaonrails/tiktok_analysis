package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.network.PdpReviewApiService;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.dto.RecommendApiRequestDto;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.dto.RecommendApiResponseDto;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Czt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.source.RecommendApiDataSource$fetchRecommendations$2", f = "RecommendApiDataSource.kt", l = {LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT}, m = "invokeSuspend")
public final class C331990Czt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends RecommendApiResponseDto>>, Object> {
    public int LL;
    public final /* synthetic */ RecommendApiRequestDto LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C331990Czt(RecommendApiRequestDto recommendApiRequestDto, InterfaceC1364105Vn<? super C331990Czt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = recommendApiRequestDto;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C331990Czt(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        C1C7U.LIZ("RecommendApiDataSource@1564.fetchRecommendations$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                PdpReviewApiService pdpReviewApiService = (PdpReviewApiService) C334130D7z.LJII.getValue();
                Map<String, String> mapLJ = C2097608Jq.LJ();
                Map<String, String> queryMap = this.LLILLJJLI.toQueryMap();
                this.LL = 1;
                obj = pdpReviewApiService.getRelatedProducts(mapLJ, queryMap, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("RecommendApiDataSource@1564.fetchRecommendations$2");
                    return objLJFF;
                }
            }
            RecommendApiResponseDto recommendApiResponseDto = (RecommendApiResponseDto) obj;
            if (recommendApiResponseDto.isSuccess()) {
                C189200o6.m2constructorimpl(recommendApiResponseDto);
                obj2 = recommendApiResponseDto;
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Recommend API error: statusCode=");
                sbLIZ.append(recommendApiResponseDto.getStatusCode());
                sbLIZ.append(", message=");
                sbLIZ.append(recommendApiResponseDto.getMessage());
                C098200Yq c098200Yq = new C098200Yq(new Exception(C2188811AlT.LIZIZ(sbLIZ)));
                C189200o6.m2constructorimpl(c098200Yq);
                obj2 = c098200Yq;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C098200Yq c098200Yq2 = new C098200Yq(e);
            C189200o6.m2constructorimpl(c098200Yq2);
            obj2 = c098200Yq2;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(obj2);
        C1C7U.LIZIZ("RecommendApiDataSource@1564.fetchRecommendations$2");
        return c189200o6M1boximpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends RecommendApiResponseDto>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
