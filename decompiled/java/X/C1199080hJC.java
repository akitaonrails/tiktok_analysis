package X;

import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0hJC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.search.PoiSearchVM$searchPoiWithCert$2", f = "PoiSearchVM.kt", l = {1109}, m = "invokeSuspend")
public final class C1199080hJC extends C09AX implements Function1<InterfaceC1364105Vn<? super PoiSearchApi.PoiSearchResultWrapper>, Object> {
    public int LL;
    public final /* synthetic */ C1199140hJI LLILLJJLI;
    public final /* synthetic */ Long LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1199080hJC(C1199140hJI c1199140hJI, Long l, boolean z, InterfaceC1364105Vn<? super C1199080hJC> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c1199140hJI;
        this.LLILLL = l;
        this.LLILZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1199080hJC(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super PoiSearchApi.PoiSearchResultWrapper> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiSearchVM@b8c3.searchPoiWithCert$2");
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
            C1199160hJK c1199160hJK = PoiSearchApi.LIZ;
            C1199140hJI c1199140hJI = this.LLILLJJLI;
            TokenCert.Companion companion = TokenCert.Companion;
            companion.with("bpea-poi_search_empty_search_client_rank").auth("evru");
            companion.with("bpea-poi_search_empty_search_client_rank_decypt").auth("mckd");
            Long l = this.LLILLL;
            boolean z = this.LLILZ;
            this.LL = 1;
            obj = c1199160hJK.LJFF(c1199140hJI, l, z, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PoiSearchVM@b8c3.searchPoiWithCert$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("PoiSearchVM@b8c3.searchPoiWithCert$2");
        return obj;
    }
}
