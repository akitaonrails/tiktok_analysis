package X;

import com.bytedance.pipo.stellar.base.fragment.StellarFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ugS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.pipo.stellar.base.fragment.StellarFragment$onStart$1", f = "StellarFragment.kt", l = {806}, m = "invokeSuspend")
public final class C1713220ugS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ StellarFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1713220ugS(StellarFragment stellarFragment, InterfaceC1364105Vn<? super C1713220ugS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = stellarFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1713220ugS(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.String r5 = "StellarFragment@cf07.onStart$1"
            X.C1C7U.LIZ(r5)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r11.LL
            r4 = 1
            if (r0 == 0) goto L19
            if (r0 != r4) goto L6a
            X.C155000ia.LIZIZ(r12)
        L13:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        L19:
            X.C155000ia.LIZIZ(r12)
            com.bytedance.pipo.stellar.base.fragment.StellarFragment r2 = r11.LLILLJJLI
            androidx.lifecycle.Lifecycle$State r7 = androidx.lifecycle.Lifecycle.State.STARTED
            androidx.lifecycle.Lifecycle r6 = r2.getLifecycle()
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.CREATED
            int r0 = r7.compareTo(r0)
            if (r0 < 0) goto L78
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r0 = X.C2107308Nj.LIZ
            X.08pq r9 = r0.LLIILII()
            kotlin.coroutines.CoroutineContext r0 = r11.getContext()
            boolean r8 = r9.isDispatchNeeded(r0)
            if (r8 != 0) goto L58
            androidx.lifecycle.Lifecycle$State r1 = r6.getCurrentState()
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r1 == r0) goto L72
            androidx.lifecycle.Lifecycle$State r0 = r6.getCurrentState()
            int r0 = r0.compareTo(r7)
            if (r0 < 0) goto L58
            com.bytedance.pipo.stellar.base.fragment.StellarViewModel r0 = r2.SR()
            r0.CQ2()
            goto L13
        L58:
            Y.AObjectS400S0100000_26 r10 = new Y.AObjectS400S0100000_26
            r0 = 0
            r10.<init>(r2, r0)
            r11.LL = r4
            java.lang.Object r0 = androidx.lifecycle.WithLifecycleStateKt.suspendWithStateAtLeastUnchecked(r6, r7, r8, r9, r10, r11)
            if (r0 != r3) goto L13
            X.C1C7U.LIZIZ(r5)
            return r3
        L6a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L72:
            androidx.lifecycle.LifecycleDestroyedException r0 = new androidx.lifecycle.LifecycleDestroyedException
            r0.<init>()
            throw r0
        L78:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "target state must be CREATED or greater, found "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1713220ugS.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
