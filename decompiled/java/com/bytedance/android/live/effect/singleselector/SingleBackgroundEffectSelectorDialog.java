package com.bytedance.android.live.effect.singleselector;

import X.C0PEM;
import X.C0UA2;
import X.C0UMA;
import X.C20743416Fc;
import X.C23250099c;
import X.C424270GkL;
import X.C497740JfY;
import X.C500260Jjc;
import X.C500980Jkm;
import X.C760760Tso;
import X.C760990TtB;
import X.C766200U3u;
import X.C766210U3v;
import X.C766290U4d;
import X.C786410Ut5;
import X.InterfaceC761540Tu4;
import X.RunnableC781530UlD;
import Y.ACListenerS147S0100000_12;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import com.bytedance.android.live.effect.MultiGuestSharedBgActivityTechSetting;
import com.bytedance.android.live.effect.bgeffect.BgEffectViewModel;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes13.dex */
public final class SingleBackgroundEffectSelectorDialog extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiLCk1LSY4Zzw6JiIgLDw2JCHELIOSAvPSAhZhYlJyg/LQctKiQ0Oio5JysWLiMpKjsALSkpKjs8OgElKCM8Lw==";
    public C0UA2 LLILLJJLI;
    public ImageView LLILZ;
    public C20743416Fc LLILZIL;
    public View LLILZLL;
    public RunnableC781530UlD LLIZ;
    public TextView LLIZLLLIL;
    public View LLJ;
    public View LLJI;
    public View LLJIJIL;
    public C766210U3v LLJILLL;
    public String LL = "solo";
    public boolean LLILLL = true;
    public final BgEffectViewModel LLJILJIL = new BgEffectViewModel(new C0UMA("livebackground"), null);
    public final GridLayoutManager LLJILJILJ = new GridLayoutManager(getContext(), 4);
    public int LLJJ = 3;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    public final void MR() {
        C500260Jjc.LJIILIIL(this.LLJI);
        OR();
        if (this.LLILLL) {
            this.LLJILJIL.ZQ2("solo", null);
            return;
        }
        this.LLJILJIL.ZQ2("multi", null);
        if (MultiGuestSharedBgActivityTechSetting.INSTANCE.getValue()) {
            BgEffectViewModel bgEffectViewModel = this.LLJILJIL;
            bgEffectViewModel.getClass();
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(bgEffectViewModel), C0PEM.LIZJ, null, new C760990TtB(bgEffectViewModel, "multi", null, null), 2);
        }
    }

    public final void NR() {
        Collection collection;
        C766210U3v c766210U3v = this.LLJILLL;
        if (C500260Jjc.LJJJI((c766210U3v == null || (collection = c766210U3v.LL) == null) ? null : Boolean.valueOf(((ArrayList) collection).isEmpty()))) {
            C500260Jjc.LLFFF(this.LLJI);
            TextView textView = this.LLIZLLLIL;
            if (textView != null) {
                C500260Jjc.LJIILIIL(textView);
            }
            View view = this.LLJIJIL;
            if (view != null) {
                view.clearAnimation();
            }
            C500260Jjc.LJIILIIL(this.LLJ);
            C500260Jjc.LJIILIIL(this.LLIZ);
        }
    }

    public final void OR() {
        C500260Jjc.LLFFF(this.LLJ);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(2000L);
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        View view = this.LLJIJIL;
        if (view != null) {
            view.startAnimation(rotateAnimation);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.hmi);
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIILIIL = 3;
        c500980Jkm.LJIIJJI = 50;
        c500980Jkm.LJI = 0.5f;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        InterfaceC761540Tu4 interfaceC761540Tu4;
        super.onDestroyView();
        C0UA2 c0ua2 = this.LLILLJJLI;
        if (c0ua2 == null || (interfaceC761540Tu4 = c0ua2.LIZJ) == null) {
            return;
        }
        interfaceC761540Tu4.LIZIZ();
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

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        RunnableC781530UlD runnableC781530UlD;
        TextView textView;
        View viewFindViewById;
        View viewFindViewById2;
        View viewFindViewById3;
        int i;
        InterfaceC761540Tu4 interfaceC761540Tu4;
        super.onViewCreated(view, bundle);
        C0UA2 c0ua2 = this.LLILLJJLI;
        if (c0ua2 != null && (interfaceC761540Tu4 = c0ua2.LIZJ) != null) {
            interfaceC761540Tu4.LIZ();
        }
        C786410Ut5.Sd(R.layout.hmg, C786410Ut5.ne(getContext()), (ViewGroup) view.findViewById(R.id.gvn));
        C766200U3u c766200U3u = new C766200U3u();
        C0UA2 c0ua22 = this.LLILLJJLI;
        if (c0ua22 != null) {
            str = c0ua22.LIZ;
        } else {
            str = null;
        }
        c766200U3u.LIZ = str;
        this.LLJILLL = new C766210U3v(R.layout.hmh, c766200U3u, c0ua22);
        this.LLILZ = (ImageView) view.findViewById(R.id.e05);
        this.LLILZIL = (C20743416Fc) view.findViewById(R.id.title);
        View viewLJLLLL = C786410Ut5.LJLLLL((ViewStub) view.findViewById(R.id.bx4));
        this.LLILZLL = viewLJLLLL;
        if (viewLJLLLL != null) {
            runnableC781530UlD = (RunnableC781530UlD) viewLJLLLL.findViewById(R.id.eux);
        } else {
            runnableC781530UlD = null;
        }
        this.LLIZ = runnableC781530UlD;
        View view2 = this.LLILZLL;
        if (view2 != null) {
            textView = (TextView) view2.findViewById(R.id.xmb);
        } else {
            textView = null;
        }
        this.LLIZLLLIL = textView;
        View view3 = this.LLILZLL;
        if (view3 != null) {
            viewFindViewById = view3.findViewById(R.id.nnp);
        } else {
            viewFindViewById = null;
        }
        this.LLJ = viewFindViewById;
        View view4 = this.LLILZLL;
        if (view4 != null) {
            viewFindViewById2 = view4.findViewById(R.id.hc6);
        } else {
            viewFindViewById2 = null;
        }
        this.LLJI = viewFindViewById2;
        View view5 = this.LLJ;
        if (view5 != null) {
            viewFindViewById3 = view5.findViewById(R.id.w4z);
        } else {
            viewFindViewById3 = null;
        }
        this.LLJIJIL = viewFindViewById3;
        C786410Ut5.I7(new ACListenerS147S0100000_12(this, 432), view.findViewById(R.id.fy5));
        if (this.LLILLL) {
            i = 2131842511;
        } else {
            i = 2131843396;
        }
        C20743416Fc c20743416Fc = this.LLILZIL;
        if (c20743416Fc != null) {
            c20743416Fc.setText(C497740JfY.LJIJI(i));
        }
        View view6 = this.LLJI;
        if (view6 != null) {
            C786410Ut5.I7(new ACListenerS147S0100000_12(this, 433), view6);
        }
        RunnableC781530UlD runnableC781530UlD2 = this.LLIZ;
        if (runnableC781530UlD2 != null) {
            int iLJIIZILJ = (C497740JfY.LJIIZILJ() - ((int) C497740JfY.LIZIZ(294.0f))) / 3;
            int iLIZIZ = (int) C497740JfY.LIZIZ(14.0f);
            this.LLJJ = runnableC781530UlD2.getHeight() / (((int) C497740JfY.LIZIZ(60.0f)) + iLIZIZ);
            runnableC781530UlD2.addItemDecoration(new C424270GkL(4, iLIZIZ, iLJIIZILJ));
            runnableC781530UlD2.setHasFixedSize(true);
            runnableC781530UlD2.setAdapter(this.LLJILLL);
            runnableC781530UlD2.setLayoutManager(new GridLayoutManager(runnableC781530UlD2.getContext(), 4));
            runnableC781530UlD2.setItemAnimator(null);
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C760760Tso(this, null), 3);
        MR();
        ImageView imageView = this.LLILZ;
        if (imageView != null) {
            C786410Ut5.Q7(imageView, new ACListenerS147S0100000_12(this, 434));
        }
    }
}
