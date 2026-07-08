package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p2.j1;

/* JADX INFO: renamed from: X.13e8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20059013e8 {
    public final int LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final InterfaceC1691470u7N LIZLLL;
    public final Function1<C20059513eD, Unit> LJ;
    public C20059013e8 LJFF;
    public long LJI;
    public long LJII;
    public long LJIIIIZZ;
    public long LJIIIZ = -1;
    public final /* synthetic */ C20059113e9 LJIIJ;

    public final void LIZIZ() {
        C20029713Yp<C20059013e8> c20029713Yp = this.LJIIJ.LIZ;
        int i = this.LIZ;
        C20059013e8 c20059013e8LJI = c20029713Yp.LJI(i);
        if (c20059013e8LJI != null) {
            if (!Intrinsics.LJFF(c20059013e8LJI, this)) {
                int iLIZLLL = c20029713Yp.LIZLLL(i);
                Object[] objArr = c20029713Yp.LIZJ;
                c20029713Yp.LIZIZ[iLIZLLL] = i;
                objArr[iLIZLLL] = c20059013e8LJI;
                while (true) {
                    C20059013e8 c20059013e8 = c20059013e8LJI.LJFF;
                    if (c20059013e8 == null) {
                        break;
                    }
                    if (c20059013e8 == this) {
                        c20059013e8LJI.LJFF = this.LJFF;
                        this.LJFF = null;
                        return;
                    }
                    c20059013e8LJI = c20059013e8;
                }
            } else {
                C20059013e8 c20059013e82 = this.LJFF;
                this.LJFF = null;
                if (c20059013e82 != null) {
                    int iLIZLLL2 = c20029713Yp.LIZLLL(i);
                    Object[] objArr2 = c20029713Yp.LIZJ;
                    c20029713Yp.LIZIZ[iLIZLLL2] = i;
                    objArr2[iLIZLLL2] = c20059013e82;
                    return;
                }
                return;
            }
        }
        C20059113e9 c20059113e9 = this.LJIIJ;
        C20059013e8 c20059013e83 = c20059113e9.LIZIZ;
        if (c20059013e83 == this) {
            c20059113e9.LIZIZ = c20059013e83.LJFF;
            this.LJFF = null;
            return;
        }
        if (c20059013e83 == null) {
            return;
        }
        C20059013e8 c20059013e84 = c20059013e83.LJFF;
        while (true) {
            C20059013e8 c20059013e85 = c20059013e83;
            c20059013e83 = c20059013e84;
            if (c20059013e83 == null) {
                return;
            }
            if (c20059013e83 == this) {
                if (c20059013e85 != null) {
                    c20059013e85.LJFF = c20059013e83.LJFF;
                }
                this.LJFF = null;
                return;
            }
            c20059013e84 = c20059013e83.LJFF;
        }
    }

    public final void LIZ(long j, long j2, long j3, long j4, float[] fArr) {
        Object obj;
        final InterfaceC1691470u7N interfaceC1691470u7N = this.LIZLLL;
        j1 j1VarLIZLLL = C20052513d5.LIZLLL(interfaceC1691470u7N, 2);
        C20053713dH c20053713dHLJFF = C20052513d5.LJFF(interfaceC1691470u7N);
        if (!c20053713dHLJFF.LJIJJ()) {
            return;
        }
        if (c20053713dHLJFF.LLJLLIL.LIZJ != j1VarLIZLLL) {
            float fLIZJ = C1676820tjk.LIZJ(j);
            long jFloatToRawIntBits = Float.floatToRawIntBits((int) (j >> 32));
            long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(fLIZJ)) & 4294967295L;
            j1 j1Var = c20053713dHLJFF.LLJLLIL.LIZJ;
            j1Var.getClass();
            C1676820tjk.LIZJ(C1680450tpb.LIZJ(j1Var.LJIL(j1VarLIZLLL, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32))));
            obj = new Object(interfaceC1691470u7N) { // from class: X.13eD
                public final InterfaceC1691470u7N LIZ;

                {
                    this.LIZ = interfaceC1691470u7N;
                }
            };
        } else {
            obj = new Object(interfaceC1691470u7N) { // from class: X.13eD
                public final InterfaceC1691470u7N LIZ;

                {
                    this.LIZ = interfaceC1691470u7N;
                }
            };
        }
        this.LJ.invoke((C20059513eD) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C20059013e8(C20059113e9 c20059113e9, int i, long j, long j2, InterfaceC1691470u7N interfaceC1691470u7N, Function1<? super C20059513eD, Unit> function1) {
        this.LJIIJ = c20059113e9;
        this.LIZ = i;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = interfaceC1691470u7N;
        this.LJ = function1;
        this.LJIIIIZZ = -j;
    }
}
