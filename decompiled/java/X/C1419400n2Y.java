package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0n2Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.autocut.sdk.smartmovie.network.NetRequest$requestTemplateList$1", f = "NetRequest.kt", l = {110, 185, 201, 241, 255, 259}, m = "invokeSuspend")
public final class C1419400n2Y extends C09AX implements Function2<InterfaceC346701Wf<? super C096D>, InterfaceC1364105Vn<? super Unit>, Object> {
    public C259800zU LL;
    public InterfaceC1685420txc LLILLJJLI;
    public Object LLILLL;
    public boolean LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public /* synthetic */ Object LLIZ;
    public final /* synthetic */ C23187096r LLIZLLLIL;
    public final /* synthetic */ InterfaceC1419480n2g LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1419400n2Y(C23187096r c23187096r, InterfaceC1419480n2g interfaceC1419480n2g, InterfaceC1364105Vn<? super C1419400n2Y> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZLLLIL = c23187096r;
        this.LLJ = interfaceC1419480n2g;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1419400n2Y c1419400n2Y = new C1419400n2Y(this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
        c1419400n2Y.LLIZ = obj;
        return c1419400n2Y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0237  */
    /* JADX WARN: Type inference failed for: r0v58, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r15v10, types: [X.0txc] */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v4, types: [X.0n2X, X.0txc] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7, types: [X.0txc] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r19v1, types: [X.0n2Z] */
    /* JADX WARN: Type inference failed for: r20v4, types: [X.0txc] */
    /* JADX WARN: Type inference failed for: r27v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r37v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r41v3, types: [X.0txc] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [int] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [int] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [int] */
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
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r48) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1419400n2Y.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super C096D> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
