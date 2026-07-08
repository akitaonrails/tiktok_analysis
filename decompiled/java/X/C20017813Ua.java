package X;

import com.ss.android.ugc.aweme.ecommerce.fyp.affiliate.button.settings.EcButtonConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.13Ua, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20017813Ua {
    public final Map<String, Long> LIZ = new LinkedHashMap();
    public final Map<String, Integer> LIZIZ = new LinkedHashMap();

    public C20017813Ua() {
        Set<String> setKeySet;
        Map<String, EcButtonConfig> map = C20018213Ue.LIZ().configs;
        if (map == null || (setKeySet = map.keySet()) == null) {
            return;
        }
        for (String str : setKeySet) {
            Map<String, Long> map2 = this.LIZ;
            C13UY c13uy = C13UY.LIZ;
            map2.put(str, Long.valueOf(C13UY.LJIIIIZZ().getLong(C13UY.LJII(str, "key_last_show_time"), 0L)));
            this.LIZIZ.put(str, Integer.valueOf(C13UY.LJIIIIZZ().getInt(C13UY.LJII(str, "key_non_click_count"), 0)));
        }
    }
}
