package X;

import com.ss.android.ugc.aweme.ecommerce.common.model.ProductAddToShowcaseResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TnO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.common.utils.TTEcVideoApiHelper$addProductToShowcase$1", f = "TTEcVideoApiHelper.kt", l = {28}, m = "invokeSuspend")
public final class C757400TnO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Function1<ProductAddToShowcaseResponse, Unit> LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C757400TnO(String str, Function1<? super ProductAddToShowcaseResponse, Unit> function1, Function0<Unit> function0, InterfaceC1364105Vn<? super C757400TnO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = function1;
        this.LLILZIL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C757400TnO c757400TnO = new C757400TnO(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c757400TnO.LLILLJJLI = obj;
        return c757400TnO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3  */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.String r10 = "TTEcVideoApiHelper@bc6a.addProductToShowcase$1"
            X.C1C7U.LIZ(r10)
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r11.LL
            r9 = 0
            r4 = 1
            if (r0 == 0) goto L1a
            if (r0 != r4) goto L12
            goto L5d
        L12:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1a:
            X.C155000ia.LIZIZ(r12)
            java.lang.Object r8 = r11.LLILLJJLI
            X.01GW<X.0TnS> r0 = X.C757440TnS.LLILLJJLI     // Catch: java.lang.Exception -> L63
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L63
            X.0TnS r0 = (X.C757440TnS) r0     // Catch: java.lang.Exception -> L63
            X.0TnU r6 = r0.LL     // Catch: java.lang.Exception -> L63
            com.ss.android.ugc.aweme.ecommerce.common.model.ProductAddToShowcaseRequest r5 = new com.ss.android.ugc.aweme.ecommerce.common.model.ProductAddToShowcaseRequest     // Catch: java.lang.Exception -> L63
            java.lang.String r3 = r11.LLILLL     // Catch: java.lang.Exception -> L63
            r0 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L63
            r0 = 5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L63
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L63
            r5.<init>(r3, r2, r1, r0)     // Catch: java.lang.Exception -> L63
            r11.LLILLJJLI = r8     // Catch: java.lang.Exception -> L63
            r11.LL = r4     // Catch: java.lang.Exception -> L63
            r6.getClass()     // Catch: java.lang.Exception -> L63
            X.0TnP r0 = com.ss.android.ugc.aweme.ecommerce.common.api.EcVideoApi.LIZ     // Catch: java.lang.Exception -> L63
            r0.getClass()     // Catch: java.lang.Exception -> L63
            X.01GW<com.ss.android.ugc.aweme.ecommerce.common.api.EcVideoApi> r0 = X.C757410TnP.LIZIZ     // Catch: java.lang.Exception -> L63
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L63
            com.ss.android.ugc.aweme.ecommerce.common.api.EcVideoApi r0 = (com.ss.android.ugc.aweme.ecommerce.common.api.EcVideoApi) r0     // Catch: java.lang.Exception -> L63
            java.lang.Object r12 = r0.addProductToShowcase(r5, r11)     // Catch: java.lang.Exception -> L63
            if (r12 != r7) goto L60
            X.C1C7U.LIZIZ(r10)
            return r7
        L5d:
            X.C155000ia.LIZIZ(r12)     // Catch: java.lang.Exception -> L63
        L60:
            X.0X52 r12 = (X.C0X52) r12     // Catch: java.lang.Exception -> L63
            goto L68
        L63:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r12 = r9
        L68:
            if (r12 == 0) goto Lb2
            java.lang.String r3 = r11.LLILLL
            boolean r0 = r12.LIZJ()
            if (r0 == 0) goto Lc3
            T r0 = r12.LIZIZ
            com.ss.android.ugc.aweme.ecommerce.common.model.ProductAddToShowcaseResponse r0 = (com.ss.android.ugc.aweme.ecommerce.common.model.ProductAddToShowcaseResponse) r0
            java.util.List<com.ss.android.ugc.aweme.ecommerce.common.model.ProductAddStatus> r0 = r0.productAddStatus
            if (r0 == 0) goto Lc1
            java.util.Iterator r2 = r0.iterator()
        L7e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lbf
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.ecommerce.common.model.ProductAddStatus r0 = (com.ss.android.ugc.aweme.ecommerce.common.model.ProductAddStatus) r0
            java.lang.String r0 = r0.productId
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r3)
            if (r0 == 0) goto L7e
        L93:
            com.ss.android.ugc.aweme.ecommerce.common.model.ProductAddStatus r1 = (com.ss.android.ugc.aweme.ecommerce.common.model.ProductAddStatus) r1
            if (r1 == 0) goto Lc1
            boolean r0 = r1.isSuccess()
            if (r0 != r4) goto Lc1
            r0 = 1
        L9e:
            if (r0 == 0) goto Lc3
        La0:
            if (r4 != 0) goto La3
            r12 = r9
        La3:
            if (r12 == 0) goto Lb2
            kotlin.jvm.functions.Function1<com.ss.android.ugc.aweme.ecommerce.common.model.ProductAddToShowcaseResponse, kotlin.Unit> r1 = r11.LLILZ
            if (r1 == 0) goto Lb0
            T r0 = r12.LIZIZ
            r1.invoke(r0)
            kotlin.Unit r9 = kotlin.Unit.LIZ
        Lb0:
            if (r9 != 0) goto Lb9
        Lb2:
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r11.LLILZIL
            if (r0 == 0) goto Lb9
            r0.invoke()
        Lb9:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r10)
            return r0
        Lbf:
            r1 = r9
            goto L93
        Lc1:
            r0 = 0
            goto L9e
        Lc3:
            r4 = 0
            goto La0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C757400TnO.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
