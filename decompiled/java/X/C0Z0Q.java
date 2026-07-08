package X;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0Z0Q, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z0Q {
    public final String LIZ;
    public final int LIZIZ;
    public long LIZJ = -1;
    public long LIZLLL = -1;
    public final List<C0Z0Q> LJ = new ArrayList();
    public final Map<String, String> LJFF = new LinkedHashMap();
    public final Map<String, String> LJI = new LinkedHashMap();

    public final void LIZ(Map<String, ? extends Object> map) {
        String name;
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            Map<String, String> map2 = this.LJI;
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || (name = value.getClass().getName()) == null) {
                name = "";
            }
            map2.put(key, name);
        }
        if (this.LIZJ > 0 && this.LIZLLL == -1) {
            this.LIZLLL = SystemClock.uptimeMillis() - this.LIZJ;
        }
    }

    public final void LIZIZ(Map<String, ? extends Object> map) {
        String name;
        this.LIZJ = SystemClock.uptimeMillis();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            Map<String, String> map2 = this.LJFF;
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || (name = value.getClass().getName()) == null) {
                name = "";
            }
            map2.put(key, name);
        }
    }

    public C0Z0Q(String str, int i) {
        this.LIZ = str;
        this.LIZIZ = i;
    }
}
