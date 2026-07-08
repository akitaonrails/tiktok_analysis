package X;

import com.bytedance.mt.protector.impl.UriProtector;
import java.util.HashMap;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0uRi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1704080uRi {
    public static final String LIZ(String str) {
        Map map = (Map) C1704070uRh.LJFF.getValue();
        for (Object obj : map.keySet()) {
            if (a0.LJJIIZI(str, (String) obj, false)) {
                if (obj == null) {
                    return null;
                }
                return (String) map.get(obj);
            }
        }
        return null;
    }

    public static final String LIZIZ(String str) {
        HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(C1946007jm.LJ(str), "mall_extra_info"));
        String str2 = null;
        if (mapLJIIJ != null) {
            Object obj = mapLJIIJ.get("mall_landing_page");
            if (obj instanceof String) {
                str2 = (String) obj;
            }
            String str3 = (String) ((Map) C1704070uRh.LJI.getValue()).get(str2);
            if (str3 != null) {
                return str3;
            }
        }
        return str2;
    }
}
