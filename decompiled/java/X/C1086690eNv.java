package X;

import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.PollMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0eNv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1086690eNv {
    public static long LIZ;
    public static final /* synthetic */ int LIZIZ = 0;

    public static void LIZ(PollMessage pollMessage, DataChannel dataChannel) {
        boolean z;
        Long lValueOf;
        Long lValueOf2;
        Gift gift;
        Gift gift2;
        Integer num;
        HashMap map = new HashMap();
        C1086850eOB pollGifts = ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getPollGifts();
        if (pollMessage != null && (num = pollMessage.pollKind) != null && num.intValue() == 0) {
            z = true;
        } else {
            z = false;
        }
        Long lValueOf3 = null;
        if (z) {
            map.put("poll_type", "normal_poll");
        } else {
            map.put("poll_type", "gift_poll");
            if (pollGifts != null && (gift2 = pollGifts.LIZ) != null) {
                lValueOf = Long.valueOf(gift2.id);
            } else {
                lValueOf = null;
            }
            map.put("gift_1_id", String.valueOf(lValueOf));
            if (pollGifts != null && (gift = pollGifts.LIZIZ) != null) {
                lValueOf2 = Long.valueOf(gift.id);
            } else {
                lValueOf2 = null;
            }
            map.put("gift_2_id", String.valueOf(lValueOf2));
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_poll_effect_show");
        if (pollMessage != null) {
            lValueOf3 = Long.valueOf(pollMessage.pollId);
        }
        c474500IjALIZ.LJJII(lValueOf3, "poll_id");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }

    public static void LIZLLL(long j, DataChannel dataChannel) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_send_gift_poll_popup_show");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII("send_gift_confirm", "show_reason");
        c474500IjALIZ.LJJII(Long.valueOf(C1086830eO9.LIZIZ), "poll_id");
        c474500IjALIZ.LJJII(String.valueOf(j), "gift_id");
        c474500IjALIZ.LIZ();
    }

    public static void LIZIZ(long j, DataChannel dataChannel, EnumC1086920eOI enumC1086920eOI) {
        Long lValueOf;
        Gift gift;
        Gift gift2;
        HashMap map = new HashMap();
        C1086850eOB pollGifts = ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getPollGifts();
        if (enumC1086920eOI == EnumC1086920eOI.NORMAL) {
            map.put("poll_type", "normal_poll");
        } else {
            map.put("poll_type", "gift_poll");
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
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_poll_show");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(Long.valueOf(C1086830eO9.LIZIZ), "poll_id");
        c474500IjALIZ.LJJII(Long.valueOf(j), "time_remain");
        c474500IjALIZ.LJ("show");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }

    public static void LIZJ(long j, DataChannel dataChannel, String str, boolean z) {
        String str2;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_send_gift_poll_popup_click");
        c474500IjALIZ.LJIJJLI(dataChannel);
        if (z) {
            str2 = "close";
        } else {
            str2 = "open";
        }
        c474500IjALIZ.LJJII(str2, "wont_show_again");
        c474500IjALIZ.LJJII("send_gift_confirm", "show_reason");
        c474500IjALIZ.LJJII(Long.valueOf(C1086830eO9.LIZIZ), "poll_id");
        c474500IjALIZ.LJJII(str, "selection");
        c474500IjALIZ.LJJII(String.valueOf(j), "gift_id");
        c474500IjALIZ.LIZ();
    }

    public static void LJ(PollMessage pollMessage, DataChannel dataChannel, long j, EnumC1086920eOI enumC1086920eOI) {
        long j2;
        Long lValueOf;
        String str;
        if (pollMessage != null) {
            j2 = pollMessage.pollId;
        } else {
            j2 = 0;
        }
        LIZ = j2;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_poll_result_latency");
        if (pollMessage != null) {
            lValueOf = Long.valueOf(pollMessage.pollId);
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(lValueOf, "poll_id");
        c474500IjALIZ.LJJII(Long.valueOf(C158B.LIZ() - j), "latency");
        if (enumC1086920eOI == EnumC1086920eOI.GIFT) {
            str = "gift_poll";
        } else {
            str = "normal_poll";
        }
        c474500IjALIZ.LJJII(str, "poll_type");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LIZ();
    }
}
