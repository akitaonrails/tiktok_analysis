package X;

import com.ss.android.ugc.aweme.ecommerce.mall.MallServiceManager;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IShopIconService;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0Qxr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.ecommerce.bubble.EcSearchQueryCollector$triggerBubble$1", f = "EcSearchQueryCollector.kt", l = {}, m = "invokeSuspend")
public final class C687450Qxr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C687450Qxr(InterfaceC1364105Vn<? super C687450Qxr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C687450Qxr(interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        List<String> list;
        C1C7U.LIZ("EcSearchQueryCollector@7b02.triggerBubble$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IShopIconService iShopIconServiceLIZ = MallServiceManager.LIZIZ().LIZ();
        if (iShopIconServiceLIZ != null) {
            EnumC1768950w8L enumC1768950w8L = EnumC1768950w8L.GENERAL_SEARCH;
            JSONObject jSONObject = new JSONObject();
            C0P7V c0p7v = C0PBS.LIZIZ;
            String strLIZIZ = e3.e;
            if (c0p7v != null && (list = c0p7v.LIZJ) != null) {
                for (String str : list) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(strLIZIZ);
                    sbLIZ.append(',');
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(strLIZIZ2);
                    sbLIZ2.append('\"');
                    sbLIZ2.append(str);
                    sbLIZ2.append('\"');
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                }
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(strLIZIZ);
            sbLIZ3.append(']');
            jSONObject.put("after_search_query_list", a0.LJJJJZI(1, 2, C2188811AlT.LIZIZ(sbLIZ3)).toString());
            iShopIconServiceLIZ.Pv(enumC1768950w8L, new C1768850w8B(C786410Ut5.J3(jSONObject), null, null, null, 14), null);
        }
        C0PBS.LIZIZ = null;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcSearchQueryCollector@7b02.triggerBubble$1");
        return unit;
    }
}
