package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0tzF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animatePlacementDelta$1", f = "LazyLayoutItemAnimation.kt", l = {141, 148}, m = "invokeSuspend")
public final class C1686430tzF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC1675680thu LL;
    public int LLILLJJLI;
    public final /* synthetic */ C1686480tzK LLILLL;
    public final /* synthetic */ InterfaceC1675680thu<C1676820tjk> LLILZ;
    public final /* synthetic */ long LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1686430tzF(C1686480tzK c1686480tzK, InterfaceC1675680thu<C1676820tjk> interfaceC1675680thu, long j, InterfaceC1364105Vn<? super C1686430tzF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1686480tzK;
        this.LLILZ = interfaceC1675680thu;
        this.LLILZIL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1686430tzF(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008f A[RETURN] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r12.LLILLJJLI
            r5 = 2
            r6 = 1
            if (r0 == 0) goto L1b
            if (r0 == r6) goto L18
            if (r0 != r5) goto L10
            goto L90
        L10:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L18:
            X.0thu r9 = r12.LL
            goto L54
        L1b:
            X.C155000ia.LIZIZ(r13)
            X.0tzK r0 = r12.LLILLL     // Catch: java.util.concurrent.CancellationException -> L9e
            X.0tko<X.0tjk, X.0tkT> r0 = r0.LJIILJJIL     // Catch: java.util.concurrent.CancellationException -> L9e
            boolean r0 = r0.LJ()     // Catch: java.util.concurrent.CancellationException -> L9e
            if (r0 == 0) goto L50
            X.0thu<X.0tjk> r9 = r12.LLILZ     // Catch: java.util.concurrent.CancellationException -> L9e
            boolean r0 = r9 instanceof X.C1676890tjr     // Catch: java.util.concurrent.CancellationException -> L9e
            if (r0 != 0) goto L30
            X.0tjr<X.0tjk> r9 = X.C1675700thw.LIZ     // Catch: java.util.concurrent.CancellationException -> L9e
        L30:
            X.0tzK r0 = r12.LLILLL     // Catch: java.util.concurrent.CancellationException -> L9e
            X.0tko<X.0tjk, X.0tkT> r0 = r0.LJIILJJIL     // Catch: java.util.concurrent.CancellationException -> L9e
            boolean r0 = r0.LJ()     // Catch: java.util.concurrent.CancellationException -> L9e
            if (r0 != 0) goto L5e
            X.0tzK r0 = r12.LLILLL     // Catch: java.util.concurrent.CancellationException -> L9e
            X.0tko<X.0tjk, X.0tkT> r3 = r0.LJIILJJIL     // Catch: java.util.concurrent.CancellationException -> L9e
            long r0 = r12.LLILZIL     // Catch: java.util.concurrent.CancellationException -> L9e
            X.0tjk r2 = new X.0tjk     // Catch: java.util.concurrent.CancellationException -> L9e
            r2.<init>(r0)     // Catch: java.util.concurrent.CancellationException -> L9e
            r12.LL = r9     // Catch: java.util.concurrent.CancellationException -> L9e
            r12.LLILLJJLI = r6     // Catch: java.util.concurrent.CancellationException -> L9e
            java.lang.Object r0 = r3.LJFF(r2, r12)     // Catch: java.util.concurrent.CancellationException -> L9e
            if (r0 != r4) goto L57
            goto L53
        L50:
            X.0thu<X.0tjk> r9 = r12.LLILZ     // Catch: java.util.concurrent.CancellationException -> L9e
            goto L30
        L53:
            return r4
        L54:
            X.C155000ia.LIZIZ(r13)     // Catch: java.util.concurrent.CancellationException -> L9e
        L57:
            X.0tzK r0 = r12.LLILLL     // Catch: java.util.concurrent.CancellationException -> L9e
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r0.LIZJ     // Catch: java.util.concurrent.CancellationException -> L9e
            r0.invoke()     // Catch: java.util.concurrent.CancellationException -> L9e
        L5e:
            X.0tzK r0 = r12.LLILLL     // Catch: java.util.concurrent.CancellationException -> L9e
            X.0tko<X.0tjk, X.0tkT> r0 = r0.LJIILJJIL     // Catch: java.util.concurrent.CancellationException -> L9e
            java.lang.Object r0 = r0.LIZLLL()     // Catch: java.util.concurrent.CancellationException -> L9e
            X.0tjk r0 = (X.C1676820tjk) r0     // Catch: java.util.concurrent.CancellationException -> L9e
            long r2 = r0.LIZ     // Catch: java.util.concurrent.CancellationException -> L9e
            long r0 = r12.LLILZIL     // Catch: java.util.concurrent.CancellationException -> L9e
            long r0 = X.C1676820tjk.LIZLLL(r2, r0)     // Catch: java.util.concurrent.CancellationException -> L9e
            X.0tzK r2 = r12.LLILLL     // Catch: java.util.concurrent.CancellationException -> L9e
            X.0tko<X.0tjk, X.0tkT> r7 = r2.LJIILJJIL     // Catch: java.util.concurrent.CancellationException -> L9e
            X.0tjk r8 = new X.0tjk     // Catch: java.util.concurrent.CancellationException -> L9e
            r8.<init>(r0)     // Catch: java.util.concurrent.CancellationException -> L9e
            r6 = 0
            kotlin.jvm.internal.AwS56S0100100_25 r11 = new kotlin.jvm.internal.AwS56S0100100_25     // Catch: java.util.concurrent.CancellationException -> L9e
            X.0tzK r3 = r12.LLILLL     // Catch: java.util.concurrent.CancellationException -> L9e
            r2 = 9
            r11.<init>(r3, r0, r2)     // Catch: java.util.concurrent.CancellationException -> L9e
            r10 = 0
            r12.LL = r6     // Catch: java.util.concurrent.CancellationException -> L9e
            r12.LLILLJJLI = r5     // Catch: java.util.concurrent.CancellationException -> L9e
            r13 = 4
            java.lang.Object r0 = X.C1677480tko.LIZJ(r7, r8, r9, r10, r11, r12, r13)     // Catch: java.util.concurrent.CancellationException -> L9e
            if (r0 != r4) goto L93
            return r4
        L90:
            X.C155000ia.LIZIZ(r13)     // Catch: java.util.concurrent.CancellationException -> L9e
        L93:
            X.0tzK r0 = r12.LLILLL     // Catch: java.util.concurrent.CancellationException -> L9e
            r1 = 0
            r0.LJFF(r1)     // Catch: java.util.concurrent.CancellationException -> L9e
            X.0tzK r0 = r12.LLILLL     // Catch: java.util.concurrent.CancellationException -> L9e
            r0.LJI = r1     // Catch: java.util.concurrent.CancellationException -> L9e
            goto La2
        L9e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        La2:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1686430tzF.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
