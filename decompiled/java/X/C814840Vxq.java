package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Vxq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C814840Vxq implements Serializable {
    public int activeClickValid;
    public int alertScene;
    public String authorId;
    public String challengeId;
    public int contentMultiLinesCollapse;
    public int contentMultiLinesExpand;
    public String contentPostDirection;
    public String contentPreDirection;
    public String customAction;
    public int enableRTL;
    public String extra_text;
    public String imExtra;
    public int imageShowStyle;
    public String inAppPushType;
    public boolean isBannerDeteled;
    public boolean is_notification_top;
    public String largeModeIconUrl;
    public transient String lastImageFailReason;
    public transient String lastLargeIconFailReason;
    public transient String leftFallbackResName;
    public String musicId;
    public String push_user_id;
    public String rawExtra;
    public transient String rightFallbackResName;
    public String roomId;
    public String socialExtra;
    public String soundId;
    public String soundUrl;
    public long stickTopOffset;
    public int stick_top;
    public String tagId;
    public String titlePostDirection;
    public String titlePreDirection;
    public String trackInfo;
    public boolean turn_screen_on;
    public boolean useAssetSound;
    public String userId;
    public int videoPlayIconFlag;
    public int visibility;
    public float volumeFactor = 1.0f;
    public int badgeCount = -1;
    public int redBadgeOnly = -1;
    public int floatWindow = -1;
    public int oppoFloatWindow = -2;
    public boolean user_system_style = true;
    public long float_window_show_time = 12000;
    public int oppo_push_style = 11;
    public int notificaitonPriority = 1;
    public boolean isZeroVibrate = true;
    public String bg_color = "";
    public boolean isGroupSummary = true;
    public int style = -1;
    public boolean allowBannerDelete = true;
    public ArrayList<String> pre_o_urls = new ArrayList<>();
    public String notificationChannelId = "";
    public int contentTemplateDirection = -1;
    public int titleTemplateDirection = -1;
    public int liveCircleStyle = 0;
    public String silentData = "";
    public String pushGroupId = "";
    public String replaceOUrl = "";
    public String replaceOUrlWithoutParams = "";
    public String subTitle = "";
    public ArrayList<String[]> actionList = new ArrayList<>();

    public int getPriority() {
        int i = this.notificaitonPriority;
        if (i > 2) {
            return 2;
        }
        if (i < -2) {
            return -2;
        }
        return i;
    }

    public String toJsonString() {
        return this.rawExtra;
    }

    public static C814840Vxq LIZ(String str) {
        boolean z;
        C814840Vxq c814840Vxq = new C814840Vxq();
        try {
            c814840Vxq.rawExtra = str;
            if (TextUtils.isEmpty(str)) {
                return c814840Vxq;
            }
            JSONObject jSONObject = new JSONObject(str);
            c814840Vxq.notificationChannelId = jSONObject.optString("notification_channel", "");
            c814840Vxq.soundUrl = jSONObject.optString("surl");
            c814840Vxq.soundId = null;
            c814840Vxq.badgeCount = jSONObject.optInt("badge", -1);
            c814840Vxq.customAction = jSONObject.optString("in_app_push");
            c814840Vxq.inAppPushType = jSONObject.optString("in_app_push_type");
            if (!TextUtils.isEmpty(c814840Vxq.soundUrl)) {
                c814840Vxq.soundId = C08HM.LIZJ(c814840Vxq.soundUrl);
            }
            c814840Vxq.volumeFactor = (float) jSONObject.optDouble("vfac", 1.0d);
            c814840Vxq.stickTopOffset = jSONObject.optLong("stof");
            if (jSONObject.optInt("sdef") == 1) {
                z = true;
            } else {
                z = false;
            }
            c814840Vxq.useAssetSound = z;
            c814840Vxq.redBadgeOnly = jSONObject.optInt("red_badge_only");
            c814840Vxq.largeModeIconUrl = jSONObject.optString("large_mode_icon");
            c814840Vxq.imageShowStyle = jSONObject.optInt("image_show_style", 0);
            c814840Vxq.visibility = jSONObject.optInt("visibility", 0);
            c814840Vxq.turn_screen_on = C814710Vxd.LJI(jSONObject, "turn_screen_on", false);
            c814840Vxq.user_system_style = C814710Vxd.LJI(jSONObject, "use_system_style", true);
            c814840Vxq.is_notification_top = C814710Vxd.LJI(jSONObject, "is_notification_top", false);
            c814840Vxq.stick_top = jSONObject.optInt("stick_top", 0);
            c814840Vxq.floatWindow = jSONObject.optInt("show_float_window", -1);
            c814840Vxq.oppoFloatWindow = jSONObject.optInt("show_float_window", -2);
            c814840Vxq.float_window_show_time = jSONObject.optLong("float_window_show_time", 12000L);
            c814840Vxq.oppo_push_style = jSONObject.optInt("oppo_push_style", 11);
            c814840Vxq.isZeroVibrate = C814710Vxd.LJI(jSONObject, "is_zero_vibrate", true);
            c814840Vxq.bg_color = jSONObject.optString("bg_color", "");
            c814840Vxq.style = jSONObject.optInt("notification_style", -1);
            c814840Vxq.isGroupSummary = C814710Vxd.LJI(jSONObject, "is_group_summary", true);
            c814840Vxq.pushGroupId = jSONObject.optString("custom_androidthread_group_code");
            String strOptString = jSONObject.optString("social_extra");
            if (!TextUtils.isEmpty(strOptString) && !strOptString.equalsIgnoreCase("null")) {
                c814840Vxq.socialExtra = strOptString;
                JSONObject jSONObject2 = new JSONObject(strOptString);
                c814840Vxq.replaceOUrl = jSONObject2.optString("replace_open_url");
                c814840Vxq.alertScene = jSONObject2.optInt("alert_scene", 0);
                c814840Vxq.replaceOUrlWithoutParams = jSONObject2.optString("replace_open_url_without_params");
                if (TextUtils.isEmpty(c814840Vxq.soundUrl)) {
                    c814840Vxq.soundUrl = jSONObject2.optString("sound_url");
                }
            }
            c814840Vxq.extra_text = jSONObject.optString("extra_text");
            c814840Vxq.authorId = jSONObject.optString("author_id");
            c814840Vxq.roomId = jSONObject.optString("room_id");
            c814840Vxq.userId = jSONObject.optString("user_id");
            c814840Vxq.musicId = jSONObject.optString("music_id");
            c814840Vxq.tagId = jSONObject.optString("tag_id");
            c814840Vxq.trackInfo = jSONObject.optString("track_info");
            c814840Vxq.challengeId = jSONObject.optString("challenge_id");
            c814840Vxq.enableRTL = jSONObject.optInt("enable_rtl");
            String strOptString2 = jSONObject.optString("starling_language_order");
            if (TextUtils.isEmpty(strOptString2)) {
                c814840Vxq.contentTemplateDirection = -1;
                c814840Vxq.titleTemplateDirection = -1;
            } else {
                JSONObject jSONObject3 = new JSONObject(strOptString2);
                String strOptString3 = jSONObject3.optString("content");
                if (!"LTR".equals(strOptString3)) {
                    if ("RTL".equals(strOptString3)) {
                        c814840Vxq.contentTemplateDirection = 1;
                    } else {
                        c814840Vxq.contentTemplateDirection = -1;
                    }
                } else {
                    c814840Vxq.contentTemplateDirection = 0;
                }
                String strOptString4 = jSONObject3.optString("title");
                if ("LTR".equals(strOptString4)) {
                    c814840Vxq.titleTemplateDirection = 0;
                } else if ("RTL".equals(strOptString4)) {
                    c814840Vxq.titleTemplateDirection = 1;
                } else {
                    c814840Vxq.titleTemplateDirection = -1;
                }
            }
            c814840Vxq.videoPlayIconFlag = jSONObject.optInt("video_play_icon_flag", 0);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("pre_o_urls");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                int length = jSONArrayOptJSONArray.length();
                c814840Vxq.pre_o_urls.clear();
                for (int i = 0; i < length; i++) {
                    String strOptString5 = jSONArrayOptJSONArray.optString(i);
                    if (!TextUtils.isEmpty(strOptString5)) {
                        c814840Vxq.pre_o_urls.add(0, strOptString5);
                    }
                }
            }
            c814840Vxq.push_user_id = jSONObject.optString("push_user_id");
            c814840Vxq.allowBannerDelete = C814710Vxd.LJI(jSONObject, "allow_banner_delete", true);
            c814840Vxq.notificaitonPriority = jSONObject.optInt("push_priority", 1);
            c814840Vxq.activeClickValid = jSONObject.optInt("active_click_valid", 0);
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("action_list");
            if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0) {
                int length2 = jSONArrayOptJSONArray2.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray2.optJSONObject(i2);
                    c814840Vxq.actionList.add(new String[]{jSONObjectOptJSONObject.optString("action_id"), jSONObjectOptJSONObject.optString("action_title"), jSONObjectOptJSONObject.optString("action_url"), String.valueOf(jSONObjectOptJSONObject.optInt("enable_input"))});
                }
            }
            c814840Vxq.silentData = jSONObject.optString("silent_data", "");
            c814840Vxq.subTitle = jSONObject.optString("subtitle", "");
            c814840Vxq.imExtra = jSONObject.optString("im_extra", "");
            c814840Vxq.contentMultiLinesCollapse = jSONObject.optInt("content_multi_line_collapse");
            c814840Vxq.contentMultiLinesExpand = jSONObject.optInt("content_multi_line_expand");
            int i3 = C2187451AjH.LIZ;
            c814840Vxq.liveCircleStyle = jSONObject.optInt("live_circle_style", 0);
            return c814840Vxq;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return c814840Vxq;
        }
    }
}
