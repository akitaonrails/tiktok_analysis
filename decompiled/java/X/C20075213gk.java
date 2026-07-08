package X;

import p2.x;

/* JADX INFO: renamed from: X.13gk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20075213gk {
    public static final boolean LIZ(C20076613gy c20076613gy, long j) {
        if (!c20076613gy.LL.LLJILLL) {
            return false;
        }
        x xVar = C20052513d5.LJFF(c20076613gy).LLJLLIL.LIZIZ;
        if (!xVar.LIZLLL()) {
            return false;
        }
        long jLJ = C1692940u9k.LJ(xVar);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jLJ >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jLJ & 4294967295L));
        long j2 = c20076613gy.LLJJIJIL;
        float f = ((int) (j2 >> 32)) + fIntBitsToFloat;
        float f2 = ((int) (j2 & 4294967295L)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        if (fIntBitsToFloat > fIntBitsToFloat3 || fIntBitsToFloat3 > f) {
            return false;
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat2 > fIntBitsToFloat4 || fIntBitsToFloat4 > f2) {
            return false;
        }
        return true;
    }
}
