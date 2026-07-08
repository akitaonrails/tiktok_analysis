package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.aime.IAIMEServices;
import com.ss.android.ugc.profile.business.ur.editprofileviewmodel.EditProfileAiMeViewModel;

/* JADX INFO: renamed from: X.0MIu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.editprofileviewmodel.EditProfileAiMeViewModel", f = "EditProfileAiMeViewModel.kt", l = {183}, m = "showSideTaskBottomSheet")
public final class C566260MIu extends AbstractC23140094w {
    public IAIMEServices LL;
    public Fragment LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ EditProfileAiMeViewModel LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C566260MIu(EditProfileAiMeViewModel editProfileAiMeViewModel, InterfaceC1364105Vn<? super C566260MIu> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = editProfileAiMeViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditProfileAiMeViewModel@ec0.showSideTaskBottomSheet$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objVQ2 = this.LLILZ.vQ2(null, null, this);
        C1C7U.LIZIZ("EditProfileAiMeViewModel@ec0.showSideTaskBottomSheet$1");
        return objVQ2;
    }
}
