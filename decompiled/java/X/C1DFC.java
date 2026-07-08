package X;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.1DFC, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DFC {
    public static final String LIZ;
    public static final long LIZIZ;
    public static final int LIZJ;
    public static final int LIZLLL;
    public static final long LJ;
    public static final C2252791DFl LJFF;
    public static final C1DDQ LJI;
    public static final C1DDQ LJII;

    /* JADX WARN: Type inference failed for: r0v12, types: [X.1DDQ] */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.1DDQ] */
    static {
        String property;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        LIZ = property;
        LIZIZ = C1992307rF.LIZ(100000L, 1L, Long.MAX_VALUE, "kotlinx.coroutines.scheduler.resolution.ns");
        int i = C1BA4.LIZ;
        if (i < 2) {
            i = 2;
        }
        LIZJ = C1992307rF.LIZIZ("kotlinx.coroutines.scheduler.core.pool.size", i, 1, 0, 8);
        LIZLLL = C1992307rF.LIZIZ("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        LJ = TimeUnit.SECONDS.toNanos(C1992307rF.LIZ(60L, 1L, Long.MAX_VALUE, "kotlinx.coroutines.scheduler.keep.alive.sec"));
        LJFF = C2252791DFl.LIZ;
        LJI = new C1DDO(0) { // from class: X.1DDQ
            public final int LIZ;

            @Override // X.C1DDO
            public final void LIZIZ() {
            }

            @Override // X.C1DDO
            public final int LIZ() {
                return this.LIZ;
            }

            {
                this.LIZ = i;
            }
        };
        LJII = new C1DDO(1) { // from class: X.1DDQ
            public final int LIZ;

            @Override // X.C1DDO
            public final void LIZIZ() {
            }

            @Override // X.C1DDO
            public final int LIZ() {
                return this.LIZ;
            }

            {
                this.LIZ = i;
            }
        };
    }
}
