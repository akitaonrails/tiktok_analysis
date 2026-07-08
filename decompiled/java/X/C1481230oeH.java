package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.experiment.ReDexExperimentOpt;
import com.ss.android.ugc.aweme.feed.model.BitRate;
import com.ss.android.ugc.aweme.feed.model.BitrateAudioStruct;
import com.ss.android.ugc.aweme.feed.model.BitrateMetaStruct;
import com.ss.android.ugc.aweme.feed.model.BitrateUrlStruct;
import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.ss.android.ugc.aweme.feed.model.CaptionModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.feed.model.video.PlayTokenAuth;
import com.ss.android.ugc.playerkit.simapicommon.model.SimAudioBitrate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimPlayTokenAuth;
import com.ss.android.ugc.playerkit.simapicommon.model.SimUrlModel;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideo;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0oeH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1481230oeH {
    public static BitrateAudioStruct LIZIZ(SimAudioBitrate simAudioBitrate) {
        BitrateMetaStruct bitrateMetaStruct = null;
        BitrateUrlStruct bitrateUrlStruct = null;
        if (simAudioBitrate == null) {
            return null;
        }
        BitrateAudioStruct bitrateAudioStruct = new BitrateAudioStruct();
        C1476780oX6 audioMeta = simAudioBitrate.getAudioMeta();
        if (audioMeta != null) {
            BitrateMetaStruct bitrateMetaStruct2 = new BitrateMetaStruct();
            C1476790oX7 urlList = audioMeta.getUrlList();
            if (urlList != null) {
                bitrateUrlStruct = new BitrateUrlStruct();
                bitrateUrlStruct.setMainUrl(urlList.getMainUrl());
                bitrateUrlStruct.setBackupUrl(urlList.getBackupUrl());
                bitrateUrlStruct.setFallbackUrl(urlList.getFallbackUrl());
            }
            bitrateMetaStruct2.setUrlList(bitrateUrlStruct);
            bitrateMetaStruct2.setEncodedType(audioMeta.getEncodedType());
            bitrateMetaStruct2.setMediaType(audioMeta.getMediaType());
            bitrateMetaStruct2.setLogoType(audioMeta.getLogoType());
            bitrateMetaStruct2.setDefinition(audioMeta.getDefinition());
            bitrateMetaStruct2.setQuality(audioMeta.getQuality());
            bitrateMetaStruct2.setQualityDesc(audioMeta.getQualityDesc());
            bitrateMetaStruct2.setFormat(audioMeta.getFormat());
            bitrateMetaStruct2.setWidth(audioMeta.getWidth());
            bitrateMetaStruct2.setHeight(audioMeta.getHeight());
            bitrateMetaStruct2.setBitrate(audioMeta.getBitrate());
            bitrateMetaStruct2.setCodecType(audioMeta.getCodecType());
            bitrateMetaStruct2.setSize(audioMeta.getSize());
            bitrateMetaStruct2.setFps(audioMeta.getFps());
            bitrateMetaStruct2.setFileId(audioMeta.getFileId());
            bitrateMetaStruct2.setFileHash(audioMeta.getFileHash());
            bitrateMetaStruct2.setSubInfo(audioMeta.getSubInfo());
            bitrateMetaStruct2.setFidProfileLabels(audioMeta.getFidProfileLabels());
            bitrateMetaStruct = bitrateMetaStruct2;
        }
        bitrateAudioStruct.setAudioMeta(bitrateMetaStruct);
        bitrateAudioStruct.setAudioExtra(simAudioBitrate.getAudioExtra());
        bitrateAudioStruct.setAudioQuality(simAudioBitrate.getQualityType());
        return bitrateAudioStruct;
    }

    public static BitRate LIZJ(SimBitRate simBitRate) {
        if (simBitRate == null) {
            return null;
        }
        BitRate bitRate = (BitRate) simBitRate.origin;
        if (bitRate == null) {
            bitRate = new BitRate();
        }
        bitRate.setBytevc1(simBitRate.getIsBytevc1());
        bitRate.setPlayAddr(LJIIIIZZ(simBitRate.playAddrBytevc1));
        bitRate.setPlayAddr(LJIIIIZZ(simBitRate.getPlayAddr()));
        bitRate.setBitRate(simBitRate.getBitRate());
        bitRate.setGearName(simBitRate.getGearName());
        bitRate.setQualityType(simBitRate.getQualityType());
        bitRate.setHdrBit(simBitRate.getHdrBit());
        bitRate.setHdrType(simBitRate.getHdrType());
        bitRate.setFormat(simBitRate.getFormat());
        bitRate.setFidProfileLabels(simBitRate.getFidProfileLabels());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(simBitRate.getFps());
        sbLIZ.append("");
        bitRate.fps = C2188811AlT.LIZIZ(sbLIZ);
        return bitRate;
    }

    public static SimAudioBitrate LIZLLL(BitrateAudioStruct bitrateAudioStruct) {
        C1476780oX6 c1476780oX6 = null;
        C1476790oX7 c1476790oX7 = null;
        if (bitrateAudioStruct == null) {
            return null;
        }
        SimAudioBitrate simAudioBitrate = new SimAudioBitrate();
        BitrateMetaStruct audioMeta = bitrateAudioStruct.getAudioMeta();
        if (audioMeta != null) {
            C1476780oX6 c1476780oX62 = new C1476780oX6();
            BitrateUrlStruct urlList = audioMeta.getUrlList();
            if (urlList != null) {
                c1476790oX7 = new C1476790oX7();
                c1476790oX7.setMainUrl(urlList.getMainUrl());
                c1476790oX7.setBackupUrl(urlList.getBackupUrl());
                c1476790oX7.setFallbackUrl(urlList.getFallbackUrl());
            }
            c1476780oX62.setUrlList(c1476790oX7);
            c1476780oX62.setEncodedType(audioMeta.getEncodedType());
            c1476780oX62.setMediaType(audioMeta.getMediaType());
            c1476780oX62.setLogoType(audioMeta.getLogoType());
            c1476780oX62.setDefinition(audioMeta.getDefinition());
            c1476780oX62.setQuality(audioMeta.getQuality());
            c1476780oX62.setQualityDesc(audioMeta.getQualityDesc());
            c1476780oX62.setFormat(audioMeta.getFormat());
            c1476780oX62.setWidth(audioMeta.getWidth());
            c1476780oX62.setHeight(audioMeta.getHeight());
            c1476780oX62.setBitrate(audioMeta.getBitrate());
            c1476780oX62.setCodecType(audioMeta.getCodecType());
            c1476780oX62.setSize(audioMeta.getSize());
            c1476780oX62.setFps(audioMeta.getFps());
            c1476780oX62.setFileId(audioMeta.getFileId());
            c1476780oX62.setFileHash(audioMeta.getFileHash());
            c1476780oX62.setSubInfo(audioMeta.getSubInfo());
            c1476780oX62.setFidProfileLabels(audioMeta.getFidProfileLabels());
            c1476780oX6 = c1476780oX62;
        }
        simAudioBitrate.setAudioMeta(c1476780oX6);
        simAudioBitrate.setAudioExtra(bitrateAudioStruct.getAudioExtra());
        simAudioBitrate.setQualityType((int) bitrateAudioStruct.getAudioQuality());
        return simAudioBitrate;
    }

    public static SimBitRate LJ(BitRate bitRate) {
        if (bitRate == null) {
            return null;
        }
        SimBitRate simBitRate = new SimBitRate();
        simBitRate.origin = bitRate;
        simBitRate.setCodecType(bitRate.isBytevc1());
        simBitRate.setPlayAddr(LJFF(bitRate.getPlayAddr()));
        simBitRate.setBitRate(bitRate.getBitRate());
        simBitRate.setGearName(bitRate.getGearName());
        simBitRate.setQualityType(bitRate.getQualityType());
        simBitRate.setHdrType(bitRate.getHdrType());
        simBitRate.setHdrBit(bitRate.getHdrBit());
        simBitRate.setFormat(bitRate.getFormat());
        simBitRate.setVideoExtra(bitRate.getVideoExtra());
        simBitRate.setFidProfileLabels(bitRate.getFidProfileLabels());
        simBitRate.setFps(bitRate.getFps());
        return simBitRate;
    }

    public static SimUrlModel LJFF(UrlModel urlModel) {
        String uri;
        if (urlModel == null) {
            return null;
        }
        SimUrlModel simUrlModel = new SimUrlModel();
        simUrlModel.origin = urlModel;
        simUrlModel.setFileHash(urlModel.getFileHash());
        simUrlModel.setHeight(urlModel.getHeight());
        simUrlModel.setWidth(urlModel.getWidth());
        simUrlModel.setSize(urlModel.getSize());
        if (urlModel instanceof VideoUrlModel) {
            uri = ((VideoUrlModel) urlModel).getOriginUri();
        } else {
            uri = urlModel.getUri();
        }
        simUrlModel.setUri(uri);
        simUrlModel.setUrlKey(urlModel.getUrlKey());
        simUrlModel.setUrlList(urlModel.getUrlList());
        simUrlModel.setaK(urlModel.getaK());
        return simUrlModel;
    }

    public static SimVideo LJI(Video video) {
        SimPlayTokenAuth simPlayTokenAuth = null;
        if (video == null) {
            return null;
        }
        SimVideo simVideo = new SimVideo();
        simVideo.origin = video;
        simVideo.cdnUrlExpired = video.cdnUrlExpired;
        ArrayList arrayList = new ArrayList();
        if (video.getRawBitRate() != null) {
            Iterator it2 = new ArrayList(video.getRawBitRate()).iterator();
            while (it2.hasNext()) {
                arrayList.add(LJ((BitRate) it2.next()));
            }
        }
        simVideo.setBitRate(arrayList);
        ArrayList arrayList2 = new ArrayList();
        List<BitrateAudioStruct> list = video.bitRateAudio;
        if (list != null) {
            Iterator it3 = new ArrayList(list).iterator();
            while (it3.hasNext()) {
                arrayList2.add(LIZLLL((BitrateAudioStruct) it3.next()));
            }
        }
        simVideo.setAudioBitRate(arrayList2);
        PlayTokenAuth drmTokenAuth = video.getDrmTokenAuth();
        if (drmTokenAuth != null) {
            simPlayTokenAuth = new SimPlayTokenAuth();
            simPlayTokenAuth.origin = drmTokenAuth;
            simPlayTokenAuth.setAuth(drmTokenAuth.getAuth());
            simPlayTokenAuth.setVersion(drmTokenAuth.getVersionN());
            simPlayTokenAuth.setHostIndex(drmTokenAuth.getHostIndex());
            simPlayTokenAuth.setHosts(drmTokenAuth.getHosts());
            simPlayTokenAuth.setVid(drmTokenAuth.getVid());
            simPlayTokenAuth.setToken(drmTokenAuth.getToken());
        }
        simVideo.setDrmTokenAuth(simPlayTokenAuth);
        simVideo.setDuration(video.getDuration());
        simVideo.setHeight(video.getHeight());
        simVideo.setNeedSetCookie(video.isNeedSetCookie());
        long pb2AwemeMillis = video.getPb2AwemeMillis();
        if (0 == pb2AwemeMillis) {
            pb2AwemeMillis = System.currentTimeMillis();
            video.setPb2AwemeMillis(pb2AwemeMillis);
        }
        simVideo.setPb2AwemeMillis(pb2AwemeMillis);
        SimVideoUrlModel simVideoUrlModelLJII = LJII(video.getPlayAddr());
        simVideo.setPlayAddr(simVideoUrlModelLJII);
        if (simVideoUrlModelLJII != null && simVideoUrlModelLJII.getSourceId() != null) {
            simVideo.setSourceId(simVideoUrlModelLJII.getSourceId());
        }
        SimVideoUrlModel simVideoUrlModelLJII2 = LJII(video.getPlayAddrBytevc1());
        if (simVideoUrlModelLJII2 != null && simVideoUrlModelLJII2.getSourceId() != null) {
            simVideo.setSourceId(simVideoUrlModelLJII2.getSourceId());
        }
        simVideo.setPlayAddrBytevc1(simVideoUrlModelLJII2);
        SimVideoUrlModel simVideoUrlModelLJII3 = LJII(video.getH264PlayAddr());
        if (simVideoUrlModelLJII3 != null && simVideoUrlModelLJII3.getSourceId() != null) {
            simVideo.setSourceId(simVideoUrlModelLJII3.getSourceId());
        }
        simVideo.setRatio(video.getRatio());
        simVideo.setEnableIntertrustDrm(video.enableIntertrustDrm());
        simVideo.setMeta(video.getMeta());
        simVideo.setVideoLength(video.getVideoLength());
        simVideo.setFormat(video.getFormat());
        simVideo.setVideoModelStr(video.getVideoModelStr());
        simVideo.setVideoModelMap(video.getVideoModelMap());
        simVideo.setVideoModel(video.getVideoModelObject());
        simVideo.setWidth(video.getWidth());
        simVideo.setClaInfo(LIZ(video.getCaptionModel(), pb2AwemeMillis));
        simVideo.setDidProfileLabels(video.getDidProfileLabels());
        simVideo.setVidProfileLabels(video.getVidProfileLabels());
        return simVideo;
    }

    public static SimVideoUrlModel LJII(VideoUrlModel videoUrlModel) {
        if (!ReDexExperimentOpt.getAbTest()) {
            return LJII$redex$base(videoUrlModel);
        }
        return LJII$redex$opt(videoUrlModel);
    }

    private static SimVideoUrlModel LJII$redex$base(VideoUrlModel videoUrlModel) {
        SimVideoUrlModel simVideoUrlModel;
        if (videoUrlModel == null) {
            return null;
        }
        if (C1474810oTv.LJJLIIIIJ()) {
            simVideoUrlModel = new SimVideoUrlModel(videoUrlModel.getSourceId());
        } else {
            simVideoUrlModel = new SimVideoUrlModel();
        }
        simVideoUrlModel.origin = videoUrlModel;
        simVideoUrlModel.setCdnUrlExpired(videoUrlModel.getCdnUrlExpired());
        long pb2AwemeMillis = videoUrlModel.getPb2AwemeMillis();
        if (0 == pb2AwemeMillis) {
            pb2AwemeMillis = System.currentTimeMillis();
            videoUrlModel.setPb2AwemeMillis(pb2AwemeMillis);
        }
        simVideoUrlModel.setPb2AwemeMillis(pb2AwemeMillis);
        ArrayList arrayList = new ArrayList();
        List<BitRate> rawBitRate = videoUrlModel.getRawBitRate();
        if (rawBitRate != null) {
            Iterator it2 = new ArrayList(rawBitRate).iterator();
            while (it2.hasNext()) {
                arrayList.add(LJ((BitRate) it2.next()));
            }
        }
        simVideoUrlModel.setBitRate(arrayList);
        ArrayList arrayList2 = new ArrayList();
        List<BitrateAudioStruct> audioBitrate = videoUrlModel.getAudioBitrate();
        if (audioBitrate != null) {
            Iterator it3 = new ArrayList(audioBitrate).iterator();
            while (it3.hasNext()) {
                arrayList2.add(LIZLLL((BitrateAudioStruct) it3.next()));
            }
        }
        simVideoUrlModel.setAudioBitRate(arrayList2);
        simVideoUrlModel.setMeta(videoUrlModel.getMeta());
        simVideoUrlModel.setDidProfileLabels(videoUrlModel.getDidProfileLabels());
        simVideoUrlModel.setVidProfileLabels(videoUrlModel.getVidProfileLabels());
        simVideoUrlModel.setFormat(videoUrlModel.getFormat());
        simVideoUrlModel.setAspectRatio(videoUrlModel.getAspectRatio());
        simVideoUrlModel.setDashVideoModelStr(videoUrlModel.getDashVideoModelStr());
        simVideoUrlModel.setDashVideoModelMap(videoUrlModel.getDashVideoModelMap());
        simVideoUrlModel.setFileCheckSum(videoUrlModel.getFileCheckSum());
        simVideoUrlModel.setCodecType(videoUrlModel.getCodecType());
        simVideoUrlModel.setRatio(videoUrlModel.getRatio());
        simVideoUrlModel.setVr(videoUrlModel.isVr());
        simVideoUrlModel.setSourceId(videoUrlModel.getSourceId());
        simVideoUrlModel.setDuration(videoUrlModel.getDuration());
        simVideoUrlModel.setFileHash(videoUrlModel.getFileHash());
        simVideoUrlModel.setHeight(videoUrlModel.getHeight());
        simVideoUrlModel.setWidth(videoUrlModel.getWidth());
        simVideoUrlModel.setSize(videoUrlModel.getSize());
        simVideoUrlModel.setUri(videoUrlModel.getOriginUri());
        simVideoUrlModel.setUrlKey(videoUrlModel.getUrlKey());
        simVideoUrlModel.setUrlList(videoUrlModel.getUrlList());
        simVideoUrlModel.setaK(videoUrlModel.getaK());
        if (!TextUtils.isEmpty(videoUrlModel.getDashVideoId())) {
            simVideoUrlModel.setDashVideoId(videoUrlModel.getDashVideoId());
        }
        if (videoUrlModel.getHitBitrate() != null) {
            simVideoUrlModel.setHitBitrate(videoUrlModel.getHitBitrate());
        }
        if (videoUrlModel.getHitDashVideoBitrate() != null) {
            simVideoUrlModel.setHitDashVideoBitrate(LJ(videoUrlModel.getHitDashVideoBitrate()));
        }
        if (videoUrlModel.getHitDashAudioBitrate() != null) {
            simVideoUrlModel.setHitDashAudioBitrate(LIZLLL(videoUrlModel.getHitDashAudioBitrate()));
        }
        simVideoUrlModel.setIsTranslatedVideo(videoUrlModel.getIsTranslatedVideo());
        return simVideoUrlModel;
    }

    private static SimVideoUrlModel LJII$redex$opt(VideoUrlModel videoUrlModel) {
        SimVideoUrlModel simVideoUrlModel;
        if (videoUrlModel == null) {
            return null;
        }
        if (C1474810oTv.LJJLIIIIJ()) {
            simVideoUrlModel = new SimVideoUrlModel(videoUrlModel.getSourceId());
        } else {
            simVideoUrlModel = new SimVideoUrlModel();
        }
        simVideoUrlModel.origin = videoUrlModel;
        simVideoUrlModel.setCdnUrlExpired(videoUrlModel.getCdnUrlExpired());
        long pb2AwemeMillis = videoUrlModel.getPb2AwemeMillis();
        if (0 == pb2AwemeMillis) {
            pb2AwemeMillis = System.currentTimeMillis();
            videoUrlModel.setPb2AwemeMillis(pb2AwemeMillis);
        }
        simVideoUrlModel.setPb2AwemeMillis(pb2AwemeMillis);
        ArrayList arrayList = new ArrayList();
        List<BitRate> rawBitRate = videoUrlModel.getRawBitRate();
        if (rawBitRate != null) {
            ArrayList arrayList2 = new ArrayList(rawBitRate);
            int i = 0;
            int size = arrayList2.size();
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                arrayList.add(LJ((BitRate) obj));
            }
        }
        simVideoUrlModel.setBitRate(arrayList);
        ArrayList arrayList3 = new ArrayList();
        List<BitrateAudioStruct> audioBitrate = videoUrlModel.getAudioBitrate();
        if (audioBitrate != null) {
            ArrayList arrayList4 = new ArrayList(audioBitrate);
            int i2 = 0;
            int size2 = arrayList4.size();
            while (i2 < size2) {
                Object obj2 = arrayList4.get(i2);
                i2++;
                arrayList3.add(LIZLLL((BitrateAudioStruct) obj2));
            }
        }
        simVideoUrlModel.setAudioBitRate(arrayList3);
        simVideoUrlModel.setMeta(videoUrlModel.getMeta());
        simVideoUrlModel.setDidProfileLabels(videoUrlModel.getDidProfileLabels());
        simVideoUrlModel.setVidProfileLabels(videoUrlModel.getVidProfileLabels());
        simVideoUrlModel.setFormat(videoUrlModel.getFormat());
        simVideoUrlModel.setAspectRatio(videoUrlModel.getAspectRatio());
        simVideoUrlModel.setDashVideoModelStr(videoUrlModel.getDashVideoModelStr());
        simVideoUrlModel.setDashVideoModelMap(videoUrlModel.getDashVideoModelMap());
        simVideoUrlModel.setFileCheckSum(videoUrlModel.getFileCheckSum());
        simVideoUrlModel.setCodecType(videoUrlModel.getCodecType());
        simVideoUrlModel.setRatio(videoUrlModel.getRatio());
        simVideoUrlModel.setVr(videoUrlModel.isVr());
        simVideoUrlModel.setSourceId(videoUrlModel.getSourceId());
        simVideoUrlModel.setDuration(videoUrlModel.getDuration());
        simVideoUrlModel.setFileHash(videoUrlModel.getFileHash());
        simVideoUrlModel.setHeight(videoUrlModel.getHeight());
        simVideoUrlModel.setWidth(videoUrlModel.getWidth());
        simVideoUrlModel.setSize(videoUrlModel.getSize());
        simVideoUrlModel.setUri(videoUrlModel.getOriginUri());
        simVideoUrlModel.setUrlKey(videoUrlModel.getUrlKey());
        simVideoUrlModel.setUrlList(videoUrlModel.getUrlList());
        simVideoUrlModel.setaK(videoUrlModel.getaK());
        if (!TextUtils.isEmpty(videoUrlModel.getDashVideoId())) {
            simVideoUrlModel.setDashVideoId(videoUrlModel.getDashVideoId());
        }
        if (videoUrlModel.getHitBitrate() != null) {
            simVideoUrlModel.setHitBitrate(videoUrlModel.getHitBitrate());
        }
        if (videoUrlModel.getHitDashVideoBitrate() != null) {
            simVideoUrlModel.setHitDashVideoBitrate(LJ(videoUrlModel.getHitDashVideoBitrate()));
        }
        if (videoUrlModel.getHitDashAudioBitrate() != null) {
            simVideoUrlModel.setHitDashAudioBitrate(LIZLLL(videoUrlModel.getHitDashAudioBitrate()));
        }
        simVideoUrlModel.setIsTranslatedVideo(videoUrlModel.getIsTranslatedVideo());
        return simVideoUrlModel;
    }

    public static UrlModel LJIIIIZZ(SimUrlModel simUrlModel) {
        String uri;
        if (simUrlModel == null) {
            return null;
        }
        UrlModel urlModel = (UrlModel) simUrlModel.origin;
        if (urlModel == null) {
            urlModel = new UrlModel();
        }
        urlModel.setFileHash(simUrlModel.getFileHash());
        urlModel.setHeight(simUrlModel.getHeight());
        urlModel.setWidth(simUrlModel.getWidth());
        urlModel.setSize(simUrlModel.getSize());
        if (simUrlModel instanceof SimVideoUrlModel) {
            uri = ((SimVideoUrlModel) simUrlModel).getOriginUri();
        } else {
            uri = simUrlModel.getUri();
        }
        urlModel.setUri(uri);
        urlModel.setUrlKey(simUrlModel.getUrlKey());
        urlModel.setUrlList(simUrlModel.getUrlList());
        urlModel.setaK(simUrlModel.getaK());
        return urlModel;
    }

    public static VideoUrlModel LJIIIZ(C1476750oX3 c1476750oX3) {
        if (c1476750oX3 == null) {
            return null;
        }
        VideoUrlModel videoUrlModel = new VideoUrlModel();
        if (c1476750oX3.getUrlKey() != null) {
            videoUrlModel.setSourceId(c1476750oX3.getUrlKey());
        }
        if (c1476750oX3.getFileHash() != null) {
            videoUrlModel.setFileHash(c1476750oX3.getFileHash());
        }
        videoUrlModel.setHeight(c1476750oX3.getHeight());
        videoUrlModel.setWidth(c1476750oX3.getWidth());
        videoUrlModel.setSize(c1476750oX3.getSize());
        if (c1476750oX3.getUri() != null) {
            videoUrlModel.setUri(c1476750oX3.getUri());
        }
        if (c1476750oX3.getUrlKey() != null) {
            videoUrlModel.setUrlKey(c1476750oX3.getUrlKey());
        }
        if (c1476750oX3.getUrlList() != null) {
            videoUrlModel.setUrlList(c1476750oX3.getUrlList());
        }
        if (c1476750oX3.getaK() != null) {
            videoUrlModel.setaK(c1476750oX3.getaK());
        }
        return videoUrlModel;
    }

    public static VideoUrlModel LJIIJ(SimVideoUrlModel simVideoUrlModel) {
        if (simVideoUrlModel == null) {
            return null;
        }
        VideoUrlModel videoUrlModel = (VideoUrlModel) simVideoUrlModel.origin;
        if (videoUrlModel == null) {
            videoUrlModel = new VideoUrlModel();
        }
        videoUrlModel.setPb2AwemeMillis(simVideoUrlModel.getPb2AwemeMillis());
        ArrayList arrayList = new ArrayList();
        if (simVideoUrlModel.getRawBitRate() != null) {
            Iterator it2 = new ArrayList(simVideoUrlModel.getRawBitRate()).iterator();
            while (it2.hasNext()) {
                arrayList.add(LIZJ((SimBitRate) it2.next()));
            }
        }
        videoUrlModel.setBitRate(arrayList);
        ArrayList arrayList2 = new ArrayList();
        List<SimAudioBitrate> audioBitrate = simVideoUrlModel.getAudioBitrate();
        if (audioBitrate != null) {
            Iterator it3 = new ArrayList(audioBitrate).iterator();
            while (it3.hasNext()) {
                arrayList2.add(LIZIZ((SimAudioBitrate) it3.next()));
            }
        }
        videoUrlModel.setAudioBitrate(arrayList2);
        videoUrlModel.setMeta(simVideoUrlModel.getMeta());
        videoUrlModel.setDidProfileLabels(simVideoUrlModel.getDidProfileLabels());
        videoUrlModel.setVidProfileLabels(simVideoUrlModel.getVidProfileLabels());
        videoUrlModel.setFormat(simVideoUrlModel.getFormat());
        videoUrlModel.setAspectRatio(simVideoUrlModel.getAspectRatio());
        videoUrlModel.setDashVideoId(simVideoUrlModel.getDashVideoId());
        videoUrlModel.setDashVideoModelStr(simVideoUrlModel.getDashVideoModelStr());
        videoUrlModel.setDashVideoModelMap(simVideoUrlModel.getDashVideoModelMap());
        videoUrlModel.setDashVideoId(simVideoUrlModel.getDashVideoId());
        videoUrlModel.setFileCheckSum(simVideoUrlModel.getFileCheckSum());
        videoUrlModel.setCodecType(simVideoUrlModel.getCodecType());
        videoUrlModel.setHitBitrate(simVideoUrlModel.getHitBitrate());
        videoUrlModel.setHitDashVideoBitrate(LIZJ(simVideoUrlModel.getHitDashVideoBitrate()));
        videoUrlModel.setHitDashAudioBitrate(LIZIZ(simVideoUrlModel.getHitDashAudioBitrate()));
        videoUrlModel.setRatio(simVideoUrlModel.getRatio());
        videoUrlModel.setVr(simVideoUrlModel.isVr());
        videoUrlModel.setSourceId(simVideoUrlModel.getSourceId());
        videoUrlModel.setDuration(simVideoUrlModel.getDuration());
        videoUrlModel.setFileHash(simVideoUrlModel.getFileHash());
        videoUrlModel.setHeight(simVideoUrlModel.getHeight());
        videoUrlModel.setWidth(simVideoUrlModel.getWidth());
        videoUrlModel.setSize(simVideoUrlModel.getSize());
        videoUrlModel.setUri(simVideoUrlModel.getOriginUri());
        videoUrlModel.setUrlKey(simVideoUrlModel.getUrlKey());
        videoUrlModel.setUrlList(simVideoUrlModel.getUrlList());
        videoUrlModel.setCdnUrlExpired(simVideoUrlModel.getCdnUrlExpired());
        videoUrlModel.setaK(simVideoUrlModel.getaK());
        videoUrlModel.setIsTranslatedVideo(simVideoUrlModel.getIsTranslatedVideo());
        return videoUrlModel;
    }

    public static C1479380obI LIZ(CaptionModel captionModel, long j) {
        boolean z;
        if (captionModel != null && captionModel.captionList != null && captionModel.originalCaptionLanguage != null) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (CaptionItemModel captionItemModel : captionModel.captionList) {
                arrayList.add(new C1477890oYt(captionItemModel.expire, captionItemModel.format, captionItemModel.languageName, captionItemModel.subId, captionItemModel.versionType, captionItemModel.url, captionItemModel.languageId, captionItemModel.isAutoGenerated(), captionItemModel.isRealtimeTranslated(), captionItemModel.complaintId, SystemClock.elapsedRealtime(), i, "", captionItemModel.urlList, Long.valueOf(j)));
                i++;
            }
            if (captionModel.hasOriginalAudio != 0) {
                z = true;
            } else {
                z = false;
            }
            return new C1479380obI(true, z, new C1479420obM(captionModel.originalCaptionLanguage.languageName, (int) r0.languageId), arrayList);
        }
        return null;
    }
}
