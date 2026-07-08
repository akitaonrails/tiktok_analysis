package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.ecommerce.service.ShoppingAdsServiceImpl;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.feed.model.AdAnchorsExtras;
import com.ss.android.ugc.aweme.feed.model.AdPrefix;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ctR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ecommerce.service.ShoppingAdsServiceImpl$preloadAnchorDataIfNeeded$1", f = "ShoppingAdsServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C1029350ctR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ AnchorCommonStruct LLILLJJLI;
    public final /* synthetic */ ShoppingAdsServiceImpl LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1029350ctR(AnchorCommonStruct anchorCommonStruct, ShoppingAdsServiceImpl shoppingAdsServiceImpl, InterfaceC1364105Vn<? super C1029350ctR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = anchorCommonStruct;
        this.LLILLL = shoppingAdsServiceImpl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1029350ctR c1029350ctR = new C1029350ctR(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c1029350ctR.LL = obj;
        return c1029350ctR;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.util.ArrayList] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<AnchorProductInfoModel> listLJJLIIIJL;
        AdPrefix adPrefix;
        List<String> list;
        AdPrefix adPrefix2;
        List<String> list2;
        C1C7U.LIZ("ShoppingAdsServiceImpl@f3fb.preloadAnchorDataIfNeeded$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IECommerceAnchorService iECommerceAnchorService = (IECommerceAnchorService) PluggableExtentionKt.pluggableSpi$default(IECommerceAnchorService.class, false, false, false, 14, null);
        if (iECommerceAnchorService != null && (listLJJLIIIJL = iECommerceAnchorService.LJJLIIIJL(this.LLILLJJLI)) != null) {
            if (listLJJLIIIJL.isEmpty()) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("ShoppingAdsServiceImpl@f3fb.preloadAnchorDataIfNeeded$1");
                return unit;
            }
            C259800zU c259800zU = new C259800zU();
            c259800zU.element = new ArrayList();
            this.LLILLL.LIZ = true;
            for (AnchorProductInfoModel anchorProductInfoModel : listLJJLIIIJL) {
                AdAnchorsExtras adAnchorsExtras = anchorProductInfoModel.extraData.adAnchorsExtras;
                if (adAnchorsExtras != null && (adPrefix2 = adAnchorsExtras.prefix) != null && (list2 = adPrefix2.primaryPrefixImageUrls) != null) {
                    for (String str : list2) {
                        try {
                            if (!C1325420kay.LIZIZ(str)) {
                                C189200o6.m2constructorimpl(Boolean.valueOf(((List) c259800zU.element).add(str)));
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C189200o6.m2constructorimpl(new C098200Yq(th));
                        }
                    }
                }
                AdAnchorsExtras adAnchorsExtras2 = anchorProductInfoModel.extraData.adAnchorsExtras;
                if (adAnchorsExtras2 != null && (adPrefix = adAnchorsExtras2.prefix) != null && (list = adPrefix.secondaryPrefixImageUrls) != null) {
                    for (String str2 : list) {
                        if (!C1325420kay.LIZIZ(str2)) {
                            ((List) c259800zU.element).add(str2);
                        }
                    }
                }
            }
            List listLJJJJI = C13LP.LJJJJI((Iterable) c259800zU.element);
            if (listLJJJJI.isEmpty()) {
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("ShoppingAdsServiceImpl@f3fb.preloadAnchorDataIfNeeded$1");
                return unit2;
            }
            try {
                C189200o6.m2constructorimpl(C1331660kl2.LJIIJ(new C03IT(listLJJJJI)).LJIIZILJ());
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C189200o6.m2constructorimpl(new C098200Yq(th2));
            }
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("ShoppingAdsServiceImpl@f3fb.preloadAnchorDataIfNeeded$1");
            return unit3;
        }
        Unit unit4 = Unit.LIZ;
        C1C7U.LIZIZ("ShoppingAdsServiceImpl@f3fb.preloadAnchorDataIfNeeded$1");
        return unit4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
