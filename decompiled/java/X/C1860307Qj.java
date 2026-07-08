package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.07Qj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1860307Qj extends C08U0 implements InterfaceC21173617tW {
    public final String LIZ = "gc_detail";
    public volatile int LIZIZ = Integer.MIN_VALUE;
    public volatile int LIZJ = Integer.MIN_VALUE;
    public volatile long LIZLLL;
    public volatile long LJ;
    public volatile long LJFF;
    public volatile boolean LJI;
    public volatile long LJII;

    @Override // X.C08U0
    public final void onGCStart(int i, int i2, int i3) {
    }

    @Override // X.C08U0
    public final void onWaitGc(int i, int i2, int i3) {
    }

    @Override // X.InterfaceC21173617tW
    public final Map<String, Object> LJJLIIIJLJLI() {
        int i = this.LIZIZ;
        if (i == Integer.MIN_VALUE) {
            return C2097608Jq.LJ();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(7);
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LJII;
        if (jCurrentTimeMillis < 0) {
            jCurrentTimeMillis = 0;
        }
        linkedHashMap.put("last_ago_ms", Long.valueOf(jCurrentTimeMillis));
        linkedHashMap.put("last_duration_us", Long.valueOf(this.LIZLLL / 1000));
        linkedHashMap.put("last_cause", Integer.valueOf(i));
        linkedHashMap.put("last_type", Integer.valueOf(this.LIZJ));
        long j = this.LJ / 1024;
        if (j > 0) {
            linkedHashMap.put("last_freed_kb", Long.valueOf(j));
        }
        long j2 = this.LJFF / 1024;
        if (j2 > 0) {
            linkedHashMap.put("last_freed_los_kb", Long.valueOf(j2));
        }
        if (this.LJI) {
            linkedHashMap.put("last_clear_soft_ref", Boolean.TRUE);
        }
        return linkedHashMap;
    }

    @Override // X.InterfaceC21173617tW
    public final Map<String, Object> LIZ() {
        return C2097608Jq.LJ();
    }

    @Override // X.InterfaceC21173617tW
    public final String getName() {
        return this.LIZ;
    }

    @Override // X.C08U0
    public final void onGCEnd(int i, int i2, int i3, long j, boolean z, long j2, long j3, long j4, long j5, long j6) {
        this.LIZIZ = i3;
        this.LIZJ = i2;
        this.LIZLLL = j;
        this.LJ = j2;
        this.LJFF = j4;
        this.LJI = z;
        this.LJII = System.currentTimeMillis();
    }
}
