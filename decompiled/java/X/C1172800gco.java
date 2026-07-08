package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.google.gson.n;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.image.LsResBystander;
import com.ss.android.ugc.aweme.net.LocationNetRequestInfoCommonInterceptor;
import com.ss.android.ugc.aweme.net.LsPreloadCheckerBystander;
import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import com.ss.android.ugc.aweme.poi.videopublish.videounderstand.data.PoiVideoUnderstandResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0gco, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.videopublish.videounderstand.repo.PoiVideoUnderstandRepository$UnderstandRepoOperatorImpl$requestVideoUnderstand$2", f = "PoiVideoUnderstandRepository.kt", l = {39}, m = "invokeSuspend")
public final class C1172800gco extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super PoiVideoUnderstandResponse>, Object> {
    public int LL;
    public final /* synthetic */ n LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1172800gco(n nVar, InterfaceC1364105Vn<? super C1172800gco> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = nVar;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1172800gco(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiVideoUnderstandRepository$UnderstandRepoOperatorImpl@61f0.requestVideoUnderstand$2");
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
            C1499850p8J c1499850p8JCreateBuilder = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(Api.LIZ);
            c1499850p8JCreateBuilder.LIZ(new LocationNetRequestInfoCommonInterceptor());
            c1499850p8JCreateBuilder.LIZIZ(LsResBystander.LIZ);
            c1499850p8JCreateBuilder.LIZIZ(LsPreloadCheckerBystander.LIZ);
            c1499850p8JCreateBuilder.LJIIIZ = 0;
            PoiSearchApi poiSearchApi = (PoiSearchApi) c1499850p8JCreateBuilder.build().retrofit.LIZ(PoiSearchApi.class);
            C844470XAv.LIZ.getClass();
            C11NZ<PoiVideoUnderstandResponse> c11nzLIZIZ = poiSearchApi.LIZIZ("application/json", String.valueOf(C844470XAv.LJIIJ), this.LLILLJJLI);
            this.LL = 1;
            obj = C11UD.LIZJ(c11nzLIZIZ, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PoiVideoUnderstandRepository$UnderstandRepoOperatorImpl@61f0.requestVideoUnderstand$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("PoiVideoUnderstandRepository$UnderstandRepoOperatorImpl@61f0.requestVideoUnderstand$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super PoiVideoUnderstandResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
