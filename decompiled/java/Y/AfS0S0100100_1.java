package Y;

import X.C03WD;
import X.C09JN;
import X.C1019103yf;
import X.C13LP;
import X.C1C7U;
import X.C897703f5;
import X.C906603gW;
import X.C907803gi;
import X.EnumC1014603xw;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PaymentPipoErrorCodeActionSettings;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.EcUploadPayInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.EcUploadPayInfoResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.NewPayInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PayErrorToast;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PayResult;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import kotlin.jvm.internal.AwS16S0001000_1;

/* JADX INFO: loaded from: classes2.dex */
public class AfS0S0100100_1 implements C09JN {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS0S0100100_1 afS0S0100100_1, Object obj) {
        C1C7U.LIZ("AddressSelectViewModel@235c.getAddressList$2");
        Throwable th = (Throwable) obj;
        ((AddressSelectViewModel) afS0S0100100_1.l0).mR2(afS0S0100100_1.j1, th.getMessage(), false);
        ((AddressSelectViewModel) afS0S0100100_1.l0).SB1(3);
        C1019103yf.LIZ(EnumC1014603xw.ERR67, th, null);
        C1C7U.LIZIZ("AddressSelectViewModel@235c.getAddressList$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$1(AfS0S0100100_1 afS0S0100100_1, Object obj) {
        NewPayInfo newPayInfo;
        EcUploadPayInfoData ecUploadPayInfoData;
        String str;
        String str2;
        String strLJJIIZ;
        String str3;
        String str4;
        PaymentMethod paymentMethod;
        PayErrorToast payErrorToast;
        PaymentMethod paymentMethod2;
        PayErrorToast payErrorToast2;
        String str5;
        EcUploadPayInfoData ecUploadPayInfoData2;
        C1C7U.LIZ("PaymentResultProcess@6ad4.handleNewUploadPayInfo$subscribe$1");
        Response response = (Response) obj;
        String str6 = null;
        if (!response.isCodeOK()) {
            if (((PaymentPipoErrorCodeActionSettings.PaymentErrorCode) PaymentPipoErrorCodeActionSettings.LIZIZ.getValue()).enable) {
                payErrorToast2 = new PayErrorToast(null, null, null, null);
                EcUploadPayInfoResponseData ecUploadPayInfoResponseData = (EcUploadPayInfoResponseData) response.data;
                if (ecUploadPayInfoResponseData != null && (ecUploadPayInfoData2 = ecUploadPayInfoResponseData.data) != null) {
                    str5 = ecUploadPayInfoData2.pipoErrorAction;
                } else {
                    str5 = null;
                }
                payErrorToast2.LIZ = str5;
            } else {
                payErrorToast2 = null;
            }
            newPayInfo = new NewPayInfo(null, PayResult.ERROR, payErrorToast2, null, null, null, null, null, null, null);
        } else {
            EcUploadPayInfoResponseData ecUploadPayInfoResponseData2 = (EcUploadPayInfoResponseData) response.data;
            if (ecUploadPayInfoResponseData2 != null && (ecUploadPayInfoData = ecUploadPayInfoResponseData2.data) != null) {
                newPayInfo = ecUploadPayInfoData.newPayInfo;
            } else {
                newPayInfo = null;
            }
        }
        C907803gi c907803gi = C907803gi.LIZ;
        C897703f5 c897703f5 = (C897703f5) afS0S0100100_1.l0;
        c897703f5.LIZLLL = newPayInfo;
        c907803gi.LJIJJLI(c897703f5, "need_pipo_verification_sdk_new", false);
        long jCurrentTimeMillis = System.currentTimeMillis() - afS0S0100100_1.j1;
        Object obj2 = ((C897703f5) afS0S0100100_1.l0).LJII.get("previous_page");
        if (obj2 instanceof String) {
            str = (String) obj2;
        } else {
            str = null;
        }
        List<String> list = ((C897703f5) afS0S0100100_1.l0).LIZIZ;
        if (list != null) {
            str2 = (String) C13LP.LJJJLL(list);
        } else {
            str2 = null;
        }
        PaymentInfo paymentInfo = ((C897703f5) afS0S0100100_1.l0).LJI;
        if (paymentInfo != null && (paymentMethod2 = paymentInfo.paymentMethod) != null) {
            strLJJIIZ = paymentMethod2.LJJIIZ();
        } else {
            strLJJIIZ = null;
        }
        String strLIZ = C906603gW.LIZ(PayResult.NEED_PIPO_VERIFICATION_SDK);
        if (newPayInfo == null || (payErrorToast = newPayInfo.payErrorToast) == null || (str3 = payErrorToast.errorCode) == null) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        if (newPayInfo != null) {
            str4 = newPayInfo.redirectUrl;
        } else {
            str4 = null;
        }
        PaymentInfo paymentInfo2 = ((C897703f5) afS0S0100100_1.l0).LJI;
        if (paymentInfo2 != null && (paymentMethod = paymentInfo2.paymentMethod) != null) {
            str6 = paymentMethod.id;
        }
        C03WD.LJIIIIZZ("upload_pay_info_new", str, jCurrentTimeMillis, str2, strLJJIIZ, strLIZ, str3, str4, null, null, str6);
        C1C7U.LIZIZ("PaymentResultProcess@6ad4.handleNewUploadPayInfo$subscribe$1");
    }

    public static final void accept$2(AfS0S0100100_1 afS0S0100100_1, Object obj) {
        C1C7U.LIZ("DeliveryPanelViewModel@1cc7.getLogisticForPDP$dispose$2");
        Throwable th = (Throwable) obj;
        ((DeliveryPanelViewModel) afS0S0100100_1.l0).BR2(afS0S0100100_1.j1, th.getMessage(), false);
        DeliveryPanelViewModel deliveryPanelViewModel = (DeliveryPanelViewModel) afS0S0100100_1.l0;
        deliveryPanelViewModel.getClass();
        deliveryPanelViewModel.setState(new AwS16S0001000_1(3, 17));
        C1019103yf.LIZ(EnumC1014603xw.ERR66, th, null);
        C1C7U.LIZIZ("DeliveryPanelViewModel@1cc7.getLogisticForPDP$dispose$2");
    }

    public AfS0S0100100_1(Object obj, long j, int i) {
        this.$t = i;
        this.l0 = obj;
        this.j1 = j;
    }
}
