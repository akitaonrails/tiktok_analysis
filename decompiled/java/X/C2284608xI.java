package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.ug.outofapp.seo.api.RedirectSchemaApi;
import com.ss.android.ugc.aweme.ecommerce.ug.outofapp.seo.bean.EcUgRedirectSchemaResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08xI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.ug.outofapp.seo.manager.EcUgRedirectSEOSchemaManager$handleRedirectShopSchema$2$response$1", f = "EcUgRedirectSEOSchemaManager.kt", l = {255}, m = "invokeSuspend")
public final class C2284608xI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0X52<Response<EcUgRedirectSchemaResponse>>>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2284608xI(int i, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2284608xI(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcUgRedirectSEOSchemaManager@ea12.handleRedirectShopSchema$2$response$1");
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
            C2285108xN c2285108xN = C2285008xM.LLILLJJLI.getValue().LL;
            String str = this.LLILLJJLI;
            int i2 = this.LLILLL;
            Integer numLJ = C2286608xc.LJ(1);
            this.LL = 1;
            c2285108xN.getClass();
            RedirectSchemaApi.LIZ.getClass();
            obj = C2284708xJ.LIZIZ.getValue().redirectSchema(str, C2286608xc.LJ(i2), numLJ, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("EcUgRedirectSEOSchemaManager@ea12.handleRedirectShopSchema$2$response$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("EcUgRedirectSEOSchemaManager@ea12.handleRedirectShopSchema$2$response$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0X52<Response<EcUgRedirectSchemaResponse>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
