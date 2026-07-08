package X;

import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.choosemusic.utils.showlistener.MusicShowOverChecker;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.MusicTag;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.edit.IEditVideoInfoService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.HashMap;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15IK, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15IK {
    public static String LIZ = null;
    public static String LIZIZ = null;
    public static String LIZJ = null;
    public static int LIZLLL = -1;
    public static String LJ;
    public static boolean LJFF;
    public static boolean LJI;
    public static boolean LJII;
    public static String LJIIIIZZ;
    public static String LJIIIZ;
    public static String LJIIJ;
    public static String LJIIJJI;
    public static int LJIIL;
    public static boolean LJIILIIL;
    public static String LJIILJJIL;
    public static String LJIILL;
    public static boolean LJIILLIIL;
    public static C11FA LJIIZILJ;
    public static C15IM LJIJ;

    public static Boolean LJ() {
        String str = LJIILJJIL;
        return (str == null || str.isEmpty()) ? Boolean.FALSE : Boolean.TRUE;
    }

    public static boolean LIZLLL() {
        return ((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LJIIJ();
    }

    public static String LIZIZ(String str) {
        if (str == null) {
            return "";
        }
        if (!str.equals("video_edit_page")) {
            if (!str.equals("video_shoot_page")) {
                return "";
            }
            return "shoot_change_music";
        }
        return "edit_change_music";
    }

    public static String LIZJ(C11FA c11fa) {
        switch (C11F9.LIZ[c11fa.ordinal()]) {
            case 1:
            case 2:
                return "popular_song";
            case 3:
                return "favourite_song";
            case 4:
                return "your_sounds";
            case 5:
                return "more_song";
            case 6:
                return "unlimited";
            default:
                return "";
        }
    }

    public static void LJFF(String str) {
        C15IM c15im = LJIJ;
        if (c15im == null) {
            return;
        }
        if (!Intrinsics.LJFF(c15im.LIZ, str)) {
            c15im.LIZIZ = -1L;
            c15im.LIZJ = 0L;
        } else {
            c15im.LIZJ = System.currentTimeMillis() - c15im.LIZIZ;
        }
    }

    public static void LJI(long j) {
        HashMap map = new HashMap();
        map.put("tab_name", "your_sounds");
        map.put("read_duration", String.valueOf(j));
        C20684815ws.LJIJ("local_music_read_duration", C117000cS.LIZ(map));
    }

    public static void LJIJI(String str) {
        LIZ = str;
        LIZIZ(str);
    }

    public static void LIZ(MusicModel musicModel, C2344009Gk c2344009Gk) {
        if (C1402480mbG.LIZ() && musicModel.getMusicTags() != null && musicModel.getMusicTags().size() > 0 && !TextUtils.isEmpty(((MusicTag) ListProtector.get(musicModel.getMusicTags(), 0)).getTagTitle())) {
            c2344009Gk.LJFF("tag", ((MusicTag) ListProtector.get(musicModel.getMusicTags(), 0)).getTagTitle());
        }
    }

    public static void LJIIZILJ(C11FA c11fa, boolean z) {
        String str;
        int i;
        String str2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("tab_name", LIZJ(c11fa));
        c2344009Gk.LJIIIIZZ("shoot_tab_name", LIZIZ);
        c2344009Gk.LJIIIIZZ("previous_page", LIZ);
        c2344009Gk.LJIIIIZZ("enter_from", LIZ);
        c2344009Gk.LJIIIIZZ("creation_id", LJ);
        if (LJIILLIIL) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("carousel_open", str);
        if (LJI && !LJII) {
            i = 1;
        } else {
            i = 0;
        }
        c2344009Gk.LIZJ(i, "is_multi_music");
        if (LJ().booleanValue()) {
            c2344009Gk.LJIIIIZZ("from_location", LJIILJJIL);
            c2344009Gk.LJIIIIZZ("type", LJIILL);
            c2344009Gk.LIZJ(1, "is_editor_pro");
        }
        if (LIZLLL()) {
            c2344009Gk.LJFF("is_commercial", "1");
        }
        if (c11fa == C11FA.TAB_TYPE_LOCAL) {
            String str3 = "on";
            if (z) {
                str2 = "on";
            } else {
                str2 = "off";
            }
            c2344009Gk.LJFF("system_music_authorization_status", str2);
            if (!z) {
                str3 = "off";
            }
            c2344009Gk.LJFF("system_photo_authorization_status", str3);
        }
        C20684815ws.LJIILLIIL("enter_music_tab", c2344009Gk.LIZ);
    }

    public static void LJIIJ(C15HO c15ho, MusicModel musicModel, boolean z) {
        String str;
        boolean z2;
        String str2;
        String imprId;
        if (c15ho != null && musicModel != null && !musicModel.isLocalMusic() && LIZLLL != -1) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            String str3 = c15ho.LIZIZ;
            int eventPosition = LIZLLL;
            MusicModel.MusicItemType musicItemType = musicModel.getMusicItemType();
            MusicModel.MusicItemType musicItemType2 = MusicModel.MusicItemType.RECOMMENDED_FAV_MUSIC;
            if (musicItemType == musicItemType2) {
                eventPosition = musicModel.getEventPosition();
                str3 = "favorite_recommend";
            }
            if (musicModel.getEventPosition() != -1) {
                eventPosition = musicModel.getEventPosition();
            }
            c2344009Gk.LJIIIIZZ("enter_from", c15ho.LIZ);
            c2344009Gk.LJIIIIZZ("music_id", musicModel.getMusicId());
            c2344009Gk.LJIIIIZZ("category_name", str3);
            c2344009Gk.LJIIIIZZ("enter_method", c15ho.LIZJ);
            c2344009Gk.LJIIIIZZ("previous_page", c15ho.LIZLLL);
            c2344009Gk.LIZJ(eventPosition, "order");
            c2344009Gk.LIZLLL(c15ho.LJIIJJI, "max_shoot_time");
            c2344009Gk.LJFF("creation_id", LJ);
            if (!TextUtils.isEmpty(c15ho.LJI)) {
                c2344009Gk.LJFF("tag_id", c15ho.LJI);
            }
            if (!TextUtils.isEmpty(c15ho.LJFF)) {
                c2344009Gk.LJFF("prop_id", c15ho.LJFF);
            }
            LIZ(musicModel, c2344009Gk);
            if (!TextUtils.isEmpty(c15ho.LJ)) {
                c2344009Gk.LJFF("category_id", c15ho.LJ);
            }
            LogPbBean logPbBean = c15ho.LJIIIIZZ;
            if (logPbBean != null) {
                c2344009Gk.LJ(logPbBean, "log_pb");
                if (!TextUtils.isEmpty(c15ho.LJIIIIZZ.getImprId())) {
                    imprId = c15ho.LJIIIIZZ.getImprId();
                } else {
                    imprId = "";
                }
                c2344009Gk.LJFF("impr_id", imprId);
            }
            if (musicModel.getLogPb() != null) {
                c2344009Gk.LJFF("music_request_id", musicModel.getLogPb().getImprId());
            }
            if (LJ().booleanValue()) {
                c2344009Gk.LJIIIIZZ("from_location", LJIILJJIL);
                c2344009Gk.LJIIIIZZ("type", LJIILL);
                c2344009Gk.LIZJ(1, "is_editor_pro");
            }
            c2344009Gk.LJII(new C15M8().LJFF("is_commercial", "commercial_music_suggestion_id"));
            c2344009Gk.LIZJ(eventPosition, "commercial_music_order");
            c2344009Gk.LJFF("music_name", musicModel.getName());
            if (musicModel.getMusicItemType() == musicItemType2) {
                c2344009Gk.LJFF("music_from", "favorite_recommend");
            }
            C15MA c15ma = C15MA.LL;
            if (C15MA.LIZLLL()) {
                c2344009Gk.LJFF("enter_from", "promote");
            }
            float fLIZ = C1485020okO.LIZ(musicModel.getMusicVolumeInfo());
            if (C1485020okO.LIZLLL(Float.valueOf(fLIZ))) {
                c2344009Gk.LIZIZ(fLIZ, "bgm_volume_difference_with_feed_db");
            }
            if (!TextUtils.isEmpty(c15ho.LJIILIIL)) {
                c2344009Gk.LJFF("tab_name", c15ho.LJIILIIL);
            }
            if (!TextUtils.isEmpty(c15ho.LJIILLIIL)) {
                c2344009Gk.LJFF("page_name", c15ho.LJIILLIIL);
            }
            String str4 = "1";
            if (LJFF && C15IR.LIZ(musicModel.getMusic())) {
                c2344009Gk.LJFF("has_lyric", "1");
            }
            if (!musicModel.isOffline()) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009Gk.LJFF("is_available", str);
            if (!musicModel.isSimilarMusic()) {
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009Gk.LJFF("is_offline_similar_added", str4);
            if (musicModel.getMusic() != null && !TextUtils.isEmpty(musicModel.getMusic().getPromoId())) {
                c2344009Gk.LJFF("promo_id", musicModel.getMusic().getPromoId());
            }
            if (TextUtils.equals(c15ho.LIZ, "search_music")) {
                if (musicModel.getCardType() == MusicModel.CardType.AWESearchMusicCardMusicWithVideo) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (Boolean.valueOf(z2).booleanValue()) {
                    str2 = "music_with_video";
                } else {
                    str2 = "music";
                }
                c2344009Gk.LJFF("search_keyword", LIZJ);
                c2344009Gk.LJFF("log_pb", GsonProtectorUtils.toJson(new Gson(), musicModel.getLogPb()));
                c2344009Gk.LJFF("search_id", musicModel.getSearchId());
                c2344009Gk.LIZLLL(musicModel.getId(), "search_result_id");
                c2344009Gk.LIZJ(LIZLLL, "order");
                c2344009Gk.LJFF("token_type", str2);
                C20684815ws.LJIJ("play_music", C117000cS.LIZ(c2344009Gk.LIZ));
                return;
            }
            c2344009Gk.LIZJ(((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJIIIZ(), "music_rec_type");
            C20684815ws.LJIILLIIL("play_music", c2344009Gk.LIZ);
            return;
        }
        if (!musicModel.isLocalMusic()) {
            return;
        }
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        if (c15ho != null && c15ho.LIZIZ.equals("device_upload")) {
            c2344009Gk2.LJIIIIZZ("creation_id", LJ);
            c2344009Gk2.LJFF("shoot_way", LJIIJJI);
            c2344009Gk2.LIZJ(z ? 1 : 0, "is_selected");
            String str5 = c15ho.LIZLLL;
            if (str5 != null && str5.contains("shoot")) {
                c2344009Gk2.LJFF("enter_from", "shoot_page_upload_song");
            } else {
                String str6 = c15ho.LIZLLL;
                if (str6 != null && str6.contains("edit")) {
                    c2344009Gk2.LJFF("enter_from", "edit_page_upload_song");
                } else {
                    c2344009Gk2.LJFF("enter_from", c15ho.LIZ);
                }
            }
            C20684815ws.LJIILLIIL("click_local_sound_detail", c2344009Gk2.LIZ);
            return;
        }
        c2344009Gk2.LJIIIIZZ("creation_id", LJ);
        c2344009Gk2.LJIIIIZZ("enter_from", c15ho.LIZ);
        c2344009Gk2.LJIIIIZZ("shoot_way", LJIIJJI);
        c2344009Gk2.LJIIIIZZ("fake_music_id", musicModel.getMusicId());
        c2344009Gk2.LJIIIIZZ("music_name", musicModel.getName());
        c2344009Gk2.LJFF("tab_name", "your_sounds");
        if (musicModel.getMusicType() == 0) {
            c2344009Gk2.LJFF("category_name", "device_upload");
        } else if (musicModel.getMusicType() == 3) {
            c2344009Gk2.LJFF("category_name", "video_upload");
        } else {
            c2344009Gk2.LJFF("category_name", "upload");
        }
        float fLIZ2 = C1485020okO.LIZ(musicModel.getMusicVolumeInfo());
        if (C1485020okO.LIZLLL(Float.valueOf(fLIZ2))) {
            c2344009Gk2.LIZIZ(fLIZ2, "bgm_volume_difference_with_feed_db");
        }
        C20684815ws.LJIILLIIL("play_music", c2344009Gk2.LIZ);
    }

    public static void LJIIIIZZ(C15HO c15ho, String str, boolean z, String str2) {
        String str3;
        String imprId;
        if (c15ho != null) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", c15ho.LIZ);
            c2344009Gk.LJIIIIZZ("music_id", str);
            c2344009Gk.LJIIIIZZ("category_name", c15ho.LIZIZ);
            c2344009Gk.LJIIIIZZ("creation_id", LJ);
            if (z) {
                str3 = "click_banner";
            } else {
                str3 = "click_button";
            }
            c2344009Gk.LJIIIIZZ("enter_method", str3);
            c2344009Gk.LJII(new C15M8().LJFF("is_commercial", "commercial_music_suggestion_id"));
            if (!TextUtils.isEmpty(c15ho.LJ)) {
                c2344009Gk.LJFF("category_id", c15ho.LJ);
            }
            if (!TextUtils.isEmpty(str2)) {
                c2344009Gk.LJFF("process_id", str2);
            }
            LogPbBean logPbBean = c15ho.LJIIIIZZ;
            if (logPbBean != null) {
                c2344009Gk.LJ(logPbBean, "log_pb");
                if (!TextUtils.isEmpty(c15ho.LJIIIIZZ.getImprId())) {
                    imprId = c15ho.LJIIIIZZ.getImprId();
                } else {
                    imprId = "";
                }
                c2344009Gk.LJFF("impr_id", imprId);
            }
            C20684815ws.LJIILLIIL("enter_music_detail", c2344009Gk.LIZ);
        }
    }

    public static void LJIIJJI(String str, C15HO c15ho, MusicModel musicModel, String str2) {
        int i;
        String id;
        int i2;
        boolean z;
        String str3;
        String imprId;
        if (c15ho == null || LJIJ == null) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("music_id", str);
        c2344009Gk.LJIIIIZZ("category_name", c15ho.LIZIZ);
        C15IM c15im = LJIJ;
        if (c15im != null && Intrinsics.LJFF(c15im.LIZ, str)) {
            i = c15im.LIZLLL;
        } else {
            i = 0;
        }
        c2344009Gk.LIZJ(i, "time");
        C15IM c15im2 = LJIJ;
        long j = 0;
        if (c15im2 != null && Intrinsics.LJFF(c15im2.LIZ, str)) {
            if (c15im2.LIZJ <= 0 && c15im2.LIZIZ > 0) {
                c15im2.LIZJ = System.currentTimeMillis() - c15im2.LIZIZ;
            }
            j = c15im2.LIZJ;
        }
        c2344009Gk.LIZLLL(j, "stay_time");
        c2344009Gk.LJIIIIZZ("enter_from", c15ho.LIZ);
        c2344009Gk.LJIIIIZZ("enter_method", c15ho.LIZJ);
        c2344009Gk.LJIIIIZZ("previous_page", c15ho.LIZLLL);
        c2344009Gk.LIZLLL(c15ho.LJIIJJI, "max_shoot_time");
        c2344009Gk.LJFF("creation_id", LJ);
        if (!TextUtils.isEmpty(c15ho.LJI)) {
            c2344009Gk.LJFF("tag_id", c15ho.LJI);
        }
        if (!TextUtils.isEmpty(c15ho.LJFF)) {
            c2344009Gk.LJFF("prop_id", c15ho.LJFF);
        }
        LogPbBean logPbBean = c15ho.LJIIIIZZ;
        String imprId2 = "";
        if (logPbBean != null) {
            c2344009Gk.LJ(logPbBean, "log_pb");
            if (TextUtils.isEmpty(c15ho.LJIIIIZZ.getImprId())) {
                imprId = "";
            } else {
                imprId = c15ho.LJIIIIZZ.getImprId();
            }
            c2344009Gk.LJFF("impr_id", imprId);
        }
        if (TextUtils.equals(c15ho.LIZ, "search_music")) {
            if (musicModel.getCardType() == MusicModel.CardType.AWESearchMusicCardMusicWithVideo) {
                z = true;
            } else {
                z = false;
            }
            if (Boolean.valueOf(z).booleanValue()) {
                str3 = "music_with_video";
            } else {
                str3 = "music";
            }
            c2344009Gk.LJFF("search_keyword", LIZJ);
            c2344009Gk.LJFF("search_id", musicModel.getSearchId());
            c2344009Gk.LIZLLL(musicModel.getId(), "search_result_id");
            c2344009Gk.LJFF("token_type", str3);
            c2344009Gk.LIZJ(LIZLLL, "order");
        }
        C20684815ws.LJIILLIIL("music_play_time", c2344009Gk.LIZ);
        if (musicModel != null) {
            C2344009Gk c2344009Gk2 = new C2344009Gk();
            c2344009Gk2.LJIIIIZZ("music_selected_from", str2);
            c2344009Gk2.LJIIIIZZ("content_source", LJIIIZ);
            c2344009Gk2.LJIIIIZZ("content_type", LJIIJ);
            c2344009Gk2.LJIIIIZZ("shoot_way", LJIIJJI);
            c2344009Gk2.LJIIIIZZ("enter_from", "video_edit_page");
            c2344009Gk2.LJIIIIZZ("creation_id", LJ);
            c2344009Gk2.LJIIIIZZ("music_id", musicModel.getMusicId());
            if (musicModel.getMatchedSongInfo() == null) {
                id = "";
            } else {
                id = musicModel.getMatchedSongInfo().getId();
            }
            c2344009Gk2.LJIIIIZZ("meta_song_id", id);
            c2344009Gk2.LIZJ(musicModel.isPgc() ? 1 : 0, "is_pgc");
            c2344009Gk2.LJIIIIZZ("music_selected_method", "manual");
            c2344009Gk2.LIZJ(LIZLLL, "music_show_rank");
            c2344009Gk2.LIZJ(musicModel.getDuration(), "music_duration");
            C15IM c15im3 = LJIJ;
            if (c15im3 != null && Intrinsics.LJFF(c15im3.LIZ, str)) {
                i2 = c15im3.LIZLLL;
            } else {
                i2 = 0;
            }
            c2344009Gk2.LIZJ(i2, "play_duration");
            c2344009Gk2.LIZJ(0, "is_from_edit_page_panel");
            c2344009Gk2.LIZJ(0, "is_from_auto_edit");
            if (musicModel.getLogPb() != null) {
                imprId2 = musicModel.getLogPb().getImprId();
            }
            c2344009Gk2.LJIIIIZZ("music_log_id", imprId2);
            C20684815ws.LJIILLIIL("music_play_end", c2344009Gk2.LIZ);
        }
        LJIJ = null;
    }

    public static void LJIILJJIL(String str, String str2, String str3, String str4) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("playlist_id", str2);
        c2344009Gk.LJIIIIZZ("playlist_name", str3);
        c2344009Gk.LJFF("platform", str4);
        C20684815ws.LJIILLIIL("share_playlist", c2344009Gk.LIZ);
    }

    public static void LJIILLIIL(MusicModel musicModel, C15HO c15ho, boolean z, String str) {
        String musicId;
        if (musicModel != null) {
            musicId = musicModel.getMusicId();
        } else {
            musicId = null;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("music_id", musicId);
        c2344009Gk.LJIIIIZZ("tab_name", LIZJ(LJIIZILJ));
        c2344009Gk.LJIIIIZZ("shoot_way", LJIIJJI);
        c2344009Gk.LJIIIIZZ("content_source", LJIIIZ);
        c2344009Gk.LJFF("creation_id", LJ);
        if (z) {
            c2344009Gk.LJFF(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "extend");
            StringBuilder sb = new StringBuilder();
            if (musicModel != null) {
                int presenterDuration = 0;
                for (int i = 0; i < musicModel.getMergedMusicList().size(); i++) {
                    sb.append(",");
                    sb.append(((MusicModel) ListProtector.get(musicModel.getMergedMusicList(), i)).getMusicId());
                    presenterDuration += ((MusicModel) ListProtector.get(musicModel.getMergedMusicList(), i)).getPresenterDuration();
                }
                c2344009Gk.LJFF("stitched_clip_id", sb.toString());
                c2344009Gk.LIZIZ(presenterDuration / 1000.0f, "duration");
            }
        } else {
            c2344009Gk.LJFF(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "unextend");
            if (musicModel != null) {
                c2344009Gk.LIZIZ(musicModel.getPresenterDuration() / 1000.0f, "duration");
            }
        }
        C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
    }

    public static void LJIJ(C15HO c15ho, MusicModel musicModel, int i, LogPbBean logPbBean) {
        int eventPosition;
        int i2;
        String recommendSourceFrom;
        String string;
        boolean z;
        boolean z2;
        String str;
        Integer num;
        String imprId;
        if (c15ho != null) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            MusicModel.MusicItemType musicItemType = musicModel.getMusicItemType();
            MusicModel.MusicItemType musicItemType2 = MusicModel.MusicItemType.RECOMMENDED_FAV_MUSIC;
            if (musicItemType == musicItemType2) {
                eventPosition = musicModel.getEventPosition();
            } else {
                eventPosition = i;
            }
            if (musicModel.getEventPosition() != -1) {
                eventPosition = musicModel.getEventPosition();
            }
            if (musicModel.isLocalMusic()) {
                c2344009Gk.LJFF("fake_music_id", musicModel.getMusicId());
            } else {
                c2344009Gk.LJFF("music_id", musicModel.getMusicId());
            }
            c2344009Gk.LJIIIIZZ("enter_from", c15ho.LIZ);
            c2344009Gk.LJIIIIZZ("enter_method", c15ho.LIZJ);
            c2344009Gk.LIZJ(eventPosition, "order");
            c2344009Gk.LJIIIIZZ("previous_page", LIZ);
            c2344009Gk.LIZLLL(c15ho.LJIIJJI, "max_shoot_time");
            c2344009Gk.LIZJ(0, "is_from_video");
            c2344009Gk.LJIIIIZZ("creation_id", LJ);
            c2344009Gk.LJIIIIZZ("music_name", musicModel.getName());
            c2344009Gk.LJIIIIZZ("shoot_way", LJIIJJI);
            c2344009Gk.LJIIIIZZ("content_source", LJIIIZ);
            c2344009Gk.LJIIIIZZ("content_type", LJIIJ);
            c2344009Gk.LIZJ(musicModel.isPgc() ? 1 : 0, "is_pgc");
            if (LJI && !musicModel.isLoopMusic()) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            c2344009Gk.LIZJ(i2, "is_multi_music");
            if (musicModel.getRecommendSourceFrom() == null) {
                recommendSourceFrom = "other_music";
            } else {
                recommendSourceFrom = musicModel.getRecommendSourceFrom();
            }
            c2344009Gk.LJFF("recommend_source_from", recommendSourceFrom);
            String str2 = c15ho.LJIILIIL;
            if (str2 != null && !str2.isEmpty()) {
                c2344009Gk.LJFF("tab_name", c15ho.LJIILIIL);
            }
            if (!TextUtils.isEmpty(c15ho.LJIILLIIL)) {
                c2344009Gk.LJFF("page_name", c15ho.LJIILLIIL);
            }
            if (musicModel.getMusicType() == 0) {
                c2344009Gk.LJFF("category_name", "device_upload");
            } else if (musicModel.getMusicType() == 3) {
                c2344009Gk.LJFF("category_name", "video_upload");
            } else if (musicModel.isUnlimitedMusic()) {
                c2344009Gk.LJFF("category_name", "unlimited");
            } else {
                c2344009Gk.LJFF("category_name", "upload");
            }
            if (!TextUtils.isEmpty(c15ho.LJI)) {
                c2344009Gk.LJFF("tag_id", c15ho.LJI);
            }
            if (!TextUtils.isEmpty(c15ho.LJFF)) {
                c2344009Gk.LJFF("prop_id", c15ho.LJFF);
            }
            if (!TextUtils.isEmpty(c15ho.LJ)) {
                c2344009Gk.LJFF("category_id", c15ho.LJ);
            }
            if (!TextUtils.isEmpty(c15ho.LJIILJJIL)) {
                c2344009Gk.LJFF("token_type", c15ho.LJIILJJIL);
            }
            LogPbBean logPbBean2 = c15ho.LJIIIIZZ;
            if (logPbBean2 != null) {
                c2344009Gk.LJ(logPbBean2, "log_pb");
                if (!TextUtils.isEmpty(c15ho.LJIIIIZZ.getImprId())) {
                    imprId = c15ho.LJIIIIZZ.getImprId();
                    c2344009Gk.LJFF("music_request_id", imprId);
                } else {
                    imprId = "";
                }
                c2344009Gk.LJFF("impr_id", imprId);
            }
            Long videoLength = ((IEditVideoInfoService) ServiceManager.get().getService(IEditVideoInfoService.class)).getVideoLength(LJ);
            if (videoLength != null) {
                string = videoLength.toString();
            } else {
                string = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009Gk.LJFF("creation_duration", string);
            String editFrom = musicModel.getEditFrom();
            if (editFrom != null && !editFrom.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                c2344009Gk.LIZJ(1, "is_edited_music");
                c2344009Gk.LIZJ(musicModel.getDuration(), "original_music_duration");
                c2344009Gk.LIZJ(LJIIL, "new_music_duration");
                c2344009Gk.LJFF("music_edited_from", musicModel.getEditFrom());
            } else {
                c2344009Gk.LIZJ(0, "is_edited_music");
            }
            LIZ(musicModel, c2344009Gk);
            if (LJ().booleanValue()) {
                c2344009Gk.LJIIIIZZ("from_location", LJIILJJIL);
                c2344009Gk.LJIIIIZZ("type", LJIILL);
                c2344009Gk.LIZJ(1, "is_editor_pro");
            }
            c2344009Gk.LJII(new C15M8().LJFF("is_commercial", "commercial_music_suggestion_id", "commercial_music_playlist_order"));
            if (LIZLLL() && (num = c15ho.LJIIL) != null) {
                c2344009Gk.LJ(num, "commercial_music_playlist_order");
            }
            if (musicModel.getMusicItemType() == musicItemType2) {
                c2344009Gk.LJFF("music_from", "favorite_recommend");
            }
            C15MA c15ma = C15MA.LL;
            if (C15MA.LIZLLL()) {
                c2344009Gk.LJFF("enter_from", "promote");
            }
            if (LJFF && C15IR.LIZ(musicModel.getMusic())) {
                c2344009Gk.LJFF("has_lyric", "1");
            }
            if (musicModel.getMusic() != null && !TextUtils.isEmpty(musicModel.getMusic().getPromoId())) {
                c2344009Gk.LJFF("promo_id", musicModel.getMusic().getPromoId());
            }
            if (TextUtils.equals(c15ho.LIZ, "search_music")) {
                if (musicModel.getCardType() == MusicModel.CardType.AWESearchMusicCardMusicWithVideo) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Boolean boolValueOf = Boolean.valueOf(z2);
                Integer numValueOf = Integer.valueOf(boolValueOf.booleanValue() ? 1 : 0);
                String awemeId = musicModel.getAwemeId();
                if (boolValueOf.booleanValue()) {
                    str = "music_with_video";
                } else {
                    str = "music";
                }
                int i3 = 0;
                if (!musicModel.isPgc() && musicModel.getMatchedSongInfo() != null && !TextUtils.isEmpty(musicModel.getMatchedSongInfo().getTitle())) {
                    i3 = 2;
                } else if (boolValueOf.booleanValue()) {
                    i3 = 1;
                }
                c2344009Gk.LJFF("search_keyword", LIZJ);
                c2344009Gk.LJFF("search_id", c15ho.LJIIIZ);
                c2344009Gk.LJFF("search_result_id", musicModel.getMusicId());
                if (!TextUtils.isEmpty(musicModel.getSearchResultId())) {
                    c2344009Gk.LJFF("search_result_id", musicModel.getSearchResultId());
                }
                c2344009Gk.LJFF("log_pb", GsonProtectorUtils.toJson(new Gson(), logPbBean));
                c2344009Gk.LJ(numValueOf, "is_from_video");
                c2344009Gk.LJFF("token_type", str);
                c2344009Gk.LJFF("group_id", awemeId);
                c2344009Gk.LJ(i3, "words_type");
                c2344009Gk.LIZJ(i, "rank");
                if (musicModel.getListItemId() != null && !TextUtils.isEmpty(musicModel.getListItemId())) {
                    c2344009Gk.LJFF("list_item_id", musicModel.getListItemId());
                }
                C20684815ws.LJIJ("add_music", C117000cS.LIZ(c2344009Gk.LIZ));
                return;
            }
            c2344009Gk.LIZJ(((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJIIIZ(), "music_rec_type");
            C20684815ws.LJIILLIIL("add_music", c2344009Gk.LIZ);
        }
    }

    public static void LJII(boolean z, MusicModel musicModel, C15HO c15ho, int i, LogPbBean logPbBean) {
        String musicId;
        String imprId;
        String strLJIIIIZZ;
        if (c15ho == null) {
            return;
        }
        String name = null;
        if (musicModel != null) {
            musicId = musicModel.getMusicId();
            name = musicModel.getName();
        } else {
            musicId = null;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        String str = c15ho.LIZIZ;
        if (musicModel != null) {
            if (musicModel.getMusicItemType() == MusicModel.MusicItemType.RECOMMENDED_FAV_MUSIC) {
                i = musicModel.getEventPosition();
                str = "favorite_recommend";
            }
            if (musicModel.getEventPosition() != -1) {
                i = musicModel.getEventPosition();
            }
        }
        LogPbBean logPbBean2 = c15ho.LJIIIIZZ;
        String imprId2 = "";
        if (logPbBean2 == null) {
            imprId = "";
        } else {
            imprId = logPbBean2.getImprId();
        }
        c2344009Gk.LJIIIIZZ("enter_from", c15ho.LIZ);
        c2344009Gk.LJIIIIZZ("music_id", musicId);
        c2344009Gk.LJIIIIZZ("category_name", str);
        c2344009Gk.LJIIIIZZ("enter_method", c15ho.LIZJ);
        c2344009Gk.LJIIIIZZ("previous_page", c15ho.LIZLLL);
        c2344009Gk.LIZJ(i, "order");
        c2344009Gk.LJIIIIZZ("creation_id", LJ);
        c2344009Gk.LJIIIIZZ("music_name", name);
        c2344009Gk.LIZLLL(c15ho.LJIIJJI, "max_shoot_time");
        c2344009Gk.LJIIIIZZ("music_log_id", imprId);
        if (C1443560nfW.LJIIIIZZ() == null) {
            strLJIIIIZZ = "";
        } else {
            strLJIIIIZZ = C1443560nfW.LJIIIIZZ();
        }
        c2344009Gk.LJIIIIZZ("group_id", strLJIIIIZZ);
        c2344009Gk.LJII(new C15M8().LJFF("is_commercial", "commercial_music_suggestion_id"));
        if (!TextUtils.isEmpty(c15ho.LJ)) {
            c2344009Gk.LJFF("category_id", c15ho.LJ);
        }
        if (!TextUtils.isEmpty(c15ho.LJI)) {
            c2344009Gk.LJFF("tag_id", c15ho.LJI);
        }
        if (!TextUtils.isEmpty(c15ho.LJFF)) {
            c2344009Gk.LJFF("prop_id", c15ho.LJFF);
        }
        LogPbBean logPbBean3 = c15ho.LJIIIIZZ;
        if (logPbBean3 != null) {
            c2344009Gk.LJ(logPbBean3, "log_pb");
            if (!TextUtils.isEmpty(c15ho.LJIIIIZZ.getImprId())) {
                imprId2 = c15ho.LJIIIIZZ.getImprId();
            }
            c2344009Gk.LJFF("impr_id", imprId2);
        }
        if (musicModel != null && musicModel.getMusicItemType() == MusicModel.MusicItemType.RECOMMENDED_FAV_MUSIC) {
            c2344009Gk.LJFF("music_from", "favorite_recommend");
        }
        if (!TextUtils.isEmpty(c15ho.LJIILIIL)) {
            c2344009Gk.LJFF("tab_name", c15ho.LJIILIIL);
        }
        if (!TextUtils.isEmpty(c15ho.LJIILLIIL)) {
            c2344009Gk.LJFF("page_name", c15ho.LJIILLIIL);
        }
        String str2 = "favourite_song";
        if (TextUtils.equals(c15ho.LIZ, "search_music")) {
            c2344009Gk.LJFF("search_keyword", LIZJ);
            c2344009Gk.LJFF("search_id", c15ho.LJIIIZ);
            c2344009Gk.LJFF("search_result_id", musicId);
            c2344009Gk.LJFF("log_pb", GsonProtectorUtils.toJson(new Gson(), logPbBean));
            if (z) {
                if (musicModel != null && musicModel.getMusic() != null && !TextUtils.isEmpty(musicModel.getMusic().getPromoId())) {
                    c2344009Gk.LJFF("promo_id", musicModel.getMusic().getPromoId());
                }
            } else {
                str2 = "cancel_favourite_song";
            }
            C20684815ws.LJIJ(str2, C117000cS.LIZ(c2344009Gk.LIZ));
            return;
        }
        if (!z) {
            return;
        }
        if (musicModel != null && musicModel.getMusic() != null && !TextUtils.isEmpty(musicModel.getMusic().getPromoId())) {
            c2344009Gk.LJFF("promo_id", musicModel.getMusic().getPromoId());
        }
        C20684815ws.LJIILLIIL("favourite_song", c2344009Gk.LIZ);
    }

    public static void LJIILIIL(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "change_music_page_detail");
        c2344009Gk.LJIIIIZZ("enter_method", str);
        c2344009Gk.LJIIIIZZ("previous_page", str2);
        c2344009Gk.LJIIIIZZ("category_id", str3);
        c2344009Gk.LJIIIIZZ("category_name", str4);
        c2344009Gk.LJIIIIZZ("tab_name", str5);
        c2344009Gk.LJIIIIZZ("page_name", str6);
        c2344009Gk.LJFF("from_page", str7);
        C20684815ws.LJIILLIIL("playlist_page_show", c2344009Gk.LIZ);
    }

    public static void LJIILL(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("enter_method", str2);
        c2344009Gk.LJIIIIZZ("tab_name", str5);
        c2344009Gk.LJIIIIZZ("page_name", str6);
        c2344009Gk.LJIIIIZZ("category_id", str3);
        c2344009Gk.LJIIIIZZ("category_name", str4);
        c2344009Gk.LJIIIIZZ("display_format", str7);
        C20684815ws.LJIILLIIL("show_music_playlist", c2344009Gk.LIZ);
    }

    public static void LJIIL(MusicShowOverChecker musicShowOverChecker, LifecycleOwner lifecycleOwner, final C15HO c15ho, final MusicModel musicModel, final int i, final boolean z, final boolean z2, final C20491215Gc c20491215Gc) {
        if (!z) {
            return;
        }
        C11NZ.LJJJJI(new Callable() { // from class: X.15IL
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C20491215Gc c20491215Gc2 = c20491215Gc;
                MusicModel musicModel2 = musicModel;
                C15HO c15ho2 = c15ho;
                int i2 = i;
                boolean z3 = z;
                boolean z4 = z2;
                C1C7U.LIZ("ChooseMusicStatistics@8488.sendMusicShowEvent$1L");
                if (c20491215Gc2 != null) {
                    String musicId = musicModel2.getMusicId();
                    if (c20491215Gc2.LIZIZ.contains(musicId)) {
                        Boolean bool = Boolean.TRUE;
                        C1C7U.LIZIZ("ChooseMusicStatistics@8488.sendMusicShowEvent$1L");
                        return bool;
                    }
                    c20491215Gc2.LIZIZ.add(musicId);
                }
                if (z3) {
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    MusicModel.MusicItemType musicItemType = musicModel2.getMusicItemType();
                    MusicModel.MusicItemType musicItemType2 = MusicModel.MusicItemType.RECOMMENDED_FAV_MUSIC;
                    int eventPosition = musicItemType == musicItemType2 ? musicModel2.getEventPosition() : i2;
                    if (musicModel2.getEventPosition() != -1) {
                        eventPosition = musicModel2.getEventPosition();
                    }
                    c2344009Gk.LJIIIIZZ("enter_from", c15ho2.LIZ);
                    c2344009Gk.LJIIIIZZ("enter_method", c15ho2.LIZJ);
                    c2344009Gk.LJIIIIZZ("previous_page", c15ho2.LIZLLL);
                    c2344009Gk.LIZJ(eventPosition, "order");
                    c2344009Gk.LJIIIIZZ("creation_id", C15IK.LJ);
                    c2344009Gk.LIZJ(z4 ? 1 : 0, "ugc_to_pgc_meta");
                    c2344009Gk.LJIIIIZZ("music_name", musicModel2.getName());
                    c2344009Gk.LJIIIIZZ("tab_name", c15ho2.LJIILIIL);
                    c2344009Gk.LJIIIIZZ("music_name", musicModel2.getName());
                    c2344009Gk.LJ(musicModel2, "ai_recommend_tag");
                    c2344009Gk.LJFF("shoot_way", C15IK.LJIIJJI);
                    if (musicModel2.isLocalMusic()) {
                        c2344009Gk.LJFF("fake_music_id", musicModel2.getMusicId());
                        c2344009Gk.LJFF("music_id", musicModel2.getMusicId());
                        if (musicModel2.getMusicType() == 0) {
                            c2344009Gk.LJFF("category_name", "device_upload");
                        } else if (musicModel2.getMusicType() == 3) {
                            c2344009Gk.LJFF("category_name", "video_upload");
                        }
                    } else {
                        c2344009Gk.LJFF("music_id", musicModel2.getMusicId());
                        if (musicModel2.isUnlimitedMusic()) {
                            c2344009Gk.LJFF("category_name", "unlimited");
                        } else {
                            c2344009Gk.LJFF("category_name", "recommend");
                        }
                    }
                    C15IK.LIZ(musicModel2, c2344009Gk);
                    if (!TextUtils.isEmpty(c15ho2.LJ)) {
                        c2344009Gk.LJFF("category_id", c15ho2.LJ);
                    }
                    if (!TextUtils.isEmpty(c15ho2.LJI)) {
                        c2344009Gk.LJFF("tag_id", c15ho2.LJI);
                    }
                    if (!TextUtils.isEmpty(c15ho2.LJFF)) {
                        c2344009Gk.LJFF("prop_id", c15ho2.LJFF);
                    }
                    LogPbBean logPbBean = c15ho2.LJIIIIZZ;
                    if (logPbBean != null) {
                        c2344009Gk.LJ(logPbBean, "log_pb");
                        String imprId = !TextUtils.isEmpty(c15ho2.LJIIIIZZ.getImprId()) ? c15ho2.LJIIIIZZ.getImprId() : "";
                        c2344009Gk.LJFF("music_request_id", imprId);
                        c2344009Gk.LJFF("impr_id", imprId);
                    }
                    if (C15IK.LJ().booleanValue()) {
                        c2344009Gk.LJIIIIZZ("from_location", C15IK.LJIILJJIL);
                        c2344009Gk.LJIIIIZZ("type", C15IK.LJIILL);
                        c2344009Gk.LIZJ(1, "is_editor_pro");
                    }
                    if (C15IK.LIZLLL()) {
                        c2344009Gk.LIZJ(i2, "commercial_music_order");
                    }
                    C15MA c15ma = C15MA.LL;
                    if (C15MA.LIZLLL()) {
                        c2344009Gk.LJFF("enter_from", "promote");
                    }
                    c2344009Gk.LJII(new C15M8().LJFF("is_commercial", "commercial_music_suggestion_id"));
                    c2344009Gk.LIZJ(((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJIIIZ(), "music_rec_type");
                    if (musicModel2.getMusicItemType() == musicItemType2) {
                        c2344009Gk.LJFF("music_from", "favorite_recommend");
                    }
                    c2344009Gk.LJ(Boolean.valueOf(musicModel2.isPgc()), "is_pgc");
                    if (musicModel2.getMatchedSongInfo() != null) {
                        c2344009Gk.LJFF("meta_song_id", musicModel2.getMatchedSongInfo().getId());
                    }
                    if (musicModel2.getRecommendSourceFrom() == null) {
                        c2344009Gk.LJFF("recommend_source_from", "other_music");
                    } else {
                        c2344009Gk.LJFF("recommend_source_from", musicModel2.getRecommendSourceFrom());
                    }
                    if (musicModel2.getMusic() != null) {
                        if (!TextUtils.isEmpty(musicModel2.getMusic().getPromoId())) {
                            c2344009Gk.LJFF("promo_id", musicModel2.getMusic().getPromoId());
                        }
                        if (!TextUtils.isEmpty(musicModel2.getMusic().getRecallReason())) {
                            c2344009Gk.LJFF("music_rec_reason", musicModel2.getMusic().getRecallReason());
                        }
                    }
                    LogPbBean logPbBean2 = c15ho2.LJIIIIZZ;
                    if (logPbBean2 != null) {
                        c2344009Gk.LJFF("music_log_id", logPbBean2.getImprId());
                    }
                    if (!TextUtils.isEmpty(c15ho2.LJIILLIIL)) {
                        c2344009Gk.LJFF("page_name", c15ho2.LJIILLIIL);
                    }
                    if (C15IK.LJFF && C15IR.LIZ(musicModel2.getMusic())) {
                        c2344009Gk.LJFF("has_lyric", "1");
                    }
                    c2344009Gk.LJFF("is_available", musicModel2.isOffline() ? CardStruct.IStatusCode.DEFAULT : "1");
                    c2344009Gk.LJFF("is_offline_similar_added", musicModel2.isSimilarMusic() ? "1" : CardStruct.IStatusCode.DEFAULT);
                    c2344009Gk.LJ(Boolean.valueOf(musicModel2.isFromRecommend()), "from_recommend");
                    if ("favorite".equals(c15ho2.LJIILIIL)) {
                        c2344009Gk.LJFF("tab_name", "favorite_song");
                        c2344009Gk.LJFF("category_name", "favorite_song");
                    }
                    C20684815ws.LJIILLIIL("show_music", c2344009Gk.LIZ);
                }
                Boolean bool2 = Boolean.TRUE;
                C1C7U.LIZIZ("ChooseMusicStatistics@8488.sendMusicShowEvent$1L");
                return bool2;
            }
        }).LJL(C11S5.LIZ()).LJJLJ();
        musicShowOverChecker.LIZLLL(lifecycleOwner);
    }

    public static void LJIIIZ(Integer num, String str, String str2, String str3, String str4, String str5, String str6, Integer num2, String str7) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (!TextUtils.isEmpty(str3)) {
            c2344009Gk.LJFF("banner_id", str3);
        }
        c2344009Gk.LJIIIIZZ("category_name", str);
        c2344009Gk.LJIIIIZZ("enter_method", str2);
        c2344009Gk.LJIIIIZZ("enter_from", str4);
        c2344009Gk.LJFF("creation_id", LJ);
        if (!TextUtils.isEmpty(str5)) {
            c2344009Gk.LJFF("category_id", str5);
        }
        if (LIZLLL()) {
            c2344009Gk.LJFF("is_commercial", "1");
            if (num != null) {
                c2344009Gk.LJ(num, "csp_section_order");
            }
            if (num2 != null) {
                c2344009Gk.LJ(num2, "commercial_banner_order");
            }
        }
        if (!TextUtils.isEmpty(str6)) {
            c2344009Gk.LJFF("tab_name", str6);
        }
        if (!TextUtils.isEmpty(str7)) {
            c2344009Gk.LJFF("page_name", str7);
        }
        C20684815ws.LJIILLIIL("enter_song_category", c2344009Gk.LIZ);
    }
}
