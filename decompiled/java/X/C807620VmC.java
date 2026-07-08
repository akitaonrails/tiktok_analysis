package X;

import android.app.Application;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.statistic.StatisticLog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0VmC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C807620VmC {
    public static final HashMap<String, Boolean> LJIIIIZZ = new HashMap<>();
    public final Map<String, InterfaceC807610VmB> LIZ = new ConcurrentHashMap();
    public final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public final AtomicBoolean LIZLLL = new AtomicBoolean(false);
    public final Queue<StatisticLog> LJ = new LinkedList();
    public final Queue<StatisticLog> LJFF = new LinkedList();
    public Application LJI;
    public C827000WcM LJII;

    public final void LIZ(C827000WcM c827000WcM) {
        this.LJII = c827000WcM;
        Iterator it2 = ((ConcurrentHashMap) this.LIZ).values().iterator();
        while (it2.hasNext()) {
            ((InterfaceC807610VmB) it2.next()).LIZIZ();
        }
    }

    public final void LIZIZ(StatisticLog statisticLog) {
        boolean zLJI = MethodIDManager.LJI(137729);
        Map<String, Object> map = statisticLog.info;
        if (map != null) {
            C20512115Od.LIZ.LIZJ(map);
        }
        if (LJIIIIZZ.get(statisticLog.name) != null) {
            synchronized (this.LJFF) {
                try {
                    if (!this.LIZJ.get()) {
                        ((LinkedList) this.LJFF).offer(statisticLog);
                        if (((LinkedList) this.LJFF).size() > 50) {
                            ((LinkedList) this.LJFF).poll();
                        }
                        if (zLJI) {
                            MethodIDManager.LJ();
                            return;
                        }
                        return;
                    }
                } finally {
                }
            }
        } else {
            synchronized (this.LJ) {
                try {
                    if (!this.LIZIZ.get()) {
                        ((LinkedList) this.LJ).offer(statisticLog);
                        if (((LinkedList) this.LJ).size() > 50) {
                            ((LinkedList) this.LJ).poll();
                        }
                        if (zLJI) {
                            MethodIDManager.LJ();
                            return;
                        }
                        return;
                    }
                } finally {
                }
            }
        }
        Iterator it2 = ((ConcurrentHashMap) this.LIZ).values().iterator();
        while (it2.hasNext()) {
            ((InterfaceC807610VmB) it2.next()).LIZ(statisticLog);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
