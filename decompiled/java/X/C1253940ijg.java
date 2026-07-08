package X;

import com.ss.android.ugc.aweme.profile.ui.ProfileListFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ijg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssem$handleLegacyTabSelected$1", f = "AwemePagerAssem.kt", l = {1739}, m = "invokeSuspend")
public final class C1253940ijg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ProfileListFragment LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1253940ijg(ProfileListFragment profileListFragment, boolean z, InterfaceC1364105Vn<? super C1253940ijg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = profileListFragment;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1253940ijg(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            r12 = this;
            java.lang.String r6 = "AwemePagerAssem@c9ce.handleLegacyTabSelected$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r12.LL
            r5 = 1
            if (r0 == 0) goto L19
            if (r0 != r5) goto L69
            X.C155000ia.LIZIZ(r13)
        L13:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L19:
            X.C155000ia.LIZIZ(r13)
            com.ss.android.ugc.aweme.profile.ui.ProfileListFragment r3 = r12.LLILLJJLI
            if (r3 == 0) goto L13
            boolean r2 = r12.LLILLL
            androidx.lifecycle.Lifecycle r7 = r3.getLifecycle()
            androidx.lifecycle.Lifecycle$State r8 = androidx.lifecycle.Lifecycle.State.RESUMED
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r0 = X.C2107308Nj.LIZ
            X.08pq r10 = r0.LLIILII()
            kotlin.coroutines.CoroutineContext r0 = r12.getContext()
            boolean r9 = r10.isDispatchNeeded(r0)
            if (r9 != 0) goto L58
            androidx.lifecycle.Lifecycle$State r1 = r7.getCurrentState()
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r1 == r0) goto L71
            androidx.lifecycle.Lifecycle$State r0 = r7.getCurrentState()
            int r0 = r0.compareTo(r8)
            if (r0 < 0) goto L58
            if (r2 == 0) goto L51
            r3.setUserVisibleHint(r5)
        L51:
            r3.uS(r5)
            r3.Bp()
            goto L13
        L58:
            X.0ijh r11 = new X.0ijh
            r11.<init>()
            r12.LL = r5
            java.lang.Object r0 = androidx.lifecycle.WithLifecycleStateKt.suspendWithStateAtLeastUnchecked(r7, r8, r9, r10, r11, r12)
            if (r0 != r4) goto L13
            X.C1C7U.LIZIZ(r6)
            return r4
        L69:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L71:
            androidx.lifecycle.LifecycleDestroyedException r0 = new androidx.lifecycle.LifecycleDestroyedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1253940ijg.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
