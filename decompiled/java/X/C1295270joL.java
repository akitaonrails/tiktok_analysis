package X;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: renamed from: X.0joL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1295270joL extends AbstractC1295610jot<PointF> {
    public final PointF LJIIIIZZ;

    public C1295270joL(List<C1294810jnb<PointF>> list) {
        super(list);
        this.LJIIIIZZ = new PointF();
    }

    @Override // X.AbstractC1295190joD
    public final Object LJI(C1294810jnb c1294810jnb, float f) {
        return LJII(c1294810jnb, f, f, f);
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
    /* JADX INFO: renamed from: LJIIJJI, reason: merged with bridge method [inline-methods] */
    public final PointF LJII(C1294810jnb<PointF> c1294810jnb, float f, float f2, float f3) {
        PointF pointF;
        PointF pointF2;
        PointF pointF3 = c1294810jnb.LIZIZ;
        if (pointF3 != null && (pointF = c1294810jnb.LIZJ) != null) {
            PointF pointF4 = pointF3;
            PointF pointF5 = pointF;
            C1295400joY<A> c1295400joY = this.LJ;
            if (c1295400joY != 0 && (pointF2 = (PointF) c1295400joY.LIZIZ(c1294810jnb.LJI, c1294810jnb.LJII.floatValue(), pointF4, pointF5, f, LJ(), this.LIZLLL)) != null) {
                return pointF2;
            }
            PointF pointF6 = this.LJIIIIZZ;
            float f4 = pointF4.x;
            float f5 = f4 + (f2 * (pointF5.x - f4));
            float f6 = pointF4.y;
            pointF6.set(f5, f6 + (f3 * (pointF5.y - f6)));
            return this.LJIIIIZZ;
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
