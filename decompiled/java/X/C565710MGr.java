package X;

import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardVideo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.onthisday.OnThisDayTiktokMediaModel;
import java.util.List;

/* JADX INFO: renamed from: X.0MGr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C565710MGr {
    public static final OnThisDayTiktokMediaModel LIZIZ(ForwardMedia forwardMedia) {
        String str;
        List<String> urlList;
        PhotoModeImageUrlModel imagePostCover;
        UrlModel urlModel;
        List<String> urlList2;
        MediaModel mediaModel = forwardMedia.localMedia;
        if (mediaModel != null) {
            str = "local";
        } else if (forwardMedia.isStory()) {
            str = "story";
        } else {
            str = "post";
        }
        String str2 = null;
        if (mediaModel != null) {
            OnThisDayTiktokMediaModel.Companion.getClass();
            OnThisDayTiktokMediaModel onThisDayTiktokMediaModel = new OnThisDayTiktokMediaModel(mediaModel.id, (EnumC538220L8y) null, "local", 6);
            TikTokMediaModel.Companion.getClass();
            C527240Km2.LIZ(onThisDayTiktokMediaModel, mediaModel);
            return onThisDayTiktokMediaModel;
        }
        int i = 4;
        OnThisDayTiktokMediaModel onThisDayTiktokMediaModel2 = new OnThisDayTiktokMediaModel(forwardMedia.sourceId, EnumC538220L8y.RECALL_MEDIA, str, 4);
        if (C565720MGs.LIZ(forwardMedia)) {
            i = 1;
        }
        onThisDayTiktokMediaModel2.type = i;
        onThisDayTiktokMediaModel2.duration = forwardMedia.video.getSourceDuration();
        if (C565720MGs.LIZ(forwardMedia)) {
            PhotoModeImageInfo photoModeImageInfo = forwardMedia.photoModeImageInfo;
            if (photoModeImageInfo != null && (imagePostCover = photoModeImageInfo.getImagePostCover()) != null && (urlModel = imagePostCover.thumbnail) != null && (urlList2 = urlModel.getUrlList()) != null) {
                str2 = (String) C13LP.LJJJLZIJ(0, urlList2);
            }
        } else {
            UrlModel originCoverModel = forwardMedia.video.getOriginCoverModel();
            if (originCoverModel != null && (urlList = originCoverModel.getUrlList()) != null) {
                str2 = (String) C13LP.LJJJLZIJ(0, urlList);
            }
        }
        onThisDayTiktokMediaModel2.thumbnail = str2;
        onThisDayTiktokMediaModel2.forwardMedia = forwardMedia;
        return onThisDayTiktokMediaModel2;
    }

    public static final boolean LIZJ(String str) {
        if (C2471909mP.LJJIIZI(str)) {
            return C2471909mP.LJJIIZ(null, str, false);
        }
        C0VSJ c0vsj = new C0VSJ(str);
        if (!c0vsj.exists() || c0vsj.length() <= 0) {
            return false;
        }
        return true;
    }

    public static final C0E4S LIZ(ForwardMedia forwardMedia, String str) {
        NLEResType nLEResType;
        String str2 = str;
        String str3 = forwardMedia.localPath;
        C554890LpX c554890LpX = C554890LpX.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("convertForwardMediaToSegment: sourcePath: ");
        sbLIZ.append(str3);
        C201955140j.LIZJ(c554890LpX, C2188811AlT.LIZIZ(sbLIZ));
        if (!LIZJ(str3)) {
            return null;
        }
        ForwardVideo forwardVideo = forwardMedia.video;
        if (str2 == null) {
            str2 = forwardMedia.localPath;
        }
        if (C565720MGs.LIZ(forwardMedia)) {
            nLEResType = NLEResType.IMAGE;
        } else {
            nLEResType = NLEResType.VIDEO;
        }
        C0E4S c0e4s = new C0E4S(str2, nLEResType, forwardVideo.getSourceDuration(), 1.0f, 0L, forwardVideo.getSourceDuration(), null, null, 192);
        c0e4s.LJII.put("create_time", Long.valueOf(forwardMedia.createTime));
        return c0e4s;
    }
}
