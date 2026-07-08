package X;

/* JADX INFO: renamed from: X.0keA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1327400keA implements InterfaceC1327390ke9<C1328480kfu> {
    public final InterfaceC1327290kdz<C1328480kfu>[] LIZ;

    public C1327400keA(InterfaceC1327290kdz<C1328480kfu>... interfaceC1327290kdzArr) {
        this.LIZ = interfaceC1327290kdzArr;
        C1322350kW1.LIZJ(0, interfaceC1327290kdzArr.length);
    }

    @Override // X.InterfaceC1327390ke9
    public final void LIZIZ(InterfaceC1328020kfA<C1328480kfu> interfaceC1328020kfA, InterfaceC1327930kf1 interfaceC1327930kf1) {
        if (interfaceC1327930kf1.LJFF().LJIIJJI == null) {
            interfaceC1328020kfA.LIZJ(1, null);
        } else {
            if (LIZJ(0, interfaceC1328020kfA, interfaceC1327930kf1)) {
                return;
            }
            interfaceC1328020kfA.LIZJ(1, null);
        }
    }

    public final boolean LIZJ(final int i, final InterfaceC1328020kfA<C1328480kfu> interfaceC1328020kfA, final InterfaceC1327930kf1 interfaceC1327930kf1) {
        C1324630kZh c1324630kZh = interfaceC1327930kf1.LJFF().LJIIJJI;
        while (true) {
            InterfaceC1327290kdz<C1328480kfu>[] interfaceC1327290kdzArr = this.LIZ;
            if (i < interfaceC1327290kdzArr.length) {
                if (interfaceC1327290kdzArr[i].LIZ(c1324630kZh)) {
                    if (i != -1) {
                        this.LIZ[i].LIZIZ(new AbstractC1328840kgU<C1328480kfu, C1328480kfu>(interfaceC1328020kfA, interfaceC1327930kf1, i) { // from class: X.0keQ
                            public final InterfaceC1327930kf1 LIZJ;
                            public final int LIZLLL;
                            public final C1324630kZh LJ;

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
                            @Override // X.AbstractC1328840kgU, X.AbstractC1327820keq
                            public final void LJI(Throwable th) {
                                if (!this.LJFF.LIZJ(this.LIZLLL + 1, this.LIZIZ, this.LIZJ)) {
                                    this.LIZIZ.onFailure(th);
                                }
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
                            @Override // X.AbstractC1327820keq
                            public final void LJII(int i2, Object obj) {
                                C1328480kfu c1328480kfu = (C1328480kfu) obj;
                                if (c1328480kfu != null && (AbstractC1327820keq.LJ(i2) || C1327270kdx.LIZIZ(c1328480kfu, this.LJ))) {
                                    this.LIZIZ.LIZJ(i2, c1328480kfu);
                                } else {
                                    if (!AbstractC1327820keq.LIZLLL(i2)) {
                                        return;
                                    }
                                    C1328480kfu.LIZIZ(c1328480kfu);
                                    if (this.LJFF.LIZJ(this.LIZLLL + 1, this.LIZIZ, this.LIZJ)) {
                                        return;
                                    }
                                    this.LIZIZ.LIZJ(1, null);
                                }
                            }

                            {
                                this.LIZJ = interfaceC1327930kf1;
                                this.LIZLLL = i;
                                this.LJ = interfaceC1327930kf1.LJFF().LJIIJJI;
                            }
                        }, interfaceC1327930kf1);
                        return true;
                    }
                    return false;
                }
                i++;
            } else {
                return false;
            }
        }
    }
}
