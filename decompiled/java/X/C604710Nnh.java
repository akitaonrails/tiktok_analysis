package X;

import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CheckPopUpResponse;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PopUpResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Nnh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.popup.trigger.TriggerHandler$handleCheckPopUp$1$1$1", f = "Trigger.kt", l = {}, m = "invokeSuspend")
public final class C604710Nnh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ CheckPopUpResponse LL;
    public final /* synthetic */ C0NLD LLILLJJLI;
    public final /* synthetic */ PdpViewModel LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Integer LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C604710Nnh(CheckPopUpResponse checkPopUpResponse, C0NLD c0nld, PdpViewModel pdpViewModel, String str, Integer num, InterfaceC1364105Vn<? super C604710Nnh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = checkPopUpResponse;
        this.LLILLJJLI = c0nld;
        this.LLILLL = pdpViewModel;
        this.LLILZ = str;
        this.LLILZIL = num;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C604710Nnh(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TriggerHandler@fab0.handleCheckPopUp$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        PopUpResponseData popUpResponseData = this.LL.data;
        if (popUpResponseData != null && popUpResponseData.popUp != null) {
            this.LLILLJJLI.LIZ(popUpResponseData, this.LLILLL, this.LLILZ);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("TriggerHandler@fab0.handleCheckPopUp$1$1$1");
            return unit;
        }
        Integer num = this.LLILZIL;
        int value = C0NLF.FREE_SHIPPING_ADDON_REMINDER.getValue();
        if (num != null && num.intValue() == value) {
            C1759440vt0 c1759440vt0 = this.LLILLL.LLLLJ;
            EnumC1759420vsy enumC1759420vsy = EnumC1759420vsy.FLOATING_LAYER;
            if (this.LLILLJJLI.getId() == c1759440vt0.LIZLLL) {
                switch (C1759430vsz.LIZIZ[enumC1759420vsy.ordinal()]) {
                    case 1:
                        C20515215Pi c20515215Pi = c1759440vt0.LIZJ;
                        if (c20515215Pi != null) {
                            c20515215Pi.LIZIZ();
                        }
                        c1759440vt0.LIZLLL = null;
                        break;
                    case 2:
                        TuxSheet tuxSheet = c1759440vt0.LJ;
                        if (tuxSheet != null) {
                            tuxSheet.dismiss();
                        }
                        c1759440vt0.LIZLLL = null;
                        break;
                    case 3:
                        C1389880mGw c1389880mGw = c1759440vt0.LJFF;
                        if (c1389880mGw != null) {
                            c1389880mGw.LIZIZ();
                        }
                        c1759440vt0.LIZLLL = null;
                        break;
                    case 4:
                        InterfaceC1059280dfi interfaceC1059280dfiLJJIJLIJ = c1759440vt0.LJI.LJJIJLIJ();
                        if (interfaceC1059280dfiLJJIJLIJ != null) {
                            interfaceC1059280dfiLJJIJLIJ.close();
                        }
                        c1759440vt0.LIZLLL = null;
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case BdTuring.TYPE_ECAF /* 9 */:
                        c1759440vt0.LIZLLL = null;
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        c1759440vt0.LJI();
                        c1759440vt0.LIZLLL = null;
                        break;
                    default:
                        throw new C1954807lC();
                }
            }
        }
        C1019103yf.LIZ(EnumC1014603xw.ERR10009, null, null);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TriggerHandler@fab0.handleCheckPopUp$1$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
