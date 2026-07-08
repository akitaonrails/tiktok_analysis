package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NH9, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.ghouse.GoldenHouse$asyncPoll$1", f = "GoldenHouse.kt", l = {864, 868, 870, 442}, m = "invokeSuspend")
public final class C0NH9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C0NH6 LL;
    public int LLILLJJLI;
    public final /* synthetic */ C0NH6 LLILLL;
    public final /* synthetic */ C0NEK LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NH9(C0NH6 c0nh6, C0NEK c0nek, InterfaceC1364105Vn<? super C0NH9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0nh6;
        this.LLILZ = c0nek;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NH9(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b5  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.String r9 = "GoldenHouse@3441.asyncPoll$1"
            X.C1C7U.LIZ(r9)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r10.LLILLJJLI
            r2 = 4
            r5 = 3
            r7 = 2
            r8 = 1
            r1 = 0
            if (r0 == 0) goto L29
            if (r0 == r8) goto L54
            if (r0 == r7) goto L23
            if (r0 == r5) goto L80
            if (r0 != r2) goto Lb9
            X.C155000ia.LIZIZ(r11)
        L1d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r9)
            return r0
        L23:
            X.0NH6 r6 = r10.LL
            X.C155000ia.LIZIZ(r11)
            goto L73
        L29:
            X.C155000ia.LIZIZ(r11)
            X.0NH6 r6 = r10.LLILLL
            X.0NHK r4 = r6.LJIIJ()
            X.0NHK r0 = X.C0NHK.DISABLED
            if (r4 == r0) goto L9b
            X.0NHK r4 = r6.LJIIJ()
            X.0NHK r0 = X.C0NHK.CACHE_AVAILABLE
            int r0 = r4.compareTo(r0)
            if (r0 >= 0) goto L59
            X.1DFK r0 = r6.LJIIJ
            if (r0 == 0) goto L59
            r10.LL = r6
            r10.LLILLJJLI = r8
            java.lang.Object r0 = r0.LJJZ(r10)
            if (r0 != r3) goto L59
            X.C1C7U.LIZIZ(r9)
            return r3
        L54:
            X.0NH6 r6 = r10.LL
            X.C155000ia.LIZIZ(r11)
        L59:
            X.0NGO r0 = r6.LIZJ
            int r0 = r0.LJFF()
            if (r0 != 0) goto L73
            X.1DFK r0 = r6.LJIIIZ
            if (r0 == 0) goto L73
            r10.LL = r6
            r10.LLILLJJLI = r7
            java.lang.Object r0 = r0.LJJZ(r10)
            if (r0 != r3) goto L73
            X.C1C7U.LIZIZ(r9)
            return r3
        L73:
            X.0NGO r0 = r6.LIZJ     // Catch: java.lang.Throwable -> L89
            r10.LL = r1     // Catch: java.lang.Throwable -> L89
            r10.LLILLJJLI = r5     // Catch: java.lang.Throwable -> L89
            com.ss.android.ugc.aweme.feed.ghouse.CacheEntry r11 = r0.LJII()     // Catch: java.lang.Throwable -> L89
            if (r11 != r3) goto L83
            goto Lc1
        L80:
            X.C155000ia.LIZIZ(r11)     // Catch: java.lang.Throwable -> L89
        L83:
            com.ss.android.ugc.aweme.feed.ghouse.CacheEntry r11 = (com.ss.android.ugc.aweme.feed.ghouse.CacheEntry) r11     // Catch: java.lang.Throwable -> L89
            X.C189200o6.m2constructorimpl(r11)     // Catch: java.lang.Throwable -> L89
            goto L95
        L89:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r11 = new X.00Yq
            r11.<init>(r0)
            X.C189200o6.m2constructorimpl(r11)
        L95:
            boolean r0 = X.C189200o6.m7isFailureimpl(r11)
            if (r0 == 0) goto L9c
        L9b:
            r11 = r1
        L9c:
            com.ss.android.ugc.aweme.feed.ghouse.CacheEntry r11 = (com.ss.android.ugc.aweme.feed.ghouse.CacheEntry) r11
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r6 = X.C2107308Nj.LIZ
            X.0NHB r5 = new X.0NHB
            X.0NH6 r4 = r10.LLILLL
            X.0NEK r0 = r10.LLILZ
            r5.<init>(r4, r11, r0, r1)
            r10.LL = r1
            r10.LLILLJJLI = r2
            java.lang.Object r0 = X.C23250099c.LJI(r10, r6, r5)
            if (r0 != r3) goto L1d
            X.C1C7U.LIZIZ(r9)
            return r3
        Lb9:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lc1:
            X.C1C7U.LIZIZ(r9)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0NH9.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
