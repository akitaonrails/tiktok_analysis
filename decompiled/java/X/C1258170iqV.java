package X;

import com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.profiletab.ProfileBaseAwemeListFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0iqV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.profiletab.ProfileBaseAwemeListFragment$setupListFooterListener$1$1", f = "ProfileBaseAwemeListFragment.kt", l = {1338}, m = "invokeSuspend")
public final class C1258170iqV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ProfileBaseAwemeListFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1258170iqV(ProfileBaseAwemeListFragment profileBaseAwemeListFragment, InterfaceC1364105Vn<? super C1258170iqV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = profileBaseAwemeListFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1258170iqV(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0062  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.String r6 = "ProfileBaseAwemeListFragment@d2b.setupListFooterListener$1$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r12.LL
            r3 = 1
            if (r0 == 0) goto L19
            if (r0 != r3) goto L75
            X.C155000ia.LIZIZ(r13)
        L13:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L19:
            X.C155000ia.LIZIZ(r13)
            com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.profiletab.ProfileBaseAwemeListFragment r5 = r12.LLILLJJLI
            androidx.lifecycle.Lifecycle r7 = r5.getLifecycle()
            androidx.lifecycle.Lifecycle$State r8 = androidx.lifecycle.Lifecycle.State.RESUMED
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r0 = X.C2107308Nj.LIZ
            X.08pq r10 = r0.LLIILII()
            kotlin.coroutines.CoroutineContext r0 = r12.getContext()
            boolean r9 = r10.isDispatchNeeded(r0)
            if (r9 != 0) goto L62
            androidx.lifecycle.Lifecycle$State r1 = r7.getCurrentState()
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r1 == r0) goto L7d
            androidx.lifecycle.Lifecycle$State r0 = r7.getCurrentState()
            int r0 = r0.compareTo(r8)
            if (r0 < 0) goto L62
            boolean r0 = r5.LLJJI
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            java.lang.String r3 = r5.LLIZ
            java.lang.String r2 = r5.LLILLL
            long r0 = X.C1256070in7.LIZ
            java.lang.Long r1 = X.C2286608xc.LJFF(r0)
            int r0 = r5.LLJILLL
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)
            X.C1250680ieQ.LJIJ(r4, r3, r2, r1, r0)
            goto L13
        L62:
            Y.AObjectS393S0100000_19 r11 = new Y.AObjectS393S0100000_19
            r0 = 18
            r11.<init>(r5, r0)
            r12.LL = r3
            java.lang.Object r0 = androidx.lifecycle.WithLifecycleStateKt.suspendWithStateAtLeastUnchecked(r7, r8, r9, r10, r11, r12)
            if (r0 != r2) goto L13
            X.C1C7U.LIZIZ(r6)
            return r2
        L75:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L7d:
            androidx.lifecycle.LifecycleDestroyedException r0 = new androidx.lifecycle.LifecycleDestroyedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1258170iqV.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
