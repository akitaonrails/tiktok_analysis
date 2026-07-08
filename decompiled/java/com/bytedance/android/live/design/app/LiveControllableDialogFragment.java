package com.bytedance.android.live.design.app;

import X.C19EH;
import X.C464800IKo;
import android.app.Dialog;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes18.dex */
public abstract class LiveControllableDialogFragment extends LiveThemeAwareDialogFragment {
    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        C464800IKo.LIZ.LJIIZILJ(this);
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
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

    @Override // com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment, androidx.fragment.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        if (!C464800IKo.LIZ.LJIIJJI()) {
            super.show(fragmentManager, str);
        }
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment, androidx.fragment.app.DialogFragment
    public final void showNow(FragmentManager fragmentManager, String str) {
        if (!C464800IKo.LIZ.LJIIJJI()) {
            super.showNow(fragmentManager, str);
        }
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment, androidx.fragment.app.DialogFragment
    public final int show(C19EH c19eh, String str) {
        if (!C464800IKo.LIZ.LJIIJJI()) {
            return super.show(c19eh, str);
        }
        return -1;
    }
}
