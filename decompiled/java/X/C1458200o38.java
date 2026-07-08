package X;

import android.text.TextUtils;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.creative.model.CollectMusicModel;
import com.ss.android.ugc.aweme.creative.model.CreativeInitialModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.music.model.MatchedSoundInfo;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.MemeSongModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0o38, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1458200o38 implements C155P {
    public final ShortVideoContext LIZ;

    @Override // X.C155P
    public final void LIZ() {
    }

    @Override // X.C155P
    public final void LJ(MusicModel musicModel, String str, String str2, boolean z) {
    }

    @Override // X.C155P
    public final void LJIIIZ() {
    }

    @Override // X.C155P
    public final void LJIIJ(String str) {
    }

    @Override // X.C155P
    public final void LJIIL(boolean z) {
    }

    @Override // X.C155P
    public final void LJIILJJIL(String str) {
    }

    @Override // X.C155P
    public final void LJIILLIIL(String str) {
    }

    @Override // X.C155P
    public final void z3() {
    }

    public C1458200o38(ShortVideoContext shortVideoContext) {
        this.LIZ = shortVideoContext;
    }

    @Override // X.C155P
    public final void LJIIJJI(String str) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", "video_shoot_page");
        c0lab.LJ("favorite_tab_name", str);
        C20684815ws.LJIILLIIL("enter_favorite_music_tab", c0lab.LIZ);
    }

    @Override // X.C155P
    public final void LJIILIIL(int i, String str) {
        MusicBuzModel musicBuzModel = this.LIZ.creativeModel.musicBuzModel;
        musicBuzModel.musicShowRank = i;
        musicBuzModel.hotTabChartRegion = str;
    }

    @Override // X.C155P
    public final void LIZLLL(String str, boolean z, boolean z2) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", "video_shoot_page");
        c0lab.LJ("shoot_page", "video_shoot_page");
        c0lab.LJ("shoot_way", this.LIZ.shootWay);
        c0lab.LIZ(0, "is_editor_pro");
        c0lab.LIZ(0, "creation_duration");
        c0lab.LJ("content_source", "shoot");
        c0lab.LJ("content_type", this.LIZ.LJ().getContentType());
        c0lab.LJ("prop_list", this.LIZ.presetEffectId);
        c0lab.LIZ(this.LIZ.LIZIZ() ? 1 : 0, "is_gsv_prop");
        c0lab.LIZ(z2 ? 1 : 0, "is_multi_music");
        c0lab.LJ("creation_id", this.LIZ.getCreationId());
        c0lab.LJ("tab_name", str);
        c0lab.LJ("shoot_tab_name", this.LIZ.LJIJJLI());
        c0lab.LIZ(z ? 1 : 0, "is_slide");
        C20684815ws.LJIILLIIL("enter_music_tab", c0lab.LIZ);
    }

    @Override // X.C155P
    public final void LJFF(MusicModel musicModel, String str, String str2) {
        CreativeInitialModel creativeInitialModel;
        CollectMusicModel collectMusicModel;
        this.LIZ.LJJLIIIJILLIZJL(new C1458230o3B().apply(new C1458250o3D("shoot_music_panel", null, str, str2, 26)));
        CreativeModel creativeModel = this.LIZ.creativeModel;
        if (creativeModel != null && (creativeInitialModel = creativeModel.initialModel) != null && (collectMusicModel = creativeInitialModel.collectMusicModel) != null) {
            collectMusicModel.setSelectedMusicFavoriteTabName(str2);
        }
    }

    @Override // X.C155P
    public final void LJI(MusicModel musicModel, String str, String str2) {
        String musicId;
        Boolean boolValueOf;
        String id;
        int i;
        String str3;
        MatchedSoundInfo matchedSongInfo;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", "video_shoot_page");
        c0lab.LJ("creation_id", this.LIZ.getCreationId());
        c0lab.LJ("content_source", "shoot");
        c0lab.LJ("content_type", this.LIZ.LJ().getContentType());
        c0lab.LJ("enter_method", "music_panel");
        c0lab.LJ("shoot_way", this.LIZ.shootWay);
        if (musicModel == null || (musicId = musicModel.getMusicId()) == null) {
            musicId = "";
        }
        c0lab.LJ("music_id", musicId);
        MemeSongModel memeSong = null;
        if (musicModel != null) {
            boolValueOf = Boolean.valueOf(musicModel.isPgc());
        } else {
            boolValueOf = null;
        }
        c0lab.LIZLLL(boolValueOf, "is_pgc");
        if (musicModel != null && (matchedSongInfo = musicModel.getMatchedSongInfo()) != null) {
            id = matchedSongInfo.getId();
        } else {
            id = null;
        }
        c0lab.LJ("meta_song_id", id);
        List<Integer> list = this.LIZ.creativeModel.musicBuzModel.trimPointsList;
        if (list != null && !list.isEmpty()) {
            i = 0;
        } else {
            i = 1;
        }
        c0lab.LIZ(i ^ 1, "has_smart_trim_point");
        c0lab.LIZ(0, "is_multi_content");
        c0lab.LJ("music_selected_from", C1444890nhf.LIZ(this.LIZ));
        ShortVideoContext shortVideoContext = this.LIZ;
        c0lab.LJ("music_log_id", C1412490mrP.LJ(shortVideoContext, shortVideoContext.LJIIJJI()));
        if (C0MT6.LIZ()) {
            str3 = "recommend_music";
        } else {
            str3 = "edit_normal";
        }
        c0lab.LJ("music_edited_from", str3);
        if (musicModel != null) {
            memeSong = musicModel.getMemeSong();
        }
        if (memeSong != null) {
            c0lab.LIZ(1, "is_meme_song");
            c0lab.LJ("meme_song_style", musicModel.getMemeSong().getStyle());
        } else {
            c0lab.LIZ(0, "is_meme_song");
            c0lab.LJ("meme_song_style", "");
        }
        C20684815ws.LJIILLIIL("edit_music", c0lab.LIZ);
    }

    @Override // X.C155P
    public final void LIZIZ(MusicModel musicModel, long j, boolean z, int i) {
        String strLJIIJJI;
        String id;
        String str;
        String imprId;
        if (musicModel != null && j > 0) {
            String str2 = "";
            if (C298260Bma.LIZ()) {
                strLJIIJJI = C1444890nhf.LIZ(this.LIZ);
            } else {
                strLJIIJJI = this.LIZ.LJIIJJI();
                if (strLJIIJJI == null) {
                    strLJIIJJI = "";
                }
            }
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("music_selected_from", strLJIIJJI);
            c0lab.LJ("content_source", "shoot");
            c0lab.LJ("content_type", this.LIZ.LJ().getContentType());
            c0lab.LJ("shoot_way", this.LIZ.shootWay);
            c0lab.LJ("enter_from", "video_shoot_page");
            c0lab.LJ("creation_id", this.LIZ.getCreationId());
            String musicId = musicModel.getMusicId();
            if (musicId == null) {
                musicId = "";
            }
            c0lab.LJ("music_id", musicId);
            if (musicModel.getMatchedSongInfo() == null) {
                id = "";
            } else {
                id = musicModel.getMatchedSongInfo().getId();
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
            c0lab.LIZ(0, "is_from_edit_page_panel");
            c0lab.LIZ(0, "is_from_auto_edit");
            LogPbBean logPb = musicModel.getLogPb();
            if (logPb != null && (imprId = logPb.getImprId()) != null) {
                str2 = imprId;
            }
            c0lab.LJ("music_log_id", str2);
            C20684815ws.LJIILLIIL("music_play_end", c0lab.LIZ);
        }
    }

    @Override // X.C155P
    public final void LIZJ(MusicModel musicModel, String str, int i, String str2) {
        String strLJIIJJI;
        int i2;
        String id = "";
        if (C298260Bma.LIZ()) {
            strLJIIJJI = C1444890nhf.LIZ(this.LIZ);
        } else {
            strLJIIJJI = this.LIZ.LJIIJJI();
            if (strLJIIJJI == null) {
                strLJIIJJI = "";
            }
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", "video_shoot_page");
        c0lab.LJ("creation_id", this.LIZ.getCreationId());
        c0lab.LJ("content_source", "shoot");
        c0lab.LJ("content_type", this.LIZ.LJ().getContentType());
        c0lab.LJ("shoot_way", this.LIZ.shootWay);
        String musicId = musicModel.getMusicId();
        if (musicId == null) {
            musicId = "";
        }
        c0lab.LJ("music_id", musicId);
        c0lab.LJ("music_selected_from", strLJIIJJI);
        c0lab.LIZ(musicModel.isPgc() ? 1 : 0, "is_pgc");
        int i3 = 0;
        if (musicModel.getMatchedSongInfo() != null) {
            id = musicModel.getMatchedSongInfo().getId();
        }
        c0lab.LJ("meta_song_id", id);
        if (musicModel.getSimilarTag().intValue() > 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        c0lab.LIZ(i2, "is_similar_music");
        if (this.LIZ.creativeModel.mdpInfoModel.fromOfflineMusicMdp) {
            i3 = 1;
        }
        c0lab.LIZ(i3, "is_offline_unmuted_mdp");
        ShortVideoContext shortVideoContext = this.LIZ;
        c0lab.LJ("music_log_id", C1412490mrP.LJ(shortVideoContext, shortVideoContext.LJIIJJI()));
        c0lab.LJ("enter_method", "music_panel");
        C20684815ws.LJIILLIIL("unselect_music", c0lab.LIZ);
    }

    @Override // X.C155P
    public final void LJIILL(MusicModel musicModel, String str, String str2, boolean z) {
        String imprId;
        boolean z2;
        String promoId;
        String memeSongStyle;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", "video_shoot_page");
        c0lab.LJ("creation_id", this.LIZ.getCreationId());
        c0lab.LJ("content_source", "shoot");
        c0lab.LJ("content_type", this.LIZ.LJ().getContentType());
        c0lab.LJ("enter_method", this.LIZ.enterMethod);
        c0lab.LJ("shoot_way", this.LIZ.shootWay);
        String musicId = musicModel.getMusicId();
        String strLJIIIIZZ = "";
        if (musicId == null) {
            musicId = "";
        }
        c0lab.LJ("music_id", musicId);
        LogPbBean logPb = musicModel.getLogPb();
        if (logPb == null || (imprId = logPb.getImprId()) == null) {
            imprId = "";
        }
        c0lab.LJ("music_log_id", imprId);
        c0lab.LJ("from_group_id", C1443560nfW.LJIIIIZZ());
        c0lab.LJ("group_id", C1443560nfW.LJIIIIZZ());
        Music music = musicModel.getMusic();
        if (music != null && music.isMemeSong()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            c0lab.LIZ(1, "is_meme_song");
            Music music2 = musicModel.getMusic();
            if (music2 != null) {
                memeSongStyle = music2.getMemeSongStyle();
            } else {
                memeSongStyle = null;
            }
            c0lab.LJ("meme_song_style", memeSongStyle);
        } else {
            c0lab.LIZ(0, "is_meme_song");
            c0lab.LJ("meme_song_style", "");
        }
        Music music3 = musicModel.getMusic();
        if (music3 != null && (promoId = music3.getPromoId()) != null) {
            c0lab.LJ("promo_id", promoId);
        }
        if (C1443560nfW.LJIIIIZZ() != null) {
            strLJIIIIZZ = C1443560nfW.LJIIIIZZ();
        }
        c0lab.LJ("group_id", strLJIIIIZZ);
        C20684815ws.LJIILLIIL("favourite_song", c0lab.LIZ);
    }

    @Override // X.C155P
    public final void LJIIIIZZ(MusicModel musicModel, String str, int i, String str2, String str3, C1458260o3E c1458260o3E, String str4) {
        String str5;
        boolean z;
        int i2;
        int i3;
        String str6;
        String str7;
        Pair pair;
        String imprId;
        String imprId2;
        String recallReason;
        String recallReason2;
        String promoId;
        String promoId2;
        if (Intrinsics.LJFF(str, EnumC1654750tA9.TAB_AI.getStringValue())) {
            str5 = "shoot_page_recommend";
        } else if (Intrinsics.LJFF(str, EnumC1654750tA9.TAB_COLLECT.getStringValue())) {
            if (Intrinsics.LJFF(c1458260o3E.LIZIZ, EnumC1458240o3C.POST.getValue())) {
                str5 = "shoot_page_recommend_favourite_video";
            } else {
                str5 = "shoot_page_recommend_favourite";
            }
        } else if (Intrinsics.LJFF(str, EnumC1654750tA9.TAB_RECENT.getStringValue())) {
            str5 = "shoot_page_recent";
        } else if (Intrinsics.LJFF(str, EnumC1654750tA9.TAB_HOT.getStringValue())) {
            str5 = "shoot_page_hot_music";
        } else {
            str5 = "prop_panel_discovery";
        }
        if (c1458260o3E.LIZ != null && Intrinsics.LJFF(str, EnumC1654750tA9.TAB_HOT.getStringValue())) {
            str5 = "shoot_page_hot_music_video";
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", this.LIZ.getCreationId());
        c0lab.LJ("content_source", "shoot");
        c0lab.LJ("content_type", this.LIZ.LJ().getContentType());
        c0lab.LJ("shoot_way", this.LIZ.shootWay);
        String musicId = musicModel.getMusicId();
        String id = "";
        if (musicId == null) {
            musicId = "";
        }
        c0lab.LJ("music_id", musicId);
        c0lab.LJ("tab_name", str);
        c0lab.LIZ(i + 1, "music_show_rank");
        c0lab.LIZ(musicModel.isPgc() ? 1 : 0, "is_pgc");
        if (musicModel.getMatchedSongInfo() != null) {
            id = musicModel.getMatchedSongInfo().getId();
        }
        c0lab.LJ("meta_song_id", id);
        String recommendSourceFrom = musicModel.getRecommendSourceFrom();
        if (recommendSourceFrom == null) {
            recommendSourceFrom = "other_music";
        }
        c0lab.LJ("recommend_source_from", recommendSourceFrom);
        c0lab.LJ("enter_from", "video_shoot_page");
        c0lab.LJ("music_from", str5);
        Music music = musicModel.getMusic();
        if (music != null && (promoId2 = music.getPromoId()) != null && promoId2.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        Pair pair2 = null;
        if (z) {
            Music music2 = musicModel.getMusic();
            if (music2 != null) {
                promoId = music2.getPromoId();
            } else {
                promoId = null;
            }
            c0lab.LJ("promo_id", promoId);
        }
        Music music3 = musicModel.getMusic();
        if (music3 != null && (recallReason = music3.getRecallReason()) != null && recallReason.length() > 0) {
            Music music4 = musicModel.getMusic();
            if (music4 != null) {
                recallReason2 = music4.getRecallReason();
            } else {
                recallReason2 = null;
            }
            c0lab.LJ("music_rec_reason", recallReason2);
        }
        LogPbBean logPb = musicModel.getLogPb();
        if (logPb != null && (imprId = logPb.getImprId()) != null && imprId.length() > 0) {
            LogPbBean logPb2 = musicModel.getLogPb();
            if (logPb2 != null) {
                imprId2 = logPb2.getImprId();
            } else {
                imprId2 = null;
            }
            c0lab.LJ("music_log_id", imprId2);
        }
        Integer similarTag = musicModel.getSimilarTag();
        if (similarTag != null && similarTag.intValue() > 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        c0lab.LIZ(i2, "is_similar_music");
        if (this.LIZ.creativeModel.mdpInfoModel.fromOfflineMusicMdp) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        c0lab.LIZ(i3, "is_offline_unmuted_mdp");
        c0lab.LIZ(C1457560o26.LIZ(this.LIZ.creativeModel), "pic_cnt");
        c0lab.LIZ(this.LIZ.creativeModel.albumModel.videoCount, "video_cnt");
        boolean zIsOffline = musicModel.isOffline();
        String str8 = CardStruct.IStatusCode.DEFAULT;
        if (!zIsOffline) {
            str6 = "1";
        } else {
            str6 = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab.LJ("is_available", str6);
        if (musicModel.isSimilarMusic()) {
            str7 = "1";
        } else {
            str7 = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab.LJ("is_offline_similar_added", str7);
        c0lab.LJFF("from_recommend", musicModel.fromRecommend);
        Boolean bool = c1458260o3E.LIZ;
        if (bool != null) {
            if (bool.booleanValue()) {
                str8 = "1";
            }
            c0lab.LJ("is_hot_music_effect_video", str8);
        }
        c0lab.LJ("chart_region", str4);
        Pair[] pairArr = new Pair[2];
        Long lValueOf = Long.valueOf(musicModel.simGroupIdV3);
        if (lValueOf.longValue() != 0) {
            pair = new Pair("sim_group_id_v3", Long.valueOf(lValueOf.longValue()));
        } else {
            pair = null;
        }
        pairArr[0] = pair;
        Long lValueOf2 = Long.valueOf(musicModel.sameGroupIdV3);
        if (lValueOf2.longValue() != 0) {
            pair2 = new Pair("same_group_id_v3", Long.valueOf(lValueOf2.longValue()));
        }
        pairArr[1] = pair2;
        for (Pair pair3 : (ArrayList) C13LQ.LJIJI(pairArr)) {
            c0lab.LIZIZ(((Number) pair3.getSecond()).longValue(), (String) pair3.getFirst());
        }
        String str9 = c1458260o3E.LIZIZ;
        if (str9 != null) {
            c0lab.LJ("favorite_tab_name", str9);
        }
        String str10 = c1458260o3E.LIZJ;
        if (str10 != null) {
            c0lab.LJ("group_id", str10);
        }
        C20684815ws.LJIILLIIL("music_show", c0lab.LIZ);
    }

    @Override // X.C155P
    public final void LJII(MusicModel musicModel, int i, String str, boolean z, boolean z2, String str2, C1458260o3E c1458260o3E, String str3) {
        String str4;
        int eventPosition;
        int i2;
        String id;
        String str5;
        String str6;
        int i3;
        String promoId;
        String imprId;
        boolean zLJI = MethodIDManager.LJI(202428);
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", this.LIZ.getCreationId());
        c0lab.LJ("content_source", "shoot");
        c0lab.LJ("content_type", this.LIZ.LJ().getContentType());
        c0lab.LJ("shoot_way", this.LIZ.shootWay);
        String musicId = musicModel.getMusicId();
        String str7 = "";
        if (musicId == null) {
            musicId = "";
        }
        c0lab.LJ("music_id", musicId);
        c0lab.LJ("tab_name", str);
        String recommendSourceFrom = musicModel.getRecommendSourceFrom();
        if (recommendSourceFrom == null) {
            recommendSourceFrom = "other_music";
        }
        c0lab.LJ("recommend_source_from", recommendSourceFrom);
        if (z) {
            str4 = "auto";
        } else {
            str4 = "manual";
        }
        c0lab.LJ("music_selected_method", str4);
        int i4 = 1;
        if (musicModel.getMusicItemType() == MusicModel.MusicItemType.RECOMMENDED_FAV_MUSIC) {
            eventPosition = musicModel.getEventPosition();
        } else {
            eventPosition = i + 1;
        }
        c0lab.LIZ(eventPosition, "music_show_rank");
        String strLIZ = C1403010mc7.LIZ.getMusicService().LIZ(musicModel);
        int i5 = 0;
        if (!TextUtils.isEmpty(strLIZ) && C2354709Kn.LIZIZ(strLIZ) && new C0VSJ(strLIZ).length() != 0) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        c0lab.LIZ(i2, "is_loading");
        c0lab.LIZ(musicModel.isPgc() ? 1 : 0, "is_pgc");
        if (musicModel.getMatchedSongInfo() == null) {
            id = "";
        } else {
            id = musicModel.getMatchedSongInfo().getId();
        }
        c0lab.LJ("meta_song_id", id);
        LogPbBean logPb = musicModel.getLogPb();
        if (logPb != null && (imprId = logPb.getImprId()) != null) {
            str7 = imprId;
        }
        c0lab.LJ("music_log_id", str7);
        c0lab.LJ("music_selected_from", C1444890nhf.LIZ(this.LIZ));
        c0lab.LJ("enter_from", "video_shoot_page");
        boolean zIsOffline = musicModel.isOffline();
        String str8 = CardStruct.IStatusCode.DEFAULT;
        if (!zIsOffline) {
            str5 = "1";
        } else {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab.LJ("is_available", str5);
        if (musicModel.isSimilarMusic()) {
            str6 = "1";
        } else {
            str6 = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab.LJ("is_offline_similar_added", str6);
        if (this.LIZ.creativeModel.mdpInfoModel.fromOfflineMusicMdp) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        c0lab.LIZ(i3, "is_offline_unmuted_mdp");
        Integer similarTag = musicModel.getSimilarTag();
        if (similarTag != null) {
            if (similarTag.intValue() <= 0) {
                i4 = 0;
            }
            i5 = i4;
        }
        c0lab.LIZ(i5, "is_similar_music");
        c0lab.LIZ(C1457560o26.LIZ(this.LIZ.creativeModel), "pic_cnt");
        c0lab.LIZ(this.LIZ.creativeModel.albumModel.videoCount, "video_cnt");
        c0lab.LJ("chart_region", str3);
        Boolean bool = c1458260o3E.LIZ;
        if (bool != null) {
            if (bool.booleanValue()) {
                str8 = "1";
            }
            c0lab.LJ("is_hot_music_effect_video", str8);
        }
        Music music = musicModel.getMusic();
        if (music != null && (promoId = music.getPromoId()) != null) {
            c0lab.LJ("promo_id", promoId);
        }
        String str9 = c1458260o3E.LIZIZ;
        if (str9 != null) {
            c0lab.LJ("favorite_tab_name", str9);
        }
        String str10 = c1458260o3E.LIZJ;
        if (str10 != null) {
            c0lab.LJ("group_id", str10);
        }
        C20684815ws.LJIILLIIL("select_music", c0lab.LIZ);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
