package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.k;
import com.google.gson.n;
import com.lynx.react.bridge.PiperData;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0wDO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1772080wDO {
    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(InterfaceC606320NqI interfaceC606320NqI, AbstractC1772230wDd abstractC1772230wDd) {
        Response<?> response;
        String str;
        Object objFromJson;
        if (interfaceC606320NqI == null) {
            C599820Nfo.LIZ.getClass();
            C599820Nfo.LIZIZ();
            return;
        }
        if (abstractC1772230wDd instanceof C1772140wDU) {
            response = ((C1772140wDU) abstractC1772230wDd).LIZJ;
        } else if (abstractC1772230wDd instanceof C1772150wDV) {
            response = ((C1772150wDV) abstractC1772230wDd).LIZJ;
        } else {
            return;
        }
        String str2 = abstractC1772230wDd.LIZ.LJFF;
        int iHashCode = str2.hashCode();
        if (iHashCode != -819744335) {
            if (iHashCode != -702842773) {
                if (iHashCode == 97322682) {
                    str = "fetch";
                    if (!str2.equals("fetch")) {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                str = "first_fetch";
                if (!str2.equals("first_fetch")) {
                    return;
                }
            }
        } else {
            str = "error_retry";
            if (!str2.equals("error_retry")) {
                return;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (response != null) {
            T t = response.data;
            if (t != 0) {
                if (C1773900wGK.LIZ() && C1773900wGK.LIZLLL().getEnableShopMallHomepageApiPiperData()) {
                    objFromJson = PiperData.LIZIZ(t.toString());
                } else if (t instanceof n) {
                    objFromJson = GsonProtectorUtils.fromJson(C1772540wE8.LLILLL.getValue(), (k) t, (Class<Object>) Map.class);
                } else {
                    C01GW<Gson> c01gw = C1772540wE8.LLILLL;
                    objFromJson = GsonProtectorUtils.fromJson(c01gw.getValue(), GsonProtectorUtils.toJsonTree(c01gw.getValue(), t), (Class<Object>) Map.class);
                }
                linkedHashMap.put("data", objFromJson);
            }
            String str3 = response.message;
            if (str3 != null) {
                linkedHashMap.put("message", str3);
            }
            linkedHashMap.put("code", Integer.valueOf(response.code));
            Integer num = response.chunkIndex;
            if (num != null) {
                linkedHashMap.put("chunk_index", Integer.valueOf(num.intValue()));
            }
        }
        C1771590wCb c1771590wCb = abstractC1772230wDd.LIZ;
        String str4 = c1771590wCb.LIZ;
        if (str4 == null) {
            str4 = "";
        }
        interfaceC606320NqI.LIZLLL("ec_mix_mall_homepage_api_success", C2097608Jq.LJIIJ(new Pair("from", str), new Pair("data", linkedHashMap), new Pair("tab_id", str4), new Pair("reason", c1771590wCb.LJI)), null, true);
    }

    public static void LIZJ(InterfaceC606320NqI interfaceC606320NqI, AbstractC1772170wDX abstractC1772170wDX) {
        if (interfaceC606320NqI == null) {
            C599820Nfo.LIZ.getClass();
            C599820Nfo.LIZIZ();
        } else {
            if (!(abstractC1772170wDX instanceof C1772160wDW)) {
                return;
            }
            interfaceC606320NqI.LIZLLL("ec_mix_mall_refresh_state_change", C2097608Jq.LJIIJ(new Pair("state", 0), new Pair("reason", abstractC1772170wDX.LIZ.LJI)), null, false);
        }
    }

    public static void LIZIZ(InterfaceC606320NqI interfaceC606320NqI, AbstractC1772230wDd abstractC1772230wDd, boolean z, boolean z2) {
        int i;
        if (interfaceC606320NqI == null) {
            C599820Nfo.LIZ.getClass();
            C599820Nfo.LIZIZ();
            return;
        }
        if ((abstractC1772230wDd instanceof C1772140wDU) || (abstractC1772230wDd instanceof C1772150wDV) || (abstractC1772230wDd instanceof C1772200wDa)) {
            Boolean bool = Boolean.TRUE;
            if (bool != null) {
                bool.booleanValue();
                String str = abstractC1772230wDd.LIZ.LJFF;
                int iHashCode = str.hashCode();
                if (iHashCode != -819744335) {
                    if (iHashCode != -702842773) {
                        if (iHashCode != 97322682 || !str.equals("fetch")) {
                            return;
                        }
                    } else if (!str.equals("first_fetch")) {
                        return;
                    }
                } else if (!str.equals("error_retry")) {
                    return;
                }
                if (z) {
                    i = 1;
                } else if (z2) {
                    i = 3;
                } else {
                    i = 2;
                }
                interfaceC606320NqI.LIZLLL("ec_mix_mall_refresh_state_change", C2097608Jq.LJIIJ(new Pair("state", Integer.valueOf(i)), new Pair("reason", abstractC1772230wDd.LIZ.LJI)), null, false);
            }
        }
    }
}
