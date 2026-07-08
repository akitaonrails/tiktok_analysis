package X;

import android.util.LruCache;
import com.ss.android.ugc.aweme.settings.LandPageGeckoOptModel;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0dBf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1040650dBf {
    public final Map<String, C1040640dBe> LIZ = new LinkedHashMap();
    public final LruCache<String, C1040640dBe> LIZIZ = new LruCache<>(((LandPageGeckoOptModel) C1040670dBh.LIZIZ.getValue()).geckoLRUCacheCount);

    public final C1040640dBe LIZ(String str) {
        if (((LandPageGeckoOptModel) C1040670dBh.LIZIZ.getValue()).enableGeckoLRUOptimization) {
            return this.LIZIZ.get(str);
        }
        return (C1040640dBe) ((LinkedHashMap) this.LIZ).get(str);
    }

    public final C1040640dBe LIZIZ(String str) {
        if (((LandPageGeckoOptModel) C1040670dBh.LIZIZ.getValue()).enableGeckoLRUOptimization) {
            C1040640dBe c1040640dBe = this.LIZIZ.get(str);
            if (c1040640dBe == null) {
                C1040640dBe c1040640dBe2 = new C1040640dBe(null);
                this.LIZIZ.put(str, c1040640dBe2);
                return c1040640dBe2;
            }
            return c1040640dBe;
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LIZ;
        Object c1040640dBe3 = linkedHashMap.get(str);
        if (c1040640dBe3 == null) {
            c1040640dBe3 = new C1040640dBe(null);
            linkedHashMap.put(str, c1040640dBe3);
        }
        return (C1040640dBe) c1040640dBe3;
    }
}
