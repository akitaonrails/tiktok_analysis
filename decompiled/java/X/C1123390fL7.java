package X;

import com.bytedance.android.livesdk.api.revenue.level.IUserLevelService;
import com.bytedance.android.livesdk.gift.model.GiftsInfo;
import com.bytedance.android.livesdk.model.Gift;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fL7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1123390fL7 {
    public static GiftsInfo.LevelUpGiftInfo LIZ;
    public static final Set<Long> LIZIZ = new LinkedHashSet();
    public static boolean LIZJ;

    public static C1123400fL8 LIZ(Gift gift) {
        if (gift != null) {
            GiftsInfo.LevelUpGiftInfo levelUpGiftInfo = LIZ;
            int i = 0;
            if (levelUpGiftInfo != null && gift.id == levelUpGiftInfo.giftId) {
                C1123400fL8 c1123400fL8 = new C1123400fL8(levelUpGiftInfo.leftCountToLevelUp);
                C1094360eaI c1094360eaIHP = ((IUserLevelService) C1161920gLG.LIZJ(IUserLevelService.class)).HP();
                if (c1094360eaIHP != null) {
                    i = c1094360eaIHP.LIZ;
                }
                c1123400fL8.LIZIZ = i;
                return c1123400fL8;
            }
            return null;
        }
        return null;
    }

    public static boolean LIZIZ(Long l) {
        Long lValueOf;
        if (l != null) {
            GiftsInfo.LevelUpGiftInfo levelUpGiftInfo = LIZ;
            if (levelUpGiftInfo != null) {
                lValueOf = Long.valueOf(levelUpGiftInfo.giftId);
            } else {
                lValueOf = null;
            }
            if (Intrinsics.LJFF(l, lValueOf)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZJ(X.AbstractC1126600fQI r3) {
        /*
            r2 = 1
            if (r3 == 0) goto L40
            T extends X.0054 r1 = r3.LIZIZ
            boolean r0 = r1 instanceof com.bytedance.android.livesdk.model.Gift
            if (r0 == 0) goto L40
            com.bytedance.android.livesdk.model.Gift r1 = (com.bytedance.android.livesdk.model.Gift) r1
            if (r1 == 0) goto L40
            com.bytedance.android.livesdk.model.GiftLockInfo r0 = r1.giftSubInfo
            if (r0 == 0) goto L40
            int r1 = r0.mLockType
            r0 = 8
            if (r1 != r0) goto L40
            java.lang.Class<com.bytedance.android.livesdk.api.revenue.level.IUserLevelService> r0 = com.bytedance.android.livesdk.api.revenue.level.IUserLevelService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdk.api.revenue.level.IUserLevelService r0 = (com.bytedance.android.livesdk.api.revenue.level.IUserLevelService) r0
            X.0eaI r0 = r0.HP()
            if (r0 == 0) goto L40
            int r1 = r0.LJFF
            r0 = 2
            if (r1 != r0) goto L40
        L2a:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "isLevelUpGiftOptOut: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "GiftLevelUpUtils"
            X.C20441214yg.LIZIZ(r0, r1)
            return r2
        L40:
            r2 = 0
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1123390fL7.LIZJ(X.0fQI):boolean");
    }

    public static boolean LIZLLL(AbstractC1126600fQI abstractC1126600fQI) {
        if (abstractC1126600fQI != null && abstractC1126600fQI.LJIJI() && !abstractC1126600fQI.LJIILLIIL()) {
            return true;
        }
        return false;
    }
}
