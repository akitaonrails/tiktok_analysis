package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Announcement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Banner;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoSetting;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BottomCashbackBanner;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ChangeInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OspButtonBannerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PlatformRight;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS56S0210000_1;

/* JADX INFO: renamed from: X.035W, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C035W extends C09AY implements Function1<C03JV, C03JV> {
    public final /* synthetic */ OrderSubmitAssemViewModel LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ BillInfoData LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ C259800zU<PaymentMethod> LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ BillInfoData LLIZLLLIL;
    public final /* synthetic */ BillInfoRequest LLJ;
    public final /* synthetic */ C752702wn LLJI;
    public final /* synthetic */ boolean LLJIJIL;
    public final /* synthetic */ C03JW LLJILJIL;
    public final /* synthetic */ boolean LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C035W(OrderSubmitAssemViewModel orderSubmitAssemViewModel, String str, BillInfoData billInfoData, boolean z, boolean z2, C259800zU<PaymentMethod> c259800zU, boolean z3, BillInfoData billInfoData2, BillInfoRequest billInfoRequest, C752702wn c752702wn, boolean z4, C03JW c03jw, boolean z5) {
        super(1);
        this.LL = orderSubmitAssemViewModel;
        this.LLILLJJLI = str;
        this.LLILLL = billInfoData;
        this.LLILZ = z;
        this.LLILZIL = z2;
        this.LLILZLL = c259800zU;
        this.LLIZ = z3;
        this.LLIZLLLIL = billInfoData2;
        this.LLJ = billInfoRequest;
        this.LLJI = c752702wn;
        this.LLJIJIL = z4;
        this.LLJILJIL = c03jw;
        this.LLJILJILJ = z5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C03JV invoke(C03JV c03jv) {
        PaymentMethodsData paymentMethodsData;
        Integer num;
        PaymentMethod paymentMethod;
        boolean z;
        Map mapLJIIZILJ;
        boolean z2;
        boolean z3;
        List<Banner> list;
        Object obj;
        C291001Au c291001Au;
        ChangeInfo changeInfo;
        Integer num2;
        Map<String, String> map;
        PaymentInfo paymentInfo;
        C03JV c03jv2 = c03jv;
        C03SE c03se = C03PI.LJIJI;
        OrderSubmitAssemViewModel orderSubmitAssemViewModel = this.LL;
        PaymentInfo paymentInfo2 = orderSubmitAssemViewModel.LLJJJ;
        BillInfoData billInfoData = orderSubmitAssemViewModel.LLJJI;
        if (billInfoData != null) {
            paymentMethodsData = billInfoData.paymentMethods;
        } else {
            paymentMethodsData = null;
        }
        c03se.getClass();
        C443120HZe c443120HZeLJJJIL = C03SE.LJJJIL(paymentInfo2, paymentMethodsData, true, true);
        boolean zBooleanValue = ((Boolean) c443120HZeLJJJIL.getFirst()).booleanValue();
        String str = (String) c443120HZeLJJJIL.getSecond();
        List list2 = (List) c443120HZeLJJJIL.getThird();
        if (str == null) {
            str = this.LLILLJJLI;
        }
        this.LL.vR2().LIZLLL(new AwS56S0210000_1(this.LLILLL, this.LL, this.LLJILJILJ, 8));
        String strQR2 = this.LL.qR2();
        Pair pairLJIIIZ = this.LLILLL.LJIIIZ(str, strQR2, list2, zBooleanValue);
        String str2 = (String) pairLJIIIZ.getFirst();
        ECRichText eCRichText = (ECRichText) pairLJIIIZ.getSecond();
        String strLJII = this.LLILLL.LJII(str, strQR2, list2, zBooleanValue);
        BillInfoData billInfoData2 = this.LLILLL;
        BottomCashbackBanner bottomCashbackBanner = billInfoData2.bottomCashbackBanner;
        C948003nC c948003nC = new C948003nC(Integer.valueOf(billInfoData2.LJIIJ()));
        BillInfoData billInfoData3 = this.LLILLL;
        Summary summary = billInfoData3.summary;
        if (summary != null) {
            num = summary.skuTotalQuantity;
        } else {
            num = null;
        }
        OrderSubmitAssemViewModel orderSubmitAssemViewModel2 = this.LL;
        boolean z4 = orderSubmitAssemViewModel2.LLLIILIL;
        boolean z5 = this.LLILZ;
        if (!this.LLILZIL && (paymentInfo = orderSubmitAssemViewModel2.LLJJJ) != null) {
            paymentMethod = paymentInfo.paymentMethod;
        } else {
            paymentMethod = null;
        }
        CopyOnWriteArrayList<PaymentMethod> copyOnWriteArrayList = orderSubmitAssemViewModel2.LLJL;
        if (this.LLILZLL.element != null) {
            z = true;
        } else {
            z = false;
        }
        List listNR2 = OrderSubmitAssemViewModel.nR2(orderSubmitAssemViewModel2, billInfoData3, z5, paymentMethod, copyOnWriteArrayList, z, this.LLIZ, false, str2, eCRichText, 576);
        BillInfoData billInfoData4 = this.LLILLL;
        PaymentInfo paymentInfo3 = this.LL.LLJJJ;
        if (paymentInfo3 != null && (map = paymentInfo3.LIZLLL) != null) {
            mapLJIIZILJ = C2097608Jq.LJIIZILJ(map);
        } else {
            mapLJIIZILJ = null;
        }
        C722302rt c722302rtLJFF = C722002rq.LJFF(billInfoData4, str, zBooleanValue, 0, list2, mapLJIIZILJ, strQR2, 4);
        BillInfoData billInfoData5 = this.LLILLL;
        List<Announcement> list3 = billInfoData5.announcement;
        if (billInfoData5.toast != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        BillInfoSetting billInfoSetting = billInfoData5.settings;
        if (billInfoSetting != null && (num2 = billInfoSetting.bonusCellStyle) != null && num2.intValue() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        C720002rW c720002rWLIZ = C021I.LIZ(billInfoData5, 0, false, z3, null, 11);
        OspButtonBannerInfo ospButtonBannerInfo = this.LLILLL.ospButtonBannerInfo;
        boolean zTS2 = this.LL.tS2();
        BillInfoData billInfoData6 = this.LLILLL;
        if (billInfoData6.announcement == null) {
            list = billInfoData6.topBanners;
        } else {
            list = null;
        }
        PlatformRight platformRight = billInfoData6.platformRight;
        if (this.LLIZLLLIL.exceptionUX == null && (changeInfo = this.LLJ.getChangeInfo()) != null && changeInfo.changeType == C03DI.RETRY_CASHIER.getValue()) {
            obj = new Object();
        } else {
            obj = null;
        }
        ChangeInfo changeInfo2 = this.LLJ.getChangeInfo();
        if (changeInfo2 != null && changeInfo2.changeType == C03DI.APPEAL_TRIGGER_REFRESH.getValue()) {
            c291001Au = new C291001Au(EnumC805303Cp.US_MODE.getValue());
        } else {
            c291001Au = null;
        }
        BillInfoData billInfoData7 = this.LLILLL;
        return C03JV.LIZ(c03jv2, 0, listNR2, c722302rtLJFF, this.LLILZ, null, false, null, Boolean.valueOf(z4), null, strLJII, str2, bottomCashbackBanner, c948003nC, num, 0, null, null, 0, null, null, false, 0L, false, false, null, null, false, null, null, null, null, null, false, c720002rWLIZ, null, false, null, null, null, null, false, false, null, null, null, null, null, this.LLJI, list3, Boolean.valueOf(z2), null, null, null, null, null, null, null, this.LLJIJIL, null, null, false, null, false, 0, false, null, null, false, null, ospButtonBannerInfo, Boolean.valueOf(zTS2), false, null, null, false, list, platformRight, null, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, null, obj, c291001Au, false, null, null, false, billInfoData7.pageHeaderCarousel, billInfoData7.rightGuidanceModule, false, this.LLJILJIL, billInfoData7.outsideSellingPointsBubble, C02YL.LIZ(billInfoData7, true), null, this.LLILLL.bottomAbnormalBanner, null, null, -16015, -1081081865, -399361, 856527);
    }
}
