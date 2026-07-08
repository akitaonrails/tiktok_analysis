package X;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MW7, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.editorpro.toolbanner.list.EditorToolsIconsAdapter$onBindData$1", f = "EditorToolsIconsAdapter.kt", l = {877}, m = "invokeSuspend")
public final class C0MW7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C569680MVy LLILLJJLI;
    public final /* synthetic */ RecyclerView.ViewHolder LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MW7(C569680MVy c569680MVy, RecyclerView.ViewHolder viewHolder, InterfaceC1364105Vn<? super C0MW7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c569680MVy;
        this.LLILLL = viewHolder;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0MW7(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.String r5 = "EditorToolsIconsAdapter@aec9.onBindData$1"
            X.C1C7U.LIZ(r5)
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r11.LL
            r4 = 1
            if (r0 == 0) goto L19
            if (r0 != r4) goto L74
            X.C155000ia.LIZIZ(r12)
        L13:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        L19:
            X.C155000ia.LIZIZ(r12)
            X.0MVy r0 = r11.LLILLJJLI
            com.bytedance.scene.Scene r0 = r0.LLILZ
            androidx.lifecycle.Lifecycle$State r7 = androidx.lifecycle.Lifecycle.State.RESUMED
            androidx.recyclerview.widget.RecyclerView$ViewHolder r3 = r11.LLILLL
            androidx.lifecycle.Lifecycle r6 = r0.getLifecycle()
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.CREATED
            int r0 = r7.compareTo(r0)
            if (r0 < 0) goto L82
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r0 = X.C2107308Nj.LIZ
            X.08pq r9 = r0.LLIILII()
            kotlin.coroutines.CoroutineContext r0 = r11.getContext()
            boolean r8 = r9.isDispatchNeeded(r0)
            if (r8 != 0) goto L61
            androidx.lifecycle.Lifecycle$State r1 = r6.getCurrentState()
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r1 == r0) goto L7c
            androidx.lifecycle.Lifecycle$State r0 = r6.getCurrentState()
            int r0 = r0.compareTo(r7)
            if (r0 < 0) goto L61
            android.view.View r2 = r3.itemView
            Y.ARunnableS108S0100000_8 r1 = new Y.ARunnableS108S0100000_8
            r0 = 152(0x98, float:2.13E-43)
            r1.<init>(r3, r0)
            com.bytedance.bpea.transmit.hook.HandlerHook.viewPost(r2, r1)
            goto L13
        L61:
            Y.AObjectS383S0100000_8 r10 = new Y.AObjectS383S0100000_8
            r0 = 25
            r10.<init>(r3, r0)
            r11.LL = r4
            java.lang.Object r0 = androidx.lifecycle.WithLifecycleStateKt.suspendWithStateAtLeastUnchecked(r6, r7, r8, r9, r10, r11)
            if (r0 != r2) goto L13
            X.C1C7U.LIZIZ(r5)
            return r2
        L74:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L7c:
            androidx.lifecycle.LifecycleDestroyedException r0 = new androidx.lifecycle.LifecycleDestroyedException
            r0.<init>()
            throw r0
        L82:
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
        throw new UnsupportedOperationException("Method not decompiled: X.C0MW7.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
