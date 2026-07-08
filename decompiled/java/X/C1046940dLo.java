package X;

import com.ss.android.ugc.aweme.commercialize.model.LogoSpotlightVideoModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0dLo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1046940dLo {
    public static final C1046940dLo LIZ = new C1046940dLo();
    public static final ConcurrentHashMap<String, VideoUrlModel> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Boolean> LIZJ = new ConcurrentHashMap<>();

    public static VideoUrlModel LIZ(LogoSpotlightVideoModel logoSpotlightVideoModel) {
        List<String> urlList;
        double dDoubleValue;
        int iIntValue;
        int iIntValue2;
        String vid = logoSpotlightVideoModel.getVid();
        if (vid == null || (urlList = logoSpotlightVideoModel.getUrlList()) == null) {
            return null;
        }
        ConcurrentHashMap<String, VideoUrlModel> concurrentHashMap = LIZIZ;
        if (concurrentHashMap.containsKey(vid)) {
            return concurrentHashMap.get(vid);
        }
        VideoUrlModel videoUrlModel = new VideoUrlModel();
        videoUrlModel.setUri(vid);
        videoUrlModel.setSourceId(vid);
        videoUrlModel.setUrlList(urlList);
        Double videoLength = logoSpotlightVideoModel.getVideoLength();
        if (videoLength != null) {
            dDoubleValue = videoLength.doubleValue();
        } else {
            dDoubleValue = 0.0d;
        }
        videoUrlModel.setDuration(dDoubleValue);
        Integer width = logoSpotlightVideoModel.getWidth();
        if (width != null) {
            iIntValue = width.intValue();
        } else {
            iIntValue = 1080;
        }
        videoUrlModel.setWidth(iIntValue);
        Integer height = logoSpotlightVideoModel.getHeight();
        if (height != null) {
            iIntValue2 = height.intValue();
        } else {
            iIntValue2 = 2160;
        }
        videoUrlModel.setHeight(iIntValue2);
        videoUrlModel.setFileHash(logoSpotlightVideoModel.getFileHash());
        videoUrlModel.setUrlKey(vid);
        videoUrlModel.setaK(logoSpotlightVideoModel.getPlayerAccessKey());
        concurrentHashMap.put(vid, videoUrlModel);
        return videoUrlModel;
    }

    public static boolean LIZJ(String str) {
        Boolean bool;
        if (str != null && (bool = LIZJ.get(str)) != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static Video LIZIZ(Video video, LogoSpotlightVideoModel logoSpotlightVideoModel) {
        Video videoCopyFrom = video.copyFrom();
        VideoUrlModel videoUrlModelLIZ = LIZ(logoSpotlightVideoModel);
        if (videoUrlModelLIZ != null) {
            videoCopyFrom.setPlayAddrBytevc1(videoUrlModelLIZ);
            videoCopyFrom.setPlayAddr(videoUrlModelLIZ);
            videoCopyFrom.setSourceId(videoUrlModelLIZ.getSourceId());
            videoCopyFrom.setDuration(videoUrlModelLIZ.getDuration());
            videoCopyFrom.setWidth(videoUrlModelLIZ.getWidth());
            videoCopyFrom.setHeight(videoUrlModelLIZ.getHeight());
            return videoCopyFrom;
        }
        return video;
    }
}
