package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.biz.bnpl.network.model.BaseResponse;
import com.ss.android.ugc.aweme.biz.wallet.network.model.WalletFlowDecision;
import com.ss.android.ugc.aweme.giftcard.checkout.GiftCardCheckoutVM;
import com.ss.android.ugc.aweme.giftcard.checkout.GiftcardNotifyInputInfo;
import com.ss.android.ugc.aweme.giftcard.checkout.PayDigitalGoodsRequest;
import com.ss.android.ugc.aweme.giftcard.checkout.PayDigitalGoodsRespData;
import com.ss.android.ugc.aweme.giftcard.network.GiftCardApi;
import com.ss.android.ugc.aweme.giftcard.network.GiftCardRequestWrapper;
import com.ss.android.ugc.aweme.giftcard.network.PipoResultWrapper;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import njp.a;

/* JADX INFO: renamed from: X.0ufH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.giftcard.checkout.GiftCardCheckoutVM$submitOrderAndPay$1$2", f = "GiftCardCheckoutVM.kt", l = {179}, m = "invokeSuspend")
public final class C1712490ufH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ GiftCardCheckoutVM LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1712490ufH(String str, GiftCardCheckoutVM giftCardCheckoutVM, String str2, InterfaceC1364105Vn<? super C1712490ufH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = giftCardCheckoutVM;
        this.LLILZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1712490ufH(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        String str3;
        String strLIZJ;
        Object objFromJson;
        Object objPayDigitalGoods = obj;
        C1C7U.LIZ("GiftCardCheckoutVM@7e05.submitOrderAndPay$1$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objPayDigitalGoods);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objPayDigitalGoods);
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
            C1227904rF c1227904rF = C1227904rF.LIZ;
            if (c1712610ufT != null) {
                str3 = c1712610ufT.LLILLL;
            } else {
                str3 = null;
            }
            String str5 = "";
            C1718110uoL.LIZ.getClass();
            PayDigitalGoodsRequest payDigitalGoodsRequest = new PayDigitalGoodsRequest(str3, C1697810uHb.LJIIJJI(new GiftcardNotifyInputInfo("NotifyMethod", this.LLILLL.LLILLL), new GiftcardNotifyInputInfo("NotifyTarget", this.LLILLL.LLILLJJLI)), this.LLILZ, C1718110uoL.LIZ(""));
            c1227904rF.getClass();
            String strLJI = C1227904rF.LJI(payDigitalGoodsRequest);
            String strValueOf = String.valueOf(System.currentTimeMillis());
            C1712390uf7.LIZ.getClass();
            InterfaceC921603iw interfaceC921603iw = C1712390uf7.LIZIZ;
            if (interfaceC921603iw != null && (strLIZJ = interfaceC921603iw.LIZJ("order_submit", "payment")) != null) {
                str5 = strLIZJ;
            }
            GiftCardRequestWrapper giftCardRequestWrapper = new GiftCardRequestWrapper(str2, strLJI, strValueOf, str5);
            this.LL = 1;
            objPayDigitalGoods = giftCardApiLIZ.payDigitalGoods(str, giftCardRequestWrapper, this);
            if (objPayDigitalGoods == objLJFF) {
                C1C7U.LIZIZ("GiftCardCheckoutVM@7e05.submitOrderAndPay$1$2");
                return objLJFF;
            }
        }
        try {
            objFromJson = GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), ((PipoResultWrapper) objPayDigitalGoods).response, new TypeToken<BaseResponse<PayDigitalGoodsRespData>>() { // from class: X.0ufG
            }.getType());
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
            objFromJson = null;
        }
        BaseResponse baseResponse = (BaseResponse) objFromJson;
        if (baseResponse != null) {
            this.LLILLL.setState(new AwS605S0100000_26(baseResponse, (BaseResponse<WalletFlowDecision>) 773));
        } else {
            this.LLILLL.setState(AFwS268S0000000_26.get$arr$(696));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GiftCardCheckoutVM@7e05.submitOrderAndPay$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
