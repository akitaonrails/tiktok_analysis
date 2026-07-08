package X;

import android.view.View;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.ability.ISearchSuggestSubPageAbility;
import com.ss.android.ugc.aweme.search.ecommerce.EcomPersonalizedToastAbility;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS254S0300000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Qro, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C683700Qro extends AbstractC683710Qrp {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        View view;
        InterfaceC683720Qrq interfaceC683720Qrq = (InterfaceC683720Qrq) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            view = interfaceC634840OvC.getView();
        } else {
            view = null;
        }
        Map<String, Object> logParams = interfaceC683720Qrq.getLogParams();
        C683790Qrx c683790Qrx = EnumC683800Qry.Companion;
        String consentName = interfaceC683720Qrq.getConsentName();
        c683790Qrx.getClass();
        EnumC683800Qry enumC683800QryLIZ = C683790Qrx.LIZ(consentName);
        if (enumC683800QryLIZ != null) {
            if (logParams == null) {
                logParams = new LinkedHashMap<>();
            }
            C683760Qru.LIZJ(null, enumC683800QryLIZ, logParams, new AwS254S0300000_10(this, interfaceC683720Qrq, view, 16), new AwS254S0300000_10(this, interfaceC683720Qrq, view, 17), false);
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "consent name invalid", null, 4);
    }

    public static void LIZJ(InterfaceC683720Qrq interfaceC683720Qrq, String str, View view, EnumC1876780ywG enumC1876780ywG) {
        int i;
        int i2;
        if (Intrinsics.LJFF(interfaceC683720Qrq.getScene(), "common")) {
            String consentName = interfaceC683720Qrq.getConsentName();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("value", str);
            C1548820qPI.LIZIZ(new C397901gf(System.currentTimeMillis(), new C1323820kYO(jSONObject), consentName));
            return;
        }
        if (!Intrinsics.LJFF(interfaceC683720Qrq.getScene(), "ecom_search_middle_page") || view == null) {
            return;
        }
        ISearchSuggestSubPageAbility iSearchSuggestSubPageAbility = (ISearchSuggestSubPageAbility) C1558520qew.LIZ(C1558360qeg.LJ(view, null), ISearchSuggestSubPageAbility.class, null);
        if (iSearchSuggestSubPageAbility != null) {
            Pair[] pairArr = new Pair[1];
            if (enumC1876780ywG == EnumC1876780ywG.REJECT) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            pairArr[0] = new Pair("isNonPersonalized", Integer.valueOf(i2));
            iSearchSuggestSubPageAbility.HF2(C2097608Jq.LJIIJ(pairArr));
        }
        EcomPersonalizedToastAbility ecomPersonalizedToastAbility = (EcomPersonalizedToastAbility) C1558520qew.LIZ(C1558360qeg.LJ(view, null), EcomPersonalizedToastAbility.class, null);
        if (ecomPersonalizedToastAbility == null) {
            return;
        }
        if (enumC1876780ywG == EnumC1876780ywG.REJECT) {
            i = 2131839222;
        } else {
            i = 2131839223;
        }
        ecomPersonalizedToastAbility.lU(C1383370m6R.LJIIJ(i), C2097608Jq.LJIIJ(new Pair("enter_from", "goods_search_blankpage")), new AwS589S0100000_10(view, 461));
    }
}
