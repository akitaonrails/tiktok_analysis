package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.AgreementConfiguration;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.generalpostpayment.GeneralPostPaymentGuideFragment;
import java.util.Map;

/* JADX INFO: renamed from: X.0uut, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1722170uut {
    public static void LIZ(String str, Context context, String str2, String str3, String str4, String str5, String str6, AgreementConfiguration agreementConfiguration, String str7, String str8, boolean z, Map map) {
        FragmentManager supportFragmentManager;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
            GeneralPostPaymentGuideFragment generalPostPaymentGuideFragment = new GeneralPostPaymentGuideFragment();
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("key_content_url", str2, bundle);
            C786410Ut5.LJJJI("key_material_content", str3, bundle);
            C786410Ut5.LJJJI("key_merchant_id", str4, bundle);
            C786410Ut5.LJJJI("key_merchant_agreement_id", str6, bundle);
            C786410Ut5.LJJJI("key_merchant_user_id", str5, bundle);
            C786410Ut5.LJJJI("key_agreement_type", "BACKUP_PAYMENT_METHOD", bundle);
            C786410Ut5.LJJJI("key_source", str, bundle);
            C786410Ut5.LJJJI("key_risk_info", str7, bundle);
            C786410Ut5.LJJJI("key_action", str8, bundle);
            bundle.putBoolean("key_use_close_icon", z);
            C786410Ut5.LJJIJL(bundle, "key_configuration", agreementConfiguration);
            generalPostPaymentGuideFragment.setArguments(bundle);
            generalPostPaymentGuideFragment.LLJIJIL = map;
            generalPostPaymentGuideFragment.show(supportFragmentManager, "GeneralPostPaymentGuideFragment");
        }
    }
}
