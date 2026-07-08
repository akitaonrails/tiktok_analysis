package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.033p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7819033p {
    public static final C7819033p LIZ = new C7819033p();

    public static HashMap LIZ(OrderSubmitAssemViewModel orderSubmitAssemViewModel, String str) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Summary summary;
        HashMap map = new HashMap();
        map.put("previous_page", "order_submit");
        C1008603wy.LIZ(map, new Pair("enter_method", str));
        Pair[] pairArr = new Pair[1];
        HashMap<String, Object> map2 = orderSubmitAssemViewModel.LLLIL;
        Object obj5 = null;
        if (map2 != null) {
            obj = map2.get("source_page_type");
        } else {
            obj = null;
        }
        pairArr[0] = new Pair("source_page_type", obj);
        C1008603wy.LIZ(map, pairArr);
        Pair[] pairArr2 = new Pair[1];
        HashMap<String, Object> map3 = orderSubmitAssemViewModel.LLLIL;
        if (map3 != null) {
            obj2 = map3.get("entrance_form");
        } else {
            obj2 = null;
        }
        pairArr2[0] = new Pair("entrance_form", obj2);
        C1008603wy.LIZ(map, pairArr2);
        Pair[] pairArr3 = new Pair[1];
        HashMap<String, Object> map4 = orderSubmitAssemViewModel.LLLIL;
        if (map4 != null) {
            obj3 = map4.get("enter_from_info");
        } else {
            obj3 = null;
        }
        pairArr3[0] = new Pair("enter_from_info", obj3);
        C1008603wy.LIZ(map, pairArr3);
        Pair[] pairArr4 = new Pair[1];
        HashMap<String, Object> map5 = orderSubmitAssemViewModel.LLLIL;
        if (map5 != null) {
            obj4 = map5.get("product_id");
        } else {
            obj4 = null;
        }
        pairArr4[0] = new Pair("product_id", obj4);
        C1008603wy.LIZ(map, pairArr4);
        Pair[] pairArr5 = new Pair[1];
        HashMap<String, Object> map6 = orderSubmitAssemViewModel.LLLIL;
        if (map6 != null) {
            obj5 = map6.get("entrance_info");
        }
        pairArr5[0] = new Pair("entrance_info", obj5);
        C1008603wy.LIZ(map, pairArr5);
        C1008603wy.LIZ(map, new Pair("cart_item_id", orderSubmitAssemViewModel.uR2()));
        BillInfoData billInfoData = orderSubmitAssemViewModel.LLJJI;
        if (billInfoData != null && (summary = billInfoData.summary) != null) {
            C855703Vz.LIZJ(C720302rZ.LJ(summary), map);
        }
        map.put("start_click_time", String.valueOf(System.currentTimeMillis()));
        return map;
    }

    public static void LIZIZ(Context context, String str, HashMap map) {
        try {
            Uri.Builder builderBuildUpon = UriProtector.parse(str).buildUpon();
            builderBuildUpon.appendQueryParameter("trackParams", C1741890vQh.LJIIIIZZ(map));
            SmartRouter.buildRoute(context, builderBuildUpon.toString()).open();
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
