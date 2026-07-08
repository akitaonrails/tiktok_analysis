package com.bytedance.android.live.effect.singleselector;

import X.C0UA2;
import X.C0UBW;
import X.C0UBZ;
import X.C16F5;
import X.C500980Jkm;
import X.C766290U4d;
import X.C768200UBm;
import X.C786410Ut5;
import X.InterfaceC761540Tu4;
import X.RunnableC781530UlD;
import X.ViewOnClickListenerC1836610xtT;
import Y.ACListenerS147S0100000_12;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS591S0100000_12;
import u4.q0;

/* JADX INFO: loaded from: classes13.dex */
public final class SingleMusicSelectorDialog extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiLCk1LSY4Zzw6JiHELIOSIgLDw2JCAvPSAhZhYlJyg/LQg5OiYwGyAgLCwnJzcIIC4/JyI=";
    public final C0UA2 LL;
    public LinearLayout LLILLJJLI;
    public View LLILLL;
    public ViewOnClickListenerC1836610xtT LLILZ;
    public C16F5 LLILZIL;
    public RunnableC781530UlD LLILZLL;
    public C0UBW LLIZ;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g9x);
        c500980Jkm.LJIILIIL = 3;
        c500980Jkm.LJIIJJI = 34;
        c500980Jkm.LJII = 80;
        c500980Jkm.LJI = 0.5f;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        InterfaceC761540Tu4 interfaceC761540Tu4 = this.LL.LIZJ;
        if (interfaceC761540Tu4 != null) {
            interfaceC761540Tu4.LIZIZ();
        }
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZLL = null;
        this.LLILZIL = null;
        C0UBZ c0ubz = C0UBZ.LL;
        C0UBZ.LJIIJ(false, false);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        super.onStart();
        C766290U4d.LIZIZ(this);
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    public SingleMusicSelectorDialog(C0UA2 c0ua2) {
        this.LL = c0ua2;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCancelable(true);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Drawable background;
        super.onViewCreated(view, bundle);
        InterfaceC761540Tu4 interfaceC761540Tu4 = this.LL.LIZJ;
        if (interfaceC761540Tu4 != null) {
            interfaceC761540Tu4.LIZ();
        }
        this.LLILLL = view.findViewById(R.id.pvv);
        this.LLILLJJLI = (LinearLayout) view.findViewById(R.id.eu1);
        this.LLILZ = (ViewOnClickListenerC1836610xtT) view.findViewById(R.id.ovs);
        this.LLILZLL = (RunnableC781530UlD) view.findViewById(R.id.osj);
        this.LLILZIL = (C16F5) view.findViewById(R.id.title);
        LinearLayout linearLayout = this.LLILLJJLI;
        if (linearLayout != null && (background = linearLayout.getBackground()) != null) {
            background.setAlpha(255);
        }
        View view2 = this.LLILLL;
        if (view2 != null) {
            C786410Ut5.I7(new ACListenerS147S0100000_12(this, 435), view2);
        }
        C16F5 c16f5 = this.LLILZIL;
        if (c16f5 != null) {
            q0.LJIJI(c16f5, true);
        }
        RunnableC781530UlD runnableC781530UlD = this.LLILZLL;
        if (runnableC781530UlD != null) {
            runnableC781530UlD.setLayoutManager(new LinearLayoutManager(runnableC781530UlD.getContext(), 0, false));
            C0UBW c0ubw = new C0UBW(new AwS591S0100000_12(this, 1147));
            this.LLIZ = c0ubw;
            runnableC781530UlD.setAdapter(c0ubw);
            runnableC781530UlD.addItemDecoration(new C768200UBm());
        }
        ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT = this.LLILZ;
        if (viewOnClickListenerC1836610xtT != null) {
            viewOnClickListenerC1836610xtT.LJI();
        }
        C0UBZ c0ubz = C0UBZ.LL;
        C0UBZ.LIZIZ(new AwS591S0100000_12(this, 1146));
    }
}
