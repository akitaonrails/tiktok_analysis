package X;

import com.ss.android.ugc.aweme.ecommerce.fyp.affiliate.button.settings.EcButtonConfig;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.13UZ, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13UZ {
    public final Map<String, Long> LIZ = new LinkedHashMap();
    public final Map<String, Integer> LIZIZ = new LinkedHashMap();
    public final Map<String, List<Long>> LIZJ = new LinkedHashMap();

    public C13UZ() {
        Set<String> setKeySet;
        Map<String, EcButtonConfig> map = C20018213Ue.LIZ().configs;
        if (map == null || (setKeySet = map.keySet()) == null) {
            return;
        }
        for (String str : setKeySet) {
            Map<String, Long> map2 = this.LIZ;
            C13UY c13uy = C13UY.LIZ;
            map2.put(str, Long.valueOf(C13UY.LJIIIIZZ().getLong(C13UY.LJII(str, "key_last_show_time"), 0L)));
            LIZ(str);
            this.LIZIZ.put(str, Integer.valueOf(C13UY.LJIIIIZZ().getInt(C13UY.LJII(str, "key_show_count"), 0)));
        }
    }

    public final void LIZ(String str) {
        long jLongValue;
        Long l = (Long) ((LinkedHashMap) this.LIZ).get(str);
        if (l != null) {
            jLongValue = l.longValue();
            if (jLongValue <= 0) {
                return;
            }
        } else {
            jLongValue = Long.MAX_VALUE;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long time = calendar.getTime().getTime();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(11, 23);
        calendar2.set(12, 59);
        calendar2.set(13, 59);
        calendar2.set(14, 999);
        long time2 = calendar2.getTime().getTime();
        if (jLongValue >= time && jLongValue <= time2) {
            return;
        }
        this.LIZIZ.put(str, 0);
        C13UY c13uy = C13UY.LIZ;
        C13UY.LJIIIIZZ().storeInt(C13UY.LJII(str, "key_show_count"), 0);
    }
}
