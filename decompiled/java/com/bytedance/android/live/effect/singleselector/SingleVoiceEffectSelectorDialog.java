package com.bytedance.android.live.effect.singleselector;

import X.C0H6B;
import X.C0UA2;
import X.C1390410mHn;
import X.C16F5;
import X.C23250099c;
import X.C500260Jjc;
import X.C500980Jkm;
import X.C761290Ttf;
import X.C761300Ttg;
import X.C761440Ttu;
import X.C761560Tu6;
import X.C766010U3b;
import X.C766050U3f;
import X.C766290U4d;
import X.C786410Ut5;
import X.C903300Zc8;
import X.InterfaceC761540Tu4;
import X.RunnableC781530UlD;
import Y.ACListenerS147S0100000_12;
import android.app.Dialog;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.android.live.effect.voiceeffect.VoiceEffectViewModel;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS591S0100000_12;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public final class SingleVoiceEffectSelectorDialog extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiLCk1LSY4Zzw6JiIgLDHELIOSw2JCAvPSAhZhYlJyg/LRMjICw2DSMqLCwnGyAgLCwnJzcIIC4/JyI=";
    public final C0UA2 LL;
    public ConstraintLayout LLILLJJLI;
    public RunnableC781530UlD LLILLL;
    public View LLILZ;
    public C16F5 LLILZIL;
    public C1390410mHn LLILZLL;
    public C761560Tu6 LLIZ;
    public VoiceEffectViewModel LLIZLLLIL;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.gei);
        c500980Jkm.LJIILIIL = 3;
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIJJI = 34;
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
        this.LLILZIL = null;
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

    public SingleVoiceEffectSelectorDialog(C0UA2 c0ua2) {
        this.LL = c0ua2;
    }

    public static boolean MR(LiveEffect liveEffect) {
        try {
            String extra = liveEffect.getExtra();
            if (extra != null) {
                return JSONObjectProtectorUtils.getBoolean(new JSONObject(extra), "Original");
            }
            return false;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
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
        this.LLILLJJLI = (ConstraintLayout) view.findViewById(R.id.vqc);
        this.LLILLL = (RunnableC781530UlD) view.findViewById(R.id.txp);
        this.LLILZ = view.findViewById(R.id.view_outside);
        this.LLILZIL = (C16F5) view.findViewById(R.id.tv_voice_effect_tips);
        this.LLILZLL = (C1390410mHn) view.findViewById(R.id.nld);
        ConstraintLayout constraintLayout = this.LLILLJJLI;
        if (constraintLayout != null && (background = constraintLayout.getBackground()) != null) {
            background.setAlpha(255);
        }
        View view2 = this.LLILZ;
        if (view2 != null) {
            C786410Ut5.I7(new ACListenerS147S0100000_12(this, 428), view2);
        }
        this.LLIZ = new C761560Tu6(new AwS591S0100000_12(this, 1145));
        RunnableC781530UlD runnableC781530UlD = this.LLILLL;
        if (runnableC781530UlD != null) {
            runnableC781530UlD.setLayoutManager(new LinearLayoutManager(runnableC781530UlD.getContext(), 0, false));
            runnableC781530UlD.addItemDecoration(new C0H6B());
            runnableC781530UlD.setAdapter(this.LLIZ);
            runnableC781530UlD.setItemAnimator(null);
        }
        this.LLIZLLLIL = (VoiceEffectViewModel) new ViewModelProvider(getViewModelStore(), new C761440Ttu(new C766010U3b(), new C766050U3f()), C903300Zc8.LIZJ).get(VoiceEffectViewModel.class);
        C1390410mHn c1390410mHn = this.LLILZLL;
        if (c1390410mHn != null) {
            C500260Jjc.LLFFF(c1390410mHn);
        }
        C1390410mHn c1390410mHn2 = this.LLILZLL;
        if (c1390410mHn2 != null) {
            c1390410mHn2.LIZJ();
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C761300Ttg(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C761290Ttf(this, null), 3);
    }
}
