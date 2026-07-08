package X;

import com.ss.android.ugc.aweme.ecommerce.search.suggest.api.EcSuggestWordsApi;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.EcClickRecommendProductsResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0PVG, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.general.clickrecommend.network.EcClickRecommendDataExecutor$sendRequest$1$1$response$1", f = "EcClickRecommendDataExecutor.kt", l = {146, 155}, m = "invokeSuspend")
public final class C0PVG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super EcClickRecommendProductsResponse>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0PVG(int i, int i2, String str, String str2, String str3, String str4, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = i;
        this.LLILZIL = str3;
        this.LLILZLL = str4;
        this.LLIZ = i2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        String str = this.LLILLJJLI;
        String str2 = this.LLILLL;
        return new C0PVG(this.LLILZ, this.LLIZ, str, str2, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcClickRecommendDataExecutor@c268.sendRequest$1$1$response$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    C1C7U.LIZIZ("EcClickRecommendDataExecutor@c268.sendRequest$1$1$response$1");
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            EcSuggestWordsApi ecSuggestWordsApi = EcSuggestWordsApi.LIZ;
            C671380QVc c671380QVc = new C671380QVc();
            String str = this.LLILLJJLI;
            String str2 = this.LLILLL;
            int i2 = this.LLILZ;
            String str3 = this.LLILZIL;
            String str4 = this.LLILZLL;
            int i3 = this.LLIZ;
            c671380QVc.LJIILJJIL = str;
            c671380QVc.LJI = str2;
            c671380QVc.LJIIZILJ = String.valueOf(i2);
            c671380QVc.LJII = str3;
            c671380QVc.LJIIIIZZ = str4;
            c671380QVc.LJJ = C2286608xc.LJ(i3);
            this.LL = 1;
            ecSuggestWordsApi.getClass();
            obj = C23250099c.LIZIZ(C817503Hh.LL, null, null, new C0PVI(c671380QVc, null), 3);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("EcClickRecommendDataExecutor@c268.sendRequest$1$1$response$1");
                return objLJFF;
            }
        }
        this.LL = 2;
        obj = ((AnonymousClass0957) obj).LJLIIIL(this);
        if (obj == objLJFF) {
            C1C7U.LIZIZ("EcClickRecommendDataExecutor@c268.sendRequest$1$1$response$1");
            return objLJFF;
        }
        C1C7U.LIZIZ("EcClickRecommendDataExecutor@c268.sendRequest$1$1$response$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super EcClickRecommendProductsResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
