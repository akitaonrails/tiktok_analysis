package X;

import defpackage.r2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0yaW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.base.handlers.MessageOperatorHandler$dispatchPullHistoryTakoMessages$1", f = "MessageOperatorHandler.kt", l = {2338, 2340, 2344, 2346, 2387, 2398, 2407, 2433, 2441, 2440, 2470, 2485}, m = "invokeSuspend")
public final class C1863300yaW extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public C118300cf LLILZIL;
    public Object LLILZLL;
    public Object LLIZ;
    public int LLIZLLLIL;
    public final /* synthetic */ C1863280yaU LLJ;
    public final /* synthetic */ r2 LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1863300yaW(r2 r2Var, C1863280yaU c1863280yaU, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLJ = c1863280yaU;
        this.LLJI = r2Var;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1863300yaW(this.LLJI, this.LLJ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0398 A[Catch: Exception -> 0x0551, TryCatch #6 {Exception -> 0x0551, blocks: (B:98:0x0392, B:100:0x0398, B:105:0x03ca), top: B:180:0x0392 }] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0431 A[Catch: Exception -> 0x054f, TryCatch #0 {Exception -> 0x054f, blocks: (B:118:0x0425, B:120:0x0431, B:123:0x0436, B:125:0x0448, B:126:0x044e, B:128:0x0454, B:129:0x045f, B:132:0x0476, B:133:0x0492, B:135:0x0498, B:136:0x04a4, B:138:0x04a8, B:139:0x04b1, B:141:0x04b7, B:143:0x04c8, B:145:0x04ce, B:147:0x04d6, B:151:0x0504, B:144:0x04cc, B:109:0x03ec, B:114:0x040f), top: B:170:0x03ec }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0448 A[Catch: Exception -> 0x054f, TryCatch #0 {Exception -> 0x054f, blocks: (B:118:0x0425, B:120:0x0431, B:123:0x0436, B:125:0x0448, B:126:0x044e, B:128:0x0454, B:129:0x045f, B:132:0x0476, B:133:0x0492, B:135:0x0498, B:136:0x04a4, B:138:0x04a8, B:139:0x04b1, B:141:0x04b7, B:143:0x04c8, B:145:0x04ce, B:147:0x04d6, B:151:0x0504, B:144:0x04cc, B:109:0x03ec, B:114:0x040f), top: B:170:0x03ec }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0498 A[Catch: Exception -> 0x054f, LOOP:1: B:133:0x0492->B:135:0x0498, LOOP_END, TryCatch #0 {Exception -> 0x054f, blocks: (B:118:0x0425, B:120:0x0431, B:123:0x0436, B:125:0x0448, B:126:0x044e, B:128:0x0454, B:129:0x045f, B:132:0x0476, B:133:0x0492, B:135:0x0498, B:136:0x04a4, B:138:0x04a8, B:139:0x04b1, B:141:0x04b7, B:143:0x04c8, B:145:0x04ce, B:147:0x04d6, B:151:0x0504, B:144:0x04cc, B:109:0x03ec, B:114:0x040f), top: B:170:0x03ec }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x04a8 A[Catch: Exception -> 0x054f, TryCatch #0 {Exception -> 0x054f, blocks: (B:118:0x0425, B:120:0x0431, B:123:0x0436, B:125:0x0448, B:126:0x044e, B:128:0x0454, B:129:0x045f, B:132:0x0476, B:133:0x0492, B:135:0x0498, B:136:0x04a4, B:138:0x04a8, B:139:0x04b1, B:141:0x04b7, B:143:0x04c8, B:145:0x04ce, B:147:0x04d6, B:151:0x0504, B:144:0x04cc, B:109:0x03ec, B:114:0x040f), top: B:170:0x03ec }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x04cc A[Catch: Exception -> 0x054f, TryCatch #0 {Exception -> 0x054f, blocks: (B:118:0x0425, B:120:0x0431, B:123:0x0436, B:125:0x0448, B:126:0x044e, B:128:0x0454, B:129:0x045f, B:132:0x0476, B:133:0x0492, B:135:0x0498, B:136:0x04a4, B:138:0x04a8, B:139:0x04b1, B:141:0x04b7, B:143:0x04c8, B:145:0x04ce, B:147:0x04d6, B:151:0x0504, B:144:0x04cc, B:109:0x03ec, B:114:0x040f), top: B:170:0x03ec }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x04d6 A[Catch: Exception -> 0x054f, TryCatch #0 {Exception -> 0x054f, blocks: (B:118:0x0425, B:120:0x0431, B:123:0x0436, B:125:0x0448, B:126:0x044e, B:128:0x0454, B:129:0x045f, B:132:0x0476, B:133:0x0492, B:135:0x0498, B:136:0x04a4, B:138:0x04a8, B:139:0x04b1, B:141:0x04b7, B:143:0x04c8, B:145:0x04ce, B:147:0x04d6, B:151:0x0504, B:144:0x04cc, B:109:0x03ec, B:114:0x040f), top: B:170:0x03ec }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0504 A[Catch: Exception -> 0x054f, TRY_ENTER, TryCatch #0 {Exception -> 0x054f, blocks: (B:118:0x0425, B:120:0x0431, B:123:0x0436, B:125:0x0448, B:126:0x044e, B:128:0x0454, B:129:0x045f, B:132:0x0476, B:133:0x0492, B:135:0x0498, B:136:0x04a4, B:138:0x04a8, B:139:0x04b1, B:141:0x04b7, B:143:0x04c8, B:145:0x04ce, B:147:0x04d6, B:151:0x0504, B:144:0x04cc, B:109:0x03ec, B:114:0x040f), top: B:170:0x03ec }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x034e  */
    /* JADX WARN: Type inference failed for: r19v5, types: [com.ss.android.ugc.aweme.tako.ccl.model.api.Message] */
    /* JADX WARN: Type inference failed for: r20v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r21v6, types: [com.ss.android.ugc.aweme.tako.ccl.model.api.Message] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.013C] */
    /* JADX WARN: Type inference failed for: r3v13, types: [X.013C, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v37, types: [X.013C] */
    /* JADX WARN: Type inference failed for: r3v38, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v40, types: [X.013C] */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v48 */
    /* JADX WARN: Type inference failed for: r5v36, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v37, types: [java.lang.Iterable, java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v38, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v42, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v45, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v52 */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r31) {
        /*
            Method dump skipped, instruction units count: 1438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1863300yaW.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
