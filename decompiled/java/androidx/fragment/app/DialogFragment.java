package androidx.fragment.app;

import X.C1389600mGU;
import X.C1688560u2g;
import X.C19EH;
import X.C19EK;
import X.C19F6;
import X.C21505319Ed;
import X.C2188811AlT;
import X.C786410Ut5;
import X.DialogInterfaceOnCancelListenerC21523219La;
import X.DialogInterfaceOnDismissListenerC21523619Le;
import Y.AObserverS232S0100000_30;
import Y.ARunnableS130S0100000_30;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes33.dex */
public class DialogFragment extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public static final String _pnsPageId = "KSsoOyA6LD1iLz0yLygpJzt9HELIOSKTU8Zws6KSkjLgkhKSIhLCEn";
    public int mBackStackId;
    public boolean mCancelable;
    public boolean mCreatingDialog;
    public Dialog mDialog;
    public boolean mDialogCreated;
    public Runnable mDismissRunnable;
    public boolean mDismissed;
    public Handler mHandler;
    public Observer<LifecycleOwner> mObserver;
    public DialogInterface.OnCancelListener mOnCancelListener;
    public DialogInterface.OnDismissListener mOnDismissListener;
    public boolean mShownByMe;
    public boolean mShowsDialog;
    public int mStyle;
    public int mTheme;
    public boolean mViewDestroyed;

    public void dismiss() {
        dismissInternal(false, false, false);
    }

    public void dismissAllowingStateLoss() {
        dismissInternal(true, false, false);
    }

    public void dismissNow() {
        dismissInternal(false, false, true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        androidx_fragment_app_DialogFragment_com_ss_android_ugc_aweme_lancet_DialogFragmentLancet_onActivityCreated(this, bundle);
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        androidx_fragment_app_DialogFragment_com_ss_android_ugc_aweme_utils_DesignBugFixLancet_onStart(this);
    }

    public void show(FragmentManager fragmentManager, String str) {
        androidx_fragment_app_DialogFragment_com_ss_android_ugc_aweme_lancet_PopupMonitorDialogLancet_showDialogFragment(this, fragmentManager, str);
    }

    public void showNow(FragmentManager fragmentManager, String str) {
        androidx_fragment_app_DialogFragment_com_ss_android_ugc_aweme_lancet_PopupMonitorDialogLancet_showNow(this, fragmentManager, str);
    }

    public DialogFragment() {
        this.mDismissRunnable = new ARunnableS130S0100000_30(this, 4);
        this.mOnCancelListener = new DialogInterfaceOnCancelListenerC21523219La(this, 0);
        this.mOnDismissListener = new DialogInterfaceOnDismissListenerC21523619Le(this, 0);
        this.mStyle = 0;
        this.mTheme = 0;
        this.mCancelable = true;
        this.mShowsDialog = true;
        this.mBackStackId = -1;
        this.mObserver = new AObserverS232S0100000_30(this, 0);
        this.mDialogCreated = false;
    }

    public void androidx_fragment_app_DialogFragment__onStart$___twin___() {
        super.onStart();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = false;
            C786410Ut5.B4(dialog);
            View decorView = this.mDialog.getWindow().getDecorView();
            ViewTreeLifecycleOwner.set(decorView, this);
            ViewTreeViewModelStoreOwner.set(decorView, this);
            C1688560u2g.LIZIZ(decorView, this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public C19F6 createFragmentContainer() {
        final C19F6 c19f6CreateFragmentContainer = super.createFragmentContainer();
        return new C19F6() { // from class: X.19El
            @Override // X.C19F6
            public final boolean LIZJ() {
                return c19f6CreateFragmentContainer.LIZJ() || this.LLILLJJLI.mDialogCreated;
            }

            @Override // X.C19F6
            public final View LIZIZ(int i) {
                if (c19f6CreateFragmentContainer.LIZJ()) {
                    return c19f6CreateFragmentContainer.LIZIZ(i);
                }
                return this.LLILLJJLI.onFindViewById(i);
            }
        };
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = true;
            dialog.setOnDismissListener(null);
            C786410Ut5.LIZIZ(this.mDialog);
            if (!this.mDismissed) {
                onDismiss(this.mDialog);
            }
            this.mDialog = null;
            this.mDialogCreated = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        if (!this.mShownByMe && !this.mDismissed) {
            this.mDismissed = true;
        }
        getViewLifecycleOwnerLiveData().removeObserver(this.mObserver);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public final C19EK requireComponentDialog() {
        Dialog dialogRequireDialog = requireDialog();
        if (dialogRequireDialog instanceof C19EK) {
            return (C19EK) dialogRequireDialog;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DialogFragment ");
        sbLIZ.append(this);
        sbLIZ.append(" did not return a ComponentDialog instance from requireDialog(). The actual Dialog is ");
        sbLIZ.append(dialogRequireDialog);
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final Dialog requireDialog() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            return dialog;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DialogFragment ");
        sbLIZ.append(this);
        sbLIZ.append(" does not have a Dialog.");
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public Dialog getDialog() {
        return this.mDialog;
    }

    public boolean getShowsDialog() {
        return this.mShowsDialog;
    }

    public int getTheme() {
        return this.mTheme;
    }

    public boolean isCancelable() {
        return this.mCancelable;
    }

    public boolean onHasView() {
        return this.mDialogCreated;
    }

    public DialogFragment(int i) {
        super(i);
        this.mDismissRunnable = new ARunnableS130S0100000_30(this, 4);
        this.mOnCancelListener = new DialogInterfaceOnCancelListenerC21523219La(this, 0);
        this.mOnDismissListener = new DialogInterfaceOnDismissListenerC21523619Le(this, 0);
        this.mStyle = 0;
        this.mTheme = 0;
        this.mCancelable = true;
        this.mShowsDialog = true;
        this.mBackStackId = -1;
        this.mObserver = new AObserverS232S0100000_30(this, 0);
        this.mDialogCreated = false;
    }

    public static void androidx_fragment_app_DialogFragment_com_ss_android_ugc_aweme_lancet_compose_ComposeLifecycleOwnerHook_proxyDialogOnStart(DialogFragment dialogFragment) {
        Window window;
        View decorView;
        dialogFragment.androidx_fragment_app_DialogFragment__onStart$___twin___();
        Dialog dialog = dialogFragment.getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            ViewTreeLifecycleOwner.set(decorView, dialogFragment);
            ViewTreeViewModelStoreOwner.set(decorView, dialogFragment);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, dialogFragment);
        }
    }

    public static void androidx_fragment_app_DialogFragment_com_ss_android_ugc_aweme_reducemotion_ReduceMotionLancet_DialogFragment_onStart(DialogFragment dialogFragment) {
        C1389600mGU.LIZJ(dialogFragment.getDialog());
        androidx_fragment_app_DialogFragment_com_ss_android_ugc_aweme_lancet_compose_ComposeLifecycleOwnerHook_proxyDialogOnStart(dialogFragment);
    }

    public static void androidx_fragment_app_DialogFragment_com_ss_android_ugc_aweme_utils_DesignBugFixLancet_onStart(DialogFragment dialogFragment) {
        try {
            androidx_fragment_app_DialogFragment_com_ss_android_ugc_aweme_reducemotion_ReduceMotionLancet_DialogFragment_onStart(dialogFragment);
        } catch (WindowManager.BadTokenException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    private void prepareDialog(Bundle bundle) {
        if (this.mShowsDialog && !this.mDialogCreated) {
            try {
                this.mCreatingDialog = true;
                Dialog dialogLJLL = C786410Ut5.LJLL(this, bundle);
                this.mDialog = dialogLJLL;
                if (this.mShowsDialog) {
                    setupDialog(dialogLJLL, this.mStyle);
                    Context context = getContext();
                    if (context instanceof Activity) {
                        this.mDialog.setOwnerActivity((Activity) context);
                    }
                    this.mDialog.setCancelable(this.mCancelable);
                    this.mDialog.setOnCancelListener(this.mOnCancelListener);
                    this.mDialog.setOnDismissListener(this.mOnDismissListener);
                    this.mDialogCreated = true;
                } else {
                    this.mDialog = null;
                }
                this.mCreatingDialog = false;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.mCreatingDialog = false;
                throw th;
            }
        }
    }

    public void androidx_fragment_app_DialogFragment__onActivityCreated$___twin___(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().observeForever(this.mObserver);
        if (!this.mShownByMe) {
            this.mDismissed = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        this.mHandler = new Handler();
        if (this.mContainerId == 0) {
            z = true;
        } else {
            z = false;
        }
        this.mShowsDialog = z;
        if (bundle != null) {
            this.mStyle = bundle.getInt("android:style", 0);
            this.mTheme = bundle.getInt("android:theme", 0);
            this.mCancelable = bundle.getBoolean("android:cancelable", true);
            this.mShowsDialog = bundle.getBoolean("android:showsDialog", this.mShowsDialog);
            this.mBackStackId = bundle.getInt("android:backStackId", -1);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        return new C19EK(requireContext(), getTheme());
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.mViewDestroyed) {
            dismissInternal(true, true, false);
        }
    }

    public View onFindViewById(int i) {
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        if (this.mShowsDialog && !this.mCreatingDialog) {
            prepareDialog(bundle);
            Dialog dialog = this.mDialog;
            if (dialog != null) {
                return layoutInflaterOnGetLayoutInflater.cloneInContext(dialog.getContext());
            }
            return layoutInflaterOnGetLayoutInflater;
        }
        if (FragmentManager.LJLI()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getting layout inflater for DialogFragment ");
            sbLIZ.append(this);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        return layoutInflaterOnGetLayoutInflater;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            C786410Ut5.LJJIIZI(bundle, bundleOnSaveInstanceState, "android:savedDialogState");
        }
        int i = this.mStyle;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.mTheme;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.mCancelable;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.mShowsDialog;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.mBackStackId;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.mDialog != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.mDialog.onRestoreInstanceState(bundle2);
        }
    }

    public void setCancelable(boolean z) {
        this.mCancelable = z;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
    }

    public void setShowsDialog(boolean z) {
        this.mShowsDialog = z;
    }

    public static void androidx_fragment_app_DialogFragment_com_ss_android_ugc_aweme_lancet_DialogFragmentLancet_onActivityCreated(DialogFragment dialogFragment, Bundle bundle) {
        try {
            dialogFragment.androidx_fragment_app_DialogFragment__onActivityCreated$___twin___(bundle);
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new IllegalStateException(dialogFragment.toString(), e);
        }
    }

    public void androidx_fragment_app_DialogFragment__show$___twin___(FragmentManager fragmentManager, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        C19EH c19ehLJIIJ = fragmentManager.LJIIJ();
        c19ehLJIIJ.LJIIZILJ = true;
        c19ehLJIIJ.LIZLLL(this, str);
        c19ehLJIIJ.LJIIIZ();
    }

    public void androidx_fragment_app_DialogFragment__showNow$___twin___(FragmentManager fragmentManager, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        C19EH c19ehLJIIJ = fragmentManager.LJIIJ();
        c19ehLJIIJ.LJIIZILJ = true;
        c19ehLJIIJ.LIZLLL(this, str);
        c19ehLJIIJ.LJIIJJI();
    }

    public void setStyle(int i, int i2) {
        this.mStyle = i;
        if (i == 2 || i == 3) {
            this.mTheme = android.R.style.Theme.Panel;
        }
        if (i2 != 0) {
            this.mTheme = i2;
        }
    }

    public void setupDialog(Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i == 3) {
                Window window = dialog.getWindow();
                if (window != null) {
                    window.addFlags(24);
                }
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    public int show(C19EH c19eh, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        c19eh.LIZLLL(this, str);
        this.mViewDestroyed = false;
        int iLJIIIZ = c19eh.LJIIIZ();
        this.mBackStackId = iLJIIIZ;
        return iLJIIIZ;
    }

    public static void androidx_fragment_app_DialogFragment_com_ss_android_ugc_aweme_lancet_PopupMonitorDialogLancet_showDialogFragment(DialogFragment dialogFragment, FragmentManager fragmentManager, String str) {
        dialogFragment.androidx_fragment_app_DialogFragment__show$___twin___(fragmentManager, str);
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJIZ(dialogFragment);
    }

    public static void androidx_fragment_app_DialogFragment_com_ss_android_ugc_aweme_lancet_PopupMonitorDialogLancet_showNow(DialogFragment dialogFragment, FragmentManager fragmentManager, String str) {
        dialogFragment.androidx_fragment_app_DialogFragment__showNow$___twin___(fragmentManager, str);
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJIZ(dialogFragment);
    }

    private void dismissInternal(boolean z, boolean z2, boolean z3) {
        if (this.mDismissed) {
            return;
        }
        this.mDismissed = true;
        this.mShownByMe = false;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            C786410Ut5.LIZIZ(this.mDialog);
            if (!z2) {
                if (Looper.myLooper() == this.mHandler.getLooper()) {
                    onDismiss(this.mDialog);
                } else {
                    C786410Ut5.LJJZZIII(this.mHandler, this.mDismissRunnable);
                }
            }
        }
        this.mViewDestroyed = true;
        if (this.mBackStackId >= 0) {
            if (z3) {
                getParentFragmentManager().LJLLLL(this.mBackStackId);
            } else {
                FragmentManager parentFragmentManager = getParentFragmentManager();
                int i = this.mBackStackId;
                parentFragmentManager.getClass();
                if (i >= 0) {
                    parentFragmentManager.LJJJJ(new C21505319Ed(parentFragmentManager, null, i, 1), z);
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Bad id: ");
                    sbLIZ.append(i);
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            this.mBackStackId = -1;
            return;
        }
        C19EH c19ehLJIIJ = getParentFragmentManager().LJIIJ();
        c19ehLJIIJ.LJIIZILJ = true;
        c19ehLJIIJ.LJIIZILJ(this);
        if (z3) {
            c19ehLJIIJ.LJIIJJI();
        } else if (z) {
            c19ehLJIIJ.LJIIJ();
        } else {
            c19ehLJIIJ.LJIIIZ();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView == null && this.mDialog != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.mDialog.onRestoreInstanceState(bundle2);
        }
    }
}
