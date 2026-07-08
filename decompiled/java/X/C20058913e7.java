package X;

import Y.ARunnableS130S0100000_30;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS574S0100000_30;
import p2.j1;

/* JADX INFO: renamed from: X.13e7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20058913e7 {
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public Object LJI;
    public final C20059213eA LIZ = new C20059213eA();
    public final C20059113e9 LIZIZ = new C20059113e9();
    public final C13B1<Function0<Unit>> LIZJ = new C13B1<>((Object) null);
    public long LJII = -1;
    public final AwS574S0100000_30 LJIIIIZZ = new AwS574S0100000_30(this, 452);
    public final C1696010uEh LJIIIZ = new C1696010uEh();

    /* JADX WARN: Removed duplicated region for block: B:109:0x025b A[PHI: r1 r3 r30 r32
      0x025b: PHI (r1v14 long) = (r1v13 long), (r1v15 long) binds: [B:98:0x0219, B:108:0x0259] A[DONT_GENERATE, DONT_INLINE]
      0x025b: PHI (r3v4 long) = (r3v3 long), (r3v5 long) binds: [B:98:0x0219, B:108:0x0259] A[DONT_GENERATE, DONT_INLINE]
      0x025b: PHI (r30v3 long) = (r30v2 long), (r30v4 long) binds: [B:98:0x0219, B:108:0x0259] A[DONT_GENERATE, DONT_INLINE]
      0x025b: PHI (r32v3 float[]) = (r32v2 float[]), (r32v4 float[]) binds: [B:98:0x0219, B:108:0x0259] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e A[PHI: r15 r33
      0x007e: PHI (r15v6 long) = (r15v5 long), (r15v7 long) binds: [B:13:0x0041, B:23:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x007e: PHI (r33v4 float[]) = (r33v3 float[]), (r33v5 float[]) binds: [B:13:0x0041, B:23:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            Method dump skipped, instruction units count: 645
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20058913e7.LIZ():void");
    }

    public static long LJI(C20053713dH c20053713dH) {
        float[] fArrMo67getUnderlyingMatrixsQKQjiQ;
        int iLIZ;
        C20054913dT c20054913dT = c20053713dH.LLJLLIL;
        j1 j1Var = c20054913dT.LIZJ;
        j1 j1Var2 = c20054913dT.LIZIZ;
        long jLIZIZ = 0;
        while (j1Var2 != null && j1Var2 != j1Var) {
            InterfaceC20054313dN interfaceC20054313dN = j1Var2.LLJZIJLIL;
            jLIZIZ = C1680450tpb.LIZIZ(jLIZIZ, j1Var2.LLJJL);
            j1Var2 = j1Var2.LLJJIII;
            if (interfaceC20054313dN != null && (iLIZ = C20059313eB.LIZ((fArrMo67getUnderlyingMatrixsQKQjiQ = interfaceC20054313dN.mo67getUnderlyingMatrixsQKQjiQ()))) != 3) {
                if ((iLIZ & 2) == 0) {
                    return 9223372034707292159L;
                }
                jLIZIZ = C1696000uEg.LIZIZ(jLIZIZ, fArrMo67getUnderlyingMatrixsQKQjiQ);
            }
        }
        return C1680450tpb.LIZJ(jLIZIZ);
    }

    public final void LIZJ(C20053713dH c20053713dH) {
        C19968013Aw<C20053713dH> c19968013AwLJJIL = c20053713dH.LJJIL();
        C20053713dH[] c20053713dHArr = c19968013AwLJJIL.LL;
        int i = c19968013AwLJJIL.LLILLL;
        for (int i2 = 0; i2 < i; i2++) {
            C20053713dH c20053713dH2 = c20053713dHArr[i2];
            LIZIZ(c20053713dH2, c20053713dH2.LLJLLIL.LIZJ.LLJJL, false);
            LIZJ(c20053713dH2);
        }
    }

    public final void LIZLLL(C20053713dH c20053713dH) {
        boolean z = true;
        this.LIZLLL = true;
        C20059213eA c20059213eA = this.LIZ;
        int i = c20053713dH.LLILLJJLI & 67108863;
        long[] jArr = c20059213eA.LIZ;
        int i2 = c20059213eA.LIZJ;
        int i3 = 0;
        while (true) {
            if (i3 >= jArr.length - 2 || i3 >= i2) {
                break;
            }
            int i4 = i3 + 2;
            long j = jArr[i4];
            if ((((int) j) & 67108863) == i) {
                jArr[i4] = 2305843009213693952L | j;
                break;
            }
            i3 += 3;
        }
        Object obj = this.LJI;
        if (obj == null) {
            z = false;
        }
        long j2 = this.LIZIZ.LIZJ;
        if (j2 < 0 && z) {
            return;
        }
        if (this.LJII == j2 && z) {
            return;
        }
        if (obj != null && (obj instanceof Runnable)) {
            C20059413eC.LIZ.removeCallbacks((Runnable) obj);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jMax = Math.max(j2, ((long) 16) + jCurrentTimeMillis);
        this.LJII = jMax;
        ARunnableS130S0100000_30 aRunnableS130S0100000_30 = new ARunnableS130S0100000_30(this.LJIIIIZZ, 47);
        C786410Ut5.LJLIIL(jMax - jCurrentTimeMillis, C20059413eC.LIZ, aRunnableS130S0100000_30);
        this.LJI = aRunnableS130S0100000_30;
    }

    public final void LJ(C20053713dH c20053713dH) {
        long jLJI = LJI(c20053713dH);
        if (C20059313eB.LIZIZ(jLJI)) {
            c20053713dH.LLILZIL = jLJI;
            c20053713dH.LLILZLL = false;
            C19968013Aw<C20053713dH> c19968013AwLJJIL = c20053713dH.LJJIL();
            C20053713dH[] c20053713dHArr = c19968013AwLJJIL.LL;
            int i = c19968013AwLJJIL.LLILLL;
            for (int i2 = 0; i2 < i; i2++) {
                C20053713dH c20053713dH2 = c20053713dHArr[i2];
                LJFF(c20053713dH2, c20053713dH2.LLJLLIL.LIZJ.LLJJL, false);
            }
            LIZLLL(c20053713dH);
            return;
        }
        LIZJ(c20053713dH);
    }

    public final void LJII(C20053713dH c20053713dH) {
        C20059213eA c20059213eA = this.LIZ;
        int i = c20053713dH.LLILLJJLI & 67108863;
        long[] jArr = c20059213eA.LIZ;
        int i2 = c20059213eA.LIZJ;
        int i3 = 0;
        while (true) {
            if (i3 >= jArr.length - 2 || i3 >= i2) {
                break;
            }
            int i4 = i3 + 2;
            if ((((int) jArr[i4]) & 67108863) == i) {
                jArr[i3] = -1;
                jArr[i3 + 1] = -1;
                jArr[i4] = 2305843009213693951L;
                break;
            }
            i3 += 3;
        }
        this.LIZLLL = true;
        this.LJFF = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.C20053713dH r20, long r21, boolean r23) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20058913e7.LIZIZ(X.13dH, long, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(X.C20053713dH r25, long r26, boolean r28) {
        /*
            Method dump skipped, instruction units count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20058913e7.LJFF(X.13dH, long, boolean):void");
    }
}
