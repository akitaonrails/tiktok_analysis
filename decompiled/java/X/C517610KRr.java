package X;

import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KRr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.revenue.level.impl.superfan.payment.impl.fetch.FansGpSkuFetchRepo$fetchGpProductInfoSuspend$2", f = "FansGpSkuFetchRepo.kt", l = {124}, m = "invokeSuspend")
public final class C517610KRr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0KSW>, Object> {
    public int LL;
    public final /* synthetic */ C517630KRt LLILLJJLI;
    public final /* synthetic */ C517620KRs LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C517610KRr(C517630KRt c517630KRt, C517620KRs c517620KRs, InterfaceC1364105Vn<? super C517610KRr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c517630KRt;
        this.LLILLL = c517620KRs;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C517610KRr(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FansGpSkuFetchRepo@861d.fetchGpProductInfoSuspend$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            final C517630KRt c517630KRt = this.LLILLJJLI;
            C517620KRs c517620KRs = this.LLILLL;
            this.LL = 1;
            final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            List listSingletonList = Collections.singletonList(c517630KRt.LIZLLL);
            c517620KRs.LIZ.LIZ(new C1617170sBX("80XR2DK73101", (List<String>) listSingletonList, "subs"), new InterfaceC1791300wiO() { // from class: X.0KRq
                @Override // X.InterfaceC1791300wiO
                public final void LJ(C0KSV c0ksv) {
                }

                /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
                @Override // X.InterfaceC1791300wiO
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZLLL(X.C518150KTt r9) {
                    /*
                        r8 = this;
                        boolean r0 = r9.LIZ
                        r4 = 0
                        if (r0 == 0) goto L66
                        java.util.Map<java.lang.String, com.bytedance.android.livesdk.iap.IapProductDetail> r1 = r9.LIZIZ
                        if (r1 == 0) goto L5a
                        X.0KRt r0 = r1
                        java.lang.String r0 = r0.LIZLLL
                        java.lang.Object r7 = r1.get(r0)
                        com.bytedance.android.livesdk.iap.IapProductDetail r7 = (com.bytedance.android.livesdk.iap.IapProductDetail) r7
                        if (r7 == 0) goto L5a
                        X.0KRt r0 = r1
                        java.lang.String r6 = r0.LJ
                        X.0sBd r0 = r7.oneTimePurchaseProduct
                        java.lang.String r5 = ""
                        if (r0 == 0) goto L25
                        java.util.List r1 = java.util.Collections.singletonList(r0)
                        if (r1 != 0) goto L51
                    L25:
                        java.util.List<com.bytedance.android.livesdk.iap.IapSubscriptionProduct> r0 = r7.subscriptionOffer
                        if (r0 == 0) goto L63
                        java.util.Iterator r3 = r0.iterator()
                    L2d:
                        boolean r0 = r3.hasNext()
                        if (r0 == 0) goto L4b
                        java.lang.Object r2 = r3.next()
                        r1 = r2
                        com.bytedance.android.livesdk.iap.IapSubscriptionProduct r1 = (com.bytedance.android.livesdk.iap.IapSubscriptionProduct) r1
                        java.lang.String r0 = r1.basePlanId
                        boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r6)
                        if (r0 == 0) goto L2d
                        java.lang.String r0 = r1.offerId
                        boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r5)
                        if (r0 == 0) goto L2d
                        r4 = r2
                    L4b:
                        com.bytedance.android.livesdk.iap.IapSubscriptionProduct r4 = (com.bytedance.android.livesdk.iap.IapSubscriptionProduct) r4
                        if (r4 == 0) goto L63
                        java.util.List<com.bytedance.android.livesdk.iap.IapSubscriptionOfferPricing> r1 = r4.pricingPhases
                    L51:
                        X.0KSW r4 = new X.0KSW
                        java.lang.String r0 = r7.LIZ(r6, r5)
                        r4.<init>(r0, r1)
                    L5a:
                        X.14Gf<X.0KSW> r0 = r2
                        X.C189200o6.m2constructorimpl(r4)
                        r0.resumeWith(r4)
                        return
                    L63:
                        X.13BV r1 = X.C13BV.INSTANCE
                        goto L51
                    L66:
                        X.14Gf<X.0KSW> r0 = r2
                        X.C189200o6.m2constructorimpl(r4)
                        r0.resumeWith(r4)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C517600KRq.LIZLLL(X.0KTt):void");
                }
            });
            obj = c2252611DEt.LJIJ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("FansGpSkuFetchRepo@861d.fetchGpProductInfoSuspend$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("FansGpSkuFetchRepo@861d.fetchGpProductInfoSuspend$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0KSW> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
