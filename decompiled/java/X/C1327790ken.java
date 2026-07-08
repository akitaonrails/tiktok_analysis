package X;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0ken, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1327790ken implements InterfaceC1327390ke9<C1323050kX9<AbstractC1327750kej>> {
    public final InterfaceC1327390ke9<C1323050kX9<AbstractC1327750kej>> LIZ;
    public final AbstractC1301670jyf LIZIZ;
    public final Executor LIZJ;

    @Override // X.InterfaceC1327390ke9
    public final void LIZIZ(InterfaceC1328020kfA<C1323050kX9<AbstractC1327750kej>> interfaceC1328020kfA, InterfaceC1327930kf1 interfaceC1327930kf1) {
        InterfaceC1328020kfA<C1323050kX9<AbstractC1327750kej>> c1327800keo;
        InterfaceC1325690kbP interfaceC1325690kbPLIZ = interfaceC1327930kf1.LIZ();
        InterfaceC1291910jiv interfaceC1291910jiv = interfaceC1327930kf1.LJFF().LJIJJ;
        final C1327760kek c1327760kek = new C1327760kek(this, interfaceC1328020kfA, interfaceC1325690kbPLIZ, interfaceC1327930kf1.getId(), interfaceC1291910jiv, interfaceC1327930kf1);
        if (interfaceC1291910jiv instanceof InterfaceC1328080kfG) {
            c1327800keo = new C1327800keo(c1327760kek, (InterfaceC1328080kfG) interfaceC1291910jiv, interfaceC1327930kf1);
        } else {
            c1327800keo = new AbstractC1328840kgU<C1323050kX9<AbstractC1327750kej>, C1323050kX9<AbstractC1327750kej>>(c1327760kek) { // from class: X.0kew
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
                    if (!AbstractC1327820keq.LJ(i)) {
                        this.LIZIZ.LIZJ(i, obj);
                    }
                }
            };
        }
        this.LIZ.LIZIZ(c1327800keo, interfaceC1327930kf1);
    }

    public C1327790ken(InterfaceC1327390ke9<C1323050kX9<AbstractC1327750kej>> interfaceC1327390ke9, AbstractC1301670jyf abstractC1301670jyf, Executor executor) {
        interfaceC1327390ke9.getClass();
        this.LIZ = interfaceC1327390ke9;
        this.LIZIZ = abstractC1301670jyf;
        executor.getClass();
        this.LIZJ = executor;
    }
}
