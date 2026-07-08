package X;

import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0hJM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.videopublish.PoiPublishExtensionRepository$operator$1$fetchRecommendPoiList$1$1", f = "PoiPublishExtensionRepository.kt", l = {93}, m = "invokeSuspend")
public final class C1199180hJM extends C09AX implements Function1<InterfaceC1364105Vn<? super PoiSearchApi.PoiSearchResultWrapper>, Object> {
    public int LL;
    public final /* synthetic */ C1199140hJI LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1199180hJM(C1199140hJI c1199140hJI, String str, boolean z, InterfaceC1364105Vn<? super C1199180hJM> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c1199140hJI;
        this.LLILLL = str;
        this.LLILZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1199180hJM(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super PoiSearchApi.PoiSearchResultWrapper> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiPublishExtensionRepository@30c1.operator$1$fetchRecommendPoiList$1$1");
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
            CertProviderManagerKt.findCert("bpea-poi_search_recommend_client_rank", 1476395008, "evru");
            C1199170hJL c1199170hJL = new C1199170hJL(this.LLILLJJLI, this.LLILLL, this.LLILZ, null);
            this.LL = 1;
            try {
                obj = c1199170hJL.invoke(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("PoiPublishExtensionRepository@30c1.operator$1$fetchRecommendPoiList$1$1");
                    return objLJFF;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C1C7U.LIZIZ("PoiPublishExtensionRepository@30c1.operator$1$fetchRecommendPoiList$1$1");
        return obj;
    }
}
