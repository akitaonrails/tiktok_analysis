package X;

import Y.ARunnableS119S0100000_19;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.ecommerce.action.EcommerceActionDto;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.jvm.internal.AwS6S0700000_23;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0op3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1487910op3 {
    public final C1487950op7 LIZ;
    public final InterfaceC1487900op2 LIZIZ;
    public final Lifecycle LIZJ;
    public final C21328418dO LIZLLL = new C21328418dO(new C21329018dU((Object) null));
    public final C01GW LJ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(35));

    public C1487910op3(C1487950op7 c1487950op7, InterfaceC1487900op2 interfaceC1487900op2, Lifecycle lifecycle) {
        this.LIZ = c1487950op7;
        this.LIZIZ = interfaceC1487900op2;
        this.LIZJ = lifecycle;
    }

    public static Map LIZJ(EcommerceActionDto ecommerceActionDto, Map map, Map map2) {
        String str;
        Map map3;
        if (map != null && !map.isEmpty() && (str = ecommerceActionDto.returnKey) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Object obj = map2.get("__actionContext");
            if ((obj instanceof Map) && (map3 = (Map) obj) != null) {
                linkedHashMap.putAll(map3);
            }
            linkedHashMap.put(str, map);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(map2);
            linkedHashMap2.put("__actionContext", linkedHashMap);
            return linkedHashMap2;
        }
        return map2;
    }

    public final void LIZIZ(String str, String str2, int i, String str3, C1487940op6 c1487940op6) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", str);
        if (str2 != null) {
            jSONObject.put("action_name", str2);
        }
        jSONObject.put("error_code", i);
        jSONObject.put("error_msg", str3);
        jSONObject.put("source", c1487940op6.LIZIZ);
        jSONObject.put("biz", this.LIZ.LIZ);
        C1018703yb.LJFF("tiktokec_rd_action_chain_sdk_error", jSONObject);
    }

    public final void LIZ(Object obj, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, Map<String, ? extends List<EcommerceActionDto>> map3, Object obj2, C1487940op6 c1487940op6) throws JSONException {
        List<EcommerceActionDto> list;
        if (obj instanceof String) {
            list = map3.get(obj);
            if (list == null) {
                String str = (String) obj;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("action chain not found for ");
                sbLIZ.append(str);
                LIZIZ(str, null, -10000, C2188811AlT.LIZIZ(sbLIZ), c1487940op6);
                return;
            }
        } else if (!(obj instanceof List) || (list = (List) obj) == null) {
            return;
        }
        int i = 0;
        for (EcommerceActionDto ecommerceActionDto : list) {
            int i2 = i + 1;
            if (i >= 0) {
                AwS6S0700000_23 awS6S0700000_23 = new AwS6S0700000_23(c1487940op6, this, ecommerceActionDto, obj2, map2, map, map3, 0);
                if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                    awS6S0700000_23.invoke();
                } else {
                    C786410Ut5.LJJZZIII((Handler) this.LJ.getValue(), new ARunnableS119S0100000_19((Object) awS6S0700000_23, 11));
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }
}
