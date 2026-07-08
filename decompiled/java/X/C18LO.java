package X;

import com.ss.android.ugc.aweme.ecommerce.anchor.model.ClaimExpansionVoucherRequest;
import com.ss.android.ugc.aweme.ecommerce.model.ExpansionVoucher;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.18LO, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.anchor.baseview.PanelExpansionVoucherView$claimVoucher$1", f = "PanelExpansionVoucherView.kt", l = {196}, m = "invokeSuspend")
public final class C18LO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ClaimExpansionVoucherRequest LLILLJJLI;
    public final /* synthetic */ C18LM LLILLL;
    public final /* synthetic */ ExpansionVoucher LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18LO(ClaimExpansionVoucherRequest claimExpansionVoucherRequest, C18LM c18lm, ExpansionVoucher expansionVoucher, InterfaceC1364105Vn<? super C18LO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = claimExpansionVoucherRequest;
        this.LLILLL = c18lm;
        this.LLILZ = expansionVoucher;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C18LO(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0072  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.String r5 = "PanelExpansionVoucherView@59a5.claimVoucher$1"
            X.C1C7U.LIZ(r5)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r14.LL
            r2 = 1
            if (r0 == 0) goto L86
            if (r0 != r2) goto L99
            X.C155000ia.LIZIZ(r15)
        L13:
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r15 = (com.ss.android.ugc.aweme.ecommerce.api.model.Response) r15
            if (r15 == 0) goto L7d
            X.18LM r3 = r14.LLILLL
            com.ss.android.ugc.aweme.ecommerce.model.ExpansionVoucher r2 = r14.LLILZ
            boolean r0 = r15.isCodeOK()
            if (r0 == 0) goto L72
            T r0 = r15.data
            com.ss.android.ugc.aweme.ecommerce.anchor.model.ClaimExpansionVoucherResponseData r0 = (com.ss.android.ugc.aweme.ecommerce.anchor.model.ClaimExpansionVoucherResponseData) r0
            if (r0 == 0) goto L72
            com.ss.android.ugc.aweme.ecommerce.model.PanelVoucherInfo r7 = r0.voucher
            if (r7 == 0) goto L72
            X.18Mj r4 = X.C21271918Mj.LIZ
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.LLILZLL
            java.lang.String r0 = "source_content_id"
            java.lang.Object r6 = r1.get(r0)
            java.lang.String r6 = (java.lang.String) r6
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.LLILZLL
            java.lang.String r0 = "enter_from"
            java.lang.Object r8 = r1.get(r0)
            java.lang.String r8 = (java.lang.String) r8
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.LLILZLL
            java.lang.String r0 = "entrance_form"
            java.lang.Object r9 = r1.get(r0)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r10 = "video_panel_half"
            java.lang.String r11 = "get_directly"
            r12 = 0
            java.util.Map<java.lang.String, java.lang.String> r13 = r3.LLILZLL
            r4.getClass()
            X.C21271918Mj.LJIILLIIL(r6, r7, r8, r9, r10, r11, r12, r13)
            int r4 = r2.displayForm
            com.ss.android.ugc.aweme.ecommerce.model.PanelVoucherInfo r1 = r2.basicVoucherInfo
            com.ss.android.ugc.aweme.ecommerce.model.ExpansionVoucher r0 = new com.ss.android.ugc.aweme.ecommerce.model.ExpansionVoucher
            r0.<init>(r4, r1, r7)
            r3.LIZ(r0)
            Y.ARunnableS98S0200000_29 r1 = new Y.ARunnableS98S0200000_29
            r0 = 59
            r1.<init>(r3, r2, r0)
            X.C1260120ite.LIZIZ(r1)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r0 != 0) goto L77
        L72:
            int r0 = r15.code
            r3.LIZIZ(r2, r0)
        L77:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        L7d:
            X.18LM r2 = r14.LLILLL
            com.ss.android.ugc.aweme.ecommerce.model.ExpansionVoucher r1 = r14.LLILZ
            r0 = -1
            r2.LIZIZ(r1, r0)
            goto L77
        L86:
            X.C155000ia.LIZIZ(r15)
            X.18Ld r1 = X.InterfaceC21268618Lc.LIZ
            com.ss.android.ugc.aweme.ecommerce.anchor.model.ClaimExpansionVoucherRequest r0 = r14.LLILLJJLI
            r14.LL = r2
            java.lang.Object r15 = r1.LIZ(r0, r14)
            if (r15 != r3) goto L13
            X.C1C7U.LIZIZ(r5)
            return r3
        L99:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18LO.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
