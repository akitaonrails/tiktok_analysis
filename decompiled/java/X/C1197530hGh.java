package X;

import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0hGh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.search.PoiSearchCacheResponseHandler$handelResponse$request$1", f = "PoiSearchCacheResponseHandler.kt", l = {43}, m = "invokeSuspend")
public final class C1197530hGh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super PoiSearchApi.PoiSearchResultWrapper>, Object> {
    public int LL;
    public final /* synthetic */ Function1<InterfaceC1364105Vn<? super PoiSearchApi.PoiSearchResultWrapper>, Object> LLILLJJLI;
    public final /* synthetic */ C1199510hJt LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1197530hGh(Function1<? super InterfaceC1364105Vn<? super PoiSearchApi.PoiSearchResultWrapper>, ? extends Object> function1, C1199510hJt c1199510hJt, InterfaceC1364105Vn<? super C1197530hGh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = function1;
        this.LLILLL = c1199510hJt;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1197530hGh(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiSearchCacheResponseHandler@c11c.handelResponse$request$1");
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
            Function1<InterfaceC1364105Vn<? super PoiSearchApi.PoiSearchResultWrapper>, Object> function1 = this.LLILLJJLI;
            this.LL = 1;
            obj = function1.invoke(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PoiSearchCacheResponseHandler@c11c.handelResponse$request$1");
                return objLJFF;
            }
        }
        this.LLILLL.getClass();
        PoiSearchApi.PoiSearchResultWrapper poiSearchResultWrapperLIZ = AbstractC1199530hJv.LIZ((PoiSearchApi.PoiSearchResultWrapper) obj);
        C1C7U.LIZIZ("PoiSearchCacheResponseHandler@c11c.handelResponse$request$1");
        return poiSearchResultWrapperLIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super PoiSearchApi.PoiSearchResultWrapper> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
