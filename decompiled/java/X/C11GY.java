package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.feed.model.story.BackgroundModel;

/* JADX INFO: renamed from: X.11GY, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11GY {
    public static final BackgroundModel[] LIZ = {new BackgroundModel(3, null, "#83DDDA", "https://sf-teko-source.tiktokcdn.com/obj/tiktok-teko-source-sg/8/teko/resource/story_thought_bg_res/avatar_thought_bg_1.jpg", "avatar_thought_bg_1.jpg"), new BackgroundModel(3, null, "#AF9BFF", "https://sf-teko-source.tiktokcdn.com/obj/tiktok-teko-source-sg/8/teko/resource/story_thought_bg_res/avatar_thought_bg_2.jpg", "avatar_thought_bg_2.jpg"), new BackgroundModel(3, null, "#BDEBBD", "https://sf-teko-source.tiktokcdn.com/obj/tiktok-teko-source-sg/8/teko/resource/story_thought_bg_res/avatar_thought_bg_3.jpg", "avatar_thought_bg_3.jpg"), new BackgroundModel(3, null, "#FFA094", "https://sf-teko-source.tiktokcdn.com/obj/tiktok-teko-source-sg/8/teko/resource/story_thought_bg_res/avatar_thought_bg_4.jpg", "avatar_thought_bg_4.jpg")};
    public static final BackgroundModel[] LIZIZ = {new BackgroundModel(3, null, "#86D9E9", "https://sf-teko-source.tiktokcdn.com/obj/tiktok-teko-internal-sg/9/teko/resource/story_thought_bg_res/avatar_thought_followup_bg_1.jpg", "avatar_thought_followup_bg_1.jpg"), new BackgroundModel(3, null, "#7BE182", "https://sf-teko-source.tiktokcdn.com/obj/tiktok-teko-internal-sg/9/teko/resource/story_thought_bg_res/avatar_thought_followup_bg_2.jpg", "avatar_thought_followup_bg_2.jpg"), new BackgroundModel(3, null, "#CAA8FD", "https://sf-teko-source.tiktokcdn.com/obj/tiktok-teko-internal-sg/9/teko/resource/story_thought_bg_res/avatar_thought_followup_bg_3.jpg", "avatar_thought_followup_bg_3.jpg"), new BackgroundModel(3, null, "##FCC675", "https://sf-teko-source.tiktokcdn.com/obj/tiktok-teko-internal-sg/9/teko/resource/story_thought_bg_res/avatar_thought_followup_bg_4.jpg", "avatar_thought_followup_bg_4.jpg"), new BackgroundModel(3, null, "#7FD2F8", "https://sf-teko-source.tiktokcdn.com/obj/tiktok-teko-internal-sg/9/teko/resource/story_thought_bg_res/avatar_thought_followup_bg_5.jpg", "avatar_thought_followup_bg_5.jpg"), new BackgroundModel(3, null, "#FBA8A2", "https://sf-teko-source.tiktokcdn.com/obj/tiktok-teko-internal-sg/9/teko/resource/story_thought_bg_res/avatar_thought_followup_bg_6.jpg", "avatar_thought_followup_bg_6.jpg"), new BackgroundModel(3, null, "#F09DFD", "https://sf-teko-source.tiktokcdn.com/obj/tiktok-teko-internal-sg/9/teko/resource/story_thought_bg_res/avatar_thought_followup_bg_7.jpg", "avatar_thought_followup_bg_7.jpg")};

    public static final BackgroundModel[] LIZ() {
        if (C298600Bn8.LIZ()) {
            return LIZIZ;
        }
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        BackgroundModel[] backgroundModelArr = LIZ;
        BackgroundModel[] backgroundModelArr2 = (BackgroundModel[]) settingsManagerLIZLLL.LJIIIIZZ("avatar_thoughts_backgrounds", BackgroundModel[].class, backgroundModelArr);
        return backgroundModelArr2 == null ? backgroundModelArr : backgroundModelArr2;
    }
}
