package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.ecommerce.model.RelatedProductInfo;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabShowcaseFragment;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.api.ShopApi;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.api.ShowcaseProductRequest;
import com.ss.android.ugc.aweme.ecommercebase.pagesource.PageSource;
import com.ss.android.ugc.aweme.ecommercebase.pagesource.PageSourceInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vMP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabShowcaseFragment$requestShowcaseData$1", f = "TabShowcaseFragment.kt", l = {260, 262}, m = "invokeSuspend")
public final class C1739230vMP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super TemplateData>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ TabShowcaseFragment LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1739230vMP(boolean z, TabShowcaseFragment tabShowcaseFragment, String str, String str2, InterfaceC1364105Vn<? super C1739230vMP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = tabShowcaseFragment;
        this.LLILZ = str;
        this.LLILZIL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1739230vMP(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int statusCode;
        String strLIZIZ;
        String strLJIIIIZZ;
        Integer numValueOf;
        List listLJLJJLL;
        C13LG<Long> c13lg;
        Object tabShowcaseProducts = obj;
        C1C7U.LIZ("TabShowcaseFragment@8f9e.requestShowcaseData$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C155000ia.LIZIZ(tabShowcaseProducts);
                    strLIZIZ = (String) tabShowcaseProducts;
                } else {
                    C155000ia.LIZIZ(tabShowcaseProducts);
                    strLIZIZ = (String) tabShowcaseProducts;
                }
            } else {
                C155000ia.LIZIZ(tabShowcaseProducts);
                C1202220hOG c1202220hOG = C1202220hOG.LIZ;
                String str = this.LLILLL.LLJI;
                c1202220hOG.getClass();
                List listLIZJ = C1202220hOG.LIZJ(str, "search_card_live_product_id_list");
                List listLIZJ2 = C1202220hOG.LIZJ(this.LLILLL.LLJI, "search_card_no_live_product_id_list");
                String str2 = this.LLILLL.zS().secId;
                String enterFrom = this.LLILLL.getEnterFrom();
                PageSourceInfo pageSourceInfoLJFF = C1766860w4y.LJFF(C1766860w4y.LIZ, new PageSource(this.LLILLL.getBtmPageCode(), null), null, null, 6);
                if (pageSourceInfoLJFF != null) {
                    strLJIIIIZZ = C1741890vQh.LJIIIIZZ(pageSourceInfoLJFF);
                } else {
                    strLJIIIIZZ = null;
                }
                boolean z = this.LLILLJJLI;
                int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "ec_showcase_product_protocol_version", true);
                if (iLJIJ == 0) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(iLJIJ);
                }
                String str3 = this.LLILLL.LLJJJIL;
                IECommerceAnchorService iECommerceAnchorService = (IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class);
                TabShowcaseFragment tabShowcaseFragment = this.LLILLL;
                RelatedProductInfo relatedProductInfoLJLLI = iECommerceAnchorService.LJLLI(tabShowcaseFragment.LLJJJIL, tabShowcaseFragment.zS().id);
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
                ShowcaseProductRequest showcaseProductRequest = new ShowcaseProductRequest(str2, this.LLILZ, enterFrom, null, 0, null, listLIZJ, listLIZJ2, this.LLILZIL, strLJIIIIZZ, z ? 1 : 0, numValueOf, listLJLJJLL, str3, 56, null);
                if (this.LLILLJJLI) {
                    ShopApi shopApi = (ShopApi) C0NSL.LIZ().create(ShopApi.class);
                    this.LL = 1;
                    tabShowcaseProducts = shopApi.getTabShowcasePrefetchProducts(showcaseProductRequest, this);
                    if (tabShowcaseProducts == objLJFF) {
                        C1C7U.LIZIZ("TabShowcaseFragment@8f9e.requestShowcaseData$1");
                        return objLJFF;
                    }
                    strLIZIZ = (String) tabShowcaseProducts;
                } else {
                    ShopApi shopApi2 = (ShopApi) C0NSL.LIZ().create(ShopApi.class);
                    this.LL = 2;
                    tabShowcaseProducts = shopApi2.getTabShowcaseProducts(showcaseProductRequest, this);
                    if (tabShowcaseProducts == objLJFF) {
                        C1C7U.LIZIZ("TabShowcaseFragment@8f9e.requestShowcaseData$1");
                        return objLJFF;
                    }
                    strLIZIZ = (String) tabShowcaseProducts;
                }
            }
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            if (e2 instanceof C1494690ozz) {
                statusCode = ((C1494690ozz) e2).getStatusCode();
            } else {
                statusCode = -106;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("{\"code\":");
            sbLIZ.append(statusCode);
            sbLIZ.append('}');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        TabShowcaseFragment tabShowcaseFragment2 = this.LLILLL;
        String str4 = this.LLILZIL;
        tabShowcaseFragment2.getClass();
        TemplateData templateDataLIZJ = C1547280qMo.LIZJ(new Pair("recommend_context", str4), new Pair("profile_tab_product_list", strLIZIZ));
        C1C7U.LIZIZ("TabShowcaseFragment@8f9e.requestShowcaseData$1");
        return templateDataLIZJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super TemplateData> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
