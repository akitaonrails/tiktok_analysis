package X;

import java.util.List;

/* JADX INFO: renamed from: X.0jkf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1292990jkf extends AbstractC1293220jl2<Integer, Integer> {
    public C1292990jkf() {
        super(100);
    }

    @Override // X.InterfaceC1293620jlg
    public final AbstractC1293310jlB<Integer, Integer> LIZ() {
        final List<C1293200jl0<V>> list = this.LIZ;
        return new AbstractC1293590jld<Integer>(list) { // from class: X.0jkj
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
            @Override // X.AbstractC1293310jlB
            public final Object LJFF(C1293200jl0 c1293200jl0, float f) {
                T t = c1293200jl0.LIZIZ;
                if (t != 0 && c1293200jl0.LIZJ != 0) {
                    C1292420jjk<A> c1292420jjk = this.LJ;
                    if (c1292420jjk != 0) {
                        c1293200jl0.LJFF.floatValue();
                        T t2 = c1293200jl0.LIZIZ;
                        T t3 = c1293200jl0.LIZJ;
                        LIZLLL();
                        return c1292420jjk.LIZ(t2, t3);
                    }
                    return Integer.valueOf((int) (((Integer) t).intValue() + (f * (((Integer) c1293200jl0.LIZJ).intValue() - r2))));
                }
                throw new IllegalStateException("Missing values for keyframe.");
            }
        };
    }

    public C1292990jkf(List<C1293200jl0<Integer>> list) {
        super((List) list);
    }
}
