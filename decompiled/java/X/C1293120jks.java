package X;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0jks, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1293120jks implements InterfaceC1293620jlg<PointF, PointF> {
    public final List<C1293200jl0<PointF>> LIZ;

    @Override // X.InterfaceC1293620jlg
    public final AbstractC1293310jlB<PointF, PointF> LIZ() {
        if (((C1293200jl0) ListProtector.get(this.LIZ, 0)).LIZLLL == null) {
            return new C1293110jkr(this.LIZ);
        }
        final List<C1293200jl0<PointF>> list = this.LIZ;
        return new AbstractC1293590jld<PointF>(list) { // from class: X.0jkt
            public final PointF LJI = new PointF();
            public final float[] LJII = new float[2];
            public C1293190jkz LJIIIIZZ;
            public PathMeasure LJIIIZ;

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
            @Override // X.AbstractC1293310jlB
            public final Object LJFF(C1293200jl0 c1293200jl0, float f) {
                C1293190jkz c1293190jkz = (C1293190jkz) c1293200jl0;
                Path path = c1293190jkz.LJIIJ;
                if (path == null) {
                    return c1293200jl0.LIZIZ;
                }
                C1292420jjk<A> c1292420jjk = this.LJ;
                if (c1292420jjk != 0) {
                    c1293190jkz.LJFF.floatValue();
                    T t = c1293190jkz.LIZIZ;
                    T t2 = c1293190jkz.LIZJ;
                    LIZLLL();
                    return c1292420jjk.LIZ(t, t2);
                }
                if (this.LJIIIIZZ != c1293190jkz) {
                    this.LJIIIZ = new PathMeasure(path, false);
                    this.LJIIIIZZ = c1293190jkz;
                }
                PathMeasure pathMeasure = this.LJIIIZ;
                pathMeasure.getPosTan(f * pathMeasure.getLength(), this.LJII, null);
                PointF pointF = this.LJI;
                float[] fArr = this.LJII;
                pointF.set(fArr[0], fArr[1]);
                return this.LJI;
            }
        };
    }

    public C1293120jks() {
        this.LIZ = Collections.singletonList(new C1293200jl0(new PointF(0.0f, 0.0f)));
    }

    public C1293120jks(List<C1293200jl0<PointF>> list) {
        this.LIZ = list;
    }
}
