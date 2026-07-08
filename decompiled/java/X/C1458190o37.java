package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.FlowDataMusicInfo;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.music.model.MatchedSoundInfo;
import com.ss.android.ugc.aweme.music.model.MemeSongInfo;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicTag;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.MemeSongModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0o37, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1458190o37 implements C155P {
    public final VideoPublishEditModel LIZ;
    public final boolean LIZIZ;
    public long LIZJ = System.currentTimeMillis();
    public long LIZLLL = System.currentTimeMillis();
    public long LJ = System.currentTimeMillis();
    public int LJFF;
    public Integer LJI;
    public boolean LJII;
    public Long LJIIIIZZ;

    @Override // X.C155P
    public final void z3() {
        LJIJI(0, true);
    }

    public static int LJIJ() {
        C204607154j c204607154jLJLZ;
        C1403010mc7.LIZ.getMusicService().dl().getClass();
        C11PQ<C204607154j> c11pq = C1458410o3T.LIZLLL;
        if (c11pq == null || (c204607154jLJLZ = c11pq.LJLZ()) == null) {
            return 0;
        }
        return c204607154jLJLZ.LIZJ;
    }

    @Override // X.C155P
    public final void LIZ() {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", this.LIZ.getCreationId());
        c0lab.LJ("enter_from", "video_edit_page");
        c0lab.LJ("shoot_way", this.LIZ.mShootWay);
        c0lab.LJ("content_type", C1428470nHB.LJIILL(this.LIZ));
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(this.LIZ));
        String stickers = this.LIZ.getStickers();
        if (stickers == null) {
            stickers = "";
        }
        c0lab.LJ("prop_list", stickers);
        c0lab.LIZ(this.LIZ.getContainBackgroundVideo() ? 1 : 0, "is_gsv_prop");
        c0lab.LIZJ(Float.valueOf(this.LIZ.getVoiceVolume()), "volume");
        c0lab.LJ("music_id", this.LIZ.getMusicId());
        if (this.LIZ.getDraftId() != 0) {
            c0lab.LIZ(this.LIZ.getDraftId(), "draft_id");
        }
        if (this.LIZ.hasExtendMusic()) {
            c0lab.LIZ(1, "is_smart_extend");
            c0lab.LJ("stitched_clip_id", C13LP.LJJLIIIJ(C1429680nJ8.LIZIZ(this.LIZ.creativeModel.musicBuzModel), ",", null, null, 0, null, AFwS261S0000000_22.get$arr$(200), 30));
        }
        C20684815ws.LJIILLIIL("edit_volume", c0lab.LIZ);
    }

    @Override // X.C155P
    public final void LJIIIZ() {
        Pair<String, Integer> pair;
        C1458370o3P c1458370o3P = C1458370o3P.LIZ;
        String creationId = this.LIZ.getCreationId();
        c1458370o3P.getClass();
        Pair<String, Integer> pair2 = C1458370o3P.LJIILLIIL;
        this.LJFF = (!Intrinsics.LJFF(pair2 != null ? pair2.getFirst() : null, creationId) || (pair = C1458370o3P.LJIILLIIL) == null) ? 0 : pair.getSecond().intValue();
        VideoPublishEditModel videoPublishEditModel = this.LIZ;
        if (videoPublishEditModel == null || videoPublishEditModel.getMusicId() == null) {
            return;
        }
        this.LJII = true;
    }

    @Override // X.C155P
    public final void LJIIJ(String str) {
        C0LAB c0lab = new C0LAB();
        LJIIZILJ(c0lab);
        c0lab.LJ("to_status", str);
        C20684815ws.LJIILLIIL("click_panel_original_button", c0lab.LIZ);
    }

    @Override // X.C155P
    public final void LJIIJJI(String str) {
        String str2;
        VideoPublishEditModel videoPublishEditModel = this.LIZ;
        C0LAB c0labLJIILIIL = C1403850mdT.LJIILIIL(videoPublishEditModel);
        if (videoPublishEditModel.creativeModel.commerceModel.getMusicContext().getInPromoteReplaceMusicScene()) {
            str2 = "promote";
        } else if (videoPublishEditModel.creativeModel.onThisDayData.isInOnThisDayPreviewPage()) {
            str2 = "on_this_day_page";
        } else {
            str2 = "video_edit_page";
        }
        c0labLJIILIIL.LJ("enter_from", str2);
        c0labLJIILIIL.LJ("favorite_tab_name", str);
        C20684815ws.LJIILLIIL("enter_favorite_music_tab", c0labLJIILIIL.LIZ);
    }

    @Override // X.C155P
    public final void LJIIL(boolean z) {
        String enterFrom;
        String str;
        C0LAB c0lab = new C0LAB();
        if (this.LIZ.creativeModel.commerceModel.getMusicContext().getInPromoteReplaceMusicScene()) {
            enterFrom = "promote";
        } else {
            enterFrom = this.LIZ.getEnterFrom();
        }
        c0lab.LJ("enter_from", enterFrom);
        c0lab.LJ("creation_id", this.LIZ.getCreationId());
        String stickers = this.LIZ.getStickers();
        if (stickers == null) {
            stickers = "";
        }
        c0lab.LJ("prop_list", stickers);
        c0lab.LIZ(this.LIZ.getContainBackgroundVideo() ? 1 : 0, "is_gsv_prop");
        c0lab.LJ("shoot_way", this.LIZ.mShootWay);
        c0lab.LJ("content_type", C1428470nHB.LJIILL(this.LIZ));
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(this.LIZ));
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab.LJ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str);
        C20684815ws.LJIILLIIL("click_original_sound", c0lab.LIZ);
    }

    @Override // X.C155P
    public final void LJIILJJIL(String str) {
        C0LAB c0lab = new C0LAB();
        LJIIZILJ(c0lab);
        c0lab.LJ("to_status", str);
        C20684815ws.LJIILLIIL("click_panel_sound_button", c0lab.LIZ);
    }

    @Override // X.C155P
    public final void LJIILLIIL(String str) {
        String str2;
        C0LAB c0labLJIILIIL = C1403850mdT.LJIILIIL(this.LIZ);
        if (this.LIZ.creativeModel.commerceModel.getMusicContext().getInPromoteReplaceMusicScene()) {
            str2 = "promote";
        } else {
            str2 = "video_edit_page";
        }
        c0labLJIILIIL.LJ("enter_from", str2);
        c0labLJIILIIL.LJ("shoot_way", this.LIZ.mShootWay);
        c0labLJIILIIL.LJ("creation_id", this.LIZ.getCreationId());
        c0labLJIILIIL.LJ("tab_name", str);
        C20684815ws.LJIILLIIL("music_panel_slide", c0labLJIILIIL.LIZ);
    }

    public final void LJIIZILJ(C0LAB c0lab) {
        String str;
        if (this.LIZ.creativeModel.onThisDayData.isInOnThisDayPreviewPage()) {
            str = "on_this_day_page";
        } else {
            str = "video_edit_page";
        }
        c0lab.LJ("enter_from", str);
        c0lab.LJ("music_id", this.LIZ.getMusicId());
        c0lab.LJ("music_selected_from", C1412490mrP.LIZIZ(this.LIZ));
        c0lab.LJ("shoot_way", this.LIZ.mShootWay);
    }

    public C1458190o37(VideoPublishEditModel videoPublishEditModel, boolean z) {
        this.LIZ = videoPublishEditModel;
        this.LIZIZ = z;
    }

    @Override // X.C155P
    public final void LJIILIIL(int i, String str) {
        this.LIZ.creativeModel.musicBuzModel.musicShowRank = i;
    }

    public final void LJIJI(int i, boolean z) {
        Integer numValueOf;
        List<? extends AVMusic> list = C1452640nuA.LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mobWholeMusicShowDuration position:");
        sbLIZ.append(i);
        sbLIZ.append(", capsule count:");
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C201955140j.LJIILIIL("EditMusicPanelOptHelper", C2188811AlT.LIZIZ(sbLIZ));
        if (i >= 0) {
            if (this.LJ > 0) {
                this.LJIIIIZZ = Long.valueOf(System.currentTimeMillis() - this.LJ);
                this.LJ = -1L;
                if (list != null) {
                    this.LJI = Integer.valueOf(list.size());
                }
            }
            if (this.LJI == null) {
                if (this.LJII) {
                    this.LJI = 1;
                } else {
                    this.LJI = 0;
                }
            }
        }
        if (i >= C2296708zF.LIZ() && this.LIZLLL > 0) {
            C1403470mcr.LJIIIIZZ(this.LIZ, System.currentTimeMillis() - this.LIZLLL, this.LJFF, this.LJI, this.LJIIIIZZ);
            this.LIZLLL = -1L;
        }
        if (z && this.LIZLLL > 0) {
            C1403470mcr.LJIIIIZZ(this.LIZ, 0L, this.LJFF, this.LJI, this.LJIIIIZZ);
            this.LIZLLL = -1L;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0LAB] */
    /* JADX WARN: Type inference failed for: r8v1, types: [int] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    @Override // X.C155P
    public final void LIZLLL(String str, boolean z, boolean z2) {
        String str2;
        VideoPublishEditModel videoPublishEditModel = this.LIZ;
        boolean z3 = this.LIZIZ;
        ?? LJIILIIL = C1403850mdT.LJIILIIL(videoPublishEditModel);
        if (videoPublishEditModel.creativeModel.commerceModel.getMusicContext().getInPromoteReplaceMusicScene()) {
            str2 = "promote";
        } else if (videoPublishEditModel.creativeModel.onThisDayData.isInOnThisDayPreviewPage()) {
            str2 = "on_this_day_page";
        } else {
            str2 = "video_edit_page";
        }
        LJIILIIL.LJ("enter_from", str2);
        LJIILIIL.LJ("shoot_way", videoPublishEditModel.mShootWay);
        LJIILIIL.LIZ(z3 ? 1 : 0, "is_editor_pro");
        LJIILIIL.LIZ(videoPublishEditModel.getPreviewInfo().getPreviewVideoLength(), "creation_duration");
        LJIILIIL.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        LJIILIIL.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        String stickers = videoPublishEditModel.getStickers();
        if (stickers == null) {
            stickers = "";
        }
        LJIILIIL.LJ("prop_list", stickers);
        LJIILIIL.LIZ(videoPublishEditModel.getContainBackgroundVideo() ? 1 : 0, "is_gsv_prop");
        LJIILIIL.LJ("creation_id", videoPublishEditModel.getCreationId());
        LJIILIIL.LJ("tab_name", str);
        LJIILIIL.LJ("shoot_tab_name", C1428470nHB.LJJIIZI(videoPublishEditModel));
        LJIILIIL.LIZ(z ? 1 : 0, "is_slide");
        ?? r8 = z2;
        if (C1416310mxZ.LJJJJLI(videoPublishEditModel)) {
            r8 = 0;
        }
        LJIILIIL.LIZ(r8, "is_multi_music");
        C20684815ws.LJIILLIIL("enter_music_tab", LJIILIIL.LIZ);
    }

    @Override // X.C155P
    public final void LJFF(MusicModel musicModel, String str, String str2) {
        this.LIZ.setMusicOrigin(new C1458230o3B().apply(new C1458250o3D("edit_music_panel", musicModel, str, str2, 24)));
        this.LIZ.creativeModel.initialModel.collectMusicModel.setSelectedMusicFavoriteTabName(str2);
    }

    @Override // X.C155P
    public final void LJI(MusicModel musicModel, String str, String str2) {
        String strLJIILIIL;
        String str3;
        MemeSongModel memeSong;
        String str4;
        int i;
        String str5;
        int i2;
        Integer similarTag;
        VideoPublishEditModel videoPublishEditModel = this.LIZ;
        int iLJIJ = LJIJ();
        C0LAB c0labLJIILIIL = C1403850mdT.LJIILIIL(videoPublishEditModel);
        c0labLJIILIIL.LJ("creation_id", videoPublishEditModel.getCreationId());
        String strLJIILL = "replace_music";
        if (C1416310mxZ.LJJJJZ(videoPublishEditModel)) {
            strLJIILIIL = "replace_music";
        } else {
            strLJIILIIL = C1428470nHB.LJIILIIL(videoPublishEditModel);
        }
        c0labLJIILIIL.LJ("content_source", strLJIILIIL);
        if (!C1416310mxZ.LJJJJZ(videoPublishEditModel)) {
            strLJIILL = C1428470nHB.LJIILL(videoPublishEditModel);
        }
        c0labLJIILIIL.LJ("content_type", strLJIILL);
        c0labLJIILIIL.LJ("shoot_way", videoPublishEditModel.mShootWay);
        String stickers = videoPublishEditModel.getStickers();
        String id = "";
        if (stickers == null) {
            stickers = "";
        }
        c0labLJIILIIL.LJ("prop_list", stickers);
        c0labLJIILIIL.LIZ(videoPublishEditModel.getContainBackgroundVideo() ? 1 : 0, "is_gsv_prop");
        String musicId = videoPublishEditModel.getMusicId();
        if (musicId == null && (musicModel == null || (musicId = musicModel.getMusicId()) == null)) {
            musicId = "";
        }
        c0labLJIILIIL.LJ("music_id", musicId);
        c0labLJIILIIL.LJ("replace_music_content_type", C1403470mcr.LIZJ(videoPublishEditModel));
        c0labLJIILIIL.LIZ(iLJIJ, "music_rec_type");
        c0labLJIILIIL.LIZ(0, "can_music_loop");
        c0labLJIILIIL.LJ("enter_method", "music_panel");
        if (videoPublishEditModel.creativeModel.commerceModel.getMusicContext().getInPromoteReplaceMusicScene()) {
            str3 = "promote";
        } else {
            str3 = "video_edit_page";
        }
        c0labLJIILIIL.LJ("enter_from", str3);
        if (C15IK.LJ().booleanValue()) {
            c0labLJIILIIL.LIZ(1, "is_editor_pro");
        } else {
            c0labLJIILIIL.LIZ(0, "is_editor_pro");
        }
        if (C1416310mxZ.LJJJJZ(videoPublishEditModel)) {
            if (musicModel != null && (similarTag = musicModel.getSimilarTag()) != null && similarTag.intValue() > 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            c0labLJIILIIL.LIZ(i2, "is_similar_music");
        }
        if (C123100dR.LIZ(str)) {
            c0labLJIILIIL.LJ("tab_name", str);
        }
        if (C123100dR.LIZ(str2)) {
            c0labLJIILIIL.LJ("music_recent_type", str2);
        }
        if (musicModel != null) {
            memeSong = musicModel.getMemeSong();
        } else {
            memeSong = null;
        }
        if (memeSong != null) {
            c0labLJIILIIL.LIZ(1, "is_meme_song");
            c0labLJIILIIL.LJ("meme_song_style", musicModel.getMemeSong().getStyle());
        } else {
            c0labLJIILIIL.LIZ(0, "is_meme_song");
            c0labLJIILIIL.LJ("meme_song_style", "");
        }
        if (C0MT6.LIZ()) {
            str4 = "recommend_music";
        } else {
            str4 = "edit_normal";
        }
        c0labLJIILIIL.LJ("music_edited_from", str4);
        c0labLJIILIIL.LIZ(C1403850mdT.LJIIIIZZ(videoPublishEditModel), "is_multi_content");
        List<Integer> list = videoPublishEditModel.creativeModel.musicBuzModel.trimPointsList;
        if (list != null && !list.isEmpty()) {
            i = 0;
        } else {
            i = 1;
        }
        c0labLJIILIIL.LIZ(i ^ 1, "has_smart_trim_point");
        c0labLJIILIIL.LJFF("is_pgc", videoPublishEditModel.creativeModel.musicBuzModel.isPGC);
        MatchedSoundInfo matchedSoundInfo = videoPublishEditModel.creativeModel.musicBuzModel.matchedSongInfo;
        if (matchedSoundInfo != null) {
            id = matchedSoundInfo.getId();
        }
        c0labLJIILIIL.LJ("meta_song_id", id);
        c0labLJIILIIL.LJ("music_selected_from", C1412490mrP.LIZIZ(videoPublishEditModel));
        c0labLJIILIIL.LJ("music_log_id", C1412490mrP.LJFF(videoPublishEditModel));
        if (videoPublishEditModel.hasExtendMusic()) {
            c0labLJIILIIL.LJ("stitched_clip_id", C13LP.LJJLIIIJ(C1429680nJ8.LIZIZ(videoPublishEditModel.creativeModel.musicBuzModel), ",", null, null, 0, null, AFwS261S0000000_22.get$arr$(114), 30));
            c0labLJIILIIL.LIZ(1, "is_smart_extend");
        }
        if (C1416310mxZ.LJJJJZ(videoPublishEditModel)) {
            str5 = "edit_music_replace";
        } else {
            str5 = "edit_music";
        }
        C20684815ws.LJIILLIIL(str5, c0labLJIILIIL.LIZ);
    }

    @Override // X.C155P
    public final void LIZIZ(MusicModel musicModel, long j, boolean z, int i) {
        String id;
        String str;
        if (musicModel != null && j > 0) {
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("music_selected_from", C1412490mrP.LIZIZ(this.LIZ));
            c0lab.LIZ(C1428470nHB.LJLIL(this.LIZ), "is_music_from_auto_edit");
            c0lab.LJ("content_source", C1428470nHB.LJIILIIL(this.LIZ));
            c0lab.LJ("content_type", C1428470nHB.LJIILL(this.LIZ));
            c0lab.LJ("shoot_way", this.LIZ.mShootWay);
            c0lab.LJ("enter_from", "video_edit_page");
            c0lab.LJ("creation_id", this.LIZ.getCreationId());
            String musicId = musicModel.getMusicId();
            if (musicId == null) {
                musicId = "";
            }
            c0lab.LJ("music_id", musicId);
            MatchedSoundInfo matchedSongInfo = musicModel.getMatchedSongInfo();
            if (matchedSongInfo != null) {
                id = matchedSongInfo.getId();
            } else {
                id = null;
            }
            c0lab.LJ("meta_song_id", id);
            c0lab.LIZ(musicModel.isPgc() ? 1 : 0, "is_pgc");
            if (z) {
                str = "auto";
            } else {
                str = "manual";
            }
            c0lab.LJ("music_selected_method", str);
            c0lab.LIZ(i, "music_show_rank");
            c0lab.LIZ(musicModel.getDuration(), "music_duration");
            c0lab.LIZIZ(System.currentTimeMillis() - j, "play_duration");
            c0lab.LIZ(1, "is_from_edit_page_panel");
            c0lab.LJ("music_log_id", C1412490mrP.LJFF(this.LIZ));
            c0lab.LIZ(0, "is_from_auto_edit");
            if (C1428470nHB.LJLIL(this.LIZ) == 1) {
                c0lab.LJ("mix_request_id", this.LIZ.creativeModel.mixEditingModel.requestId);
            }
            C565300MFc.LIZ(this.LIZ, c0lab);
            C20684815ws.LJIILLIIL("music_play_end", c0lab.LIZ);
        }
    }

    @Override // X.C155P
    public final void LIZJ(MusicModel musicModel, String str, int i, String str2) {
        int eventPosition;
        String str3;
        String str4;
        int i2;
        int i3;
        int i4;
        String str5;
        if (musicModel.getMusicItemType() == MusicModel.MusicItemType.RECOMMENDED_FAV_MUSIC) {
            eventPosition = musicModel.getEventPosition();
        } else {
            eventPosition = i + 1;
        }
        VideoPublishEditModel videoPublishEditModel = this.LIZ;
        String musicId = musicModel.getMusicId();
        String id = "";
        if (musicId == null) {
            musicId = "";
        }
        int iIntValue = musicModel.getSimilarTag().intValue();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        FlowDataMusicInfo flowDataMusicInfo = videoPublishEditModel.getCreativeFlowData().getFlowDataMusicInfo();
        if (flowDataMusicInfo != null && flowDataMusicInfo.isSelectedByAuto()) {
            str3 = "auto";
        } else {
            str3 = "manual";
        }
        c0lab.LJ("music_selected_method", str3);
        if (videoPublishEditModel.creativeModel.onThisDayData.isInOnThisDayPreviewPage()) {
            str4 = "on_this_day_page";
        } else {
            str4 = "video_edit_page";
        }
        c0lab.LJ("enter_from", str4);
        c0lab.LIZ(videoPublishEditModel.creativeModel.autoCutModel.isAutoCutPopupShow ? 1 : 0, "is_autocut_popup_show");
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0lab.LJ("tab_name", str);
        String stickers = videoPublishEditModel.getStickers();
        if (stickers == null) {
            stickers = "";
        }
        c0lab.LJ("prop_list", stickers);
        c0lab.LIZ(videoPublishEditModel.getContainBackgroundVideo() ? 1 : 0, "is_gsv_prop");
        c0lab.LJ("replace_music_content_type", C1403470mcr.LIZJ(videoPublishEditModel));
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LJ("music_id", musicId);
        c0lab.LJ("enter_method", "music_panel");
        c0lab.LIZ(eventPosition, "music_show_rank");
        C1403470mcr.LIZIZ(videoPublishEditModel, c0lab);
        String aid = null;
        if (C1416310mxZ.LJJJJZ(videoPublishEditModel)) {
            if (u.LJIJI(videoPublishEditModel.mShootWay, "change_ban_music", false)) {
                c0lab.LJ("content_type", "replace_music");
                c0lab.LJ("content_source", "replace_music");
                c0lab.LJ("mute_reason", "copyright");
            } else {
                c0lab.LJ("mute_reason", "other");
            }
            boolean zLJJJJI = C1416310mxZ.LJJJJI(videoPublishEditModel);
            String shootEnterMethod = videoPublishEditModel.getShootEnterMethod();
            C1438590nXV replaceMusicModel = videoPublishEditModel.getReplaceMusicModel();
            if (replaceMusicModel != null) {
                aid = replaceMusicModel.getAid();
            }
            C1403470mcr.LIZ(zLJJJJI ? 1 : 0, shootEnterMethod, aid, c0lab);
        }
        if (iIntValue > 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        c0lab.LIZ(i2, "is_similar_music");
        if (videoPublishEditModel.creativeModel.mdpInfoModel.fromOfflineMusicMdp) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        c0lab.LIZ(i3, "is_offline_unmuted_mdp");
        if (C123100dR.LIZ(str2)) {
            c0lab.LJ("music_recent_type", str2);
        }
        MusicObject musicObject = videoPublishEditModel.creativeModel.musicBuzModel.music;
        if (musicObject != null && musicObject.isPgc) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        c0lab.LIZ(i4, "is_pgc");
        MatchedSoundInfo matchedSoundInfo = videoPublishEditModel.creativeModel.musicBuzModel.matchedSongInfo;
        if (matchedSoundInfo != null) {
            id = matchedSoundInfo.getId();
        }
        c0lab.LJ("meta_song_id", id);
        c0lab.LJ("music_log_id", C1412490mrP.LJFF(videoPublishEditModel));
        if (videoPublishEditModel.hasExtendMusic()) {
            c0lab.LJ("stitched_clip_id", C13LP.LJJLIIIJ(C1429680nJ8.LIZIZ(videoPublishEditModel.creativeModel.musicBuzModel), ",", null, null, 0, null, AFwS261S0000000_22.get$arr$(116), 30));
            c0lab.LIZ(1, "is_smart_extend");
        }
        if (Intrinsics.LJFF(videoPublishEditModel.mShootWay, "l8_import_music_edit")) {
            c0lab.LJ("modify_reason", "automatic_addition");
        }
        if (C1416310mxZ.LJJJJZ(videoPublishEditModel)) {
            str5 = "unselect_music_replace";
        } else {
            str5 = "unselect_music";
        }
        C20684815ws.LJIILLIIL(str5, c0lab.LIZ);
    }

    @Override // X.C155P
    public final void LJ(MusicModel musicModel, String str, String str2, boolean z) {
        VideoPublishEditModel videoPublishEditModel = this.LIZ;
        C0LAB c0labLJIILIIL = C1403850mdT.LJIILIIL(videoPublishEditModel);
        c0labLJIILIIL.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0labLJIILIIL.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0labLJIILIIL.LJ("shoot_way", videoPublishEditModel.mShootWay);
        String musicId = videoPublishEditModel.getMusicId();
        if (musicId == null && (musicId = musicModel.getMusicId()) == null) {
            musicId = "";
        }
        c0labLJIILIIL.LJ("music_id", musicId);
        c0labLJIILIIL.LJ("tab_name", str);
        if (z) {
            c0labLJIILIIL.LJ("stitched_clip_id", C13LP.LJJLIIIJ(musicModel.getMergedMusicList(), ",", null, null, 0, null, AFwS261S0000000_22.get$arr$(115), 30));
            c0labLJIILIIL.LJ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "extend");
            Iterator<MusicModel> it2 = musicModel.getMergedMusicList().iterator();
            int presenterDuration = 0;
            while (it2.hasNext()) {
                presenterDuration += it2.next().getPresenterDuration();
            }
            c0labLJIILIIL.LIZJ(Float.valueOf(presenterDuration / 1000.0f), "duration");
        } else {
            c0labLJIILIIL.LJ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "unextend");
            c0labLJIILIIL.LIZJ(Float.valueOf(musicModel.getPresenterDuration() / 1000.0f), "duration");
        }
        C20684815ws.LJIILLIIL(str2, c0labLJIILIIL.LIZ);
    }

    @Override // X.C155P
    public final void LJIILL(MusicModel musicModel, String str, String str2, boolean z) {
        String str3;
        MemeSongInfo memeSongInfo;
        String imprId;
        String promoId;
        String str4;
        String str5;
        boolean z2;
        String str6;
        String aid;
        if (musicModel.getMusicItemType() == MusicModel.MusicItemType.RECOMMENDED_FAV_MUSIC) {
            str3 = "favorite_recommend";
        } else {
            str3 = null;
        }
        String musicId = musicModel.getMusicId();
        String str7 = "";
        if (musicId == null) {
            musicId = "";
        }
        int iLJIJ = LJIJ();
        VideoPublishEditModel videoPublishEditModel = this.LIZ;
        boolean z3 = this.LIZIZ;
        Music music = musicModel.getMusic();
        if (music != null) {
            memeSongInfo = music.getMemeSongInfo();
        } else {
            memeSongInfo = null;
        }
        LogPbBean logPb = musicModel.getLogPb();
        if (logPb != null) {
            imprId = logPb.getImprId();
        } else {
            imprId = null;
        }
        Music music2 = musicModel.getMusic();
        if (music2 != null) {
            promoId = music2.getPromoId();
        } else {
            promoId = null;
        }
        boolean zLJJJJZ = C1416310mxZ.LJJJJZ(videoPublishEditModel);
        if (!zLJJJJZ) {
            if (z) {
                str4 = "favourite_song";
            } else {
                str4 = "cancel_favourite_song";
            }
        } else if (zLJJJJZ) {
            if (z) {
                str4 = "favourite_song_replace";
            } else {
                str4 = "cancel_favourite_song_replace";
            }
        } else {
            throw new C1954807lC();
        }
        String strLJFF = C1412490mrP.LJFF(videoPublishEditModel);
        if (strLJFF.length() == 0) {
            if (imprId == null) {
                imprId = "";
            }
        } else {
            imprId = strLJFF;
        }
        if (Intrinsics.LJFF(videoPublishEditModel.getMusicOriginWithCheck(), "sync_page_recommend")) {
            str5 = "video_sync_page";
        } else if (videoPublishEditModel.creativeModel.commerceModel.getMusicContext().getInPromoteReplaceMusicScene()) {
            str5 = "promote";
        } else {
            str5 = "video_edit_page";
        }
        C0LAB c0labLJIILIIL = C1403850mdT.LJIILIIL(videoPublishEditModel);
        c0labLJIILIIL.LJ("music_id", musicId);
        c0labLJIILIIL.LJ("enter_from", str5);
        c0labLJIILIIL.LJ("mix_type", C1403470mcr.LJ(videoPublishEditModel));
        c0labLJIILIIL.LIZ(iLJIJ, "music_rec_type");
        c0labLJIILIIL.LIZ(z3 ? 1 : 0, "is_editor_pro");
        c0labLJIILIIL.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0labLJIILIIL.LJ("replace_music_content_type", C1403470mcr.LIZJ(videoPublishEditModel));
        String stickers = videoPublishEditModel.getStickers();
        if (stickers == null) {
            stickers = "";
        }
        c0labLJIILIIL.LJ("prop_list", stickers);
        c0labLJIILIIL.LIZ(videoPublishEditModel.getContainBackgroundVideo() ? 1 : 0, "is_gsv_prop");
        c0labLJIILIIL.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0labLJIILIIL.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0labLJIILIIL.LJ("shoot_entrance", C1403060mcC.LIZ(videoPublishEditModel, "shoot_entrance"));
        c0labLJIILIIL.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0labLJIILIIL.LJ("enter_method", "");
        c0labLJIILIIL.LJ("music_log_id", imprId);
        c0labLJIILIIL.LJ("from_group_id", C1443560nfW.LJIIIIZZ());
        c0labLJIILIIL.LJ("group_id", C1443560nfW.LJIIIIZZ());
        if (str3 != null) {
            c0labLJIILIIL.LJ("music_from", str3);
        }
        if (C1416310mxZ.LJJJJZ(videoPublishEditModel)) {
            if (u.LJIJI(videoPublishEditModel.mShootWay, "change_ban_music", false)) {
                c0labLJIILIIL.LJ("content_type", "replace_music");
                c0labLJIILIIL.LJ("content_source", "replace_music");
            }
            boolean zLJJJJI = C1416310mxZ.LJJJJI(videoPublishEditModel);
            String shootEnterMethod = videoPublishEditModel.getShootEnterMethod();
            C1438590nXV replaceMusicModel = videoPublishEditModel.getReplaceMusicModel();
            if (replaceMusicModel != null) {
                aid = replaceMusicModel.getAid();
            } else {
                aid = null;
            }
            C1403470mcr.LIZ(zLJJJJI ? 1 : 0, shootEnterMethod, aid, c0labLJIILIIL);
        }
        if (C123100dR.LIZ(str)) {
            c0labLJIILIIL.LJ("tab_name", str);
        }
        if (C123100dR.LIZ(str2)) {
            c0labLJIILIIL.LJ("music_recent_type", str2);
        }
        if (memeSongInfo != null && memeSongInfo.isMemeSong()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            c0labLJIILIIL.LIZ(1, "is_meme_song");
            String memeSongStyle = memeSongInfo.getMemeSongStyle();
            if (memeSongStyle != null) {
                str7 = memeSongStyle;
            }
            c0labLJIILIIL.LJ("meme_song_style", str7);
        } else {
            c0labLJIILIIL.LIZ(0, "is_meme_song");
            c0labLJIILIIL.LJ("meme_song_style", "");
        }
        if (C1416310mxZ.LJJJJZ(videoPublishEditModel)) {
            if (Intrinsics.LJFF("change_ban_music", videoPublishEditModel.mShootWay)) {
                str6 = "copyright";
            } else {
                str6 = "other";
            }
            c0labLJIILIIL.LJ("mute_reason", str6);
        }
        if (!C1416310mxZ.LJJJJZ(videoPublishEditModel) && z && promoId != null) {
            c0labLJIILIIL.LJ("promo_id", promoId);
        }
        if (videoPublishEditModel.hasExtendMusic()) {
            c0labLJIILIIL.LJ("stitched_clip_id", C13LP.LJJLIIIJ(C1429680nJ8.LIZIZ(videoPublishEditModel.creativeModel.musicBuzModel), ",", null, null, 0, null, AFwS261S0000000_22.get$arr$(113), 30));
            c0labLJIILIIL.LIZ(1, "is_smart_extend");
        }
        if (Intrinsics.LJFF(videoPublishEditModel.mShootWay, "l8_import_music_edit")) {
            c0labLJIILIIL.LJ("modify_reason", "automatic_addition");
        }
        C20684815ws.LJIILLIIL(str4, c0labLJIILIIL.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03e0  */
    @Override // X.C155P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(com.ss.android.ugc.aweme.shortvideo.model.MusicModel r24, java.lang.String r25, int r26, java.lang.String r27, java.lang.String r28, X.C1458260o3E r29, java.lang.String r30) {
        /*
            Method dump skipped, instruction units count: 1191
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1458190o37.LJIIIIZZ(com.ss.android.ugc.aweme.shortvideo.model.MusicModel, java.lang.String, int, java.lang.String, java.lang.String, X.0o3E, java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v54 */
    /* JADX WARN: Type inference failed for: r1v55, types: [int] */
    /* JADX WARN: Type inference failed for: r1v96 */
    /* JADX WARN: Type inference failed for: r7v2, types: [X.0LAB] */
    @Override // X.C155P
    public final void LJII(MusicModel musicModel, int i, String str, boolean z, boolean z2, String str2, C1458260o3E c1458260o3E, String str3) {
        int eventPosition;
        String str4;
        String tagTitle;
        String imprId;
        int i2;
        String imprId2;
        String strLJIILIIL;
        String str5;
        String str6;
        int i3;
        int i4;
        ?? r1;
        String id;
        String str7;
        String str8;
        String str9;
        String str10;
        String promoId;
        String recallReason;
        String str11;
        String aid;
        List<MusicTag> musicTags;
        MusicModel.MusicItemType musicItemType = musicModel.getMusicItemType();
        MusicModel.MusicItemType musicItemType2 = MusicModel.MusicItemType.RECOMMENDED_FAV_MUSIC;
        if (musicItemType == musicItemType2) {
            eventPosition = musicModel.getEventPosition();
        } else {
            eventPosition = i + 1;
        }
        if (musicModel.getMusicItemType() == musicItemType2) {
            str4 = "favorite_recommend";
        } else {
            str4 = null;
        }
        if (C1402480mbG.LIZ() && (musicTags = musicModel.getMusicTags()) != null && !musicTags.isEmpty() && C123100dR.LIZ(((MusicTag) ListProtector.get(musicModel.getMusicTags(), 0)).getTagTitle())) {
            tagTitle = ((MusicTag) ListProtector.get(musicModel.getMusicTags(), 0)).getTagTitle();
        } else {
            tagTitle = null;
        }
        VideoPublishEditModel videoPublishEditModel = this.LIZ;
        String musicId = musicModel.getMusicId();
        String str12 = "";
        if (musicId == null) {
            musicId = "";
        }
        LogPbBean logPb = musicModel.getLogPb();
        if (logPb == null || (imprId = logPb.getImprId()) == null) {
            imprId = "";
        }
        String recommendSourceFrom = musicModel.getRecommendSourceFrom();
        if (recommendSourceFrom == null) {
            recommendSourceFrom = "other_music";
        }
        C443120HZe c443120HZe = new C443120HZe(musicId, imprId, recommendSourceFrom);
        int iLJIJ = LJIJ();
        String strLIZ = C1403010mc7.LIZ.getMusicService().LIZ(musicModel);
        if (!TextUtils.isEmpty(strLIZ) && C2354709Kn.LIZIZ(strLIZ) && new C0VSJ(strLIZ).length() != 0) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        int iIntValue = musicModel.getSimilarTag().intValue();
        LogPbBean logPb2 = musicModel.getLogPb();
        if (logPb2 != null) {
            imprId2 = logPb2.getImprId();
        } else {
            imprId2 = null;
        }
        Pair pair = new Pair(Boolean.valueOf(musicModel.hasExtendMusicList()), C13LP.LJJLIIIJ(musicModel.getMergedMusicList(), ",", null, null, 0, null, AFwS261S0000000_22.get$arr$(201), 30));
        boolean zLJJJJZ = C1416310mxZ.LJJJJZ(videoPublishEditModel);
        ?? LJIILIIL = C1403850mdT.LJIILIIL(videoPublishEditModel);
        LJIILIIL.LJ("creation_id", videoPublishEditModel.getCreationId());
        String strLJIILL = "replace_music";
        if (zLJJJJZ) {
            strLJIILIIL = "replace_music";
        } else {
            strLJIILIIL = C1428470nHB.LJIILIIL(videoPublishEditModel);
        }
        LJIILIIL.LJ("content_source", strLJIILIIL);
        if (!zLJJJJZ) {
            strLJIILL = C1428470nHB.LJIILL(videoPublishEditModel);
        }
        LJIILIIL.LJ("content_type", strLJIILL);
        LJIILIIL.LJ("shoot_way", videoPublishEditModel.mShootWay);
        LJIILIIL.LIZ(z2 ? 1 : 0, "is_editor_pro");
        if (videoPublishEditModel.creativeModel.onThisDayData.isInOnThisDayPreviewPage()) {
            str5 = "on_this_day_page";
        } else {
            str5 = "video_edit_page";
        }
        LJIILIIL.LJ("enter_from", str5);
        LJIILIIL.LJ("music_id", (String) c443120HZe.getFirst());
        LJIILIIL.LIZ(videoPublishEditModel.getContainBackgroundVideo() ? 1 : 0, "is_gsv_prop");
        LJIILIIL.LJ("music_request_id", (String) c443120HZe.getSecond());
        if (z) {
            str6 = "auto";
        } else {
            str6 = "manual";
        }
        LJIILIIL.LJ("music_selected_method", str6);
        LJIILIIL.LIZ(videoPublishEditModel.getPreviewInfo().getPreviewVideoLength(), "creation_duration");
        LJIILIIL.LIZ(eventPosition, "music_show_rank");
        LJIILIIL.LIZ(i2, "is_loading");
        LJIILIIL.LJ("recommend_source_from", (String) c443120HZe.getThird());
        LJIILIIL.LIZ(iLJIJ, "music_rec_type");
        LJIILIIL.LJ("tab_name", str);
        LJIILIIL.LJ("replace_music_content_type", C1403470mcr.LIZJ(videoPublishEditModel));
        LJIILIIL.LIZ(videoPublishEditModel.creativeModel.audioCopyrightDetectModel.getCopyrightClaimShowing() ? 1 : 0, "is_copyright_claim");
        LJIILIIL.LIZ(videoPublishEditModel.creativeModel.audioCopyrightDetectModel.getDetectScenes().contains(Integer.valueOf(C0FPS.SHORT_VIDEO.getScene())) ? 1 : 0, "is_short_video");
        LJIILIIL.LIZ(videoPublishEditModel.creativeModel.autoCutModel.isAutoCutPopupShow ? 1 : 0, "is_autocut_popup_show");
        LJIILIIL.LIZ(videoPublishEditModel.creativeModel.audioCopyrightDetectModel.getDetectScenes().contains(Integer.valueOf(C0FPS.ECOMMERCE.getScene())) ? 1 : 0, "is_ecommerce_video");
        LJIILIIL.LIZ(videoPublishEditModel.hasOriginalSound(false) ? 1 : 0, "has_original_sound");
        LJIILIIL.LIZ(videoPublishEditModel.creativeModel.audioCopyrightDetectModel.getDetectScenes().contains(Integer.valueOf(C0FPS.LONG_VIDEO.getScene())) ? 1 : 0, "is_long_video");
        LJIILIIL.LJI(new C15M8().LJFF("is_promote_pa"));
        if (iIntValue > 0) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        LJIILIIL.LIZ(i3, "is_similar_music");
        if (videoPublishEditModel.creativeModel.mdpInfoModel.fromOfflineMusicMdp) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        LJIILIIL.LIZ(i4, "is_offline_unmuted_mdp");
        if (zLJJJJZ) {
            boolean zLJJJJI = C1416310mxZ.LJJJJI(videoPublishEditModel);
            String shootEnterMethod = videoPublishEditModel.getShootEnterMethod();
            C1438590nXV replaceMusicModel = videoPublishEditModel.getReplaceMusicModel();
            if (replaceMusicModel != null) {
                aid = replaceMusicModel.getAid();
            } else {
                aid = null;
            }
            C1403470mcr.LIZ(zLJJJJI ? 1 : 0, shootEnterMethod, aid, LJIILIIL);
        }
        if (tagTitle != null) {
            LJIILIIL.LJ("tag", tagTitle);
        }
        if (str4 != null) {
            LJIILIIL.LJ("music_from", str4);
        }
        if (C123100dR.LIZ(str2)) {
            LJIILIIL.LJ("music_recent_type", str2);
        }
        MusicObject musicObject = videoPublishEditModel.creativeModel.musicBuzModel.music;
        if (musicObject != null) {
            r1 = musicObject.isPgc;
        } else {
            r1 = 0;
        }
        LJIILIIL.LIZ(r1, "is_pgc");
        MatchedSoundInfo matchedSoundInfo = videoPublishEditModel.creativeModel.musicBuzModel.matchedSongInfo;
        if (matchedSoundInfo == null) {
            id = "";
        } else {
            id = matchedSoundInfo.getId();
        }
        LJIILIIL.LJ("meta_song_id", id);
        if (imprId2 != null) {
            str12 = imprId2;
        }
        LJIILIIL.LJ("music_log_id", str12);
        if (zLJJJJZ) {
            if (Intrinsics.LJFF("change_ban_music", videoPublishEditModel.mShootWay)) {
                str11 = "copyright";
            } else {
                str11 = "other";
            }
            LJIILIIL.LJ("mute_reason", str11);
        }
        if (((Boolean) pair.getFirst()).booleanValue()) {
            LJIILIIL.LJ("stitched_clip_id", (String) pair.getSecond());
            LJIILIIL.LIZ(1, "is_smart_extend");
        }
        LJIILIIL.LJ("music_selected_from", C1412490mrP.LIZIZ(videoPublishEditModel));
        boolean zIsOffline = musicModel.isOffline();
        String str13 = CardStruct.IStatusCode.DEFAULT;
        if (!zIsOffline) {
            str7 = "1";
        } else {
            str7 = CardStruct.IStatusCode.DEFAULT;
        }
        LJIILIIL.LJ("is_available", str7);
        if (musicModel.isSimilarMusic()) {
            str8 = "1";
        } else {
            str8 = CardStruct.IStatusCode.DEFAULT;
        }
        LJIILIIL.LJ("is_offline_similar_added", str8);
        if (iIntValue > 0) {
            Music music = musicModel.getMusic();
            if (music != null) {
                recallReason = music.getRecallReason();
            } else {
                recallReason = null;
            }
            LJIILIIL.LJ("music_rec_reason", recallReason);
        }
        if (!zLJJJJZ) {
            LJIILIIL.LIZ(C1457560o26.LIZ(videoPublishEditModel.creativeModel), "pic_cnt");
            LJIILIIL.LIZ(videoPublishEditModel.creativeModel.albumModel.videoCount, "video_cnt");
            Music music2 = musicModel.getMusic();
            if (music2 != null && (promoId = music2.getPromoId()) != null) {
                LJIILIIL.LJ("promo_id", promoId);
            }
        }
        if (Intrinsics.LJFF(videoPublishEditModel.mShootWay, "l8_import_music_edit")) {
            LJIILIIL.LJ("modify_reason", "automatic_addition");
        }
        String str14 = c1458260o3E.LIZIZ;
        if (str14 != null) {
            LJIILIIL.LJ("favorite_tab_name", str14);
        }
        String str15 = c1458260o3E.LIZJ;
        if (str15 != null) {
            LJIILIIL.LJ("group_id", str15);
        }
        if (C1403850mdT.LJFF(videoPublishEditModel)) {
            if (musicModel.hasLyricsCopyRight()) {
                str10 = "1";
            } else {
                str10 = CardStruct.IStatusCode.DEFAULT;
            }
            LJIILIIL.LJ("music_lyrics_status", str10);
            if (c1458260o3E.LIZLLL) {
                str13 = "1";
            }
            LJIILIIL.LJ("lyrics_sticker_status", str13);
        }
        if (zLJJJJZ) {
            str9 = "select_music_replace";
        } else {
            str9 = "select_music";
        }
        C20684815ws.LJIILLIIL(str9, LJIILIIL.LIZ);
    }
}
