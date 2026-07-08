package X;

import Y.ARunnableS128S0100000_28;
import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.10ft, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19305510ft implements InterfaceC1457290o1f {
    public boolean LIZ;
    public final Map<Integer, InterfaceC586170Myt> LIZIZ = new HashMap();

    @Override // X.InterfaceC1457290o1f
    public final void LJ() {
    }

    @Override // X.InterfaceC1457290o1f
    public final void LJII() {
        LJIILLIIL().setIsOldUser(true);
    }

    @Override // X.InterfaceC1457290o1f
    public final void LJIIIZ() {
    }

    @Override // X.InterfaceC1457290o1f
    public final void LJIIL() {
    }

    @Override // X.InterfaceC1457290o1f
    public final void getSDKVersion() {
    }

    public static IUserService LJIILLIIL() {
        return (IUserService) ServiceManager.get().getService(IUserService.class);
    }

    @Override // X.InterfaceC1457290o1f
    public final boolean LIZ() {
        return C10EU.LJIILIIL();
    }

    @Override // X.InterfaceC1457290o1f
    public final String LIZJ() {
        User currentUser = LJIILLIIL().getCurrentUser();
        return currentUser != null ? currentUser.getSecUid() : "";
    }

    @Override // X.InterfaceC1457290o1f
    public final boolean LIZLLL() {
        return C0XQ7.LJFF().LIZLLL();
    }

    @Override // X.InterfaceC1457290o1f
    public final boolean LJIIJJI() {
        User currentUser = LJIILLIIL().getCurrentUser();
        return currentUser != null && currentUser.getAccountType() == 3;
    }

    @Override // X.InterfaceC1457290o1f
    public final boolean LJIILIIL() {
        User currentUser = LJIILLIIL().getCurrentUser();
        return currentUser != null && currentUser.isCanSetGeoFencing();
    }

    @Override // X.InterfaceC1457290o1f
    public final C19292410dm getCurrentUser() {
        User currentUser = LJIILLIIL().getCurrentUser();
        if (currentUser != null) {
            return new C19292410dm(currentUser);
        }
        return null;
    }

    @Override // X.InterfaceC1457290o1f
    public final String getCurrentUserID() {
        return LJIILLIIL().getCurrentUserID();
    }

    @Override // X.InterfaceC1457290o1f
    public final String getUserTTToken() {
        return C847400XMc.LJI();
    }

    @Override // X.InterfaceC1457290o1f
    public final boolean isLogin() {
        return LJIILLIIL().isLogin();
    }

    @Override // X.InterfaceC1457290o1f
    public final void LIZIZ(InterfaceC1398820mVM interfaceC1398820mVM) {
        IAccountService iAccountService = (IAccountService) ServiceManager.get().getService(IAccountService.class);
        C1402180mam c1402180mam = new C1402180mam(interfaceC1398820mVM, 1);
        ((HashMap) this.LIZIZ).put(Integer.valueOf(interfaceC1398820mVM.hashCode()), c1402180mam);
        iAccountService.LJIILL(c1402180mam);
    }

    @Override // X.InterfaceC1457290o1f
    public final void LJFF(InterfaceC1398820mVM interfaceC1398820mVM) {
        IAccountService iAccountService = (IAccountService) ServiceManager.get().getService(IAccountService.class);
        InterfaceC586170Myt interfaceC586170Myt = (InterfaceC586170Myt) ((HashMap) this.LIZIZ).remove(Integer.valueOf(interfaceC1398820mVM.hashCode()));
        if (interfaceC586170Myt != null) {
            iAccountService.LJI(interfaceC586170Myt);
        }
    }

    @Override // X.InterfaceC1457290o1f
    public final void LJIILL(final Activity activity, final InterfaceC19305710fv interfaceC19305710fv) {
        C0XQS c0xqs = new C0XQS();
        c0xqs.LJ = new C0XTR() { // from class: X.10fu
            @Override // X.C0XTR
            public final void onResult(int i, int i2, Object obj) {
                C19305510ft c19305510ft = this.LIZ;
                InterfaceC19305710fv interfaceC19305710fv2 = interfaceC19305710fv;
                Activity activity2 = activity;
                if (interfaceC19305710fv2 != null) {
                    if (!c19305510ft.LIZ) {
                        c19305510ft.LIZ = true;
                        if (i2 == 1) {
                            interfaceC19305710fv2.onSuccess();
                        } else {
                            interfaceC19305710fv2.onCancel();
                        }
                        HandlerHook.viewPostDelay(activity2.getWindow().getDecorView(), new ARunnableS128S0100000_28(c19305510ft, 37), Mp4ScreenVideoLoadTimeout.CONTROL);
                        return;
                    }
                    return;
                }
                c19305510ft.getClass();
            }
        };
        c0xqs.LIZ = activity;
        c0xqs.LIZJ = "shoot_page_edit_tab";
        C0XQT c0xqt = new C0XQT(c0xqs);
        IAccountService iAccountService = (IAccountService) ServiceManager.get().getService(IAccountService.class);
        if (iAccountService != null) {
            iAccountService.LIZIZ(c0xqt);
        }
    }

    @Override // X.InterfaceC1457290o1f
    public final C19292410dm LJI(String str, String str2, EnumC1254700iku enumC1254700iku) {
        EnumC1254690ikt enumC1254690ikt = null;
        for (int i = 0; i < EnumC1254690ikt.values().length; i++) {
            if (EnumC1254690ikt.values()[i].getSceneID() == enumC1254700iku.getSceneId()) {
                enumC1254690ikt = EnumC1254690ikt.values()[i];
            }
        }
        C2277881EDy c2277881EDy = C2277881EDy.LIZIZ;
        return new C19292410dm(c2277881EDy.queryUser(c2277881EDy.userUrl(str2, str, null, 0, enumC1254690ikt), false, null));
    }

    @Override // X.InterfaceC1457290o1f
    public final void LJIIJ(int i, final String str, final String str2, final Function1 function1) {
        ((com.ss.android.ugc.aweme.userservice.api.IUserService) ServiceManager.get().getService(com.ss.android.ugc.aweme.userservice.api.IUserService.class)).LJIIJ(i, -1, -1, -1, str, str2, "", "").LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LIZ(new InterfaceC19474811He<FollowStatus>() { // from class: X.0Cu8
            @Override // X.InterfaceC19474811He
            public final void onError(Throwable th) {
            }

            @Override // X.InterfaceC19474811He
            public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
            }

            @Override // X.InterfaceC19474811He
            public final void onSuccess(FollowStatus followStatus) {
                FollowStatus followStatus2 = followStatus;
                function1.invoke(Integer.valueOf(followStatus2.getFollowStatus()));
                if (followStatus2.getUserId() == null) {
                    followStatus2.setUserId(str);
                }
                if (followStatus2.getSecUserId() == null) {
                    followStatus2.setSecUserId(str2);
                }
                C1076010e6h.LIZJ.LIZIZ().LJFF().postValue(followStatus2);
            }
        });
    }

    @Override // X.InterfaceC1457290o1f
    public final void LJIILJJIL(Fragment fragment, String str, String str2, InterfaceC19305710fv interfaceC19305710fv) {
        C0XPD.LIZJ(fragment, str, str2, null, new C19335610kk(interfaceC19305710fv, 0));
    }

    @Override // X.InterfaceC1457290o1f
    public final void LJIIIIZZ(Activity activity, String str, String str2, Bundle bundle, InterfaceC19305710fv interfaceC19305710fv) {
        C0XPD.LIZIZ(activity, str, str2, bundle, new C19335610kk(interfaceC19305710fv, 1));
    }
}
