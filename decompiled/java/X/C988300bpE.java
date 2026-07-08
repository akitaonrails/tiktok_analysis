package X;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0bpE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C988300bpE {
    public final String LIZ;
    public long LIZIZ = 1;
    public int LIZJ;
    public Runnable LIZLLL;
    public boolean LJ;
    public boolean LJFF;

    public final C988290bpD LIZ() {
        long j = this.LIZIZ;
        int i = this.LIZJ;
        Runnable runnable = this.LIZLLL;
        if (runnable == null) {
            runnable = null;
        }
        return new C988290bpD(j, i, runnable, this.LJ, this.LJFF, this.LIZ);
    }

    public C988300bpE(String str) {
        this.LIZ = str;
    }

    public final void LIZIZ(long j) {
        if (j <= 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("taskName", this.LIZ);
            C1AF0.LIZLLL("VideoPlayTaskInfo videoDuration <= 0 ", linkedHashMap);
            j = 1;
        }
        this.LIZIZ = j;
    }
}
