package X;

import Y.ACallableS254S0200000_28;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.10a4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19269410a4 {
    public static final C01GW<C19269410a4> LJFF = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, new C19269710a7());
    public boolean LIZIZ;
    public ViewOnClickListenerC19269010a0 LIZLLL;
    public final C1594000raA LIZ = new C1594000raA();
    public String LIZJ = "";
    public final C01GW LJ = C452501pT.LIZIZ(new C19269610a6());

    public final boolean LIZ() {
        if (C848230XPh.LL.LJI()) {
            User currentUser = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser();
            if (currentUser != null && currentUser.isContentLanguageDialogShown()) {
                return true;
            }
        } else {
            if (!TextUtils.isEmpty(this.LIZ.LIZIZ())) {
                return true;
            }
            C1594000raA c1594000raA = this.LIZ;
            c1594000raA.getClass();
            try {
                if (c1594000raA.LIZ().LJIIJJI()) {
                    return true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJFF(th, "MainTabPreferences AbstractMethodError");
            }
        }
        return false;
    }

    public final void LIZIZ() {
        C1594000raA c1594000raA = this.LIZ;
        c1594000raA.getClass();
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJFF(th, "MainTabPreferences AbstractMethodError");
        }
        if (c1594000raA.LIZ().LJI()) {
            return;
        }
        C1594000raA c1594000raA2 = this.LIZ;
        c1594000raA2.getClass();
        try {
            c1594000raA2.LIZ().LJ();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C1AF0.LJFF(th2, "MainTabPreferences AbstractMethodError");
        }
    }

    public final void LIZJ() {
        C11NZ<BaseResponse> c11nzLIZJ;
        if (!C848230XPh.LL.LJI()) {
            this.LIZ.LIZJ(true);
            return;
        }
        InterfaceC19269510a5 interfaceC19269510a5 = (InterfaceC19269510a5) this.LJ.getValue();
        if (interfaceC19269510a5 == null || (c11nzLIZJ = interfaceC19269510a5.LIZJ("content_language_already_popup")) == null) {
            return;
        }
        c11nzLIZJ.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZIZ(new C19336310kr(3));
    }

    public final void LIZLLL(Context context, Fragment fragment) {
        Fragment fragment2;
        String str;
        Boolean bool;
        LIZIZ();
        if (C086I.LIZIZ(C0CLW.LIZIZ.LIZ.getContentLanguageGuideCodes()) || LIZ()) {
            return;
        }
        Object objLIZJ = C487580JAe.LIZJ(fragment);
        if (objLIZJ instanceof Fragment) {
            fragment2 = (Fragment) objLIZJ;
        } else {
            fragment2 = null;
        }
        Pair<Boolean, String> pairLJII = ((IContentLanguageService) ServiceManager.get().getService(IContentLanguageService.class)).LJII(context, fragment2);
        if (pairLJII == null || (str = (String) pairLJII.second) == null) {
            str = "";
        }
        this.LIZJ = str;
        if (pairLJII != null) {
            bool = (Boolean) pairLJII.first;
        } else {
            bool = null;
        }
        if (!bool.booleanValue()) {
            this.LIZIZ = true;
        } else {
            C15O7.LIZIZ(new ACallableS254S0200000_28(this, context, 2), C15O7.LJIIIIZZ, null);
            this.LIZIZ = false;
        }
    }
}
