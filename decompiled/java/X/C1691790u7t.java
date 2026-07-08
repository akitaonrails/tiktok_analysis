package X;

/* JADX INFO: renamed from: X.0u7t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1691790u7t {
    public static final boolean LIZIZ(int i) {
        if (i == 2 || i == 4 || i == 5) {
            return true;
        }
        return false;
    }

    public static final long LIZ(boolean z, int i, float f, long j) {
        int iLJIIIIZZ;
        if ((z || LIZIZ(i)) && C1682380tsi.LJ(j)) {
            iLJIIIIZZ = C1682380tsi.LJIIIIZZ(j);
        } else {
            iLJIIIIZZ = Integer.MAX_VALUE;
        }
        if (C1682380tsi.LJIIJ(j) != iLJIIIIZZ) {
            iLJIIIIZZ = C13LZ.LJ(C1691570u7X.LIZ(f), C1682380tsi.LJIIJ(j), iLJIIIIZZ);
        }
        return C1682400tsk.LIZIZ(0, iLJIIIIZZ, 0, C1682380tsi.LJII(j));
    }
}
