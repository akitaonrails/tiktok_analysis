package X;

import android.content.Context;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.VideoTag;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.music.model.MusicOwnerInfo;
import com.ss.android.ugc.aweme.music.model.UncertMusicOwnerInfo;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0mUU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1398280mUU {
    public static String LJI(Aweme aweme) {
        if (aweme != null && AwemeExtKt.isMDPSquareType(aweme)) {
            int detailPageItemType = aweme.getDetailPageItemType();
            if (detailPageItemType == VideoTag.MDP_SQUARE_EFFECT.getVideoTag()) {
                return "effect";
            }
            if (detailPageItemType == VideoTag.MDP_SQUARE_TEMPLATE.getVideoTag()) {
                return "template";
            }
            if (detailPageItemType == VideoTag.MDP_SQUARE_MUSIC.getVideoTag()) {
                return "music";
            }
            return "";
        }
        return "";
    }

    public static void LIZLLL(String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "tt_mdp_page");
        c2344009Gk.LJIIIIZZ(Scene.SCENE_SERVICE, str);
        c2344009Gk.LJIIIIZZ("clip_id", str2);
        C20684815ws.LJIILLIIL("enter_work_with_artist", c2344009Gk.LIZ);
    }

    public static Pair LJFF(Context context, Music music) {
        String str;
        if (context != null && music != null) {
            int iFollowUpCount = music.followUpCount();
            String quantityString = context.getResources().getQuantityString(2131755220, iFollowUpCount, C1176850gjL.LIZ(1, Integer.valueOf(iFollowUpCount), CardStruct.IStatusCode.DEFAULT).toString());
            if (music.isMdpSquareCollected()) {
                quantityString = context.getString(2131848620);
                str = "favorite";
            } else if (C123100dR.LIZ(music.mdpSquareRecommendTag())) {
                if (music.mdpSquareRecommendTag().equals("hot")) {
                    str = "high_follow_up";
                } else {
                    str = "up_trends";
                }
            } else {
                str = "other";
            }
            return new Pair(str, quantityString);
        }
        return new Pair("", "");
    }

    public static void LJII(MusicDetail musicDetail, String str) {
        String mid;
        Music music;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "single_song");
        c2344009Gk.LJIIIIZZ("activity_page", "animation");
        c2344009Gk.LJIIIIZZ("activity_id", str);
        if (musicDetail == null || (music = musicDetail.music) == null || (mid = music.getMid()) == null) {
            mid = "";
        }
        c2344009Gk.LJIIIIZZ("clip_id", mid);
        c2344009Gk.LJIIIIZZ("click_position", "celebrate");
        C20684815ws.LJIILLIIL("mdp_easter_egg_click", c2344009Gk.LIZ);
    }

    public static void LJIIL(long j, String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_method", "click");
        c2344009Gk.LIZLLL(System.currentTimeMillis() - j, "duration");
        c2344009Gk.LJIIIIZZ("creation_id", str);
        C20684815ws.LJIILLIIL("video_shoot_page_music_load_time", c2344009Gk.LIZ);
    }

    public static void LJIJ(String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "tt_mdp_page");
        c2344009Gk.LJIIIIZZ(Scene.SCENE_SERVICE, str);
        c2344009Gk.LJIIIIZZ("clip_id", str2);
        C20684815ws.LJIILLIIL("work_with_artist_show", c2344009Gk.LIZ);
    }

    public static void LIZ(int i, String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "single_song");
        c2344009Gk.LJIIIIZZ("music_id", str);
        c2344009Gk.LJIIIIZZ("group_id", str2);
        c2344009Gk.LIZJ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        C20684815ws.LJIILLIIL("click_feature_video_button", c2344009Gk.LIZ);
    }

    public static void LIZJ(String str, String str2, ConcurrentHashMap concurrentHashMap) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("music_id", str);
        c2344009Gk.LJIIIIZZ("group_id", str2);
        if (concurrentHashMap != null) {
            for (Map.Entry entry : concurrentHashMap.entrySet()) {
                c2344009Gk.LJ(entry.getValue(), (String) entry.getKey());
            }
        }
        C20684815ws.LJIILLIIL("music_campaign_entry_click", c2344009Gk.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIIIZZ(java.lang.String r6, java.lang.String r7, com.ss.android.ugc.aweme.music.model.Music r8) {
        /*
            com.ss.android.ugc.aweme.music.model.MusicReleaseInfo r0 = r8.getMusicReleaseInfo()
            if (r0 == 0) goto L4a
            boolean r0 = r0.isNewReleaseSong()
            r5 = 1
            if (r0 != r5) goto L4a
        Ld:
            X.09Gk r4 = new X.09Gk
            r4.<init>()
            java.lang.String r0 = "enter_method"
            r4.LJIIIIZZ(r0, r6)
            java.lang.String r1 = "enter_from"
            java.lang.String r0 = "single_song"
            r4.LJIIIIZZ(r1, r0)
            java.lang.String r1 = r8.getMid()
            java.lang.String r0 = "music_id"
            r4.LJIIIIZZ(r0, r1)
            java.lang.String r0 = "process_id"
            r4.LJIIIIZZ(r0, r7)
            java.lang.String r3 = "1"
            java.lang.String r2 = "0"
            if (r5 == 0) goto L48
            r1 = r3
        L33:
            java.lang.String r0 = "music_new_flag"
            r4.LJIIIIZZ(r0, r1)
            if (r5 != 0) goto L3b
            r3 = r2
        L3b:
            java.lang.String r0 = "music_new_show"
            r4.LJIIIIZZ(r0, r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r4.LIZ
            java.lang.String r0 = "enter_music_detail"
            X.C20684815ws.LJIILLIIL(r0, r1)
            return
        L48:
            r1 = r2
            goto L33
        L4a:
            r5 = 0
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1398280mUU.LJIIIIZZ(java.lang.String, java.lang.String, com.ss.android.ugc.aweme.music.model.Music):void");
    }

    public static void LJIILJJIL(String str, String str2, String str3) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        c2344009Gk.LJIIIIZZ("enter_method", str3);
        c2344009Gk.LJIIIIZZ("music_id", str);
        C20684815ws.LJIILLIIL("trending_create_with_show", c2344009Gk.LIZ);
    }

    public static void LJIILLIIL(String str, String str2, ConcurrentHashMap concurrentHashMap) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("music_id", str);
        c2344009Gk.LJIIIIZZ("group_id", str2);
        if (concurrentHashMap != null) {
            for (Map.Entry entry : concurrentHashMap.entrySet()) {
                c2344009Gk.LJ(entry.getValue(), (String) entry.getKey());
            }
        }
        C20684815ws.LJIILLIIL("music_campaign_entry_show", c2344009Gk.LIZ);
    }

    public static void LIZIZ(String str, String str2, String str3, String str4) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_method", str3);
        c2344009Gk.LJIIIIZZ("music_id", str);
        c2344009Gk.LJIIIIZZ("group_id", str2);
        c2344009Gk.LIZJ(1, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c2344009Gk.LJIIIIZZ("button_name", str4);
        C20684815ws.LJIILLIIL("click_feature_video_edit_sheet", c2344009Gk.LIZ);
    }

    public static void LJIIIZ(String str, List list, boolean z, Music music) {
        String str2;
        int i;
        Integer followStatus;
        if (list != null) {
            int size = list.size();
            MusicOwnerInfo musicOwnerInfo = (MusicOwnerInfo) C13LP.LJJJLL(list);
            String str3 = "";
            int i2 = 1;
            if (musicOwnerInfo == null || !z || size != 1 || (musicOwnerInfo instanceof UncertMusicOwnerInfo) || !C630970Oox.LIZJ(musicOwnerInfo) || (followStatus = musicOwnerInfo.getFollowStatus()) == null || followStatus.intValue() != 0) {
                str2 = "";
            } else {
                str2 = "1";
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof UncertMusicOwnerInfo) {
                    arrayList.add(obj);
                }
            }
            int size2 = arrayList.size();
            int i3 = size - size2;
            if (i3 > 0) {
                str3 = "musician";
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "single_song");
            c2344009Gk.LIZJ(i3, "musician_num");
            c2344009Gk.LIZJ(size2, "uncertified_musician_num");
            c2344009Gk.LIZJ(size, "total_musician_num");
            c2344009Gk.LJIIIIZZ("follow_button", str2);
            c2344009Gk.LJIIIIZZ("musician_type", str3);
            c2344009Gk.LJIIIIZZ("show_position", str);
            if (music != null && music.isPgc()) {
                i = 1;
            } else {
                i = 0;
            }
            c2344009Gk.LIZJ(i, "is_pgc");
            if (music == null || (!music.isPgc() && !C630310Ont.LIZIZ(music))) {
                i2 = 0;
            }
            c2344009Gk.LIZJ(i2, "is_pgc_style");
            C20684815ws.LJIILLIIL("musician_name_show", c2344009Gk.LIZ);
        }
    }

    public static void LJIIJ(int i, int i2, String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("music_id", str);
        c2344009Gk.LJIIIIZZ("group_id", str2);
        c2344009Gk.LIZJ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c2344009Gk.LIZJ(i2, "is_self");
        C20684815ws.LJIILLIIL("mdp_video_show", c2344009Gk.LIZ);
    }

    public static void LJIIZILJ(String str, String str2, String str3, Map map) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "single_song");
        c2344009Gk.LJIIIIZZ("music_id", str);
        c2344009Gk.LJIIIIZZ("process_id", str2);
        if (map != null) {
            c2344009Gk.LJII(map);
        }
        c2344009Gk.LJFF("group_id", str3);
        C20684815ws.LJIILLIIL("show_music_feedback_entrance", c2344009Gk.LIZ);
    }

    public static void LJ(String str, String str2, String str3, boolean z, boolean z2) {
        String str4;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "single_song");
        c2344009Gk.LJIIIIZZ("enter_method", "music_feedback");
        c2344009Gk.LJIIIIZZ("music_id", str);
        c2344009Gk.LJIIIIZZ("from_music_id", str2);
        c2344009Gk.LJIIIIZZ("process_id", str3);
        String str5 = "1";
        c2344009Gk.LJIIIIZZ("ugc_to_pgc_meta", "1");
        if (z) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("music_new_flag", str4);
        if (!z2) {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("music_new_show", str5);
        C20684815ws.LJIILLIIL("enter_music_detail", c2344009Gk.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIILIIL(android.content.Context r7, com.ss.android.ugc.aweme.feed.model.Aweme r8, int r9, java.util.List r10, java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1398280mUU.LJIILIIL(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, int, java.util.List, java.lang.String):void");
    }

    public static void LJIILL(long j, String str, String str2, String str3, String str4) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "single_song");
        c2344009Gk.LJIIIIZZ("enter_method", "click_play_music");
        c2344009Gk.LJIIIIZZ("music_id", str);
        c2344009Gk.LJIIIIZZ("process_id", str2);
        c2344009Gk.LJIIIIZZ("creation_id", str3);
        c2344009Gk.LIZLLL(j, "duration");
        c2344009Gk.LJIIIIZZ("shoot_way", "more_sounds");
        c2344009Gk.LJIIIIZZ("group_id", str4);
        C20684815ws.LJIILLIIL("shoot_initiate_duration", c2344009Gk.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIJJI(boolean r7, com.ss.android.ugc.aweme.music.model.MusicAwemeList r8, com.ss.android.ugc.aweme.music.model.Music r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.Integer r15, boolean r16) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1398280mUU.LJIIJJI(boolean, com.ss.android.ugc.aweme.music.model.MusicAwemeList, com.ss.android.ugc.aweme.music.model.Music, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIJI(android.content.Context r12, com.ss.android.ugc.aweme.feed.model.Aweme r13, java.lang.String r14, java.lang.String r15, int r16, int r17, int r18, com.ss.android.ugc.aweme.music.model.MusicAwemeList r19, X.InterfaceC665370Q7z r20, int r21) {
        /*
            Method dump skipped, instruction units count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1398280mUU.LJIJI(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, java.lang.String, int, int, int, com.ss.android.ugc.aweme.music.model.MusicAwemeList, X.0Q7z, int):void");
    }
}
