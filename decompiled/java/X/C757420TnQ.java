package X;

import com.ss.android.ugc.aweme.ecommerce.model.GetAnchorMotionInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.model.GetAnchorMotionInfoResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TnQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.common.utils.EcVideoApiHelper$fetchAnchorMotionInfo$1", f = "EcVideoApiHelper.kt", l = {82}, m = "invokeSuspend")
public final class C757420TnQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ GetAnchorMotionInfoRequest LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ Function1<GetAnchorMotionInfoResponse, Unit> LLILZIL;
    public final /* synthetic */ Function2<Integer, String, Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C757420TnQ(GetAnchorMotionInfoRequest getAnchorMotionInfoRequest, long j, Function1<? super GetAnchorMotionInfoResponse, Unit> function1, Function2<? super Integer, ? super String, Unit> function2, InterfaceC1364105Vn<? super C757420TnQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = getAnchorMotionInfoRequest;
        this.LLILZ = j;
        this.LLILZIL = function1;
        this.LLILZLL = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C757420TnQ c757420TnQ = new C757420TnQ(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c757420TnQ.LLILLJJLI = obj;
        return c757420TnQ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws org.json.JSONException {
        /*
            r10 = this;
            java.lang.String r9 = "EcVideoApiHelper@7793.fetchAnchorMotionInfo$1"
            X.C1C7U.LIZ(r9)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r10.LL
            r6 = 1
            r4 = 0
            if (r0 == 0) goto L1a
            if (r0 != r6) goto L12
            goto L49
        L12:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1a:
            X.C155000ia.LIZIZ(r11)
            java.lang.Object r2 = r10.LLILLJJLI
            X.01GW<X.0TnS> r0 = X.C757440TnS.LLILLJJLI     // Catch: java.lang.Exception -> L4f
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L4f
            X.0TnS r0 = (X.C757440TnS) r0     // Catch: java.lang.Exception -> L4f
            X.0TnU r0 = r0.LL     // Catch: java.lang.Exception -> L4f
            com.ss.android.ugc.aweme.ecommerce.model.GetAnchorMotionInfoRequest r1 = r10.LLILLL     // Catch: java.lang.Exception -> L4f
            r10.LLILLJJLI = r2     // Catch: java.lang.Exception -> L4f
            r10.LL = r6     // Catch: java.lang.Exception -> L4f
            r0.getClass()     // Catch: java.lang.Exception -> L4f
            X.0TnP r0 = com.ss.android.ugc.aweme.ecommerce.common.api.EcVideoApi.LIZ     // Catch: java.lang.Exception -> L4f
            r0.getClass()     // Catch: java.lang.Exception -> L4f
            X.01GW<com.ss.android.ugc.aweme.ecommerce.common.api.EcVideoApi> r0 = X.C757410TnP.LIZIZ     // Catch: java.lang.Exception -> L4f
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L4f
            com.ss.android.ugc.aweme.ecommerce.common.api.EcVideoApi r0 = (com.ss.android.ugc.aweme.ecommerce.common.api.EcVideoApi) r0     // Catch: java.lang.Exception -> L4f
            java.lang.Object r11 = r0.getAnchorMotionInfo(r1, r10)     // Catch: java.lang.Exception -> L4f
            if (r11 != r3) goto L4c
            X.C1C7U.LIZIZ(r9)
            return r3
        L49:
            X.C155000ia.LIZIZ(r11)     // Catch: java.lang.Exception -> L4f
        L4c:
            X.0X52 r11 = (X.C0X52) r11     // Catch: java.lang.Exception -> L4f
            goto L54
        L4f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r11 = r4
        L54:
            long r7 = java.lang.System.currentTimeMillis()
            long r0 = r10.LLILZ
            long r7 = r7 - r0
            if (r11 == 0) goto L8b
            boolean r0 = r11.LIZJ()
            if (r0 == 0) goto Lc5
            r0 = r11
        L64:
            if (r0 == 0) goto L8b
            T r0 = r0.LIZIZ
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r0 = (com.ss.android.ugc.aweme.ecommerce.api.model.Response) r0
            if (r0 == 0) goto L8b
            T r5 = r0.data
            if (r5 == 0) goto L8b
            com.ss.android.ugc.aweme.ecommerce.model.GetAnchorMotionInfoRequest r0 = r10.LLILLL
            kotlin.jvm.functions.Function1<com.ss.android.ugc.aweme.ecommerce.model.GetAnchorMotionInfoResponse, kotlin.Unit> r3 = r10.LLILZIL
            X.18Mj r2 = X.C21271918Mj.LIZ
            java.lang.Long r1 = X.C2286608xc.LJFF(r7)
            java.lang.Integer r0 = r0.anchorScene
            r2.getClass()
            X.C21271918Mj.LJFF(r6, r1, r0)
            if (r3 == 0) goto Lc3
            r3.invoke(r5)
            kotlin.Unit r0 = kotlin.Unit.LIZ
        L89:
            if (r0 != 0) goto Lbb
        L8b:
            com.ss.android.ugc.aweme.ecommerce.model.GetAnchorMotionInfoRequest r1 = r10.LLILLL
            kotlin.jvm.functions.Function2<java.lang.Integer, java.lang.String, kotlin.Unit> r3 = r10.LLILZLL
            X.18Mj r0 = X.C21271918Mj.LIZ
            java.lang.Long r2 = X.C2286608xc.LJFF(r7)
            java.lang.Integer r1 = r1.anchorScene
            r0.getClass()
            r0 = 0
            X.C21271918Mj.LJFF(r0, r2, r1)
            if (r3 == 0) goto Lbb
            if (r11 == 0) goto Lc1
            T r0 = r11.LIZIZ
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r0 = (com.ss.android.ugc.aweme.ecommerce.api.model.Response) r0
            if (r0 == 0) goto Lc1
            int r0 = r0.code
            java.lang.Integer r1 = X.C2286608xc.LJ(r0)
        Lae:
            if (r11 == 0) goto Lb8
            T r0 = r11.LIZIZ
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r0 = (com.ss.android.ugc.aweme.ecommerce.api.model.Response) r0
            if (r0 == 0) goto Lb8
            java.lang.String r4 = r0.message
        Lb8:
            r3.invoke(r1, r4)
        Lbb:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r9)
            return r0
        Lc1:
            r1 = r4
            goto Lae
        Lc3:
            r0 = r4
            goto L89
        Lc5:
            r0 = r4
            goto L64
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C757420TnQ.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
