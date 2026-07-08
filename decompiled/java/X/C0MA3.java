package X;

import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0MA3, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public /* synthetic */ class C0MA3 extends C2217421BqW implements Function1<SocialMediaPickerViewModel, C0MBC> {
    public static final C0MA3 LL = new C0MA3();

    public C0MA3() {
        super(1, C0MA9.class, "textModeOrThoughtEntrance", "textModeOrThoughtEntrance(Lcom/ss/android/ugc/aweme/social/creation/mediapicker/ui/SocialMediaPickerViewModel;)Lcom/ss/android/ugc/aweme/social/creation/mediapicker/ui/multientrance/EntranceDescriptor;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0MBC invoke(SocialMediaPickerViewModel socialMediaPickerViewModel) {
        SocialMediaPickerViewModel socialMediaPickerViewModel2 = socialMediaPickerViewModel;
        if (((Number) C0BWR.LIZ.getValue()).intValue() == 2) {
            return new C0MBC(C1669660tYC.y, 2131858549, !socialMediaPickerViewModel2.wQ2(), false, false, "text_mode", new AwS552S0100000_8(socialMediaPickerViewModel2, 993), 24);
        }
        C728060ShA.LIZ.getClass();
        if (C728060ShA.LIZ()) {
            return new C0MBC(C1669660tYC.z, 2131849111, false, false, false, "thought", new AwS552S0100000_8(socialMediaPickerViewModel2, 994), 28);
        }
        return null;
    }
}
