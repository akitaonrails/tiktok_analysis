package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.showcase.PcsOnboardingChatBuilderFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ugW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.showcase.PcsOnboardingChatBuilderFragment$onReceiveJsEvent$2", f = "PcsOnboardingChatBuilderFragment.kt", l = {464}, m = "invokeSuspend")
public final class C1713260ugW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PcsOnboardingChatBuilderFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1713260ugW(PcsOnboardingChatBuilderFragment pcsOnboardingChatBuilderFragment, InterfaceC1364105Vn<? super C1713260ugW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pcsOnboardingChatBuilderFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1713260ugW(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.String r5 = "PcsOnboardingChatBuilderFragment@4c20.onReceiveJsEvent$2"
            X.C1C7U.LIZ(r5)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r11.LL
            r4 = 1
            if (r0 == 0) goto L19
            if (r0 != r4) goto L6d
            X.C155000ia.LIZIZ(r12)
        L13:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        L19:
            X.C155000ia.LIZIZ(r12)
            com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.showcase.PcsOnboardingChatBuilderFragment r0 = r11.LLILLJJLI
            androidx.lifecycle.LifecycleOwner r0 = r0.getViewLifecycleOwner()
            androidx.lifecycle.Lifecycle r6 = r0.getLifecycle()
            com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.showcase.PcsOnboardingChatBuilderFragment r2 = r11.LLILLJJLI
            androidx.lifecycle.Lifecycle$State r7 = androidx.lifecycle.Lifecycle.State.RESUMED
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r0 = X.C2107308Nj.LIZ
            X.08pq r9 = r0.LLIILII()
            kotlin.coroutines.CoroutineContext r0 = r11.getContext()
            boolean r8 = r9.isDispatchNeeded(r0)
            if (r8 != 0) goto L5c
            androidx.lifecycle.Lifecycle$State r1 = r6.getCurrentState()
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r1 == r0) goto L75
            androidx.lifecycle.Lifecycle$State r0 = r6.getCurrentState()
            int r0 = r0.compareTo(r7)
            if (r0 < 0) goto L5c
            r2.ET()     // Catch: java.lang.Exception -> L52
            goto L13
        L52:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.lang.String r0 = "ChatBuilder proceedAfterApply failed after JS event"
            X.C1121890fIh.LIZIZ(r0, r1)
            goto L13
        L5c:
            X.0ugY r10 = new X.0ugY
            r10.<init>()
            r11.LL = r4
            java.lang.Object r0 = androidx.lifecycle.WithLifecycleStateKt.suspendWithStateAtLeastUnchecked(r6, r7, r8, r9, r10, r11)
            if (r0 != r3) goto L13
            X.C1C7U.LIZIZ(r5)
            return r3
        L6d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L75:
            androidx.lifecycle.LifecycleDestroyedException r0 = new androidx.lifecycle.LifecycleDestroyedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1713260ugW.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
