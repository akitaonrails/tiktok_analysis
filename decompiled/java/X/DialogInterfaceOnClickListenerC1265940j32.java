package X;

import Y.ARunnableS119S0100000_19;
import android.content.DialogInterface;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.profile.business.profile.background.ProfileBgImagePreviewActivity;
import com.ss.android.ugc.profile.business.ur.edit.InstagramPresenter;
import com.ss.android.ugc.profile.business.ur.editprofileviewmodel.EditProfileNamesViewModel;
import com.ss.android.ugc.profile.business.ur.platform.BioLinkData;
import com.ss.android.ugc.profile.business.ur.platform.business.BioUserWebSiteComponent;
import com.ss.android.ugc.profile.business.ur.platform.follow.HeaderCTAFollowComponent;
import com.ss.android.ugc.profile.business.ur.ui.HeaderDetailActivity;
import com.ss.android.ugc.profile.business.ur.ui.ProfileEditFragment;
import kotlin.jvm.internal.AFwS257S0000000_19;

/* JADX INFO: renamed from: X.0j32, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class DialogInterfaceOnClickListenerC1265940j32 implements DialogInterface.OnClickListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.$t) {
            case 0:
                onClick$0(this, dialogInterface, i);
                break;
            case 1:
                onClick$1(this, dialogInterface, i);
                break;
            case 2:
                onClick$2(this, dialogInterface, i);
                break;
            case 3:
                onClick$3(this, dialogInterface, i);
                break;
            case 4:
                onClick$4(this, dialogInterface, i);
                break;
            case 5:
                onClick$5(this, dialogInterface, i);
                break;
            case 6:
                onClick$6(this, dialogInterface, i);
                break;
            case 7:
                onClick$7(this, dialogInterface, i);
                break;
        }
    }

    public DialogInterfaceOnClickListenerC1265940j32(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onClick$0(DialogInterfaceOnClickListenerC1265940j32 dialogInterfaceOnClickListenerC1265940j32, DialogInterface dialogInterface, int i) {
        InstagramPresenter instagramPresenterKS = ((ProfileEditFragment) dialogInterfaceOnClickListenerC1265940j32.l0).kS();
        instagramPresenterKS.LLILZLL = false;
        InterfaceC1242740iRc.LIZ.getClass();
        ((InterfaceC1242740iRc) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C0CQT.LIZJ).build().retrofit.LIZ(InterfaceC1242740iRc.class)).unlink().LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LIZ(new C1266080j3G(instagramPresenterKS, 0));
        dialogInterface.dismiss();
        ((ProfileEditFragment) dialogInterfaceOnClickListenerC1265940j32.l0).sT();
    }

    public static final void onClick$1(DialogInterfaceOnClickListenerC1265940j32 dialogInterfaceOnClickListenerC1265940j32, DialogInterface dialogInterface, int i) {
        C09UZ.LIZ(new ARunnableS119S0100000_19(((ProfileEditFragment) dialogInterfaceOnClickListenerC1265940j32.l0).FS(), 4));
        dialogInterface.dismiss();
        ((ProfileEditFragment) dialogInterfaceOnClickListenerC1265940j32.l0).sT();
    }

    public static final void onClick$2(DialogInterfaceOnClickListenerC1265940j32 dialogInterfaceOnClickListenerC1265940j32, DialogInterface dialogInterface, int i) {
        C0W79.LIZLLL((HeaderDetailActivity) dialogInterfaceOnClickListenerC1265940j32.l0);
    }

    public static final void onClick$3(DialogInterfaceOnClickListenerC1265940j32 dialogInterfaceOnClickListenerC1265940j32, DialogInterface dialogInterface, int i) {
        C0W79.LIZLLL((ProfileBgImagePreviewActivity) dialogInterfaceOnClickListenerC1265940j32.l0);
    }

    public static final void onClick$4(DialogInterfaceOnClickListenerC1265940j32 dialogInterfaceOnClickListenerC1265940j32, DialogInterface dialogInterface, int i) {
        EditProfileNamesViewModel editProfileNamesViewModel = (EditProfileNamesViewModel) dialogInterfaceOnClickListenerC1265940j32.l0;
        editProfileNamesViewModel.getClass();
        editProfileNamesViewModel.setState(AFwS257S0000000_19.get$arr$(720));
    }

    public static final void onClick$5(DialogInterfaceOnClickListenerC1265940j32 dialogInterfaceOnClickListenerC1265940j32, DialogInterface dialogInterface, int i) {
        EditProfileNamesViewModel editProfileNamesViewModel = (EditProfileNamesViewModel) dialogInterfaceOnClickListenerC1265940j32.l0;
        editProfileNamesViewModel.getClass();
        editProfileNamesViewModel.setState(AFwS257S0000000_19.get$arr$(721));
    }

    public static final void onClick$6(DialogInterfaceOnClickListenerC1265940j32 dialogInterfaceOnClickListenerC1265940j32, DialogInterface dialogInterface, int i) {
        String bioUrl;
        C19EG c19egLIZ = C724240Sb0.LIZ((BioUserWebSiteComponent) dialogInterfaceOnClickListenerC1265940j32.l0);
        if (c19egLIZ != null) {
            BioUserWebSiteComponent bioUserWebSiteComponent = (BioUserWebSiteComponent) dialogInterfaceOnClickListenerC1265940j32.l0;
            C2277881EDy c2277881EDy = C2277881EDy.LIZIZ;
            BioLinkData bioLinkData = (BioLinkData) bioUserWebSiteComponent.LLJJLIIIJLLLLLLLZ;
            if (bioLinkData != null) {
                bioUrl = bioLinkData.getBioUrl();
            } else {
                bioUrl = null;
            }
            c2277881EDy.startProfileEditBioUrlActivity(c19egLIZ, bioUrl);
        }
    }

    public static final void onClick$7(DialogInterfaceOnClickListenerC1265940j32 dialogInterfaceOnClickListenerC1265940j32, DialogInterface dialogInterface, int i) {
        if (i == 0) {
            ((HeaderCTAFollowComponent) dialogInterfaceOnClickListenerC1265940j32.l0).Bm1(-1);
        }
        dialogInterface.dismiss();
    }
}
