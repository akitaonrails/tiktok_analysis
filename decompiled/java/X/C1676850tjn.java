package X;

import X.AbstractC1677260tkS;
import X.C1676910tjt;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Unknown type variable: S in type: kotlin.jvm.functions.Function1<? super S, ? extends T> */
/* JADX WARN: Unknown type variable: S in type: kotlin.jvm.functions.Function1<? super X.0tjQ<S>, ? extends X.0thu<T>> */
/* JADX INFO: renamed from: X.0tjn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1676850tjn<T, V extends AbstractC1677260tkS> implements C05P1<T> {
    public final C1676910tjt<S>.d<T, V> LL;
    public Function1<? super InterfaceC1676620tjQ<S>, ? extends InterfaceC1675680thu<T>> LLILLJJLI;
    public Function1<? super S, ? extends T> LLILLL;
    public final /* synthetic */ C1676910tjt<S>.a<T, V> LLILZ;

    @Override // X.C05P1
    public final T getValue() {
        LJIIL(C1676910tjt.this.LJFF());
        return this.LL.getValue();
    }

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
    /* JADX WARN: Unknown type variable: S in type: X.0tjQ<S> */
    public final void LJIIL(InterfaceC1676620tjQ<S> interfaceC1676620tjQ) {
        T tInvoke = this.LLILLL.invoke((Object) interfaceC1676620tjQ.LIZJ());
        if (C1676910tjt.this.LJII()) {
            ((C1676910tjt<S>.d<T, V>) this.LL).LJIJ(this.LLILLL.invoke(interfaceC1676620tjQ.LIZIZ()), tInvoke, this.LLILLJJLI.invoke(interfaceC1676620tjQ));
        } else {
            this.LL.LJIJI(tInvoke, (InterfaceC1675680thu) this.LLILLJJLI.invoke(interfaceC1676620tjQ));
        }
    }

    /* JADX WARN: Unknown type variable: S in type: kotlin.jvm.functions.Function1<? super S, ? extends T> */
    /* JADX WARN: Unknown type variable: S in type: kotlin.jvm.functions.Function1<? super X.0tjQ<S>, ? extends X.0thu<T>> */
    public C1676850tjn(C1676910tjt.a aVar, C1676910tjt<S>.d<T, V> dVar, Function1<? super InterfaceC1676620tjQ<S>, ? extends InterfaceC1675680thu<T>> function1, Function1<? super S, ? extends T> function12) {
        this.LLILZ = aVar;
        this.LL = dVar;
        this.LLILLJJLI = function1;
        this.LLILLL = function12;
    }
}
