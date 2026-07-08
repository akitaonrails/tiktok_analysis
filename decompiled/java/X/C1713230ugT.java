package X;

import com.bytedance.pipo.stellar.base.fragment.StellarFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ugT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.pipo.stellar.base.fragment.StellarFragment$setTrackingMetadata$1", f = "StellarFragment.kt", l = {806}, m = "invokeSuspend")
public final class C1713230ugT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ StellarFragment LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1713230ugT(StellarFragment stellarFragment, String str, String str2, String str3, String str4, InterfaceC1364105Vn<? super C1713230ugT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = stellarFragment;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = str4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1713230ugT(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0071  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            java.lang.String r5 = "StellarFragment@cf07.setTrackingMetadata$1"
            X.C1C7U.LIZ(r5)
            java.lang.Object r2 = X.C099R.LJFF()
            r3 = r18
            int r0 = r3.LL
            r1 = 1
            if (r0 == 0) goto L1b
            if (r0 != r1) goto L86
            X.C155000ia.LIZIZ(r19)
        L15:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        L1b:
            X.C155000ia.LIZIZ(r19)
            com.bytedance.pipo.stellar.base.fragment.StellarFragment r7 = r3.LLILLJJLI
            androidx.lifecycle.Lifecycle$State r13 = androidx.lifecycle.Lifecycle.State.STARTED
            java.lang.String r8 = r3.LLILLL
            java.lang.String r9 = r3.LLILZ
            java.lang.String r10 = r3.LLILZIL
            java.lang.String r11 = r3.LLILZLL
            androidx.lifecycle.Lifecycle r12 = r7.getLifecycle()
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.CREATED
            int r0 = r13.compareTo(r0)
            if (r0 < 0) goto L94
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r0 = X.C2107308Nj.LIZ
            X.08pq r15 = r0.LLIILII()
            kotlin.coroutines.CoroutineContext r0 = r3.getContext()
            boolean r14 = r15.isDispatchNeeded(r0)
            if (r14 != 0) goto L71
            androidx.lifecycle.Lifecycle$State r4 = r12.getCurrentState()
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r4 == r0) goto L8e
            androidx.lifecycle.Lifecycle$State r0 = r12.getCurrentState()
            int r0 = r0.compareTo(r13)
            if (r0 < 0) goto L71
            com.bytedance.pipo.stellar.base.fragment.StellarViewModel r0 = r7.SR()
            X.0ulO r1 = r0.LLILLJJLI
            r1.LIZIZ = r8
            r1.LIZJ = r9
            r1.LIZLLL = r11
            if (r10 == 0) goto L15
            int r0 = r10.length()
            if (r0 <= 0) goto L15
            r1.LIZ = r10
            goto L15
        L71:
            X.0ugU r6 = new X.0ugU
            r6.<init>()
            r3.LL = r1
            r16 = r6
            r17 = r3
            java.lang.Object r0 = androidx.lifecycle.WithLifecycleStateKt.suspendWithStateAtLeastUnchecked(r12, r13, r14, r15, r16, r17)
            if (r0 != r2) goto L15
            X.C1C7U.LIZIZ(r5)
            return r2
        L86:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L8e:
            androidx.lifecycle.LifecycleDestroyedException r0 = new androidx.lifecycle.LifecycleDestroyedException
            r0.<init>()
            throw r0
        L94:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "target state must be CREATED or greater, found "
            r1.append(r0)
            r1.append(r13)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1713230ugT.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
