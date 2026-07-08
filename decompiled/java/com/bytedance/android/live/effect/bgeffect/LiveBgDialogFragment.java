package com.bytedance.android.live.effect.bgeffect;

import X.C0U5V;
import X.C500980Jkm;
import X.C760940Tt6;
import X.C786410Ut5;
import Y.ACListenerS147S0100000_12;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.BroadcastBgClearMemory;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveBgDialogFragment extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiLCk1LSHELIOSY4Zy00LSMqLCwnZgklPyoRLwElKCM8LwM+KCg+LSs4";
    public C0U5V LL;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.fzn);
        c500980Jkm.LIZJ = R.style.ajd;
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIJ = -1;
        c500980Jkm.LJIILIIL = 3;
        c500980Jkm.LJI = 0.0f;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        FrameLayout frameLayout;
        super.onDestroyView();
        C0U5V c0u5v = this.LL;
        if (c0u5v != null) {
            c0u5v.LIZIZ();
        }
        View view = getView();
        if (view != null && (frameLayout = (FrameLayout) view.findViewById(R.id.bx3)) != null) {
            C0U5V c0u5v2 = this.LL;
            C786410Ut5.LJJJZ(c0u5v2 != null ? c0u5v2.getView() : null, frameLayout);
        }
        this.LL = null;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        super.onStart();
        C760940Tt6.LIZIZ(this);
        C0U5V c0u5v = this.LL;
        if (c0u5v != null) {
            c0u5v.onDialogForeground();
        }
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        C0U5V c0u5v = this.LL;
        if (c0u5v != null) {
            c0u5v.onDialogBackground();
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final boolean requireE2EAdaption() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        View view2;
        super.onViewCreated(view, bundle);
        C786410Ut5.O7((FrameLayout) view.findViewById(R.id.c2y), new ACListenerS147S0100000_12(this, 46));
        C0U5V c0u5v = this.LL;
        View view3 = null;
        if (c0u5v != null && (view2 = c0u5v.getView()) != null && view2.getParent() != null) {
            dismiss();
        } else {
            ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.bx3);
            C0U5V c0u5v2 = this.LL;
            if (c0u5v2 != null) {
                view3 = c0u5v2.getView();
            }
            viewGroup.addView(view3);
        }
        C0U5V c0u5v3 = this.LL;
        if (c0u5v3 != null) {
            c0u5v3.LIZLLL(this);
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this, BroadcastBgClearMemory.class, new AwS591S0100000_12(this, 64));
        }
    }
}
