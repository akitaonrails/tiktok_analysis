package X;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: renamed from: X.0joH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1295230joH extends AbstractC1295610jot<Float> {
    public final float LJIIJJI() {
        return LJIIL(LIZIZ(), LIZLLL());
    }

    public C1295230joH(List<C1294810jnb<Float>> list) {
        super(list);
    }

    @Override // X.AbstractC1295190joD
    public final Object LJI(C1294810jnb c1294810jnb, float f) {
        return Float.valueOf(LJIIL(c1294810jnb, f));
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
    public final float LJIIL(C1294810jnb<Float> c1294810jnb, float f) {
        Float f2;
        if (c1294810jnb.LIZIZ != null && c1294810jnb.LIZJ != null) {
            C1295400joY<A> c1295400joY = this.LJ;
            if (c1295400joY != 0 && (f2 = (Float) c1295400joY.LIZIZ(c1294810jnb.LJI, c1294810jnb.LJII.floatValue(), c1294810jnb.LIZIZ, c1294810jnb.LIZJ, f, LJ(), this.LIZLLL)) != null) {
                return f2.floatValue();
            }
            if (c1294810jnb.LJIIIIZZ == -3987645.8f) {
                c1294810jnb.LJIIIIZZ = c1294810jnb.LIZIZ.floatValue();
            }
            float f3 = c1294810jnb.LJIIIIZZ;
            if (c1294810jnb.LJIIIZ == -3987645.8f) {
                c1294810jnb.LJIIIZ = c1294810jnb.LIZJ.floatValue();
            }
            float f4 = c1294810jnb.LJIIIZ;
            PointF pointF = C1295100jo4.LIZ;
            return f3 + (f * (f4 - f3));
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
