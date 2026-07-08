package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0ke5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1327350ke5<T> implements InterfaceC1327390ke9<T> {
    public final InterfaceC1327390ke9<T> LIZ;
    public final C1325570kbD LIZIZ;

    public C1327350ke5(InterfaceC1327390ke9<T> interfaceC1327390ke9, C1325570kbD c1325570kbD) {
        interfaceC1327390ke9.getClass();
        this.LIZ = interfaceC1327390ke9;
        this.LIZIZ = c1325570kbD;
    }

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
    @Override // X.InterfaceC1327390ke9
    public final void LIZIZ(final InterfaceC1328020kfA<T> interfaceC1328020kfA, final InterfaceC1327930kf1 interfaceC1327930kf1) {
        final InterfaceC1325690kbP interfaceC1325690kbPLIZ = interfaceC1327930kf1.LIZ();
        final String id = interfaceC1327930kf1.getId();
        final AbstractC1327310ke1<T> abstractC1327310ke1 = new AbstractC1327310ke1<T>(interfaceC1328020kfA, interfaceC1325690kbPLIZ, id) { // from class: X.0ke4
            @Override // X.AbstractRunnableC2124508Tz
            public final void LIZIZ(T t) {
            }

            @Override // X.AbstractRunnableC2124508Tz
            public final T LIZJ() {
                return null;
            }

            @Override // X.AbstractC1327520keM
            public final Map LJII() {
                long j = this.LLIZ;
                if (j <= 0 || j <= 0) {
                    return null;
                }
                return C19871212ow.of("pendingTime", String.valueOf(j));
            }

            @Override // X.AbstractC1327520keM, X.AbstractRunnableC2124508Tz
            public final void LJFF(T t) {
                Map<String, String> mapLJIIIIZZ;
                InterfaceC1325690kbP interfaceC1325690kbP = interfaceC1325690kbPLIZ;
                String str = id;
                if (interfaceC1325690kbP.LJIIJ(str)) {
                    mapLJIIIIZZ = LJIIIIZZ(t);
                } else {
                    mapLJIIIIZZ = null;
                }
                interfaceC1325690kbP.LIZIZ(str, "BackgroundThreadHandoffProducer", mapLJIIIIZZ);
                this.LLJILJIL.LIZ.LIZIZ(interfaceC1328020kfA, interfaceC1327930kf1);
            }

            @Override // X.AbstractC1327520keM
            public final Map<String, String> LJIIIIZZ(T t) {
                long j = this.LLIZ;
                if (j > 0 && j > 0) {
                    return C19871212ow.of("pendingTime", String.valueOf(j));
                }
                return null;
            }
        };
        interfaceC1327930kf1.LJ(new C1330860kjk() { // from class: X.0ke7
            @Override // X.InterfaceC1330340kiu
            public final void LIZJ() {
                abstractC1327310ke1.LIZ();
                C1325570kbD c1325570kbD = this.LIZIZ.LIZIZ;
                AbstractC1327520keM abstractC1327520keM = abstractC1327310ke1;
                synchronized (c1325570kbD) {
                    c1325570kbD.LIZIZ.remove(abstractC1327520keM);
                }
            }
        });
        C1325570kbD c1325570kbD = this.LIZIZ;
        synchronized (c1325570kbD) {
            if (c1325570kbD.LIZ) {
                c1325570kbD.LIZIZ.add(abstractC1327310ke1);
            } else {
                c1325570kbD.LIZJ.execute(abstractC1327310ke1);
            }
        }
    }
}
