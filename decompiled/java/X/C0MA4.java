package X;

import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0MA4, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public /* synthetic */ class C0MA4 extends C2217421BqW implements Function1<SocialMediaPickerViewModel, C0MBC> {
    public static final C0MA4 LL = new C0MA4();

    public C0MA4() {
        super(1, C0MA9.class, "onThisDayEntrance", "onThisDayEntrance(Lcom/ss/android/ugc/aweme/social/creation/mediapicker/ui/SocialMediaPickerViewModel;)Lcom/ss/android/ugc/aweme/social/creation/mediapicker/ui/multientrance/EntranceDescriptor;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0MBC invoke(SocialMediaPickerViewModel socialMediaPickerViewModel) {
        SocialMediaPickerViewModel socialMediaPickerViewModel2 = socialMediaPickerViewModel;
        if (C306750C0r.LIZ() && ((Boolean) ((C13FE) socialMediaPickerViewModel2.LLJJIJI).getValue()).booleanValue()) {
            return new C0MBC(C1669660tYC.f220Y, 2131833965, !socialMediaPickerViewModel2.wQ2(), false, false, "on_this_day", new AwS552S0100000_8(socialMediaPickerViewModel2, 990), 24);
        }
        return null;
    }
}
