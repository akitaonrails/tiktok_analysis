package X;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.subpayment.SubPaymentListFragment;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.03jg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C926203jg {
    public static final C926203jg LIZ = new C926203jg();

    public static void LIZ(C926203jg c926203jg, Context context, String str, boolean z, PaymentMethod paymentMethod, EnterParams enterParams, FragmentManager fragmentManager, C927003jo c927003jo, EnumC865603Zu enumC865603Zu, boolean z2, String str2, int i) {
        C927003jo c927003jo2 = c927003jo;
        String str3 = str2;
        boolean z3 = z2;
        EnumC865603Zu enumC865603Zu2 = enumC865603Zu;
        FragmentManager fragmentManager2 = fragmentManager;
        if ((i & 32) != 0) {
            fragmentManager2 = null;
        }
        if ((i & 64) != 0) {
            c927003jo2 = null;
        }
        if ((i & 128) != 0) {
            enumC865603Zu2 = null;
        }
        if ((i & 256) != 0) {
            z3 = false;
        }
        if ((i & 512) != 0) {
            str3 = null;
        }
        c926203jg.getClass();
        Keva keva = C1257480ipO.LIZ;
        keva.storeString("sub_payment_list_parent_payment_method", C1741890vQh.LJIIIIZZ(paymentMethod));
        keva.storeString("sub_payment_list_enter_params", C1741890vQh.LJIIIIZZ(enterParams));
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("ec_sub_payment_select_optimize", false) && fragmentManager2 != null) {
            SubPaymentListFragment subPaymentListFragment = new SubPaymentListFragment();
            if (str == null) {
                str = "";
            }
            subPaymentListFragment.LLILZ = str;
            subPaymentListFragment.LLILZIL = z;
            if (c927003jo2 != null) {
                subPaymentListFragment.LLIZ = c927003jo2;
            }
            subPaymentListFragment.LLIZLLLIL = z3;
            subPaymentListFragment.LLILZLL = str3;
            C882703cf.LIZ(fragmentManager2, subPaymentListFragment, null, enumC865603Zu2, false, 20);
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("sub_payment_list_checked_sub_pm_id", str);
        linkedHashMap.put("is_from_osp", Boolean.valueOf(z));
        C919503ib.LIZIZ(context, "aweme://ec/sub_payment_list", linkedHashMap, false).open();
    }
}
