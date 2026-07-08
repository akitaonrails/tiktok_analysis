package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.03is, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.errorcode.ErrorCodeHandler$getErrorMapping$1", f = "ErrorCodeHandler.kt", l = {227}, m = "invokeSuspend")
public final class C921203is extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C914303hl LL;
    public int LLILLJJLI;

    public C921203is(InterfaceC1364105Vn<? super C921203is> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C921203is(interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c1 A[Catch: all -> 0x00ef, TryCatch #1 {all -> 0x00ef, blocks: (B:28:0x006c, B:29:0x006f, B:31:0x0073, B:33:0x0077, B:35:0x0086, B:41:0x0098, B:42:0x00a2, B:45:0x00ab, B:49:0x00b3, B:51:0x00c1, B:53:0x00c4, B:55:0x00e2, B:57:0x00e6, B:40:0x008e, B:47:0x00af, B:13:0x0046, B:15:0x004a, B:18:0x0050, B:24:0x005c), top: B:64:0x0010, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e2 A[Catch: all -> 0x00ef, TryCatch #1 {all -> 0x00ef, blocks: (B:28:0x006c, B:29:0x006f, B:31:0x0073, B:33:0x0077, B:35:0x0086, B:41:0x0098, B:42:0x00a2, B:45:0x00ab, B:49:0x00b3, B:51:0x00c1, B:53:0x00c4, B:55:0x00e2, B:57:0x00e6, B:40:0x008e, B:47:0x00af, B:13:0x0046, B:15:0x004a, B:18:0x0050, B:24:0x005c), top: B:64:0x0010, inners: #0 }] */
    /* JADX WARN: Type inference failed for: r0v17, types: [X.03it] */
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
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C921203is.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C921203is(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
