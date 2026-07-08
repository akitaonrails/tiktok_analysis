package X;

import com.bytedance.common.jato.boost.RSpaceLiveRatioOpt;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Queue;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0WKc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C821400WKc implements InterfaceC20124913ol {
    public static final AtomicBoolean LJFF = new AtomicBoolean(false);
    public final Queue<Long> LIZ = new LinkedList();
    public final NavigableMap<Float, Integer> LIZIZ;
    public int LIZJ;
    public long LIZLLL;
    public final long LJ;

    @Override // X.InterfaceC20124913ol
    public final void LIZ() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.LIZLLL < this.LJ) {
            if (this.LIZ.isEmpty()) {
                return;
            }
            ((LinkedList) this.LIZ).clear();
            return;
        }
        Runtime runtime = Runtime.getRuntime();
        long jMaxMemory = runtime.maxMemory();
        long jFreeMemory = runtime.totalMemory() - runtime.freeMemory();
        if (((LinkedList) this.LIZ).size() >= 10) {
            ((LinkedList) this.LIZ).poll();
        }
        ((LinkedList) this.LIZ).offer(Long.valueOf(jFreeMemory));
        if (((LinkedList) this.LIZ).size() < 10) {
            return;
        }
        Iterator<Long> it2 = this.LIZ.iterator();
        long jLongValue = 0;
        while (it2.hasNext()) {
            jLongValue += it2.next().longValue();
        }
        float size = (float) ((jLongValue / ((double) ((LinkedList) this.LIZ).size())) / jMaxMemory);
        for (Map.Entry entry : ((TreeMap) this.LIZIZ).entrySet()) {
            if (size <= ((Float) entry.getKey()).floatValue()) {
                if (((Integer) entry.getValue()).equals(Integer.valueOf(this.LIZJ))) {
                    return;
                }
                int iIntValue = ((Integer) entry.getValue()).intValue();
                RSpaceLiveRatioOpt.LIZ(iIntValue);
                this.LIZJ = iIntValue;
                this.LIZLLL = jCurrentTimeMillis;
                return;
            }
        }
        int i = this.LIZJ;
        if (i == 0 || i != 75) {
            RSpaceLiveRatioOpt.LIZIZ();
            this.LIZJ = 75;
            this.LIZLLL = jCurrentTimeMillis;
        }
    }

    public C821400WKc(Map<Float, Integer> map, long j) {
        TreeMap treeMap = new TreeMap();
        this.LIZIZ = treeMap;
        this.LIZJ = 0;
        this.LIZLLL = 0L;
        treeMap.putAll(map);
        this.LJ = j;
    }
}
