package X;

/* JADX INFO: renamed from: X.0aoL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C949310aoL<S, E> implements InterfaceC949330aoN<S, E> {
    public final InterfaceC949280aoI<S, E> LIZ;
    public final InterfaceC497601wk LIZIZ;
    public final C1DEV LIZJ = C2191201ApK.LIZ();
    public final C2252321DDq LIZLLL;
    public final C2252321DDq LJ;
    public final C2252331DDr LJFF;
    public final C2252331DDr LJI;
    public final C2252331DDr LJII;

    @Override // X.InterfaceC949330aoN
    public final S getCurrentState() {
        return (S) this.LIZLLL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cd  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, java.lang.Object] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C1254804va r13, X.InterfaceC1364105Vn r14) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C949310aoL.LIZIZ(X.04va, X.05Vn):java.lang.Object");
    }

    public C949310aoL(Object obj, C949200aoA c949200aoA, InterfaceC497601wk interfaceC497601wk) {
        this.LIZ = c949200aoA;
        this.LIZIZ = interfaceC497601wk;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(obj);
        this.LIZLLL = c2252321DDqLIZ;
        this.LJ = c2252321DDqLIZ;
        EnumC2252401DDy enumC2252401DDy = EnumC2252401DDy.DROP_OLDEST;
        C2252331DDr c2252331DDrLIZ = C09IR.LIZ(0, 64, enumC2252401DDy);
        this.LJFF = c2252331DDrLIZ;
        this.LJI = c2252331DDrLIZ;
        this.LJII = C09IR.LIZ(0, 64, enumC2252401DDy);
    }
}
