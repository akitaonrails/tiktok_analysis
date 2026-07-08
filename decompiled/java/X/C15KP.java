package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.common.LogPbBean;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzCompatModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicCompatModel;
import com.ss.android.ugc.aweme.music.model.LyricSceneCopyRight;
import com.ss.android.ugc.aweme.music.model.MemeSongInfo;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicReleaseInfo;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.15KP, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15KP implements InterfaceC19882712qn<MusicModel, AVMusic> {
    public static final /* synthetic */ int LL = 0;

    @Override // X.InterfaceC19882712qn
    /* JADX INFO: renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final AVMusic apply(MusicModel musicModel) {
        String promotionTag;
        ArrayList arrayList;
        String imprId;
        boolean z;
        MemeSongInfo memeSongInfo;
        String promoId;
        String recallReason;
        ArrayList arrayList2;
        String extra;
        LyricSceneCopyRight lyricSceneCopyRightCopy = null;
        if (musicModel == null) {
            return null;
        }
        AVMusic aVMusic = new AVMusic();
        Music music = musicModel.getMusic();
        if (music != null) {
            promotionTag = music.getPromotionTag();
        } else {
            promotionTag = null;
        }
        aVMusic.setPromotionTag(promotionTag);
        Music musicConvertToMusic = musicModel.convertToMusic();
        aVMusic.id = musicConvertToMusic.getId();
        aVMusic.sameGroupIdV3 = musicConvertToMusic.sameGroupIdV3.longValue();
        aVMusic.simGroupIdV3 = musicConvertToMusic.simGroupIdV3.longValue();
        aVMusic.setCommerceMusic(musicConvertToMusic.isCommercialMusic());
        aVMusic.setHasCommerceRight(musicConvertToMusic.isHasCommerceRight());
        aVMusic.setHasCommerceRightStrict(musicConvertToMusic.isHasCommerceRightStrict());
        aVMusic.setOriginalSound(musicConvertToMusic.isOriginalSound());
        aVMusic.musicName = musicConvertToMusic.getMusicName();
        aVMusic.album = musicConvertToMusic.getAlbum();
        boolean zIsNewReleaseSong = false;
        if (TextUtils.isEmpty(musicModel.getLocalPath())) {
            if (musicModel.isPlayUrlValid()) {
                if (musicModel.getMusicType() == 2) {
                    aVMusic.path = (String) ListProtector.get(musicModel.getReuseAudioPlayUrl().getUrlList(), 0);
                } else {
                    aVMusic.path = (String) ListProtector.get(musicModel.getUrl().getUrlList(), 0);
                    aVMusic.onlinePath = (String) ListProtector.get(musicModel.getUrl().getUrlList(), 0);
                    aVMusic.onlineKey = musicModel.getUrl().getUrlKey();
                }
            }
        } else {
            aVMusic.path = musicModel.getLocalPath();
        }
        aVMusic.authorName = musicConvertToMusic.getAuthorName();
        aVMusic.playUrl = musicConvertToMusic.getPlayUrl();
        aVMusic.reuseAudioPlayUrl = musicConvertToMusic.getReuseAudioPlayUrl();
        aVMusic.coverThumb = musicConvertToMusic.getCoverThumb();
        aVMusic.coverMedium = musicConvertToMusic.getCoverMedium();
        aVMusic.coverLarge = musicConvertToMusic.getCoverLarge();
        aVMusic.setDuration(musicConvertToMusic.getDuration());
        aVMusic.setShootDuration(musicConvertToMusic.getShootDuration());
        aVMusic.setAuditionDuration(musicConvertToMusic.getAuditionDuration());
        aVMusic.durationHighPrecision = musicConvertToMusic.getDurationHighPrecision();
        aVMusic.musicType = musicModel.getMusicType();
        aVMusic.offlineDesc = musicModel.getOfflineDesc();
        aVMusic.musicStatus = musicConvertToMusic.getMusicStatus();
        if (musicConvertToMusic.getChallenge() != null) {
            new C194506117w();
            aVMusic.challenge = C194506117w.LIZ(musicConvertToMusic.getChallenge());
        }
        aVMusic.strongBeatUrl = musicConvertToMusic.getStrongBeatUrl();
        aVMusic.setLrcUrl(musicConvertToMusic.getLrcUrl());
        aVMusic.setLrcType(musicConvertToMusic.getLrcType());
        aVMusic.setLyricContent(musicConvertToMusic.getLyricContent());
        aVMusic.setLyricContentType(musicConvertToMusic.getLyricContentType());
        aVMusic.setLyrics(musicConvertToMusic.getLyrics());
        aVMusic.setOfflineMusic(musicModel.isOffline());
        aVMusic.setSimilarMusic(musicModel.isSimilarMusic());
        List<MusicModel> similarMusicList = musicModel.getSimilarMusicList();
        if (similarMusicList != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(similarMusicList, 10));
            Iterator<MusicModel> it2 = similarMusicList.iterator();
            while (it2.hasNext()) {
                arrayList.add(apply(it2.next()));
            }
        } else {
            arrayList = null;
        }
        aVMusic.setSimilarMusicList(arrayList);
        aVMusic.userCount = musicConvertToMusic.getUserCount();
        aVMusic.setMusicTags(musicConvertToMusic.getMusicTags());
        aVMusic.similarTag = musicConvertToMusic.getsimilarTag().intValue();
        aVMusic.recommendSourceFrom = musicConvertToMusic.getRecommendSourceFrom();
        aVMusic.setPreviewStartTime(musicConvertToMusic.getPreviewStartTime());
        aVMusic.setPreventDownload(musicModel.isPreventDownload());
        if (musicModel.getMusicWaveBean() != null) {
            aVMusic.setMusicWaveData(musicModel.getMusicWaveBean().getMusicWavePointArray());
        }
        aVMusic.setMvThemeMusic(musicModel.isMvThemeMusic());
        LogPbBean logPbBean = new LogPbBean(null);
        com.ss.android.ugc.aweme.feed.model.LogPbBean logPb = musicModel.getLogPb();
        if (logPb != null) {
            imprId = logPb.getImprId();
        } else {
            imprId = null;
        }
        logPbBean.setImprId(imprId);
        aVMusic.setLogPb(logPbBean);
        aVMusic.setFromRecommend(musicModel.isFromRecommend());
        aVMusic.setComeFromForMod(musicModel.getComeFromForMod());
        aVMusic.setCategoryID(musicModel.getCategoryID());
        aVMusic.setSearchKeyWords(musicModel.getSearchKeyWords());
        aVMusic.setSongId(musicModel.getSongId());
        aVMusic.extra = musicModel.getExtra();
        aVMusic.setDmvAutoShow(musicModel.getDmvAutoShow());
        if (musicModel.getCollectionType() == MusicModel.CollectionType.COLLECTED) {
            z = true;
        } else {
            z = false;
        }
        aVMusic.setCollected(z);
        if (TextUtils.isEmpty(aVMusic.extra)) {
            Music music2 = musicModel.getMusic();
            if (music2 != null) {
                extra = music2.getExtra();
            } else {
                extra = null;
            }
            aVMusic.extra = extra;
        }
        aVMusic.setNeedSetCookie(musicModel.isNeedSetCookie());
        aVMusic.setVideoDuration(musicModel.getVideoDuration());
        aVMusic.setPgc(musicModel.isPgc());
        aVMusic.isSamiRecommend = musicModel.isSamiRecommend();
        aVMusic.setMatchedPGCSoundInfo(musicModel.getMatchedPGCSoundInfo());
        aVMusic.setMatchedSongInfo(musicModel.getMatchedSongInfo());
        aVMusic.setFullSongDetail(musicModel.getFullSongDetail());
        aVMusic.clipShootDuration = musicModel.getClipShootDuration();
        aVMusic.isFullSong = musicModel.isFullSong;
        aVMusic.isTrimmingLimited = musicModel.isTrimmingLimited;
        aVMusic.setMusicBeat(musicModel.getBeatInfo());
        aVMusic.setLocalMusicDuration(musicModel.getLocalMusicDuration());
        aVMusic.setLocalMusicId(musicModel.getLocalMusicId());
        aVMusic.setMuteShare(musicModel.isMuteShare());
        aVMusic.setMusicStartFromCut(musicModel.getMusicStartFromCut());
        aVMusic.setMusicStart(musicModel.getMusicStart());
        aVMusic.setMusicEndFromCut(musicModel.getMusicEndFromCut());
        aVMusic.setTrimPointRecommended(musicModel.getTrimPointRecommended());
        aVMusic.setTrimPointList(musicModel.getTrimPointList());
        aVMusic.setTrimTypeList(musicModel.getTrimTypeList());
        aVMusic.setEditFrom(musicModel.getEditFrom());
        aVMusic.setMusicBeginTime(musicModel.getMusicBeginTime());
        aVMusic.setMusicEndTime(musicModel.getMusicEndTime());
        aVMusic.setFromSection(musicModel.getFromSection());
        aVMusic.setCommercialRightType(musicModel.getCommercialRightType());
        aVMusic.setLocalThumbPath(musicModel.getLocalThumbPath());
        Music music3 = musicModel.getMusic();
        if (music3 != null) {
            memeSongInfo = music3.getMemeSongInfo();
        } else {
            memeSongInfo = null;
        }
        aVMusic.setMemeSongInfo(memeSongInfo);
        aVMusic.setMemeSong(musicModel.getMemeSong());
        aVMusic.setMemeSongModels(musicModel.getMemeSongModels());
        MusicReleaseInfo musicReleaseInfo = musicModel.getMusicReleaseInfo();
        if (musicReleaseInfo != null) {
            zIsNewReleaseSong = musicReleaseInfo.isNewReleaseSong();
        }
        aVMusic.setIsNewReleaseMusic(zIsNewReleaseSong);
        Music music4 = musicModel.getMusic();
        if (music4 != null) {
            promoId = music4.getPromoId();
        } else {
            promoId = null;
        }
        aVMusic.setPromoId(promoId);
        Music music5 = musicModel.getMusic();
        if (music5 != null) {
            recallReason = music5.getRecallReason();
        } else {
            recallReason = null;
        }
        aVMusic.setRecallReason(recallReason);
        if (musicModel.isSmartExtended()) {
            List<MusicModel> smartExtendMusicList = musicModel.getSmartExtendMusicList();
            if (smartExtendMusicList != null) {
                arrayList2 = new ArrayList(C15438062q.LJIJJ(smartExtendMusicList, 10));
                Iterator<MusicModel> it3 = smartExtendMusicList.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(apply(it3.next()));
                }
            } else {
                arrayList2 = null;
            }
            aVMusic.setExtendMusicList(arrayList2);
        }
        aVMusic.setMusicVolumeInfo(musicModel.getMusicVolumeInfo());
        aVMusic.setUnlimitedMusic(musicModel.isUnlimitedMusic());
        aVMusic.setMusicSelectedFrom(musicModel.getMusicSelectedFrom());
        aVMusic.isFeedPreDownloadMdp = musicModel.isFeedPreDownloadMdp;
        aVMusic.setBestMatch(musicModel.isBestMatch);
        aVMusic.setCanBeStitched(musicModel.canBeStitched());
        aVMusic.setMultiMusicFromTemplate(musicModel.isMultiMusicFromTemplate());
        aVMusic.setCCTemplateLocalMusic(musicModel.isCCTemplateLocalMusic());
        aVMusic.setAigcInfo(musicModel.getAigcInfo());
        aVMusic.setMaxLoopDuration(musicModel.getMaxLoopDuration());
        MusicBuzCompatModel musicBuzCompatModel = aVMusic.getMusicBuzCompatModel();
        if (musicBuzCompatModel != null) {
            musicBuzCompatModel.setMusicRootPageFrom(musicModel.getMusicRootPageFrom());
        }
        aVMusic.setMusicCompatModel(new MusicCompatModel(null));
        Music music6 = musicModel.getMusic();
        if (music6 != null) {
            MusicCompatModel musicCompatModel = aVMusic.getMusicCompatModel();
            LyricSceneCopyRight lyricSceneCopyRight = music6.getLyricSceneCopyRight();
            if (lyricSceneCopyRight != null) {
                lyricSceneCopyRightCopy = lyricSceneCopyRight.copy(music6.hasLyricSceneCopyRight());
            }
            aVMusic.setMusicCompatModel(musicCompatModel.copy(lyricSceneCopyRightCopy));
        }
        return aVMusic;
    }
}
