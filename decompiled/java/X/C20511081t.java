package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.081t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20511081t {
    public static volatile C20511081t LJIIL;
    public int LIZ;
    public long LIZIZ;
    public String LIZJ;
    public float LIZLLL;
    public float LJ;
    public String LJIIIZ;
    public final ConcurrentHashMap<String, Object> LJIIJJI;
    public final CopyOnWriteArrayList<Map<String, Object>> LJFF = new CopyOnWriteArrayList<>();
    public long LJI = 0;
    public final CopyOnWriteArrayList<Map<String, Object>> LJII = new CopyOnWriteArrayList<>();
    public long LJIIIIZZ = 0;
    public final CopyOnWriteArrayList<Map<String, Object>> LJIIJ = new CopyOnWriteArrayList<>();

    public static C20511081t LJ() {
        if (LJIIL == null) {
            synchronized (C20511081t.class) {
                try {
                    if (LJIIL == null) {
                        LJIIL = new C20511081t();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJIIL;
    }

    public final Map<String, Object> LIZIZ() {
        if (this.LIZ <= 0) {
            return new HashMap();
        }
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList(this.LJIIJ);
        ArrayList arrayList2 = new ArrayList(this.LJII);
        ArrayList arrayList3 = new ArrayList(this.LJFF);
        map.put("seek_action", arrayList);
        map.put("pause_action", arrayList2);
        map.put("speed_action", arrayList3);
        float fLIZ = LIZ(arrayList);
        float fLIZ2 = LIZ(arrayList2);
        float fLIZ3 = LIZ(arrayList3);
        map.put("seek_d_avg", Float.valueOf(fLIZ));
        map.put("pause_d_avg", Float.valueOf(fLIZ2));
        map.put("speed_d_avg", Float.valueOf(fLIZ3));
        this.LJIIJ.clear();
        this.LJII.clear();
        this.LJFF.clear();
        this.LJI = 0L;
        this.LIZIZ = 0L;
        this.LJIIIIZZ = 0L;
        return map;
    }

    public final Map<String, Object> LIZJ() {
        HashMap map = new HashMap(this.LJIIJJI);
        this.LJIIJJI.clear();
        return map;
    }

    public C20511081t() {
        new CopyOnWriteArrayList();
        new ConcurrentHashMap();
        this.LJIIJJI = new ConcurrentHashMap<>();
        new BPEAHandler(Looper.getMainLooper());
    }

    public static float LIZ(List list) {
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            return 0.0f;
        }
        Iterator it2 = arrayList.iterator();
        long jLongValue = 0;
        while (it2.hasNext()) {
            Object obj = ((Map) it2.next()).get("duration");
            if (obj instanceof Number) {
                jLongValue += ((Number) obj).longValue();
            }
        }
        return jLongValue / arrayList.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(java.util.HashMap<java.lang.String, java.lang.Object> r13) {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20511081t.LIZLLL(java.util.HashMap):void");
    }
}
