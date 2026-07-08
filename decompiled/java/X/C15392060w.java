package X;

import com.bytedance.ies.im.core.api.proxy.IIMCoreProxyService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.060w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15392060w {
    public static final C15392060w LIZ = new C15392060w();

    public static String LIZ(C869590Y9l c869590Y9l) {
        String str = c869590Y9l.getExt().get("a:auto_reply_latency");
        if (str == null) {
            return null;
        }
        if (a0.LJJJIL(str)) {
            return "";
        }
        try {
            Map map = (Map) C051M.LIZJ(str, new TypeToken<Map<String, ? extends String>>() { // from class: X.05ue
            }.getType());
            if (map == null) {
                return "";
            }
            String str2 = (String) map.get("query_server_message_id");
            if (str2 != null) {
                if (!(!a0.LJJJIL(str2))) {
                    str2 = null;
                }
                if (str2 != null) {
                    return str2;
                }
            }
            String str3 = (String) map.get("query_client_message_id");
            if (str3 != null) {
                if (!a0.LJJJIL(str3)) {
                    return str3;
                }
            }
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static String LIZIZ(C869590Y9l c869590Y9l) {
        C0YHX c0yhxLIZ;
        InterfaceC870590YDh interfaceC870590YDhLJIIJ;
        IIMCoreProxyService iIMCoreProxyService = (IIMCoreProxyService) PluggableExtentionKt.pluggableSpi$default(IIMCoreProxyService.class, false, false, false, 14, null);
        if (iIMCoreProxyService != null && (c0yhxLIZ = iIMCoreProxyService.LIZ(C0YM2.TIKTOK_SOCIAL_IM)) != null && (interfaceC870590YDhLJIIJ = c0yhxLIZ.LJIIJ()) != null) {
            return interfaceC870590YDhLJIIJ.LJFF(c869590Y9l.getUuid(), "ai_reply_message_id");
        }
        return null;
    }
}
