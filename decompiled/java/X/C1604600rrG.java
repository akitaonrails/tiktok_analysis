package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rrG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1604600rrG {
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public Function0<Integer> LJFF;
    public final float LJI;
    public final long LJII;
    public final long LJIIIIZZ;

    public final float LIZ() {
        return this.LJI + (this.LJFF != null ? r0.invoke().intValue() : 0);
    }

    public C1604600rrG(int i) {
        float f = -(C418440Gaw.LIZIZ(122) * C1604630rrJ.LIZ().distanceOpenToCloseSkylight);
        float fLIZIZ = C418440Gaw.LIZIZ(122) * C1604630rrJ.LIZ().distanceCloseToOpenSkylight;
        float fLIZIZ2 = C418440Gaw.LIZIZ(122) * C1604630rrJ.LIZ().distanceOpenToRedirection;
        float fLIZIZ3 = C418440Gaw.LIZIZ(122) * C1604630rrJ.LIZ().distanceCloseToRedirection;
        float f2 = C1604630rrJ.LIZ().velocityCloseToRedirection;
        float fLIZIZ4 = C418440Gaw.LIZIZ(122);
        this.LIZ = f;
        this.LIZIZ = fLIZIZ;
        this.LIZJ = fLIZIZ2;
        this.LIZLLL = fLIZIZ3;
        this.LJ = f2;
        this.LJFF = null;
        this.LJI = fLIZIZ4;
        this.LJII = 300L;
        this.LJIIIIZZ = 300L;
    }
}
