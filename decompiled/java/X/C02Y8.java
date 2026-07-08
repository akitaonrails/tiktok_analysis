package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.DonationDisplayModule;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.DonationModule;

/* JADX INFO: renamed from: X.02Y8, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02Y8 {
    public static final boolean LIZ(DonationDisplayModule donationDisplayModule) {
        DonationModule donationModule;
        if (donationDisplayModule == null || (donationModule = donationDisplayModule.donationDisplayModule) == null) {
            return false;
        }
        Integer num = donationModule.donationModuleStatus;
        int value = EnumC035900Ar.DONATION_STATUS_NORMAL.getValue();
        if (num == null || num.intValue() != value) {
            return false;
        }
        return true;
    }

    public static final boolean LIZIZ(DonationModule donationModule) {
        if (donationModule == null) {
            return false;
        }
        Integer num = donationModule.donationModuleStatus;
        int value = EnumC035900Ar.DONATION_STATUS_NORMAL.getValue();
        if (num == null || num.intValue() != value) {
            return false;
        }
        return true;
    }
}
