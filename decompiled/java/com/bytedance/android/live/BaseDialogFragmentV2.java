package com.bytedance.android.live;

import X.C1766570w4V;
import X.C1896507bn;
import X.C19EH;
import X.C20441214yg;
import X.C464800IKo;
import android.app.Dialog;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes18.dex */
public abstract class BaseDialogFragmentV2 extends LiveThemeAwareDialogFragment {
    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        C464800IKo.LIZ.LJIIZILJ(this);
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void dismiss() {
        if (getFragmentManager() == null) {
            C20441214yg.LIZIZ("BaseDialogFragmentV2", "dismiss:${this} not associate with a fragment manager");
        } else {
            super.dismiss();
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void dismissAllowingStateLoss() {
        if (getFragmentManager() == null) {
            C20441214yg.LIZIZ("BaseDialogFragmentV2", "dismissAllowingStateLoss:${this} not associate with a fragment manager");
        } else {
            super.dismissAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        super.onStart();
        C464800IKo.LIZ.LIZIZ(this);
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    public final void MR(Object obj, String str) {
        try {
            Field declaredField = BaseDialogFragmentV2.class.getSuperclass().getDeclaredField(str);
            declaredField.setAccessible(true);
            declaredField.set(this, obj);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment, androidx.fragment.app.DialogFragment
    public final int show(C19EH c19eh, String str) {
        int iLJIIJ;
        if (!C464800IKo.LIZ.LJIIJJI()) {
            Boolean bool = Boolean.FALSE;
            MR(bool, "mDismissed");
            MR(Boolean.TRUE, "mShownByMe");
            c19eh.LIZLLL(this, str);
            MR(bool, "mViewDestroyed");
            iLJIIJ = c19eh.LJIIJ();
            MR(Integer.valueOf(iLJIIJ), "mBackStackId");
        } else {
            iLJIIJ = -1;
        }
        int iIntValue = Integer.valueOf(iLJIIJ).intValue();
        C1766570w4V c1766570w4V = C1766570w4V.LIZ;
        C1896507bn c1896507bn = new C1896507bn(this);
        c1766570w4V.getClass();
        C1766570w4V.LIZ(c1896507bn);
        return iIntValue;
    }

    @Override // com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment, androidx.fragment.app.DialogFragment
    public final void showNow(FragmentManager fragmentManager, String str) {
        if (!C464800IKo.LIZ.LJIIJJI()) {
            MR(Boolean.FALSE, "mDismissed");
            MR(Boolean.TRUE, "mShownByMe");
            C19EH c19ehLJIIJ = fragmentManager.LJIIJ();
            c19ehLJIIJ.LIZLLL(this, str);
            try {
                c19ehLJIIJ.LJIIL();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c19ehLJIIJ.LJIIJ();
            }
        }
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJIZ(this);
        C1766570w4V c1766570w4V = C1766570w4V.LIZ;
        C1896507bn c1896507bn = new C1896507bn(this);
        c1766570w4V.getClass();
        C1766570w4V.LIZ(c1896507bn);
    }

    @Override // com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment, androidx.fragment.app.DialogFragment
    public final void show(FragmentManager fragmentManager, String str) {
        if (!C464800IKo.LIZ.LJIIJJI()) {
            MR(Boolean.FALSE, "mDismissed");
            MR(Boolean.TRUE, "mShownByMe");
            C19EH c19ehLJIIJ = fragmentManager.LJIIJ();
            c19ehLJIIJ.LIZLLL(this, str);
            c19ehLJIIJ.LJIIJ();
        }
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJIZ(this);
        C1766570w4V c1766570w4V = C1766570w4V.LIZ;
        C1896507bn c1896507bn = new C1896507bn(this);
        c1766570w4V.getClass();
        C1766570w4V.LIZ(c1896507bn);
    }
}
