package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS553S0100000_9;
import njp.a;

/* JADX INFO: renamed from: X.0NVT, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4", f = "AnchoredDraggable.kt", l = {1172}, m = "invokeSuspend")
public final class C0NVT extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C594920NVa<T> LLILLJJLI;
    public final /* synthetic */ T LLILLL;
    public final /* synthetic */ InterfaceC1631630sYr<C0NVR, InterfaceC594940NVc<T>, T, InterfaceC1364105Vn<? super Unit>, Object> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0NVT(C594920NVa<T> c594920NVa, T t, InterfaceC1631630sYr<? super C0NVR, ? super InterfaceC594940NVc<T>, ? super T, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> interfaceC1631630sYr, InterfaceC1364105Vn<? super C0NVT> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c594920NVa;
        this.LLILLL = t;
        this.LLILZ = interfaceC1631630sYr;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NVT(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C594920NVa<T> c594920NVa = this.LLILLJJLI;
            ((C13FE) c594920NVa.LJIIJJI).setValue(this.LLILLL);
            AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(this.LLILLJJLI, 1717);
            C0NVS c0nvs = new C0NVS(this.LLILZ, this.LLILLJJLI, null);
            this.LL = 1;
            if (C1677950tlZ.LIZLLL(awS553S0100000_9, c0nvs, this) == objLJFF) {
                return objLJFF;
            }
        }
        if (this.LLILLJJLI.LIZ.invoke(this.LLILLL).booleanValue()) {
            float fLIZLLL = this.LLILLJJLI.LIZIZ().LIZLLL(this.LLILLL);
            C594920NVa<T> c594920NVa2 = this.LLILLJJLI;
            c594920NVa2.LJIILIIL.LIZ(fLIZLLL, ((C13FI) c594920NVa2.LJIIJ).LIZIZ());
            C594920NVa<T> c594920NVa3 = this.LLILLJJLI;
            ((C13FE) c594920NVa3.LJII).setValue(this.LLILLL);
            this.LLILLJJLI.LJIIIIZZ(this.LLILLL);
        }
        return Unit.LIZ;
    }
}
