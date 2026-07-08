package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0KKz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.subscription.pgc.payment.v2.PaymentProcessHelper$querySubscriptionHistory$2", f = "PaymentProcessHelper.kt", l = {40}, m = "invokeSuspend")
public final class C515870KKz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C518090KTn>, Object> {
    public int LL;

    public C515870KKz(InterfaceC1364105Vn<? super C515870KKz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C515870KKz(interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.0KL0] */
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
        C1C7U.LIZ("PaymentProcessHelper@367d.querySubscriptionHistory$2");
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
            final C013C c013c = new C013C();
            this.LL = 1;
            final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            C0KLU.LIZ.LJ(new InterfaceC518110KTp() { // from class: X.0KL0
                @Override // X.InterfaceC518110KTp
                public final void onFailure() {
                    C013C c013c2 = c013c;
                    if (c013c2.element) {
                        return;
                    }
                    c013c2.element = true;
                    InterfaceC1364105Vn<C518090KTn> interfaceC1364105Vn = c23260099m;
                    C189200o6.m2constructorimpl(null);
                    interfaceC1364105Vn.resumeWith(null);
                }

                @Override // X.InterfaceC518110KTp
                public final void LIZ(C518090KTn c518090KTn) {
                    C013C c013c2 = c013c;
                    if (c013c2.element) {
                        return;
                    }
                    c013c2.element = true;
                    InterfaceC1364105Vn<C518090KTn> interfaceC1364105Vn = c23260099m;
                    C189200o6.m2constructorimpl(c518090KTn);
                    interfaceC1364105Vn.resumeWith(c518090KTn);
                }
            });
            obj = c23260099m.LIZ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PaymentProcessHelper@367d.querySubscriptionHistory$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("PaymentProcessHelper@367d.querySubscriptionHistory$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C518090KTn> interfaceC1364105Vn) {
        return new C515870KKz(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
