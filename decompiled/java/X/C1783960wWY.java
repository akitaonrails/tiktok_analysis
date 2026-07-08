package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0wWY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.base.handlers.MessageChunkProxy$timer$2$1", f = "MessageChunkProxy.kt", l = {}, m = "invokeSuspend")
public final class C1783960wWY extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1785070wYL LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1783960wWY(C1785070wYL c1785070wYL, InterfaceC1364105Vn<? super C1783960wWY> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = c1785070wYL;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1783960wWY(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        if (0 != 0) goto L20;
     */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.String r0 = "MessageChunkProxy@dc87.timer$2$1"
            X.C1C7U.LIZ(r0)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r11)
            X.0wYL r0 = r10.LL
            java.lang.String r6 = r0.LJFF
            if (r6 != 0) goto L19
            kotlin.Unit r1 = kotlin.Unit.LIZ
            java.lang.String r0 = "MessageChunkProxy@dc87.timer$2$1"
            X.C1C7U.LIZIZ(r0)
            return r1
        L19:
            java.util.List<X.0wYM> r0 = r0.LIZJ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L2b
            kotlin.Unit r1 = kotlin.Unit.LIZ
            java.lang.String r0 = "MessageChunkProxy@dc87.timer$2$1"
            X.C1C7U.LIZIZ(r0)
            return r1
        L2b:
            X.0wYQ r1 = X.C1785140wYS.LIZIZ(r6)
            if (r1 != 0) goto L38
            r7 = 0
        L32:
            X.0wYL r5 = r10.LL
            java.lang.Object r3 = r5.LIZIZ
            monitor-enter(r3)
            goto L50
        L38:
            int r0 = r1.LIZLLL
            double r4 = (double) r0
            int r0 = r1.LJ
            double r2 = (double) r0
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r2 = r2 * r0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 < 0) goto L48
            r7 = 0
            if (r7 == 0) goto L32
        L48:
            kotlin.Unit r1 = kotlin.Unit.LIZ
            java.lang.String r0 = "MessageChunkProxy@dc87.timer$2$1"
            X.C1C7U.LIZIZ(r0)
            return r1
        L50:
            java.util.List<X.0wYM> r2 = r5.LIZJ     // Catch: java.lang.Throwable -> Lba
            Y.AComparatorS46S0000000_27 r1 = new Y.AComparatorS46S0000000_27     // Catch: java.lang.Throwable -> Lba
            r0 = 3
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Lba
            java.util.List r8 = X.C13LP.LJLLLL(r1, r2)     // Catch: java.lang.Throwable -> Lba
            java.util.List<X.0wYM> r1 = r5.LIZJ     // Catch: java.lang.Throwable -> Lba
            boolean r0 = r1 instanceof java.util.Collection     // Catch: java.lang.Throwable -> Lba
            if (r0 == 0) goto L6c
            r0 = r1
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> Lba
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> Lba
            if (r0 == 0) goto L6c
            goto L84
        L6c:
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Throwable -> Lba
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Lba
        L72:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> Lba
            if (r0 == 0) goto L84
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> Lba
            X.0wYM r0 = (X.C1785080wYM) r0     // Catch: java.lang.Throwable -> Lba
            boolean r0 = r0.LJ     // Catch: java.lang.Throwable -> Lba
            if (r0 == 0) goto L72
            r0 = 1
            goto L85
        L84:
            r0 = 0
        L85:
            X.0wWX r4 = new X.0wWX     // Catch: java.lang.Throwable -> Lba
            if (r0 == 0) goto L8b
            r9 = 1
            goto L8c
        L8b:
            r9 = 0
        L8c:
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> Lba
            if (r0 == 0) goto Lb1
            java.util.List<X.0wYM> r0 = r5.LIZJ     // Catch: java.lang.Throwable -> Lba
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> Lba
            r0.clear()     // Catch: java.lang.Throwable -> Lba
            java.util.Iterator r2 = r8.iterator()     // Catch: java.lang.Throwable -> Lba
        L9c:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> Lba
            if (r0 == 0) goto Lae
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Throwable -> Lba
            X.0wYM r1 = (X.C1785080wYM) r1     // Catch: java.lang.Throwable -> Lba
            java.lang.String r0 = "timer"
            r5.LJIIJ(r1, r0)     // Catch: java.lang.Throwable -> Lba
            goto L9c
        Lae:
            r5.LJII()     // Catch: java.lang.Throwable -> Lba
        Lb1:
            monitor-exit(r3)
            kotlin.Unit r1 = kotlin.Unit.LIZ
            java.lang.String r0 = "MessageChunkProxy@dc87.timer$2$1"
            X.C1C7U.LIZIZ(r0)
            return r1
        Lba:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> Lba
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1783960wWY.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
