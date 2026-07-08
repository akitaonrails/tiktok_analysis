package X;

import android.content.Context;
import android.os.PowerManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0igF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.push.impl.alerttone.settings.MessageNotificationPermissionFragmentKt$rememberBatteryState$4$1$1$1", f = "MessageNotificationPermissionFragment.kt", l = {1048, 1300}, m = "invokeSuspend")
public final class C1251810igF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ C05P0<Boolean> LLILLL;
    public final /* synthetic */ PowerManager LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1251810igF(Context context, C05P0<Boolean> c05p0, PowerManager powerManager, InterfaceC1364105Vn<? super C1251810igF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = context;
        this.LLILLL = c05p0;
        this.LLILZ = powerManager;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1251810igF(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0083  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.String r7 = "MessageNotificationPermissionFragmentKt@5cb9.rememberBatteryState$4$1$1$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r13.LL
            r6 = 2
            r10 = 1
            if (r0 == 0) goto L24
            if (r0 == r10) goto L20
            if (r0 != r6) goto L18
            X.C155000ia.LIZIZ(r14)     // Catch: java.lang.Exception -> L98
            goto L9c
        L18:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L20:
            X.C155000ia.LIZIZ(r14)
            goto L35
        L24:
            X.C155000ia.LIZIZ(r14)
            r13.LL = r10
            r0 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r13)
            if (r0 != r5) goto L35
            X.C1C7U.LIZIZ(r7)
            return r5
        L35:
            android.content.Context r1 = r13.LLILLJJLI     // Catch: java.lang.Exception -> L98
            boolean r0 = r1 instanceof androidx.lifecycle.LifecycleOwner     // Catch: java.lang.Exception -> L98
            if (r0 == 0) goto L3e
            androidx.lifecycle.LifecycleOwner r1 = (androidx.lifecycle.LifecycleOwner) r1     // Catch: java.lang.Exception -> L98
            goto L3f
        L3e:
            r1 = 0
        L3f:
            if (r1 == 0) goto L9c
            androidx.lifecycle.Lifecycle r8 = r1.getLifecycle()     // Catch: java.lang.Exception -> L98
            if (r8 == 0) goto L9c
            X.05P0<java.lang.Boolean> r4 = r13.LLILLL     // Catch: java.lang.Exception -> L98
            android.os.PowerManager r3 = r13.LLILZ     // Catch: java.lang.Exception -> L98
            androidx.lifecycle.Lifecycle$State r9 = androidx.lifecycle.Lifecycle.State.RESUMED     // Catch: java.lang.Exception -> L98
            X.1DFH r0 = X.C0PEM.LIZ     // Catch: java.lang.Exception -> L98
            X.08pq r0 = X.C2107308Nj.LIZ     // Catch: java.lang.Exception -> L98
            X.08pq r11 = r0.LLIILII()     // Catch: java.lang.Exception -> L98
            kotlin.coroutines.CoroutineContext r0 = r13.getContext()     // Catch: java.lang.Exception -> L98
            boolean r2 = r11.isDispatchNeeded(r0)     // Catch: java.lang.Exception -> L98
            if (r2 != 0) goto L83
            androidx.lifecycle.Lifecycle$State r1 = r8.getCurrentState()     // Catch: java.lang.Exception -> L98
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.DESTROYED     // Catch: java.lang.Exception -> L98
            if (r1 == r0) goto L7d
            androidx.lifecycle.Lifecycle$State r0 = r8.getCurrentState()     // Catch: java.lang.Exception -> L98
            int r0 = r0.compareTo(r9)     // Catch: java.lang.Exception -> L98
            if (r0 < 0) goto L83
            boolean r0 = X.C20303114cP.LJII(r3)     // Catch: java.lang.Exception -> L98
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Exception -> L98
            r4.setValue(r0)     // Catch: java.lang.Exception -> L98
            goto L9c
        L7d:
            androidx.lifecycle.LifecycleDestroyedException r0 = new androidx.lifecycle.LifecycleDestroyedException     // Catch: java.lang.Exception -> L98
            r0.<init>()     // Catch: java.lang.Exception -> L98
            throw r0     // Catch: java.lang.Exception -> L98
        L83:
            if (r2 != 0) goto L86
            r10 = 0
        L86:
            Y.AObjectS293S0200000_19 r12 = new Y.AObjectS293S0200000_19     // Catch: java.lang.Exception -> L98
            r0 = 0
            r12.<init>(r4, r3, r0)     // Catch: java.lang.Exception -> L98
            r13.LL = r6     // Catch: java.lang.Exception -> L98
            java.lang.Object r0 = androidx.lifecycle.WithLifecycleStateKt.suspendWithStateAtLeastUnchecked(r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Exception -> L98
            if (r0 != r5) goto L9c
            X.C1C7U.LIZIZ(r7)
            return r5
        L98:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L9c:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1251810igF.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
