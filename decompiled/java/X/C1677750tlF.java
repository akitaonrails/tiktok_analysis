package X;

import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: X.0tlF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1677750tlF {
    public C08LR LIZ;
    public final C19968013Aw<C1677730tlD<?, ?>> LIZIZ = new C19968013Aw<>(new C1677730tlD[16]);
    public final C05P0 LIZJ = C20028913Yh.LJI(Boolean.FALSE);
    public long LIZLLL = Long.MIN_VALUE;
    public final C05P0 LJ = C20028913Yh.LJI(Boolean.TRUE);

    public final InterfaceC1675680thu LIZIZ() {
        C08LR c08lr = this.LIZ;
        if (c08lr instanceof C08LT) {
            c08lr.getClass();
            return C1671550tbF.LIZLLL((int) 0, 0, new C1677710tlB(0.0f, 0.0f, 0.0f, 0.0f), 2);
        }
        if (c08lr instanceof C08LS) {
            C08LS c08ls = (C08LS) c08lr;
            return C1671550tbF.LIZJ((float) (((double) c08ls.LIZIZ) / (((double) 2) * Math.sqrt(c08ls.LIZ))), c08ls.LIZ, null, 4);
        }
        if (c08lr instanceof C08LQ) {
            c08lr.getClass();
            double d = 0.0f;
            Pair<Double, Double> pairLIZ = C08LN.LIZ(d, d);
            return C1671550tbF.LIZJ((float) (pairLIZ.getSecond().doubleValue() / (((double) 2) * Math.sqrt(pairLIZ.getFirst().doubleValue()))), (float) pairLIZ.getFirst().doubleValue(), null, 4);
        }
        if (!(c08lr instanceof C08LO)) {
            throw new C1954807lC();
        }
        c08lr.getClass();
        double d2 = 0.0f;
        double d3 = 39.47841760435743d / d2;
        return C1671550tbF.LIZJ((float) (((((double) ((1 - 0.0f) * 4)) * 3.141592653589793d) / d2) / (((double) 2) * Math.sqrt(d3))), (float) d3, null, 4);
    }

    public static float LIZJ(CoroutineContext coroutineContext) {
        InterfaceC1677690tl9 interfaceC1677690tl9 = (InterfaceC1677690tl9) coroutineContext.get(InterfaceC1677690tl9.LJLJJI);
        if (interfaceC1677690tl9 != null) {
            float fLJLJI = interfaceC1677690tl9.LJLJI();
            if (fLJLJI < 0.0f) {
                "negative scale factor".toString();
                throw new IllegalStateException("negative scale factor");
            }
            return fLJLJI;
        }
        return 1.0f;
    }

    public C1677750tlF(C08LS c08ls, C08LR c08lr) {
        this.LIZ = c08ls;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.InterfaceC1680500tpg r4, int r5) {
        /*
            r3 = this;
            r0 = -1242778805(0xffffffffb5ecb34b, float:-1.7635551E-6)
            X.13ZC r2 = r4.LJIIJ(r0)
            r0 = r5 & 6
            r1 = 2
            if (r0 != 0) goto L7e
            boolean r0 = r2.LJII(r3)
            if (r0 == 0) goto L7c
            r0 = 4
        L13:
            r0 = r0 | r5
        L14:
            r0 = r0 & 3
            if (r0 != r1) goto L30
            boolean r0 = r2.LIZ()
            if (r0 == 0) goto L30
            r2.LIZJ()
        L21:
            X.13Ys r2 = r2.LJJJJZI()
            if (r2 == 0) goto L2f
            Y.AObjectS108S0101000_25 r1 = new Y.AObjectS108S0101000_25
            r0 = 3
            r1.<init>(r5, r3, r0)
            r2.LIZLLL = r1
        L2f:
            return
        L30:
            X.05P0 r0 = r3.LJ
            X.13FE r0 = (X.C13FE) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L50
            X.05P0 r0 = r3.LIZJ
            X.13FE r0 = (X.C13FE) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L21
        L50:
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r2.LJJIIJZLJL(r0)
            boolean r0 = r2.LJII(r3)
            java.lang.Object r1 = r2.LJJ()
            if (r0 != 0) goto L69
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r1 != r0) goto L72
        L69:
            X.0tlG r1 = new X.0tlG
            r0 = 0
            r1.<init>(r3, r0)
            r2.LJJIJIIJI(r1)
        L72:
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            r0 = 0
            r2.LJJJJL(r0)
            X.C1680540tpk.LJFF(r3, r1, r2)
            goto L21
        L7c:
            r0 = 2
            goto L13
        L7e:
            r0 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1677750tlF.LIZ(X.0tpg, int):void");
    }
}
