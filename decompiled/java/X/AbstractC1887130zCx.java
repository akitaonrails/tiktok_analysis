package X;

import com.bytedance.keva.Keva;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zCx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public abstract class AbstractC1887130zCx {
    public abstract String LIZJ();

    public abstract boolean LIZLLL();

    public static boolean LIZIZ(String str) {
        Keva keva;
        int i;
        Keva keva2 = C1887120zCw.LIZ;
        if (C0C64.LJIILLIIL().LJIJ(31744, 1, "enable_frequency_switch", true) == 0 || (i = (keva = C1887120zCw.LIZ).getInt("email_consent_show_times", 0)) == 0) {
            return true;
        }
        C0CLW c0clw = C0CLW.LIZIZ;
        if (i >= c0clw.LIZ.getEdmEmailConsentSettingByKey("edm_collect_consent_page_show_maximum", 5).intValue()) {
            return false;
        }
        int iIntValue = c0clw.LIZ.getEdmEmailConsentSettingByKey("edm_consent_same_entry_interval", 30).intValue();
        int iIntValue2 = c0clw.LIZ.getEdmEmailConsentSettingByKey("edm_consent_global_entry_interval", 7).intValue();
        long j = keva.getLong(str, 0L);
        if (j != 0 && System.currentTimeMillis() - j < TimeUnit.DAYS.toMillis(iIntValue)) {
            return false;
        }
        for (String str2 : C1697810uHb.LJIIJJI("profile_page", "manage_account_page")) {
            if (!Intrinsics.LJFF(str2, str)) {
                long j2 = C1887120zCw.LIZ.getLong(str2, 0L);
                if (j2 != 0 && System.currentTimeMillis() - j2 < TimeUnit.DAYS.toMillis(iIntValue2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public void LIZ(InterfaceC251700yB interfaceC251700yB) {
        C1886650zCB.LIZ.getClass();
        C1886650zCB.LIZIZ.shouldShowEmailConsentAgreement().LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZIZ(new AnonymousClass0203(interfaceC251700yB, 1));
    }
}
