package X;

import android.view.ViewGroup;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.effect.api.MultiGuestStickerImageSelectedEvent;
import com.bytedance.android.live.effect.sticker.page.multiguest.BaseMultiGuestStickerView;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0U98, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U98 extends C0U99 {
    public final /* synthetic */ BaseMultiGuestStickerView LIZ;

    @Override // X.InterfaceC767730U9r
    public final int LJIILIIL(String str, String str2) {
        return -1;
    }

    public C0U98(BaseMultiGuestStickerView baseMultiGuestStickerView) {
        this.LIZ = baseMultiGuestStickerView;
    }

    @Override // X.InterfaceC767730U9r
    public final void LJFF(LiveEffect liveEffect) {
        C0UCH c0uch = this.LIZ.LLJI;
        if (c0uch != null && c0uch.LJIIIIZZ(liveEffect)) {
            C0UCH c0uch2 = this.LIZ.LLJI;
            if (c0uch2 != null) {
                c0uch2.LJFF(liveEffect);
                return;
            }
            return;
        }
        C0UCH c0uch3 = this.LIZ.LLJI;
        if (c0uch3 != null) {
            c0uch3.LIZJ();
        }
        C0UC5.LIZ.LIZJ(liveEffect, this.LIZ.LLILZLL, 0, false, null);
    }

    @Override // X.InterfaceC767730U9r
    public final void LJIIJJI(String str) {
        BaseMultiGuestStickerView baseMultiGuestStickerView = this.LIZ;
        C0UCH c0uch = baseMultiGuestStickerView.LLJI;
        if (c0uch != null) {
            c0uch.LJI(baseMultiGuestStickerView.LJIIIIZZ(), C0UD4.LJ);
        }
    }

    @Override // X.InterfaceC767730U9r
    public final void LJIILJJIL(LiveEffect liveEffect) {
        C0UCH c0uch;
        C0UCH c0uch2 = this.LIZ.LLJI;
        if (c0uch2 != null && c0uch2.LJIIIIZZ(liveEffect) && (c0uch = this.LIZ.LLJI) != null) {
            c0uch.LIZJ();
        }
        C0UC5 c0uc5 = C0UC5.LIZ;
        C0UC5.LIZJ = null;
        c0uc5.LJFF(this.LIZ.LLILZLL, this.LIZ.LJI());
    }

    @Override // X.InterfaceC767730U9r
    public final void LJIILL(ViewGroup viewGroup) {
        BaseMultiGuestStickerView baseMultiGuestStickerView = this.LIZ;
        C0UCH c0uch = baseMultiGuestStickerView.LLJI;
        if (c0uch != null) {
            c0uch.LJIIIZ(viewGroup, baseMultiGuestStickerView.LLILZIL);
        }
    }

    @Override // X.InterfaceC767730U9r
    public final int LJIILLIIL(String str, String str2) {
        long jLongValue;
        Long l;
        IBroadcastService iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
        DataChannel dataChannel = this.LIZ.LLILZLL;
        if (dataChannel != null && (l = (Long) dataChannel.gg0(C751340Tdc.class)) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        iBroadcastService.uploadStickerImage(str, str2, jLongValue);
        DataChannel dataChannel2 = this.LIZ.LLILZLL;
        if (dataChannel2 != null) {
            dataChannel2.LC0(MultiGuestStickerImageSelectedEvent.class, new C0UDD(str, str2));
        }
        InterfaceC1268640j7O interfaceC1268640j7O = this.LIZ.LLILLJJLI;
        if (interfaceC1268640j7O != null) {
            return interfaceC1268640j7O.setCustomEffect(str, str2);
        }
        return -1;
    }

    @Override // X.InterfaceC767730U9r
    public final void LJIIZILJ(String str, String str2) {
        C0UC5.LIZ.LJIIIZ(this.LIZ.LLILZLL, str2);
    }
}
