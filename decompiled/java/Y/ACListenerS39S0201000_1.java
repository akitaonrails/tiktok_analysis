package Y;

import X.AnonymousClass0449;
import X.C03O0;
import X.C03WH;
import X.C03YI;
import X.C042Y;
import X.C04HS;
import X.C1018703yb;
import X.C1024203zU;
import X.C1054004Ag;
import X.C770702zh;
import X.C847303St;
import X.C874003bG;
import X.C874103bH;
import X.C899503fN;
import X.InterfaceC1072204Hg;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ButtonStyle;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.purchasemethod.PdpPurchaseMethodVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS17S2200000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public class ACListenerS39S0201000_1 implements View.OnClickListener {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS39S0201000_1 aCListenerS39S0201000_1, View view) {
        String str;
        SkuPanelState skuPanelStateLIZIZ;
        PdpPurchaseMethodVH pdpPurchaseMethodVH = (PdpPurchaseMethodVH) aCListenerS39S0201000_1.l0;
        C1024203zU c1024203zU = (C1024203zU) aCListenerS39S0201000_1.l1;
        Integer numValueOf = Integer.valueOf(aCListenerS39S0201000_1.i2);
        pdpPurchaseMethodVH.getClass();
        if (numValueOf != null && numValueOf.intValue() != 0 && numValueOf.intValue() == 1) {
            str = "subscribe";
        } else {
            str = "one-time purchase";
        }
        int i = aCListenerS39S0201000_1.i2;
        C1054004Ag c1054004Ag = ((PdpViewModel) pdpPurchaseMethodVH.LLJJJJLIIL.getValue()).LLJLILLLLZIIL;
        if (c1054004Ag != null) {
            C1018703yb.LJII("tiktokec_module_click", new AwS17S2200000_1(c1054004Ag, (C1054004Ag) "purchase_method", str, (String) pdpPurchaseMethodVH.c6(c1024203zU, i), (Map<String, ? extends Object>) 13));
        }
        PdpViewModel pdpViewModel = (PdpViewModel) ((PdpPurchaseMethodVH) aCListenerS39S0201000_1.l0).LLJJJJLIIL.getValue();
        int i2 = aCListenerS39S0201000_1.i2;
        SkuPanelState skuPanelStatePv0 = pdpViewModel.Pv0();
        if (skuPanelStatePv0 != null) {
            skuPanelStateLIZIZ = SkuPanelState.LIZIZ(skuPanelStatePv0, null, null, null, null, null, null, Integer.valueOf(i2), null, false, 0, null, null, null, null, null, null, 67108799);
        } else {
            skuPanelStateLIZIZ = null;
        }
        pdpViewModel.RE2(skuPanelStateLIZIZ);
        pdpViewModel.BS2(pdpViewModel.Pv0(), true, false, false, AnonymousClass0449.CHANGE_PURCHASE_METHOD, true);
    }

    public static final void onClick$1(ACListenerS39S0201000_1 aCListenerS39S0201000_1, View view) {
        PaymentMethod paymentMethod;
        PaymentMethod paymentMethod2;
        PaymentMethod paymentMethod3;
        PaymentMethodsData paymentMethodsData;
        String strLJJIIZ;
        String str;
        String str2;
        String strLJJIJ;
        boolean z;
        EnterParams enterParams;
        PaymentInfo paymentInfo;
        Availability availability;
        PaymentMethod subPaymentMethod;
        if (((C874103bH) aCListenerS39S0201000_1.l0).LIZ()) {
            return;
        }
        ((C874003bG) aCListenerS39S0201000_1.l1).LIZIZ();
        boolean z2 = true;
        ((C874103bH) aCListenerS39S0201000_1.l0).setChecked(true);
        PaymentMethod paymentMethod4 = ((C874003bG) aCListenerS39S0201000_1.l1).getPaymentMethod();
        if (paymentMethod4 != null) {
            paymentMethod4.LIZ = ((C874103bH) aCListenerS39S0201000_1.l0).getSubPaymentMethod();
        }
        PaymentMethod subPaymentMethod2 = ((C874103bH) aCListenerS39S0201000_1.l0).getSubPaymentMethod();
        if (subPaymentMethod2 != null) {
            ((C874003bG) aCListenerS39S0201000_1.l1).getOnSubPaymentCheckChanged().invoke(subPaymentMethod2);
        }
        if (((C874003bG) aCListenerS39S0201000_1.l1).getAutoSelect() && (subPaymentMethod = ((C874103bH) aCListenerS39S0201000_1.l0).getSubPaymentMethod()) != null) {
            C03O0.LIZ.getClass();
            C03O0.LJJ = subPaymentMethod;
        }
        PaymentMethod paymentMethod5 = ((C874003bG) aCListenerS39S0201000_1.l1).getPaymentMethod();
        ButtonStyle buttonStyleLJIILLIIL = null;
        if (paymentMethod5 != null) {
            paymentMethod = paymentMethod5.LIZ;
        } else {
            paymentMethod = null;
        }
        if (!C899503fN.LIZIZ(paymentMethod, C03WH.LJIILJJIL)) {
            C899503fN.LIZIZ(((C874003bG) aCListenerS39S0201000_1.l1).LLIZLLLIL, ((C874103bH) aCListenerS39S0201000_1.l0).getSubPaymentMethod());
            C03WH paymentLogger = ((C874003bG) aCListenerS39S0201000_1.l1).getPaymentLogger();
            if (paymentLogger != null) {
                PaymentMethod paymentMethod6 = ((C874003bG) aCListenerS39S0201000_1.l1).getPaymentMethod();
                String strLJJIIZ2 = "";
                if (paymentMethod6 == null) {
                    strLJJIIZ = "";
                } else {
                    strLJJIIZ = paymentMethod6.LJJIIZ();
                }
                PaymentMethod subPaymentMethod3 = ((C874103bH) aCListenerS39S0201000_1.l0).getSubPaymentMethod();
                if (subPaymentMethod3 != null) {
                    strLJJIIZ2 = subPaymentMethod3.LJJIIZ();
                }
                int i = aCListenerS39S0201000_1.i2;
                PaymentMethod subPaymentMethod4 = ((C874103bH) aCListenerS39S0201000_1.l0).getSubPaymentMethod();
                if (subPaymentMethod4 != null) {
                    str = subPaymentMethod4.extraInfo;
                } else {
                    str = null;
                }
                boolean zLIZIZ = C770702zh.LIZIZ(str);
                PaymentMethod subPaymentMethod5 = ((C874103bH) aCListenerS39S0201000_1.l0).getSubPaymentMethod();
                if (subPaymentMethod5 != null && (availability = subPaymentMethod5.availability) != null) {
                    str2 = availability.statusCode;
                } else {
                    str2 = null;
                }
                Boolean boolValueOf = Boolean.valueOf(((C874003bG) aCListenerS39S0201000_1.l1).getAutoSelect());
                PaymentMethod paymentMethod7 = ((C874003bG) aCListenerS39S0201000_1.l1).getPaymentMethod();
                PaymentMethod subPaymentMethod6 = ((C874103bH) aCListenerS39S0201000_1.l0).getSubPaymentMethod();
                PaymentMethod subPaymentMethod7 = ((C874103bH) aCListenerS39S0201000_1.l0).getSubPaymentMethod();
                if (subPaymentMethod7 != null) {
                    strLJJIJ = subPaymentMethod7.LJJIJ();
                } else {
                    strLJJIJ = null;
                }
                PaymentViewModel paymentViewModel = ((C874003bG) aCListenerS39S0201000_1.l1).getPaymentViewModel();
                if (paymentViewModel != null && (enterParams = paymentViewModel.LLJ) != null && (paymentInfo = enterParams.paymentInfo) != null && paymentInfo.LIZJ()) {
                    z = true;
                } else {
                    z = false;
                }
                C03WH.LJIJJ(paymentLogger, strLJJIIZ, strLJJIIZ2, i, zLIZIZ, str2, boolValueOf, null, null, paymentMethod7, subPaymentMethod6, null, null, strLJJIJ, z, null, 39296);
            }
        }
        ((C874003bG) aCListenerS39S0201000_1.l1).setAutoSelect(false);
        ((C874003bG) aCListenerS39S0201000_1.l1).setDefaultChoose(false);
        C03WH.LJIILJJIL = null;
        List<? extends Object> list = PaymentViewModel.LLLI;
        if (!C03YI.LJIIJJI()) {
            C847303St c847303St = C847303St.LIZ;
            PaymentMethod paymentMethod8 = ((C874003bG) aCListenerS39S0201000_1.l1).getPaymentMethod();
            if (paymentMethod8 != null) {
                paymentMethod2 = paymentMethod8.LIZ;
            } else {
                paymentMethod2 = null;
            }
            c847303St.getClass();
            if (C847303St.LIZIZ(paymentMethod2)) {
                Context context = ((C874103bH) aCListenerS39S0201000_1.l0).getContext();
                PaymentMethod paymentMethod9 = ((C874003bG) aCListenerS39S0201000_1.l1).getPaymentMethod();
                if (paymentMethod9 != null) {
                    paymentMethod3 = paymentMethod9.LIZ;
                } else {
                    paymentMethod3 = null;
                }
                PaymentViewModel paymentViewModel2 = ((C874003bG) aCListenerS39S0201000_1.l1).getPaymentViewModel();
                if (paymentViewModel2 != null && (paymentMethodsData = paymentViewModel2.LLJJIJIL) != null) {
                    buttonStyleLJIILLIIL = paymentMethodsData.LJIILLIIL(null);
                }
                if (buttonStyleLJIILLIIL != ButtonStyle.TOKO_STYLE) {
                    z2 = false;
                }
                C847303St.LIZ(context, paymentMethod3, z2, new AwS545S0100000_1((C874003bG) aCListenerS39S0201000_1.l1, 1679));
            }
        }
    }

    public static final void onClick$2(ACListenerS39S0201000_1 aCListenerS39S0201000_1, View view) {
        C042Y c042y;
        C042Y c042y2 = (C042Y) aCListenerS39S0201000_1.l0;
        if (c042y2.LLILZIL && Intrinsics.LJFF(c042y2, ((C04HS) aCListenerS39S0201000_1.l1).LLILLJJLI)) {
            return;
        }
        C04HS c04hs = (C04HS) aCListenerS39S0201000_1.l1;
        boolean z = true;
        c04hs.LLJJ = true;
        if (Intrinsics.LJFF(c04hs.LLILLJJLI, (C042Y) aCListenerS39S0201000_1.l0)) {
            c042y = null;
        } else {
            c042y = (C042Y) aCListenerS39S0201000_1.l0;
        }
        c04hs.LLILLJJLI = c042y;
        ((C04HS) aCListenerS39S0201000_1.l1).LIZIZ();
        C04HS c04hs2 = (C04HS) aCListenerS39S0201000_1.l1;
        InterfaceC1072204Hg interfaceC1072204Hg = c04hs2.LLILZIL;
        if (interfaceC1072204Hg != null) {
            interfaceC1072204Hg.LIZ(c04hs2.LLILZ, c04hs2.LLILLJJLI);
        }
        C04HS c04hs3 = (C04HS) aCListenerS39S0201000_1.l1;
        InterfaceC1072204Hg interfaceC1072204Hg2 = c04hs3.LLILZIL;
        if (interfaceC1072204Hg2 != null) {
            int i = c04hs3.LLILZ;
            int i2 = aCListenerS39S0201000_1.i2;
            C042Y c042y3 = (C042Y) aCListenerS39S0201000_1.l0;
            if (c04hs3.LLILLJJLI == null) {
                z = false;
            }
            interfaceC1072204Hg2.LIZIZ(i, i2, c042y3, z);
        }
        ((C04HS) aCListenerS39S0201000_1.l1).LIZLLL();
    }

    public ACListenerS39S0201000_1(Object obj, Object obj2, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.i2 = i;
    }
}
