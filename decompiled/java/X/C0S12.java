package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0S12, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S12 {
    public static final Aweme LIZ(String str) {
        Aweme aweme = new Aweme();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(UUID.randomUUID());
        aweme.setAid(C2188811AlT.LIZIZ(sbLIZ));
        aweme.setAwemeType(40);
        AwemeBizExtKt.setStoryFakeAweme(aweme, true);
        AwemeBizExtKt.setFakeAid(aweme, "story_fake_upload_guide_in_viewer_list_aid");
        Story story = new Story(0L, false, 0L, null, 0L, false, false, false, false, false);
        story.setFaked(true);
        aweme.setStory(story);
        aweme.setIsTikTokStory(true);
        return aweme;
    }

    public static final boolean LIZIZ(Aweme aweme) {
        Story story = aweme.getStory();
        if (story != null && story.isFaked() && Intrinsics.LJFF(AwemeBizExtKt.getFakeAid(aweme), "story_fake_upload_guide_in_viewer_list_aid")) {
            return true;
        }
        return false;
    }

    public static final boolean LIZJ(Aweme aweme) {
        if (AwemeBizExtKt.isStoryFakeAweme(aweme) && aweme.getAwemeType() == 5457746 && Intrinsics.LJFF(AwemeBizExtKt.getFakeAid(aweme), "story_immersive_guide_upload_card_aid")) {
            return true;
        }
        return false;
    }

    public static final boolean LIZLLL(String str) {
        if (!Intrinsics.LJFF(str, "click_publish_card_plus") && !Intrinsics.LJFF(str, "click_publish_card_create_new_story") && !Intrinsics.LJFF(str, "click_view_lists_panel_camera_icon") && !Intrinsics.LJFF(str, "click_view_lists_panel_profile_plus") && !Intrinsics.LJFF(str, "click_view_lists_panel_camera_button")) {
            return false;
        }
        return true;
    }
}
