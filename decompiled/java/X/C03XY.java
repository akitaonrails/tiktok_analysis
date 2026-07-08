package X;

import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.base.addon.dto.GetAddonPanelLayoutRequest;
import com.ss.android.ugc.aweme.ecommerce.base.addon.dto.GetRecommendDataRequest;
import com.ss.android.ugc.aweme.ecommerce.base.addon.dto.ProductInfoMeta;
import com.ss.android.ugc.aweme.ecommerce.core.ab.PdpAddonOptModel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03XY, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.addon.PdpAddOnPanelHelper$requestAddOnPanel$1", f = "PdpAddOnPanelHelper.kt", l = {107}, m = "invokeSuspend")
public final class C03XY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ GetAddonPanelLayoutRequest LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03XY(GetAddonPanelLayoutRequest getAddonPanelLayoutRequest, InterfaceC1364105Vn<? super C03XY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = getAddonPanelLayoutRequest;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C03XY c03xy = new C03XY(this.LLILZ, interfaceC1364105Vn);
        c03xy.LLILLL = obj;
        return c03xy;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wkLIZ;
        String str;
        ProductInfoMeta productInfoMeta;
        Object obj2;
        Object objLIZIZ = obj;
        C1C7U.LIZ("PdpAddOnPanelHelper@3d3.requestAddOnPanel$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                Object obj3 = this.LL;
                interfaceC497601wkLIZ = (InterfaceC497601wk) this.LLILLL;
                C155000ia.LIZIZ(objLIZIZ);
                obj2 = obj3;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZIZ);
            interfaceC497601wkLIZ = (InterfaceC497601wk) this.LLILLL;
            List<ProductInfoMeta> list = this.LLILZ.productInfoList;
            if (list != null && (productInfoMeta = (ProductInfoMeta) C13LP.LJJJLL(list)) != null) {
                str = productInfoMeta.pId;
            } else {
                str = null;
            }
            C858603Xc c858603Xc = C858603Xc.LIZ;
            this.LLILLL = interfaceC497601wkLIZ;
            this.LL = str;
            this.LLILLJJLI = 1;
            c858603Xc.getClass();
            objLIZIZ = C858603Xc.LIZIZ(str, this);
            obj2 = str;
            if (objLIZIZ == objLJFF) {
                C1C7U.LIZIZ("PdpAddOnPanelHelper@3d3.requestAddOnPanel$1");
                return objLJFF;
            }
        }
        if (objLIZIZ == null) {
            C858603Xc c858603Xc2 = C858603Xc.LIZ;
            GetAddonPanelLayoutRequest getAddonPanelLayoutRequest = this.LLILZ;
            List<ProductInfoMeta> list2 = getAddonPanelLayoutRequest.productInfoList;
            String str2 = getAddonPanelLayoutRequest.pageContext.prevPage;
            GetRecommendDataRequest getRecommendDataRequest = new GetRecommendDataRequest(list2, "pdp_add_on_page", str2, str2, getAddonPanelLayoutRequest.sourceInfo, 0, "", 18, true, getAddonPanelLayoutRequest.winnerItemList);
            c858603Xc2.getClass();
            if (obj2 != null && C839203Pq.LIZ().pdpSwitch) {
                C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
                PdpAddonOptModel pdpAddonOptModel = C858403Xa.LIZ;
                PdpAddonOptModel pdpAddonOptModel2 = (PdpAddonOptModel) c0c64LJIILLIIL.LJJII(PdpAddonOptModel.class, pdpAddonOptModel, "enable_pdp_addon_prefetch", true);
                if (pdpAddonOptModel2 != null) {
                    pdpAddonOptModel = pdpAddonOptModel2;
                }
                if (pdpAddonOptModel.enable) {
                    Map<String, AnonymousClass0957<n>> map = C858603Xc.LIZJ;
                    LinkedHashMap linkedHashMap = (LinkedHashMap) map;
                    C09AE c09ae = (C09AE) linkedHashMap.get(obj2);
                    if (c09ae != null && c09ae.isActive()) {
                        C09AE c09ae2 = (C09AE) linkedHashMap.get(obj2);
                        if (c09ae2 != null) {
                            c09ae2.LIZIZ(null);
                        }
                        map.put((String) obj2, null);
                    }
                    if (interfaceC497601wkLIZ == null) {
                        interfaceC497601wkLIZ = C2296808zG.LIZ(C0PEM.LIZJ);
                    }
                    map.put((String) obj2, C23250099c.LIZIZ(interfaceC497601wkLIZ, null, null, new C03XZ(getRecommendDataRequest, null), 3));
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PdpAddOnPanelHelper@3d3.requestAddOnPanel$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
