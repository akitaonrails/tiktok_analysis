package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.text.u;

/* JADX INFO: renamed from: X.00x4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C244800x4 {
    public static final C244800x4 LIZ = new C244800x4();
    public static final Map<String, String> LIZIZ;

    static {
        Map<String, String> map = C00HI.LIZ;
        LIZIZ = (Map) C821960WMg.LIZ(Map.class, "pns_web_url_modifier", C00HI.LIZ);
    }

    public static Pair LIZ(String str) {
        String host;
        Map<String, String> map;
        String strLJJIFFI;
        if (str == null) {
            return new Pair(Boolean.FALSE, str);
        }
        try {
            host = UriProtector.parse(str).getHost();
            if (host == null) {
                host = "";
            }
            map = LIZIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        if (map.containsKey(host)) {
            Boolean bool = Boolean.TRUE;
            String str2 = map.get(host);
            if (str2 != null) {
                strLJJIFFI = u.LJJIFFI(str, host, str2, false);
            } else {
                strLJJIFFI = null;
            }
            return new Pair(bool, strLJJIFFI);
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return new Pair(Boolean.FALSE, str);
    }
}
