package X;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Vk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2", f = "ForEachGesture.kt", l = {102, 105, 110}, m = "invokeSuspend")
public final class C1363805Vk extends C09AW implements Function2<C05ZT, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ CoroutineContext LLILZ;
    public final /* synthetic */ Function2<C05ZT, InterfaceC1364105Vn<? super Unit>, Object> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1363805Vk(InterfaceC1364105Vn interfaceC1364105Vn, CoroutineContext coroutineContext, Function2 function2) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = coroutineContext;
        this.LLILZIL = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1363805Vk c1363805Vk = new C1363805Vk(interfaceC1364105Vn, this.LLILZ, this.LLILZIL);
        c1363805Vk.LLILLL = obj;
        return c1363805Vk;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0020 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.05ZT, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.05ZT, java.lang.Object] */
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0046 -> B:8:0x0018). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0061 -> B:8:0x0018). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILLJJLI
            r5 = 3
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L64
            if (r0 == r3) goto L35
            if (r0 == r4) goto L2d
            if (r0 != r5) goto L70
            java.lang.Object r0 = r7.LLILLL
            X.05ZT r0 = (X.C05ZT) r0
            X.C155000ia.LIZIZ(r8)
        L18:
            kotlin.coroutines.CoroutineContext r1 = r7.LLILZ
            boolean r1 = X.C23118094a.LJIIIIZZ(r1)
            if (r1 == 0) goto L6d
            kotlin.jvm.functions.Function2<X.05ZT, X.05Vn<? super kotlin.Unit>, java.lang.Object> r1 = r7.LLILZIL     // Catch: java.util.concurrent.CancellationException -> L49
            r7.LLILLL = r0     // Catch: java.util.concurrent.CancellationException -> L49
            r7.LLILLJJLI = r3     // Catch: java.util.concurrent.CancellationException -> L49
            java.lang.Object r1 = r1.invoke(r0, r7)     // Catch: java.util.concurrent.CancellationException -> L49
            if (r1 != r6) goto L3c
            goto L6c
        L2d:
            java.lang.Object r0 = r7.LLILLL
            X.05ZT r0 = (X.C05ZT) r0
            X.C155000ia.LIZIZ(r8)     // Catch: java.util.concurrent.CancellationException -> L4b
            goto L18
        L35:
            java.lang.Object r0 = r7.LLILLL
            X.05ZT r0 = (X.C05ZT) r0
            X.C155000ia.LIZIZ(r8)     // Catch: java.util.concurrent.CancellationException -> L4b
        L3c:
            r7.LLILLL = r0     // Catch: java.util.concurrent.CancellationException -> L49
            r7.LLILLJJLI = r4     // Catch: java.util.concurrent.CancellationException -> L49
            X.13fE r1 = X.EnumC20065813fE.Final     // Catch: java.util.concurrent.CancellationException -> L49
            java.lang.Object r1 = X.C1363905Vl.LIZ(r0, r1, r7)     // Catch: java.util.concurrent.CancellationException -> L49
            if (r1 != r6) goto L18
            goto L78
        L49:
            r2 = move-exception
            goto L4c
        L4b:
            r2 = move-exception
        L4c:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            kotlin.coroutines.CoroutineContext r1 = r7.LLILZ
            boolean r1 = X.C23118094a.LJIIIIZZ(r1)
            if (r1 == 0) goto L79
            r7.LLILLL = r0
            r7.LLILLJJLI = r5
            X.13fE r1 = X.EnumC20065813fE.Final
            java.lang.Object r1 = X.C1363905Vl.LIZ(r0, r1, r7)
            if (r1 != r6) goto L18
            return r6
        L64:
            X.C155000ia.LIZIZ(r8)
            java.lang.Object r0 = r7.LLILLL
            X.05ZT r0 = (X.C05ZT) r0
            goto L18
        L6c:
            return r6
        L6d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L70:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L78:
            return r6
        L79:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1363805Vk.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C05ZT c05zt, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c05zt, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
