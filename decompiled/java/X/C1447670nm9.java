package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.edit.ImageSynthesisResult;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImage;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.feed.model.publish.PublishPreviewInfo;
import com.ss.android.ugc.aweme.feed.model.publish.PublishStatus;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.shortvideo.transition.VideoCoverBitmapHolder;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.Collections;
import kotlin.jvm.internal.AwS266S0300000_22;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0nm9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1447670nm9 {
    public static final VideoUrlModel LIZ(PublishModel publishModel) {
        VideoPublishEditModel videoPublishEditModel;
        CreativeModel creativeModel;
        MusicBuzModel musicBuzModel;
        AVMusic aVMusicExtractAVMusic;
        BaseShortVideoContext baseShortVideoContext = publishModel.editModel;
        if (!(baseShortVideoContext instanceof VideoPublishEditModel) || (videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext) == null || (creativeModel = videoPublishEditModel.creativeModel) == null || (musicBuzModel = creativeModel.musicBuzModel) == null || (aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(musicBuzModel)) == null) {
            return null;
        }
        VideoUrlModel videoUrlModel = new VideoUrlModel();
        videoUrlModel.setDuration(aVMusicExtractAVMusic.getDuration());
        videoUrlModel.setUri(aVMusicExtractAVMusic.path);
        videoUrlModel.setUrlList(Collections.singletonList(videoUrlModel.getUri()));
        videoUrlModel.setUrlKey(videoUrlModel.getUri());
        return videoUrlModel;
    }

    public static final boolean LIZIZ(PublishModel publishModel) {
        VideoPublishEditModel videoPublishEditModel;
        BaseShortVideoContext baseShortVideoContext = publishModel.editModel;
        if ((baseShortVideoContext instanceof VideoPublishEditModel) && (videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext) != null) {
            return C1428470nHB.LJJZZI(videoPublishEditModel);
        }
        return false;
    }

    public static final boolean LIZJ(PublishModel publishModel) {
        VideoPublishEditModel videoPublishEditModel;
        BaseShortVideoContext baseShortVideoContext = publishModel.editModel;
        if ((baseShortVideoContext instanceof VideoPublishEditModel) && (videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext) != null) {
            return C123100dR.LIZ(videoPublishEditModel.creativeModel.paidContentModel.getCollectionId());
        }
        return false;
    }

    public static final PhotoModeImage LJ(SingleImageData singleImageData) {
        UrlModel urlModelLJIIIIZZ = LJIIIIZZ(singleImageData);
        if (urlModelLJIIIIZZ != null) {
            return new PhotoModeImage(urlModelLJIIIIZZ, urlModelLJIIIIZZ.getWidth(), urlModelLJIIIIZZ.getHeight(), Float.valueOf(0.0f), null, 0);
        }
        return null;
    }

    public static final PhotoModeImageUrlModel LJFF(SingleImageData singleImageData) {
        UrlModel urlModelLJIIIIZZ = LJIIIIZZ(singleImageData);
        if (urlModelLJIIIIZZ != null) {
            return new PhotoModeImageUrlModel(urlModelLJIIIIZZ, urlModelLJIIIIZZ, urlModelLJIIIIZZ, urlModelLJIIIIZZ, null, null, null, null, null, null, null, null);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C1447700nmC LJI(com.ss.android.ugc.aweme.shortvideo.publish.PublishModel r15) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1447670nm9.LJI(com.ss.android.ugc.aweme.shortvideo.publish.PublishModel):X.0nmC");
    }

    public static final C1447700nmC LJII(PublishModel publishModel) {
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) publishModel.editModel;
        Video video = new Video();
        LIZLLL(videoPublishEditModel, video, VideoCoverBitmapHolder.LL);
        int iLJIIJ = C1433730nPf.LJIIJ(C1433730nPf.LIZ, publishModel.publishId);
        String strLJIILIIL = C1428470nHB.LJIILIIL(videoPublishEditModel);
        Aweme aweme = new Aweme();
        aweme.setAid(publishModel.creationId);
        aweme.setAwemeType(aweme.getAwemeType());
        AwemeBizExtKt.setScheduleId(aweme, publishModel.creationId);
        aweme.setAuthor(C10EU.LIZ());
        aweme.setCreateTime(System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
        aweme.setVideo(video);
        aweme.setIsTikTokStory(false);
        AwemeBizExtKt.setPreviewData(aweme, new PublishPreviewInfo(true, iLJIIJ, PublishStatus.DEFAULT, publishModel.creationId, strLJIILIIL, publishModel.publishId));
        if (videoPublishEditModel.getTextPublishUploadModel() != null) {
            aweme.setAwemeType(C1428470nHB.LJIIJJI(videoPublishEditModel));
        }
        return new C1447700nmC(publishModel, aweme, LIZJ(publishModel));
    }

    public static final UrlModel LJIIIIZZ(SingleImageData singleImageData) {
        UrlModel urlModel = new UrlModel();
        ImageSynthesisResult synthesisData = singleImageData.getSynthesisData();
        if (synthesisData != null) {
            urlModel.setUrlList(C1697810uHb.LJ(synthesisData.getPath()));
            urlModel.setHeight(synthesisData.getHeight());
            urlModel.setWidth(synthesisData.getWidth());
            return urlModel;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public static final void LIZLLL(VideoPublishEditModel videoPublishEditModel, Video video, Bitmap bitmap) {
        String strLJII;
        C0MH8 c0mh8 = C0MH8.LIZ;
        if (c0mh8.LJ(videoPublishEditModel, -1) && (strLJII = c0mh8.LJII(videoPublishEditModel, -1)) != null) {
            UrlModel urlModel = new UrlModel();
            urlModel.setUrlList(C1697810uHb.LJ(strLJII));
            video.setCover(urlModel);
            return;
        }
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = videoPublishEditModel.creativeModel.publishPreviewModel.firstFramePath;
        String strLIZIZ = C1429320nIY.LIZIZ(videoPublishEditModel);
        String str = videoPublishEditModel.creativeModel.postPageModel.customCoverWithStickerPath;
        boolean zLIZ = C123100dR.LIZ(str);
        ?? LJJIFFI = str;
        if (!zLIZ) {
            if (strLIZIZ != null && C2286708xd.LIZJ(strLIZIZ)) {
                LJJIFFI = u.LJJIFFI(strLIZIZ, "_cover_img_custom.png", "_cover_img_custom_with_sticker.png", false);
            } else {
                LJJIFFI = "";
            }
        }
        if (C1429320nIY.LIZJ(videoPublishEditModel) && C2286708xd.LIZJ(LJJIFFI)) {
            c259800zU.element = LJJIFFI;
        }
        CharSequence charSequence = (CharSequence) c259800zU.element;
        if (charSequence != null && charSequence.length() != 0) {
            UrlModel urlModel2 = new UrlModel();
            urlModel2.setUrlList(C1697810uHb.LJ(c259800zU.element));
            video.setCover(urlModel2);
        } else {
            if (ActivityStack.getTopActivity() == null) {
                return;
            }
            C565790MGz c565790MGz = C565790MGz.LIZ;
            ActivityStack.getTopActivity();
            AwS266S0300000_22 awS266S0300000_22 = new AwS266S0300000_22(video, (Video) c259800zU, (C259800zU<String>) videoPublishEditModel, (VideoPublishEditModel) 28);
            c565790MGz.getClass();
            C565790MGz.LIZ(videoPublishEditModel, awS266S0300000_22, bitmap);
        }
    }
}
