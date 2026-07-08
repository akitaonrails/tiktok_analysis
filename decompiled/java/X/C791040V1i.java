package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0V1i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C791040V1i {
    public static volatile boolean LJFF = true;
    public long LIZ;
    public long LIZIZ;
    public final ConcurrentHashMap<String, C791090V1n> LIZJ = new ConcurrentHashMap<>(4);
    public final String LIZLLL = "start_trace";
    public final String LJ = "launch_stats";

    public final boolean LIZ() {
        return "start_trace".equals(this.LIZLLL);
    }
}
