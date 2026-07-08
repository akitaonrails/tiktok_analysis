package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.repository.api.VSAApi;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.repository.bean.VSACardsRequest;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.repository.bean.VSACardsResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.1886, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.ug.vsa.manager.EcUgVSAManager$preloadProductData$1$1$response$1", f = "EcUgVSAManager.kt", l = {244}, m = "invokeSuspend")
public final class AnonymousClass1886 extends C09AX implements Function1<InterfaceC1364105Vn<? super C0X52<Response<VSACardsResponse>>>, Object> {
    public int LL;
    public final /* synthetic */ List<VSACardsRequest.VSAInfoInfo> LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass1886(String str, List list, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new AnonymousClass1886(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super C0X52<Response<VSACardsResponse>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcUgVSAManager@aafd.preloadProductData$1$1$response$1");
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
            C18PZ.LIZ.getClass();
            C21281018Pw c21281018Pw = ((C21281118Px) C18PZ.LIZIZ.getValue()).LL;
            List<VSACardsRequest.VSAInfoInfo> list = this.LLILLJJLI;
            String str = this.LLILLL;
            this.LL = 1;
            c21281018Pw.getClass();
            VSAApi.LIZ.getClass();
            obj = AnonymousClass1885.LIZIZ.fetchVSAProductCards(new VSACardsRequest(list, str), this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("EcUgVSAManager@aafd.preloadProductData$1$1$response$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("EcUgVSAManager@aafd.preloadProductData$1$1$response$1");
        return obj;
    }
}
