package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.coroutines.CoroutineContext;
import njp.a;

/* JADX INFO: renamed from: X.0pZ1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1516410pZ1<R> implements C05ZT, InterfaceC1690500u5o, InterfaceC1364105Vn<R> {
    public final InterfaceC1364105Vn<R> LL;
    public final /* synthetic */ C20065413fA LLILLJJLI;
    public InterfaceC20236714Gf<? super C20067313fT> LLILLL;
    public EnumC20065813fE LLILZ = EnumC20065813fE.Main;
    public final C23271099x LLILZIL = C23271099x.INSTANCE;
    public final /* synthetic */ C20065413fA LLILZLL;

    @Override // X.InterfaceC1681050tqZ
    public final float LJJ() {
        return this.LLILLJJLI.LJJ();
    }

    @Override // X.InterfaceC1690500u5o
    public final float LJJI(int i) {
        return this.LLILLJJLI.LJJI(i);
    }

    @Override // X.InterfaceC1690500u5o
    public final long LJJLIIIJLJLI(long j) {
        C20065413fA c20065413fA = this.LLILLJJLI;
        c20065413fA.getClass();
        return C1682420tsm.LIZLLL(j, c20065413fA);
    }

    @Override // X.InterfaceC1690500u5o
    public final long LJLI(long j) {
        C20065413fA c20065413fA = this.LLILLJJLI;
        c20065413fA.getClass();
        return C1682420tsm.LIZIZ(j, c20065413fA);
    }

    @Override // X.InterfaceC1681050tqZ
    public final long LJLJLJ(float f) {
        C20065413fA c20065413fA = this.LLILLJJLI;
        c20065413fA.getClass();
        return C1685230txJ.LIZIZ(c20065413fA, f);
    }

    @Override // X.InterfaceC1690500u5o
    public final int LJLLJ(float f) {
        C20065413fA c20065413fA = this.LLILLJJLI;
        c20065413fA.getClass();
        return C1682420tsm.LIZ(f, c20065413fA);
    }

    @Override // X.InterfaceC1690500u5o
    public final float LJLLL(long j) {
        C20065413fA c20065413fA = this.LLILLJJLI;
        c20065413fA.getClass();
        return C1682420tsm.LIZJ(j, c20065413fA);
    }

    @Override // X.InterfaceC1681050tqZ
    public final float LLI(long j) {
        C20065413fA c20065413fA = this.LLILLJJLI;
        c20065413fA.getClass();
        return C1685230txJ.LIZ(c20065413fA, j);
    }

    @Override // X.InterfaceC1690500u5o
    public final float LLIIIJ(float f) {
        return this.LLILLJJLI.LLIIIJ(f);
    }

    @Override // X.InterfaceC1690500u5o
    public final float getDensity() {
        return this.LLILLJJLI.getDensity();
    }

    @Override // X.C05ZT
    public final long LIZ() {
        return this.LLILZLL.LLJJJJLIIL;
    }

    @Override // X.C05ZT
    public final C20067313fT LJJJJJL() {
        return this.LLILZLL.LLJJIJIL;
    }

    @Override // X.C05ZT
    public final long LJJLL() {
        C20065413fA c20065413fA = this.LLILZLL;
        long jLIZLLL = C1682420tsm.LIZLLL(c20065413fA.getViewConfiguration().LIZLLL(), c20065413fA);
        long j = c20065413fA.LLJJJJLIIL;
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jLIZLLL >> 32)) - ((int) (j >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jLIZLLL & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L);
    }

    @Override // X.C05ZT
    public final InterfaceC1374305Zl getViewConfiguration() {
        return this.LLILZLL.getViewConfiguration();
    }

    @Override // X.InterfaceC1364105Vn
    public final CoroutineContext getContext() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1690500u5o
    public final float LJJJJLL(float f) {
        return f * this.LLILLJJLI.getDensity();
    }

    @Override // X.InterfaceC1364105Vn
    public final void resumeWith(Object obj) {
        C20065413fA c20065413fA = this.LLILZLL;
        synchronized (c20065413fA.LLJJJIL) {
            try {
                c20065413fA.LLJJJ.LJIIL(this);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        this.LL.resumeWith(obj);
    }

    public C1516410pZ1(C20065413fA c20065413fA, C2252611DEt c2252611DEt) {
        this.LLILZLL = c20065413fA;
        this.LL = c2252611DEt;
        this.LLILLJJLI = c20065413fA;
    }

    @Override // X.C05ZT
    public final Object LJJIJIL(EnumC20065813fE enumC20065813fE, a aVar) {
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(aVar));
        c2252611DEt.LJIJJ();
        this.LLILZ = enumC20065813fE;
        this.LLILLL = c2252611DEt;
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(aVar);
        }
        return objLJIJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlinx.coroutines.JobSupport] */
    /* JADX WARN: Type inference failed for: r2v6, types: [kotlinx.coroutines.JobSupport] */
    @Override // X.C05ZT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object LJJJJIZL(long r8, kotlin.jvm.functions.Function2<? super X.C05ZT, ? super X.InterfaceC1364105Vn<? super T>, ? extends java.lang.Object> r10, X.InterfaceC1364105Vn<? super T> r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof X.C1516350pYv
            if (r0 == 0) goto L22
            r5 = r11
            X.0pYv r5 = (X.C1516350pYv) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r1 = r5.LLILLJJLI
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r4 = 1
            if (r0 == 0) goto L34
            if (r0 != r4) goto L2c
            X.0956 r2 = r5.LL
            goto L28
        L22:
            X.0pYv r5 = new X.0pYv
            r5.<init>(r7, r11)
            goto L12
        L28:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L73
            goto L6d
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            X.C155000ia.LIZIZ(r1)
            r1 = 0
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 > 0) goto L51
            X.14Gf<? super X.13fT> r2 = r7.LLILLL
            if (r2 == 0) goto L51
            X.0pYx r1 = new X.0pYx
            r1.<init>(r8)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            r2.resumeWith(r0)
        L51:
            X.13fA r0 = r7.LLILZLL
            X.01wk r3 = r0.LLILLIZIL()
            X.0pYu r2 = new X.0pYu
            r1 = 0
            r2.<init>(r8, r7, r1)
            r0 = 3
            X.0956 r2 = X.C23250099c.LIZLLL(r3, r1, r1, r2, r0)
            r5.LL = r2     // Catch: java.lang.Throwable -> L73
            r5.LLILZ = r4     // Catch: java.lang.Throwable -> L73
            java.lang.Object r1 = r10.invoke(r7, r5)     // Catch: java.lang.Throwable -> L73
            if (r1 != r6) goto L6d
            return r6
        L6d:
            X.0pZ0 r0 = new java.util.concurrent.CancellationException() { // from class: X.0pZ0
                public static final int $stable = 0;

                static {
                    /*
                        X.0pZ0 r0 = new X.0pZ0
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0pZ0) X.0pZ0.INSTANCE X.0pZ0
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1516400pZ0.<clinit>():void");
                }

                @Override // java.lang.Throwable
                public java.lang.Throwable fillInStackTrace() {
                    /*
                        r1 = this;
                        java.lang.StackTraceElement[] r0 = X.C1516380pYy.LIZ
                        r1.setStackTrace(r0)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1516400pZ0.fillInStackTrace():java.lang.Throwable");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1516400pZ0.<init>():void");
                }
            }
            r2.LIZIZ(r0)
            return r1
        L73:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L73
            X.0pZ0 r0 = X.C1516400pZ0.INSTANCE
            r2.LIZIZ(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1516410pZ1.LJJJJIZL(long, kotlin.jvm.functions.Function2, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // X.C05ZT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LLD(long r6, X.C05V8 r8, X.InterfaceC1364105Vn r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof X.C1516360pYw
            if (r0 == 0) goto L20
            r4 = r9
            X.0pYw r4 = (X.C1516360pYw) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILLL
            r0 = 1
            if (r1 == 0) goto L32
            if (r1 != r0) goto L2a
            goto L26
        L20:
            X.0pYw r4 = new X.0pYw
            r4.<init>(r5, r9)
            goto L12
        L26:
            X.C155000ia.LIZIZ(r3)     // Catch: X.C1516370pYx -> L3e
            return r3
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r3)
            r4.LLILLL = r0     // Catch: X.C1516370pYx -> L3e
            java.lang.Object r3 = r5.LJJJJIZL(r6, r8, r4)     // Catch: X.C1516370pYx -> L3e
            if (r3 != r2) goto L43
            return r2
        L3e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r3 = 0
        L43:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1516410pZ1.LLD(long, X.05V8, X.05Vn):java.lang.Object");
    }
}
