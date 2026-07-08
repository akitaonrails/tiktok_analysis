package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.HashtagsModel;
import com.ss.android.ugc.aweme.creative.model.photomode.PhotoModeAfterCreationFeedbackMobParams;
import com.ss.android.ugc.aweme.creative.model.photomode.PhotoModeBannerMobParams;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0mcH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1403110mcH {
    public static final void LIZ(C0LAB c0lab, PhotoModeAfterCreationFeedbackMobParams photoModeAfterCreationFeedbackMobParams) {
        if (photoModeAfterCreationFeedbackMobParams != null) {
            String boostedH5EnterMethod = photoModeAfterCreationFeedbackMobParams.getBoostedH5EnterMethod();
            if (boostedH5EnterMethod != null) {
                c0lab.LJ("info_photo_boosted_feedback_h5_enter_method", boostedH5EnterMethod);
            }
            String boostedH5EnterPosition = photoModeAfterCreationFeedbackMobParams.getBoostedH5EnterPosition();
            if (boostedH5EnterPosition != null) {
                c0lab.LJ("info_photo_boosted_feedback_h5_shoot_position", boostedH5EnterPosition);
            }
        }
    }

    public static final void LIZJ(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
        List<String> list;
        PhotoModeAfterCreationFeedbackMobParams photoModeAfterCreationFeedbackMobParams = videoPublishEditModel.creativeModel.initialModel.photoModeAfterFeedbackMobParams;
        if (photoModeAfterCreationFeedbackMobParams != null) {
            LIZ(c0lab, photoModeAfterCreationFeedbackMobParams);
            CreativeModel creativeModel = videoPublishEditModel.creativeModel;
            HashtagsModel hashtagsModel = creativeModel.initialModel.hashtagsModel;
            if (hashtagsModel != null && (list = hashtagsModel.hashtags) != null) {
                List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(creativeModel.commonMobModel.hashtagList, new String[]{","}, 0, 6);
                ArrayList arrayList = new ArrayList();
                for (Object obj : listLJJLIIIJILLIZJL) {
                    if (list.contains(obj)) {
                        arrayList.add(obj);
                    }
                }
                if (!arrayList.isEmpty()) {
                    c0lab.LIZ(1, "is_info_photo_boosted_feedback_h5_topics_hashtag");
                    c0lab.LIZLLL(arrayList, "info_photo_boosted_feedback_h5_topics_hashtag");
                } else {
                    c0lab.LIZ(0, "is_info_photo_boosted_feedback_h5_topics_hashtag");
                }
            }
        }
    }

    public static final void LIZLLL(C0LAB c0lab, PhotoModeBannerMobParams photoModeBannerMobParams, boolean z) {
        String photoBannerEnterFrom;
        if (photoModeBannerMobParams != null) {
            String photoBannerCategory = photoModeBannerMobParams.getPhotoBannerCategory();
            if (photoBannerCategory != null) {
                c0lab.LJ("category_name", photoBannerCategory);
            }
            String photoBannerTopicId = photoModeBannerMobParams.getPhotoBannerTopicId();
            if (photoBannerTopicId != null) {
                c0lab.LJ("topic_id", photoBannerTopicId);
            }
            String photoBannerSessionId = photoModeBannerMobParams.getPhotoBannerSessionId();
            if (photoBannerSessionId != null) {
                c0lab.LJ("session_id", photoBannerSessionId);
            }
            String photoBannerDebugInfo = photoModeBannerMobParams.getPhotoBannerDebugInfo();
            if (photoBannerDebugInfo != null) {
                c0lab.LJ("debuginfo", photoBannerDebugInfo);
            }
            if (z && (photoBannerEnterFrom = photoModeBannerMobParams.getPhotoBannerEnterFrom()) != null) {
                c0lab.LJ("enter_from", photoBannerEnterFrom);
            }
            String photoBannerShootEnterFrom = photoModeBannerMobParams.getPhotoBannerShootEnterFrom();
            if (photoBannerShootEnterFrom != null) {
                c0lab.LJ("shoot_enter_from", photoBannerShootEnterFrom);
            }
            Integer photoBannerTopicType = photoModeBannerMobParams.getPhotoBannerTopicType();
            if (photoBannerTopicType != null) {
                c0lab.LIZ(photoBannerTopicType.intValue(), "topic_type");
            }
            String photoBannerSearchTopicId = photoModeBannerMobParams.getPhotoBannerSearchTopicId();
            if (photoBannerSearchTopicId != null) {
                c0lab.LJ("search_topic_id", photoBannerSearchTopicId);
            }
        }
    }

    public static final void LIZIZ(C0LAB c0lab, String str, String str2, String str3, String str4, String str5, String str6) {
        c0lab.LJ("enter_from", "personal_homepage");
        c0lab.LJ("position", str);
        c0lab.LJ("group_id", str2);
        c0lab.LJ("total_vv", str3);
        c0lab.LJ("boosted_vv", str4);
        c0lab.LJ("action_type", str5);
        if (str6 != null) {
            c0lab.LJ("click_type", str6);
        }
    }
}
