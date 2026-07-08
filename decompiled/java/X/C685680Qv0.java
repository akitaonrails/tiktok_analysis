package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.discover.model.FeedbackMultipleChoice;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Qv0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C685680Qv0 extends AbstractC685710Qv3 {
    public static List LIZJ(InterfaceC685700Qv2 interfaceC685700Qv2, String str) {
        Object c098200Yq;
        String string;
        boolean z;
        List list = null;
        Object obj = null;
        if (Intrinsics.LJFF(str, "e_com")) {
            try {
                Gson gson = C7740030o.LIZ().getGson();
                Object multipleChoices = interfaceC685700Qv2.getMultipleChoices();
                if (multipleChoices != null) {
                    string = multipleChoices.toString();
                } else {
                    string = null;
                }
                c098200Yq = (List) gson.LJIIIIZZ(string, new TypeToken<List<FeedbackMultipleChoice>>() { // from class: X.0QvD
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

    public static final String LIZLLL(C683220Qr2 c683220Qr2, String str) {
        Map<String, String> map;
        String str2;
        if (c683220Qr2 == null || (map = c683220Qr2.LJ) == null || (str2 = map.get(str)) == null) {
            return "";
        }
        return str2;
    }

    public static final void LJ(View view, JSONObject jSONObject) {
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

    public final void LJFF(C1537480q70 c1537480q70, C683220Qr2 c683220Qr2, FeedbackMultipleChoice feedbackMultipleChoice) {
        String key;
        if (c1537480q70 != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("search_id", LIZLLL(c683220Qr2, "search_id"));
                jSONObject.put("product_id", LIZLLL(c683220Qr2, "product_id"));
                jSONObject.put("rank", CastIntegerProtector.parseInt(LIZLLL(c683220Qr2, "rank")));
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
            String strLIZLLL = LIZLLL(c683220Qr2, "product_id");
            int type = EnumC685980QvU.PRODUCT.getType();
            if (feedbackMultipleChoice != null) {
                key = feedbackMultipleChoice.getKey();
            } else {
                key = null;
            }
            iEcomSearchService.LJJJJZI(new C0QYR(strLIZLLL, type, key, c683220Qr2.LJIIL, Integer.valueOf(EnumC2006007tS.LOW_SUPPLIER_RECOMMEND_PROFILE_PAGE_STORE_GUIDANCE.getType()), c683220Qr2.LIZIZ));
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x020d A[Catch: Exception -> 0x0239, TryCatch #3 {Exception -> 0x0239, blocks: (B:10:0x002f, B:14:0x003a, B:17:0x0046, B:19:0x0052, B:20:0x0056, B:22:0x005c, B:23:0x0073, B:25:0x008c, B:27:0x0094, B:28:0x009a, B:35:0x00c9, B:38:0x00d0, B:47:0x00fd, B:49:0x0119, B:50:0x011d, B:78:0x01b0, B:81:0x01b7, B:86:0x01c2, B:87:0x01c8, B:89:0x01d8, B:90:0x01dc, B:92:0x01e5, B:93:0x01eb, B:95:0x01f4, B:96:0x01f8, B:103:0x020d, B:104:0x0222, B:106:0x0228, B:107:0x022c, B:46:0x00f8, B:34:0x00be, B:39:0x00d8, B:41:0x00ed, B:32:0x00a6), top: B:121:0x002f, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0228 A[Catch: Exception -> 0x0239, TryCatch #3 {Exception -> 0x0239, blocks: (B:10:0x002f, B:14:0x003a, B:17:0x0046, B:19:0x0052, B:20:0x0056, B:22:0x005c, B:23:0x0073, B:25:0x008c, B:27:0x0094, B:28:0x009a, B:35:0x00c9, B:38:0x00d0, B:47:0x00fd, B:49:0x0119, B:50:0x011d, B:78:0x01b0, B:81:0x01b7, B:86:0x01c2, B:87:0x01c8, B:89:0x01d8, B:90:0x01dc, B:92:0x01e5, B:93:0x01eb, B:95:0x01f4, B:96:0x01f8, B:103:0x020d, B:104:0x0222, B:106:0x0228, B:107:0x022c, B:46:0x00f8, B:34:0x00be, B:39:0x00d8, B:41:0x00ed, B:32:0x00a6), top: B:121:0x002f, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b5  */
    @Override // X.AbstractC1549150qPp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel r32, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock r33, X.EnumC1063300dmC r34) {
        /*
            Method dump skipped, instruction units count: 586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C685680Qv0.handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock, X.0dmC):void");
    }
}
