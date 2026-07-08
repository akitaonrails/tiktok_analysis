package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.JsonRpcContentDto;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.UcpMcpResponseDto;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.UniversalProductDto;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0D15, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D15 {
    public static String LIZIZ(String str) {
        Object c098200Yq;
        String string = a0.LJLIIIL(str).toString();
        if (a0.LJJJIL(string)) {
            return "";
        }
        try {
            c098200Yq = URLDecoder.decode(string, StandardCharsets.UTF_8.name());
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Object obj = string;
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        String str2 = (String) obj;
        if (!u.LJJIIJZLJL(str2, "gid://", false)) {
            return "gid://shopify/Product/".concat(str2);
        }
        return str2;
    }

    public static UniversalProductDto LIZJ(List list) {
        UniversalProductDto universalProductDto;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i >= 0) {
                String str = ((JsonRpcContentDto) obj).text;
                if (str != null && (!a0.LJJJIL(str))) {
                    try {
                        UcpMcpResponseDto ucpMcpResponseDto = (UcpMcpResponseDto) C051K.LIZIZ(str, UcpMcpResponseDto.class);
                        if (ucpMcpResponseDto != null && (universalProductDto = ucpMcpResponseDto.product) != null) {
                            return universalProductDto;
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return null;
    }

    public static Map LIZ(String str, Map map, boolean z) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(C2097608Jq.LJIIIIZZ(new Pair("name", a0.LJJJJZ("option.", (String) entry.getKey())), new Pair("label", entry.getValue())));
        }
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair(FollowStatusChangeMethod.PARAM_UID, str), new Pair("context", C2097908Jt.LIZJ(new Pair("currency", C0D48.LIZ()))));
        if (z || (!arrayList.isEmpty())) {
            mapLJIIJ.put("selected", arrayList);
        }
        return mapLJIIJ;
    }
}
