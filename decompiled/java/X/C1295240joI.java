package X;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: renamed from: X.0joI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1295240joI extends AbstractC1295610jot<Integer> {
    public C1295240joI(List<C1294810jnb<Integer>> list) {
        super(list);
    }

    @Override // X.AbstractC1295190joD
    public final Object LJI(C1294810jnb c1294810jnb, float f) {
        return Integer.valueOf(LJIIJJI(c1294810jnb, f));
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
    public final int LJIIJJI(C1294810jnb<Integer> c1294810jnb, float f) {
        Integer num;
        if (c1294810jnb.LIZIZ != null && c1294810jnb.LIZJ != null) {
            C1295400joY<A> c1295400joY = this.LJ;
            if (c1295400joY != 0 && (num = (Integer) c1295400joY.LIZIZ(c1294810jnb.LJI, c1294810jnb.LJII.floatValue(), c1294810jnb.LIZIZ, c1294810jnb.LIZJ, f, LJ(), this.LIZLLL)) != null) {
                return num.intValue();
            }
            if (c1294810jnb.LJIIJ == 784923401) {
                c1294810jnb.LJIIJ = c1294810jnb.LIZIZ.intValue();
            }
            int i = c1294810jnb.LJIIJ;
            if (c1294810jnb.LJIIJJI == 784923401) {
                c1294810jnb.LJIIJJI = c1294810jnb.LIZJ.intValue();
            }
            int i2 = c1294810jnb.LJIIJJI;
            PointF pointF = C1295100jo4.LIZ;
            return (int) (i + (f * (i2 - i)));
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
