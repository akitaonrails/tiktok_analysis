package X;

import android.content.Context;
import com.bytedance.tiktok.homepage.mainpagefragment.SocialAvatarIconFlipPrerequisiteViewModel;
import com.ss.android.ugc.aweme.IForceBindingAccountService;
import com.ss.android.ugc.aweme.IPasskeyPopUpHelper;
import com.ss.android.ugc.aweme.IPopSuiteManagerService;
import com.ss.android.ugc.aweme.compliance.api.services.privateaccount.IPrivateAccountService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HYR, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.bytedance.tiktok.homepage.mainpagefragment.SocialAvatarIconFlipPrerequisiteViewModel$performPrivacyPopupShowCheck$1", f = "SocialAvatarIconFlipPrerequisiteViewModel.kt", l = {}, m = "invokeSuspend")
public final class C0HYR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SocialAvatarIconFlipPrerequisiteViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HYR(SocialAvatarIconFlipPrerequisiteViewModel socialAvatarIconFlipPrerequisiteViewModel, InterfaceC1364105Vn<? super C0HYR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = socialAvatarIconFlipPrerequisiteViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HYR(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean zShouldShow3PDialog;
        boolean z;
        C19EG c19egLIZIZ;
        C1C7U.LIZ("SocialAvatarIconFlipPrerequisiteViewModel@7f93.performPrivacyPopupShowCheck$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        boolean zShouldShowPopSuitePopup = ((IPopSuiteManagerService) this.LL.LL.getValue()).shouldShowPopSuitePopup("USER");
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        boolean z2 = false;
        if (contextLIZ != null && (c19egLIZIZ = C1388190mED.LIZIZ(contextLIZ)) != null) {
            zShouldShow3PDialog = ((IForceBindingAccountService) this.LL.LLILLJJLI.getValue()).shouldShow3PDialog(c19egLIZIZ, "personal_homepage", "3p_bind_profile", null, true);
        } else {
            zShouldShow3PDialog = false;
        }
        boolean zLIZJ = ((IPasskeyPopUpHelper) this.LL.LLILZ.getValue()).LIZJ();
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() && ((IPrivateAccountService) this.LL.LLILLL.getValue()).LJ() > 0 && ((IPrivateAccountService) this.LL.LLILLL.getValue()).LIZIZ() == 3) {
            z = true;
        } else {
            z = false;
        }
        SocialAvatarIconFlipPrerequisiteViewModel socialAvatarIconFlipPrerequisiteViewModel = this.LL;
        if (zShouldShowPopSuitePopup || zShouldShow3PDialog || zLIZJ || z) {
            z2 = true;
        }
        socialAvatarIconFlipPrerequisiteViewModel.LLJ = z2;
        socialAvatarIconFlipPrerequisiteViewModel.setState(new C0HYS(socialAvatarIconFlipPrerequisiteViewModel));
        this.LL.vQ2();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialAvatarIconFlipPrerequisiteViewModel@7f93.performPrivacyPopupShowCheck$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
