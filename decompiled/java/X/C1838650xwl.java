package X;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0xwl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1838650xwl implements InterfaceC1838630xwj {
    public final InterfaceC1838630xwj LL;
    public final C1791250wiJ LLILLJJLI = new C1791250wiJ();

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final InterfaceC23272099y getKey() {
        return InterfaceC1838630xwj.LIZJ;
    }

    public C1838650xwl(InterfaceC1838630xwj interfaceC1838630xwj) {
        this.LL = interfaceC1838630xwj;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final <E extends CoroutineContext.Element> E get(InterfaceC23272099y<E> interfaceC23272099y) {
        return (E) C09A1.LIZIZ(this, interfaceC23272099y);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(InterfaceC23272099y<?> interfaceC23272099y) {
        return C09A1.LIZJ(this, interfaceC23272099y);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return C09A1.LIZLLL(this, coroutineContext);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0089  */
    @Override // X.InterfaceC1838630xwj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJLZ(X.InterfaceC1364105Vn r8, kotlin.jvm.functions.Function1 r9) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C1838710xwr
            if (r0 == 0) goto L89
            r4 = r8
            X.0xwr r4 = (X.C1838710xwr) r4
            int r2 = r4.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L89
            int r2 = r2 - r1
            r4.LLILZIL = r2
        L12:
            java.lang.Object r2 = r4.LLILLL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r4.LLILZIL
            r3 = 2
            r1 = 1
            if (r0 == 0) goto L26
            if (r0 == r1) goto L72
            if (r0 != r3) goto L8f
            X.C155000ia.LIZIZ(r2)
        L25:
            return r2
        L26:
            X.C155000ia.LIZIZ(r2)
            X.0wiJ r6 = r7.LLILLJJLI
            r4.LL = r7
            r4.LLILLJJLI = r9
            r4.LLILZIL = r1
            boolean r0 = r6.LIZ()
            if (r0 == 0) goto L3c
            kotlin.Unit r1 = kotlin.Unit.LIZ
        L39:
            if (r1 != r5) goto L70
            return r5
        L3c:
            X.1DEt r2 = new X.1DEt
            X.05Vn r0 = X.C099M.LIZLLL(r4)
            r2.<init>(r1, r0)
            r2.LJIJJ()
            java.lang.Object r1 = r6.LIZ
            monitor-enter(r1)
            java.util.List<X.05Vn<kotlin.Unit>> r0 = r6.LIZIZ     // Catch: java.lang.Throwable -> L97
            r0.add(r2)     // Catch: java.lang.Throwable -> L97
            monitor-exit(r1)
            kotlin.jvm.internal.AwS393S0200000_27 r1 = new kotlin.jvm.internal.AwS393S0200000_27
            r0 = 0
            r1.<init>(r6, r2, r0)
            r2.LJJII(r1)
            java.lang.Object r1 = r2.LJIJ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 != r0) goto L67
            X.C099Q.LIZJ(r4)
        L67:
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 == r0) goto L39
            kotlin.Unit r1 = kotlin.Unit.LIZ
            goto L39
        L70:
            r0 = r7
            goto L79
        L72:
            kotlin.jvm.functions.Function1 r9 = r4.LLILLJJLI
            X.0xwl r0 = r4.LL
            X.C155000ia.LIZIZ(r2)
        L79:
            X.0xwj r1 = r0.LL
            r0 = 0
            r4.LL = r0
            r4.LLILLJJLI = r0
            r4.LLILZIL = r3
            java.lang.Object r2 = r1.LJLZ(r4, r9)
            if (r2 != r5) goto L25
            return r5
        L89:
            X.0xwr r4 = new X.0xwr
            r4.<init>(r7, r8)
            goto L12
        L8f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L97:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L97
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1838650xwl.LJLZ(X.05Vn, kotlin.jvm.functions.Function1):java.lang.Object");
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) C09A1.LIZ(this, r, function2);
    }
}
