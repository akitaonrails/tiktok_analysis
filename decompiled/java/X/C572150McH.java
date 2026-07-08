package X;

import com.ss.android.ugc.aweme.creative.model.edit.Text2ImageModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0McH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C572150McH {
    public static final C572150McH LIZ = new C572150McH();

    public static EnumC572140McG LIZ(String str) {
        boolean z;
        if (str != null && !a0.LJJJIL(str)) {
            if (!a0.LJJIIZI(str, "#AskTikTok", false) && !a0.LJJIIZI(str, "#TikTokDoYourMagic", false)) {
                z = false;
            } else {
                z = true;
            }
            if (a0.LJLIIIL(u.LJJIFFI(u.LJJIFFI(u.LJJIFFI(str, "#AskTikTok #TikTokDoYourMagic", "", false), "#AskTikTok", "", false), "#TikTokDoYourMagic", "", false)).toString().length() > 0) {
                if (z) {
                    return EnumC572140McG.TEXT_AND_HASHTAG;
                }
            } else if (z) {
                return EnumC572140McG.HASHTAG;
            }
            return EnumC572140McG.TEXT;
        }
        return EnumC572140McG.TEXT;
    }

    public static void LIZIZ(VideoPublishEditModel videoPublishEditModel, EnumC572120McE enumC572120McE, EnumC572140McG enumC572140McG) {
        String str;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("curr_crt_path_page", "video_post_page");
        c0lab.LJ("action_type", "trigger");
        if (C572130McF.LIZ[enumC572120McE.ordinal()] == 1) {
            c0lab.LJ("trigger", "enter_publish_page");
            Text2ImageModel text2ImageModel = videoPublishEditModel.creativeModel.text2ImageModel;
            c0lab.LJ("fill_reason", C572160McI.LIZJ(text2ImageModel.searchQuery, text2ImageModel.fromCommentId));
            c0lab.LJ("fill_target", "desc");
            int i = C572130McF.LIZIZ[enumC572140McG.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        str = "text_and_hashtag";
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    str = "hashtag";
                }
            } else {
                str = "text";
            }
            c0lab.LJ("fill_content", str);
            c0lab.LJ("fill_type", "silent_fill");
            C20684815ws.LJIILLIIL("ttinter_text_auto_fill_stage", c0lab.LIZ);
            if (enumC572140McG != EnumC572140McG.TEXT) {
                for (String str2 : a0.LJJLIIIJILLIZJL("#AskTikTok #TikTokDoYourMagic", new String[]{" "}, 0, 6)) {
                    C0LAB c0lab2 = new C0LAB();
                    c0lab2.LJ("tag_content", a0.LJJJJZ("#", str2));
                    c0lab2.LJ("tag_source", "auto_fill");
                    C580270MpN.LIZJ(videoPublishEditModel, c0lab2, "video_post_page");
                    C20684815ws.LJIILLIIL("add_tag", c0lab2.LIZ);
                }
                return;
            }
            return;
        }
        throw new C1954807lC();
    }
}
