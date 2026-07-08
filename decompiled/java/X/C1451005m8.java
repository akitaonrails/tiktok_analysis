package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05m8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1451005m8 extends C2217421BqW implements Function1<InterfaceC1445905lJ, InterfaceC1445905lJ> {
    public final /* synthetic */ C013C LL;
    public final /* synthetic */ C259800zU<Object> LLILLJJLI;
    public final /* synthetic */ C259800zU<Function2<Object, InterfaceC1445905lJ, Object>> LLILLL;
    public final /* synthetic */ C1451205mA LLILZ;
    public final /* synthetic */ C259800zU<List<Function1<Object, Unit>>> LLILZIL;
    public final /* synthetic */ C259800zU<List<Function1<Object, Unit>>> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1451005m8(C1451205mA c1451205mA, C013C c013c, C259800zU c259800zU, C259800zU c259800zU2, C259800zU c259800zU3, C259800zU c259800zU4) {
        super(1, C1449605lu.class, "dispatch", "createReduxStore$dispatch(Lkotlin/jvm/internal/Ref$BooleanRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/tiktok/kmp/fcp/slotstrategy/core/PlatformLock;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/tiktok/kmp/fcp/redux/Action;)Lcom/tiktok/kmp/fcp/redux/Action;", 0);
        this.LL = c013c;
        this.LLILLJJLI = c259800zU;
        this.LLILLL = c259800zU2;
        this.LLILZ = c1451205mA;
        this.LLILZIL = c259800zU3;
        this.LLILZLL = c259800zU4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:5:0x0014, B:7:0x001c, B:10:0x0026, B:9:0x0024), top: B:30:0x0014 }] */
    /* JADX WARN: Type inference failed for: r0v7, types: [T] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1445905lJ invoke(X.InterfaceC1445905lJ r10) {
        /*
            r9 = this;
            X.013C r8 = r9.LL
            X.00zU<java.lang.Object> r3 = r9.LLILLJJLI
            X.00zU<kotlin.jvm.functions.Function2<java.lang.Object, X.05lJ, java.lang.Object>> r7 = r9.LLILLL
            X.05mA r6 = r9.LLILZ
            X.00zU<java.util.List<kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit>>> r5 = r9.LLILZIL
            X.00zU<java.util.List<kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit>>> r4 = r9.LLILZLL
            boolean r0 = r10 instanceof X.InterfaceC1451105m9
            r1 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L5c
            r2 = 0
            r8.element = r1     // Catch: java.lang.Throwable -> L55
            T r1 = r7.element     // Catch: java.lang.Throwable -> L55
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1     // Catch: java.lang.Throwable -> L55
            if (r1 == 0) goto L24
            T r0 = r3.element     // Catch: java.lang.Throwable -> L55
            java.lang.Object r0 = r1.invoke(r0, r10)     // Catch: java.lang.Throwable -> L55
            if (r0 != 0) goto L26
        L24:
            T r0 = r3.element     // Catch: java.lang.Throwable -> L55
        L26:
            r3.element = r0     // Catch: java.lang.Throwable -> L55
            r8.element = r2
            java.lang.Object r1 = r6.LIZ
            monitor-enter(r1)
            T r0 = r4.element     // Catch: java.lang.Throwable -> L4f
            r5.element = r0     // Catch: java.lang.Throwable -> L4f
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Throwable -> L4f
            java.util.List r0 = X.C13LP.LLIIII(r0)     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r1)
            java.util.Iterator r2 = r0.iterator()
        L3c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L4e
            java.lang.Object r1 = r2.next()
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            T r0 = r3.element
            r1.invoke(r0)
            goto L3c
        L4e:
            return r10
        L4f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r1)
            throw r0
        L55:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L55
            r8.element = r2
            throw r0
        L5c:
            java.lang.String r1 = "Failed requirement."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1451005m8.invoke(java.lang.Object):java.lang.Object");
    }
}
