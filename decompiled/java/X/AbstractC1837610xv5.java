package X;

import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0xv5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public abstract class AbstractC1837610xv5 implements InterfaceC1837170xuN {
    public final WeakReference<Activity> LIZ;
    public final String LIZIZ = "802BCRYK2801";
    public final long LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final String LJFF;

    public final String LJFF() {
        return String.valueOf(this.LIZJ);
    }

    public final String LJII() {
        return String.valueOf(this.LJ);
    }

    public final String LJIIIIZZ() {
        return String.valueOf(this.LIZLLL);
    }

    public final Map<String, String> LJI(InterfaceC1837420xum interfaceC1837420xum) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1837830xvR c1837830xvRLIZJ = LIZJ();
        c1837830xvRLIZJ.getClass();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.putAll((ConcurrentHashMap) c1837830xvRLIZJ.LIZIZ.getValue());
        Map map = (Map) ((ConcurrentHashMap) c1837830xvRLIZJ.LIZ.getValue()).get(interfaceC1837420xum);
        if (map != null) {
            linkedHashMap2.putAll(map);
        }
        linkedHashMap.putAll(linkedHashMap2);
        linkedHashMap.put("to_user_id", LJFF());
        linkedHashMap.put("user_id", LJIIIIZZ());
        linkedHashMap.put("room_id", LJII());
        linkedHashMap.put("show_entrance", this.LJFF);
        return linkedHashMap;
    }

    public AbstractC1837610xv5(WeakReference weakReference, long j, long j2, long j3, String str) {
        this.LIZ = weakReference;
        this.LIZJ = j;
        this.LIZLLL = j2;
        this.LJ = j3;
        this.LJFF = str;
    }
}
