package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0jNy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1278920jNy {
    public static final C1278920jNy LIZJ = new C1278920jNy(0, "STATUS_UNINIT");
    public static final C1278920jNy LIZLLL;
    public static final C1278920jNy LJ;
    public static final C1278920jNy LJFF;
    public static final C1278920jNy LJI;
    public static final C1278920jNy LJII;
    public static final C1278920jNy LJIIIIZZ;
    public static final ConcurrentHashMap<Integer, C1278920jNy> LJIIIZ;
    public final int LIZ;
    public final String LIZIZ;

    static {
        C1278920jNy c1278920jNy = new C1278920jNy(1, "STATUS_INIT");
        LIZLLL = c1278920jNy;
        LJ = new C1278920jNy(2, "STATUS_STARTING");
        LJFF = new C1278920jNy(3, "STATUS_STARTED");
        LJI = new C1278920jNy(4, "STATUS_STOPPING");
        LJII = c1278920jNy;
        LJIIIIZZ = new C1278920jNy(5, "STATUS_ENDED");
        LJIIIZ = new ConcurrentHashMap<>();
    }

    public final boolean LIZIZ() {
        return this.LIZ < 0;
    }

    public final String toString() {
        return this.LIZIZ;
    }

    public static C1278920jNy LIZ(int i) {
        if (i >= 0) {
            return null;
        }
        ConcurrentHashMap<Integer, C1278920jNy> concurrentHashMap = LJIIIZ;
        C1278920jNy c1278920jNy = concurrentHashMap.get(Integer.valueOf(i));
        if (c1278920jNy == null) {
            C1278920jNy c1278920jNy2 = new C1278920jNy(i, "STATUS_ERROR");
            concurrentHashMap.put(Integer.valueOf(i), c1278920jNy2);
            return c1278920jNy2;
        }
        return c1278920jNy;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C1278920jNy) && this.LIZ == ((C1278920jNy) obj).LIZ) {
            return true;
        }
        return false;
    }

    public C1278920jNy(int i, String str) {
        this.LIZ = i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('(');
        sbLIZ.append(i);
        sbLIZ.append(')');
        this.LIZIZ = C2188811AlT.LIZIZ(sbLIZ);
    }
}
