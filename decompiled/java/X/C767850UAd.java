package X;

import Y.ACListenerS147S0100000_12;
import Y.ATListenerS446S0100000_12;
import Y.AsS39S0100000_12;
import android.text.Editable;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.GridLayoutManager;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.live.effect.StickerSearchDialogEvent;
import com.bytedance.android.live.effect.TrendingPanelStickerChannel;
import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS626S0100000_12;

/* JADX INFO: renamed from: X.0UAd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C767850UAd extends AbstractC767840UAc {
    public final InterfaceC769000UEo LJIILLIIL;
    public final StickerEffectViewModel LJIIZILJ;
    public final LiveEditText LJIJ;
    public final LiveIconView LJIJI;
    public boolean LJIJJ;
    public AnonymousClass0956 LJIJJLI;
    public AnonymousClass0956 LJIL;
    public AnonymousClass0956 LJJ;

    @Override // X.AbstractC767840UAc
    public final void LIZIZ() {
        this.LJIJ.setText(this.LJIIZILJ.LLJILLL.LIZ);
        LJIIZILJ();
        this.LIZJ.LLZIL(this.LJIIZILJ.LLJILLL.LIZLLL);
        DataChannel dataChannel = this.LIZIZ;
        if (dataChannel != null) {
            dataChannel.CQ2(StickerSearchDialogEvent.class, this, new AwS591S0100000_12(this, 669));
        }
    }

    public final boolean LJIIIZ() {
        return C500260Jjc.LJJIIZ(C2204961BRm.LLLFZ(this.LJIJ, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYGZ1t7inJsr/5RQ7WLyU91XvUBemdkWx4wonmAFhItbZOYRBaOiCJ8ko=", null)));
    }

    public final void LJIILIIL() {
        C500260Jjc.LJIILIIL(this.LJIIL);
        C500260Jjc.LJIILLIIL(this.LJIIIZ);
        C500260Jjc.LLFFF(this.LJIIJJI);
        LJII();
    }

    public final void LJIIZILJ() {
        List<LiveEffect> listQr;
        C767830UAb c767830UAb = this.LJIIZILJ.LLJILLL;
        InterfaceC769000UEo interfaceC769000UEo = this.LJIILLIIL;
        c767830UAb.LIZLLL = (interfaceC769000UEo == null || (listQr = interfaceC769000UEo.qr(this.LJIILJJIL)) == null) ? null : (LiveEffect) C13LP.LJJJLL(listQr);
    }

    @Override // X.AbstractC767840UAc
    public final void LIZ() {
        AnonymousClass0956 anonymousClass0956;
        AnonymousClass0956 anonymousClass09562;
        AnonymousClass0956 anonymousClass09563;
        super.LIZ();
        AnonymousClass0956 anonymousClass09564 = this.LJIJJLI;
        if (C500260Jjc.LJJJI(anonymousClass09564 != null ? Boolean.valueOf(anonymousClass09564.isActive()) : null) && (anonymousClass09563 = this.LJIJJLI) != null) {
            anonymousClass09563.LIZIZ(null);
        }
        AnonymousClass0956 anonymousClass09565 = this.LJIL;
        if (C500260Jjc.LJJJI(anonymousClass09565 != null ? Boolean.valueOf(anonymousClass09565.isActive()) : null) && (anonymousClass09562 = this.LJIL) != null) {
            anonymousClass09562.LIZIZ(null);
        }
        AnonymousClass0956 anonymousClass09566 = this.LJJ;
        if (C500260Jjc.LJJJI(anonymousClass09566 != null ? Boolean.valueOf(anonymousClass09566.isActive()) : null) && (anonymousClass0956 = this.LJJ) != null) {
            anonymousClass0956.LIZIZ(null);
        }
        LJIIZILJ();
        DataChannel dataChannel = this.LIZIZ;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
    }

    @Override // X.AbstractC767840UAc
    public final void LIZLLL() {
        super.LIZLLL();
        LJIIJ(this.LJIIZILJ.LLJILLL);
    }

    public final void LJIIL() {
        LJIIIIZZ();
        C500260Jjc.LJIILIIL(this.LJIIJJI);
        C500260Jjc.LJIILLIIL(this.LJIIIZ);
        C500260Jjc.LLFFF(this.LJIIL);
    }

    public final void LJIIJ(C767830UAb c767830UAb) {
        LiveEffect liveEffectLIZJ;
        List<LiveEffect> arrayList;
        this.LJIJ.setText(c767830UAb.LIZ);
        this.LJIJJ = c767830UAb.LIZIZ;
        if (C767250U7v.LJ(c767830UAb.LIZLLL)) {
            liveEffectLIZJ = C767250U7v.LIZJ(c767830UAb.LIZLLL, c767830UAb.LIZJ);
        } else {
            liveEffectLIZJ = c767830UAb.LIZLLL;
        }
        if (LJIIIZ()) {
            if (c767830UAb.LIZJ.isEmpty()) {
                LJIIL();
                return;
            } else if (this.LJIJJ) {
                LJIILL(liveEffectLIZJ, c767830UAb.LIZJ);
                return;
            } else {
                LJIILJJIL(liveEffectLIZJ, c767830UAb.LIZJ);
                return;
            }
        }
        DataChannel dataChannel = this.LIZIZ;
        if (dataChannel == null || (arrayList = (List) dataChannel.gg0(TrendingPanelStickerChannel.class)) == null) {
            arrayList = new ArrayList<>();
        }
        LJIILLIIL(liveEffectLIZJ, arrayList);
    }

    public final void LJIIJJI(List<LiveEffect> list) {
        String string;
        List<LiveEffect> listQr;
        C767830UAb c767830UAb = this.LJIIZILJ.LLJILLL;
        LiveEffect liveEffect = null;
        Editable editableLLLFZ = C2204961BRm.LLLFZ(this.LJIJ, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYGZ1t7inJsr/5RQ7WLyU91XvUBemdkWx4wonmAFhItbZOYRBaOiCJ8ko=", null));
        if (editableLLLFZ == null || (string = editableLLLFZ.toString()) == null) {
            string = "";
        }
        c767830UAb.LIZ = string;
        c767830UAb.LIZIZ = this.LJIJJ;
        c767830UAb.LIZJ = list;
        InterfaceC769000UEo interfaceC769000UEo = this.LJIILLIIL;
        if (interfaceC769000UEo != null && (listQr = interfaceC769000UEo.qr(this.LJIILJJIL)) != null) {
            liveEffect = (LiveEffect) C13LP.LJJJLL(listQr);
        }
        c767830UAb.LIZLLL = liveEffect;
        DataChannel dataChannel = this.LIZIZ;
        if (dataChannel != null) {
            dataChannel.LC0(StickerSearchDialogEvent.class, Boolean.TRUE);
        }
        C781710UlV c781710UlV = this.LJIILL;
        if (c781710UlV != null) {
            c781710UlV.LIZIZ();
        }
    }

    public final void LJIILJJIL(LiveEffect liveEffect, List<LiveEffect> list) {
        if (list.isEmpty()) {
            if (LJIIIZ()) {
                LJIILIIL();
                return;
            } else {
                LJIIL();
                return;
            }
        }
        LJIIIIZZ();
        C500260Jjc.LJIILIIL(this.LJIIJJI);
        C500260Jjc.LJIILIIL(this.LJIIL);
        C0U9I.LIZ(list);
        this.LIZJ.LLZLI(list, false, liveEffect, C0UD4.LIZIZ, this.LIZ.getContext());
        C500260Jjc.LLFFF(this.LJIIIZ);
    }

    public final void LJIILL(LiveEffect liveEffect, List<LiveEffect> list) {
        LJIIIIZZ();
        C500260Jjc.LJIILIIL(this.LJIIJJI);
        C500260Jjc.LJIILIIL(this.LJIIL);
        C0U9I.LIZJ(list);
        this.LIZJ.LLZLI(list, false, liveEffect, C0UD4.LIZIZ, this.LIZ.getContext());
        C500260Jjc.LLFFF(this.LJIIIZ);
    }

    public final void LJIILLIIL(LiveEffect liveEffect, List<LiveEffect> list) {
        if (list.isEmpty()) {
            if (LJIIIZ()) {
                LJIILIIL();
                return;
            } else {
                LJIIL();
                return;
            }
        }
        LJIIIIZZ();
        C500260Jjc.LJIILIIL(this.LJIIJJI);
        C500260Jjc.LJIILIIL(this.LJIIL);
        C0U9I.LIZIZ(list);
        this.LIZJ.LLZLI(list, false, liveEffect, C0UD4.LIZIZ, this.LIZ.getContext());
        C500260Jjc.LLFFF(this.LJIIIZ);
    }

    public C767850UAd(ViewGroup viewGroup, DataChannel dataChannel, InterfaceC769000UEo interfaceC769000UEo, StickerEffectViewModel stickerEffectViewModel, C0U9T c0u9t, GridLayoutManager gridLayoutManager) {
        super(viewGroup, dataChannel, R.layout.gfg, c0u9t, gridLayoutManager);
        this.LJIILLIIL = interfaceC769000UEo;
        this.LJIIZILJ = stickerEffectViewModel;
        LiveEditText liveEditText = (LiveEditText) this.LJIIIIZZ.findViewById(R.id.u7n);
        this.LJIJ = liveEditText;
        LiveIconView liveIconView = (LiveIconView) this.LJIIIIZZ.findViewById(R.id.e0l);
        this.LJIJI = liveIconView;
        new GridLayoutManager(5, 1, viewGroup.getContext(), false);
        this.LJIIIZ.setLayoutManager(gridLayoutManager);
        this.LJIIIZ.setAdapter(c0u9t);
        liveEditText.setText(stickerEffectViewModel.LLJILLL.LIZ);
        liveEditText.addTextChangedListener(new C786120Usc(this, 13));
        C500260Jjc.LJLIIIL(500L, liveIconView, new AwS591S0100000_12(this, 667));
        liveEditText.setOnTouchListener(new ATListenerS446S0100000_12(this, 17));
        C500260Jjc.LJLIIIL(500L, this.LJIIIIZZ.findViewById(R.id.uaj), new AwS591S0100000_12(this, 668));
        C786410Ut5.I7(new ACListenerS147S0100000_12(this, 283), this.LJIIL);
        this.LJIILL = new C781710UlV(1, 0.0d, this.LJIIIZ, new AwS626S0100000_12(this, 35));
        liveIconView.setIconTint(C20736316Cj.LIZIZ(R.attr.exr, viewGroup.getContext()));
        this.LJIIIZ.addOnScrollListener(new AsS39S0100000_12(this, 2));
        this.LJIL = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(stickerEffectViewModel), null, null, new C767960UAo(this, null), 3);
    }
}
