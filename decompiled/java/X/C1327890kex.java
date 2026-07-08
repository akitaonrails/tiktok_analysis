package X;

/* JADX INFO: renamed from: X.0kex, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1327890kex<T> implements InterfaceC1327390ke9<Void> {
    public final InterfaceC1327390ke9<T> LIZ;

    public C1327890kex(InterfaceC1327390ke9<T> interfaceC1327390ke9) {
        this.LIZ = interfaceC1327390ke9;
    }

    @Override // X.InterfaceC1327390ke9
    public final void LIZIZ(final InterfaceC1328020kfA<Void> interfaceC1328020kfA, InterfaceC1327930kf1 interfaceC1327930kf1) {
        this.LIZ.LIZIZ(new AbstractC1328840kgU<T, Void>(interfaceC1328020kfA) { // from class: X.0kf3
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
            @Override // X.AbstractC1327820keq
            public final void LJII(int i, Object obj) {
                if (AbstractC1327820keq.LIZLLL(i)) {
                    this.LIZIZ.LIZJ(i, null);
                }
            }
        }, interfaceC1327930kf1);
    }
}
