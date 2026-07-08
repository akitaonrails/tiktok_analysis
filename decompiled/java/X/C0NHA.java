package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NHA, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.ghouse.GoldenHouse$syncPoll$1", f = "GoldenHouse.kt", l = {864, 868, 870}, m = "invokeSuspend")
public final class C0NHA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C591480NHu>, Object> {
    public C0NH6 LL;
    public int LLILLJJLI;
    public final /* synthetic */ C0NH6 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NHA(C0NH6 c0nh6, InterfaceC1364105Vn<? super C0NHA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0nh6;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NHA(this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b3  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r8 = "GoldenHouse@3441.syncPoll$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r9.LLILLJJLI
            r4 = 3
            r3 = 1
            r7 = 2
            r2 = 0
            if (r0 == 0) goto L26
            if (r0 == r3) goto L51
            if (r0 == r7) goto L20
            if (r0 != r4) goto L18
            goto L80
        L18:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L20:
            X.0NH6 r6 = r9.LL
            X.C155000ia.LIZIZ(r10)
            goto L70
        L26:
            X.C155000ia.LIZIZ(r10)
            X.0NH6 r6 = r9.LLILLL
            X.0NHK r1 = r6.LJIIJ()
            X.0NHK r0 = X.C0NHK.DISABLED
            if (r1 == r0) goto L9b
            X.0NHK r1 = r6.LJIIJ()
            X.0NHK r0 = X.C0NHK.CACHE_AVAILABLE
            int r0 = r1.compareTo(r0)
            if (r0 >= 0) goto L56
            X.1DFK r0 = r6.LJIIJ
            if (r0 == 0) goto L56
            r9.LL = r6
            r9.LLILLJJLI = r3
            java.lang.Object r0 = r0.LJJZ(r9)
            if (r0 != r5) goto L56
            X.C1C7U.LIZIZ(r8)
            return r5
        L51:
            X.0NH6 r6 = r9.LL
            X.C155000ia.LIZIZ(r10)
        L56:
            X.0NGO r0 = r6.LIZJ
            int r0 = r0.LJFF()
            if (r0 != 0) goto L70
            X.1DFK r0 = r6.LJIIIZ
            if (r0 == 0) goto L70
            r9.LL = r6
            r9.LLILLJJLI = r7
            java.lang.Object r0 = r0.LJJZ(r9)
            if (r0 != r5) goto L70
            X.C1C7U.LIZIZ(r8)
            return r5
        L70:
            X.0NGO r0 = r6.LIZJ     // Catch: java.lang.Throwable -> L89
            r9.LL = r2     // Catch: java.lang.Throwable -> L89
            r9.LLILLJJLI = r4     // Catch: java.lang.Throwable -> L89
            com.ss.android.ugc.aweme.feed.ghouse.CacheEntry r10 = r0.LJII()     // Catch: java.lang.Throwable -> L89
            if (r10 != r5) goto L83
            X.C1C7U.LIZIZ(r8)
            return r5
        L80:
            X.C155000ia.LIZIZ(r10)     // Catch: java.lang.Throwable -> L89
        L83:
            com.ss.android.ugc.aweme.feed.ghouse.CacheEntry r10 = (com.ss.android.ugc.aweme.feed.ghouse.CacheEntry) r10     // Catch: java.lang.Throwable -> L89
            X.C189200o6.m2constructorimpl(r10)     // Catch: java.lang.Throwable -> L89
            goto L95
        L89:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r10 = new X.00Yq
            r10.<init>(r0)
            X.C189200o6.m2constructorimpl(r10)
        L95:
            boolean r0 = X.C189200o6.m7isFailureimpl(r10)
            if (r0 == 0) goto L9c
        L9b:
            r10 = r2
        L9c:
            com.ss.android.ugc.aweme.feed.ghouse.CacheEntry r10 = (com.ss.android.ugc.aweme.feed.ghouse.CacheEntry) r10
            X.0NH6 r0 = r9.LLILLL
            X.C0NH6.LJIILIIL(r0, r10)
            if (r10 != 0) goto Lb3
            X.0NHu r4 = new X.0NHu
            java.lang.String r3 = "empty"
            r1 = 8
            r0 = 0
            r4.<init>(r0, r2, r3, r1)
        Laf:
            X.C1C7U.LIZIZ(r8)
            return r4
        Lb3:
            X.0NHu r4 = new X.0NHu
            X.0NHH r1 = X.C0NHG.LIZ(r10)
            r0 = 12
            r4.<init>(r3, r1, r2, r0)
            goto Laf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0NHA.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C591480NHu> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
