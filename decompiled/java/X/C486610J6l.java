package X;

import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.experiment.LiveColdBootFirstTabApiOpt;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0J6l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C486610J6l {
    public final HomeTabAbility LIZ;

    public final void LIZ() {
        EventBus.LIZLLL().LJIJJ(this);
        if (C343780Ddo.LIZIZ() && ((IUserService) ServiceManager.get().getService(IUserService.class)).isLogin() && !LiveColdBootFirstTabApiOpt.INSTANCE.isEnable()) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LJI("LiveMainActivityAssem", "v3 update top icon");
            long jLongValue = ((Number) AnonymousClass0716.LJJIJIIJIL.getValue()).longValue();
            if (C070T.LIZ(jLongValue)) {
                C786410Ut5.LJLIIL(jLongValue, C799570VYd.LIZIZ(), new Runnable() { // from class: X.0J6j
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("LiveAssemLogic@6c1f.doInit$1");
                        try {
                            C15O7.LIZIZ(new Callable() { // from class: X.0J6i
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    C1C7U.LIZ("LiveAssemLogic@6c1f.doInit$1$1");
                                    C0JAU.LJ().LJIIIIZZ(0L);
                                    ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().i4().LJIIL();
                                    C1C7U.LIZIZ("LiveAssemLogic@6c1f.doInit$1$1");
                                    return null;
                                }
                            }, C823050WQl.LIZLLL(), null);
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("LiveAssemLogic@6c1f.doInit$1");
                    }
                });
            } else {
                C15O7.LIZIZ(new Callable() { // from class: X.0J6k
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        C1C7U.LIZ("LiveAssemLogic@6c1f.doInit$2");
                        C0JAU.LJ().LJIIIIZZ(0L);
                        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().i4().LJIIL();
                        C1C7U.LIZIZ("LiveAssemLogic@6c1f.doInit$2");
                        return null;
                    }
                }, C823050WQl.LIZLLL(), null);
            }
        }
    }

    public C486610J6l(HomeTabAbility homeTabAbility) {
        this.LIZ = homeTabAbility;
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onLiveIconEntranceEnable(C486500J6a c486500J6a) {
        HomeTabAbility homeTabAbility;
        HomeTabAbility homeTabAbility2;
        String strI0 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().i4().i0();
        if (!Intrinsics.LJFF(strI0, "live_tab_single") && !Intrinsics.LJFF(strI0, "live_tab_double")) {
            if (C343780Ddo.LIZIZ()) {
                if (c486500J6a.LIZ && ((IUserService) ServiceManager.get().getService(IUserService.class)).isLogin() && (((homeTabAbility = this.LIZ) == null || !homeTabAbility.cZ(EnumC1584350rKb.LIVE.getTag())) && (homeTabAbility2 = this.LIZ) != null)) {
                    homeTabAbility2.aM2(EnumC1585090rLn.LIVE_TAB_UPDATE);
                }
                HomeTabAbility homeTabAbility3 = this.LIZ;
                if (homeTabAbility3 != null) {
                    homeTabAbility3.Yp0(EnumC1585090rLn.LIVE_TAB_UPDATE);
                    return;
                }
                return;
            }
            return;
        }
        HomeTabAbility homeTabAbility4 = this.LIZ;
        if (homeTabAbility4 == null) {
            return;
        }
        homeTabAbility4.g62(EnumC1585090rLn.LIVE_TAB_UPDATE);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onUserBlock(C888460YtI c888460YtI) {
        User user = c888460YtI.LIZ;
        if (user != null) {
            C1440005kM.LIZ(new C0IFJ(true, user.getUid()));
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onUserLoginSuccessfully(C486550J6f c486550J6f) {
        if (C343780Ddo.LIZIZ()) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LJI("LiveMainActivityAssem", "on login success");
            ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().i4().LJIIL();
        }
        C469620IbI c469620IbI = C469620IbI.LIZ;
        C469620IbI.LJ(true);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onUserUnBlock(C486890J7n c486890J7n) {
        User user = c486890J7n.LIZ;
        if (user != null) {
            C1440005kM.LIZ(new C0IFJ(false, user.getUid()));
        }
    }
}
