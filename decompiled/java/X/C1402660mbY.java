package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.music.model.MatchedSoundInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.MemeSongModel;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mbY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1402660mbY {
    public static final C1402660mbY LIZ = new C1402660mbY();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0LAB] */
    public static void LIZ(VideoPublishEditModel videoPublishEditModel) {
        String str;
        ?? r1;
        String id;
        MemeSongModel memeSongModel;
        int i;
        int i2;
        Long lValueOf;
        Pair pair;
        String str2;
        Long lValueOf2;
        MemeSongModel memeSongModel2;
        String style;
        MatchedSoundInfo matchedSoundInfo;
        ?? c0lab = new C0LAB();
        c0lab.LJ("music_selected_from", C1412490mrP.LIZIZ(videoPublishEditModel));
        c0lab.LIZ(videoPublishEditModel.creativeModel.musicBuzModel.isMusicFromAutoEdit ? 1 : 0, "is_music_from_auto_edit");
        c0lab.LJ("music_id", videoPublishEditModel.getMusicId());
        if (Intrinsics.LJFF(videoPublishEditModel.mShootWay, "on_this_day")) {
            str = "on_this_day_page";
        } else {
            str = "video_edit_page";
        }
        c0lab.LJ("enter_from", str);
        String str3 = "";
        c0lab.LJ("music_rec_type", "");
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LJ("recommend_source_from", C570830Ma9.LJ(videoPublishEditModel));
        c0lab.LJI(new C15M8().LJFF("is_commercial", "commercial_music_suggestion_id", "is_promote_pa"));
        c0lab.LJ("tab_name", videoPublishEditModel.creativeModel.musicBuzModel.musicSelectTab);
        c0lab.LJ("music_recent_type", videoPublishEditModel.creativeModel.musicBuzModel.musicRecTypeRecent);
        MusicObject musicObject = videoPublishEditModel.creativeModel.musicBuzModel.music;
        if (musicObject != null) {
            r1 = musicObject.isPgc;
        } else {
            r1 = 0;
        }
        c0lab.LIZ(r1, "is_pgc");
        MusicBuzModel musicBuzModel = videoPublishEditModel.creativeModel.musicBuzModel;
        Pair pair2 = null;
        if (musicBuzModel != null && (matchedSoundInfo = musicBuzModel.matchedSongInfo) != null) {
            id = matchedSoundInfo.getId();
        } else {
            id = null;
        }
        c0lab.LJ("meta_song_id", id);
        if (C123100dR.LIZ(C570830Ma9.LIZJ(videoPublishEditModel))) {
            c0lab.LJ("promo_id", C570830Ma9.LIZJ(videoPublishEditModel));
        }
        if (C123100dR.LIZ(C570830Ma9.LIZLLL(videoPublishEditModel))) {
            c0lab.LJ("music_rec_reason", C570830Ma9.LIZLLL(videoPublishEditModel));
        }
        MusicObject musicObject2 = videoPublishEditModel.creativeModel.musicBuzModel.music;
        if (musicObject2 != null) {
            memeSongModel = musicObject2.memeSong;
        } else {
            memeSongModel = null;
        }
        if (memeSongModel != null) {
            c0lab.LIZ(1, "is_meme_song");
            MusicObject musicObject3 = videoPublishEditModel.creativeModel.musicBuzModel.music;
            if (musicObject3 != null && (memeSongModel2 = musicObject3.memeSong) != null && (style = memeSongModel2.getStyle()) != null) {
                str3 = style;
            }
            c0lab.LJ("meme_song_style", str3);
        } else {
            c0lab.LIZ(0, "is_meme_song");
            c0lab.LJ("meme_song_style", "");
        }
        c0lab.LJ("music_log_id", C1412490mrP.LJFF(videoPublishEditModel));
        if (videoPublishEditModel.creativeModel.mdpInfoModel.fromOfflineMusicMdp) {
            i = 1;
        } else {
            i = 0;
        }
        c0lab.LIZ(i, "is_offline_unmuted_mdp");
        if (videoPublishEditModel.creativeModel.musicBuzModel.similarTag > 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        c0lab.LIZ(i2, "is_similar_music");
        c0lab.LIZ(C1457560o26.LIZ(videoPublishEditModel.creativeModel), "pic_cnt");
        c0lab.LIZ(videoPublishEditModel.creativeModel.albumModel.videoCount, "video_cnt");
        if (videoPublishEditModel.hasExtendMusic()) {
            c0lab.LJ("stitched_clip_id", C13LP.LJJLIIIJ(C1429680nJ8.LIZIZ(videoPublishEditModel.creativeModel.musicBuzModel), ",", null, null, 0, null, AFwS261S0000000_22.get$arr$(180), 30));
            c0lab.LIZ(1, "is_smart_extend");
        }
        if (Intrinsics.LJFF(videoPublishEditModel.mShootWay, "on_this_day")) {
            c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        }
        CreativeModel creativeModel = videoPublishEditModel.creativeModel;
        if (creativeModel.musicBuzModel.isMusicFromAutoEdit) {
            c0lab.LJ("mix_request_id", creativeModel.mixEditingModel.requestId);
        }
        C565300MFc.LIZ(videoPublishEditModel, c0lab);
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "fix_show_music_title_ab", true, true)) {
            c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        }
        MusicObject musicObject4 = videoPublishEditModel.creativeModel.musicBuzModel.music;
        Pair[] pairArr = new Pair[2];
        if (musicObject4 != null) {
            lValueOf = Long.valueOf(musicObject4.simGroupIdV3);
        } else {
            lValueOf = null;
        }
        if (lValueOf != null && lValueOf.longValue() != 0) {
            pair = new Pair("sim_group_id_v3", Long.valueOf(lValueOf.longValue()));
        } else {
            pair = null;
        }
        pairArr[0] = pair;
        if (musicObject4 != null && (lValueOf2 = Long.valueOf(musicObject4.sameGroupIdV3)) != null && lValueOf2.longValue() != 0) {
            pair2 = new Pair("same_group_id_v3", Long.valueOf(lValueOf2.longValue()));
        }
        pairArr[1] = pair2;
        for (Pair pair3 : (ArrayList) C13LQ.LJIJI(pairArr)) {
            c0lab.LIZIZ(((Number) pair3.getSecond()).longValue(), (String) pair3.getFirst());
        }
        c0lab.LJFF("from_recommend", videoPublishEditModel.creativeModel.musicBuzModel.fromRecommend);
        String selectedMusicFavoriteTabName = videoPublishEditModel.creativeModel.initialModel.collectMusicModel.getSelectedMusicFavoriteTabName();
        if (selectedMusicFavoriteTabName != null) {
            c0lab.LJ("panel_favorite_music_selected_from", selectedMusicFavoriteTabName);
        }
        if (C1403850mdT.LJFF(videoPublishEditModel)) {
            if (C1444810nhX.LIZJ(videoPublishEditModel.creativeModel.musicBuzModel)) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c0lab.LJ("music_lyrics_status", str2);
        }
        C20684815ws.LJIILLIIL("show_music_title", c0lab.LIZ);
    }
}
