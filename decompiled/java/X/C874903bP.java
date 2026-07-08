package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BnplUpgradeData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AwS545S0100000_1;

/* JADX INFO: renamed from: X.03bP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C874903bP extends LinearLayout {
    public final C01GW LL;
    public final C01GW LLILLJJLI;

    private final TuxTextView getTvUpgradeButton() {
        return (TuxTextView) this.LLILLJJLI.getValue();
    }

    private final TuxTextView getTvUpgradeTips() {
        return (TuxTextView) this.LL.getValue();
    }

    public C874903bP(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1662));
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1661));
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.ar2, this, true);
        setOrientation(0);
        setGravity(16);
        setBackgroundResource(R.drawable.b6w);
        setPadding(C679280Qkg.LIZ(12), C679280Qkg.LIZ(12), C679280Qkg.LIZ(12), C679280Qkg.LIZ(12));
    }

    public final void LIZ(final PaymentMethod paymentMethod, final String str) {
        BnplUpgradeData bnplUpgradeData;
        ECRichText eCRichText;
        String str2;
        final String str3;
        InstallmentInfo installmentInfo;
        if (paymentMethod != null && (installmentInfo = paymentMethod.installmentInfo) != null) {
            bnplUpgradeData = installmentInfo.bnplUpgradeData;
        } else {
            bnplUpgradeData = null;
        }
        TuxTextView tvUpgradeTips = getTvUpgradeTips();
        if (bnplUpgradeData != null) {
            eCRichText = bnplUpgradeData.bnplUpgradeRichText;
        } else {
            eCRichText = null;
        }
        C03C8.LIZJ(tvUpgradeTips, eCRichText, "payment_upgrade_banner", null);
        if (bnplUpgradeData != null && (str3 = bnplUpgradeData.bnplUpgradeEntranceSchema) != null) {
            C786410Ut5.h9(getTvUpgradeButton(), new View.OnClickListener() { // from class: X.03bQ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String str4;
                    SmartRouter.buildRoute(this.LL.getContext(), str3).open();
                    C874903bP c874903bP = this.LL;
                    PaymentMethod paymentMethod2 = paymentMethod;
                    String str5 = str;
                    c874903bP.getClass();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    String str6 = "";
                    if (str5 == null) {
                        str5 = "";
                    }
                    linkedHashMap.put("page_name", str5);
                    linkedHashMap.put("button_name", "payment_upgrade");
                    if (paymentMethod2 != null && (str4 = paymentMethod2.id) != null) {
                        str6 = str4;
                    }
                    linkedHashMap.put("payment_method_id", str6);
                    C1018703yb.LJ("tiktokec_button_click", linkedHashMap);
                }
            });
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("page_name", str);
        linkedHashMap.put("button_name", "payment_upgrade");
        if (paymentMethod == null || (str2 = paymentMethod.id) == null) {
            str2 = "";
        }
        linkedHashMap.put("payment_method_id", str2);
        C1018703yb.LJ("tiktokec_button_show", linkedHashMap);
    }
}
