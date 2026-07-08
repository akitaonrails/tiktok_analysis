package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.05an, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1380705an implements InterfaceC1381005aq {
    public final C1380905ap LIZ;
    public final /* synthetic */ C1381605aw<T> LIZIZ;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.05ap] */
    public C1380705an(final C1381605aw<T> c1381605aw) {
        this.LIZIZ = c1381605aw;
        this.LIZ = new InterfaceC1380505al() { // from class: X.05ap
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
            @Override // X.InterfaceC1380505al
            public final void LIZ(float f) {
                C1381605aw<T> c1381605aw2 = c1381605aw;
                c1381605aw2.LJIILL.LIZ(c1381605aw2.LJ(f), 0.0f);
            }
        };
    }

    @Override // X.InterfaceC1381005aq
    public final Object LIZ(EnumC1384205bM enumC1384205bM, C1380405ak c1380405ak, C1394305cz c1394305cz) {
        C1381605aw<T> c1381605aw = this.LIZIZ;
        C05RK c05rk = new C05RK(this, c1380405ak, null);
        c1381605aw.getClass();
        Object objLJ = C2296808zG.LJ(new C1381505av(null, c1381605aw, enumC1384205bM, c05rk, null), c1394305cz);
        if (objLJ != C099R.LJFF()) {
            objLJ = Unit.LIZ;
        }
        if (objLJ != C099R.LJFF()) {
            objLJ = Unit.LIZ;
        }
        if (objLJ == C099R.LJFF()) {
            return objLJ;
        }
        return Unit.LIZ;
    }
}
