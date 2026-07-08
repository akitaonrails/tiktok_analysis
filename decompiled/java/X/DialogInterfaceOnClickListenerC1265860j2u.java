package X;

import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.profile.BioProfileLinkComponent;
import com.ss.android.ugc.profile.business.profile.ProfileLinkData;
import com.ss.android.ugc.profile.business.profile.biolink.BioStructuralLinkProtocol;
import com.ss.android.ugc.profile.business.ur.ProfileNavbarNickNameProtocol;
import com.ss.android.ugc.profile.business.ur.nickname.ProfileInfoNicknameProtocol;
import com.ss.android.ugc.profile.business.ur.ui.ProfileEditFragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS385S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: renamed from: X.0j2u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class DialogInterfaceOnClickListenerC1265860j2u implements DialogInterface.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) throws Throwable {
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
        }
    }

    public DialogInterfaceOnClickListenerC1265860j2u(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }

    public static final void onClick$0(DialogInterfaceOnClickListenerC1265860j2u dialogInterfaceOnClickListenerC1265860j2u, DialogInterface dialogInterface, int i) {
        if (i != -2) {
            if (i != -1) {
                ((Function0) dialogInterfaceOnClickListenerC1265860j2u.l0).invoke();
                dialogInterface.dismiss();
                return;
            } else {
                dialogInterface.dismiss();
                ((Function1) dialogInterfaceOnClickListenerC1265860j2u.l1).invoke(Boolean.FALSE);
                return;
            }
        }
        ((Function0) dialogInterfaceOnClickListenerC1265860j2u.l0).invoke();
        dialogInterface.dismiss();
    }

    public static final void onClick$1(DialogInterfaceOnClickListenerC1265860j2u dialogInterfaceOnClickListenerC1265860j2u, DialogInterface dialogInterface, int i) {
        C1254160ik2.LIZIZ.LJIILIIL(new AwS563S0100000_19((ProfileEditFragment) dialogInterfaceOnClickListenerC1265860j2u.l0, 2792), new AwS385S0200000_19((C19EG) dialogInterfaceOnClickListenerC1265860j2u.l1, (ProfileEditFragment) dialogInterfaceOnClickListenerC1265860j2u.l0, 83));
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("platform", "lemon8");
        C20684815ws.LJIILLIIL("click_social_account_unbind", c2344009Gk.LIZ);
        dialogInterface.dismiss();
        ((ProfileEditFragment) dialogInterfaceOnClickListenerC1265860j2u.l0).sT();
    }

    public static final void onClick$2(DialogInterfaceOnClickListenerC1265860j2u dialogInterfaceOnClickListenerC1265860j2u, DialogInterface dialogInterface, int i) {
        String url;
        C19EG c19egLIZ = C724240Sb0.LIZ((BioProfileLinkComponent) dialogInterfaceOnClickListenerC1265860j2u.l0);
        if (c19egLIZ != null) {
            ProfileLinkData profileLinkData = (ProfileLinkData) dialogInterfaceOnClickListenerC1265860j2u.l1;
            C2277881EDy c2277881EDy = C2277881EDy.LIZIZ;
            if (profileLinkData != null) {
                url = profileLinkData.getUrl();
            } else {
                url = null;
            }
            c2277881EDy.startProfileEditBioUrlActivity(c19egLIZ, url);
        }
    }

    public static final void onClick$3(DialogInterfaceOnClickListenerC1265860j2u dialogInterfaceOnClickListenerC1265860j2u, DialogInterface dialogInterface, int i) {
        C19EG activity;
        String url;
        Fragment fragment = ((BioStructuralLinkProtocol) dialogInterfaceOnClickListenerC1265860j2u.l0).LLILZ;
        if (fragment != null && (activity = fragment.getActivity()) != null) {
            ProfileLinkData profileLinkData = (ProfileLinkData) dialogInterfaceOnClickListenerC1265860j2u.l1;
            C2277881EDy c2277881EDy = C2277881EDy.LIZIZ;
            if (profileLinkData != null) {
                url = profileLinkData.getUrl();
            } else {
                url = null;
            }
            c2277881EDy.startProfileEditBioUrlActivity(activity, url);
        }
    }

    public static final void onClick$4(DialogInterfaceOnClickListenerC1265860j2u dialogInterfaceOnClickListenerC1265860j2u, DialogInterface dialogInterface, int i) throws Throwable {
        ((ProfileNavbarNickNameProtocol) dialogInterfaceOnClickListenerC1265860j2u.l0).LJLIIIL((User) dialogInterfaceOnClickListenerC1265860j2u.l1);
    }

    public static final void onClick$5(DialogInterfaceOnClickListenerC1265860j2u dialogInterfaceOnClickListenerC1265860j2u, DialogInterface dialogInterface, int i) throws Throwable {
        ((ProfileInfoNicknameProtocol) dialogInterfaceOnClickListenerC1265860j2u.l0).LJLJI((User) dialogInterfaceOnClickListenerC1265860j2u.l1);
    }
}
