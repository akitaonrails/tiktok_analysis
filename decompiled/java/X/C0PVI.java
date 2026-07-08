package X;

import com.ss.android.ugc.aweme.ecommerce.search.suggest.api.EcSuggestWordsApi;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.EcClickRecommendProductsResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0PVI, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.suggest.api.EcSuggestWordsApi$fetchClickRecommendProductsData$2", f = "EcSuggestWordsApi.kt", l = {556}, m = "invokeSuspend")
public final class C0PVI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super EcClickRecommendProductsResponse>, Object> {
    public int LL;
    public final /* synthetic */ C671380QVc LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0PVI(C671380QVc c671380QVc, InterfaceC1364105Vn<? super C0PVI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c671380QVc;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0PVI(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Integer numLJIIJJI;
        int iIntValue;
        C1C7U.LIZ("EcSuggestWordsApi@685f.fetchClickRecommendProductsData$2");
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
            EcSuggestWordsApi.LIZ.getClass();
            EcSuggestWordsApi.SuggestApi suggestApi = (EcSuggestWordsApi.SuggestApi) EcSuggestWordsApi.LIZIZ.getValue();
            C671380QVc c671380QVc = this.LLILLJJLI;
            String str = c671380QVc.LJIILJJIL;
            String str2 = c671380QVc.LJI;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = c671380QVc.LJIIZILJ;
            if (str3 != null) {
                numLJIIJJI = C2095008Iq.LJIIJJI(str3);
            } else {
                numLJIIJJI = null;
            }
            C671380QVc c671380QVc2 = this.LLILLJJLI;
            String str4 = c671380QVc2.LJII;
            if (str4 == null) {
                str4 = "";
            }
            String str5 = c671380QVc2.LJIIIIZZ;
            Integer num = c671380QVc2.LJJ;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            this.LL = 1;
            obj = suggestApi.fetchClickRecommendProductsData(str, str2, numLJIIJJI, str4, "tiktok_general", str5, iIntValue, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("EcSuggestWordsApi@685f.fetchClickRecommendProductsData$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("EcSuggestWordsApi@685f.fetchClickRecommendProductsData$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super EcClickRecommendProductsResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
