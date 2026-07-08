package X;

import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0MA7, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public /* synthetic */ class C0MA7 extends C2217421BqW implements Function1<SocialMediaPickerViewModel, C0MBC> {
    public static final C0MA7 LL = new C0MA7();

    public C0MA7() {
        super(1, C0MA9.class, "aiLiveEntrance", "aiLiveEntrance(Lcom/ss/android/ugc/aweme/social/creation/mediapicker/ui/SocialMediaPickerViewModel;)Lcom/ss/android/ugc/aweme/social/creation/mediapicker/ui/multientrance/EntranceDescriptor;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0MBC invoke(SocialMediaPickerViewModel socialMediaPickerViewModel) {
        SocialMediaPickerViewModel socialMediaPickerViewModel2 = socialMediaPickerViewModel;
        if (socialMediaPickerViewModel2.LL.getAiLiveSwitchStyle() != EnumC563850M9n.CELL_BUTTON) {
            return null;
        }
        return new C0MBC(C1669660tYC.LLLL, 2131820680, false, false, socialMediaPickerViewModel2.wQ2(), "ai_live", new AwS552S0100000_8(socialMediaPickerViewModel2, 987), 12);
    }
}
