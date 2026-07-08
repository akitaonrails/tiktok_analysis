package X;

import kotlin.jvm.internal.Intrinsics;
import p2.j1;

/* JADX INFO: renamed from: X.13ep, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20063313ep extends AbstractC20055413dY implements C13WL, InterfaceC20056813dm, InterfaceC1693210uAB {
    public EnumC1684030tvN LLJJ;
    public final C20082713hx LLJJI;
    public boolean LLJJIII;
    public InterfaceC20063613es LLJJIJI;
    public InterfaceC1692950u9l LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJJIL;
    public final C13YD LLJJIJIIJIL = new C13YD();
    public long LLJJJJ = 0;

    @Override // X.InterfaceC20056813dm
    public final /* synthetic */ void LLFF(j1 j1Var) {
    }

    @Override // X.AbstractC20055413dY
    public final boolean LLILLJJLI() {
        return false;
    }

    public final C1683130ttv LLJJI() {
        if (!this.LLJILLL) {
            return null;
        }
        j1 j1VarLJ = C20052513d5.LJ(this);
        InterfaceC1692950u9l interfaceC1692950u9l = this.LLJJIJIL;
        if (interfaceC1692950u9l == null || !interfaceC1692950u9l.LIZLLL()) {
            return null;
        }
        return j1VarLJ.LJJJJZI(interfaceC1692950u9l, false);
    }

    public final void LLJJIJI() {
        InterfaceC20063613es interfaceC20063613es = this.LLJJIJI;
        if (interfaceC20063613es == null) {
            interfaceC20063613es = (InterfaceC20063613es) C20061513eX.LIZ(this, C20063713et.LIZ);
        }
        if (!(!this.LLJJJJJIL)) {
            C1691080u6k.LIZJ("launchAnimation called when previous animation was running");
        }
        InterfaceC20063613es.LIZ.getClass();
        C23250099c.LIZLLL(LLILLIZIL(), null, C099V.UNDISPATCHED, new C20063413eq(this, new C1677660tl6(C20063813eu.LIZIZ), interfaceC20063613es, null), 1);
    }

    @Override // X.C13WL
    public final C1683130ttv LJJJJLI(C1683130ttv c1683130ttv) {
        if (!(!C1682900ttY.LIZIZ(this.LLJJJJ, 0L))) {
            C1691080u6k.LIZJ("Expected BringIntoViewRequester to not be used before parents are placed.");
        }
        return c1683130ttv.LJIIIZ(LLJJIJIIJIL(this.LLJJJJ, c1683130ttv) ^ (-9223372034707292160L));
    }

    @Override // X.InterfaceC20056813dm
    public final void LJJLJ(long j) {
        int iLJI;
        C1683130ttv c1683130ttvLLJJI;
        long j2 = this.LLJJJJ;
        this.LLJJJJ = j;
        int i = C1684190tvd.LIZ[this.LLJJ.ordinal()];
        if (i != 1) {
            if (i == 2) {
                iLJI = Intrinsics.LJI((int) (j >> 32), (int) (j2 >> 32));
            } else {
                throw new C1954807lC();
            }
        } else {
            iLJI = Intrinsics.LJI((int) (j & 4294967295L), (int) (4294967295L & j2));
        }
        if (iLJI < 0 && !this.LLJJJJJIL && !this.LLJJJ && (c1683130ttvLLJJI = LLJJI()) != null && LLJJIII(j2, c1683130ttvLLJJI)) {
            this.LLJJJIL = true;
        }
    }

    public static final float LLJJ(C20063313ep c20063313ep, InterfaceC20063613es interfaceC20063613es) {
        C1683130ttv c1683130ttvLLJJI;
        int iCompare;
        if (!C1682900ttY.LIZIZ(c20063313ep.LLJJJJ, 0L)) {
            C19968013Aw<C13YA> c19968013Aw = c20063313ep.LLJJIJIIJIL.LIZ;
            int i = c19968013Aw.LLILLL - 1;
            C13YA[] c13yaArr = c19968013Aw.LL;
            if (i < c13yaArr.length) {
                c1683130ttvLLJJI = null;
                while (true) {
                    if (i >= 0) {
                        C1683130ttv c1683130ttvInvoke = c13yaArr[i].LIZ.invoke();
                        if (c1683130ttvInvoke != null) {
                            long jLIZLLL = c1683130ttvInvoke.LIZLLL();
                            long jLIZIZ = C1296570jqR.LIZIZ(c20063313ep.LLJJJJ);
                            int i2 = C1684190tvd.LIZ[c20063313ep.LLJJ.ordinal()];
                            if (i2 != 1) {
                                if (i2 == 2) {
                                    iCompare = Float.compare(Float.intBitsToFloat((int) (jLIZLLL >> 32)), Float.intBitsToFloat((int) (jLIZIZ >> 32)));
                                } else {
                                    throw new C1954807lC();
                                }
                            } else {
                                iCompare = Float.compare(Float.intBitsToFloat((int) (jLIZLLL & 4294967295L)), Float.intBitsToFloat((int) (jLIZIZ & 4294967295L)));
                            }
                            if (iCompare <= 0) {
                                c1683130ttvLLJJI = c1683130ttvInvoke;
                            } else if (c1683130ttvLLJJI == null) {
                                c1683130ttvLLJJI = c1683130ttvInvoke;
                            }
                        }
                        i--;
                    } else if (c1683130ttvLLJJI == null) {
                    }
                }
            } else if (!c20063313ep.LLJJJ || (c1683130ttvLLJJI = c20063313ep.LLJJI()) == null) {
                return 0.0f;
            }
            long jLIZIZ2 = C1296570jqR.LIZIZ(c20063313ep.LLJJJJ);
            int i3 = C1684190tvd.LIZ[c20063313ep.LLJJ.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    float f = c1683130ttvLLJJI.LIZ;
                    return interfaceC20063613es.LIZ(f, c1683130ttvLLJJI.LIZJ - f, Float.intBitsToFloat((int) (jLIZIZ2 >> 32)));
                }
                throw new C1954807lC();
            }
            float f2 = c1683130ttvLLJJI.LIZIZ;
            return interfaceC20063613es.LIZ(f2, c1683130ttvLLJJI.LIZLLL - f2, Float.intBitsToFloat((int) (jLIZIZ2 & 4294967295L)));
        }
        return 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008b  */
    @Override // X.C13WL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIIJZLJL(X.C13WK r12, X.InterfaceC1364105Vn r13) {
        /*
            r11 = this;
            java.lang.Object r2 = r12.invoke()
            X.0ttv r2 = (X.C1683130ttv) r2
            r8 = 0
            r9 = 1
            if (r2 == 0) goto Lc3
            long r0 = r11.LLJJJJ
            boolean r0 = r11.LLJJIII(r0, r2)
            if (r0 != 0) goto Lc3
            X.1DEt r7 = new X.1DEt
            X.05Vn r0 = X.C099M.LIZLLL(r13)
            r7.<init>(r9, r0)
            r7.LJIJJ()
            X.13YA r6 = new X.13YA
            r6.<init>(r12, r7)
            X.13YD r5 = r11.LLJJIJIIJIL
            r5.getClass()
            java.lang.Object r10 = r12.invoke()
            X.0ttv r10 = (X.C1683130ttv) r10
            if (r10 != 0) goto L4c
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C189200o6.m2constructorimpl(r0)
            r7.resumeWith(r0)
        L38:
            java.lang.Object r1 = r7.LJIJ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 != r0) goto L45
            X.C099Q.LIZJ(r13)
        L45:
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 != r0) goto Lc0
            return r1
        L4c:
            kotlin.jvm.internal.AwS396S0200000_30 r1 = new kotlin.jvm.internal.AwS396S0200000_30
            r0 = 40
            r1.<init>(r5, r6, r0)
            r7.LJJII(r1)
            X.13Aw<X.13YA> r0 = r5.LIZ
            int r0 = r0.LLILLL
            kotlin.ranges.IntRange r0 = X.C13LZ.LJIILJJIL(r8, r0)
            int r4 = r0.LL
            int r3 = r0.LLILLJJLI
            if (r4 > r3) goto Lba
        L64:
            X.13Aw<X.13YA> r0 = r5.LIZ
            T[] r0 = r0.LL
            r0 = r0[r3]
            X.13YA r0 = (X.C13YA) r0
            kotlin.jvm.functions.Function0<X.0ttv> r0 = r0.LIZ
            java.lang.Object r2 = r0.invoke()
            X.0ttv r2 = (X.C1683130ttv) r2
            if (r2 == 0) goto Lb5
            X.0ttv r1 = r10.LJFF(r2)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r10)
            if (r0 == 0) goto L8f
            X.13Aw<X.13YA> r1 = r5.LIZ
            int r0 = r3 + 1
            r1.LIZJ(r0, r6)
        L87:
            boolean r0 = r11.LLJJJJJIL
            if (r0 != 0) goto L38
            r11.LLJJIJI()
            goto L38
        L8f:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r2)
            if (r0 != 0) goto Lb5
            java.util.concurrent.CancellationException r2 = new java.util.concurrent.CancellationException
            java.lang.String r0 = "bringIntoView call interrupted by a newer, non-overlapping call"
            r2.<init>(r0)
            X.13Aw<X.13YA> r0 = r5.LIZ
            int r1 = r0.LLILLL
            int r1 = r1 - r9
            if (r1 > r3) goto Lb5
        La3:
            X.13Aw<X.13YA> r0 = r5.LIZ
            T[] r0 = r0.LL
            r0 = r0[r3]
            X.13YA r0 = (X.C13YA) r0
            X.14Gf<kotlin.Unit> r0 = r0.LIZIZ
            r0.LJJIIZ(r2)
            if (r1 == r3) goto Lb5
            int r1 = r1 + 1
            goto La3
        Lb5:
            if (r3 == r4) goto Lba
            int r3 = r3 + (-1)
            goto L64
        Lba:
            X.13Aw<X.13YA> r0 = r5.LIZ
            r0.LIZJ(r8, r6)
            goto L87
        Lc0:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        Lc3:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20063313ep.LJJIIJZLJL(X.13WK, X.05Vn):java.lang.Object");
    }

    public final boolean LLJJIII(long j, C1683130ttv c1683130ttv) {
        long jLLJJIJIIJIL = LLJJIJIIJIL(j, c1683130ttv);
        if (Math.abs(Float.intBitsToFloat((int) (jLLJJIJIIJIL >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jLLJJIJIIJIL & 4294967295L))) <= 0.5f) {
            return true;
        }
        return false;
    }

    public final long LLJJIJIIJIL(long j, C1683130ttv c1683130ttv) {
        long jLIZIZ = C1296570jqR.LIZIZ(j);
        int i = C1684190tvd.LIZ[this.LLJJ.ordinal()];
        if (i != 1) {
            if (i == 2) {
                InterfaceC20063613es interfaceC20063613es = this.LLJJIJI;
                if (interfaceC20063613es == null) {
                    interfaceC20063613es = (InterfaceC20063613es) C20061513eX.LIZ(this, C20063713et.LIZ);
                }
                float f = c1683130ttv.LIZ;
                return (((long) Float.floatToRawIntBits(interfaceC20063613es.LIZ(f, c1683130ttv.LIZJ - f, Float.intBitsToFloat((int) (jLIZIZ >> 32))))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
            }
            throw new C1954807lC();
        }
        InterfaceC20063613es interfaceC20063613es2 = this.LLJJIJI;
        if (interfaceC20063613es2 == null) {
            interfaceC20063613es2 = (InterfaceC20063613es) C20061513eX.LIZ(this, C20063713et.LIZ);
        }
        float f2 = c1683130ttv.LIZIZ;
        float fLIZ = interfaceC20063613es2.LIZ(f2, c1683130ttv.LIZLLL - f2, Float.intBitsToFloat((int) (jLIZIZ & 4294967295L)));
        return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fLIZ)) & 4294967295L);
    }

    public C20063313ep(EnumC1684030tvN enumC1684030tvN, C20082713hx c20082713hx, boolean z, InterfaceC20063613es interfaceC20063613es) {
        this.LLJJ = enumC1684030tvN;
        this.LLJJI = c20082713hx;
        this.LLJJIII = z;
        this.LLJJIJI = interfaceC20063613es;
    }
}
