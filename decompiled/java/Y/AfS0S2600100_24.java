package Y;

import X.C09JN;
import X.C1159150gGn;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1613010s4p;
import X.C1613360s5O;
import X.C1614230s6n;
import X.C1614300s6u;
import X.C1954807lC;
import X.C1C7U;
import X.EnumC1612690s4J;
import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.SeriesCategory;
import com.ss.android.ugc.aweme.model.PaidCollectionPaymentResponse;
import com.ss.android.ugc.aweme.model.VoucherUseStatus;
import com.ss.android.ugc.aweme.payment.IapInfo;
import com.ss.android.ugc.aweme.payment.MarketplaceCreateOrderResponse;
import com.ss.android.ugc.aweme.series.payment.serviceimpl.SeriesPaymentServiceImpl;

/* JADX INFO: loaded from: classes25.dex */
public class AfS0S2600100_24 implements C09JN {
    public final int $t;
    public long j8;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public Object l6;
    public Object l7;
    public String s0;
    public String s1;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS0S2600100_24 afS0S2600100_24, Object obj) {
        VoucherUseStatus voucherUseStatus;
        C1C7U.LIZ("SeriesPaymentServiceImpl@a944.makePurchase$disposable$11");
        MarketplaceCreateOrderResponse marketplaceCreateOrderResponse = (MarketplaceCreateOrderResponse) obj;
        com.ss.android.ugc.aweme.payment.VoucherUseStatus voucherUseStatus2 = marketplaceCreateOrderResponse.discountInfo.voucherUseStatus;
        int[] iArr = C1614300s6u.LIZ;
        int i = iArr[voucherUseStatus2.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    voucherUseStatus = VoucherUseStatus.VOUCHER_SUCCESS;
                } else {
                    throw new C1954807lC();
                }
            } else {
                voucherUseStatus = VoucherUseStatus.VOUCHER_UNAVAILABLE;
            }
        } else {
            voucherUseStatus = VoucherUseStatus.NO_VOUCHER_USED;
        }
        ((SeriesPaymentServiceImpl) afS0S2600100_24.l2).LJIILIIL(new C1159150gGn(voucherUseStatus, marketplaceCreateOrderResponse.orderId, afS0S2600100_24.j8));
        int i2 = iArr[voucherUseStatus2.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    SeriesPaymentServiceImpl seriesPaymentServiceImpl = (SeriesPaymentServiceImpl) afS0S2600100_24.l2;
                    IapInfo iapInfo = marketplaceCreateOrderResponse.iapInfo;
                    seriesPaymentServiceImpl.LJIILL(iapInfo.iapOrderId, iapInfo.bizId, (SeriesCategory) afS0S2600100_24.l3, (EnumC1612690s4J) afS0S2600100_24.l4, (Context) afS0S2600100_24.l5, (C1613010s4p) afS0S2600100_24.l6, afS0S2600100_24.s0, afS0S2600100_24.s1, iapInfo.iapPayload, (C1613360s5O) afS0S2600100_24.l7, afS0S2600100_24.j8);
                } else {
                    throw new C1954807lC();
                }
            } else {
                SeriesPaymentServiceImpl seriesPaymentServiceImpl2 = (SeriesPaymentServiceImpl) afS0S2600100_24.l2;
                Context context = (Context) afS0S2600100_24.l5;
                seriesPaymentServiceImpl2.getClass();
                Activity activityLIZ = C1388190mED.LIZ(context);
                if (activityLIZ != null) {
                    C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                    c1389890mGx.LJIIIZ(2131850246);
                    c1389890mGx.LJIIJJI();
                }
                SeriesPaymentServiceImpl seriesPaymentServiceImpl3 = (SeriesPaymentServiceImpl) afS0S2600100_24.l2;
                IapInfo iapInfo2 = marketplaceCreateOrderResponse.iapInfo;
                seriesPaymentServiceImpl3.LJIILL(iapInfo2.iapOrderId, iapInfo2.bizId, (SeriesCategory) afS0S2600100_24.l3, (EnumC1612690s4J) afS0S2600100_24.l4, (Context) afS0S2600100_24.l5, (C1613010s4p) afS0S2600100_24.l6, afS0S2600100_24.s0, afS0S2600100_24.s1, iapInfo2.iapPayload, (C1613360s5O) afS0S2600100_24.l7, afS0S2600100_24.j8);
            }
        } else {
            SeriesPaymentServiceImpl seriesPaymentServiceImpl4 = (SeriesPaymentServiceImpl) afS0S2600100_24.l2;
            IapInfo iapInfo3 = marketplaceCreateOrderResponse.iapInfo;
            seriesPaymentServiceImpl4.LJIILL(iapInfo3.iapOrderId, iapInfo3.bizId, (SeriesCategory) afS0S2600100_24.l3, (EnumC1612690s4J) afS0S2600100_24.l4, (Context) afS0S2600100_24.l5, (C1613010s4p) afS0S2600100_24.l6, afS0S2600100_24.s0, afS0S2600100_24.s1, iapInfo3.iapPayload, (C1613360s5O) afS0S2600100_24.l7, afS0S2600100_24.j8);
        }
        C1C7U.LIZIZ("SeriesPaymentServiceImpl@a944.makePurchase$disposable$11");
    }

    public static final void accept$1(AfS0S2600100_24 afS0S2600100_24, Object obj) {
        C1C7U.LIZ("SeriesPaymentServiceImpl@a944.makePurchase$disposable$4");
        PaidCollectionPaymentResponse paidCollectionPaymentResponse = (PaidCollectionPaymentResponse) obj;
        ((SeriesPaymentServiceImpl) afS0S2600100_24.l2).LJIILIIL(new C1159150gGn(paidCollectionPaymentResponse.voucherUseStatus, paidCollectionPaymentResponse.paidContentOrderId, afS0S2600100_24.j8));
        int i = C1614230s6n.LIZ[paidCollectionPaymentResponse.voucherUseStatus.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    ((SeriesPaymentServiceImpl) afS0S2600100_24.l2).LJIILL(paidCollectionPaymentResponse.orderId, paidCollectionPaymentResponse.bizId, (SeriesCategory) afS0S2600100_24.l3, (EnumC1612690s4J) afS0S2600100_24.l4, (Context) afS0S2600100_24.l5, (C1613010s4p) afS0S2600100_24.l6, afS0S2600100_24.s0, afS0S2600100_24.s1, paidCollectionPaymentResponse.iapPayload, (C1613360s5O) afS0S2600100_24.l7, afS0S2600100_24.j8);
                } else {
                    throw new C1954807lC();
                }
            } else {
                SeriesPaymentServiceImpl seriesPaymentServiceImpl = (SeriesPaymentServiceImpl) afS0S2600100_24.l2;
                Context context = (Context) afS0S2600100_24.l5;
                seriesPaymentServiceImpl.getClass();
                Activity activityLIZ = C1388190mED.LIZ(context);
                if (activityLIZ != null) {
                    C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                    c1389890mGx.LJIIIZ(2131850246);
                    c1389890mGx.LJIIJJI();
                }
                ((SeriesPaymentServiceImpl) afS0S2600100_24.l2).LJIILL(paidCollectionPaymentResponse.orderId, paidCollectionPaymentResponse.bizId, (SeriesCategory) afS0S2600100_24.l3, (EnumC1612690s4J) afS0S2600100_24.l4, (Context) afS0S2600100_24.l5, (C1613010s4p) afS0S2600100_24.l6, afS0S2600100_24.s0, afS0S2600100_24.s1, paidCollectionPaymentResponse.iapPayload, (C1613360s5O) afS0S2600100_24.l7, afS0S2600100_24.j8);
            }
        } else {
            ((SeriesPaymentServiceImpl) afS0S2600100_24.l2).LJIILL(paidCollectionPaymentResponse.orderId, paidCollectionPaymentResponse.bizId, (SeriesCategory) afS0S2600100_24.l3, (EnumC1612690s4J) afS0S2600100_24.l4, (Context) afS0S2600100_24.l5, (C1613010s4p) afS0S2600100_24.l6, afS0S2600100_24.s0, afS0S2600100_24.s1, paidCollectionPaymentResponse.iapPayload, (C1613360s5O) afS0S2600100_24.l7, afS0S2600100_24.j8);
        }
        C1C7U.LIZIZ("SeriesPaymentServiceImpl@a944.makePurchase$disposable$4");
    }

    public AfS0S2600100_24(SeriesPaymentServiceImpl seriesPaymentServiceImpl, long j, SeriesCategory seriesCategory, EnumC1612690s4J enumC1612690s4J, Context context, C1613010s4p c1613010s4p, String str, String str2, C1613360s5O c1613360s5O, int i) {
        this.$t = i;
        this.l2 = seriesPaymentServiceImpl;
        this.j8 = j;
        this.l3 = seriesCategory;
        this.l4 = enumC1612690s4J;
        this.l5 = context;
        this.l6 = c1613010s4p;
        this.s0 = str;
        this.s1 = str2;
        this.l7 = c1613360s5O;
    }
}
