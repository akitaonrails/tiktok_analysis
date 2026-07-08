package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.account.flow.step.bindings.consent.EmailConsentFlowStep;
import com.ss.android.ugc.aweme.account.login.v2.base.AccountFlowSharedViewModel;
import com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: renamed from: X.0iJE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1237540iJE {
    public static final C1237540iJE LIZ = new C1237540iJE();
    public static final List<InterfaceC1237520iJC> LIZIZ = C1697810uHb.LJIIJJI(new InterfaceC1237520iJC() { // from class: X.0iJB
        @Override // X.InterfaceC1237520iJC
        public final boolean LIZ(InterfaceC1237470iJ7 interfaceC1237470iJ7) {
            return interfaceC1237470iJ7 instanceof EmailConsentFlowStep;
        }

        @Override // X.InterfaceC1237520iJC
        public final void LIZIZ(InterfaceC1237470iJ7 interfaceC1237470iJ7, WeakReference<Activity> weakReference) {
            CommonFlowActivity commonFlowActivity;
            Activity activity = weakReference.get();
            if ((activity instanceof CommonFlowActivity) && (commonFlowActivity = (CommonFlowActivity) activity) != null) {
                ((AccountFlowSharedViewModel) ViewModelProviders.of(commonFlowActivity).get(AccountFlowSharedViewModel.class)).wQ2(new EmailConsentFlowStep.EmailConsentStepActions.EmailConsentLaunchAction(new C1237500iJA(commonFlowActivity)));
                return;
            }
            Activity activity2 = weakReference.get();
            if (activity2 == null) {
                return;
            }
            activity2.finish();
        }
    }, new InterfaceC1237520iJC() { // from class: X.0iJF
        @Override // X.InterfaceC1237520iJC
        public final boolean LIZ(InterfaceC1237470iJ7 interfaceC1237470iJ7) {
            return interfaceC1237470iJ7 instanceof InterfaceC1237070iIT;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // X.InterfaceC1237520iJC
        public final void LIZIZ(InterfaceC1237470iJ7 interfaceC1237470iJ7, WeakReference<Activity> weakReference) {
            Fragment fragment;
            InterfaceC1237070iIT interfaceC1237070iIT;
            Activity activity = weakReference.get();
            if (activity != null) {
                if ((interfaceC1237470iJ7 instanceof InterfaceC1237070iIT) && (interfaceC1237070iIT = (InterfaceC1237070iIT) interfaceC1237470iJ7) != null) {
                    fragment = interfaceC1237070iIT.getFragment();
                } else {
                    fragment = 0;
                }
                if ((activity instanceof AbstractActivityC1237560iJG) && fragment != 0) {
                    FragmentManager supportFragmentManager = ((C19EG) activity).getSupportFragmentManager();
                    int iLJJLIIIIJ = supportFragmentManager.LJJLIIIIJ();
                    C19EH c19ehLJIIJ = supportFragmentManager.LJIIJ();
                    if (iLJJLIIIIJ > 0) {
                        c19ehLJIIJ.LJIJJLI(R.anim.fv, R.anim.ah, R.anim.ft, R.anim.ai);
                    }
                    fragment.setArguments(interfaceC1237470iJ7.LIZ().getData());
                    c19ehLJIIJ.LJIJ(R.id.iiv, fragment, interfaceC1237470iJ7.getId());
                    c19ehLJIIJ.LJII(null);
                    c19ehLJIIJ.LJIIJ();
                    if (fragment instanceof BaseI18nLoginFragment) {
                        C2211631BhB.LJIIL((InterfaceC1740760vOs) fragment, activity);
                    }
                }
            }
        }
    });
}
