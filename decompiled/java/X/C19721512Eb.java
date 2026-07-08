package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.commerce.tools.tcm.CommerceToolsTcmModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.trending.TrendingUploadModel;
import com.ss.android.ugc.aweme.feed.model.trendingtopic.VideoTrendingTopic;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.viewmodel.VideoPublishViewModel;

/* JADX INFO: renamed from: X.12Eb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19721512Eb {
    public static final C19721512Eb LIZ = new C19721512Eb();

    public static C19721612Ec LIZ(boolean z, VideoPublishEditModel videoPublishEditModel, VideoPublishViewModel videoPublishViewModel, CommerceToolsTcmModel commerceToolsTcmModel, C193M c193m, String str, Boolean bool) {
        int iLJIIJJI;
        VideoTrendingTopic videoTrendingTopic;
        CreativeModel creativeModel;
        TrendingUploadModel trendingUploadModel;
        CreativeModel creativeModel2;
        TrendingUploadModel trendingUploadModel2;
        AVMusic aVMusicExtractAVMusic;
        Bundle bundle = new Bundle();
        bundle.putBoolean("key_enable_sponsor", z);
        bundle.putBoolean("key_general_music", C856100XiC.LIZIZ(videoPublishEditModel));
        boolean z2 = false;
        if (videoPublishEditModel != null && (aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(videoPublishEditModel.creativeModel.musicBuzModel)) != null && aVMusicExtractAVMusic.isCommerceMusic()) {
            z2 = true;
        }
        bundle.putBoolean("key_commerce_music", z2);
        if (videoPublishEditModel != null) {
            iLJIIJJI = C1428470nHB.LJIIJJI(videoPublishEditModel);
        } else {
            iLJIIJJI = -1;
        }
        bundle.getInt("key_aweme_type", iLJIIJJI);
        C786410Ut5.LJJIJL(bundle, "key_tcm_model", commerceToolsTcmModel);
        if (videoPublishEditModel != null && (creativeModel2 = videoPublishEditModel.creativeModel) != null && (trendingUploadModel2 = creativeModel2.trendingUploadModel) != null) {
            videoTrendingTopic = trendingUploadModel2.trendingTopic;
        } else {
            videoTrendingTopic = null;
        }
        C786410Ut5.LJJIZ(bundle, "key_trending_topic", videoTrendingTopic);
        if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (trendingUploadModel = creativeModel.trendingUploadModel) != null) {
            bundle.putInt("key_trending_topic_status", trendingUploadModel.trendingTopicStatus);
        }
        C1428470nHB.LLIL(bundle, videoPublishEditModel);
        bundle.putBoolean("key_multi_photo_mode", C1428470nHB.LJLIIL(videoPublishEditModel));
        C786410Ut5.LJJJI("content_type", C1428470nHB.LJIILL(videoPublishEditModel), bundle);
        C786410Ut5.LJJJI("key_nav_bar_title", str, bundle);
        if (bool != null) {
            bundle.putBoolean("key_is_single_section", bool.booleanValue());
        }
        return C19721412Ea.LIZ(bundle, videoPublishViewModel, c193m);
    }
}
