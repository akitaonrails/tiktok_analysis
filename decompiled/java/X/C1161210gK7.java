package X;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0gK7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1161210gK7 {
    public final String LIZ;
    public final HashMap<C1161180gK4, InterfaceC1161120gJy> LIZIZ;

    public final void LIZ() {
        C1161200gK6 c1161200gK6 = new C1161200gK6();
        c1161200gK6.LIZIZ = this.LIZIZ;
        String str = this.LIZ;
        c1161200gK6.LIZ = str;
        if (str != null) {
            C1161200gK6.LIZLLL.put(str, c1161200gK6);
            Map<String, Integer> map = C1161200gK6.LJ;
            Integer num = (Integer) ((LinkedHashMap) map).get(str);
            map.put(str, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
        }
    }

    public C1161210gK7(String str) {
        this.LIZ = str;
        HashMap<C1161180gK4, InterfaceC1161120gJy> map = new HashMap<>();
        map.put(new C1161180gK4("spark_card"), new C1161580gKi());
        map.put(new C1161180gK4("myna"), new C1161540gKe());
        this.LIZIZ = map;
    }
}
