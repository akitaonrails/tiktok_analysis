package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.common.LogPbBean;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzCompatModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicCompatModel;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.music.model.LyricSceneCopyRight;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.15KO, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15KO {
    public static MusicModel LIZ(AVMusic aVMusic) {
        ArrayList arrayList;
        Challenge challenge;
        LyricSceneCopyRight lyricSceneCopyRightCopy;
        MusicModel.CollectionType collectionType;
        ArrayList arrayList2;
        boolean z;
        String imprId;
        boolean lyricSticker;
        LyricSceneCopyRight lyricSceneCopyRight;
        MusicModel musicModel = new MusicModel();
        musicModel.setMusicId(aVMusic.getMusicId());
        musicModel.setId(aVMusic.getId());
        musicModel.sameGroupIdV3 = aVMusic.sameGroupIdV3;
        musicModel.simGroupIdV3 = aVMusic.simGroupIdV3;
        musicModel.setAlbum(aVMusic.getAlbum());
        musicModel.setName(aVMusic.getMusicName());
        musicModel.setAlbum(aVMusic.getAlbum());
        boolean z2 = false;
        if (aVMusic.getCoverMedium() != null && !C086I.LIZIZ(aVMusic.getCoverMedium().getUrlList())) {
            musicModel.setPicPremium((String) ListProtector.get(aVMusic.getCoverMedium().getUrlList(), 0));
        }
        if (aVMusic.getCoverThumb() != null && !C086I.LIZIZ(aVMusic.getCoverThumb().getUrlList())) {
            musicModel.setPicSmall((String) ListProtector.get(aVMusic.getCoverThumb().getUrlList(), 0));
        }
        musicModel.setLocalPath(aVMusic.getPath());
        musicModel.setSinger(aVMusic.getSinger());
        if (aVMusic.getMusicType() == 1) {
            musicModel.setUrl(aVMusic.getPlayUrl());
        }
        if (aVMusic.getMusicType() == 2) {
            musicModel.setReuseAudioPlayUrl(aVMusic.getReuseAudioPlayUrl());
        }
        musicModel.setDuration(aVMusic.getDuration());
        musicModel.setShootDuration(Integer.valueOf(aVMusic.getShootDuration()));
        musicModel.setAuditionDuration(Integer.valueOf(aVMusic.getAuditionDuration()));
        musicModel.setDurationHighPrecision(aVMusic.durationHighPrecision);
        if (aVMusic.isLocalMusic()) {
            musicModel.setMusicType(aVMusic.getMusicType());
        }
        if (aVMusic.getMusicType() == 1) {
            musicModel.setMusicType(1);
        }
        if (aVMusic.getMusicType() == 2) {
            musicModel.setMusicType(2);
        }
        musicModel.setOfflineDesc(aVMusic.getOfflineDesc());
        musicModel.setMusicStatus(aVMusic.getMusicStatus());
        musicModel.setStrongBeatUrl(aVMusic.getStrongBeatUrl());
        musicModel.setLrcUrl(aVMusic.getLrcUrl());
        musicModel.setLrcType(aVMusic.getLrcType());
        musicModel.setLyricContent(aVMusic.getLyricContent());
        musicModel.setLyricContentType(aVMusic.getLyricContentType());
        musicModel.setLyrics(aVMusic.getLyrics());
        musicModel.setOffline(aVMusic.isOfflineMusic());
        musicModel.setSimilarMusic(aVMusic.isSimilarMusic());
        List<AVMusic> similarMusicList = aVMusic.getSimilarMusicList();
        String musicRootPageFrom = null;
        if (similarMusicList != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(similarMusicList, 10));
            Iterator<AVMusic> it2 = similarMusicList.iterator();
            while (it2.hasNext()) {
                arrayList.add(LIZ(it2.next()));
            }
        } else {
            arrayList = null;
        }
        musicModel.setSimilarMusicList(arrayList);
        musicModel.setUserCount(aVMusic.userCount);
        musicModel.setMusicTags(aVMusic.getMusicTags());
        musicModel.setSimilarTag(Integer.valueOf(aVMusic.similarTag));
        musicModel.setRecommendSourceFrom(aVMusic.recommendSourceFrom);
        musicModel.setPreviewStartTime(aVMusic.getPreviewStartTime());
        musicModel.setExtra(aVMusic.extra);
        Music music = new Music();
        music.setMemeSongInfo(aVMusic.getMemeSongInfo());
        music.setLyricContent(aVMusic.getLyricContent());
        music.setLyricContentType(aVMusic.getLyricContentType());
        music.setPromoId(aVMusic.getPromoId());
        music.setPromotionTag(aVMusic.getPromotionTag());
        music.setRecallReason(aVMusic.getRecallReason());
        AVChallenge aVChallenge = aVMusic.challenge;
        if (aVChallenge == null) {
            challenge = null;
        } else {
            challenge = new Challenge();
            challenge.setCid(aVChallenge.cid);
            challenge.setChallengeName(aVChallenge.challengeName);
            challenge.setStickerId(aVChallenge.stickerId);
            challenge.setType(aVChallenge.type);
            challenge.setViewCount(aVChallenge.viewCount);
            challenge.setUserCount(aVChallenge.userCount);
            if (aVChallenge.isCommerce) {
                challenge.setSubType(1);
            }
            challenge.setAvMusicId(aVChallenge.musicId);
            challenge.setMvId(aVChallenge.mvId);
            challenge.setStrongMusic(aVChallenge.isStrongMusic);
        }
        music.setChallenge(challenge);
        LyricSceneCopyRight lyricSceneCopyRight2 = aVMusic.getMusicCompatModel().getLyricSceneCopyRight();
        if (lyricSceneCopyRight2 != null) {
            MusicCompatModel musicCompatModel = aVMusic.getMusicCompatModel();
            if (musicCompatModel != null && (lyricSceneCopyRight = musicCompatModel.getLyricSceneCopyRight()) != null) {
                lyricSticker = lyricSceneCopyRight.getLyricSticker();
            } else {
                lyricSticker = false;
            }
            lyricSceneCopyRightCopy = lyricSceneCopyRight2.copy(lyricSticker);
        } else {
            lyricSceneCopyRightCopy = null;
        }
        music.setLyricSceneCopyRight(lyricSceneCopyRightCopy);
        musicModel.setMusic(music);
        if (aVMusic.isCollected()) {
            collectionType = MusicModel.CollectionType.COLLECTED;
        } else {
            collectionType = MusicModel.CollectionType.NOT_COLLECTED;
        }
        musicModel.setCollectionType(collectionType);
        musicModel.setNeedSetCookie(aVMusic.isNeedSetCookie());
        musicModel.setVideoDuration(aVMusic.getVideoDuration());
        musicModel.setPgc(aVMusic.isPgc());
        musicModel.setMatchedPGCSoundInfo(aVMusic.getMatchedPGCSoundInfo());
        musicModel.setMatchedSoundInfo(aVMusic.getMatchedSongInfo());
        musicModel.setBeatInfo(aVMusic.getMusicBeat());
        musicModel.setLocalMusicDuration(aVMusic.getLocalMusicDuration());
        musicModel.setLocalMusicId(aVMusic.getLocalMusicId());
        musicModel.isBestMatch = aVMusic.isBestMatch();
        musicModel.setMuteShare(aVMusic.isMuteShare());
        LogPbBean logPb = aVMusic.getLogPb();
        if (logPb != null && logPb.getImprId() != null) {
            com.ss.android.ugc.aweme.feed.model.LogPbBean logPbBean = new com.ss.android.ugc.aweme.feed.model.LogPbBean();
            LogPbBean logPb2 = aVMusic.getLogPb();
            if (logPb2 != null) {
                imprId = logPb2.getImprId();
            } else {
                imprId = null;
            }
            logPbBean.setImprId(imprId);
            musicModel.setLogPb(logPbBean);
        }
        musicModel.setMusicStartFromCut(aVMusic.getMusicStartFromCut());
        musicModel.setMusicStart(aVMusic.getMusicStart());
        musicModel.setMusicEndFromCut(aVMusic.getMusicEndFromCut());
        musicModel.setTrimPointRecommended(aVMusic.getTrimPointRecommended());
        musicModel.setTrimPointList(aVMusic.getTrimPointList());
        musicModel.setTrimTypeList(aVMusic.getTrimTypeList());
        musicModel.setEditFrom(aVMusic.getEditFrom());
        musicModel.setMusicBeginTime(aVMusic.getMusicBeginTime());
        musicModel.setMusicEndTime(aVMusic.getMusicEndTime());
        musicModel.setFromSection(aVMusic.getFromSection());
        musicModel.setCommerceMusic(aVMusic.isCommerceMusic());
        musicModel.setHasCommerceRight(aVMusic.isHasCommerceRight());
        musicModel.setHasCommerceRightStrict(aVMusic.isHasCommerceRightStrict());
        musicModel.setCommercialRightType(aVMusic.getCommercialRightType());
        musicModel.setLocalThumbPath(aVMusic.getLocalThumbPath());
        musicModel.setMemeSong(aVMusic.getMemeSong());
        musicModel.setMemeSongModels(aVMusic.getMemeSongModels());
        musicModel.setFullSongDetail(aVMusic.getFullSongDetail());
        musicModel.setClipShootDuration(aVMusic.clipShootDuration);
        musicModel.isFullSong = aVMusic.isFullSong;
        musicModel.isTrimmingLimited = aVMusic.isTrimmingLimited;
        List<AVMusic> extendMusicList = aVMusic.getExtendMusicList();
        if (extendMusicList != null) {
            arrayList2 = new ArrayList(C15438062q.LJIJJ(extendMusicList, 10));
            Iterator<AVMusic> it3 = extendMusicList.iterator();
            while (it3.hasNext()) {
                arrayList2.add(LIZ(it3.next()));
            }
        } else {
            arrayList2 = null;
        }
        musicModel.setSmartExtendMusicList(arrayList2);
        List<MusicModel> smartExtendMusicList = musicModel.getSmartExtendMusicList();
        if (smartExtendMusicList != null && !smartExtendMusicList.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        musicModel.setSmartExtended(!z);
        musicModel.setMusicVolumeInfo(aVMusic.getMusicVolumeInfo());
        musicModel.setUnlimitedMusic(aVMusic.isUnlimitedMusic());
        musicModel.setMusicSelectedFrom(aVMusic.getMusicSelectedFrom());
        musicModel.isFeedPreDownloadMdp = aVMusic.isFeedPreDownloadMdp;
        musicModel.setCanBeStitched(aVMusic.canBeStitched());
        musicModel.setMultiMusicFromTemplate(aVMusic.isMultiMusicFromTemplate());
        musicModel.setCCTemplateLocalMusic(aVMusic.isCCTemplateLocalMusic());
        musicModel.setAigcInfo(aVMusic.getAigcInfo());
        musicModel.fromRecommend = aVMusic.isFromRecommend();
        C1456960o18 stripMusicModel = aVMusic.getStripMusicModel();
        if (stripMusicModel != null && stripMusicModel.getStrippedMusic()) {
            z2 = true;
        }
        musicModel.setIsStripMusic(z2);
        musicModel.setMaxLoopDuration(aVMusic.getMaxLoopDuration());
        musicModel.setPreventDownload(aVMusic.isPreventDownload());
        MusicBuzCompatModel musicBuzCompatModel = aVMusic.getMusicBuzCompatModel();
        if (musicBuzCompatModel != null) {
            musicRootPageFrom = musicBuzCompatModel.getMusicRootPageFrom();
        }
        musicModel.setMusicRootPageFrom(musicRootPageFrom);
        return musicModel;
    }

    public static ArrayList LIZIZ(List list) {
        if (list != null && !list.isEmpty()) {
            return C19881612qc.LIZ(C19881612qc.LIZLLL(list, new C15KP()));
        }
        return new ArrayList();
    }
}
