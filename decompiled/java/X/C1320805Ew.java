package X;

import com.ss.android.ugc.aweme.ecommerce.anchor.showcase.models.CreatorAddCheckRequest;
import com.ss.android.ugc.aweme.ecommerce.anchor.showcase.models.CreatorAddCheckResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Ew, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.common.utils.EcVideoApiHelper$fetchAutoAddAnchor$1", f = "EcVideoApiHelper.kt", l = {55, 60, 64}, m = "invokeSuspend")
public final class C1320805Ew extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ CreatorAddCheckRequest LLILLL;
    public final /* synthetic */ Function1<CreatorAddCheckResponse, Unit> LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1320805Ew(CreatorAddCheckRequest creatorAddCheckRequest, Function1<? super CreatorAddCheckResponse, Unit> function1, Function0<Unit> function0, InterfaceC1364105Vn<? super C1320805Ew> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = creatorAddCheckRequest;
        this.LLILZ = function1;
        this.LLILZIL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1320805Ew c1320805Ew = new C1320805Ew(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1320805Ew.LLILLJJLI = obj;
        return c1320805Ew;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            java.lang.String r9 = "EcVideoApiHelper@7793.fetchAutoAddAnchor$1"
            X.C1C7U.LIZ(r9)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r10.LL
            r6 = 3
            r8 = 2
            r2 = 1
            r4 = 0
            if (r0 == 0) goto L23
            if (r0 == r2) goto L20
            if (r0 == r8) goto L84
            if (r0 != r6) goto La2
            X.C155000ia.LIZIZ(r11)
        L1a:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r9)
            return r0
        L20:
            java.lang.Object r7 = r10.LLILLJJLI
            goto L4f
        L23:
            X.C155000ia.LIZIZ(r11)
            java.lang.Object r7 = r10.LLILLJJLI
            X.01GW<X.18RT> r0 = X.C18RT.LLILLJJLI     // Catch: java.lang.Exception -> L55
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L55
            X.18RT r0 = (X.C18RT) r0     // Catch: java.lang.Exception -> L55
            X.18RU r0 = r0.LL     // Catch: java.lang.Exception -> L55
            com.ss.android.ugc.aweme.ecommerce.anchor.showcase.models.CreatorAddCheckRequest r1 = r10.LLILLL     // Catch: java.lang.Exception -> L55
            r10.LLILLJJLI = r7     // Catch: java.lang.Exception -> L55
            r10.LL = r2     // Catch: java.lang.Exception -> L55
            r0.getClass()     // Catch: java.lang.Exception -> L55
            X.05Ey r0 = com.ss.android.ugc.aweme.ecommerce.anchor.showcase.api.ShowcaseAnchorApi.LIZ     // Catch: java.lang.Exception -> L55
            r0.getClass()     // Catch: java.lang.Exception -> L55
            X.01GW<com.ss.android.ugc.aweme.ecommerce.anchor.showcase.api.ShowcaseAnchorApi> r0 = X.C1321005Ey.LIZIZ     // Catch: java.lang.Exception -> L55
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L55
            com.ss.android.ugc.aweme.ecommerce.anchor.showcase.api.ShowcaseAnchorApi r0 = (com.ss.android.ugc.aweme.ecommerce.anchor.showcase.api.ShowcaseAnchorApi) r0     // Catch: java.lang.Exception -> L55
            java.lang.Object r11 = r0.fetchAutoAddAnchor(r1, r10)     // Catch: java.lang.Exception -> L55
            if (r11 != r5) goto L52
            goto Laa
        L4f:
            X.C155000ia.LIZIZ(r11)     // Catch: java.lang.Exception -> L55
        L52:
            X.0X52 r11 = (X.C0X52) r11     // Catch: java.lang.Exception -> L55
            goto L5a
        L55:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r11 = r4
        L5a:
            if (r11 == 0) goto L89
            boolean r0 = r11.LIZJ()
            if (r0 != 0) goto L63
            r11 = r4
        L63:
            if (r11 == 0) goto L89
            T r3 = r11.LIZIZ
            com.ss.android.ugc.aweme.ecommerce.anchor.showcase.models.CreatorAddCheckResponse r3 = (com.ss.android.ugc.aweme.ecommerce.anchor.showcase.models.CreatorAddCheckResponse) r3
            if (r3 == 0) goto L89
            kotlin.jvm.functions.Function1<com.ss.android.ugc.aweme.ecommerce.anchor.showcase.models.CreatorAddCheckResponse, kotlin.Unit> r2 = r10.LLILZ
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r1 = X.C2107308Nj.LIZ
            X.05Ev r0 = new X.05Ev
            r0.<init>(r2, r3, r4)
            r10.LLILLJJLI = r7
            r10.LL = r8
            java.lang.Object r11 = X.C23250099c.LJI(r10, r1, r0)
            if (r11 != r5) goto L87
            X.C1C7U.LIZIZ(r9)
            return r5
        L84:
            X.C155000ia.LIZIZ(r11)
        L87:
            if (r11 != 0) goto L1a
        L89:
            kotlin.jvm.functions.Function0<kotlin.Unit> r2 = r10.LLILZIL
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r1 = X.C2107308Nj.LIZ
            X.05Eu r0 = new X.05Eu
            r0.<init>(r2, r4)
            r10.LLILLJJLI = r4
            r10.LL = r6
            java.lang.Object r0 = X.C23250099c.LJI(r10, r1, r0)
            if (r0 != r5) goto L1a
            X.C1C7U.LIZIZ(r9)
            return r5
        La2:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Laa:
            X.C1C7U.LIZIZ(r9)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1320805Ew.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
