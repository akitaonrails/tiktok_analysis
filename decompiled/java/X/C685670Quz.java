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

/* JADX INFO: renamed from: X.0Quz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C685670Quz extends AbstractC685720Qv4 {
    public static List LIZJ(InterfaceC685740Qv6 interfaceC685740Qv6, String str) {
        Object c098200Yq;
        String string;
        boolean z;
        List list = null;
        Object obj = null;
        if (Intrinsics.LJFF(str, "e_com")) {
            try {
                Gson gson = C7740030o.LIZ().getGson();
                Object multipleChoices = interfaceC685740Qv6.getMultipleChoices();
                if (multipleChoices == null || (string = multipleChoices.toString()) == null) {
                    string = "";
                }
                c098200Yq = (List) gson.LJIIIIZZ(string, new TypeToken<List<FeedbackMultipleChoice>>() { // from class: X.0QvE
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

    /* JADX WARN: Removed duplicated region for block: B:131:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02ab A[Catch: Exception -> 0x02db, TryCatch #4 {Exception -> 0x02db, blocks: (B:129:0x029f, B:133:0x02ab, B:134:0x02c0, B:136:0x02c6, B:137:0x02ca), top: B:157:0x016c }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02c6 A[Catch: Exception -> 0x02db, TryCatch #4 {Exception -> 0x02db, blocks: (B:129:0x029f, B:133:0x02ab, B:134:0x02c0, B:136:0x02c6, B:137:0x02ca), top: B:157:0x016c }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x016e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0161 A[Catch: Exception -> 0x02df, TryCatch #1 {Exception -> 0x02df, blocks: (B:48:0x00f2, B:51:0x00f9, B:65:0x0130, B:66:0x0138, B:68:0x0161, B:69:0x0165, B:110:0x0248, B:115:0x0253, B:116:0x0259, B:118:0x0272, B:119:0x0276, B:121:0x027f, B:122:0x0285, B:124:0x028e, B:125:0x0292, B:107:0x0241, B:61:0x0127, B:47:0x00e7, B:45:0x00cd, B:52:0x00fb, B:54:0x0110, B:56:0x0118), top: B:151:0x00cd, inners: #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x016a  */
    @Override // X.AbstractC1549150qPp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel r39, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock r40, X.EnumC1063300dmC r41) {
        /*
            Method dump skipped, instruction units count: 754
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C685670Quz.handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock, X.0dmC):void");
    }
}
