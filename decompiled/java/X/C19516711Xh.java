package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LiveBagIconAnimationResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.11Xh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.common.business.shopbag.guide.BagGuidanceAnimRequestHelper$handleRequestBagAnimation$1$1", f = "BagGuidanceAnimRequestHelper.kt", l = {}, m = "invokeSuspend")
public final class C19516711Xh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0X52<Response<LiveBagIconAnimationResponse>> LL;
    public final /* synthetic */ C21213017zs LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19516711Xh(C0X52<Response<LiveBagIconAnimationResponse>> c0x52, C21213017zs c21213017zs, long j, InterfaceC1364105Vn<? super C19516711Xh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0x52;
        this.LLILLJJLI = c21213017zs;
        this.LLILLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C19516711Xh(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.String r4 = "BagGuidanceAnimRequestHelper@8fa.handleRequestBagAnimation$1$1"
            X.C1C7U.LIZ(r4)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r6)
            X.0X52<com.ss.android.ugc.aweme.ecommerce.api.model.Response<com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LiveBagIconAnimationResponse>> r0 = r5.LL
            r3 = 0
            if (r0 == 0) goto L53
            boolean r1 = r0.LIZJ()
            r0 = 1
            if (r1 != r0) goto L53
        L17:
            r2 = 0
            if (r0 == 0) goto L49
            X.0X52<com.ss.android.ugc.aweme.ecommerce.api.model.Response<com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LiveBagIconAnimationResponse>> r0 = r5.LL
            T r0 = r0.LIZIZ
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r0 = (com.ss.android.ugc.aweme.ecommerce.api.model.Response) r0
            boolean r0 = r0.isCodeOK()
            if (r0 == 0) goto L49
            X.17zs r0 = r5.LLILLJJLI
            X.17zr r1 = r0.LIZLLL
            if (r1 == 0) goto L3d
            X.0X52<com.ss.android.ugc.aweme.ecommerce.api.model.Response<com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LiveBagIconAnimationResponse>> r0 = r5.LL
            T r0 = r0.LIZIZ
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r0 = (com.ss.android.ugc.aweme.ecommerce.api.model.Response) r0
            T r0 = r0.data
            com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LiveBagIconAnimationResponse r0 = (com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LiveBagIconAnimationResponse) r0
            if (r0 == 0) goto L47
            java.util.List<com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LiveBagIconAnimation> r0 = r0.liveBagIconAnimationInfos
        L3a:
            r1.LJFF(r0, r3)
        L3d:
            X.17zs r0 = r5.LLILLJJLI
            r0.LIZLLL = r2
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r4)
            return r0
        L47:
            r0 = r2
            goto L3a
        L49:
            X.17zs r0 = r5.LLILLJJLI
            X.17zr r0 = r0.LIZLLL
            if (r0 == 0) goto L3d
            r0.LJFF(r2, r3)
            goto L3d
        L53:
            r0 = 0
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19516711Xh.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
