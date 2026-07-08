package com.bytedance.android.live.effect.input;

import X.C0UA1;
import X.C1145100fu8;
import X.C497740JfY;
import X.C500980Jkm;
import X.C762040Tus;
import X.C766290U4d;
import X.C785880UsE;
import X.C786120Usc;
import X.C786410Ut5;
import X.InterfaceC19323110ij;
import Y.ACListenerS147S0100000_12;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.common.keyboard.MeasureLinearLayout;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes13.dex */
public final class EffectTextInputFragment extends LiveDialogFragment implements InterfaceC19323110ij {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiLCk1LSHELIOSY4ZyY9ODA4Zwo1LiAvPRs2MDEFJz8mPAM+KCg+LSs4";
    public LiveEditText LL;
    public MeasureLinearLayout LLILLJJLI;
    public final int LLILLL = 50;
    public boolean LLILZ;
    public Function1<? super Boolean, Unit> LLILZIL;
    public C762040Tus LLILZLL;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.h4c);
        C766290U4d.LIZ(c500980Jkm);
        return c500980Jkm;
    }

    public final LiveEditText getEditViewFromXml() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.gsw) : null;
            this.LL = (LiveEditText) viewFindViewById;
        }
        return (LiveEditText) viewFindViewById;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        if (this.LLILZ) {
            dismiss();
        }
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        Window window2;
        Window window3;
        super.onStart();
        C766290U4d.LIZIZ(this);
        getEditViewFromXml().requestFocus();
        Dialog dialog = getDialog();
        if (dialog != null && (window3 = dialog.getWindow()) != null) {
            C1145100fu8.LIZ(window3);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window2 = dialog2.getWindow()) != null) {
            window2.setSoftInputMode(5);
        }
        Function1<? super Boolean, Unit> function1 = this.LLILZIL;
        if (function1 != null) {
            function1.invoke(Boolean.TRUE);
        }
        Dialog dialog3 = getDialog();
        if (dialog3 == null || (window = dialog3.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        C0UA1.LIZ().LJFF();
        Function1<? super Boolean, Unit> function1 = this.LLILZIL;
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
        super.onDismiss(dialogInterface);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        getActivity();
        return layoutInflaterOnGetLayoutInflater;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        LiveEditText editViewFromXml = getEditViewFromXml();
        if (editViewFromXml != null) {
            editViewFromXml.addTextChangedListener(new C786120Usc(this, 16));
        }
        LiveEditText editViewFromXml2 = getEditViewFromXml();
        if (editViewFromXml2 != null) {
            editViewFromXml2.setOnEditorActionListener(new C785880UsE(this, 2));
        }
        View view2 = getView();
        if (view2 != null) {
            C786410Ut5.I7(new ACListenerS147S0100000_12(this, 373), view2);
        }
        View viewFindViewById = this.LLILLJJLI;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById = view3.findViewById(R.id.o4y);
            } else {
                viewFindViewById = null;
            }
            this.LLILLJJLI = (MeasureLinearLayout) viewFindViewById;
        }
        ((MeasureLinearLayout) viewFindViewById).setWindowInsetsEnable(true);
        View view4 = this.LLILLJJLI;
        if (view4 == null) {
            View view5 = getView();
            if (view5 != null) {
                viewFindViewById2 = view5.findViewById(R.id.o4y);
            }
            this.LLILLJJLI = (MeasureLinearLayout) viewFindViewById2;
            view4 = viewFindViewById2;
        }
        ((MeasureLinearLayout) view4).setWindowInsetsKeyboardObserver(this);
        if (C497740JfY.LJJ()) {
            LiveEditText editViewFromXml3 = getEditViewFromXml();
            if (editViewFromXml3 != null) {
                editViewFromXml3.setGravity(8388629);
                return;
            }
            return;
        }
        LiveEditText editViewFromXml4 = getEditViewFromXml();
        if (editViewFromXml4 == null) {
            return;
        }
        editViewFromXml4.setGravity(8388627);
    }

    @Override // X.InterfaceC19323110ij
    public final void u2(int i, boolean z) {
        if (this.isViewValid) {
            if (z) {
                this.LLILZ = true;
                return;
            }
            if (this.LLILZ) {
                dismiss();
            }
            this.LLILZ = false;
        }
    }
}
