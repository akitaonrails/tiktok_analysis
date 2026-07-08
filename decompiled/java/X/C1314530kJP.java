package X;

import android.graphics.Path;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0kJP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1314530kJP {
    public static final C2091308Hf<Path, C1314290kJ1> LIZ;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.08Hf, X.08Hf<android.graphics.Path, X.0kJ1>] */
    static {
        final int i = 10;
        LIZ = new LinkedHashMap<K, V>(i) { // from class: X.08Hf
            public final int LL;

            public int getCapacity() {
                return this.LL;
            }

            {
                super(i, 0.75f, true);
                this.LL = i;
            }

            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<K, V> entry) {
                if (size() > this.LL) {
                    return true;
                }
                return false;
            }
        };
    }
}
