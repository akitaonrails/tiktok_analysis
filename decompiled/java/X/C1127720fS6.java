package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchVaultBoostingCardSettings;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftLockInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fS6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1127720fS6 {
    public static boolean LIZ;

    public static boolean LIZ(AbstractC1126600fQI abstractC1126600fQI) {
        boolean z;
        Gift gift;
        GiftLockInfo giftLockInfo;
        List<Integer> list;
        if (!LiveMatchVaultBoostingCardSettings.INSTANCE.getValue()) {
            return false;
        }
        boolean zLJFF = Intrinsics.LJFF(C1130100fVw.LIZ.LIZJ, "vault_glove_popup_click");
        boolean zSN = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).SN();
        Boolean boolValueOf = null;
        if (abstractC1126600fQI != null) {
            T t = abstractC1126600fQI.LIZIZ;
            if ((t instanceof Gift) && (gift = (Gift) t) != null && (giftLockInfo = gift.giftSubInfo) != null && !giftLockInfo.mLock && (list = gift.giftVerticalScenarios) != null && list.contains(8)) {
                z = true;
            } else {
                z = false;
            }
            boolValueOf = Boolean.valueOf(z);
        }
        boolean zLIZIZ = C176600m4.LIZIZ(boolValueOf);
        if (!zLJFF || !zSN || !zLIZIZ) {
            return false;
        }
        return true;
    }

    public static void LIZIZ(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("toggleISbannerdisplaying ");
        sbLIZ.append(LIZ);
        sbLIZ.append(", display ");
        sbLIZ.append(z);
        C20441214yg.LJIIIZ("VaultGlovesUtils", C2188811AlT.LIZIZ(sbLIZ));
        LIZ = z;
    }
}
