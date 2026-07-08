package X;

import com.bytedance.router.RouteIntent;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CnB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.showcase.store.ShopPrefetchDataManager$startPrefetch$5", f = "ShopPrefetchDataManager.kt", l = {110}, m = "invokeSuspend")
public final class C324110CnB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1739060vM8 LLILLJJLI;
    public final /* synthetic */ C1738990vM1 LLILLL;
    public final /* synthetic */ RouteIntent LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ Map<String, Object> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C324110CnB(C1739060vM8 c1739060vM8, C1738990vM1 c1738990vM1, RouteIntent routeIntent, String str, String str2, String str3, Map<String, Object> map, InterfaceC1364105Vn<? super C324110CnB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1739060vM8;
        this.LLILLL = c1738990vM1;
        this.LLILZ = routeIntent;
        this.LLILZIL = str;
        this.LLILZLL = str2;
        this.LLIZ = str3;
        this.LLIZLLLIL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C324110CnB(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.String r5 = "ShopPrefetchDataManager@c051.startPrefetch$5"
            X.C1C7U.LIZ(r5)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r13.LL
            r4 = 0
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 != r2) goto L12
            goto L53
        L12:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1a:
            X.C155000ia.LIZIZ(r14)
            X.0vM1 r12 = r13.LLILLL
            X.0vM8 r6 = r13.LLILLJJLI
            com.bytedance.router.RouteIntent r7 = r13.LLILZ
            java.lang.String r8 = r13.LLILZIL
            java.lang.String r9 = r13.LLILZLL
            java.lang.String r10 = r13.LLIZ
            java.util.Map<java.lang.String, java.lang.Object> r11 = r13.LLIZLLLIL
            java.lang.String r1 = r12.LIZIZ     // Catch: java.lang.Throwable -> L5a java.util.concurrent.CancellationException -> L7c
            X.0vM2 r0 = X.EnumC1739000vM2.PRODUCT     // Catch: java.lang.Throwable -> L5a java.util.concurrent.CancellationException -> L7c
            java.lang.String r0 = r0.getValue()     // Catch: java.lang.Throwable -> L5a java.util.concurrent.CancellationException -> L7c
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)     // Catch: java.lang.Throwable -> L5a java.util.concurrent.CancellationException -> L7c
            if (r0 != 0) goto L47
            java.lang.String r1 = r12.LIZIZ     // Catch: java.lang.Throwable -> L5a java.util.concurrent.CancellationException -> L7c
            X.0vM2 r0 = X.EnumC1739000vM2.UNDEFINED     // Catch: java.lang.Throwable -> L5a java.util.concurrent.CancellationException -> L7c
            java.lang.String r0 = r0.getValue()     // Catch: java.lang.Throwable -> L5a java.util.concurrent.CancellationException -> L7c
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)     // Catch: java.lang.Throwable -> L5a java.util.concurrent.CancellationException -> L7c
            if (r0 == 0) goto L5e
        L47:
            r13.LL = r2     // Catch: java.lang.Throwable -> L5a java.util.concurrent.CancellationException -> L7c
            java.lang.Object r14 = r6.LIZ(r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L5a java.util.concurrent.CancellationException -> L7c
            if (r14 != r3) goto L56
            X.C1C7U.LIZIZ(r5)
            return r3
        L53:
            X.C155000ia.LIZIZ(r14)     // Catch: java.lang.Throwable -> L5a java.util.concurrent.CancellationException -> L7c
        L56:
            com.google.gson.n r14 = (com.google.gson.n) r14     // Catch: java.lang.Throwable -> L5a java.util.concurrent.CancellationException -> L7c
            r4 = r14
            goto L5e
        L5a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L5e:
            X.0vM8 r0 = r13.LLILLJJLI
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r2 = r0.LIZIZ
            if (r4 == 0) goto L6a
            java.lang.String r0 = X.C1741890vQh.LJIIIIZZ(r4)
            if (r0 != 0) goto L6c
        L6a:
            java.lang.String r0 = ""
        L6c:
            java.lang.String r1 = "product_tab_info"
            r2.put(r1, r0)
            X.0vM8 r0 = r13.LLILLJJLI
            r0.LIZJ(r1)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        L7c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C324110CnB.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
