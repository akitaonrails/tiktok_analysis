package X;

import X.EnumC2274181Dzs;
import X.InterfaceC1637170shn;
import X.InterfaceC1637200shq;
import Y.ACListenerS139S0100000_4;
import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.effectcreator.IEffectCreatorService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.zhiliaoapp.musically.R;
import g1c.AjS62S0100000_4;

/* JADX INFO: renamed from: X.0tCy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1656500tCy {
    public View LIZ;

    public final void LIZ(Fragment fragment, boolean z) {
        boolean z2;
        InterfaceC1637170shn interfaceC1637170shnLIZ;
        final C19EG activity = fragment.getActivity();
        if (activity == null) {
            return;
        }
        if (z) {
            C1656530tD1.LIZ.getClass();
            if (C1656530tD1.LIZ() && C1656550tD3.LIZ() && !C10EU.LJIIIIZZ() && ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                ViewStub viewStub = (ViewStub) activity.findViewById(R.id.view_stub_create_effect_button);
                if (viewStub != null && viewStub.getParent() != null) {
                    z2 = true;
                    View viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
                    this.LIZ = viewLJLLLL;
                    View viewFindViewById = viewLJLLLL.findViewById(R.id.f6l);
                    View viewFindViewById2 = viewLJLLLL.findViewById(R.id.f6a);
                    C786410Ut5.I7(new AjS62S0100000_4(new ACListenerS139S0100000_4(activity, 42), 1), viewFindViewById);
                    if (viewFindViewById2 != null) {
                        if (C0C64.LJIILLIIL().LJIIIZ(31744, "ame_enable_profile_ai_btn", true, false) && C339680DTi.LIZ()) {
                            C339190DRl.LIZLLL(viewFindViewById2);
                            C786410Ut5.I7(new AjS62S0100000_4(activity, 2), viewFindViewById2);
                        } else {
                            C339190DRl.LIZIZ(viewFindViewById2);
                        }
                    }
                } else {
                    z2 = false;
                }
                View view = this.LIZ;
                if (view != null) {
                    C339190DRl.LIZLLL(view);
                }
                if (z2) {
                    fragment.getLifecycle().addObserver(new LifecycleEventObserver(activity) { // from class: com.ss.android.ugc.aweme.profile.effect.ProfileAMEButtonController$addAMEOnResumePreloadObserver$observer$1
                        @Override // androidx.lifecycle.LifecycleEventObserver
                        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                            IEffectCreatorService iEffectCreatorService;
                            InterfaceC1637170shn interfaceC1637170shnLIZ2;
                            if (event == Lifecycle.Event.ON_RESUME && (iEffectCreatorService = (IEffectCreatorService) PluggableExtentionKt.pluggableSpi$default(IEffectCreatorService.class, false, false, false, 14, null)) != null) {
                                InterfaceC1637200shq interfaceC1637200shqPreloadService = iEffectCreatorService.preloadService();
                                if (interfaceC1637200shqPreloadService != null) {
                                    interfaceC1637200shqPreloadService.LIZJ();
                                }
                                InterfaceC1637200shq interfaceC1637200shqPreloadService2 = iEffectCreatorService.preloadService();
                                if (interfaceC1637200shqPreloadService2 != null && (interfaceC1637170shnLIZ2 = interfaceC1637200shqPreloadService2.LIZ()) != null) {
                                    interfaceC1637170shnLIZ2.LIZ(EnumC2274181Dzs.PROFILE_AME_EFFECT_TAB);
                                }
                            }
                        }
                    });
                    return;
                }
                IEffectCreatorService iEffectCreatorService = (IEffectCreatorService) PluggableExtentionKt.pluggableSpi$default(IEffectCreatorService.class, false, false, false, 14, null);
                if (iEffectCreatorService == null) {
                    return;
                }
                InterfaceC1637200shq interfaceC1637200shqPreloadService = iEffectCreatorService.preloadService();
                if (interfaceC1637200shqPreloadService != null) {
                    interfaceC1637200shqPreloadService.LIZJ();
                }
                InterfaceC1637200shq interfaceC1637200shqPreloadService2 = iEffectCreatorService.preloadService();
                if (interfaceC1637200shqPreloadService2 == null || (interfaceC1637170shnLIZ = interfaceC1637200shqPreloadService2.LIZ()) == null) {
                    return;
                }
                interfaceC1637170shnLIZ.LIZ(EnumC2274181Dzs.PROFILE_AME_EFFECT_TAB);
                return;
            }
        }
        View view2 = this.LIZ;
        if (view2 != null) {
            C339190DRl.LIZIZ(view2);
        }
    }
}
