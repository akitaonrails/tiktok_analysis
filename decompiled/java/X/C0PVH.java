package X;

import com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.api.EcSuggestWordsApi;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.EcClickSearchResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0PVH, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.suggest.api.EcSuggestWordsApi$fetchClickSearchData$2", f = "EcSuggestWordsApi.kt", l = {537}, m = "invokeSuspend")
public final class C0PVH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super EcClickSearchResponse>, Object> {
    public int LL;
    public final /* synthetic */ C671380QVc LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0PVH(C671380QVc c671380QVc, InterfaceC1364105Vn<? super C0PVH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c671380QVc;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0PVH(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objFetchClickSearchData = obj;
        C1C7U.LIZ("EcSuggestWordsApi@685f.fetchClickSearchData$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objFetchClickSearchData);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objFetchClickSearchData);
            EcSuggestWordsApi.LIZ.getClass();
            EcSuggestWordsApi.SuggestApi suggestApi = (EcSuggestWordsApi.SuggestApi) EcSuggestWordsApi.LIZIZ.getValue();
            C671380QVc c671380QVc = this.LLILLJJLI;
            String str = c671380QVc.LIZJ;
            String str2 = c671380QVc.LJIIZILJ;
            String str3 = c671380QVc.LJIJ;
            String str4 = c671380QVc.LJIJI;
            String str5 = c671380QVc.LJIILJJIL;
            String strLJIJ = ((ICommonFeedApiService) ServiceManager.get().getService(ICommonFeedApiService.class)).LJIJ();
            if (strLJIJ == null || strLJIJ.length() == 0) {
                strLJIJ = "";
            }
            C671380QVc c671380QVc2 = this.LLILLJJLI;
            String str6 = c671380QVc2.LJIJJ;
            String str7 = c671380QVc2.LJIILL;
            String str8 = c671380QVc2.LJIILLIIL;
            Integer num = c671380QVc2.LJJIIZI;
            Integer num2 = c671380QVc2.LJJIJ;
            this.LL = 1;
            objFetchClickSearchData = suggestApi.fetchClickSearchData(str, str2, str3, str4, str5, strLJIJ, str6, str7, str8, num, num2, this);
            if (objFetchClickSearchData == objLJFF) {
                C1C7U.LIZIZ("EcSuggestWordsApi@685f.fetchClickSearchData$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("EcSuggestWordsApi@685f.fetchClickSearchData$2");
        return objFetchClickSearchData;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super EcClickSearchResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
