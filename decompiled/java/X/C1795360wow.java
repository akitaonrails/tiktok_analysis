package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: X.0wow, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1795360wow {
    public static volatile C1795360wow LIZIZ;
    public Map<String, C1796570wqt> LIZ = new HashMap();

    public static C1795360wow LIZIZ() {
        if (LIZIZ == null) {
            synchronized (C1795360wow.class) {
                try {
                    LIZIZ = new C1795360wow();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }

    public final C1796570wqt LIZ() {
        if (this.LIZ.containsKey("SubPreCheckCache")) {
            return this.LIZ.get("SubPreCheckCache");
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void LIZJ(List<AbstractC1794600wni> list) {
        C1796570wqt c1796570wqtLIZ = LIZ();
        if (c1796570wqtLIZ == null) {
            c1796570wqtLIZ = new C1796010wpz();
            Map.Entry[] entryArr = {new AbstractMap.SimpleEntry("SubPreCheckCache", c1796570wqtLIZ)};
            HashMap map = new HashMap(1);
            Map.Entry entry = entryArr[0];
            Object key = entry.getKey();
            Objects.requireNonNull(key);
            Object value = entry.getValue();
            Objects.requireNonNull(value);
            if (map.put(key, value) == null) {
                this.LIZ = Collections.unmodifiableMap(map);
            } else {
                throw new IllegalArgumentException("duplicate key: " + key);
            }
        } else {
            C199596137q c199596137q = c1796570wqtLIZ.LIZ;
            if (c199596137q != null) {
                c199596137q.LIZJ();
            }
        }
        for (AbstractC1794600wni abstractC1794600wni : (ArrayList) list) {
            String str = abstractC1794600wni.LIZJ;
            C199596137q c199596137q2 = c1796570wqtLIZ.LIZ;
            if (c199596137q2 != null) {
                c199596137q2.LL.put((K) str, (V) abstractC1794600wni);
            }
        }
    }
}
