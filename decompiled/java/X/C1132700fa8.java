package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.MultiLiveRTCLayoutChannel;
import com.bytedance.android.livesdk.gift.model.MatchInfo;
import com.bytedance.android.livesdk.livesetting.gift.HitGalleryRepurchaseGroupSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftTrayForGuardianSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchVaultBoostingCardSettings;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftTrayInfo;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fa8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1132700fa8 {
    public static final ConcurrentHashMap<Long, MatchInfo> LIZ = new ConcurrentHashMap<>();

    public static final void LIZ(GiftMessage giftMessage) {
        MatchInfo matchInfo;
        int i = 0;
        if (giftMessage != null && giftMessage.repeatEnd == 0 && C1128450fTH.LJIL() && (matchInfo = giftMessage.matchInfo) != null) {
            long j = matchInfo.multiplierValue;
            boolean z = matchInfo.effectCardInUse;
            if (j <= 1 && !z) {
                return;
            }
            ConcurrentHashMap<Long, MatchInfo> concurrentHashMap = LIZ;
            MatchInfo matchInfo2 = concurrentHashMap.get(Long.valueOf(giftMessage.groupId));
            if (matchInfo2 == null) {
                matchInfo2 = new MatchInfo();
            }
            if (matchInfo2.multiplierValue < j) {
                matchInfo2.multiplierValue = j;
                MatchInfo matchInfo3 = giftMessage.matchInfo;
                if (matchInfo3 != null) {
                    i = matchInfo3.multiplierType;
                }
                matchInfo2.multiplierType = i;
            }
            matchInfo2.effectCardInUse |= z;
            concurrentHashMap.put(Long.valueOf(giftMessage.groupId), matchInfo2);
        }
    }

    public static final int LIZIZ(int i) {
        if (i != 2 && i != 3) {
            if (LiveMatchVaultBoostingCardSettings.INSTANCE.getValue() && i == 4) {
                return R.drawable.evc;
            }
            return R.drawable.ev_;
        }
        return R.drawable.evb;
    }

    public static final CharSequence LIZJ(GiftMessage giftMessage) {
        MatchInfo matchInfo;
        if (giftMessage != null && C1128450fTH.LJIL() && (matchInfo = LIZ.get(Long.valueOf(giftMessage.groupId))) != null) {
            long j = matchInfo.multiplierValue;
            if (j > 1) {
                return C497740JfY.LJIJJ(2131841050, Long.valueOf(j));
            }
        }
        return "";
    }

    public static final boolean LIZLLL(GiftMessage giftMessage) {
        GiftTrayInfo giftTrayInfo;
        if (giftMessage == null || !LiveGiftTrayForGuardianSetting.INSTANCE.isEnable() || (giftTrayInfo = giftMessage.mTrayInfo) == null || giftTrayInfo.rightTagText == null) {
            return false;
        }
        return true;
    }

    public static final boolean LJI(C1135810ff9 c1135810ff9) {
        GiftMessage giftMessage;
        if (c1135810ff9 != null) {
            giftMessage = c1135810ff9.LIZ;
        } else {
            giftMessage = null;
        }
        if ((giftMessage != null && giftMessage.isFirstSendGift) || LJIILJJIL(giftMessage) || LJIILLIIL(giftMessage) || LIZLLL(giftMessage)) {
            return true;
        }
        return false;
    }

    public static final boolean LJII(GiftMessage giftMessage) {
        List<GiftMessage.SponsorshipInfo> list;
        GiftMessage.SponsorshipInfo sponsorshipInfo;
        if (giftMessage == null || (list = giftMessage.sponsorshipInfo) == null || (sponsorshipInfo = (GiftMessage.SponsorshipInfo) C13LP.LJJJLL(list)) == null || sponsorshipInfo.sponsorId != UserService.getInstance().user().getCurrentUserId()) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIIIZZ(C1135810ff9 c1135810ff9) {
        GiftMessage giftMessage;
        if (c1135810ff9 != null && (giftMessage = c1135810ff9.LIZ) != null && giftMessage.isFirstSendGift) {
            return true;
        }
        return false;
    }

    public static final boolean LJIIIZ(C1135810ff9 c1135810ff9) {
        if (c1135810ff9 != null) {
            if (c1135810ff9.LJII == 3 || c1135810ff9.LJII == 4) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LJIIL(C1135810ff9 c1135810ff9) {
        List<GiftMessage.SponsorshipInfo> list;
        if (c1135810ff9 == null) {
            return false;
        }
        if (c1135810ff9.LJJJLL && (list = c1135810ff9.LJIL) != null) {
            Iterator<GiftMessage.SponsorshipInfo> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                GiftMessage.SponsorshipInfo next = it2.next();
                if (next.giftTrayStyle == 1) {
                    if (next == null) {
                        break;
                    }
                }
            }
            return !c1135810ff9.LJJJLL ? false : false;
        }
        if (!c1135810ff9.LJJJLL || HitGalleryRepurchaseGroupSetting.INSTANCE.getValue() != 1) {
        }
        return true;
    }

    public static final boolean LJIILIIL(C1135810ff9 c1135810ff9) {
        GiftMessage giftMessage;
        if (c1135810ff9 != null) {
            giftMessage = c1135810ff9.LIZ;
        } else {
            giftMessage = null;
        }
        return LJIILJJIL(giftMessage);
    }

    public static final boolean LJIILJJIL(GiftMessage giftMessage) {
        Long lValueOf;
        long id;
        GiftMessage.SponsorshipInfo sponsorshipInfo;
        if (giftMessage == null) {
            return false;
        }
        List<GiftMessage.SponsorshipInfo> list = giftMessage.sponsorshipInfo;
        Long lValueOf2 = null;
        if (list != null && (sponsorshipInfo = (GiftMessage.SponsorshipInfo) C13LP.LJJJLL(list)) != null) {
            lValueOf = Long.valueOf(sponsorshipInfo.sponsorId);
        } else {
            lValueOf = null;
        }
        User user = giftMessage.fromUser;
        if (user != null) {
            lValueOf2 = Long.valueOf(user.getId());
        }
        if (Intrinsics.LJFF(lValueOf, lValueOf2)) {
            User user2 = giftMessage.fromUser;
            if (user2 != null) {
                id = user2.getId();
            } else {
                id = 0;
            }
            long jLIZIZ = C1133680fbi.LIZIZ(giftMessage);
            boolean zContains = C1697810uHb.LJIIJJI(Long.valueOf(id), Long.valueOf(jLIZIZ)).contains(Long.valueOf(UserService.getInstance().user().getCurrentUserId()));
            if (C1128450fTH.LJIJJ(jLIZIZ) == C0JG7.CURRENT_ANCHOR || zContains) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LJIILL(C1135810ff9 c1135810ff9) {
        GiftMessage giftMessage;
        if (c1135810ff9 != null) {
            giftMessage = c1135810ff9.LIZ;
        } else {
            giftMessage = null;
        }
        return LJIILLIIL(giftMessage);
    }

    public static final boolean LJIILLIIL(GiftMessage giftMessage) {
        Gift gift;
        List<Integer> list;
        GiftTrayInfo giftTrayInfo;
        if (giftMessage == null || (gift = giftMessage.mGift) == null || (list = gift.giftVerticalScenarios) == null || !list.contains(8) || (giftTrayInfo = giftMessage.mTrayInfo) == null || giftTrayInfo.rightTagText == null) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIZILJ(C1135810ff9 c1135810ff9) {
        if (c1135810ff9 != null && LJIILIIL(c1135810ff9) && !LJIIIIZZ(c1135810ff9)) {
            return true;
        }
        return false;
    }

    public static final boolean LJ(C1135810ff9 c1135810ff9, DataChannel dataChannel) {
        GiftMessage giftMessage;
        if (c1135810ff9 != null) {
            giftMessage = c1135810ff9.LIZ;
        } else {
            giftMessage = null;
        }
        return LJFF(dataChannel, giftMessage);
    }

    public static final boolean LJFF(DataChannel dataChannel, GiftMessage giftMessage) {
        if ((giftMessage != null && giftMessage.isFirstSendGift) || LJIILJJIL(giftMessage) || LJIIJJI(dataChannel, giftMessage) || LJIILLIIL(giftMessage) || LIZLLL(giftMessage)) {
            return true;
        }
        return false;
    }

    public static final boolean LJIIJ(C1135810ff9 c1135810ff9, DataChannel dataChannel) {
        GiftMessage giftMessage;
        if (c1135810ff9 != null) {
            giftMessage = c1135810ff9.LIZ;
        } else {
            giftMessage = null;
        }
        return LJIIJJI(dataChannel, giftMessage);
    }

    public static final boolean LJIIJJI(DataChannel dataChannel, GiftMessage giftMessage) {
        C1081600eFi c1081600eFi;
        if (giftMessage == null || giftMessage.linkmicGiftExpressionStrategy == 0 || C1133680fbi.LIZIZ(giftMessage) != C2640010k.LIZ()) {
            return false;
        }
        if (!((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).tH2().isEmpty()) {
            return true;
        }
        if (dataChannel == null || (c1081600eFi = (C1081600eFi) dataChannel.gg0(MultiLiveRTCLayoutChannel.class)) == null || !c1081600eFi.LIZIZ() || ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).w9() || ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getGuestCount() <= 0) {
            return false;
        }
        return true;
    }
}
