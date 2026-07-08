package X;

import com.bytedance.android.livesdk.userservice.UserService;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.PreviewCardCommentBox;
import com.ss.android.ugc.aweme.follow.presenter.RoomStruct;

/* JADX INFO: renamed from: X.0TKj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C745030TKj {
    public static final C745030TKj LIZ = new C745030TKj();

    public static void LIZ(C1ACA c1aca, boolean z, Integer num, Integer num2) {
        Long lValueOf;
        Long lValueOf2;
        Long lValueOf3;
        String str;
        long j;
        String str2;
        LiveRoomStruct liveRoomStruct;
        String str3;
        String str4;
        LiveRoomStruct liveRoomStruct2;
        LiveRoomStruct liveRoomStruct3;
        LiveRoomStruct liveRoomStruct4;
        C2344009Gk c2344009Gk = new C2344009Gk();
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        String str5 = null;
        if (interfaceC500940JkiUser != null) {
            lValueOf = Long.valueOf(interfaceC500940JkiUser.getCurrentUserId());
        } else {
            lValueOf = null;
        }
        c2344009Gk.LJIIIIZZ("user_id", String.valueOf(lValueOf));
        if (c1aca != null && (liveRoomStruct4 = c1aca.LIZJ) != null) {
            lValueOf2 = Long.valueOf(liveRoomStruct4.ownerUserId);
        } else {
            lValueOf2 = null;
        }
        c2344009Gk.LJIIIIZZ("anchor_id", String.valueOf(lValueOf2));
        if (c1aca != null && (liveRoomStruct3 = c1aca.LIZJ) != null) {
            lValueOf3 = Long.valueOf(liveRoomStruct3.id);
        } else {
            lValueOf3 = null;
        }
        c2344009Gk.LJIIIIZZ("room_id", String.valueOf(lValueOf3));
        if (z) {
            str = "show";
        } else {
            str = "click";
        }
        c2344009Gk.LJIIIIZZ("action_type", str);
        if (c1aca != null && (liveRoomStruct2 = c1aca.LIZJ) != null) {
            j = liveRoomStruct2.watchDayCntLayer;
        } else {
            j = 0;
        }
        c2344009Gk.LIZLLL(j, "user_activity");
        if (C745010TKh.LIZ()) {
            str2 = "ai_summary_profile_and_comment_bar";
        } else {
            str2 = "realtime_comment_bar";
        }
        c2344009Gk.LJIIIIZZ("msg_type", str2);
        if (num != null) {
            num.intValue();
            if (num.intValue() == 25) {
                str4 = "realtime_comment";
            } else if (num.intValue() != 26 && num.intValue() != 27) {
                if (num.intValue() == 28) {
                    str4 = "ai_summary_profile";
                } else {
                    str4 = null;
                }
            } else {
                str4 = "comment_bar";
            }
            c2344009Gk.LJFF("click_pos", str4);
        }
        if (c1aca != null && (liveRoomStruct = c1aca.LIZJ) != null) {
            c2344009Gk.LJFF("live_type", RoomStruct.getStreamType(liveRoomStruct).logStreamingType);
            PreviewCardCommentBox previewCardCommentBox = liveRoomStruct.previewCardCommentBox;
            if (previewCardCommentBox != null) {
                str5 = previewCardCommentBox.starlingKey;
            }
            String str6 = "";
            if (str5 == null) {
                str5 = "";
            }
            c2344009Gk.LJFF("comment_box_copy_starling_key", str5);
            PreviewCardCommentBox previewCardCommentBox2 = liveRoomStruct.previewCardCommentBox;
            if (previewCardCommentBox2 != null && (str3 = previewCardCommentBox2.content) != null) {
                str6 = str3;
            }
            c2344009Gk.LJFF("comment_box_copy", str6);
        }
        if (num2 != null) {
            c2344009Gk.LIZJ(Math.min(num2.intValue(), 2), "realtime_comment_num");
        }
        C20684815ws.LJIILLIIL("livesdk_cmt_interact_msg_preview_info", c2344009Gk.LIZ);
    }
}
