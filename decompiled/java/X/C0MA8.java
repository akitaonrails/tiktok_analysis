package X;

import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0MA8, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public /* synthetic */ class C0MA8 extends C2217421BqW implements Function1<SocialMediaPickerViewModel, C0MBC> {
    public static final C0MA8 LL = new C0MA8();

    public C0MA8() {
        super(1, C0MA9.class, "storyArchiveEntrance", "storyArchiveEntrance(Lcom/ss/android/ugc/aweme/social/creation/mediapicker/ui/SocialMediaPickerViewModel;)Lcom/ss/android/ugc/aweme/social/creation/mediapicker/ui/multientrance/EntranceDescriptor;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0MBC invoke(SocialMediaPickerViewModel socialMediaPickerViewModel) {
        SocialMediaPickerViewModel socialMediaPickerViewModel2 = socialMediaPickerViewModel;
        if (socialMediaPickerViewModel2.DQ2().LIZLLL != C0M8T.MULTI_ENTRANCE) {
            return null;
        }
        return new C0MBC(C1669660tYC.LJJJJJL, 2131823522, !socialMediaPickerViewModel2.wQ2(), false, false, "story_archive", new AwS552S0100000_8(socialMediaPickerViewModel2, 992), 24);
    }
}
