package X;

import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.PollData;
import com.bytedance.android.livesdk.model.message.PollOptionInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0eO5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1086790eO5 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LJFF() {
        Gift gift;
        Gift gift2;
        HashMap map = new HashMap();
        C1086850eOB pollGifts = ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getPollGifts();
        if (C1086800eO6.LIZJ) {
            if (C1086830eO9.LIZ == EnumC1086920eOI.GIFT) {
                map.put("ongoing_type", "gift_poll");
                Long lValueOf = null;
                map.put("gift_1_id", String.valueOf((pollGifts == null || (gift2 = pollGifts.LIZ) == null) ? null : Long.valueOf(gift2.id)));
                if (pollGifts != null && (gift = pollGifts.LIZIZ) != null) {
                    lValueOf = Long.valueOf(gift.id);
                }
                map.put("gift_2_id", String.valueOf(lValueOf));
            } else {
                map.put("ongoing_type", "normal_poll");
            }
            map.put("poll_id", String.valueOf(C1086830eO9.LIZIZ));
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_poll_entrance_click");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(Integer.valueOf(C1086800eO6.LIZJ ? 1 : 0), "is_ongoing");
        c474500IjALIZ.LJJII("toolbar", "request_page");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }

    public static void LJIIIIZZ() {
        Gift gift;
        Gift gift2;
        HashMap map = new HashMap();
        C1086850eOB pollGifts = ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getPollGifts();
        if (C1086800eO6.LIZJ) {
            if (C1086830eO9.LIZ == EnumC1086920eOI.GIFT) {
                map.put("ongoing_type", "gift_poll");
                Long lValueOf = null;
                map.put("gift_1_id", String.valueOf((pollGifts == null || (gift2 = pollGifts.LIZ) == null) ? null : Long.valueOf(gift2.id)));
                if (pollGifts != null && (gift = pollGifts.LIZIZ) != null) {
                    lValueOf = Long.valueOf(gift.id);
                }
                map.put("gift_2_id", String.valueOf(lValueOf));
            } else {
                map.put("ongoing_type", "normal_poll");
            }
            map.put("poll_id", String.valueOf(C1086830eO9.LIZIZ));
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_poll_entrance_show");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(Integer.valueOf(C1086800eO6.LIZJ ? 1 : 0), "is_ongoing");
        c474500IjALIZ.LJJII("toolbar", "request_page");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }

    public static void LIZLLL(C474500IjA c474500IjA) {
        boolean z;
        if (C1086800eO6.LJ < 2) {
            z = true;
        } else {
            z = false;
        }
        c474500IjA.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0), "is_new");
    }

    public static void LJIIJ(String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_poll_start_fail");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(str, "fail_reason");
        c474500IjALIZ.LJJII(Long.valueOf(C1086830eO9.LIZIZ), "poll_id");
        c474500IjALIZ.LIZ();
    }

    public static void LIZ(DataChannel dataChannel, EnumC1086920eOI enumC1086920eOI) {
        String str;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_poll_end_click");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(Long.valueOf(C1086830eO9.LIZIZ), "poll_id");
        if (enumC1086920eOI == EnumC1086920eOI.GIFT) {
            str = "gift_poll";
        } else {
            str = "normal_poll";
        }
        c474500IjALIZ.LJJII(str, "poll_type");
        c474500IjALIZ.LIZ();
    }

    public static void LIZJ(EnumC1086920eOI enumC1086920eOI, int i) {
        Long lValueOf;
        Gift gift;
        Gift gift2;
        C1086850eOB pollGifts = ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getPollGifts();
        HashMap map = new HashMap();
        String str = "gift_poll";
        if (C1086800eO6.LIZJ) {
            if (C1086830eO9.LIZ == EnumC1086920eOI.GIFT) {
                map.put("ongoing_type", "gift_poll");
                Long lValueOf2 = null;
                if (pollGifts != null && (gift2 = pollGifts.LIZ) != null) {
                    lValueOf = Long.valueOf(gift2.id);
                } else {
                    lValueOf = null;
                }
                map.put("gift_1_id", String.valueOf(lValueOf));
                if (pollGifts != null && (gift = pollGifts.LIZIZ) != null) {
                    lValueOf2 = Long.valueOf(gift.id);
                }
                map.put("gift_2_id", String.valueOf(lValueOf2));
            } else {
                map.put("ongoing_type", "normal_poll");
            }
            map.put("poll_id", String.valueOf(C1086830eO9.LIZIZ));
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_poll_click_start");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(Integer.valueOf(C1086800eO6.LIZJ ? 1 : 0), "is_ongoing");
        if (enumC1086920eOI != EnumC1086920eOI.GIFT) {
            str = "normal_poll";
        }
        c474500IjALIZ.LJJII(str, "poll_type");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "is_effective");
        c474500IjALIZ.LJJIIZI(map);
        LIZLLL(c474500IjALIZ);
        c474500IjALIZ.LIZ();
    }

    public static void LJ(C474500IjA c474500IjA, DataChannel dataChannel) {
        boolean z;
        if (dataChannel != null && dataChannel.gg0(C780320UjG.class) != null) {
            z = false;
        } else {
            z = true;
        }
        c474500IjA.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0), "is_new");
    }

    public static void LJII(DataChannel dataChannel, EnumC1086920eOI enumC1086920eOI) {
        String str;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_poll_start_popup_show");
        c474500IjALIZ.LJIJJLI(dataChannel);
        if (enumC1086920eOI == EnumC1086920eOI.GIFT) {
            str = "gift_poll";
        } else {
            str = "normal_poll";
        }
        c474500IjALIZ.LJJII(str, "poll_type");
        LJ(c474500IjALIZ, dataChannel);
        c474500IjALIZ.LIZ();
    }

    public static void LJIIIZ(DataChannel dataChannel, EnumC1086920eOI enumC1086920eOI) {
        HashMap map;
        PollData pollData;
        Long lValueOf;
        Gift gift;
        Long lValueOf2;
        Gift gift2;
        Gift gift3;
        Long lValueOf3;
        Gift gift4;
        if (dataChannel == null || (map = (HashMap) dataChannel.gg0(C780320UjG.class)) == null || (pollData = (PollData) map.get(Integer.valueOf(enumC1086920eOI.ordinal()))) == null) {
            return;
        }
        C1086850eOB pollGifts = ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getPollGifts();
        HashMap map2 = new HashMap();
        if (pollData.pollKind == 0) {
            map2.put("winner", pollData.LIZJ());
            map2.put("poll_type", "normal_poll");
            map2.put("poll_result", pollData.LIZIZ());
        } else {
            Long lValueOf4 = null;
            if (Intrinsics.LJFF(pollData.LIZ(), CardStruct.IStatusCode.DEFAULT)) {
                if (pollGifts != null && (gift4 = pollGifts.LIZ) != null) {
                    lValueOf3 = Long.valueOf(gift4.id);
                } else {
                    lValueOf3 = null;
                }
                map2.put("winner", String.valueOf(lValueOf3));
            } else if (Intrinsics.LJFF(pollData.LIZ(), "1")) {
                if (pollGifts != null && (gift = pollGifts.LIZIZ) != null) {
                    lValueOf = Long.valueOf(gift.id);
                } else {
                    lValueOf = null;
                }
                map2.put("winner", String.valueOf(lValueOf));
            } else {
                map2.put("winner", pollData.LIZ());
            }
            map2.put("poll_type", "gift_poll");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("{gift_1_id: ");
            sbLIZ.append(((PollOptionInfo) ListProtector.get(pollData.pollOptionList, 0)).votes);
            sbLIZ.append(" , gift_2_id: ");
            sbLIZ.append(((PollOptionInfo) ListProtector.get(pollData.pollOptionList, 1)).votes);
            sbLIZ.append('}');
            map2.put("poll_result", C2188811AlT.LIZIZ(sbLIZ));
            if (pollGifts != null && (gift3 = pollGifts.LIZ) != null) {
                lValueOf2 = Long.valueOf(gift3.id);
            } else {
                lValueOf2 = null;
            }
            map2.put("gift_1_id", String.valueOf(lValueOf2));
            if (pollGifts != null && (gift2 = pollGifts.LIZIZ) != null) {
                lValueOf4 = Long.valueOf(gift2.id);
            }
            map2.put("gift_2_id", String.valueOf(lValueOf4));
            map2.put("gift_1_cnts", String.valueOf(((PollOptionInfo) ListProtector.get(pollData.pollOptionList, 0)).votes));
            map2.put("gift_2_cnts", String.valueOf(((PollOptionInfo) ListProtector.get(pollData.pollOptionList, 1)).votes));
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_poll_history_show");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(Long.valueOf(pollData.pollId), "poll_id");
        c474500IjALIZ.LJJII(Long.valueOf(pollData.endTime - pollData.startTime), "time");
        c474500IjALIZ.LJJII(pollData.LIZJ(), "winner");
        c474500IjALIZ.LJJIIZI(map2);
        c474500IjALIZ.LIZ();
    }

    public static void LIZIZ(DataChannel dataChannel, EnumC1086920eOI enumC1086920eOI, int i) {
        String str;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_poll_end_popup_click");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(Long.valueOf(C1086830eO9.LIZIZ), "poll_id");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "selection");
        if (enumC1086920eOI == EnumC1086920eOI.GIFT) {
            str = "gift_poll";
        } else {
            str = "normal_poll";
        }
        c474500IjALIZ.LJJII(str, "poll_type");
        c474500IjALIZ.LIZ();
    }

    public static void LJI(DataChannel dataChannel, String str, EnumC1086920eOI enumC1086920eOI) {
        String str2;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_poll_start_popup_click");
        c474500IjALIZ.LJIJJLI(dataChannel);
        LJ(c474500IjALIZ, dataChannel);
        if (enumC1086920eOI == EnumC1086920eOI.GIFT) {
            str2 = "gift_poll";
        } else {
            str2 = "normal_poll";
        }
        c474500IjALIZ.LJJII(str2, "poll_type");
        c474500IjALIZ.LJJII(str, "selection");
        c474500IjALIZ.LIZ();
    }
}
