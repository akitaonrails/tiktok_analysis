package X;

import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0EgX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C370950EgX {
    public static final ConcurrentHashMap<String, String> LIZIZ = new ConcurrentHashMap<>();
    public final HashMap<C370820EgK, C371040Egg> LIZ = new HashMap<>();

    public final List<C370780EgG> LIZ(List<C371000Egc> list) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.LIZ) {
            try {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (C371000Egc c371000Egc : list) {
                    for (C370780EgG c370780EgG : c371000Egc.LIZIZ) {
                        C370820EgK c370820EgK = new C370820EgK(c370780EgG.LIZ, c370780EgG.LIZIZ, C371390EhF.LIZ(c370780EgG.LIZ));
                        C371040Egg c371040Egg = this.LIZ.get(c370820EgK);
                        if (c371040Egg == null) {
                            this.LIZ.put(c370820EgK, new C371040Egg());
                        } else {
                            c371040Egg.LIZ++;
                        }
                    }
                    for (C370780EgG c370780EgG2 : c371000Egc.LIZ) {
                        C370820EgK c370820EgK2 = new C370820EgK(c370780EgG2.LIZ, c370780EgG2.LIZIZ, C371390EhF.LIZ(c370780EgG2.LIZ));
                        C371040Egg c371040Egg2 = this.LIZ.get(c370820EgK2);
                        if (c371040Egg2 != null) {
                            int i = c371040Egg2.LIZ - 1;
                            c371040Egg2.LIZ = i;
                            if (i <= 0) {
                                this.LIZ.remove(c370820EgK2);
                                c371040Egg2.LIZ = 0;
                            }
                        }
                    }
                    for (C370780EgG c370780EgG3 : c371000Egc.LIZJ) {
                        C370820EgK c370820EgK3 = new C370820EgK(c370780EgG3.LIZ, c370780EgG3.LIZIZ, C371390EhF.LIZ(c370780EgG3.LIZ));
                        if (this.LIZ.get(c370820EgK3) == null) {
                            this.LIZ.put(c370820EgK3, new C371040Egg());
                        }
                        C370780EgG c370780EgG4 = (C370780EgG) linkedHashMap.get(c370820EgK3);
                        if (c370780EgG4 == null || c370780EgG4.LIZJ < c370780EgG3.LIZJ) {
                            linkedHashMap.put(c370820EgK3, c370780EgG3);
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Map.Entry<C370820EgK, C371040Egg> entry : this.LIZ.entrySet()) {
                    C370820EgK key = entry.getKey();
                    C371040Egg value = entry.getValue();
                    C370780EgG c370780EgG5 = (C370780EgG) linkedHashMap.get(key);
                    if (c370780EgG5 == null) {
                        arrayList2.add(key);
                    } else if (value.LIZIZ == null) {
                        arrayList.add(c370780EgG5);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    this.LIZ.remove((C370820EgK) it2.next());
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return arrayList;
    }

    public final void LIZIZ(C370820EgK c370820EgK, Bitmap bitmap) {
        synchronized (this.LIZ) {
            try {
                C371040Egg c371040Egg = this.LIZ.get(c370820EgK);
                if (c371040Egg != null) {
                    c371040Egg.LIZIZ = bitmap;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
