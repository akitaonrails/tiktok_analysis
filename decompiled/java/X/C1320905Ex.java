package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.ecommerce.anchor.showcase.models.GetItemShopShowcaseInfoResponse;
import com.ss.android.ugc.aweme.ecommerce.anchor.showcase.models.GetShopShowcaseInfoRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Ex, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.common.utils.EcVideoApiHelper$fetchAnchorSubtitleInfo$1", f = "EcVideoApiHelper.kt", l = {LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT}, m = "invokeSuspend")
public final class C1320905Ex extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ GetShopShowcaseInfoRequest LLILLL;
    public final /* synthetic */ Function1<GetItemShopShowcaseInfoResponse, Unit> LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1320905Ex(GetShopShowcaseInfoRequest getShopShowcaseInfoRequest, Function1<? super GetItemShopShowcaseInfoResponse, Unit> function1, Function0<Unit> function0, InterfaceC1364105Vn<? super C1320905Ex> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = getShopShowcaseInfoRequest;
        this.LLILZ = function1;
        this.LLILZIL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1320905Ex c1320905Ex = new C1320905Ex(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1320905Ex.LLILLJJLI = obj;
        return c1320905Ex;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "EcVideoApiHelper@7793.fetchAnchorSubtitleInfo$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r7.LL
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L1a
            if (r0 != r4) goto L12
            goto L49
        L12:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1a:
            X.C155000ia.LIZIZ(r8)
            java.lang.Object r2 = r7.LLILLJJLI
            X.01GW<X.18RT> r0 = X.C18RT.LLILLJJLI     // Catch: java.lang.Exception -> L4f
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L4f
            X.18RT r0 = (X.C18RT) r0     // Catch: java.lang.Exception -> L4f
            X.18RU r0 = r0.LL     // Catch: java.lang.Exception -> L4f
            com.ss.android.ugc.aweme.ecommerce.anchor.showcase.models.GetShopShowcaseInfoRequest r1 = r7.LLILLL     // Catch: java.lang.Exception -> L4f
            r7.LLILLJJLI = r2     // Catch: java.lang.Exception -> L4f
            r7.LL = r4     // Catch: java.lang.Exception -> L4f
            r0.getClass()     // Catch: java.lang.Exception -> L4f
            X.05Ey r0 = com.ss.android.ugc.aweme.ecommerce.anchor.showcase.api.ShowcaseAnchorApi.LIZ     // Catch: java.lang.Exception -> L4f
            r0.getClass()     // Catch: java.lang.Exception -> L4f
            X.01GW<com.ss.android.ugc.aweme.ecommerce.anchor.showcase.api.ShowcaseAnchorApi> r0 = X.C1321005Ey.LIZIZ     // Catch: java.lang.Exception -> L4f
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L4f
            com.ss.android.ugc.aweme.ecommerce.anchor.showcase.api.ShowcaseAnchorApi r0 = (com.ss.android.ugc.aweme.ecommerce.anchor.showcase.api.ShowcaseAnchorApi) r0     // Catch: java.lang.Exception -> L4f
            java.lang.Object r8 = r0.fetchAnchorSubtitleInfo(r1, r7)     // Catch: java.lang.Exception -> L4f
            if (r8 != r5) goto L4c
            X.C1C7U.LIZIZ(r6)
            return r5
        L49:
            X.C155000ia.LIZIZ(r8)     // Catch: java.lang.Exception -> L4f
        L4c:
            X.0X52 r8 = (X.C0X52) r8     // Catch: java.lang.Exception -> L4f
            goto L54
        L4f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r8 = r3
        L54:
            if (r8 == 0) goto L74
            boolean r0 = r8.LIZJ()
            if (r0 != 0) goto L5d
            r8 = r3
        L5d:
            if (r8 == 0) goto L74
            T r0 = r8.LIZIZ
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r0 = (com.ss.android.ugc.aweme.ecommerce.api.model.Response) r0
            if (r0 == 0) goto L74
            T r1 = r0.data
            if (r1 == 0) goto L74
            kotlin.jvm.functions.Function1<com.ss.android.ugc.aweme.ecommerce.anchor.showcase.models.GetItemShopShowcaseInfoResponse, kotlin.Unit> r0 = r7.LLILZ
            if (r0 == 0) goto L72
            r0.invoke(r1)
            kotlin.Unit r3 = kotlin.Unit.LIZ
        L72:
            if (r3 != 0) goto L7b
        L74:
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r7.LLILZIL
            if (r0 == 0) goto L7b
            r0.invoke()
        L7b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1320905Ex.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
