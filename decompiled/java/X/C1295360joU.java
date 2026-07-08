package X;

import java.util.List;

/* JADX INFO: renamed from: X.0joU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1295360joU extends AbstractC1295610jot<C1295340joS> {
    public C1295360joU(List<C1294810jnb<C1295340joS>> list) {
        super(list);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.AbstractC1295190joD
    public final Object LJI(C1294810jnb c1294810jnb, float f) {
        T t;
        float fFloatValue;
        C1295400joY<A> c1295400joY = this.LJ;
        if (c1295400joY != 0) {
            float f2 = c1294810jnb.LJI;
            Float f3 = c1294810jnb.LJII;
            if (f3 == null) {
                fFloatValue = Float.MAX_VALUE;
            } else {
                fFloatValue = f3.floatValue();
            }
            Object obj = c1294810jnb.LIZIZ;
            Object obj2 = c1294810jnb.LIZJ;
            if (obj2 == null) {
                obj2 = obj;
            }
            return c1295400joY.LIZIZ(f2, fFloatValue, obj, obj2, f, LIZLLL(), this.LIZLLL);
        }
        if (f == 1.0f && (t = c1294810jnb.LIZJ) != 0) {
            return t;
        }
        return c1294810jnb.LIZIZ;
    }
}
