package X;

import Y.ARunnableS109S0100000_9;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.api.LivePreviewECIconInfoApi;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.api.LivePreviewECIconInfoResponse;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.model.ECGuidanceCard;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.settings.AnchorLiveBagListOptConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Nzu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.broadcaster.beforelive.slot.preview.widget.ECProductBeforeLiveWidget$clickListener$1$doClick$1", f = "ECProductBeforeLiveWidget.kt", l = {145}, m = "invokeSuspend")
public final class C612280Nzu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AnchorLiveBagListOptConfig LLILLJJLI;
    public final /* synthetic */ C180N LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C612280Nzu(AnchorLiveBagListOptConfig anchorLiveBagListOptConfig, C180N c180n, InterfaceC1364105Vn<? super C612280Nzu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = anchorLiveBagListOptConfig;
        this.LLILLL = c180n;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C612280Nzu(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC1364105Vn interfaceC1364105Vn;
        C1C7U.LIZ("ECProductBeforeLiveWidget@6602.clickListener$1$doClick$1");
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
            C608200NtK.LIZ(C608200NtK.LIZ, "send_req_ec_icon_info", null, null, null, null, null, 62);
            C612290Nzv c612290Nzv = LivePreviewECIconInfoApi.LIZ;
            this.LL = 1;
            obj = c612290Nzv.LIZ(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ECProductBeforeLiveWidget@6602.clickListener$1$doClick$1");
                return objLJFF;
            }
        }
        LivePreviewECIconInfoResponse livePreviewECIconInfoResponse = (LivePreviewECIconInfoResponse) obj;
        if (livePreviewECIconInfoResponse == null) {
            C786410Ut5.LJJZZIII(C612310Nzx.LIZ, new ARunnableS109S0100000_9(this.LLILLL, 178));
            C608200NtK.LIZ(C608200NtK.LIZ, "send_req_ec_icon_info_fail", null, null, null, null, null, 62);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ECProductBeforeLiveWidget@6602.clickListener$1$doClick$1");
            return unit;
        }
        if (C123100dR.LIZ(livePreviewECIconInfoResponse.onboardingSchema)) {
            if (this.LLILLJJLI.crossPageReuseEnabled) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                String strLIZ = this.LLILLL.LJJII().LIZ(livePreviewECIconInfoResponse.onboardingSchema);
                C180N c180n = this.LLILLL;
                c180n.getClass();
                C21211017zY.LIZ.getClass();
                C21211017zY.LIZ();
                C21210917zX.LIZ.LIZLLL(c180n.LJJIFFI(), null, jCurrentTimeMillis, EnumC612320Nzy.BEFORE_LIVE, null, strLIZ);
            } else {
                SmartRouter.buildRoute(this.LLILLL.LJJIFFI(), this.LLILLL.LJJII().LIZ(livePreviewECIconInfoResponse.onboardingSchema)).open();
            }
            C608200NtK c608200NtK = C608200NtK.LIZ;
            interfaceC1364105Vn = null;
            C608200NtK.LIZ(c608200NtK, "send_req_ec_icon_info_success", null, null, null, null, null, 62);
            C608200NtK.LIZ(c608200NtK, "open_page_with_response_schema", null, null, null, null, null, 62);
        } else {
            if (this.LLILLJJLI.crossPageReuseEnabled) {
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                String strLIZJ = this.LLILLL.LJJII().LIZJ();
                C180N c180n2 = this.LLILLL;
                c180n2.getClass();
                C21211017zY.LIZ.getClass();
                C21211017zY.LIZ();
                C21210917zX.LIZ.LIZLLL(c180n2.LJJIFFI(), null, jCurrentTimeMillis2, EnumC612320Nzy.BEFORE_LIVE, null, strLIZJ);
            } else {
                C180N c180n3 = this.LLILLL;
                SmartRouter.buildRoute(c180n3.LJJIFFI(), c180n3.LJJII().LIZJ()).open();
            }
            C608200NtK c608200NtK2 = C608200NtK.LIZ;
            interfaceC1364105Vn = null;
            C608200NtK.LIZ(c608200NtK2, "send_req_ec_icon_info_success", null, null, null, null, null, 62);
            C608200NtK.LIZ(c608200NtK2, "open_page_with_shop_list_schema", null, null, null, null, null, 62);
        }
        C180N c180n4 = this.LLILLL;
        ECGuidanceCard eCGuidanceCard = livePreviewECIconInfoResponse.guidance;
        if (eCGuidanceCard == null) {
            c180n4.getClass();
        } else {
            IIconSlot.SlotViewModel slotViewModel = c180n4.LLILZLL;
            if (slotViewModel != null) {
                C948503nH.LJFF(slotViewModel, C2126308Ur.LJFF, new C594360NSw(c180n4, eCGuidanceCard, interfaceC1364105Vn));
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ECProductBeforeLiveWidget@6602.clickListener$1$doClick$1");
        return unit2;
    }
}
