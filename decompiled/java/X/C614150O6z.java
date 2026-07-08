package X;

/* JADX INFO: renamed from: X.0O6z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C614150O6z implements InterfaceC613990O6j {
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
    /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r0v14 boolean
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    public static X.InterfaceC613710O5h LIZIZ(X.C613970O6h r4) {
        /*
            X.0O8O r1 = r4.LIZIZ
            X.0O8U r0 = X.C0O8D.LIZJ
            X.0O8Q r0 = r1.LIZ(r0)
            X.0O8D r0 = (X.C0O8D) r0
            r3 = 0
            if (r0 == 0) goto Lf
            X.0O70<DTO, PO, Q extends X.0O5k<DTO>> r3 = r0.LIZIZ
        Lf:
            boolean r0 = r3 instanceof X.C0O70
            if (r0 == 0) goto L4d
            if (r3 == 0) goto L4d
            X.0O71<java.lang.String, PO> r1 = r3.LIZ
            X.01GW r0 = r4.LIZLLL
            java.lang.Object r0 = r0.getValue()
            java.lang.Object r2 = r1.get(r0)
            kotlin.jvm.functions.Function2<Q extends X.0O5j<DTO>, PO, DTO extends X.0O5h> r1 = r3.LIZIZ
            if (r1 == 0) goto L30
            X.0O5j<D extends X.0O5h> r0 = r4.LIZ
            java.lang.Object r0 = r1.invoke(r0, r2)
            X.0O5h r0 = (X.InterfaceC613710O5h) r0
            if (r0 == 0) goto L30
            return r0
        L30:
            if (r2 == 0) goto L45
            java.lang.Class<DTO extends X.0O5h> r0 = r3.LIZLLL
            boolean r0 = r0.isInstance(r2)
            if (r0 == 0) goto L3d
            X.0O5h r2 = (X.InterfaceC613710O5h) r2
            return r2
        L3d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            r1.<init>(r0)
            throw r1
        L45:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = "Cache Content Empty!!!"
            r1.<init>(r0)
            throw r1
        L4d:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = "Cache Instance Empty!!!"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C614150O6z.LIZIZ(X.0O6h):X.0O5h");
    }

    @Override // X.InterfaceC613990O6j
    public final <D extends InterfaceC613710O5h> InterfaceC346201Wa<C0O7A<D>> LIZ(C613970O6h<D> c613970O6h, C613980O6i c613980O6i) {
        if (!(c613970O6h.LIZ instanceof InterfaceC613740O5k)) {
            return c613980O6i.LIZ(c613970O6h);
        }
        return new C095D(new C614140O6y(c613970O6h, this, new C0O76(c613970O6h), c613980O6i, null));
    }
}
