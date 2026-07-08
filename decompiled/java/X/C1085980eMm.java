package X;

import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.creatorteam.LiveCreatorTeamChallengeCacheFixedSettings;
import com.bytedance.android.livesdk.livesetting.creatorteam.LiveCreatorTeamTeamChallengeConfigSetting;
import com.bytedance.android.livesdk.livesetting.level.FansClubPanelV2Settings;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftLockInfo;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common.TextFormat;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0eMm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1085980eMm implements InterfaceC1095420ec0 {
    public final DataChannel LIZ;

    @Override // X.InterfaceC1095420ec0
    public final void LIZIZ() {
    }

    public static boolean LJI() {
        return ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).c70();
    }

    @Override // X.InterfaceC1095420ec0
    public final boolean LIZ() {
        Boolean bool = (Boolean) this.LIZ.gg0(UserIsAnchorChannel.class);
        return (bool == null || !bool.booleanValue()) && LJI() && !LJFF() && LJ() != null;
    }

    public final boolean LJFF() {
        Room room = (Room) this.LIZ.gg0(RoomChannel.class);
        String strValueOf = String.valueOf(room != null ? room.getOwnerUserId() : 0L);
        List<String> listLIZ = InterfaceC1106030et7.F6.LIZ();
        return listLIZ != null && listLIZ.contains(strValueOf);
    }

    @Override // X.InterfaceC1095420ec0
    public final Text getDefaultText() {
        Text text = new Text();
        FansClubPanelV2Settings fansClubPanelV2Settings = FansClubPanelV2Settings.INSTANCE;
        text.defaultPattern = fansClubPanelV2Settings.enableFansClubPanelV2() ? "Send the unlocked Fan Club Gift to celebrate" : "Send the unlocked team challenge Gift to celebrate";
        text.key = fansClubPanelV2Settings.enableFansClubPanelV2() ? "ttlive_fanClub_clubChallenge_giftUnlockedPopUp_sendGift" : "ttlive_teamChallenge_giftUnlockedPopUp_sendGift";
        TextFormat textFormat = new TextFormat();
        text.defaultFormat = textFormat;
        textFormat.color = "#C0FFFFFF";
        textFormat.fontSize = 14;
        TextFormat textFormat2 = text.defaultFormat;
        textFormat2.italic = false;
        textFormat2.weight = 0;
        return text;
    }

    public static Long LJ() {
        Object next;
        GiftLockInfo giftLockInfo;
        Boolean boolValueOf;
        List<Long> list = LiveCreatorTeamTeamChallengeConfigSetting.getValue().teamGiftList;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<Long> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).findGiftById(it2.next().longValue()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            Gift gift = (Gift) obj;
            if (gift != null && (giftLockInfo = gift.giftSubInfo) != null && (boolValueOf = Boolean.valueOf(giftLockInfo.mLock)) != null && Intrinsics.LJFF(boolValueOf, Boolean.FALSE)) {
                arrayList2.add(obj);
            }
        }
        Iterator it3 = arrayList2.iterator();
        if (it3.hasNext()) {
            next = it3.next();
            if (it3.hasNext()) {
                Gift gift2 = (Gift) next;
                int i = gift2 != null ? gift2.diamondCount : 0;
                do {
                    Object next2 = it3.next();
                    Gift gift3 = (Gift) next2;
                    int i2 = gift3 != null ? gift3.diamondCount : 0;
                    if (i < i2) {
                        next = next2;
                        i = i2;
                    }
                } while (it3.hasNext());
            }
        } else {
            next = null;
        }
        Gift gift4 = (Gift) next;
        if (gift4 != null) {
            return Long.valueOf(gift4.id);
        }
        return null;
    }

    @Override // X.InterfaceC1095420ec0
    public final Gift LIZLLL() {
        Long lLJ = LJ();
        if (lLJ != null) {
            return ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).findGiftById(lLJ.longValue());
        }
        return null;
    }

    public C1085980eMm(DataChannel dataChannel) {
        this.LIZ = dataChannel;
    }

    public static boolean LJII(Gift gift) {
        return LiveCreatorTeamTeamChallengeConfigSetting.getValue().teamGiftList.contains(Long.valueOf(gift.id));
    }

    @Override // X.InterfaceC1095420ec0
    public final void LIZJ(Gift gift, Text text) {
        if (text != null) {
            long ownerUserId = 0;
            if (!LiveCreatorTeamChallengeCacheFixedSettings.INSTANCE.getValue()) {
                Room room = (Room) this.LIZ.gg0(RoomChannel.class);
                if (room != null) {
                    ownerUserId = room.getOwnerUserId();
                }
                String strValueOf = String.valueOf(ownerUserId);
                C0JT6<List<String>> c0jt6 = InterfaceC1106030et7.F6;
                ArrayList arrayList = (ArrayList) c0jt6.LIZ();
                if (arrayList != null) {
                    ArrayList arrayList2 = new ArrayList();
                    int i = LiveCreatorTeamTeamChallengeConfigSetting.getValue().teamChallengeRoomSize;
                    if (arrayList.size() >= i) {
                        arrayList2.addAll(C13LP.LLD(i / 2, arrayList));
                    }
                    arrayList2.add(strValueOf);
                    c0jt6.LIZJ(arrayList2);
                }
            } else {
                Room room2 = (Room) this.LIZ.gg0(RoomChannel.class);
                if (room2 != null) {
                    ownerUserId = room2.getOwnerUserId();
                }
                String strValueOf2 = String.valueOf(ownerUserId);
                C0JT6<List<String>> c0jt62 = InterfaceC1106030et7.F6;
                ArrayList arrayList3 = (ArrayList) c0jt62.LIZ();
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                }
                ArrayList arrayList4 = new ArrayList();
                int i2 = LiveCreatorTeamTeamChallengeConfigSetting.getValue().teamChallengeRoomSize;
                if (arrayList3.size() >= i2) {
                    arrayList4.addAll(C13LP.LLD(i2 / 2, arrayList3));
                } else {
                    arrayList4.addAll(arrayList3);
                }
                arrayList4.add(strValueOf2);
                c0jt62.LIZJ(arrayList4);
            }
            C784440Upu.LIZ().LIZIZ(new C1121100fHQ(Long.valueOf(gift.id), gift.icon, text, EnumC1120860fH2.GIFT_TEAM_CHALLENGE_UNLOCK, null, null, null, 240));
        }
    }
}
