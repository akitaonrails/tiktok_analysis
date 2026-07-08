package X;

import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import com.bytedance.android.livesdk.iap.IapProductDetail;
import com.bytedance.android.livesdk.revenue.level.impl.superfan.payment.api.IRevenueApi;
import java.util.TimeZone;
import tikcast.api.fans.CreateSuperFanContractResult;
import tikcast.api.fans.SuperFanPurchaseRequest;
import webcast.data.SuperFanOfferInfo;
import webcast.data.SuperFanPackage;

/* JADX INFO: renamed from: X.0KS7, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KS7 extends AbstractC516340KMu<CreateSuperFanContractResult> {
    public static final C11NZ<C470590Icr<CreateSuperFanContractResult>> LJ(C0KNX c0knx) {
        String strLIZ;
        String strLIZ2;
        String str;
        C0KSW c0ksw;
        String str2;
        long j;
        String str3;
        String string;
        String str4;
        SuperFanOfferInfo superFanOfferInfo;
        SuperFanOfferInfo superFanOfferInfo2;
        IapProductDetail iapProductDetail;
        C1617230sBd c1617230sBd;
        SuperFanPurchaseRequest superFanPurchaseRequest = new SuperFanPurchaseRequest();
        C0KP3 c0kp3 = (C0KP3) c0knx;
        superFanPurchaseRequest.toUid = c0kp3.LJIIIZ;
        SuperFanPackage superFanPackage = c0kp3.LJI.LIZ;
        String str5 = null;
        if (superFanPackage != null) {
            str5 = superFanPackage.tplId;
        }
        String str6 = "";
        if (str5 == null) {
            str5 = "";
        }
        superFanPurchaseRequest.tplId = str5;
        superFanPurchaseRequest.deviceTz = TimeZone.getDefault().getID();
        superFanPurchaseRequest.subCircle = c0kp3.LJI.LIZLLL;
        superFanPurchaseRequest.transactionScene = c0kp3.LJIIJ;
        ISubscribeService iSubscribeService = (ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class);
        if (iSubscribeService == null || iSubscribeService.Ae() == null || (strLIZ = C516700KOe.LIZ()) == null) {
            strLIZ = "";
        }
        superFanPurchaseRequest.iapCountryCode = strLIZ;
        ISubscribeService iSubscribeService2 = (ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class);
        if (iSubscribeService2 == null || iSubscribeService2.Ae() == null || (strLIZ2 = C516700KOe.LIZ()) == null) {
            strLIZ2 = "";
        }
        superFanPurchaseRequest.appStoreRegion = strLIZ2;
        superFanPurchaseRequest.roomId = c0kp3.LJIIJJI;
        superFanPurchaseRequest.orderSource = 0;
        C0KS8 c0ks8 = c0kp3.LJI;
        SuperFanPackage superFanPackage2 = c0ks8.LIZ;
        if (superFanPackage2 == null || (str = superFanPackage2.packageId) == null) {
            str = "";
        }
        superFanPurchaseRequest.packageId = str;
        int i = c0kp3.LJII;
        superFanPurchaseRequest.createContractIntent = i;
        if (i != 5 ? (c0ksw = c0ks8.LIZIZ) == null || (str2 = c0ksw.LIZ) == null : (iapProductDetail = c0ks8.LIZJ) == null || (c1617230sBd = iapProductDetail.oneTimePurchaseProduct) == null || (str2 = c1617230sBd.LIZ) == null) {
            str2 = "";
        }
        superFanPurchaseRequest.clientParam = str2;
        long j2 = 0;
        if (superFanPackage2 != null && (superFanOfferInfo2 = superFanPackage2.offerinfo) != null) {
            j = superFanOfferInfo2.promotionId;
        } else {
            j = 0;
        }
        superFanPurchaseRequest.promotionId = j;
        if (superFanPackage2 == null || (superFanOfferInfo = superFanPackage2.offerinfo) == null || (str3 = superFanOfferInfo.id) == null) {
            str3 = "";
        }
        superFanPurchaseRequest.offerId = str3;
        if (superFanPackage2 == null || (string = Long.valueOf(superFanPackage2.count).toString()) == null) {
            string = "";
        }
        superFanPurchaseRequest.purchaseCount = string;
        SuperFanPackage superFanPackage3 = c0kp3.LJI.LIZ;
        if (superFanPackage3 != null && (str4 = superFanPackage3.currency) != null) {
            str6 = str4;
        }
        superFanPurchaseRequest.currency = str6;
        if (superFanPackage3 != null) {
            j2 = superFanPackage3.usdPriceAmountMicros;
        }
        superFanPurchaseRequest.usdPriceAmountMicros = j2;
        C480460Ism.LIZ().getClass();
        return ((IRevenueApi) C480460Ism.LIZLLL(IRevenueApi.class)).purchaseFans(superFanPurchaseRequest).LJIILIIL(new C0UO0());
    }
}
