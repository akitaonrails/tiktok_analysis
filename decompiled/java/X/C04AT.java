package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.TryOnData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.04AT, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04AT {
    public static final String LIZ(Map<String, ? extends Object> map) {
        Object obj;
        String string;
        if (map == null || (obj = map.get("btm_d")) == null || (string = obj.toString()) == null || !(!a0.LJJJIL(string))) {
            return null;
        }
        return string;
    }

    public static final Map<String, Object> LIZIZ(TryOnData tryOnData) {
        Uri uri;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        boolean z;
        String str = tryOnData.schema;
        if (str != null && (uri = UriProtector.parse(str)) != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "da_info")) != null) {
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
            }
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                try {
                    HashMap map = new HashMap();
                    map.putAll(C051S.LIZJ(new JSONObject(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)));
                    return map;
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1019103yf.LIZ(EnumC1014603xw.UNKNOWN_ERR, e, null);
                }
            }
        }
        return null;
    }

    public static final Map LIZJ(String str, Map map) {
        Object obj;
        String string;
        if (map != null && (obj = map.get("btm")) != null && (string = obj.toString()) != null && (!a0.LJJJIL(string))) {
            if (str == null) {
                str = "d49471";
            }
            ArrayList arrayList = new ArrayList(a0.LJJLIIIJ(string, new char[]{'.'}, false, 0, 6));
            Iterator it2 = arrayList.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                String str2 = (String) it2.next();
                if (a0.LJJLIIIJJIZ(str2, 'd') && str2.length() > 1) {
                    if (i >= 0) {
                        ListProtector.set(arrayList, i, str);
                        str = C13LP.LJJLIIIJ(arrayList, e3.d, null, null, 0, null, null, 62);
                    }
                } else {
                    i++;
                }
            }
            if (!arrayList.isEmpty()) {
                str = C13LP.LJJLIIIJ(C13LP.LJLILLLLZI(str, arrayList), e3.d, null, null, 0, null, null, 62);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.put("btm", str);
            return linkedHashMap;
        }
        return map;
    }
}
