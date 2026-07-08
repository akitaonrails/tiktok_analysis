package X;

import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.s;
import com.ss.android.ugc.aweme.net.preload.PreloadExtraData;
import com.ss.android.ugc.aweme.poi.osp.preload.PoiOrderPrepareNetPreload;
import com.ss.android.ugc.aweme.poi.osp.repo.PoiOrderSubmitApi;
import com.ss.android.ugc.aweme.poi.osp.repo.model.BuySkuItem;
import com.ss.android.ugc.aweme.slash.data.SlashPage;
import com.ss.android.ugc.aweme.slash.data.SlashRequestParam;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KTypeProjection;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0gzg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.osp.preload.PoiOrderPrepareNetPreload$preload$1", f = "PoiOrderSubmitPreloadHandler.kt", l = {108}, m = "invokeSuspend")
public final class C1186980gzg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0X52<SlashPage>>, Object> {
    public int LL;
    public final /* synthetic */ Bundle LLILLJJLI;
    public final /* synthetic */ PoiOrderPrepareNetPreload LLILLL;
    public final /* synthetic */ Function1<Class<PoiOrderSubmitApi>, PoiOrderSubmitApi> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1186980gzg(Bundle bundle, PoiOrderPrepareNetPreload poiOrderPrepareNetPreload, Function1<? super Class<PoiOrderSubmitApi>, ? extends PoiOrderSubmitApi> function1, InterfaceC1364105Vn<? super C1186980gzg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bundle;
        this.LLILLL = poiOrderPrepareNetPreload;
        this.LLILZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1186980gzg(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0X52<SlashPage>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        String string;
        String string2;
        List<BuySkuItem> arrayList;
        String string3;
        String strJ3;
        Object orderPrepareSlashData = obj;
        C1C7U.LIZ("PoiOrderPrepareNetPreload@d646.preload$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        Object obj2 = null;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(orderPrepareSlashData);
            } else {
                C155000ia.LIZIZ(orderPrepareSlashData);
                Bundle bundle = this.LLILLJJLI;
                PoiOrderPrepareNetPreload poiOrderPrepareNetPreload = this.LLILLL;
                Function1<Class<PoiOrderSubmitApi>, PoiOrderSubmitApi> function1 = this.LLILZ;
                C1186990gzh c1186990gzh = new C1186990gzh();
                if (bundle != null) {
                    string = bundle.getString("poi_id");
                } else {
                    string = null;
                }
                if (bundle != null) {
                    string2 = bundle.getString("sku_list");
                } else {
                    string2 = null;
                }
                try {
                    Gson gsonLIZ = C2365509Or.LIZ();
                    C13JX c13jx = KTypeProjection.LIZJ;
                    C13JW c13jwLJII = C13LE.LJII(BuySkuItem.class);
                    c13jx.getClass();
                    Object objLJIIIIZZ = gsonLIZ.LJIIIIZZ(string2, C2371409Qy.LIZJ(C13LE.LJIIIIZZ(List.class, C13JX.LIZ(c13jwLJII))));
                    if (!(objLJIIIIZZ instanceof List)) {
                        objLJIIIIZZ = null;
                    }
                    arrayList = (List) objLJIIIIZZ;
                } catch (s e) {
                    TryCatchGuardChecker.doCheck(e);
                    arrayList = null;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                if (bundle == null) {
                    string3 = null;
                } else {
                    string3 = bundle.getString("sync_coupon_info");
                }
                JSONObject jSONObjectBuildPrepareOrderAttribute = poiOrderPrepareNetPreload.buildPrepareOrderAttribute(bundle);
                if (jSONObjectBuildPrepareOrderAttribute != null) {
                    strJ3 = C786410Ut5.J3(jSONObjectBuildPrepareOrderAttribute);
                } else {
                    strJ3 = null;
                }
                EnumC1187020gzk enumC1187020gzk = EnumC1187020gzk.INITIAL_FETCH;
                SlashRequestParam slashRequestParamLIZLLL = c1186990gzh.LIZLLL(string, arrayList, enumC1187020gzk, null, string3, strJ3, EnumC1187010gzj.DEFAULT, null);
                Map<String, Object> mapLIZJ = C1186990gzh.LIZJ(slashRequestParamLIZLLL);
                PoiOrderSubmitApi poiOrderSubmitApiInvoke = function1.invoke(PoiOrderSubmitApi.class);
                String strValueOf = String.valueOf(enumC1187020gzk.getCode());
                String strValueOf2 = String.valueOf(slashRequestParamLIZLLL.slashParam);
                String str = slashRequestParamLIZLLL.businessQueryParam.get("biz_params");
                PreloadExtraData preloadExtraDataBuildPreloadExtraData = poiOrderPrepareNetPreload.buildPreloadExtraData(bundle);
                this.LL = 1;
                orderPrepareSlashData = poiOrderSubmitApiInvoke.getOrderPrepareSlashData("poi_order_submit", strValueOf, "order", "prepare", strValueOf2, str, mapLIZJ, preloadExtraDataBuildPreloadExtraData, null, this);
                if (orderPrepareSlashData == objLJFF) {
                    C1C7U.LIZIZ("PoiOrderPrepareNetPreload@d646.preload$1");
                    return objLJFF;
                }
            }
            c098200Yq = (C0X52) orderPrepareSlashData;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj2 = c098200Yq;
        }
        C1C7U.LIZIZ("PoiOrderPrepareNetPreload@d646.preload$1");
        return obj2;
    }
}
