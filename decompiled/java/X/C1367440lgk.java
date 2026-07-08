package X;

import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: renamed from: X.0lgk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1367440lgk {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String LIZ(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1890252483:
                    if (str.equals("sticker")) {
                        SettingsManager.LIZLLL().getClass();
                        if (SettingsManager.LIZ("change_sticker_sharecontent_type_to_effect_killswitch", false)) {
                            return "sticker";
                        }
                        return "effect";
                    }
                    break;
                case -1618365356:
                    if (str.equals("video_card")) {
                        return "video";
                    }
                    break;
                case -1443288204:
                    if (str.equals("image_card")) {
                        return "video";
                    }
                    break;
                case -1354494072:
                    if (str.equals("aweme_card")) {
                        return "video";
                    }
                    break;
                case -934521517:
                    if (str.equals("repost")) {
                        return "repost";
                    }
                    break;
                case -173657445:
                    if (str.equals("mix_videos")) {
                        return "playlist";
                    }
                    break;
                case -84391837:
                    if (str.equals("point_of_interest")) {
                        return "poi";
                    }
                    break;
                case 117588:
                    if (str.equals("web")) {
                        return "webview";
                    }
                    break;
                case 3322092:
                    if (str.equals("live")) {
                        return "live";
                    }
                    break;
                case 3599307:
                    if (str.equals("user")) {
                        return "profile";
                    }
                    break;
                case 93227207:
                    if (str.equals("aweme")) {
                        return "video";
                    }
                    break;
                case 103900924:
                    if (str.equals("minis")) {
                        return "minis";
                    }
                    break;
                case 104263205:
                    if (str.equals("music")) {
                        return "music";
                    }
                    break;
                case 950398559:
                    if (str.equals("comment")) {
                        return "comment";
                    }
                    break;
                case 972568762:
                    if (str.equals("aweme_photo")) {
                        return "video";
                    }
                    break;
                case 1200629127:
                    if (str.equals("live_event")) {
                        return "live";
                    }
                    break;
                case 1402633315:
                    if (str.equals("challenge")) {
                        return "challenge";
                    }
                    break;
                case 1824166378:
                    if (str.equals("story_highlight")) {
                        return "story_highlight";
                    }
                    break;
            }
        }
        return "other";
    }

    public static String LIZIZ(String str) {
        if (TextUtils.equals(str, "aweme")) {
            return "video";
        }
        if (TextUtils.equals(str, "aweme_photo")) {
            return "photo_mode";
        }
        if (TextUtils.equals(str, "pic")) {
            return "pic";
        }
        if (TextUtils.equals(str, "gif")) {
            return "gif";
        }
        if (TextUtils.equals(str, "text")) {
            return "text";
        }
        if (TextUtils.equals(str, "music")) {
            return "music_card";
        }
        if (TextUtils.equals(str, "challenge")) {
            return "tag_card";
        }
        if (TextUtils.equals(str, "ranking")) {
            return "hot_search_card";
        }
        if (TextUtils.equals(str, "game")) {
            return "game";
        }
        if (TextUtils.equals(str, "user")) {
            return "profile";
        }
        if (TextUtils.equals(str, "live")) {
            return "live";
        }
        if (TextUtils.equals(str, "web")) {
            return "webview";
        }
        if (TextUtils.equals(str, "qna")) {
            return "question_detail";
        }
        if (TextUtils.equals(str, "product")) {
            return "product";
        }
        if (TextUtils.equals(str, "aigc_avatar")) {
            return "ai_avatar";
        }
        if (TextUtils.equals(str, "social_avatar")) {
            return "aimoji";
        }
        if (TextUtils.equals(str, "dynamic_card")) {
            return "dynamic_card";
        }
        return "";
    }
}
