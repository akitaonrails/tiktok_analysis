package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0keu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1327860keu implements InterfaceC1327390ke9<C1323050kX9<InterfaceC1327060kdc>> {
    public final InterfaceC1327390ke9<C1328480kfu> LIZ;

    public C1327860keu(InterfaceC1327390ke9<C1328480kfu> interfaceC1327390ke9) {
        this.LIZ = interfaceC1327390ke9;
    }

    @Override // X.InterfaceC1327390ke9
    public final void LIZIZ(final InterfaceC1328020kfA<C1323050kX9<InterfaceC1327060kdc>> interfaceC1328020kfA, InterfaceC1327930kf1 interfaceC1327930kf1) {
        this.LIZ.LIZIZ(new AbstractC1328840kgU<C1328480kfu, C1323050kX9<InterfaceC1327060kdc>>(interfaceC1328020kfA) { // from class: X.0kev
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
                C1328480kfu c1328480kfu = (C1328480kfu) obj;
                C1323050kX9<InterfaceC1327060kdc> c1323050kX9LJFF = null;
                try {
                    if (C1328480kfu.LJIIZILJ(c1328480kfu)) {
                        c1323050kX9LJFF = c1328480kfu.LJFF();
                    }
                    this.LIZIZ.LIZJ(i, c1323050kX9LJFF);
                    C1323050kX9.LJII(c1323050kX9LJFF);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1323050kX9.LJII(c1323050kX9LJFF);
                    throw th;
                }
            }
        }, interfaceC1327930kf1);
    }
}
