package X;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: renamed from: X.0jof, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1295470jof extends AbstractC1294520jn8<C1295580joq, C1295580joq> {
    @Override // X.InterfaceC1294490jn5
    public final AbstractC1295190joD<C1295580joq, C1295580joq> LIZ() {
        final List<C1294810jnb<V>> list = this.LIZ;
        return new AbstractC1295610jot<C1295580joq>(list) { // from class: X.0joM
            public final C1295580joq LJIIIIZZ = new C1295580joq();

            /* JADX WARN: Multi-variable type inference failed */
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
                Object objLIZIZ;
                T t2 = c1294810jnb.LIZIZ;
                if (t2 != 0 && (t = c1294810jnb.LIZJ) != 0) {
                    C1295580joq c1295580joq = (C1295580joq) t2;
                    C1295580joq c1295580joq2 = (C1295580joq) t;
                    C1295400joY<A> c1295400joY = this.LJ;
                    if (c1295400joY != 0 && (objLIZIZ = c1295400joY.LIZIZ(c1294810jnb.LJI, c1294810jnb.LJII.floatValue(), c1295580joq, c1295580joq2, f, LJ(), this.LIZLLL)) != null) {
                        return objLIZIZ;
                    }
                    C1295580joq c1295580joq3 = this.LJIIIIZZ;
                    float f2 = c1295580joq.LIZ;
                    float f3 = c1295580joq2.LIZ;
                    PointF pointF = C1295100jo4.LIZ;
                    float f4 = f2 + ((f3 - f2) * f);
                    float f5 = c1295580joq.LIZIZ;
                    float f6 = f5 + (f * (c1295580joq2.LIZIZ - f5));
                    c1295580joq3.LIZ = f4;
                    c1295580joq3.LIZIZ = f6;
                    return c1295580joq3;
                }
                throw new IllegalStateException("Missing values for keyframe.");
            }
        };
    }

    public C1295470jof(List<C1294810jnb<C1295580joq>> list) {
        super(list);
    }
}
