package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: renamed from: X.0NVS, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4$2", f = "AnchoredDraggable.kt", l = {1174}, m = "invokeSuspend")
public final class C0NVS<T> extends C09AX implements Function2<Pair<? extends InterfaceC594940NVc<T>, ? extends T>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ InterfaceC1631630sYr<C0NVR, InterfaceC594940NVc<T>, T, InterfaceC1364105Vn<? super Unit>, Object> LLILLL;
    public final /* synthetic */ C594920NVa<T> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0NVS(InterfaceC1631630sYr<? super C0NVR, ? super InterfaceC594940NVc<T>, ? super T, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> interfaceC1631630sYr, C594920NVa<T> c594920NVa, InterfaceC1364105Vn<? super C0NVS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC1631630sYr;
        this.LLILZ = c594920NVa;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0NVS c0nvs = new C0NVS(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c0nvs.LLILLJJLI = obj;
        return c0nvs;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to X.0NVS<T> for r6v1 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // njp.a
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LL
            r4 = 1
            if (r0 == 0) goto L11
            if (r0 != r4) goto L2f
            X.C155000ia.LIZIZ(r7)
        Le:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L11:
            X.C155000ia.LIZIZ(r7)
            java.lang.Object r0 = r6.LLILLJJLI
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Object r3 = r0.getFirst()
            java.lang.Object r2 = r0.getSecond()
            X.0sYr<X.0NVR, X.0NVc<T>, T, X.05Vn<? super kotlin.Unit>, java.lang.Object> r1 = r6.LLILLL
            X.0NVa<T> r0 = r6.LLILZ
            X.0NVW r0 = r0.LJIILIIL
            r6.LL = r4
            java.lang.Object r0 = r1.invoke(r0, r3, r2, r6)
            if (r0 != r5) goto Le
            return r5
        L2f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0NVS.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(obj, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
