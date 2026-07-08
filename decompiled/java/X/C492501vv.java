package X;

import com.bytedance.keva.Keva;
import java.util.Map;

/* JADX INFO: renamed from: X.01vv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C492501vv {
    public static final C492501vv LIZ = new C492501vv();

    public static Keva LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("rec_user_card_maf_filter_");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        return Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LIZ(long j) {
        Map<String, ?> all = LIZIZ().getAll();
        if ((all instanceof Map) && all != null) {
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                String key = entry.getKey();
                if (((Number) entry.getValue()).longValue() < j) {
                    LIZ.getClass();
                    LIZIZ().erase(key);
                }
            }
        }
    }
}
