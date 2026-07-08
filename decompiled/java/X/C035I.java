package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ChangeInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CreateOrderRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.DonationDisplayModule;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.DonationInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.DonationModule;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.ab.DonationModuleConfig;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AwS16S0010000_1;
import kotlin.jvm.internal.AwS86S1200000_1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.035I, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C035I extends C035N<C035J> implements C033Y {
    public static final List<Integer> LIZLLL = Collections.singletonList(Integer.valueOf(C03DI.USER_ADDRESS.getValue()));
    public final OrderSubmitAssemViewModel LIZJ;

    @Override // X.C035N
    public final InterfaceC729102sz LJJZ() {
        return new C035J(false, false, false);
    }

    @Override // X.C033Y
    public final C037U LJJIJL() {
        if (C035K.LIZ().enableDonation) {
            return new C037U();
        }
        return null;
    }

    @Override // X.C033Y
    public final C035M LJJJLL() {
        DonationDisplayModule donationDisplayModule;
        DonationModule donationModule;
        if (!C035K.LIZ().enableDonation) {
            return null;
        }
        C035J c035jLJJZZI = LJJZZI();
        BillInfoData billInfoData = this.LIZJ.LLJJI;
        if (!c035jLJJZZI.LIZ || billInfoData == null || (donationDisplayModule = billInfoData.donationDisplayModule) == null || (donationModule = donationDisplayModule.donationDisplayModule) == null) {
            return null;
        }
        return new C035M(donationModule, c035jLJJZZI.LIZIZ, c035jLJJZZI.LIZJ);
    }

    public C035I(OrderSubmitAssemViewModel orderSubmitAssemViewModel) {
        this.LIZJ = orderSubmitAssemViewModel;
    }

    @Override // X.C033Y
    public final Boolean LJIILJJIL(boolean z) {
        return Boolean.valueOf(LJJZZIII(new AwS16S0010000_1(z, 28)));
    }

    @Override // X.C035N, X.C035U
    public final void LJJJJIZL(JSONObject jSONObject) throws JSONException {
        DonationDisplayModule donationDisplayModule;
        DonationModule donationModule;
        if (jSONObject == null) {
            return;
        }
        boolean z = LJJZZI().LIZIZ;
        BillInfoData billInfoData = this.LIZJ.LLJJI;
        if (z && billInfoData != null && (donationDisplayModule = billInfoData.donationDisplayModule) != null && (donationModule = donationDisplayModule.donationDisplayModule) != null && donationModule.donationInfo != null) {
            jSONObject.put("donation", 1);
        }
    }

    @Override // X.C035N, X.C035U
    public final void LJJLIIIJ(CreateOrderRequest createOrderRequest) {
        DonationInfo donationInfo;
        DonationDisplayModule donationDisplayModule;
        DonationModule donationModule;
        boolean z = LJJZZI().LIZIZ;
        BillInfoData billInfoData = this.LIZJ.LLJJI;
        if (z && billInfoData != null && (donationDisplayModule = billInfoData.donationDisplayModule) != null && (donationModule = donationDisplayModule.donationDisplayModule) != null) {
            donationInfo = donationModule.donationInfo;
        } else {
            donationInfo = null;
        }
        createOrderRequest.donationInfo = donationInfo;
    }

    @Override // X.C035N, X.C035U
    public final void LJJLIIIJLJLI(List<C035L> list) {
        if (LJJZZI().LIZIZ && "donation".length() != 0) {
            list.add(new C035L(C03CW.SUMMARY.getValue(), "donation"));
        }
    }

    public final void LJL(BillInfoData billInfoData) {
        DonationModule donationModule;
        DonationDisplayModule donationDisplayModule;
        String str = null;
        if (billInfoData != null && (donationDisplayModule = billInfoData.donationDisplayModule) != null) {
            donationModule = donationDisplayModule.donationDisplayModule;
        } else {
            donationModule = null;
        }
        if (!C02Y8.LIZIZ(donationModule)) {
            if (donationModule != null) {
                str = donationModule.unableToast;
            }
        } else if (donationModule != null) {
            str = donationModule.paymentUnableToast;
        }
        if (C123100dR.LIZ(str)) {
            OrderSubmitAssemViewModel orderSubmitAssemViewModel = this.LIZJ;
            Integer numValueOf = Integer.valueOf(R.raw.icon_exclamation_mark_circle);
            Integer numValueOf2 = Integer.valueOf(R.attr.zi);
            orderSubmitAssemViewModel.getClass();
            orderSubmitAssemViewModel.setState(new AwS86S1200000_1(str, numValueOf, numValueOf2, 13));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    @Override // X.C035N, X.C036G
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIL(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData r7, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r8) {
        /*
            r6 = this;
            X.02sz r1 = r6.LJJZZI()
            X.035J r1 = (X.C035J) r1
            boolean r0 = r1.LIZ
            boolean r5 = r1.LIZIZ
            r2 = 0
            r1 = 1
            r4 = 0
            if (r0 == 0) goto L38
            if (r7 == 0) goto L4f
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.DonationDisplayModule r0 = r7.donationDisplayModule
            if (r0 == 0) goto L4f
        L15:
            r3 = 1
            if (r8 == 0) goto L50
            boolean r0 = r8.LJFF()
            if (r0 != r1) goto L50
            if (r7 == 0) goto L22
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.DonationDisplayModule r2 = r7.donationDisplayModule
        L22:
            boolean r0 = X.C02Y8.LIZ(r2)
            if (r0 == 0) goto L50
            r2 = 1
        L29:
            kotlin.jvm.internal.AwS0S0030000_1 r1 = new kotlin.jvm.internal.AwS0S0030000_1
            r0 = 0
            r1.<init>(r3, r5, r2, r0)
            r6.LJJZZIII(r1)
            if (r4 == 0) goto L37
            r6.LJL(r7)
        L37:
            return
        L38:
            if (r7 == 0) goto L4f
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.DonationDisplayModule r0 = r7.donationDisplayModule
            if (r0 == 0) goto L4f
            if (r8 == 0) goto L4f
            boolean r0 = r8.LJFF()
            if (r0 != r1) goto L4f
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.DonationDisplayModule r0 = r7.donationDisplayModule
            boolean r0 = X.C02Y8.LIZ(r0)
            if (r0 == 0) goto L4f
            goto L15
        L4f:
            r3 = 0
        L50:
            r2 = 0
            if (r5 == 0) goto L58
            if (r8 == 0) goto L58
        L55:
            r5 = 0
            r4 = r1
            goto L29
        L58:
            r1 = 0
            goto L55
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C035I.LJJIL(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo):void");
    }

    @Override // X.C035N, X.C035U
    public final void LJJLIIJ(ChangeInfo changeInfo, BillInfoRequest billInfoRequest) {
        DonationDisplayModule donationDisplayModule;
        boolean z;
        List<Integer> list;
        BillInfoData billInfoData = this.LIZJ.LLJJI;
        if (billInfoData != null) {
            donationDisplayModule = billInfoData.donationDisplayModule;
        } else {
            donationDisplayModule = null;
        }
        boolean z2 = true;
        if (donationDisplayModule != null) {
            z = true;
        } else {
            z = false;
        }
        DonationModuleConfig donationModuleConfig = C035K.LIZ().donationModuleConfig;
        if (donationModuleConfig == null || (list = donationModuleConfig.refreshChangeTypes) == null) {
            list = LIZLLL;
        }
        if (!z || !list.contains(Integer.valueOf(changeInfo.changeType))) {
            z2 = false;
        }
        billInfoRequest.setWithDonation(Boolean.valueOf(z2));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    @Override // X.C035N, X.C036G
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJZ(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r7, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData r8, boolean r9) {
        /*
            r6 = this;
            X.02sz r1 = r6.LJJZZI()
            X.035J r1 = (X.C035J) r1
            r4 = 1
            r3 = 0
            if (r9 == 0) goto L2c
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.DonationDisplayModule r0 = r8.donationDisplayModule
            if (r0 == 0) goto L29
            if (r7 == 0) goto L29
            boolean r0 = r7.LJFF()
            if (r0 != r4) goto L29
            r2 = 1
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.DonationDisplayModule r0 = r8.donationDisplayModule
            boolean r0 = X.C02Y8.LIZ(r0)
            if (r0 == 0) goto L2a
        L1f:
            kotlin.jvm.internal.AwS0S0020000_1 r1 = new kotlin.jvm.internal.AwS0S0020000_1
            r0 = 1
            r1.<init>(r2, r4, r0)
            r6.LJJZZIII(r1)
        L28:
            return
        L29:
            r2 = 0
        L2a:
            r4 = 0
            goto L1f
        L2c:
            boolean r0 = r1.LIZ
            boolean r5 = r1.LIZIZ
            if (r0 == 0) goto L58
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.DonationDisplayModule r0 = r8.donationDisplayModule
            if (r0 == 0) goto L6d
        L36:
            r2 = 1
            if (r7 == 0) goto L6e
            boolean r0 = r7.LJFF()
            if (r0 != r4) goto L6e
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.DonationDisplayModule r0 = r8.donationDisplayModule
            boolean r0 = X.C02Y8.LIZ(r0)
            if (r0 == 0) goto L6e
            r3 = r5
            r5 = 0
        L49:
            kotlin.jvm.internal.AwS0S0030000_1 r1 = new kotlin.jvm.internal.AwS0S0030000_1
            r0 = 1
            r1.<init>(r2, r3, r4, r0)
            r6.LJJZZIII(r1)
            if (r5 == 0) goto L28
            r6.LJL(r8)
            return
        L58:
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.DonationDisplayModule r0 = r8.donationDisplayModule
            if (r0 == 0) goto L6d
            if (r7 == 0) goto L6d
            boolean r0 = r7.LJFF()
            if (r0 != r4) goto L6d
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.DonationDisplayModule r0 = r8.donationDisplayModule
            boolean r0 = X.C02Y8.LIZ(r0)
            if (r0 == 0) goto L6d
            goto L36
        L6d:
            r2 = 0
        L6e:
            r4 = 0
            goto L49
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C035I.LJJJJZ(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData, boolean):void");
    }
}
