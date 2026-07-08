package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0MAA, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public /* synthetic */ class C0MAA extends C2217421BqW implements Function1<SocialMediaPickerViewModel, C0MBC> {
    public static final C0MAA LL = new C0MAA();

    public C0MAA() {
        super(1, C0MA9.class, "revealStoryEntrance", "revealStoryEntrance(Lcom/ss/android/ugc/aweme/social/creation/mediapicker/ui/SocialMediaPickerViewModel;)Lcom/ss/android/ugc/aweme/social/creation/mediapicker/ui/multientrance/EntranceDescriptor;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0MBC invoke(SocialMediaPickerViewModel socialMediaPickerViewModel) {
        SocialMediaPickerViewModel socialMediaPickerViewModel2 = socialMediaPickerViewModel;
        C728010Sh5.LIZ.getClass();
        if (!C728010Sh5.LIZ()) {
            return null;
        }
        C1668880tWw c1668880tWw = C1669660tYC.p;
        Keva repo = Keva.getRepo("social_creation_common");
        boolean z = false;
        int i = repo.getInt("reveal_story_guide_new_in_album_shown", 0);
        repo.storeInt("reveal_story_guide_new_in_album_shown", i + 1);
        if (i < 2) {
            z = true;
        }
        return new C0MBC(c1668880tWw, 2131849074, true ^ socialMediaPickerViewModel2.wQ2(), z, false, "reveal_story", new AwS552S0100000_8(socialMediaPickerViewModel2, 991), 16);
    }
}
