package X;

import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0MA5, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public /* synthetic */ class C0MA5 extends C2217421BqW implements Function1<SocialMediaPickerViewModel, C0MBC> {
    public static final C0MA5 LL = new C0MA5();

    public C0MA5() {
        super(1, C0MA9.class, "draftEntrance", "draftEntrance(Lcom/ss/android/ugc/aweme/social/creation/mediapicker/ui/SocialMediaPickerViewModel;)Lcom/ss/android/ugc/aweme/social/creation/mediapicker/ui/multientrance/EntranceDescriptor;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0MBC invoke(SocialMediaPickerViewModel socialMediaPickerViewModel) {
        SocialMediaPickerViewModel socialMediaPickerViewModel2 = socialMediaPickerViewModel;
        if (C291040Baw.LIZ() && ((Boolean) ((C13FE) socialMediaPickerViewModel2.LLJJ).getValue()).booleanValue()) {
            return new C0MBC(C1669660tYC.LLIIL, 2131832395, !socialMediaPickerViewModel2.wQ2(), false, false, "draft", new AwS552S0100000_8(socialMediaPickerViewModel2, 989), 24);
        }
        return null;
    }
}
