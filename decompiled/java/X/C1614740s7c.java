package X;

import com.ss.android.ugc.aweme.model.VipSubscriptionStatus;

/* JADX INFO: renamed from: X.0s7c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1614740s7c {
    public static EnumC1614730s7b LIZ(VipSubscriptionStatus vipSubscriptionStatus) {
        int i;
        if (vipSubscriptionStatus != null && (i = C1614660s7U.LIZ[vipSubscriptionStatus.ordinal()]) != -1) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new C1954807lC();
                        }
                    } else {
                        return EnumC1614730s7b.EXPIRED;
                    }
                } else {
                    return EnumC1614730s7b.AUTO_RENEW_CANCELED;
                }
            } else {
                return EnumC1614730s7b.ACTIVE_SUBSCRIBER;
            }
        }
        return EnumC1614730s7b.NEW_USER;
    }
}
