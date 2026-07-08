package X;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.btm.api.PageProp;
import com.bytedance.android.btm.impl.page.model.PageInfoStack;

/* JADX INFO: renamed from: X.18EI, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18EI extends AbstractC813200VvC {
    public static final C18EI LL = new C18EI();

    public static void LIZ(Fragment fragment, boolean z) {
        PageProp pageProp;
        C18CK.LJFF("BtmFragmentLifecycleCallbackV2_onFragmentResumed", new C18I5(fragment.getClass().getName()));
        C18EP.LJ(fragment);
        C21248618Dk.LIZ.getClass();
        PageInfoStack pageInfoStackLJIIIZ = C21248618Dk.LJIIIZ(fragment);
        if (pageInfoStackLJIIIZ != null) {
            if (z && (pageProp = pageInfoStackLJIIIZ.getPageProp()) != null) {
                pageProp.setIgnoreSystemFirstResume(false);
            }
            PageProp pageProp2 = pageInfoStackLJIIIZ.getPageProp();
            if (pageProp2 != null && pageProp2.getIgnoreSystemFirstResume()) {
                PageProp pageProp3 = pageInfoStackLJIIIZ.getPageProp();
                if (pageProp3 != null) {
                    pageProp3.setIgnoreSystemFirstResume(false);
                    return;
                }
                return;
            }
            PageProp pageProp4 = pageInfoStackLJIIIZ.getPageProp();
            if (pageProp4 != null && pageProp4.getAuto()) {
                C18EB.LIZ.LJ(fragment, EnumC21250718Ef.System);
            }
        }
        if (fragment instanceof DialogFragment) {
            C18EL.LL.getClass();
            C18EL.LIZ(fragment);
        }
    }

    @Override // X.AbstractC813200VvC
    public final void onFragmentDestroyed(FragmentManager fragmentManager, Fragment fragment) {
        C18CK.LJFF("BtmFragmentLifecycleCallbackV2_onFragmentDestroyed", new C21257318Gt(fragment.getClass().getName()));
        C18EP.LIZJ(fragment);
        C18EB.LJIIJ(fragment);
    }

    @Override // X.AbstractC813200VvC
    public final void onFragmentPaused(FragmentManager fragmentManager, Fragment fragment) {
        PageProp pageProp;
        C18CK.LJFF("BtmFragmentLifecycleCallbackV2_onFragmentPaused", new C21257418Gu(fragment.getClass().getName()));
        C18EP.LIZLLL(fragment);
        C21248618Dk.LIZ.getClass();
        PageInfoStack pageInfoStackLJIIIZ = C21248618Dk.LJIIIZ(fragment);
        if (pageInfoStackLJIIIZ != null && (pageProp = pageInfoStackLJIIIZ.getPageProp()) != null && pageProp.getAuto()) {
            C18E4.LIZLLL(fragment, EnumC21251218Ek.System);
        }
        if (fragment instanceof DialogFragment) {
            C18EL.LL.onFragmentPaused(fragmentManager, fragment);
        }
    }

    @Override // X.AbstractC813200VvC
    public final void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
        LIZ(fragment, false);
    }

    @Override // X.AbstractC813200VvC
    public final void onFragmentViewDestroyed(FragmentManager fragmentManager, Fragment fragment) {
        C18CK.LJFF("BtmFragmentLifecycleCallbackV2_onFragmentViewDestroyed", new C21257518Gv(fragment.getClass().getName()));
        C18CK.LJI("FragmentFilter_onFragmentViewDestroyed", new C18IF(fragment.getClass().getName()));
    }

    @Override // X.AbstractC813200VvC
    public final void onFragmentActivityCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        boolean z;
        Dialog dialog;
        Window window;
        View decorView;
        if (fragment instanceof DialogFragment) {
            C21248618Dk.LIZ.getClass();
            PageInfoStack pageInfoStackLJIIIZ = C21248618Dk.LJIIIZ(fragment);
            if (pageInfoStackLJIIIZ != null && pageInfoStackLJIIIZ.getPageProp() != null) {
                z = true;
            } else {
                z = false;
            }
            C21250218Ea c21250218Ea = C21250218Ea.LIZ;
            boolean zLIZ = C21250218Ea.LIZ(fragment);
            if ((z || zLIZ) && (dialog = ((DialogFragment) fragment).getDialog()) != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                String name = fragment.getClass().getName();
                C21248618Dk.LJIILL.put(new C589920NBu<>(decorView), new C589920NBu<>(fragment));
                C18CK.LJI("FragmentFilter_onFragmentActivityCreated", new C18IE(name));
            }
        }
    }

    @Override // X.AbstractC813200VvC
    public final void onFragmentCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        C18CK.LJFF("BtmFragmentLifecycleCallbackV2_onFragmentCreated", new C0T9H(fragment.getClass().getName(), bundle));
        C18EP.LIZIZ(fragment);
        C21252518Ex.LIZ(bundle, fragment);
        if (fragment instanceof DialogFragment) {
            C18EL.LL.onFragmentCreated(fragmentManager, fragment, bundle);
        }
    }

    @Override // X.AbstractC813200VvC
    public final void onFragmentPreCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        C18CK.LJFF("BtmFragmentLifecycleCallbackV2_onFragmentPreCreated", new C0T9I(fragment.getClass().getName(), bundle));
        C18EB.LJIIIZ(fragment, bundle, null);
        C18EP.LIZIZ(fragment);
    }

    @Override // X.AbstractC813200VvC
    public final void onFragmentSaveInstanceState(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        C18CK.LJFF("BtmFragmentLifecycleCallbackV2_onFragmentSaveInstanceState", new C21256018Gg(fragment.getClass().getName()));
        C18E4.LJI(bundle, fragment);
    }

    @Override // X.AbstractC813200VvC
    public final void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
        C18CK.LJFF("BtmFragmentLifecycleCallbackV2_onFragmentViewCreated", new C0T9J(fragment.getClass().getName(), bundle));
    }
}
