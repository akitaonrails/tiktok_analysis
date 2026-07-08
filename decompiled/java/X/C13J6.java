package X;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.13J6, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13J6 {
    public static final long[] LJ = new long[0];
    public final InterfaceC19983313Gt LIZ;
    public final Function2<InterfaceC19983313Gt, Integer, Boolean> LIZIZ;
    public long LIZJ;
    public final long[] LIZLLL;

    public C13J6(InterfaceC19983313Gt interfaceC19983313Gt, C13J7 c13j7) {
        this.LIZ = interfaceC19983313Gt;
        this.LIZIZ = c13j7;
        int iLJ = interfaceC19983313Gt.LJ();
        if (iLJ <= 64) {
            this.LIZJ = iLJ != 64 ? (-1) << iLJ : 0L;
            this.LIZLLL = LJ;
            return;
        }
        this.LIZJ = 0L;
        int i = (iLJ - 1) >>> 6;
        long[] jArr = new long[i];
        if ((iLJ & 63) != 0) {
            jArr[i - 1] = (-1) << iLJ;
        }
        this.LIZLLL = jArr;
    }
}
