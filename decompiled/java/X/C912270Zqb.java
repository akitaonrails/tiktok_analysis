package X;

import com.ss.android.ugc.profile.business.feed.CollectProfileListFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Zqb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.feed.CollectProfileListFragment$userVisibleByPageChanged$1", f = "CollectProfileListFragment.kt", l = {250}, m = "invokeSuspend")
public final class C912270Zqb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CollectProfileListFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C912270Zqb(CollectProfileListFragment collectProfileListFragment, InterfaceC1364105Vn<? super C912270Zqb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = collectProfileListFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C912270Zqb(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.String r5 = "CollectProfileListFragment@2aac.userVisibleByPageChanged$1"
            X.C1C7U.LIZ(r5)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r11.LL
            r4 = 1
            if (r0 == 0) goto L19
            if (r0 != r4) goto L5f
            X.C155000ia.LIZIZ(r12)
        L13:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        L19:
            X.C155000ia.LIZIZ(r12)
            com.ss.android.ugc.profile.business.feed.CollectProfileListFragment r2 = r11.LLILLJJLI
            androidx.lifecycle.Lifecycle r6 = r2.getLifecycle()
            androidx.lifecycle.Lifecycle$State r7 = androidx.lifecycle.Lifecycle.State.RESUMED
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r0 = X.C2107308Nj.LIZ
            X.08pq r9 = r0.LLIILII()
            kotlin.coroutines.CoroutineContext r0 = r11.getContext()
            boolean r8 = r9.isDispatchNeeded(r0)
            if (r8 != 0) goto L4c
            androidx.lifecycle.Lifecycle$State r1 = r6.getCurrentState()
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r1 == r0) goto L67
            androidx.lifecycle.Lifecycle$State r0 = r6.getCurrentState()
            int r0 = r0.compareTo(r7)
            if (r0 < 0) goto L4c
            r2.yS()
            goto L13
        L4c:
            Y.AObjectS389S0100000_14 r10 = new Y.AObjectS389S0100000_14
            r0 = 21
            r10.<init>(r2, r0)
            r11.LL = r4
            java.lang.Object r0 = androidx.lifecycle.WithLifecycleStateKt.suspendWithStateAtLeastUnchecked(r6, r7, r8, r9, r10, r11)
            if (r0 != r3) goto L13
            X.C1C7U.LIZIZ(r5)
            return r3
        L5f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L67:
            androidx.lifecycle.LifecycleDestroyedException r0 = new androidx.lifecycle.LifecycleDestroyedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C912270Zqb.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
