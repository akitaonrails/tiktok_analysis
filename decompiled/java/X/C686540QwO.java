package X;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QwO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C686540QwO extends C09AY implements InterfaceC1631620sYq<String, JSONObject, Map<String, String>, EnumC686550QwP> {
    public C686540QwO() {
        super(3);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC1631620sYq
    public final EnumC686550QwP invoke(String str, JSONObject jSONObject, Map<String, String> map) {
        String str2 = str;
        C670360QRe.LIZ.getClass();
        switch (str2.hashCode()) {
            case -1877516040:
                if (!str2.equals("play_time")) {
                    return null;
                }
                return EnumC686550QwP.PLAY_TIME;
            case -1787830840:
                if (!str2.equals("search_result_show")) {
                    return null;
                }
                return EnumC686550QwP.SHOW;
            case -1617968008:
                if (!str2.equals("video_play")) {
                    return null;
                }
                return EnumC686550QwP.VIDEO_PLAY;
            case -1330248535:
                if (!str2.equals("click_comment_button")) {
                    return null;
                }
                return EnumC686550QwP.COMMENT;
            case -1268958287:
                if (!str2.equals("follow")) {
                    return null;
                }
                return EnumC686550QwP.FOLLOW;
            case -405326491:
                if (!str2.equals("favourite_video")) {
                    return null;
                }
                return EnumC686550QwP.FAVORITE;
            case 3321751:
                if (!str2.equals("like")) {
                    return null;
                }
                return EnumC686550QwP.LIKE;
            case 109413407:
                if (!str2.equals("shoot")) {
                    return null;
                }
                return EnumC686550QwP.SHOOT;
            case 239764896:
                if (!str2.equals("cancel_favourite_video")) {
                    return null;
                }
                return EnumC686550QwP.FAVORITE_CANCEL;
            case 397155357:
                if (!str2.equals("search_result_click")) {
                    return null;
                }
                return EnumC686550QwP.CLICK;
            case 552900296:
                if (!str2.equals("follow_cancel")) {
                    return null;
                }
                return EnumC686550QwP.FOLLOW_CANCEL;
            case 568860919:
                if (!str2.equals("feed_enter")) {
                    return null;
                }
                return EnumC686550QwP.VIDEO_CLICK;
            case 1190532130:
                if (!str2.equals("like_cancel")) {
                    return null;
                }
                return EnumC686550QwP.LIKE_CANCEL;
            case 1578594464:
                if (!str2.equals("tiktokec_stay_product_detail")) {
                    return null;
                }
                return EnumC686550QwP.PRODUCT_SHOW;
            default:
                return null;
        }
    }
}
