package X;

import Y.ACListenerS147S0100000_12;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.GridLayoutManager;
import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS626S0100000_12;

/* JADX INFO: renamed from: X.0UAm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C767940UAm extends AbstractC767840UAc {
    public final StickerEffectViewModel LJIILLIIL;
    public final InterfaceC769000UEo LJIIZILJ;

    @Override // X.AbstractC767840UAc
    public final void LIZIZ() {
        List<LiveEffect> listQr;
        LiveEffect liveEffect = null;
        if (this.LJII) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this.LJIILLIIL), null, null, new C768000UAs(this, null), 3);
            return;
        }
        C0U9B c0u9b = this.LIZJ;
        InterfaceC769000UEo interfaceC769000UEo = this.LJIIZILJ;
        if (interfaceC769000UEo != null && (listQr = interfaceC769000UEo.qr(this.LJIILJJIL)) != null) {
            liveEffect = (LiveEffect) C13LP.LJJJLL(listQr);
        }
        c0u9b.LLZIL(liveEffect);
    }

    @Override // X.AbstractC767840UAc
    public final void LIZLLL() {
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this.LJIILLIIL), null, null, new C768010UAt(this, null), 3);
        super.LIZLLL();
    }

    public C767940UAm(ViewGroup viewGroup, InterfaceC769000UEo interfaceC769000UEo, StickerEffectViewModel stickerEffectViewModel, DataChannel dataChannel) {
        super(viewGroup, dataChannel, R.layout.gff, new C0U9B(dataChannel, stickerEffectViewModel), new GridLayoutManager(viewGroup.getContext(), 5));
        this.LJIILLIIL = stickerEffectViewModel;
        this.LJIIZILJ = interfaceC769000UEo;
        C786410Ut5.I7(new ACListenerS147S0100000_12(this, 281), this.LJIIL);
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(stickerEffectViewModel), null, null, new C767950UAn(this, null), 3);
    }

    @Override // X.AbstractC767840UAc
    public final void LJI(C0UBH c0ubh, boolean z, String str, AwS626S0100000_12 awS626S0100000_12) {
        LiveEffect liveEffect;
        List<LiveEffect> listQr;
        super.LJI(c0ubh, z, str, awS626S0100000_12);
        C0U9B c0u9b = this.LIZJ;
        InterfaceC769000UEo interfaceC769000UEo = this.LJIIZILJ;
        if (interfaceC769000UEo != null && (listQr = interfaceC769000UEo.qr(str)) != null) {
            liveEffect = (LiveEffect) C13LP.LJJJLL(listQr);
        } else {
            liveEffect = null;
        }
        c0u9b.LLZIL(liveEffect);
    }
}
