package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QwN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C686530QwN extends C09AY implements InterfaceC1631620sYq<String, JSONObject, Map<String, String>, EnumC686550QwP> {
    public C686530QwN() {
        super(3);
    }

    @Override // X.InterfaceC1631620sYq
    public final EnumC686550QwP invoke(String str, JSONObject jSONObject, Map<String, String> map) {
        C670370QRf.LIZ.getClass();
        if (Intrinsics.LJFF(str, "like")) {
            return EnumC686550QwP.LIKE;
        }
        if (Intrinsics.LJFF(str, "like_cancel")) {
            return EnumC686550QwP.LIKE_CANCEL;
        }
        if (Intrinsics.LJFF(str, "favourite_video")) {
            return EnumC686550QwP.FAVORITE;
        }
        if (Intrinsics.LJFF(str, "cancel_favourite_video")) {
            return EnumC686550QwP.FAVORITE_CANCEL;
        }
        if (Intrinsics.LJFF(str, "click_comment_button")) {
            return EnumC686550QwP.COMMENT;
        }
        if (Intrinsics.LJFF(str, "follow")) {
            return EnumC686550QwP.FOLLOW;
        }
        if (Intrinsics.LJFF(str, "follow_cancel")) {
            return EnumC686550QwP.FOLLOW_CANCEL;
        }
        if (Intrinsics.LJFF(str, "search_result_show")) {
            return EnumC686550QwP.SHOW;
        }
        if (Intrinsics.LJFF(str, "search_result_click")) {
            return EnumC686550QwP.CLICK;
        }
        if (Intrinsics.LJFF(str, "tiktokec_stay_product_detail")) {
            return EnumC686550QwP.PRODUCT_SHOW;
        }
        if (Intrinsics.LJFF(str, "play_time")) {
            return EnumC686550QwP.PLAY_TIME;
        }
        if (Intrinsics.LJFF(str, "video_play")) {
            return EnumC686550QwP.VIDEO_PLAY;
        }
        if (Intrinsics.LJFF(str, "shoot")) {
            return EnumC686550QwP.SHOOT;
        }
        if (Intrinsics.LJFF(str, "feed_enter")) {
            return EnumC686550QwP.VIDEO_CLICK;
        }
        if (Intrinsics.LJFF(str, "search_result_show_video")) {
            return EnumC686550QwP.VIDEO_SHOW;
        }
        return null;
    }
}
