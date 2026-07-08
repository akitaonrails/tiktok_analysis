package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0pyw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1532480pyw {
    public final C1532470pyv LIZ;
    public final LinkedHashMap<String, C1532470pyv> LIZIZ;

    public final int LIZ() {
        Integer num;
        while (true) {
            try {
                Integer num2 = this.LIZ.LIZ;
                int iIntValue = num2 != null ? num2.intValue() : 0;
                Iterator<String> it2 = C23077092l.LIZ.iterator();
                int i = 100;
                while (it2.hasNext()) {
                    C1532470pyv c1532470pyv = this.LIZIZ.get(it2.next());
                    if (c1532470pyv != null && (num = c1532470pyv.LIZ) != null) {
                        iIntValue += num.intValue() * i;
                    }
                    i *= 10;
                }
                return iIntValue;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    public final Map<String, String> LIZIZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            for (Map.Entry<String, C1532470pyv> entry : this.LIZIZ.entrySet()) {
                String str = entry.getValue().LIZIZ;
                if (str == null) {
                    str = "";
                }
                if (!a0.LJJJIL(str)) {
                    String key = entry.getKey();
                    String str2 = entry.getValue().LIZIZ;
                    linkedHashMap.put(key, str2 != null ? str2 : "");
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
            return linkedHashMap;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return linkedHashMap;
        }
    }

    public C1532480pyw() {
        C1532470pyv c1532470pyv = new C1532470pyv();
        this.LIZ = c1532470pyv;
        LinkedHashMap<String, C1532470pyv> linkedHashMap = new LinkedHashMap<>();
        this.LIZIZ = linkedHashMap;
        linkedHashMap.put("_pipeline", c1532470pyv);
    }

    public final String LIZJ() {
        return LIZIZ().toString();
    }

    public final C1532470pyv LIZLLL(String str) {
        LinkedHashMap<String, C1532470pyv> linkedHashMap = this.LIZIZ;
        C1532470pyv c1532470pyv = linkedHashMap.get(str);
        if (c1532470pyv == null) {
            c1532470pyv = new C1532470pyv();
            linkedHashMap.put(str, c1532470pyv);
        }
        return c1532470pyv;
    }
}
