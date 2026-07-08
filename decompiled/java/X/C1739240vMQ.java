package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.model.RelatedProductInfo;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabStoreFragment;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.api.ProductListRequestBody;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.api.ShopApi;
import com.ss.android.ugc.aweme.ecommercebase.pagesource.PageSource;
import com.ss.android.ugc.aweme.ecommercebase.pagesource.PageSourceInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vMQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabStoreFragment$productsAsync$2", f = "TabStoreFragment.kt", l = {313}, m = "invokeSuspend")
public final class C1739240vMQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Response<n>>, Object> {
    public int LL;
    public final /* synthetic */ TabStoreFragment LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1739240vMQ(TabStoreFragment tabStoreFragment, boolean z, String str, String str2, InterfaceC1364105Vn<? super C1739240vMQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = tabStoreFragment;
        this.LLILLL = z;
        this.LLILZ = str;
        this.LLILZIL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1739240vMQ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Response response;
        String strLJIIIIZZ;
        List listLJLJJLL;
        C13LG<Long> c13lg;
        Object productListResponse = obj;
        C1C7U.LIZ("TabStoreFragment@633c.productsAsync$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(productListResponse);
            } else {
                C155000ia.LIZIZ(productListResponse);
                TabStoreFragment tabStoreFragment = this.LLILLJJLI;
                String str = tabStoreFragment.LLJLIL;
                String enterFrom = tabStoreFragment.getEnterFrom();
                C1202220hOG c1202220hOG = C1202220hOG.LIZ;
                String str2 = this.LLILLJJLI.LLJI;
                c1202220hOG.getClass();
                List listLIZJ = C1202220hOG.LIZJ(str2, "search_card_live_product_id_list");
                List listLIZJ2 = C1202220hOG.LIZJ(this.LLILLJJLI.LLJI, "search_card_no_live_product_id_list");
                TabStoreFragment tabStoreFragment2 = this.LLILLJJLI;
                int[] iArr = tabStoreFragment2.LLJ;
                PageSourceInfo pageSourceInfoLJFF = C1766860w4y.LJFF(C1766860w4y.LIZ, new PageSource(tabStoreFragment2.getBtmPageCode(), null), null, null, 6);
                if (pageSourceInfoLJFF != null) {
                    strLJIIIIZZ = C1741890vQh.LJIIIIZZ(pageSourceInfoLJFF);
                } else {
                    strLJIIIIZZ = null;
                }
                boolean z = this.LLILLL;
                String str3 = this.LLILLJJLI.LLJJJIL;
                IECommerceAnchorService iECommerceAnchorService = (IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class);
                TabStoreFragment tabStoreFragment3 = this.LLILLJJLI;
                RelatedProductInfo relatedProductInfoLJLLI = iECommerceAnchorService.LJLLI(tabStoreFragment3.LLJJJIL, tabStoreFragment3.zS().id);
                if (relatedProductInfoLJLLI != null && (c13lg = relatedProductInfoLJLLI.productIdList) != null) {
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(c13lg, 10));
                    Iterator<Long> it2 = c13lg.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(String.valueOf(it2.next().longValue()));
                    }
                    listLJLJJLL = C13LP.LJLJJLL(arrayList);
                } else {
                    listLJLJJLL = null;
                }
                ProductListRequestBody productListRequestBody = new ProductListRequestBody(this.LLILZ, null, 0, 0, 10, str, enterFrom, null, null, "profile_tab_store", null, null, null, null, listLIZJ, listLIZJ2, null, null, iArr, null, null, this.LLILZIL, strLJIIIIZZ, null, null, z ? 1 : 0, 0, null, null, str3, listLJLJJLL, true, null, null, 496713102, 3, null);
                ShopApi shopApi = (ShopApi) C0NSL.LIZ().create(ShopApi.class);
                this.LL = 1;
                productListResponse = shopApi.getProductListResponse(productListRequestBody, this);
                if (productListResponse == objLJFF) {
                    C1C7U.LIZIZ("TabStoreFragment@633c.productsAsync$2");
                    return objLJFF;
                }
            }
            response = (Response) productListResponse;
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            response = null;
        }
        C1C7U.LIZIZ("TabStoreFragment@633c.productsAsync$2");
        return response;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Response<n>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
