package X;

import webcast.api.first_recharge.GetFirstRechargeInfoV2Resp;

/* JADX INFO: renamed from: X.0x4T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1804990x4T {
    public static boolean LIZIZ() {
        InterfaceC1133710fbl value = C1805240x4s.LJIIJ.getValue();
        return value != null && value.LIZIZ() && value.LIZJ();
    }

    public static int LIZ(int i) {
        GetFirstRechargeInfoV2Resp.FirstRechargeCampaignV2 firstRechargeCampaignV2LIZ;
        int i2;
        InterfaceC1133710fbl value = C1805240x4s.LJIIJ.getValue();
        if (value == null || (firstRechargeCampaignV2LIZ = value.LIZ()) == null || i < (i2 = firstRechargeCampaignV2LIZ.minimumNumberOfCoinsToUnlockFrozenCoins)) {
            return 0;
        }
        int i3 = firstRechargeCampaignV2LIZ.remainingFrozenCoins;
        int i4 = firstRechargeCampaignV2LIZ.frozenCoinsForSmallPackages;
        if (i3 > i4) {
            if (i2 == firstRechargeCampaignV2LIZ.rechargeCoinsForSmallPackages) {
                if (i < firstRechargeCampaignV2LIZ.rechargeCoinsForLargePackages) {
                    return Math.min(i4, i3);
                }
            } else if (i < firstRechargeCampaignV2LIZ.rechargeCoinsForLargePackages) {
                return 0;
            }
            return Math.min(firstRechargeCampaignV2LIZ.frozenCoinsForLargePackages, i3);
        }
        return i4;
    }
}
