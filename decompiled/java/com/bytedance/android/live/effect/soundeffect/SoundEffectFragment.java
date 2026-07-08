package com.bytedance.android.live.effect.soundeffect;

import X.C0U4C;
import X.C0URX;
import X.C1161920gLG;
import X.C16F5;
import X.C23250099c;
import X.C424270GkL;
import X.C424500Gki;
import X.C475510Ikn;
import X.C497740JfY;
import X.C500260Jjc;
import X.C500980Jkm;
import X.C520010KaN;
import X.C761370Ttn;
import X.C761390Ttp;
import X.C761450Ttv;
import X.C761590Tu9;
import X.C761680TuI;
import X.C761740TuO;
import X.C761960Tuk;
import X.C766290U4d;
import X.C770910ULx;
import X.C781710UlV;
import X.C786410Ut5;
import X.C946050aj5;
import X.C946060aj6;
import X.EnumC761940Tui;
import X.InterfaceC1813060xHU;
import X.RunnableC781530UlD;
import X.ViewOnClickListenerC1836610xtT;
import Y.ACListenerS147S0100000_12;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.effect.api.SoundEffectPanelCloseEvent;
import com.bytedance.android.live.effect.soundeffect.SoundEffectFragment;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.LiveDialogStatusChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.SoundEffectChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS626S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class SoundEffectFragment extends LiveDialogFragment implements View.OnLayoutChangeListener {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiLCk1LSY4HELIOSZzw8PSsoLCk1LSY4Zxw8PSsoDCk1LSY4Dz0yLygpJzs=";
    public View LL;
    public View LLILLJJLI;
    public C16F5 LLILLL;
    public C16F5 LLILZ;
    public RunnableC781530UlD LLILZIL;
    public ViewOnClickListenerC1836610xtT LLILZLL;
    public SoundEffectViewModel LLIZ;
    public C761590Tu9 LLIZLLLIL;
    public C781710UlV LLJ;
    public long LLJI;
    public int LLJIJIL;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    public final View MR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.bnu) : null;
            this.LL = viewFindViewById;
        }
        return viewFindViewById;
    }

    public final C16F5 NR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.goi) : null;
            this.LLILLL = (C16F5) viewFindViewById;
        }
        return (C16F5) viewFindViewById;
    }

    public final ViewOnClickListenerC1836610xtT OR() {
        View viewFindViewById = this.LLILZLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.gxc) : null;
            this.LLILZLL = (ViewOnClickListenerC1836610xtT) viewFindViewById;
        }
        return (ViewOnClickListenerC1836610xtT) viewFindViewById;
    }

    public final RunnableC781530UlD PR() {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.tx5) : null;
            this.LLILZIL = (RunnableC781530UlD) viewFindViewById;
        }
        return (RunnableC781530UlD) viewFindViewById;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.gee);
        C766290U4d.LIZ(c500980Jkm);
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
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
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final boolean requireE2EAdaption() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C946060aj6 c946060aj6LIZ;
        C946050aj5 c946050aj5LIZIZ;
        super.onCreate(bundle);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (c946060aj6LIZ = C0URX.LIZ(dataChannel, SoundEffectChannel.class)) != null && (c946050aj5LIZIZ = c946060aj6LIZ.LIZIZ()) != null) {
            c946050aj5LIZIZ.LJFF(0);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        C946060aj6 c946060aj6LIZ;
        C946050aj5 c946050aj5LIZIZ;
        super.onDismiss(dialogInterface);
        MR().removeOnLayoutChangeListener(this);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.FQ2(SoundEffectPanelCloseEvent.class);
        }
        C761680TuI.LIZIZ(this.LLJI, this.dataChannel, false);
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.zW(LiveDialogStatusChannel.class, new C770910ULx(false, 0, hashCode(), EnumC761940Tui.DIALOG_BIZ_SECONDARY_EFFECT_PANEL));
        }
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null && (c946060aj6LIZ = C0URX.LIZ(dataChannel3, SoundEffectChannel.class)) != null && (c946050aj5LIZIZ = c946060aj6LIZ.LIZIZ()) != null) {
            c946050aj5LIZIZ.LIZIZ(2);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        long id;
        int iLJIIZILJ;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Room room;
        super.onViewCreated(view, bundle);
        this.LLJI = System.currentTimeMillis();
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null && (room = (Room) dataChannelLJ.gg0(RoomChannel.class)) != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        this.LLIZ = (SoundEffectViewModel) C520010KaN.LJJJ(this, SoundEffectViewModel.class, new C761450Ttv(new C761960Tuk(id), new C761740TuO()), null, false);
        MR().getBackground().setAlpha(255);
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.fy5);
            } else {
                viewFindViewById = null;
            }
            this.LLILLJJLI = viewFindViewById;
        }
        C786410Ut5.I7(new ACListenerS147S0100000_12(this, 456), viewFindViewById);
        this.LLIZLLLIL = new C761590Tu9(this.dataChannel, this, this.LLIZ);
        C500260Jjc.LLFFF(NR());
        C786410Ut5.l8(NR(), new ACListenerS147S0100000_12(this, 457));
        RunnableC781530UlD runnableC781530UlDPR = PR();
        int iLIZIZ = (int) C497740JfY.LIZIZ(372.0f);
        if (((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).Nx()) {
            iLJIIZILJ = (int) C497740JfY.LIZIZ(375.0f);
        } else {
            iLJIIZILJ = C497740JfY.LJIIZILJ();
        }
        runnableC781530UlDPR.addItemDecoration(new C424270GkL(5, 0, (iLJIIZILJ - iLIZIZ) / 4));
        runnableC781530UlDPR.setHasFixedSize(true);
        runnableC781530UlDPR.setItemAnimator(new C424500Gki((int) C497740JfY.LIZIZ(60.0f)));
        C0U4C c0u4c = C0U4C.EFFECT_SOUND_EDITABLE;
        int i = RunnableC781530UlD.LLIZLLLIL;
        RecyclerView.RecycledViewPool recycledViewPoolLJ = runnableC781530UlDPR.LJ(c0u4c, true, null);
        if (recycledViewPoolLJ != null) {
            recycledViewPoolLJ.setMaxRecycledViews(0, 10);
        }
        int iLIZIZ2 = (int) C497740JfY.LIZIZ(16.0f);
        ViewGroup.LayoutParams layoutParams = runnableC781530UlDPR.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.setMarginStart(iLIZIZ2);
            marginLayoutParams.setMarginEnd(iLIZIZ2);
        }
        runnableC781530UlDPR.requestLayout();
        C781710UlV c781710UlV = new C781710UlV(1, 0.0d, runnableC781530UlDPR, new AwS626S0100000_12(this, 73));
        this.LLJ = c781710UlV;
        c781710UlV.LIZJ(true);
        C761590Tu9 c761590Tu9 = this.LLIZLLLIL;
        if (c761590Tu9 == null) {
            c761590Tu9 = null;
        }
        runnableC781530UlDPR.setAdapter(c761590Tu9);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(runnableC781530UlDPR.getContext(), 5);
        gridLayoutManager.setStackFromEnd(false);
        runnableC781530UlDPR.setLayoutManager(gridLayoutManager);
        OR().setErrorClickListener(new InterfaceC1813060xHU() { // from class: X.0Tto
            @Override // X.InterfaceC1813060xHU
            public final void LIZIZ() {
                SoundEffectFragment soundEffectFragment = this.LIZ;
                soundEffectFragment.getClass();
                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(soundEffectFragment), null, null, new C761370Ttn(soundEffectFragment, null), 3);
            }
        });
        MR().addOnLayoutChangeListener(this);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C761390Ttp(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C761370Ttn(this, null), 3);
        C761680TuI.LIZJ(this.dataChannel, false);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.LLJIJIL != MR().getHeight()) {
            int height = MR().getHeight();
            this.LLJIJIL = height;
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.zW(LiveDialogStatusChannel.class, new C770910ULx(true, height, hashCode(), EnumC761940Tui.DIALOG_BIZ_SECONDARY_EFFECT_PANEL));
            }
        }
    }
}
