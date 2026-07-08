package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0VA4, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VA4 implements C0VAH {
    public final List<LinkedHashMap<Long, Long>> LIZ = new ArrayList();
    public final List<LinkedHashMap<Long, Long>> LIZIZ = new ArrayList();
    public long LIZJ = 0;
    public long LIZLLL = 0;
    public long LJ = 0;
    public double LJFF = 0.0d;

    public final long LIZ() {
        if (this.LIZJ == 0 && !((ArrayList) this.LIZ).isEmpty()) {
            Iterator it2 = ((ArrayList) this.LIZ).iterator();
            while (it2.hasNext()) {
                Iterator it3 = ((LinkedHashMap) it2.next()).entrySet().iterator();
                while (it3.hasNext()) {
                    this.LIZJ += ((Long) ((Map.Entry) it3.next()).getValue()).longValue();
                }
            }
        }
        return this.LIZJ;
    }

    public final String toString() {
        return "cputime:{deltaTime:" + this.LIZLLL + " usage:" + this.LJFF + " totaltime:" + LIZ() + "}";
    }
}
