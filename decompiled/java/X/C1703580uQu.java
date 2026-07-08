package X;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uQu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1703580uQu {
    public final InterfaceC1703600uQw LIZ;
    public final Function0<Long> LIZIZ;
    public final InterfaceC497601wk LIZJ;
    public final boolean LIZLLL;
    public final C2252321DDq LJ;
    public AnonymousClass0956 LJFF;
    public AnonymousClass0956 LJI;
    public volatile long LJII;
    public volatile long LJIIIIZZ;
    public volatile int LJIIIZ;

    public C1703580uQu() {
        this(null, 7);
    }

    public static long LIZ(long j, long j2, long j3) {
        long j4 = j - j2;
        if (j4 < 0) {
            j4 = 0;
        }
        return j4 <= j3 ? j4 : j3;
    }

    public final void LIZIZ() {
        AnonymousClass0956 anonymousClass0956 = this.LJFF;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        AnonymousClass0956 anonymousClass09562 = this.LJI;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
        this.LJFF = null;
        this.LJI = null;
    }

    public final void LIZJ() {
        InterfaceC1703170uQF interfaceC1703170uQF = (InterfaceC1703170uQF) this.LJ.getValue();
        if (interfaceC1703170uQF instanceof C1703160uQE) {
            LIZIZ();
            LJFF(((C1703160uQE) interfaceC1703170uQF).LIZ);
        } else {
            if (!(interfaceC1703170uQF instanceof C1703150uQD) && !Intrinsics.LJFF(interfaceC1703170uQF, C1703190uQH.LIZ) && !Intrinsics.LJFF(interfaceC1703170uQF, new InterfaceC1703170uQF() { // from class: X.0uQG
                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C1703180uQG);
                }

                public final int hashCode() {
                    return 862409477;
                }

                public final String toString() {
                    return "Stopped";
                }
            })) {
                throw new C1954807lC();
            }
            LIZIZ();
        }
        this.LJ.setValue(new InterfaceC1703170uQF() { // from class: X.0uQG
            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1703180uQG);
            }

            public final int hashCode() {
                return 862409477;
            }

            public final String toString() {
                return "Stopped";
            }
        });
        if (this.LIZLLL) {
            C2296808zG.LIZJ(this.LIZJ, null);
        }
    }

    public final void LJ() {
        InterfaceC1703170uQF interfaceC1703170uQF = (InterfaceC1703170uQF) this.LJ.getValue();
        if (interfaceC1703170uQF instanceof C1703160uQE) {
            LIZIZ();
            C1703160uQE c1703160uQE = (C1703160uQE) interfaceC1703170uQF;
            LJFF(c1703160uQE.LIZ);
            this.LJ.setValue(new C1703150uQD(c1703160uQE.LIZ));
        }
    }

    public final void LJI() {
        InterfaceC1703170uQF interfaceC1703170uQF = (InterfaceC1703170uQF) this.LJ.getValue();
        if (interfaceC1703170uQF instanceof C1703150uQD) {
            long jLongValue = this.LIZIZ.invoke().longValue();
            this.LJII = jLongValue;
            this.LJIIIIZZ = jLongValue;
            C1703150uQD c1703150uQD = (C1703150uQD) interfaceC1703170uQF;
            this.LJ.setValue(new C1703160uQE(c1703150uQD.LIZ, jLongValue));
            if (c1703150uQD.LIZ.LJ) {
                this.LJFF = C23250099c.LIZLLL(this.LIZJ, null, null, new C1703130uQB(this, interfaceC1703170uQF, null), 3);
            }
            if (c1703150uQD.LIZ.LJFF) {
                this.LJI = C23250099c.LIZLLL(this.LIZJ, null, null, new C1703140uQC(this, interfaceC1703170uQF, null), 3);
            }
        }
    }

    public static int LIZLLL(C1703590uQv c1703590uQv) {
        return (int) (((c1703590uQv.LIZIZ() + c1703590uQv.LIZ()) - 1) / c1703590uQv.LIZ());
    }

    public final void LJFF(C1703590uQv c1703590uQv) {
        long jLIZIZ;
        int i;
        long jLongValue = this.LIZIZ.invoke().longValue();
        if (c1703590uQv.LJ) {
            this.LIZ.LIZ(new C1703630uQz(c1703590uQv, EnumC1704050uRf.V1, LIZ(jLongValue, this.LJII, c1703590uQv.LIZIZ()), c1703590uQv.LIZJ, true));
        }
        if (c1703590uQv.LJFF) {
            InterfaceC1703600uQw interfaceC1703600uQw = this.LIZ;
            EnumC1704050uRf enumC1704050uRf = EnumC1704050uRf.V2;
            long j = this.LJIIIIZZ;
            if (this.LJIIIZ < LIZLLL(c1703590uQv)) {
                jLIZIZ = c1703590uQv.LIZ();
            } else {
                jLIZIZ = c1703590uQv.LIZIZ();
            }
            long jLIZ = LIZ(jLongValue, j, jLIZIZ);
            if (this.LJIIIZ < LIZLLL(c1703590uQv)) {
                i = c1703590uQv.LIZLLL;
            } else {
                i = c1703590uQv.LIZJ;
            }
            interfaceC1703600uQw.LIZ(new C1703630uQz(c1703590uQv, enumC1704050uRf, jLIZ, i, true));
        }
    }

    public C1703580uQu(InterfaceC1703600uQw interfaceC1703600uQw, int i) {
        AFwS187S0000000_2 aFwS187S0000000_2;
        interfaceC1703600uQw = (i & 1) != 0 ? C1703620uQy.LIZ : interfaceC1703600uQw;
        if ((i & 2) != 0) {
            aFwS187S0000000_2 = AFwS187S0000000_2.get$arr$(978);
        } else {
            aFwS187S0000000_2 = null;
        }
        this.LIZ = interfaceC1703600uQw;
        this.LIZIZ = aFwS187S0000000_2;
        this.LIZJ = C2296808zG.LIZ(C0PEM.LIZ.plus(C2296908zH.LIZ()));
        this.LIZLLL = true;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(C1703190uQH.LIZ);
        this.LJ = c2252321DDqLIZ;
        C09IC.LIZIZ(c2252321DDqLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0068 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(X.C1703590uQv r19, X.InterfaceC1364105Vn<? super kotlin.Unit> r20) {
        /*
            r18 = this;
            r5 = r20
            r6 = r19
            boolean r0 = r5 instanceof X.C1703560uQs
            r2 = r18
            if (r0 == 0) goto L6f
            r1 = r5
            X.0uQs r1 = (X.C1703560uQs) r1
            int r4 = r1.LLILZ
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r3
            if (r0 == 0) goto L6f
            int r4 = r4 - r3
            r1.LLILZ = r4
        L18:
            java.lang.Object r4 = r1.LLILLJJLI
            java.lang.Object r0 = X.C099R.LJFF()
            int r3 = r1.LLILZ
            r5 = 1
            if (r3 == 0) goto L6b
            if (r3 != r5) goto L78
            X.0uQv r6 = r1.LL
            X.C155000ia.LIZIZ(r4)
        L2a:
            kotlin.jvm.functions.Function0<java.lang.Long> r3 = r2.LIZIZ
            java.lang.Object r3 = r3.invoke()
            java.lang.Number r3 = (java.lang.Number) r3
            long r12 = r3.longValue()
            X.0uQw r3 = r2.LIZ
            X.0uQz r5 = new X.0uQz
            X.0uRf r7 = X.EnumC1704050uRf.V1
            long r14 = r2.LJII
            long r16 = r6.LIZIZ()
            long r8 = LIZ(r12, r14, r16)
            int r10 = r6.LIZJ
            r11 = 0
            r5.<init>(r6, r7, r8, r10, r11)
            r3.LIZ(r5)
            r2.LJII = r12
            r5 = 1
        L52:
            kotlin.coroutines.CoroutineContext r3 = r1.getContext()
            boolean r3 = X.C23118094a.LJIIIIZZ(r3)
            if (r3 == 0) goto L75
            long r3 = r6.LIZIZ()
            r1.LL = r6
            r1.LLILZ = r5
            java.lang.Object r3 = X.AnonymousClass0958.LIZIZ(r3, r1)
            if (r3 != r0) goto L2a
            return r0
        L6b:
            X.C155000ia.LIZIZ(r4)
            goto L52
        L6f:
            X.0uQs r1 = new X.0uQs
            r1.<init>(r2, r5)
            goto L18
        L75:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L78:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1703580uQu.LJII(X.0uQv, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00a6 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(X.C1703590uQv r23, X.InterfaceC1364105Vn<? super kotlin.Unit> r24) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1703580uQu.LJIIIIZZ(X.0uQv, X.05Vn):java.lang.Object");
    }
}
