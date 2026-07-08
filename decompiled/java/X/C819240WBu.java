package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.0WBu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C819240WBu<T> implements InterfaceC819160WBm<T> {
    public final AbstractC818550W9d LIZ;
    public final String LIZIZ;
    public final C814570VxP LIZJ;
    public final C0WC0<T, byte[]> LIZLLL;
    public final InterfaceC819180WBo LJ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0WC3] */
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
    @Override // X.InterfaceC819160WBm
    public final void LIZ(C818650W9n c818650W9n) {
        ?? r2 = new C0WC4() { // from class: X.0WC3
        };
        InterfaceC819180WBo interfaceC819180WBo = this.LJ;
        C819280WBy c819280WBy = new C819280WBy();
        AbstractC818550W9d abstractC818550W9d = this.LIZ;
        if (abstractC818550W9d != null) {
            c819280WBy.LIZ = abstractC818550W9d;
            c819280WBy.LIZJ = c818650W9n;
            String str = this.LIZIZ;
            if (str != null) {
                c819280WBy.LIZIZ = str;
                C0WC0<T, byte[]> c0wc0 = this.LIZLLL;
                if (c0wc0 != null) {
                    c819280WBy.LIZLLL = c0wc0;
                    C814570VxP c814570VxP = this.LIZJ;
                    if (c814570VxP != null) {
                        c819280WBy.LJ = c814570VxP;
                        String strLIZIZ = "";
                        if (c819280WBy.LIZLLL == null) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("");
                            sbLIZ.append(" transformer");
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        }
                        if (c819280WBy.LJ == null) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(strLIZIZ);
                            sbLIZ2.append(" encoding");
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                        }
                        if (strLIZIZ.isEmpty()) {
                            C819260WBw c819260WBw = new C819260WBw(c819280WBy.LIZ, c819280WBy.LIZIZ, c819280WBy.LIZJ, c819280WBy.LIZLLL, c819280WBy.LJ);
                            C819200WBq c819200WBq = (C819200WBq) interfaceC819180WBo;
                            InterfaceC819290WBz interfaceC819290WBz = c819200WBq.LIZJ;
                            AbstractC818550W9d abstractC818550W9d2 = c819260WBw.LIZ;
                            EnumC816340W0q enumC816340W0qLIZJ = c819260WBw.LIZJ.LIZJ();
                            abstractC818550W9d2.getClass();
                            C818570W9f c818570W9fLIZ = AbstractC818550W9d.LIZ();
                            c818570W9fLIZ.LIZIZ(abstractC818550W9d2.LIZIZ());
                            c818570W9fLIZ.LIZJ(enumC816340W0qLIZJ);
                            c818570W9fLIZ.LIZIZ = abstractC818550W9d2.LIZJ();
                            C818560W9e c818560W9eLIZ = c818570W9fLIZ.LIZ();
                            C819250WBv c819250WBv = new C819250WBv();
                            c819250WBv.LJFF = new HashMap();
                            c819250WBv.LIZLLL = Long.valueOf(c819200WBq.LIZ.getTime());
                            c819250WBv.LJ = Long.valueOf(c819200WBq.LIZIZ.getTime());
                            c819250WBv.LIZLLL(c819260WBw.LIZIZ);
                            c819250WBv.LIZJ(new C0WCB(c819260WBw.LJ, c819260WBw.LIZLLL.apply(c819260WBw.LIZJ.LIZIZ())));
                            c819250WBv.LIZIZ = c819260WBw.LIZJ.LIZ();
                            interfaceC819290WBz.LIZ(r2, c819250WBv.LIZIZ(), c818560W9eLIZ);
                            return;
                        }
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("Missing required properties:");
                        sbLIZ3.append(strLIZIZ);
                        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ3));
                    }
                    throw new NullPointerException("Null encoding");
                }
                throw new NullPointerException("Null transformer");
            }
            throw new NullPointerException("Null transportName");
        }
        throw new NullPointerException("Null transportContext");
    }

    public C819240WBu(AbstractC818550W9d abstractC818550W9d, String str, C814570VxP c814570VxP, C0WC0<T, byte[]> c0wc0, InterfaceC819180WBo interfaceC819180WBo) {
        this.LIZ = abstractC818550W9d;
        this.LIZIZ = str;
        this.LIZJ = c814570VxP;
        this.LIZLLL = c0wc0;
        this.LJ = interfaceC819180WBo;
    }
}
