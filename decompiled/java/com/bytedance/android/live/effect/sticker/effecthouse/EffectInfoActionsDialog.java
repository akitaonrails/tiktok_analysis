package com.bytedance.android.live.effect.sticker.effecthouse;

import X.C0IJT;
import X.C20736316Cj;
import X.C23250099c;
import X.C444140HbI;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.C500980Jkm;
import X.C760220Trw;
import X.C786410Ut5;
import X.InterfaceC760100Trk;
import Y.ACListenerS147S0100000_12;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS289S0000000_6;

/* JADX INFO: loaded from: classes13.dex */
public final class EffectInfoActionsDialog extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiLCk1LSY4ZzwnISYnHELIOSLD19LSMqLCwnICo5Oip9DSMqLCwnASsqJg4wPCwjJzwXISQgJig=";
    public View LL;
    public View LLILLJJLI;
    public View LLILLL;
    public LiveEffect LLILZ;
    public StickerEffectViewModel LLILZIL;
    public InterfaceC760100Trk LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public ViewGroup LLJ;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.f911gen);
        c500980Jkm.LIZJ = R.style.ahk;
        c500980Jkm.LIZIZ = 0;
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIJ = -2;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
    }

    public final void MR(boolean z) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_sticker_remove_confirm_click");
        c474500IjALIZ.LJIJJLI(this.dataChannel);
        c474500IjALIZ.LJIJJLI(this.dataChannel);
        LiveEffect liveEffect = this.LLILZ;
        LiveEffect liveEffect2 = null;
        if (liveEffect == null) {
            liveEffect = null;
        }
        c474500IjALIZ.LJJII(Long.valueOf(liveEffect.getEffectId()), "sticker_id");
        LiveEffect liveEffect3 = this.LLILZ;
        if (liveEffect3 == null) {
            liveEffect3 = null;
        }
        c474500IjALIZ.LJJII(liveEffect3.getResourceId(), "resource_id");
        LiveEffect liveEffect4 = this.LLILZ;
        if (liveEffect4 == null) {
            liveEffect4 = null;
        }
        c474500IjALIZ.LJJII(liveEffect4.getName(), "sticker_name");
        LiveEffect liveEffect5 = this.LLILZ;
        if (liveEffect5 != null) {
            liveEffect2 = liveEffect5;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(liveEffect2.getSource()), "source");
        c474500IjALIZ.LJJII("panel", "method");
        c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), "is_remove");
        c474500IjALIZ.LIZ();
    }

    public final void NR(boolean z) {
        int i;
        ViewGroup viewGroup = this.LLJ;
        TextView textView = null;
        if (viewGroup != null) {
            LiveIconView liveIconView = (LiveIconView) viewGroup.findViewById(R.id.jxe);
            if (z) {
                liveIconView.setIcon(C20736316Cj.LIZLLL(R.attr.c6g, viewGroup.getContext()));
                liveIconView.setIconTint(C20736316Cj.LIZIZ(R.attr.ewy, viewGroup.getContext()));
            } else {
                liveIconView.setIcon(C20736316Cj.LIZLLL(R.attr.c6g, viewGroup.getContext()));
                liveIconView.setIconTint(C20736316Cj.LIZIZ(R.attr.ewz, viewGroup.getContext()));
            }
        }
        ViewGroup viewGroup2 = this.LLJ;
        if (viewGroup2 != null) {
            textView = (TextView) viewGroup2.findViewById(R.id.title);
        }
        if (z) {
            i = 2131841501;
        } else {
            i = 2131841500;
        }
        textView.setText(i);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ViewGroup viewGroup;
        super.onViewCreated(view, bundle);
        StickerEffectViewModel stickerEffectViewModel = this.LLILZIL;
        View viewFindViewById = null;
        if (stickerEffectViewModel == null) {
            stickerEffectViewModel = null;
        }
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(stickerEffectViewModel), null, null, new C760220Trw(this, null), 3);
        StickerEffectViewModel stickerEffectViewModel2 = this.LLILZIL;
        if (stickerEffectViewModel2 == null) {
            stickerEffectViewModel2 = null;
        }
        List<LiveEffect> list = stickerEffectViewModel2.LLILZ.LJJJ().LIZIZ;
        LiveEffect liveEffect = this.LLILZ;
        if (liveEffect == null) {
            liveEffect = null;
        }
        this.LLIZ = list.contains(liveEffect);
        View view2 = getView();
        if (view2 != null) {
            viewGroup = (ViewGroup) view2.findViewById(R.id.hq3);
        } else {
            viewGroup = null;
        }
        this.LLJ = viewGroup;
        NR(this.LLIZ);
        View viewFindViewById2 = this.LL;
        if (viewFindViewById2 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById2 = view3.findViewById(R.id.hq3);
            } else {
                viewFindViewById2 = null;
            }
            this.LL = viewFindViewById2;
        }
        C500260Jjc.LJIILIIL(viewFindViewById2.findViewById(R.id.okl));
        C786410Ut5.I7(new ACListenerS147S0100000_12(this, 57), viewFindViewById2);
        ViewGroup viewGroup2 = this.LLJ;
        if (viewGroup2 != null) {
            C444140HbI.LIZ(viewGroup2, AFwS289S0000000_6.get$arr$(1));
        }
        View viewFindViewById3 = this.LLILLJJLI;
        if (viewFindViewById3 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById3 = view4.findViewById(R.id.t8c);
            } else {
                viewFindViewById3 = null;
            }
            this.LLILLJJLI = viewFindViewById3;
        }
        LiveIconView liveIconView = (LiveIconView) viewFindViewById3.findViewById(R.id.jxe);
        liveIconView.setIcon(C20736316Cj.LIZLLL(R.attr.ds1, viewFindViewById3.getContext()));
        liveIconView.setIconTint(C20736316Cj.LIZIZ(R.attr.exz, viewFindViewById3.getContext()));
        ((TextView) viewFindViewById3.findViewById(R.id.title)).setText(2131841508);
        ((TextView) viewFindViewById3.findViewById(R.id.title)).setTextColor(C497740JfY.LJFF(R.color.a5_));
        C786410Ut5.I7(new ACListenerS147S0100000_12(this, 28), viewFindViewById3);
        C444140HbI.LIZ(viewFindViewById3, AFwS289S0000000_6.get$arr$(3));
        View view5 = this.LLILLL;
        if (view5 == null) {
            View view6 = getView();
            if (view6 != null) {
                viewFindViewById = view6.findViewById(R.id.t5y);
            }
            this.LLILLL = viewFindViewById;
            view5 = viewFindViewById;
        }
        LiveIconView liveIconView2 = (LiveIconView) view5.findViewById(R.id.jxe);
        liveIconView2.setIcon(C20736316Cj.LIZLLL(R.attr.cy5, view5.getContext()));
        liveIconView2.setIconTint(C20736316Cj.LIZIZ(R.attr.ewz, view5.getContext()));
        ((TextView) view5.findViewById(R.id.title)).setText(2131841506);
        C786410Ut5.I7(new ACListenerS147S0100000_12(this, 27), view5);
        C444140HbI.LIZ(view5, AFwS289S0000000_6.get$arr$(2));
    }
}
