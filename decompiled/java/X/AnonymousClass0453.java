package X;

import android.view.View;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.addon.dto.GetAddonPanelLayoutRequest;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionEntrance;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRight;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuSupply;
import com.ss.android.ugc.aweme.ecommerce.core.da.HeaderBannerDaInfo;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.AddToCartRequestParam;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.AddToCartUiConfig;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.EnterCartParam;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.ICartService;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.SkuPanelParam;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import njp.a;

/* JADX INFO: renamed from: X.0453, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel$addCart$1$addToCart$1", f = "PdpViewModel.kt", l = {2757}, m = "invokeSuspend")
public final class AnonymousClass0453 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ PdpViewModel LLILZ;
    public final /* synthetic */ SkuItem LLILZIL;
    public final /* synthetic */ View LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ C259800zU<ExceptionUX> LLIZLLLIL;
    public final /* synthetic */ C259800zU<String> LLJ;
    public final /* synthetic */ C259800zU<Object> LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0453(PdpViewModel pdpViewModel, SkuItem skuItem, View view, String str, C259800zU<ExceptionUX> c259800zU, C259800zU<String> c259800zU2, C259800zU<Object> c259800zU3, InterfaceC1364105Vn<? super AnonymousClass0453> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = pdpViewModel;
        this.LLILZIL = skuItem;
        this.LLILZLL = view;
        this.LLIZ = str;
        this.LLIZLLLIL = c259800zU;
        this.LLJ = c259800zU2;
        this.LLJI = c259800zU3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new AnonymousClass0453(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r2v16, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v9, types: [T, java.util.Map] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ConcurrentHashMap<String, Object> concurrentHashMap;
        Object obj2;
        String str;
        HashMap map;
        Type type;
        String str2;
        HeaderBannerDaInfo headerBannerDaInfoLIZ;
        String str3;
        UserRight userRight;
        Object obj3;
        Map mapLJ;
        String strLJIIIIZZ;
        Map<String, Object> map2;
        Map<String, Object> map3;
        PromotionEntrance promotionEntrance;
        Object objLIZ = obj;
        C1C7U.LIZ("PdpViewModel@6cb1.addCart$1$addToCart$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZ);
            final PdpViewModel pdpViewModel = this.LLILZ;
            final SkuItem skuItem = this.LLILZIL;
            View view = this.LLILZLL;
            final String str4 = this.LLIZ;
            C259800zU<ExceptionUX> c259800zU = this.LLIZLLLIL;
            C259800zU<String> c259800zU2 = this.LLJ;
            C259800zU<Object> c259800zU3 = this.LLJI;
            this.LL = view;
            this.LLILLJJLI = str4;
            this.LLILLL = 1;
            C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            final C045F c045f = new C045F(c259800zU, c259800zU2, c259800zU3, c23260099m);
            pdpViewModel.getClass();
            final C259800zU c259800zU4 = new C259800zU();
            final String strIH1 = pdpViewModel.iH1(Integer.valueOf(pdpViewModel.Tg2()));
            if (pdpViewModel.Tg2() == 1) {
                c259800zU4.element = C1073604Hu.LIZ();
            } else if (pdpViewModel.Tg2() == 2) {
                c259800zU4.element = C1073604Hu.LIZIZ();
            }
            C1054004Ag c1054004Ag = pdpViewModel.LLJLILLLLZIIL;
            if (c1054004Ag != null) {
                concurrentHashMap = c1054004Ag.LIZIZ;
            } else {
                concurrentHashMap = null;
            }
            final Map mapLIZ = C1765430w2f.LIZ(concurrentHashMap);
            if (mapLIZ != null) {
                obj2 = mapLIZ.get("entrance_info");
            } else {
                obj2 = null;
            }
            if (obj2 instanceof String) {
                str = (String) obj2;
            } else {
                str = null;
            }
            if (str != null) {
                try {
                    Gson gsonLJFF = C1741890vQh.LJFF();
                    C1120604Zw.LIZ.getClass();
                    C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                    if (c1121904a9LIZIZ == null || !c1121904a9LIZIZ.LJII) {
                        z = false;
                    }
                    if (!z) {
                        type = new TypeToken<HashMap<String, Object>>() { // from class: X.045I
                        }.getType();
                    } else {
                        C13JX c13jx = KTypeProjection.LIZJ;
                        C13JW c13jwLJII = C13LE.LJII(String.class);
                        c13jx.getClass();
                        type = C2371409Qy.LIZJ(C13LE.LJIIIZ(HashMap.class, C13JX.LIZ(c13jwLJII), C13JX.LIZ(C13LE.LJII(Object.class))));
                    }
                    Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, str, type);
                    if (!(objFromJson instanceof HashMap)) {
                        objFromJson = null;
                    }
                    map = (HashMap) objFromJson;
                } catch (s e) {
                    TryCatchGuardChecker.doCheck(e);
                    map = null;
                }
                if (map != null) {
                    ProductPackStruct productPackStruct = pdpViewModel.LLJILLL;
                    if (productPackStruct != null) {
                        map.putAll(productPackStruct.LIZLLL());
                    }
                    mapLIZ.put("entrance_info", C1741890vQh.LJIIIIZZ(map));
                }
            }
            C10296040w c10296040w = C10296040w.LIZ;
            String str5 = null;
            String strLIZ = C041D.LIZ(2, null);
            SkuPanelState skuPanelStatePv0 = pdpViewModel.Pv0();
            if (skuPanelStatePv0 != null) {
                str2 = skuPanelStatePv0.skuId;
            } else {
                str2 = null;
            }
            Map map4 = (Map) c259800zU4.element;
            C03W0 c03w0LIZ = C954903oJ.LIZ(skuItem);
            ProductPackStruct productPackStruct2 = pdpViewModel.LLJILLL;
            if (productPackStruct2 != null) {
                headerBannerDaInfoLIZ = C049I.LIZ(productPackStruct2);
            } else {
                headerBannerDaInfoLIZ = null;
            }
            ProductPackStruct productPackStruct3 = pdpViewModel.LLJILLL;
            if (productPackStruct3 != null && (promotionEntrance = productPackStruct3.promotionEntrance) != null) {
                str3 = promotionEntrance.daInfo;
            } else {
                str3 = null;
            }
            if (productPackStruct3 != null) {
                str5 = productPackStruct3.daInfo;
            }
            Map<String, Object> mapLJ2 = pdpViewModel.LLILZIL.LJ("c3256.d6034");
            SkuSupply skuSupply = skuItem.skuSupply;
            String str6 = pdpViewModel.LLZZLLIL;
            SkuPanelState skuPanelStatePv02 = pdpViewModel.Pv0();
            ProductPackStruct productPackStruct4 = pdpViewModel.LLJILLL;
            if (productPackStruct4 != null) {
                userRight = productPackStruct4.userRight;
            } else {
                userRight = null;
            }
            C10296040w.LIZLLL(c10296040w, strLIZ, str2, 1, "add_to_cart", strIH1, "product_detail", mapLIZ, map4, c03w0LIZ, null, headerBannerDaInfoLIZ, str3, str5, null, null, mapLJ2, str4, 1, skuSupply, str6, null, skuPanelStatePv02, userRight, 1073664);
            IPdpStarter.PdpEnterParam pdpEnterParam = pdpViewModel.LLJI;
            if (pdpEnterParam != null && (map3 = pdpEnterParam.trackParams) != null) {
                obj3 = map3.get("source_page_type");
            } else {
                obj3 = null;
            }
            if (!Intrinsics.LJFF(obj3, "add_item_interception")) {
                C858603Xc c858603Xc = C858603Xc.LIZ;
                InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(pdpViewModel);
                GetAddonPanelLayoutRequest getAddonPanelLayoutRequestLIZ = C10345042t.LIZ(pdpViewModel);
                c858603Xc.getClass();
                C858603Xc.LIZLLL(viewModelScope, getAddonPanelLayoutRequestLIZ);
            }
            ICartService iCartService = (ICartService) ServiceManager.get().getService(ICartService.class);
            AddToCartRequestParam addToCartRequestParamLIZ = AnonymousClass0435.LIZ(pdpViewModel, view).LIZ(null);
            IPdpStarter.PdpEnterParam pdpEnterParam2 = pdpViewModel.LLJI;
            if (pdpEnterParam2 != null && (map2 = pdpEnterParam2.trackParams) != null) {
                HashMap map5 = new HashMap(map2);
                map5.put("page_name", "product_detail");
                mapLJ = map5;
            } else {
                mapLJ = C2097608Jq.LJ();
            }
            C10355043d c10355043d = new C10355043d(mapLJ, C2097608Jq.LJ());
            Map mapLIZIZ = C045D.LIZIZ(pdpViewModel.LLJILLL, pdpViewModel.Pv0());
            if (mapLIZIZ != null) {
                strLJIIIIZZ = C1741890vQh.LJIIIIZZ(mapLIZIZ);
            } else {
                strLJIIIIZZ = null;
            }
            iCartService.LIZLLL(view, new C043Y(addToCartRequestParamLIZ, c10355043d, false, new SkuPanelParam(null, null, "c3256.d6034", strLJIIIIZZ, null, null, null, null), new AddToCartUiConfig(false, true, 0L, 0, Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "ecom_cart_vibrate", true, false)))), new AnonymousClass0431() { // from class: X.0454
                @Override // X.AnonymousClass0431
                public final void LIZIZ() {
                }

                @Override // X.AnonymousClass0431
                public final void LIZJ() {
                }

                @Override // X.AnonymousClass0431
                public final EnterCartParam LIZLLL() {
                    return null;
                }

                @Override // X.AnonymousClass0431
                public final void LJ() {
                }

                @Override // X.AnonymousClass0431
                public final View LJFF() {
                    return null;
                }

                @Override // X.AnonymousClass0431
                public final C043Y LJI() {
                    return null;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:105:0x0192  */
                /* JADX WARN: Removed duplicated region for block: B:114:0x01c4  */
                /* JADX WARN: Removed duplicated region for block: B:117:0x01d0  */
                /* JADX WARN: Removed duplicated region for block: B:130:0x01f6  */
                /* JADX WARN: Removed duplicated region for block: B:133:0x01ff  */
                /* JADX WARN: Removed duplicated region for block: B:147:0x024e  */
                /* JADX WARN: Removed duplicated region for block: B:150:0x0257  */
                /* JADX WARN: Removed duplicated region for block: B:151:0x0268 A[ADDED_TO_REGION, REMOVE] */
                /* JADX WARN: Removed duplicated region for block: B:152:0x026d  */
                /* JADX WARN: Removed duplicated region for block: B:153:0x0270  */
                /* JADX WARN: Removed duplicated region for block: B:154:0x0274  */
                /* JADX WARN: Removed duplicated region for block: B:155:0x0277  */
                /* JADX WARN: Removed duplicated region for block: B:159:0x027f A[PHI: r12
                  0x027f: PHI (r12v7 java.lang.Integer) = (r12v6 java.lang.Integer), (r12v10 java.lang.Integer) binds: [B:157:0x027b, B:45:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:169:0x02a5  */
                /* JADX WARN: Removed duplicated region for block: B:172:0x02d2  */
                /* JADX WARN: Removed duplicated region for block: B:208:0x036b  */
                /* JADX WARN: Removed duplicated region for block: B:211:0x0385  */
                /* JADX WARN: Removed duplicated region for block: B:219:0x0399  */
                /* JADX WARN: Removed duplicated region for block: B:222:0x03a4  */
                /* JADX WARN: Removed duplicated region for block: B:225:0x03b6  */
                /* JADX WARN: Removed duplicated region for block: B:228:0x03cd  */
                /* JADX WARN: Removed duplicated region for block: B:230:0x03d1  */
                /* JADX WARN: Removed duplicated region for block: B:239:0x03ef  */
                /* JADX WARN: Removed duplicated region for block: B:242:0x03f9  */
                /* JADX WARN: Removed duplicated region for block: B:316:0x0516  */
                /* JADX WARN: Removed duplicated region for block: B:317:0x0519  */
                /* JADX WARN: Removed duplicated region for block: B:318:0x051c  */
                /* JADX WARN: Removed duplicated region for block: B:319:0x051f  */
                /* JADX WARN: Removed duplicated region for block: B:320:0x0522  */
                /* JADX WARN: Removed duplicated region for block: B:321:0x0526  */
                /* JADX WARN: Removed duplicated region for block: B:322:0x0529  */
                /* JADX WARN: Removed duplicated region for block: B:325:0x052e A[PHI: r10
                  0x052e: PHI (r10v1 java.lang.String) = (r10v0 java.lang.String), (r10v3 java.lang.String) binds: [B:323:0x052a, B:218:0x0397] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:326:0x0531  */
                /* JADX WARN: Removed duplicated region for block: B:327:0x0535  */
                /* JADX WARN: Removed duplicated region for block: B:331:0x053e A[PHI: r12
                  0x053e: PHI (r12v1 java.lang.Integer) = (r12v0 java.lang.Integer), (r12v3 java.lang.Integer) binds: [B:329:0x053a, B:204:0x0357] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:49:0x008b  */
                /* JADX WARN: Removed duplicated region for block: B:52:0x009f  */
                /* JADX WARN: Removed duplicated region for block: B:55:0x00b1  */
                /* JADX WARN: Removed duplicated region for block: B:70:0x00e8  */
                /* JADX WARN: Removed duplicated region for block: B:72:0x00ef  */
                /* JADX WARN: Removed duplicated region for block: B:75:0x00fd  */
                /* JADX WARN: Removed duplicated region for block: B:78:0x0108  */
                /* JADX WARN: Removed duplicated region for block: B:82:0x0114  */
                /* JADX WARN: Removed duplicated region for block: B:85:0x0126  */
                /* JADX WARN: Removed duplicated region for block: B:87:0x0135  */
                /* JADX WARN: Removed duplicated region for block: B:89:0x013c  */
                /* JADX WARN: Removed duplicated region for block: B:91:0x014b  */
                /* JADX WARN: Removed duplicated region for block: B:93:0x015a  */
                /* JADX WARN: Removed duplicated region for block: B:95:0x0169  */
                /* JADX WARN: Removed duplicated region for block: B:97:0x0170  */
                @Override // X.AnonymousClass0431
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ(X.C10372043u r65) {
                    /*
                        Method dump skipped, instruction units count: 1373
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0454.LIZ(X.043u):void");
                }
            }, false, null);
            objLIZ = c23260099m.LIZ();
            if (objLIZ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("PdpViewModel@6cb1.addCart$1$addToCart$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("PdpViewModel@6cb1.addCart$1$addToCart$1");
        return objLIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
