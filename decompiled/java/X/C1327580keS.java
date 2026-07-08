package X;

import android.os.Build;

/* JADX INFO: renamed from: X.0keS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1327580keS implements InterfaceC1327390ke9<C1328480kfu> {
    public final InterfaceC1327390ke9<C1328480kfu> LIZ;
    public final InterfaceC1327390ke9<C1328480kfu> LIZIZ;

    public C1327580keS(InterfaceC1327390ke9 interfaceC1327390ke9, C1328600kg6 c1328600kg6) {
        this.LIZ = interfaceC1327390ke9;
        this.LIZIZ = c1328600kg6;
    }

    @Override // X.InterfaceC1327390ke9
    public final void LIZIZ(final InterfaceC1328020kfA<C1328480kfu> interfaceC1328020kfA, final InterfaceC1327930kf1 interfaceC1327930kf1) {
        this.LIZ.LIZIZ(new AbstractC1328840kgU<C1328480kfu, C1328480kfu>(interfaceC1328020kfA, interfaceC1327930kf1) { // from class: X.0keR
            public final InterfaceC1327930kf1 LIZJ;

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
            @Override // X.AbstractC1328840kgU, X.AbstractC1327820keq
            public final void LJI(Throwable th) {
                this.LIZLLL.LIZIZ.LIZIZ(this.LIZIZ, this.LIZJ);
            }

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
            @Override // X.AbstractC1327820keq
            public final void LJII(int i, Object obj) throws Throwable {
                C1328480kfu c1328480kfu = (C1328480kfu) obj;
                C1325710kbR c1325710kbRLJFF = this.LIZJ.LJFF();
                boolean zLIZLLL = AbstractC1327820keq.LIZLLL(i);
                boolean zLIZIZ = C1327270kdx.LIZIZ(c1328480kfu, c1325710kbRLJFF.LJIIJJI);
                if (c1328480kfu != null && (zLIZIZ || c1325710kbRLJFF.LJIIIIZZ)) {
                    if (zLIZLLL && zLIZIZ) {
                        this.LIZIZ.LIZJ(i, c1328480kfu);
                        return;
                    } else {
                        this.LIZIZ.LIZJ(i & (-2), c1328480kfu);
                    }
                }
                if (!zLIZLLL || zLIZIZ) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 29 && c1325710kbRLJFF.LJIIIZ) {
                    return;
                }
                C1328480kfu.LIZIZ(c1328480kfu);
                this.LIZLLL.LIZIZ.LIZIZ(this.LIZIZ, this.LIZJ);
            }

            {
                this.LIZJ = interfaceC1327930kf1;
            }
        }, interfaceC1327930kf1);
    }
}
