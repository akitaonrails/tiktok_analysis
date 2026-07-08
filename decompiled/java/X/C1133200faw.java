package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.gift.model.MatchInfo;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftHammerSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0faw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1133200faw {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(133));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(132));

    public static boolean LIZ(C1135810ff9 c1135810ff9) {
        int iIntValue;
        if (c1135810ff9 == null) {
            return false;
        }
        LiveGiftHammerSetting liveGiftHammerSetting = LiveGiftHammerSetting.INSTANCE;
        if (liveGiftHammerSetting.isEnabled() && c1135810ff9.LJJJLZIJ >= liveGiftHammerSetting.getMinHammerPrice()) {
            while (!c1135810ff9.LJJII.isEmpty()) {
                int i = c1135810ff9.LJIIJ;
                Pair<Integer, Boolean> pairPeek = c1135810ff9.LJJII.peek();
                if (pairPeek != null) {
                    iIntValue = pairPeek.getFirst().intValue();
                } else {
                    iIntValue = -1;
                }
                if (i <= iIntValue) {
                    break;
                }
                c1135810ff9.LJJII.poll();
            }
            Pair<Integer, Boolean> pairPeek2 = c1135810ff9.LJJII.peek();
            if (pairPeek2 != null) {
                return pairPeek2.getSecond().booleanValue();
            }
        }
        return false;
    }

    public static boolean LIZLLL(GiftMessage giftMessage) {
        int i;
        MatchInfo matchInfo;
        if (giftMessage == null) {
            return false;
        }
        LiveGiftHammerSetting liveGiftHammerSetting = LiveGiftHammerSetting.INSTANCE;
        if (!liveGiftHammerSetting.isEnabled()) {
            return false;
        }
        Gift gift = giftMessage.mGift;
        if (gift != null) {
            i = gift.diamondCount;
        } else {
            i = 0;
        }
        if (i < liveGiftHammerSetting.getMinHammerPrice() || (matchInfo = C1132700fa8.LIZ.get(Long.valueOf(giftMessage.groupId))) == null || !matchInfo.effectCardInUse) {
            return false;
        }
        return true;
    }

    public static boolean LIZIZ(int i, boolean z) {
        LiveGiftHammerSetting liveGiftHammerSetting = LiveGiftHammerSetting.INSTANCE;
        if (!liveGiftHammerSetting.isEnabled()) {
            return false;
        }
        boolean zLJFF = Intrinsics.LJFF(C1130100fVw.LIZ.LIZJ, "match_item_effect_panel");
        boolean zUi2 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).ui2();
        if (!zLJFF || !zUi2 || z || i < liveGiftHammerSetting.getMinHammerPrice()) {
            return false;
        }
        return true;
    }

    public static void LIZJ(InterfaceC1136020ffU interfaceC1136020ffU, InterfaceC1136020ffU interfaceC1136020ffU2) {
        if (LiveGiftHammerSetting.INSTANCE.isEnabled()) {
            interfaceC1136020ffU.LJJI().LIZIZ().clear();
            interfaceC1136020ffU.LJJI().LIZIZ().addAll(interfaceC1136020ffU2.LJJI().LIZIZ());
        }
    }
}
