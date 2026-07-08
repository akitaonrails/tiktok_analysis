package com.bytedance.android.live.effect.voiceeffect;

import X.C0GYC;
import X.C0H6B;
import X.C0U4C;
import X.C0U56;
import X.C0U61;
import X.C0UUE;
import X.C16F5;
import X.C1EOY;
import X.C23250099c;
import X.C500260Jjc;
import X.C500980Jkm;
import X.C761350Ttl;
import X.C761360Ttm;
import X.C761440Ttu;
import X.C761750TuP;
import X.C761830TuX;
import X.C766010U3b;
import X.C766050U3f;
import X.C766290U4d;
import X.C770910ULx;
import X.C772770UTb;
import X.C786410Ut5;
import X.C946050aj5;
import X.C946060aj6;
import X.EnumC761940Tui;
import X.EnumC771230UNd;
import X.InterfaceC761710TuL;
import X.InterfaceC761800TuU;
import X.RunnableC781530UlD;
import Y.ACListenerS147S0100000_12;
import Y.ARunnableS81S0200000_12;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.BroadcastVoiceEffectSelectedChannel;
import com.bytedance.android.livesdk.dataChannel.LiveDialogStatusChannel;
import com.bytedance.android.livesdk.model.VoiceEffectChannel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveVoiceEffectDialogFragment extends LiveDialogFragment implements InterfaceC761800TuU, InterfaceC761710TuL, View.OnLayoutChangeListener {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiLCk1LSY4Zzk8ISHELIOSYpLCk1LSY4ZwM6PiAaJiYwLQAqLyowPAElKCM8LwM+KCg+LSs4";
    public ConstraintLayout LL;
    public RunnableC781530UlD LLILLJJLI;
    public View LLILLL;
    public ConstraintLayout LLILZ;
    public C0GYC LLILZIL;
    public C16F5 LLILZLL;
    public String LLIZ;
    public int LLIZLLLIL;
    public C761750TuP LLJ;
    public VoiceEffectViewModel LLJI;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    public final RunnableC781530UlD MR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.txp) : null;
            this.LLILLJJLI = (RunnableC781530UlD) viewFindViewById;
        }
        return (RunnableC781530UlD) viewFindViewById;
    }

    public final ConstraintLayout NR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.vqc) : null;
            this.LL = (ConstraintLayout) viewFindViewById;
        }
        return (ConstraintLayout) viewFindViewById;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.geh);
        C766290U4d.LIZ(c500980Jkm);
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        NR().removeOnLayoutChangeListener(this);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(LiveDialogStatusChannel.class, new C770910ULx(false, 0, hashCode(), EnumC761940Tui.DIALOG_BIZ_SECONDARY_EFFECT_PANEL));
        }
        C761830TuX c761830TuX = C761830TuX.LIZ;
        C761830TuX.LJII = null;
        C761830TuX.LJI = null;
        C761830TuX.LIZ();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        super.onStart();
        C766290U4d.LIZIZ(this);
        C761750TuP c761750TuP = this.LLJ;
        if (c761750TuP != null && c761750TuP.LLIZ) {
            C761830TuX.LIZ();
            c761750TuP.LLIZ = false;
            c761750TuP.notifyDataSetChanged();
        }
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C0U56 getPanelType() {
        return C0U56.PANEL_EFFECT_VOICE;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final boolean requireE2EAdaption() {
        return true;
    }

    @Override // X.InterfaceC761800TuU
    public final void Cx(boolean z) {
        View viewFindViewById = null;
        if (z) {
            OR(2131842882);
            View viewFindViewById2 = this.LLILZ;
            if (viewFindViewById2 == null) {
                View view = getView();
                if (view != null) {
                    viewFindViewById2 = view.findViewById(R.id.bbe);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLILZ = (ConstraintLayout) viewFindViewById2;
            }
            C500260Jjc.LLFFF(viewFindViewById2);
            View view2 = this.LLILZIL;
            if (view2 == null) {
                View view3 = getView();
                if (view3 != null) {
                    viewFindViewById = view3.findViewById(R.id.ba8);
                }
                this.LLILZIL = (C0GYC) viewFindViewById;
                view2 = viewFindViewById;
            }
            C0GYC c0gyc = (C0GYC) view2;
            for (ValueAnimator valueAnimator : c0gyc.LLILLJJLI) {
                int viewAnimatorHeight = c0gyc.getViewAnimatorHeight();
                int i = c0gyc.LLILZIL;
                valueAnimator.setIntValues(i, viewAnimatorHeight, i);
                valueAnimator.start();
            }
            return;
        }
        OR(2131842881);
        View viewFindViewById3 = this.LLILZ;
        if (viewFindViewById3 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById3 = view4.findViewById(R.id.bbe);
            } else {
                viewFindViewById3 = null;
            }
            this.LLILZ = (ConstraintLayout) viewFindViewById3;
        }
        C500260Jjc.LJIILIIL(viewFindViewById3);
        View view5 = this.LLILZIL;
        if (view5 == null) {
            View view6 = getView();
            if (view6 != null) {
                viewFindViewById = view6.findViewById(R.id.ba8);
            }
            this.LLILZIL = (C0GYC) viewFindViewById;
            view5 = viewFindViewById;
        }
        Iterator<ValueAnimator> it2 = ((C0GYC) view5).LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().cancel();
        }
    }

    public final void OR(int i) {
        View viewFindViewById = this.LLILZLL;
        if (viewFindViewById == null) {
            View view = getView();
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.tv_voice_effect_tips);
            } else {
                viewFindViewById = null;
            }
            this.LLILZLL = (C16F5) viewFindViewById;
        }
        ((TextView) viewFindViewById).setText(i);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C946060aj6 c946060aj6;
        C946050aj5 c946050aj5LIZIZ;
        super.onCreate(bundle);
        setCancelable(true);
        C761830TuX.LJII = this;
        C761830TuX.LJI = this;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (c946060aj6 = (C946060aj6) dataChannel.gg0(VoiceEffectChannel.class)) != null && (c946050aj5LIZIZ = c946060aj6.LIZIZ()) != null) {
            c946050aj5LIZIZ.LJFF(0);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        C946060aj6 c946060aj6;
        C946050aj5 c946050aj5LIZIZ;
        super.onDismiss(dialogInterface);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (c946060aj6 = (C946060aj6) dataChannel.gg0(VoiceEffectChannel.class)) != null && (c946050aj5LIZIZ = c946060aj6.LIZIZ()) != null) {
            c946050aj5LIZIZ.LIZIZ(2);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        super.onViewCreated(view, bundle);
        if (getActivity() != null) {
            VoiceEffectViewModel voiceEffectViewModel = (VoiceEffectViewModel) C0U61.LIZ(new C761440Ttu(new C766010U3b(), new C766050U3f())).get(VoiceEffectViewModel.class);
            this.LLJ = new C761750TuP(this.dataChannel, voiceEffectViewModel);
            this.LLJI = voiceEffectViewModel;
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C761360Ttm(this, null), 3);
        NR().getBackground().setAlpha(255);
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.view_outside);
            } else {
                viewFindViewById = null;
            }
            this.LLILLL = viewFindViewById;
        }
        C786410Ut5.I7(new ACListenerS147S0100000_12(this, 366), viewFindViewById);
        RunnableC781530UlD runnableC781530UlDMR = MR();
        runnableC781530UlDMR.setLayoutManager(new LinearLayoutManager(runnableC781530UlDMR.getContext(), 0, false));
        runnableC781530UlDMR.addItemDecoration(new C0H6B());
        runnableC781530UlDMR.setAdapter(this.LLJ);
        runnableC781530UlDMR.setHasFixedSize(true);
        runnableC781530UlDMR.setItemAnimator(null);
        C0U4C c0u4c = C0U4C.EFFECT_VOICE;
        int i = RunnableC781530UlD.LLIZLLLIL;
        RecyclerView.RecycledViewPool recycledViewPoolLJ = runnableC781530UlDMR.LJ(c0u4c, true, null);
        if (recycledViewPoolLJ != null) {
            recycledViewPoolLJ.setMaxRecycledViews(0, 7);
        }
        C1EOY c1eoy = C1EOY.LIZ;
        RunnableC781530UlD runnableC781530UlDMR2 = MR();
        Dialog dialog = getDialog();
        if (dialog != null) {
            window = dialog.getWindow();
        } else {
            window = null;
        }
        runnableC781530UlDMR2.addOnScrollListener(new C772770UTb(c1eoy.LIZIZ("panel_sound_slide"), window));
        NR().addOnLayoutChangeListener(this);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C761350Ttl(this, null), 3);
    }

    @Override // X.InterfaceC761710TuL
    public final void zu(LiveEffect liveEffect, boolean z) {
        int i;
        EnumC771230UNd enumC771230UNd;
        if (z) {
            i = 2131842880;
        } else {
            i = 2131842881;
        }
        OR(i);
        if (!z) {
            C761830TuX c761830TuX = C761830TuX.LIZ;
            Handler handler = (Handler) C761830TuX.LJIIJJI.getValue();
            handler.removeCallbacksAndMessages(null);
            C786410Ut5.LJLIIL(30000L, handler, new ARunnableS81S0200000_12(liveEffect, this, 20));
            enumC771230UNd = EnumC771230UNd.APPLYING;
        } else {
            C761830TuX c761830TuX2 = C761830TuX.LIZ;
            ((Handler) C761830TuX.LJIIJJI.getValue()).removeCallbacksAndMessages(null);
            enumC771230UNd = EnumC771230UNd.APPLY_FINISH;
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(BroadcastVoiceEffectSelectedChannel.class, new C0UUE(enumC771230UNd, liveEffect.getResourceId()));
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.LLIZLLLIL != NR().getHeight()) {
            int height = NR().getHeight();
            this.LLIZLLLIL = height;
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.zW(LiveDialogStatusChannel.class, new C770910ULx(true, height, hashCode(), EnumC761940Tui.DIALOG_BIZ_SECONDARY_EFFECT_PANEL));
            }
        }
    }
}
