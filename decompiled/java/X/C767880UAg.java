package X;

import Y.ACListenerS147S0100000_12;
import Y.ARunnableS23S0101000_12;
import Y.AsS39S0100000_12;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.live.effect.StickerSearchDialogEvent;
import com.bytedance.android.live.effect.TrendingPanelStickerChannel;
import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.android.livesdk.livesetting.effect.LiveEffectStructureOptSetting;
import com.bytedance.android.livesdk.utils.KeyBoardUtil;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS626S0100000_12;

/* JADX INFO: renamed from: X.0UAg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C767880UAg implements InterfaceC767260U7w {
    public final Context LL;
    public final DataChannel LLILLJJLI;
    public final String LLILLL = C0UD4.LIZIZ;
    public final View LLILZ;
    public final RunnableC781530UlD LLILZIL;
    public final LiveEditText LLILZLL;
    public final LiveIconView LLIZ;
    public final C16FZ LLIZLLLIL;
    public final View LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public final StickerEffectViewModel LLJILJIL;
    public final C0U9T LLJILJILJ;
    public AnonymousClass0956 LLJILLL;
    public AnonymousClass0956 LLJJ;
    public final C781710UlV LLJJI;

    @Override // X.C0U5V
    public final boolean LIZJ() {
        return false;
    }

    @Override // X.InterfaceC767260U7w
    public final void LJ() {
        AnonymousClass0956 anonymousClass0956;
        AnonymousClass0956 anonymousClass09562;
        this.LLJIJIL = false;
        AnonymousClass0956 anonymousClass09563 = this.LLJILLL;
        if (C500260Jjc.LJJJI(anonymousClass09563 != null ? Boolean.valueOf(anonymousClass09563.isActive()) : null) && (anonymousClass09562 = this.LLJILLL) != null) {
            anonymousClass09562.LIZIZ(null);
        }
        AnonymousClass0956 anonymousClass09564 = this.LLJJ;
        if (C500260Jjc.LJJJI(anonymousClass09564 != null ? Boolean.valueOf(anonymousClass09564.isActive()) : null) && (anonymousClass0956 = this.LLJJ) != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLILZLL.clearFocus();
        KeyBoardUtil.LIZJ(C497740JfY.LJII(), this.LLILZLL);
        C781710UlV c781710UlV = this.LLJJI;
        if (c781710UlV != null) {
            c781710UlV.LIZIZ();
        }
    }

    @Override // X.InterfaceC767260U7w
    public final void LIZ() throws Throwable {
        int iLLLLLLLLLL;
        C767830UAb c767830UAb = this.LLJILJIL.LLJILLL;
        this.LLJIJIL = true;
        this.LLJI = c767830UAb.LIZIZ;
        this.LLILZLL.setText(c767830UAb.LIZ);
        LiveEditText liveEditText = this.LLILZLL;
        Editable editableLLLFZ = C2204961BRm.LLLFZ(liveEditText, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYGZ1t7inJsr/5RQ7WLyU9ynfGA6SmPKpoHTd7sy7lqv8br2Vn5r0vmBlz7sbO", null));
        liveEditText.setSelection(editableLLLFZ != null ? editableLLLFZ.length() : 0);
        this.LLILZLL.requestFocus();
        KeyBoardUtil.LIZLLL(C497740JfY.LJII(), this.LLILZLL);
        LiveEffect liveEffect = this.LLJILJILJ.LLILZ;
        LiveEffect liveEffectLLJZIJLIL = liveEffect != null ? liveEffect.LLJZIJLIL() : null;
        if (!LJII()) {
            LiveEffect liveEffect2 = c767830UAb.LIZLLL;
            List<LiveEffect> arrayList = (List) this.LLILLJJLI.gg0(TrendingPanelStickerChannel.class);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            LJIILIIL(liveEffect2, arrayList);
        } else if (c767830UAb.LIZJ.isEmpty()) {
            LJIIIZ();
        } else if (this.LLJI) {
            LJIIL(c767830UAb.LIZLLL, c767830UAb.LIZJ);
        } else {
            LJIIJJI(c767830UAb.LIZLLL, c767830UAb.LIZJ);
        }
        if (C500260Jjc.LJJJJIZL(this.LLILZIL)) {
            LiveEffect liveEffect3 = this.LLJILJILJ.LLILZ;
            if (C500260Jjc.LJJIFFI(liveEffect3 != null ? Boolean.valueOf(liveEffect3.equals(liveEffectLLJZIJLIL)) : null) && (iLLLLLLLLLL = this.LLJILJILJ.LLLLLLLLLL()) >= 0) {
                HandlerHook.viewPostDelay(this.LLILZ, new ARunnableS23S0101000_12(iLLLLLLLLLL, this, 14), 300L);
            }
        }
        C781710UlV c781710UlV = this.LLJJI;
        if (c781710UlV != null) {
            c781710UlV.LIZJ(false);
        }
    }

    public final void LJI() {
        this.LLJILLL = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this.LLJILJIL), null, null, new C767890UAh(this, null), 3);
    }

    public final boolean LJII() {
        return C500260Jjc.LJJIIZ(C2204961BRm.LLLFZ(this.LLILZLL, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYGZ1t7inJsr/5RQ7WLyU9ynfGA6SmPKpoHTd7sy7lqv8br2Vn5r0vmBlz7sbO", null)));
    }

    public final void LJIIIZ() {
        if (!this.LLJIJIL || C500260Jjc.LJJJJIZL(this.LLJ)) {
            return;
        }
        C500260Jjc.LJIILIIL(this.LLIZLLLIL);
        C500260Jjc.LJIILLIIL(this.LLILZIL);
        C500260Jjc.LLFFF(this.LLJ);
    }

    public final void LJIIJ() {
        if (!this.LLJIJIL || C500260Jjc.LJJJJIZL(this.LLIZLLLIL)) {
            return;
        }
        C500260Jjc.LJIILIIL(this.LLJ);
        C500260Jjc.LJIILLIIL(this.LLILZIL);
        C500260Jjc.LLFFF(this.LLIZLLLIL);
    }

    @Override // X.C0U5V
    public final void onDialogBackground() {
        C781710UlV c781710UlV = this.LLJJI;
        if (c781710UlV != null) {
            c781710UlV.LIZIZ();
        }
    }

    @Override // X.C0U5V
    public final void onDialogForeground() {
        C781710UlV c781710UlV = this.LLJJI;
        if (c781710UlV != null) {
            c781710UlV.LIZJ(true);
        }
    }

    @Override // X.C0U5V
    public final void LIZIZ() {
        KeyBoardUtil.LIZJ(C497740JfY.LJII(), this.LLILZLL);
        C767830UAb c767830UAb = this.LLJILJIL.LLJILLL;
        c767830UAb.LIZ = String.valueOf(C2204961BRm.LLLFZ(this.LLILZLL, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYGZ1t7inJsr/5RQ7WLyU9ynfGA6SmPKpoHTd7sy7lqv8br2Vn5r0vmBlz7sbO", null)));
        List<LiveEffect> listQr = C0UA1.LIZ().qr(this.LLILLL);
        c767830UAb.LIZLLL = listQr != null ? (LiveEffect) C13LP.LJJJLL(listQr) : null;
        if (LiveEffectStructureOptSetting.INSTANCE.shouldClearCache()) {
            this.LLJILJIL.LLILZ.clearCache();
            ((ArrayList) this.LLJILJILJ.LL).clear();
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("live_sticker_search_panel_close");
        c474500IjALIZ.LJIJJLI(this.LLILLJJLI);
        c474500IjALIZ.LJJIJL();
    }

    @Override // X.C0U5V
    public final View getView() {
        return this.LLILZ;
    }

    @Override // X.C0U5V
    public final void LIZLLL(DialogFragment dialogFragment) {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(dialogFragment), null, null, new C767970UAp(this, null), 3);
    }

    public final void LJFF(LiveEffect liveEffect) {
        C767830UAb c767830UAb = this.LLJILJIL.LLJILLL;
        LiveEffect liveEffect2 = null;
        c767830UAb.LIZ = String.valueOf(C2204961BRm.LLLFZ(this.LLILZLL, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYGZ1t7inJsr/5RQ7WLyU9ynfGA6SmPKpoHTd7sy7lqv8br2Vn5r0vmBlz7sbO", null)));
        c767830UAb.LIZIZ = this.LLJI;
        c767830UAb.LIZJ = this.LLJILJILJ.LL;
        List<LiveEffect> listQr = C0UA1.LIZ().qr(this.LLILLL);
        if (listQr != null) {
            liveEffect2 = (LiveEffect) C13LP.LJJJLL(listQr);
        }
        c767830UAb.LIZLLL = liveEffect2;
        c767830UAb.LJ = liveEffect;
        this.LLILLJJLI.LC0(StickerSearchDialogEvent.class, Boolean.FALSE);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("live_sticker_search_panel_close");
        c474500IjALIZ.LJIJJLI(this.LLILLJJLI);
        c474500IjALIZ.LJJIJL();
    }

    public C767880UAg(Context context, DataChannel dataChannel) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        this.LL = context;
        this.LLILLJJLI = dataChannel;
        View viewSd = C786410Ut5.Sd(R.layout.gf8, C786410Ut5.ne(context), null);
        this.LLILZ = viewSd;
        int iLJIILLIIL = (int) (((double) C497740JfY.LJIILLIIL()) * 0.7d);
        View viewFindViewById = viewSd.findViewById(R.id.ud8);
        if (viewFindViewById != null && (layoutParams2 = viewFindViewById.getLayoutParams()) != null) {
            layoutParams2.height = iLJIILLIIL;
        }
        RunnableC781530UlD runnableC781530UlD = (RunnableC781530UlD) viewSd.findViewById(R.id.eux);
        if (runnableC781530UlD != null && (layoutParams = runnableC781530UlD.getLayoutParams()) != null) {
            layoutParams.height = iLJIILLIIL - ((int) C497740JfY.LIZIZ(60.0f));
        }
        this.LLILZIL = runnableC781530UlD;
        LiveEditText liveEditText = (LiveEditText) viewSd.findViewById(R.id.u7n);
        this.LLILZLL = liveEditText;
        LiveIconView liveIconView = (LiveIconView) viewSd.findViewById(R.id.e0l);
        this.LLIZ = liveIconView;
        View viewFindViewById2 = viewSd.findViewById(R.id.db0);
        this.LLIZLLLIL = (C16FZ) viewSd.findViewById(R.id.nnp);
        View viewFindViewById3 = viewSd.findViewById(R.id.hc6);
        this.LLJ = viewFindViewById3;
        StickerEffectViewModel stickerEffectViewModelLIZ = C0U60.LIZ();
        this.LLJILJIL = stickerEffectViewModelLIZ;
        C0U9T c0u9t = new C0U9T(true, dataChannel, stickerEffectViewModelLIZ, new AwS591S0100000_12(this, 781));
        c0u9t.LLJJIII = new C0UBH("search", "search", false);
        this.LLJILJILJ = c0u9t;
        runnableC781530UlD.setLayoutManager(new GridLayoutManager(5, 1, context, false));
        c0u9t.setHasStableIds(true);
        runnableC781530UlD.setAdapter(c0u9t);
        runnableC781530UlD.setItemAnimator(null);
        runnableC781530UlD.setHasFixedSize(true);
        runnableC781530UlD.setItemViewCacheSize(10);
        C0U4C c0u4c = C0U4C.EFFECT_SEARCH_STICKER;
        int i = RunnableC781530UlD.LLIZLLLIL;
        RecyclerView.RecycledViewPool recycledViewPoolLJ = runnableC781530UlD.LJ(c0u4c, true, null);
        if (recycledViewPoolLJ != null) {
            recycledViewPoolLJ.setMaxRecycledViews(C0U9E.NORMAL.getValue(), 30);
        }
        runnableC781530UlD.addOnScrollListener(new C772770UTb(C1EOY.LIZ.LIZIZ("panel_search_sticker_slide"), null));
        this.LLJJI = new C781710UlV(1, 0.0d, runnableC781530UlD, new AwS626S0100000_12(this, 44));
        liveIconView.setIconTint(C20736316Cj.LIZIZ(R.attr.exr, context));
        viewFindViewById.getBackground().setAlpha(82);
        runnableC781530UlD.addOnScrollListener(new AsS39S0100000_12(this, 4));
        C786410Ut5.I7(new ACListenerS147S0100000_12(this, 312), viewFindViewById3);
        liveEditText.setOnFocusChangeListener(new ViewOnFocusChangeListenerC786030UsT(this, 1));
        liveEditText.addTextChangedListener(new C786120Usc(this, 15));
        liveEditText.setOnEditorActionListener(new C785880UsE(this, 1));
        C500260Jjc.LJLIIIL(500L, liveIconView, new AwS591S0100000_12(this, 782));
        C500260Jjc.LJLIIIL(500L, viewFindViewById2, new AwS591S0100000_12(this, 783));
    }

    public final void LJIIJJI(LiveEffect liveEffect, List<LiveEffect> list) {
        if (!this.LLJIJIL) {
            return;
        }
        if (list.isEmpty()) {
            if (LJII()) {
                LJIIIZ();
                return;
            } else {
                LJIIJ();
                return;
            }
        }
        C500260Jjc.LJIILIIL(this.LLIZLLLIL);
        C500260Jjc.LJIILIIL(this.LLJ);
        C0U9I.LIZ(list);
        this.LLJILJILJ.LLZLI(C0U7C.LIZJ(list), false, liveEffect, C0UD4.LIZIZ, this.LL);
        C500260Jjc.LLFFF(this.LLILZIL);
    }

    public final void LJIIL(LiveEffect liveEffect, List<LiveEffect> list) {
        if (!this.LLJIJIL) {
            return;
        }
        C500260Jjc.LJIILIIL(this.LLIZLLLIL);
        C500260Jjc.LJIILIIL(this.LLJ);
        C0U9I.LIZJ(list);
        this.LLJILJILJ.LLZLI(C0U7C.LIZJ(list), false, liveEffect, C0UD4.LIZIZ, this.LL);
        C500260Jjc.LLFFF(this.LLILZIL);
    }

    public final void LJIILIIL(LiveEffect liveEffect, List<LiveEffect> list) {
        if (!this.LLJIJIL) {
            return;
        }
        if (list.isEmpty()) {
            if (LJII()) {
                LJIIIZ();
                return;
            } else {
                LJIIJ();
                return;
            }
        }
        C500260Jjc.LJIILIIL(this.LLIZLLLIL);
        C500260Jjc.LJIILIIL(this.LLJ);
        C0U9I.LIZIZ(list);
        this.LLJILJILJ.LLZLI(C0U7C.LIZJ(list), false, liveEffect, C0UD4.LIZIZ, this.LL);
        C500260Jjc.LLFFF(this.LLILZIL);
    }

    public final void LJIIIIZZ(String str, boolean z, boolean z2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("live_sticker_search");
        c474500IjALIZ.LJIJJLI(this.LLILLJJLI);
        c474500IjALIZ.LJJII(str, "search_id");
        c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), "has_result");
        c474500IjALIZ.LJJII(Integer.valueOf(z2 ? 1 : 0), "is_success");
        c474500IjALIZ.LJJIJL();
    }
}
