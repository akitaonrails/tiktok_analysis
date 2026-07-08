package X;

import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import com.ss.android.ugc.aweme.poi.videopublish.videounderstand.api.IPoiRecommendService;
import com.ss.android.ugc.aweme.poi.videopublish.videounderstand.data.PoiVideoUnderstandResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0hJL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.videopublish.PoiPublishExtensionRepository$operator$1$fetchRecommendPoiList$1$1$1", f = "PoiPublishExtensionRepository.kt", l = {101}, m = "invokeSuspend")
public final class C1199170hJL extends C09AX implements Function1<InterfaceC1364105Vn<? super PoiSearchApi.PoiSearchResultWrapper>, Object> {
    public PoiVideoUnderstandResponse LL;
    public int LLILLJJLI;
    public final /* synthetic */ C1199140hJI LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1199170hJL(C1199140hJI c1199140hJI, String str, boolean z, InterfaceC1364105Vn<? super C1199170hJL> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLL = c1199140hJI;
        this.LLILZ = str;
        this.LLILZIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1199170hJL(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super PoiSearchApi.PoiSearchResultWrapper> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        PoiVideoUnderstandResponse second;
        C1C7U.LIZ("PoiPublishExtensionRepository@30c1.operator$1$fetchRecommendPoiList$1$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                second = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            second = ((IPoiRecommendService) ServiceManager.get().getService(IPoiRecommendService.class)).LIZ().getSecond();
            C1199160hJK c1199160hJK = PoiSearchApi.LIZ;
            C1199140hJI c1199140hJI = this.LLILLL;
            TokenCert.Companion companion = TokenCert.Companion;
            companion.with("bpea-poi_search_recommend_client_rank").auth("evru");
            companion.with("bpea-poi_search_recommend_client_rank_decypt").auth("mckd");
            String str = this.LLILZ;
            this.LL = second;
            this.LLILLJJLI = 1;
            obj = c1199160hJK.LJI(c1199140hJI, str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PoiPublishExtensionRepository@30c1.operator$1$fetchRecommendPoiList$1$1$1");
                return objLJFF;
            }
        }
        PoiSearchApi.PoiSearchResultWrapper poiSearchResultWrapper = (PoiSearchApi.PoiSearchResultWrapper) obj;
        if (poiSearchResultWrapper != null) {
            boolean z = this.LLILZIL;
            poiSearchResultWrapper.LLILLL = second;
            poiSearchResultWrapper.LLILZIL = z;
        } else {
            poiSearchResultWrapper = null;
        }
        C1C7U.LIZIZ("PoiPublishExtensionRepository@30c1.operator$1$fetchRecommendPoiList$1$1$1");
        return poiSearchResultWrapper;
    }
}
