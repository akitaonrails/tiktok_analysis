package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06AM, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.service.DmHelper$batchMarkLastPropertyRead$1", f = "DmHelper.kt", l = {157}, m = "invokeSuspend")
public final class C06AM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public int LLILZLL;
    public final /* synthetic */ List<C0Y8T> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06AM(List<C0Y8T> list, InterfaceC1364105Vn<? super C06AM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06AM(this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0064 -> B:6:0x0023). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r8 = "DmHelper@d68.batchMarkLastPropertyRead$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r9.LLILZLL
            r5 = 1
            if (r0 == 0) goto L66
            if (r0 != r5) goto L9a
            java.lang.Object r3 = r9.LLILZIL
            java.lang.Object r1 = r9.LLILZ
            java.lang.Object r4 = r9.LLILLL
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r7 = r9.LLILLJJLI
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r2 = r9.LL
            java.util.Map r2 = (java.util.Map) r2
            X.C155000ia.LIZIZ(r10)
        L23:
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r3, r1)
            java.lang.Object r1 = r0.getFirst()
            java.lang.Object r0 = r0.getSecond()
            r4.put(r1, r0)
            r4 = r2
        L34:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L85
            java.lang.Object r0 = r7.next()
            X.0Y8T r0 = (X.C0Y8T) r0
            java.lang.String r3 = r0.getConversationId()
            com.ss.android.ugc.aweme.im.service.DmHelper r2 = com.ss.android.ugc.aweme.im.service.DmHelper.LIZIZ
            java.util.Map r1 = r2.LJIILJJIL(r0)
            java.lang.String r0 = r0.getConversationId()
            r9.LL = r4
            r9.LLILLJJLI = r7
            r9.LLILLL = r4
            r9.LLILZ = r1
            r9.LLILZIL = r3
            r9.LLILZLL = r5
            java.lang.Object r0 = r2.LJIILIIL(r0, r1, r9)
            if (r0 != r6) goto L64
            X.C1C7U.LIZIZ(r8)
            return r6
        L64:
            r2 = r4
            goto L23
        L66:
            X.C155000ia.LIZIZ(r10)
            java.util.List<X.0Y8T> r2 = r9.LLIZ
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r2, r0)
            int r1 = X.C2097908Jt.LIZIZ(r0)
            r0 = 16
            if (r1 >= r0) goto L7b
            r1 = 16
        L7b:
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>(r1)
            java.util.Iterator r7 = r2.iterator()
            goto L34
        L85:
            X.0YSQ r0 = X.InterfaceC876950Yaj.LIZ
            X.0Yaj r2 = X.C0YSQ.LIZIZ(r0)
            X.06wJ r1 = new X.06wJ
            r0 = 1
            r1.<init>(r0)
            r2.LJIILIIL(r4, r1)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L9a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06AM.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
