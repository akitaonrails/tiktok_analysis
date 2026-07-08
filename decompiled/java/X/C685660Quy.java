package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.discover.model.FeedbackMultipleChoice;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.ss.android.ugc.aweme.search.middle.decoupling.basenonbiz.AbsDecouplingBridgeMethod;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Quy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C685660Quy extends AbsDecouplingBridgeMethod {
    public final C663340Q0e LIZJ;

    @Override // X.InterfaceC686000QvW
    public final String getName() {
        return "openSingleFeedbackSheet";
    }

    public C685660Quy(C1051660dTQ c1051660dTQ) {
        this.LIZJ = new C663340Q0e(c1051660dTQ, "openSingleFeedbackSheet", EnumC663360Q0g.STABLE);
    }

    public static final List LIZLLL(String str, JSONObject jSONObject) {
        Object c098200Yq;
        boolean z;
        List list = null;
        Object obj = null;
        if (Intrinsics.LJFF(str, "e_com")) {
            try {
                c098200Yq = (List) C7740030o.LIZ().getGson().LJIIIIZZ(jSONObject.optString("multiple_choices"), new TypeToken<List<FeedbackMultipleChoice>>() { // from class: X.0QvG
                }.getType());
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                obj = c098200Yq;
            }
            list = (List) obj;
        }
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            boolean z2 = C0Q9J.LIZ;
            return C684120QsU.LIZLLL(str);
        }
        return list;
    }

    public static final String LJ(C683220Qr2 c683220Qr2, String str) {
        Map<String, String> map;
        String str2;
        if (c683220Qr2 == null || (map = c683220Qr2.LJ) == null || (str2 = map.get(str)) == null) {
            return "";
        }
        return str2;
    }

    public static final void LJFF(View view, JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("extra_params");
        if (jSONObjectOptJSONObject != null) {
            try {
                String strOptString = jSONObjectOptJSONObject.optString("item_id");
                int iOptInt = jSONObjectOptJSONObject.optInt("biz_type");
                if (C123100dR.LIZ(strOptString)) {
                    ((IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class)).LJJIII(view, strOptString, Integer.valueOf(iOptInt));
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    public static final void LJII(C683220Qr2 c683220Qr2, FeedbackMultipleChoice feedbackMultipleChoice, Context context) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, String> map = c683220Qr2.LJ;
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        if (feedbackMultipleChoice != null) {
            linkedHashMap.put("click_reason", feedbackMultipleChoice.getKey());
        }
        C20684815ws.LJIILLIIL("search_result_feedback_submit", linkedHashMap);
        String string = context.getResources().getString(2131832595);
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
            c1389890mGx.LJIIJ(string);
            c1389890mGx.LIZLLL(3000L);
            c1389890mGx.LJIIJJI();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c7 A[Catch: Exception -> 0x01e9, TryCatch #1 {Exception -> 0x01e9, blocks: (B:5:0x001b, B:7:0x0042, B:8:0x0059, B:10:0x007c, B:11:0x0082, B:21:0x00a9, B:24:0x00b0, B:35:0x00db, B:76:0x01c0, B:80:0x01c7, B:81:0x01de, B:34:0x00d7, B:20:0x009e, B:25:0x00ba, B:27:0x00c0, B:29:0x00c8, B:14:0x008b, B:16:0x0091, B:17:0x0097), top: B:90:0x001b, inners: #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0102 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.search.middle.decoupling.basenonbiz.AbsDecouplingBridgeMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod r35, org.json.JSONObject r36, X.InterfaceC1019840ce6 r37) {
        /*
            Method dump skipped, instruction units count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C685660Quy.LIZIZ(com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, org.json.JSONObject, X.0ce6):void");
    }

    public final void LJI(C1537480q70 c1537480q70, C683220Qr2 c683220Qr2, FeedbackMultipleChoice feedbackMultipleChoice) {
        String key;
        if (c1537480q70 != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("search_id", LJ(c683220Qr2, "search_id"));
                jSONObject.put("product_id", LJ(c683220Qr2, "product_id"));
                jSONObject.put("rank", CastIntegerProtector.parseInt(LJ(c683220Qr2, "rank")));
                if (feedbackMultipleChoice != null) {
                    jSONObject.put("select_choice", C1741890vQh.LJIIIIZZ(feedbackMultipleChoice));
                }
                c1537480q70.LJJIIJZLJL(jSONObject, "search_feedback_success");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return;
            }
        }
        if (Intrinsics.LJFF(c683220Qr2.LIZ, EnumC682590Qq1.E_COM.getValue())) {
            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("logParams: ");
            sbLIZ.append(c683220Qr2.LJ);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c2341109Fh.getClass();
            C2341109Fh.LIZ(strLIZIZ);
            IEcomSearchService iEcomSearchService = (IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class);
            String strLJ = LJ(c683220Qr2, "product_id");
            int type = EnumC685980QvU.PRODUCT.getType();
            if (feedbackMultipleChoice != null) {
                key = feedbackMultipleChoice.getKey();
            } else {
                key = null;
            }
            iEcomSearchService.LJJJJZI(new C0QYR(strLJ, type, key, c683220Qr2.LJIIL, Integer.valueOf(EnumC2006007tS.LOW_SUPPLIER_RECOMMEND_PROFILE_PAGE_STORE_GUIDANCE.getType()), c683220Qr2.LIZIZ));
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
    }
}
