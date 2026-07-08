package X;

import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0WWw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1$1", f = "CoroutinesRoom.kt", l = {127, 129}, m = "invokeSuspend")
public final class C824720WWw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC824740WWy LL;
    public int LLILLJJLI;
    public final /* synthetic */ AbstractC796540VMm LLILLL;
    public final /* synthetic */ C824730WWx LLILZ;
    public final /* synthetic */ C095E<Unit> LLILZIL;
    public final /* synthetic */ Callable<Object> LLILZLL;
    public final /* synthetic */ C095E<Object> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C824720WWw(AbstractC796540VMm abstractC796540VMm, C824730WWx c824730WWx, C095E<Unit> c095e, Callable<Object> callable, C095E<Object> c095e2, InterfaceC1364105Vn<? super C824720WWw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = abstractC796540VMm;
        this.LLILZ = c824730WWx;
        this.LLILZIL = c095e;
        this.LLILZLL = callable;
        this.LLIZ = c095e2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C824720WWw(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0047 A[Catch: all -> 0x0072, TryCatch #0 {all -> 0x0072, blocks: (B:17:0x003f, B:19:0x0047, B:29:0x006e), top: B:34:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x005a -> B:35:0x0034). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLJJLI
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L22
            if (r0 == r3) goto L1c
            if (r0 != r4) goto L14
            X.0WWy r2 = r6.LL
            X.C155000ia.LIZIZ(r7)     // Catch: java.lang.Throwable -> L6d
            goto L34
        L14:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1c:
            X.0WWy r2 = r6.LL
            X.C155000ia.LIZIZ(r7)     // Catch: java.lang.Throwable -> L6d
            goto L3f
        L22:
            X.C155000ia.LIZIZ(r7)
            X.0VMm r0 = r6.LLILLL
            X.0VMu r1 = r0.mInvalidationTracker
            X.0WWx r0 = r6.LLILZ
            r1.LIZ(r0)
            X.095E<kotlin.Unit> r0 = r6.LLILZIL     // Catch: java.lang.Throwable -> L6d
            X.0WWy r2 = r0.iterator()     // Catch: java.lang.Throwable -> L6d
        L34:
            r6.LL = r2     // Catch: java.lang.Throwable -> L6b
            r6.LLILLJJLI = r3     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r7 = r2.LIZ(r6)     // Catch: java.lang.Throwable -> L6b
            if (r7 != r5) goto L3f
            goto L5d
        L3f:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L72
            boolean r0 = r7.booleanValue()     // Catch: java.lang.Throwable -> L72
            if (r0 == 0) goto L5f
            r2.next()     // Catch: java.lang.Throwable -> L72
            java.util.concurrent.Callable<java.lang.Object> r0 = r6.LLILZLL     // Catch: java.lang.Throwable -> L72
            java.lang.Object r1 = r0.call()     // Catch: java.lang.Throwable -> L72
            X.095E<java.lang.Object> r0 = r6.LLIZ     // Catch: java.lang.Throwable -> L72
            r6.LL = r2     // Catch: java.lang.Throwable -> L72
            r6.LLILLJJLI = r4     // Catch: java.lang.Throwable -> L72
            java.lang.Object r0 = r0.LJIJI(r1, r6)     // Catch: java.lang.Throwable -> L72
            if (r0 != r5) goto L34
            goto L5e
        L5d:
            return r5
        L5e:
            return r5
        L5f:
            X.0VMm r0 = r6.LLILLL
            X.0VMu r1 = r0.mInvalidationTracker
            X.0WWx r0 = r6.LLILZ
            r1.LIZLLL(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L6b:
            r2 = move-exception
            goto L6e
        L6d:
            r2 = move-exception
        L6e:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)     // Catch: java.lang.Throwable -> L72
            goto L74
        L72:
            r2 = move-exception
            goto L6e
        L74:
            X.0VMm r0 = r6.LLILLL
            X.0VMu r1 = r0.mInvalidationTracker
            X.0WWx r0 = r6.LLILZ
            r1.LIZLLL(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C824720WWw.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
