package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.BitRate;
import com.ss.android.ugc.aweme.feed.model.BitrateAudioStruct;
import com.ss.android.ugc.aweme.feed.model.BitrateMetaStruct;
import com.ss.android.ugc.aweme.feed.model.BitrateUrlStruct;
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

/* JADX INFO: renamed from: X.0oeI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1481240oeI {
    public static BitRate LIZ(SimBitRate simBitRate) {
        if (simBitRate == null) {
            return null;
        }
        BitRate bitRate = (BitRate) simBitRate.origin;
        bitRate.setBytevc1(simBitRate.getIsBytevc1());
        bitRate.setPlayAddr(LJFF(simBitRate.playAddrBytevc1));
        bitRate.setPlayAddr(LJFF(simBitRate.getPlayAddr()));
        bitRate.setBitRate(simBitRate.getBitRate());
        bitRate.setGearName(simBitRate.getGearName());
        bitRate.setQualityType(simBitRate.getQualityType());
        bitRate.setHdrType(simBitRate.getHdrType());
        bitRate.setHdrBit(simBitRate.getHdrBit());
        bitRate.setFormat(simBitRate.getFormat());
        bitRate.setFidProfileLabels(simBitRate.getFidProfileLabels());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(simBitRate.getFps());
        sbLIZ.append("");
        bitRate.fps = C2188811AlT.LIZIZ(sbLIZ);
        return bitRate;
    }

    public static SimAudioBitrate LIZIZ(BitrateAudioStruct bitrateAudioStruct) {
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

    public static SimBitRate LIZJ(BitRate bitRate) {
        String uri;
        SimUrlModel simUrlModel = null;
        if (bitRate == null) {
            return null;
        }
        SimBitRate simBitRate = new SimBitRate();
        simBitRate.origin = bitRate;
        simBitRate.setBytevc1(bitRate.isBytevc1());
        UrlModel playAddr = bitRate.getPlayAddr();
        if (playAddr != null) {
            simUrlModel = new SimUrlModel();
            simUrlModel.origin = playAddr;
            simUrlModel.setFileHash(playAddr.getFileHash());
            simUrlModel.setHeight(playAddr.getHeight());
            simUrlModel.setWidth(playAddr.getWidth());
            simUrlModel.setSize(playAddr.getSize());
            if (playAddr instanceof VideoUrlModel) {
                uri = ((VideoUrlModel) playAddr).getOriginUri();
            } else {
                uri = playAddr.getUri();
            }
            simUrlModel.setUri(uri);
            simUrlModel.setUrlKey(playAddr.getUrlKey());
            simUrlModel.setUrlList(playAddr.getUrlList());
        }
        simBitRate.setPlayAddr(simUrlModel);
        simBitRate.setBitRate(bitRate.getBitRate());
        simBitRate.setGearName(bitRate.getGearName());
        simBitRate.setQualityType(bitRate.getQualityType());
        simBitRate.setHdrBit(bitRate.getHdrBit());
        simBitRate.setHdrType(bitRate.getHdrType());
        simBitRate.setFormat(bitRate.getFormat());
        simBitRate.setFidProfileLabels(bitRate.getFidProfileLabels());
        simBitRate.setFps(bitRate.getFps());
        return simBitRate;
    }

    public static SimVideo LIZLLL(Video video) {
        SimPlayTokenAuth simPlayTokenAuth;
        SimVideo simVideo = new SimVideo();
        simVideo.origin = video;
        simVideo.cdnUrlExpired = video.cdnUrlExpired;
        ArrayList arrayList = new ArrayList();
        if (video.getRawBitRate() != null) {
            Iterator it2 = new ArrayList(video.getRawBitRate()).iterator();
            while (it2.hasNext()) {
                arrayList.add(LIZJ((BitRate) it2.next()));
            }
        }
        simVideo.setBitRate(arrayList);
        ArrayList arrayList2 = new ArrayList();
        List<BitrateAudioStruct> list = video.bitRateAudio;
        if (list != null) {
            Iterator it3 = new ArrayList(list).iterator();
            while (it3.hasNext()) {
                arrayList2.add(LIZIZ((BitrateAudioStruct) it3.next()));
            }
        }
        simVideo.setAudioBitRate(arrayList2);
        PlayTokenAuth drmTokenAuth = video.getDrmTokenAuth();
        if (drmTokenAuth == null) {
            simPlayTokenAuth = null;
        } else {
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
        SimVideoUrlModel simVideoUrlModelLJ = LJ(video.getPlayAddr());
        simVideo.setPlayAddr(simVideoUrlModelLJ);
        if (simVideoUrlModelLJ != null && simVideoUrlModelLJ.getSourceId() != null) {
            simVideo.setSourceId(simVideoUrlModelLJ.getSourceId());
        }
        SimVideoUrlModel simVideoUrlModelLJ2 = LJ(video.getPlayAddrBytevc1());
        if (simVideoUrlModelLJ2 != null && simVideoUrlModelLJ2.getSourceId() != null) {
            simVideo.setSourceId(simVideoUrlModelLJ2.getSourceId());
        }
        simVideo.setPlayAddrBytevc1(simVideoUrlModelLJ2);
        SimVideoUrlModel simVideoUrlModelLJ3 = LJ(video.getH264PlayAddr());
        if (simVideoUrlModelLJ3 != null && simVideoUrlModelLJ3.getSourceId() != null) {
            simVideo.setSourceId(simVideoUrlModelLJ3.getSourceId());
        }
        simVideo.setRatio(video.getRatio());
        simVideo.setEnableIntertrustDrm(video.enableIntertrustDrm());
        simVideo.setMeta(video.getMeta());
        simVideo.setFormat(video.getFormat());
        simVideo.setVideoLength(video.getVideoLength());
        simVideo.setVideoModelStr(video.getVideoModelStr());
        simVideo.setVideoModelMap(video.getVideoModelMap());
        simVideo.setWidth(video.getWidth());
        simVideo.setDidProfileLabels(video.getDidProfileLabels());
        simVideo.setVidProfileLabels(video.getVidProfileLabels());
        return simVideo;
    }

    public static SimVideoUrlModel LJ(VideoUrlModel videoUrlModel) {
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
        long pb2AwemeMillis = videoUrlModel.getPb2AwemeMillis();
        if (0 == pb2AwemeMillis) {
            pb2AwemeMillis = System.currentTimeMillis();
            videoUrlModel.setPb2AwemeMillis(pb2AwemeMillis);
        }
        simVideoUrlModel.setPb2AwemeMillis(pb2AwemeMillis);
        ArrayList arrayList = new ArrayList();
        if (videoUrlModel.getRawBitRate() != null) {
            Iterator it2 = new ArrayList(videoUrlModel.getRawBitRate()).iterator();
            while (it2.hasNext()) {
                arrayList.add(LIZJ((BitRate) it2.next()));
            }
        }
        simVideoUrlModel.setBitRate(arrayList);
        ArrayList arrayList2 = new ArrayList();
        List<BitrateAudioStruct> audioBitrate = videoUrlModel.getAudioBitrate();
        if (audioBitrate != null) {
            Iterator it3 = new ArrayList(audioBitrate).iterator();
            while (it3.hasNext()) {
                arrayList2.add(LIZIZ((BitrateAudioStruct) it3.next()));
            }
        }
        simVideoUrlModel.setAudioBitRate(arrayList2);
        simVideoUrlModel.setMeta(videoUrlModel.getMeta());
        simVideoUrlModel.setDidProfileLabels(videoUrlModel.getDidProfileLabels());
        simVideoUrlModel.setVidProfileLabels(videoUrlModel.getVidProfileLabels());
        simVideoUrlModel.setFormat(videoUrlModel.getFormat());
        simVideoUrlModel.setAspectRatio(videoUrlModel.getAspectRatio());
        simVideoUrlModel.setCdnUrlExpired(videoUrlModel.getCdnUrlExpired());
        simVideoUrlModel.setDashVideoModelStr(videoUrlModel.getDashVideoModelStr());
        simVideoUrlModel.setDashVideoModelMap(videoUrlModel.getDashVideoModelMap());
        simVideoUrlModel.setFileCheckSum(videoUrlModel.getFileCheckSum());
        simVideoUrlModel.setBytevc1(videoUrlModel.isBytevc1());
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
        if (!TextUtils.isEmpty(videoUrlModel.getDashVideoId())) {
            simVideoUrlModel.setDashVideoId(videoUrlModel.getDashVideoId());
        }
        if (videoUrlModel.getHitBitrate() != null) {
            simVideoUrlModel.setHitBitrate(videoUrlModel.getHitBitrate());
        }
        if (videoUrlModel.getHitDashVideoBitrate() != null) {
            simVideoUrlModel.setHitDashVideoBitrate(LIZJ(videoUrlModel.getHitDashVideoBitrate()));
        }
        if (videoUrlModel.getHitDashAudioBitrate() != null) {
            simVideoUrlModel.setHitDashAudioBitrate(LIZIZ(videoUrlModel.getHitDashAudioBitrate()));
        }
        return simVideoUrlModel;
    }

    public static UrlModel LJFF(SimUrlModel simUrlModel) {
        Object obj;
        String uri;
        if (simUrlModel != null && (obj = simUrlModel.origin) != null) {
            UrlModel urlModel = (UrlModel) obj;
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
            return urlModel;
        }
        return null;
    }
}
