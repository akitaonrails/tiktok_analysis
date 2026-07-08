package X;

import com.ss.android.ugc.aweme.social.creation.api.mediapicker.SocialMediaPickerConfig;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0MA6, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public /* synthetic */ class C0MA6 extends C2217421BqW implements Function1<SocialMediaPickerViewModel, C0MBC> {
    public static final C0MA6 LL = new C0MA6();

    public C0MA6() {
        super(1, C0MA9.class, "cameraEntrance", "cameraEntrance(Lcom/ss/android/ugc/aweme/social/creation/mediapicker/ui/SocialMediaPickerViewModel;)Lcom/ss/android/ugc/aweme/social/creation/mediapicker/ui/multientrance/EntranceDescriptor;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0MBC invoke(SocialMediaPickerViewModel socialMediaPickerViewModel) {
        SocialMediaPickerViewModel socialMediaPickerViewModel2 = socialMediaPickerViewModel;
        SocialMediaPickerConfig.MultiEntranceAreaUIConfig multiEntranceAreaUIConfig = socialMediaPickerViewModel2.LL.getMultiEntranceAreaUIConfig();
        if (multiEntranceAreaUIConfig != null && !multiEntranceAreaUIConfig.getDisableCameraEntrance()) {
            return new C0MBC(C1669660tYC.LLILLL, 2131849109, !socialMediaPickerViewModel2.wQ2(), false, false, "camera", new AwS552S0100000_8(socialMediaPickerViewModel2, 988), 24);
        }
        return null;
    }
}
