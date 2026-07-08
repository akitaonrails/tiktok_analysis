package Y;

import X.C11NZ;
import X.C19475111Hh;
import X.C1B0X;
import X.C1D1C;
import X.C2208451Bc3;
import X.C2208461Bc4;
import X.C297001Dc;
import X.C470590Icr;
import X.C517301zv;
import X.InterfaceC1487280oo2;
import com.bytedance.android.livesdk.api.revenue.enigma.iap.EnigmaIapApi;
import com.bytedance.android.livesdk.impl.revenue.enigma.iap.EnigmaPurchaseService;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import kotlin.jvm.internal.Intrinsics;
import tikcast.api.privilege.enigma.EnigmaIAPPurchaseRequest;
import tikcast.api.privilege.enigma.EnigmaIAPPurchaseResponse;

/* JADX INFO: loaded from: classes35.dex */
public class AkS493S0100000_34 implements InterfaceC1487280oo2 {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            case 3:
                return apply$3(this, obj);
            default:
                return null;
        }
    }

    public AkS493S0100000_34(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object apply$0(Y.AkS493S0100000_34 r6, java.lang.Object r7) {
        /*
            X.0KTt r7 = (X.C518150KTt) r7
            boolean r0 = r7.LIZ
            r2 = 0
            if (r0 != 0) goto L28
            java.lang.Object r0 = r6.l0
            X.1B0X r0 = (X.C1B0X) r0
            java.lang.String r3 = r0.LJI
            java.lang.String r1 = r0.LJII
            X.15Oo r0 = r0.LJIIIIZZ
            X.C2197881B0g.LIZ(r7, r3, r1, r0)
            X.1B0q r1 = new X.1B0q
            X.0KQW r0 = r7.LIZJ
            if (r0 == 0) goto L1e
            java.lang.String r0 = r0.LIZIZ
            if (r0 != 0) goto L20
        L1e:
            java.lang.String r0 = "Failed to fetch product payload"
        L20:
            r1.<init>(r0, r2)
            X.11Is r0 = X.AbstractC19484711Kz.LJIILLIIL(r1)
            return r0
        L28:
            java.util.Map<java.lang.String, com.bytedance.android.livesdk.iap.IapProductDetail> r1 = r7.LIZIZ
            if (r1 == 0) goto L4c
            java.lang.Object r0 = r6.l0
            X.1B0X r0 = (X.C1B0X) r0
            tikcast.api.privilege.enigma.EnigmaProductsResponse$Data$EnigmaIAPProductDetails r0 = r0.LJ
            java.lang.String r0 = r0.mpSkuId
            java.lang.Object r3 = r1.get(r0)
            com.bytedance.android.livesdk.iap.IapProductDetail r3 = (com.bytedance.android.livesdk.iap.IapProductDetail) r3
            if (r3 == 0) goto L4c
            java.lang.Object r0 = r6.l0
            X.1B0X r0 = (X.C1B0X) r0
            tikcast.api.privilege.enigma.EnigmaProductsResponse$Data$EnigmaIAPProductDetails r0 = r0.LJ
            java.lang.String r1 = r0.mpBasePlanId
            java.lang.String r0 = r0.mpOfferId
            java.lang.String r1 = r3.LIZ(r1, r0)
            if (r1 != 0) goto L4e
        L4c:
            java.lang.String r1 = ""
        L4e:
            boolean r0 = kotlin.text.a0.LJJJIL(r1)
            if (r0 == 0) goto Lb1
            X.0KTt r3 = new X.0KTt
            X.0KQW r4 = new X.0KQW
            X.0wjY r1 = X.EnumC1792020wjY.UNDEFINED
            java.lang.StringBuilder r5 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "Product payload is empty SKU "
            r5.append(r0)
            java.lang.Object r0 = r6.l0
            X.1B0X r0 = (X.C1B0X) r0
            tikcast.api.privilege.enigma.EnigmaProductsResponse$Data$EnigmaIAPProductDetails r0 = r0.LJ
            java.lang.String r0 = r0.mpSkuId
            r5.append(r0)
            java.lang.String r0 = "; Plan "
            r5.append(r0)
            java.lang.Object r0 = r6.l0
            X.1B0X r0 = (X.C1B0X) r0
            tikcast.api.privilege.enigma.EnigmaProductsResponse$Data$EnigmaIAPProductDetails r0 = r0.LJ
            java.lang.String r0 = r0.mpBasePlanId
            r5.append(r0)
            java.lang.String r0 = "; Offer "
            r5.append(r0)
            java.lang.Object r0 = r6.l0
            X.1B0X r0 = (X.C1B0X) r0
            tikcast.api.privilege.enigma.EnigmaProductsResponse$Data$EnigmaIAPProductDetails r0 = r0.LJ
            java.lang.String r0 = r0.mpOfferId
            r5.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r5)
            r4.<init>(r1, r0)
            r1 = 2
            r0 = 0
            r3.<init>(r0, r2, r4, r1)
            java.lang.Object r0 = r6.l0
            X.1B0X r0 = (X.C1B0X) r0
            java.lang.String r2 = r0.LJI
            java.lang.String r1 = r0.LJII
            X.15Oo r0 = r0.LJIIIIZZ
            X.C2197881B0g.LIZ(r3, r2, r1, r0)
            X.1B0r r0 = new X.1B0r
            r0.<init>()
            X.11Is r0 = X.AbstractC19484711Kz.LJIILLIIL(r0)
            return r0
        Lb1:
            X.11Hj r0 = X.AbstractC19484711Kz.LJIJJLI(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AkS493S0100000_34.apply$0(Y.AkS493S0100000_34, java.lang.Object):java.lang.Object");
    }

    public static final Object apply$1(AkS493S0100000_34 akS493S0100000_34, Object obj) {
        int i;
        C297001Dc c297001Dc = (C297001Dc) obj;
        EnigmaPurchaseService enigmaPurchaseService = (EnigmaPurchaseService) akS493S0100000_34.l0;
        enigmaPurchaseService.getClass();
        C1B0X c1b0x = c297001Dc.LIZ;
        EnigmaIAPPurchaseRequest enigmaIAPPurchaseRequest = new EnigmaIAPPurchaseRequest();
        enigmaIAPPurchaseRequest.productId = c1b0x.LJ.mpProductId;
        if (Intrinsics.LJFF(c1b0x.LJFF, "subs")) {
            i = 2;
        } else {
            i = 1;
        }
        enigmaIAPPurchaseRequest.productType = i;
        enigmaIAPPurchaseRequest.roomId = c1b0x.LIZIZ;
        enigmaIAPPurchaseRequest.iapPayload = c297001Dc.LIZIZ;
        enigmaIAPPurchaseRequest.iapChannel = "gp";
        enigmaIAPPurchaseRequest.appStoreRegion = c1b0x.LJII;
        enigmaIAPPurchaseRequest.mpPricePointId = c1b0x.LJ.mpPricePointId;
        enigmaIAPPurchaseRequest.contractId = c1b0x.LIZLLL;
        C11NZ<C470590Icr<EnigmaIAPPurchaseResponse.Data>> c11nzCreateIapPurchase = ((EnigmaIapApi) enigmaPurchaseService.LLILZIL.getValue()).createIapPurchase(enigmaIAPPurchaseRequest);
        c11nzCreateIapPurchase.getClass();
        return new C19475111Hh(c11nzCreateIapPurchase).LJIL(new C517301zv(c1b0x, 5)).LJJI(new AkS332S0200000_34(enigmaPurchaseService, c1b0x, 0));
    }

    public static final Object apply$2(AkS493S0100000_34 akS493S0100000_34, Object obj) {
        return C11NZ.LJIJJLI(new C1D1C((C2208461Bc4) akS493S0100000_34.l0, (UploadAuthKeyConfig) obj, 0));
    }

    public static final Object apply$3(AkS493S0100000_34 akS493S0100000_34, Object obj) {
        return C11NZ.LJIJJLI(new C1D1C((C2208451Bc3) akS493S0100000_34.l0, (UploadAuthKeyConfig) obj, 1));
    }
}
