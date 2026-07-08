package X;

import java.util.TreeMap;

/* JADX INFO: renamed from: X.0nTb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1436170nTb {
    public final long LIZ;
    public final long LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public boolean LJ;

    public C1436170nTb() {
        this(0L, 0L, false, false, 31);
    }

    public final TreeMap<String, Object> LIZ() {
        TreeMap<String, Object> treeMap = new TreeMap<>();
        treeMap.put("durationMs", Integer.valueOf((int) this.LIZ));
        treeMap.put("bitrateKb", Integer.valueOf((int) this.LIZIZ));
        treeMap.put("isHwEncode", Boolean.valueOf(this.LIZJ));
        treeMap.put("isReEncode", Boolean.valueOf(this.LIZLLL));
        return treeMap;
    }

    public final String toString() {
        return LIZ().toString();
    }

    public C1436170nTb(long j, long j2, boolean z, boolean z2, int i) {
        j = (i & 1) != 0 ? -1L : j;
        j2 = (i & 2) != 0 ? -1L : j2;
        z = (i & 4) != 0 ? false : z;
        z2 = (i & 8) != 0 ? false : z2;
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = false;
    }
}
