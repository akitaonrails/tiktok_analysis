package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.094Q, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", f = "GlobalSnapshotManager.android.kt", l = {67}, m = "invokeSuspend")
public final class C094Q extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public AnonymousClass0954 LL;
    public InterfaceC824740WWy LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ C095E<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C094Q(C095E<Unit> c095e, InterfaceC1364105Vn<? super C094Q> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c095e;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C094Q(this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a A[Catch: all -> 0x0051, TryCatch #1 {all -> 0x0051, blocks: (B:14:0x0032, B:16:0x003a), top: B:35:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x002f -> B:35:0x0032). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILLL
            r5 = 0
            r4 = 1
            if (r0 == 0) goto L1c
            if (r0 != r4) goto L14
            X.0WWy r2 = r7.LLILLJJLI
            X.0954 r3 = r7.LL
            X.C155000ia.LIZIZ(r8)     // Catch: java.lang.Throwable -> L53
            goto L32
        L14:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1c:
            X.C155000ia.LIZIZ(r8)
            X.095E<kotlin.Unit> r3 = r7.LLILZ
            X.0WWy r2 = r3.iterator()     // Catch: java.lang.Throwable -> L53
        L25:
            r7.LL = r3     // Catch: java.lang.Throwable -> L53
            r7.LLILLJJLI = r2     // Catch: java.lang.Throwable -> L53
            r7.LLILLL = r4     // Catch: java.lang.Throwable -> L53
            java.lang.Object r8 = r2.LIZ(r7)     // Catch: java.lang.Throwable -> L53
            if (r8 != r6) goto L32
            goto L4a
        L32:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L51
            boolean r0 = r8.booleanValue()     // Catch: java.lang.Throwable -> L51
            if (r0 == 0) goto L4b
            java.lang.Object r0 = r2.next()     // Catch: java.lang.Throwable -> L51
            kotlin.Unit r0 = (kotlin.Unit) r0     // Catch: java.lang.Throwable -> L51
            java.util.concurrent.atomic.AtomicBoolean r1 = X.C094R.LIZIZ     // Catch: java.lang.Throwable -> L51
            r0 = 0
            r1.set(r0)     // Catch: java.lang.Throwable -> L51
            X.C13YI.LJFF()     // Catch: java.lang.Throwable -> L51
            goto L25
        L4a:
            return r6
        L4b:
            X.C094C.LIZ(r3, r5)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L51:
            r1 = move-exception
            goto L54
        L53:
            r1 = move-exception
        L54:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L5b
            throw r1     // Catch: java.lang.Throwable -> L58
        L58:
            r0 = move-exception
            r5 = r1
            goto L5c
        L5b:
            r0 = move-exception
        L5c:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L60
            goto L62
        L60:
            r0 = move-exception
            goto L5c
        L62:
            X.C094C.LIZ(r3, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C094Q.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
