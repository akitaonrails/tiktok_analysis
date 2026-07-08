package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0xuv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.api.pcs.infra.payment.task.fetch.AbsFetchTemplateTask$doTask$1", f = "AbsFetchTemplateTask.kt", l = {43}, m = "invokeSuspend")
public final class C1837510xuv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C259800zU LL;
    public C259800zU LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ AbstractC1837520xuw<RESPONSE, FETCH_PARAM_GLOBAL> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1837510xuv(AbstractC1837520xuw<RESPONSE, FETCH_PARAM_GLOBAL> abstractC1837520xuw, InterfaceC1364105Vn<? super C1837510xuv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = abstractC1837520xuw;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1837510xuv(this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059 A[Catch: all -> 0x00d4, TryCatch #0 {all -> 0x00d4, blocks: (B:16:0x004b, B:17:0x004e, B:18:0x0051, B:20:0x0059, B:21:0x005b, B:23:0x0066, B:24:0x0068, B:26:0x0070, B:28:0x0076, B:30:0x007c, B:31:0x007e, B:33:0x0087, B:34:0x008d, B:41:0x00af, B:35:0x0090, B:37:0x0096, B:38:0x00a0, B:40:0x00a6, B:44:0x00b8, B:46:0x00be, B:47:0x00c8, B:49:0x00ce, B:9:0x0021, B:11:0x0030), top: B:56:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066 A[Catch: all -> 0x00d4, TryCatch #0 {all -> 0x00d4, blocks: (B:16:0x004b, B:17:0x004e, B:18:0x0051, B:20:0x0059, B:21:0x005b, B:23:0x0066, B:24:0x0068, B:26:0x0070, B:28:0x0076, B:30:0x007c, B:31:0x007e, B:33:0x0087, B:34:0x008d, B:41:0x00af, B:35:0x0090, B:37:0x0096, B:38:0x00a0, B:40:0x00a6, B:44:0x00b8, B:46:0x00be, B:47:0x00c8, B:49:0x00ce, B:9:0x0021, B:11:0x0030), top: B:56:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070 A[Catch: all -> 0x00d4, TryCatch #0 {all -> 0x00d4, blocks: (B:16:0x004b, B:17:0x004e, B:18:0x0051, B:20:0x0059, B:21:0x005b, B:23:0x0066, B:24:0x0068, B:26:0x0070, B:28:0x0076, B:30:0x007c, B:31:0x007e, B:33:0x0087, B:34:0x008d, B:41:0x00af, B:35:0x0090, B:37:0x0096, B:38:0x00a0, B:40:0x00a6, B:44:0x00b8, B:46:0x00be, B:47:0x00c8, B:49:0x00ce, B:9:0x0021, B:11:0x0030), top: B:56:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b8 A[Catch: all -> 0x00d4, TryCatch #0 {all -> 0x00d4, blocks: (B:16:0x004b, B:17:0x004e, B:18:0x0051, B:20:0x0059, B:21:0x005b, B:23:0x0066, B:24:0x0068, B:26:0x0070, B:28:0x0076, B:30:0x007c, B:31:0x007e, B:33:0x0087, B:34:0x008d, B:41:0x00af, B:35:0x0090, B:37:0x0096, B:38:0x00a0, B:40:0x00a6, B:44:0x00b8, B:46:0x00be, B:47:0x00c8, B:49:0x00ce, B:9:0x0021, B:11:0x0030), top: B:56:0x000d }] */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, X.0Icr] */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1837510xuv.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
