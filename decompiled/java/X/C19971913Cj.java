package X;

/* JADX INFO: renamed from: X.13Cj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19971913Cj extends C19971313Cd<AbstractC19973513Cz<Object>, InterfaceC19973313Cx<Object>> implements C13D2 {
    public static final C19971913Cj LLILZIL = new C19971913Cj(C19971213Cc.LJ, 0);

    @Override // X.C19971313Cd
    /* JADX INFO: renamed from: LJII */
    public final C19971113Cb<AbstractC19973513Cz<Object>, InterfaceC19973313Cx<Object>> builder() {
        return new C19971813Ci(this);
    }

    @Override // X.C19971313Cd, X.InterfaceC19973113Cv
    public final C13D3<AbstractC19973513Cz<Object>, InterfaceC19973313Cx<Object>> builder() {
        return new C19971813Ci(this);
    }

    @Override // X.C19971313Cd, X.InterfaceC19973113Cv
    /* JADX INFO: renamed from: builder, reason: avoid collision after fix types in other method */
    public final C13D3<AbstractC19973513Cz<Object>, InterfaceC19973313Cx<Object>> builder2() {
        return new C19971813Ci(this);
    }

    @Override // X.InterfaceC1670270tZB
    public final Object LIZ(C13DN c13dn) {
        return C19973413Cy.LIZ(this, c13dn);
    }

    @Override // X.InterfaceC20036213aS
    public final Object LIZIZ(C13DN c13dn) {
        return C19973413Cy.LIZ(this, c13dn);
    }

    @Override // X.C19971313Cd, X.AbstractC19969013Bg, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof AbstractC19973513Cz)) {
            return false;
        }
        return super.containsKey(obj);
    }

    @Override // X.AbstractC19969013Bg, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof InterfaceC19973313Cx)) {
            return false;
        }
        return super.containsValue(obj);
    }

    @Override // X.C19971313Cd, X.AbstractC19969013Bg, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (!(obj instanceof AbstractC19973513Cz)) {
            return null;
        }
        return super.get(obj);
    }

    public C19971913Cj(C19971213Cc<AbstractC19973513Cz<Object>, InterfaceC19973313Cx<Object>> c19971213Cc, int i) {
        super(c19971213Cc, i);
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
    @Override // X.C13D2
    public final C19971913Cj LJIJI(AbstractC19973513Cz abstractC19973513Cz, InterfaceC19973313Cx interfaceC19973313Cx) {
        C19972013Ck c19972013CkLJIJJ = this.LLILLJJLI.LJIJJ(abstractC19973513Cz.hashCode(), 0, abstractC19973513Cz, interfaceC19973313Cx);
        if (c19972013CkLJIJJ == null) {
            return this;
        }
        return new C19971913Cj(c19972013CkLJIJJ.LIZ, this.LLILLL + c19972013CkLJIJJ.LIZIZ);
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof AbstractC19973513Cz)) {
            return obj2;
        }
        return super.getOrDefault(obj, obj2);
    }
}
