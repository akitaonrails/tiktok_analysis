package X;

import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: renamed from: X.0OLA, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OLA {
    public static AnonymousClass0956 LIZLLL;
    public static final C0OLA LIZ = new C0OLA();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(545));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(544));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(543));
    public static EnumC617480OJu LJFF = EnumC617480OJu.UNINITIALIZED;

    /* JADX WARN: Removed duplicated region for block: B:30:0x0095  */
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
    public final java.lang.Object LIZ(boolean r7, X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C01QS
            if (r0 == 0) goto L95
            r3 = r8
            X.01QS r3 = (X.C01QS) r3
            int r2 = r3.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L95
            int r2 = r2 - r1
            r3.LLILZ = r2
        L12:
            java.lang.Object r1 = r3.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r3.LLILZ
            r2 = 1
            if (r0 == 0) goto L3c
            if (r0 != r2) goto L9c
            java.lang.Object r5 = r3.LL
            java.util.Collection r5 = (java.util.Collection) r5
            X.C155000ia.LIZIZ(r1)
        L26:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            if (r0 != 0) goto L39
            X.01GW r0 = X.C0OLA.LIZJ
            java.lang.Object r0 = r0.getValue()
            java.util.concurrent.ConcurrentLinkedQueue r0 = (java.util.concurrent.ConcurrentLinkedQueue) r0
            r0.addAll(r5)
        L39:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L3c:
            X.C155000ia.LIZIZ(r1)
            X.01GW r0 = X.C0OLA.LIZJ
            java.lang.Object r0 = r0.getValue()
            java.util.concurrent.ConcurrentLinkedQueue r0 = (java.util.concurrent.ConcurrentLinkedQueue) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L39
            if (r7 != 0) goto L57
            X.0OJu r1 = X.C0OLA.LJFF
            X.0OJu r0 = X.EnumC617480OJu.SUBSCRIBED
            if (r1 != r0) goto L39
        L57:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L5c:
            X.01GW r1 = X.C0OLA.LIZJ
            java.lang.Object r0 = r1.getValue()
            java.util.concurrent.ConcurrentLinkedQueue r0 = (java.util.concurrent.ConcurrentLinkedQueue) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L80
            java.lang.Object r0 = r1.getValue()
            java.util.concurrent.ConcurrentLinkedQueue r0 = (java.util.concurrent.ConcurrentLinkedQueue) r0
            java.lang.Object r0 = r0.poll()
            if (r0 == 0) goto L5c
            boolean r0 = r5.add(r0)
            java.lang.Boolean.valueOf(r0)
            goto L5c
        L80:
            X.01GW r0 = X.C0OLA.LJ
            java.lang.Object r0 = r0.getValue()
            X.0ONX r0 = (X.C0ONX) r0
            X.0Obw r0 = r0.LLILLL
            r3.LL = r5
            r3.LLILZ = r2
            java.lang.Object r1 = r0.LJLZ(r5, r3)
            if (r1 != r4) goto L26
            return r4
        L95:
            X.01QS r3 = new X.01QS
            r3.<init>(r6, r8)
            goto L12
        L9c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0OLA.LIZ(boolean, X.05Vn):java.lang.Object");
    }
}
