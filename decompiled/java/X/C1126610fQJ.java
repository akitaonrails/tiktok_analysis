package X;

import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.livesetting.level.FansClubCelebrationGiftIdsSetting;
import com.bytedance.android.livesdk.model.Gift;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fQJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1126610fQJ {
    public static boolean LIZ;

    public static final boolean LIZJ() {
        return (((WalletExchange) ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletExchange()).LJJ() || ((WalletExchange) ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletExchange()).LJIL()) ? false : true;
    }

    public static boolean LIZ(Long l) {
        if (l != null) {
            l.longValue();
            List<String> value = FansClubCelebrationGiftIdsSetting.INSTANCE.getValue();
            if (value != null && value.contains(l.toString())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LIZIZ(InterfaceC1131100fXY interfaceC1131100fXY) {
        Gift.MusicGiftInfo musicGiftInfo;
        boolean z = false;
        if (interfaceC1131100fXY.LJJJJIZL() < 99) {
            return false;
        }
        Gift giftLJZI = interfaceC1131100fXY.LJZI();
        if ((giftLJZI != null || (giftLJZI = GiftManager.inst().findGiftById(interfaceC1131100fXY.getGiftId())) != null) && (musicGiftInfo = giftLJZI.musicInfo) != null && musicGiftInfo.resource != null && !Intrinsics.LJFF(interfaceC1131100fXY.LIZIZ(), "music_gift_secondary_page")) {
            z = true;
        }
        return !z;
    }
}
