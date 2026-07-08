package X;

import com.bytedance.hybrid.spark.raven.data.Container;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0gK6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1161200gK6 {
    public static final Map<String, C1161200gK6> LIZLLL = new LinkedHashMap();
    public static final Map<String, Integer> LJ = new LinkedHashMap();
    public String LIZ;
    public HashMap<C1161180gK4, InterfaceC1161120gJy> LIZIZ = new HashMap<>();
    public final Map<String, Map<String, Container>> LIZJ = new LinkedHashMap();

    public final boolean LIZ(C1161140gK0 c1161140gK0, boolean z) {
        InterfaceC1161120gJy interfaceC1161120gJy = this.LIZIZ.get(c1161140gK0.LIZIZ);
        if (interfaceC1161120gJy != null) {
            return interfaceC1161120gJy.LJ(c1161140gK0.LIZLLL);
        }
        return false;
    }
}
