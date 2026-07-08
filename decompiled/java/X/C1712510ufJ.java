package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.biz.bnpl.network.model.BaseResponse;
import com.ss.android.ugc.aweme.biz.wallet.network.model.WalletFlowDecision;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.giftcard.checkout.GiftCardCheckoutInfoRespData;
import com.ss.android.ugc.aweme.giftcard.checkout.GiftCardCheckoutVM;
import com.ss.android.ugc.aweme.giftcard.network.GiftCardApi;
import com.ss.android.ugc.aweme.giftcard.network.GiftCardRequestWrapper;
import com.ss.android.ugc.aweme.giftcard.network.PipoResultWrapper;
import com.ss.android.ugc.aweme.pipo.cashier.IPIPOCashierService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import njp.a;

/* JADX INFO: renamed from: X.0ufJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.giftcard.checkout.GiftCardCheckoutVM$fetchRemoteData$1$2", f = "GiftCardCheckoutVM.kt", l = {98}, m = "invokeSuspend")
public final class C1712510ufJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ GiftCardCheckoutVM LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1712510ufJ(String str, GiftCardCheckoutVM giftCardCheckoutVM, InterfaceC1364105Vn<? super C1712510ufJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = giftCardCheckoutVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1712510ufJ(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        String str3;
        String strLJIJ;
        Object checkoutInfo = obj;
        C1C7U.LIZ("GiftCardCheckoutVM@7e05.fetchRemoteData$1$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z = true;
        Object objFromJson = null;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(checkoutInfo);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(checkoutInfo);
            C1717540unQ c1717540unQ = GiftCardApi.LIZ;
            String str4 = this.LLILLJJLI;
            c1717540unQ.getClass();
            GiftCardApi giftCardApiLIZ = C1717540unQ.LIZ(str4);
            C1712610ufT c1712610ufT = this.LLILLL.LLILZ;
            if (c1712610ufT != null) {
                str = c1712610ufT.LL;
            } else {
                str = null;
            }
            if (c1712610ufT != null) {
                str2 = c1712610ufT.LLILLJJLI;
            } else {
                str2 = null;
            }
            n nVar = new n();
            C1712610ufT c1712610ufT2 = this.LLILLL.LLILZ;
            if (c1712610ufT2 != null) {
                str3 = c1712610ufT2.LLILLL;
            } else {
                str3 = null;
            }
            nVar.LJJIIJ("order_id", str3);
            C1718110uoL.LIZ.getClass();
            nVar.LJJIIJ("risk_info", C1718110uoL.LIZ(""));
            IPIPOCashierService iPIPOCashierService = (IPIPOCashierService) PluggableExtentionKt.pluggableSpi$default(IPIPOCashierService.class, false, false, false, 14, null);
            if (iPIPOCashierService != null) {
                strLJIJ = iPIPOCashierService.LJIJ();
            } else {
                strLJIJ = null;
            }
            nVar.LJJIIJ("pay_info_str", strLJIJ);
            GiftCardRequestWrapper giftCardRequestWrapper = new GiftCardRequestWrapper(str2, nVar.toString(), String.valueOf(System.currentTimeMillis()), null);
            this.LL = 1;
            checkoutInfo = giftCardApiLIZ.getCheckoutInfo(str, giftCardRequestWrapper, this);
            if (checkoutInfo == objLJFF) {
                C1C7U.LIZIZ("GiftCardCheckoutVM@7e05.fetchRemoteData$1$2");
                return objLJFF;
            }
        }
        try {
            objFromJson = GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), ((PipoResultWrapper) checkoutInfo).response, new TypeToken<BaseResponse<GiftCardCheckoutInfoRespData>>() { // from class: X.0ufK
            }.getType());
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
        }
        BaseResponse baseResponse = (BaseResponse) objFromJson;
        C1714100uhs c1714100uhs = C1714100uhs.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        c1714100uhs.getClass();
        C1714100uhs.LJII = jCurrentTimeMillis;
        if (baseResponse == null || !baseResponse.LIZ()) {
            z = false;
        }
        if (z) {
            this.LLILLL.setState(new AwS605S0100000_26(baseResponse, (BaseResponse<WalletFlowDecision>) 307));
        } else {
            GiftCardCheckoutVM giftCardCheckoutVM = this.LLILLL;
            giftCardCheckoutVM.getClass();
            giftCardCheckoutVM.setState(AFwS268S0000000_26.get$arr$(697));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GiftCardCheckoutVM@7e05.fetchRemoteData$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
