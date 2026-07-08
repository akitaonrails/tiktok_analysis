package X;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.0jnj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1294890jnj implements InterfaceC1294490jn5<PointF, PointF> {
    public final List<C1294810jnb<PointF>> LIZ;

    @Override // X.InterfaceC1294490jn5
    public final AbstractC1295190joD<PointF, PointF> LIZ() {
        if (((C1294810jnb) ListProtector.get(this.LIZ, 0)).LIZJ()) {
            return new C1295270joL(this.LIZ);
        }
        final List<C1294810jnb<PointF>> list = this.LIZ;
        return new AbstractC1295610jot<PointF>(list) { // from class: X.0jo7
            public final PointF LJIIIIZZ = new PointF();
            public final float[] LJIIIZ = new float[2];
            public final PathMeasure LJIIJ = new PathMeasure();
            public C1294830jnd LJIIJJI;

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
                Object objLIZIZ;
                C1294830jnd c1294830jnd = (C1294830jnd) c1294810jnb;
                Path path = c1294830jnd.LJIILLIIL;
                if (path == null) {
                    return c1294810jnb.LIZIZ;
                }
                C1295400joY<A> c1295400joY = this.LJ;
                if (c1295400joY != 0 && (objLIZIZ = c1295400joY.LIZIZ(c1294830jnd.LJI, c1294830jnd.LJII.floatValue(), c1294830jnd.LIZIZ, c1294830jnd.LIZJ, LJ(), f, this.LIZLLL)) != null) {
                    return objLIZIZ;
                }
                if (this.LJIIJJI != c1294830jnd) {
                    this.LJIIJ.setPath(path, false);
                    this.LJIIJJI = c1294830jnd;
                }
                PathMeasure pathMeasure = this.LJIIJ;
                pathMeasure.getPosTan(f * pathMeasure.getLength(), this.LJIIIZ, null);
                PointF pointF = this.LJIIIIZZ;
                float[] fArr = this.LJIIIZ;
                pointF.set(fArr[0], fArr[1]);
                return this.LJIIIIZZ;
            }
        };
    }

    @Override // X.InterfaceC1294490jn5
    public final boolean LIZJ() {
        return this.LIZ.size() == 1 && ((C1294810jnb) ListProtector.get(this.LIZ, 0)).LIZJ();
    }

    @Override // X.InterfaceC1294490jn5
    public final List<C1294810jnb<PointF>> LIZIZ() {
        return this.LIZ;
    }

    public C1294890jnj(List<C1294810jnb<PointF>> list) {
        this.LIZ = list;
    }
}
