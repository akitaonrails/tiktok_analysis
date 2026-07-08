package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0YLE, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YLE {
    public final C0YEM LIZ;
    public final Function1<Long, Unit> LIZIZ;
    public final Function0<Double> LIZJ;

    public C0YLE(C0YEM c0yem) {
        C2179108gH c2179108gH = C2179108gH.LL;
        C0BE7 c0be7 = new C0BE7();
        this.LIZ = c0yem;
        this.LIZIZ = c2179108gH;
        this.LIZJ = c0be7;
    }

    public final void LIZ(C0YLC c0ylc) {
        int iLIZJ = LIZJ(c0ylc);
        if (iLIZJ > 0) {
            try {
                this.LIZIZ.invoke(Long.valueOf(iLIZJ));
            } catch (InterruptedException e) {
                TryCatchGuardChecker.doCheck(e);
                C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("delay failed for flow ");
                sbLIZ.append(c0ylc);
                sbLIZ.append(", with delay ");
                sbLIZ.append(iLIZJ);
                c868780Y6iLIZLLL.LJIIIIZZ("CoreReversalHelper", C2188811AlT.LIZIZ(sbLIZ), e);
            }
        }
    }

    public final int LIZJ(C0YLC c0ylc) {
        int i = C0YLD.LIZ[c0ylc.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return this.LIZ.LJIIIZ().LJJJLZIJ.LJI;
                    }
                    throw new C1954807lC();
                }
                return this.LIZ.LJIIIZ().LJJJLZIJ.LJ;
            }
            return this.LIZ.LJIIIZ().LJJJLZIJ.LIZJ;
        }
        return this.LIZ.LJIIIZ().LJJJLZIJ.LIZ;
    }

    public final boolean LIZLLL(C0YLC c0ylc) {
        int i;
        int i2 = C0YLD.LIZ[c0ylc.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        i = this.LIZ.LJIIIZ().LJJJLZIJ.LJII;
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    i = this.LIZ.LJIIIZ().LJJJLZIJ.LJFF;
                }
            } else {
                i = this.LIZ.LJIIIZ().LJJJLZIJ.LIZLLL;
            }
        } else {
            i = this.LIZ.LJIIIZ().LJJJLZIJ.LIZIZ;
        }
        if (i <= 0) {
            return false;
        }
        if (this.LIZJ.invoke().doubleValue() < 1.0d / ((double) i)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C0YLC r7, X.InterfaceC1364105Vn<? super java.lang.Integer> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C0YLF
            if (r0 == 0) goto L24
            r5 = r8
            X.0YLF r5 = (X.C0YLF) r5
            int r2 = r5.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r5.LLILZIL = r2
        L12:
            java.lang.Object r1 = r5.LLILLL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILZIL
            r2 = 1
            if (r0 == 0) goto L32
            if (r0 != r2) goto L2a
            int r4 = r5.LLILLJJLI
            X.0YLC r7 = r5.LL
            goto L49
        L24:
            X.0YLF r5 = new X.0YLF
            r5.<init>(r6, r8)
            goto L12
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r1)
            int r4 = r6.LIZJ(r7)
            if (r4 <= 0) goto L7a
            long r0 = (long) r4
            r5.LL = r7     // Catch: java.lang.InterruptedException -> L51
            r5.LLILLJJLI = r4     // Catch: java.lang.InterruptedException -> L51
            r5.LLILZIL = r2     // Catch: java.lang.InterruptedException -> L51
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r5)     // Catch: java.lang.InterruptedException -> L51
            if (r0 != r3) goto L4c
            return r3
        L49:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.InterruptedException -> L53
        L4c:
            java.lang.Integer r0 = X.C2286608xc.LJ(r4)     // Catch: java.lang.InterruptedException -> L53
            return r0
        L51:
            r3 = move-exception
            goto L54
        L53:
            r3 = move-exception
        L54:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)
            X.0YEM r0 = r6.LIZ
            X.0Y6i r2 = r0.LIZLLL()
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "delay failed for flow "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = ", with delay "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "CoreReversalHelper"
            r2.LJIIIIZZ(r0, r1, r3)
        L7a:
            r0 = 0
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0YLE.LIZIZ(X.0YLC, X.05Vn):java.lang.Object");
    }
}
