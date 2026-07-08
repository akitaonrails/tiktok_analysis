package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService;

/* JADX INFO: renamed from: X.0ikA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1254240ikA {
    public static final boolean LIZ(String str, String str2) {
        SettingsManager.LIZLLL().getClass();
        String str3 = "";
        if (!SettingsManager.LIZ("biolink_migrate_exempt", false) && C736460Sui.LIZIZ(str2)) {
            IComplianceBusinessService iComplianceBusinessServiceLJI = ComplianceServiceProvider.LJI();
            if (str2 == null) {
                str2 = "";
            }
            return iComplianceBusinessServiceLJI.LJ(str2);
        }
        SettingsManager.LIZLLL().getClass();
        if (!SettingsManager.LIZ("biolink_migrate_exempt", false) || !C736460Sui.LIZIZ(str)) {
            return false;
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "target");
        IComplianceBusinessService iComplianceBusinessServiceLJI2 = ComplianceServiceProvider.LJI();
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
            str3 = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        }
        return iComplianceBusinessServiceLJI2.LJ(str3);
    }
}
