package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.story.stickercreate.StorySocialEventStickerMobParam;
import com.ss.android.ugc.aweme.creative.model.story.stickercreate.StorySocialEventStickerModel;
import com.ss.android.ugc.aweme.creative.model.story.stickercreate.StoryStreakModel;

/* JADX INFO: renamed from: X.0msq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1413380msq {
    public static final void LIZ(CreativeModel creativeModel, C0LAB c0lab) {
        StorySocialEventStickerModel storySocialEventStickerModel;
        if (creativeModel != null && (storySocialEventStickerModel = creativeModel.storyEventStickerData) != null) {
            if (storySocialEventStickerModel.getCelebrationType() != 0) {
                c0lab.LJ("story_theme", String.valueOf(storySocialEventStickerModel.getCelebrationType()));
            }
            if (!storySocialEventStickerModel.isStoryEventStickerPost()) {
                return;
            }
            StorySocialEventStickerMobParam mobData = storySocialEventStickerModel.getMobData();
            c0lab.LJ("shoot_enter_from", mobData.getEnterFrom());
            c0lab.LJ("shoot_enter_method", mobData.getEnterMethod());
            StoryStreakModel storyStreakModel = storySocialEventStickerModel.getStoryStreakModel();
            if (storyStreakModel != null) {
                c0lab.LIZ(storyStreakModel.getStreakLevel(), "streak_level");
            }
        }
    }
}
