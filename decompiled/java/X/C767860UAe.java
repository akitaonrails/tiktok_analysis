package X;

import Y.ACListenerS147S0100000_12;
import Y.AsS39S0100000_12;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.effect.sticker.data.MultiGuestStickerViewModel;
import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.android.live.effect.sticker.list.SpannedGridLayoutManager;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEffectLoadOptSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS626S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UAe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C767860UAe extends AbstractC767840UAc {
    public static boolean LJIL;
    public final StickerEffectViewModel LJIILLIIL;
    public final InterfaceC769000UEo LJIIZILJ;
    public final C01GW LJIJ;
    public AnonymousClass0956 LJIJI;
    public volatile long LJIJJ;
    public long LJIJJLI;

    @Override // X.AbstractC767840UAc
    public final void LIZIZ() {
        C0UBH c0ubh;
        C0UBH c0ubh2 = this.LJI;
        String str = c0ubh2 != null ? c0ubh2.LIZIZ : null;
        if (str != null && str.length() != 0 && (c0ubh = this.LJI) != null) {
            LJIIIZ(c0ubh, this.LJIILIIL);
        }
        if (LJIL && (!this.LIZJ.LL.isEmpty())) {
            this.LIZLLL.scrollToPosition(LJIIJ());
            LJIL = false;
        }
    }

    @Override // X.AbstractC767840UAc
    public final void LIZJ() {
        AnonymousClass0956 anonymousClass0956 = this.LJIJI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }

    @Override // X.AbstractC767840UAc
    public final void LIZLLL() {
        String str;
        C0UBH c0ubh = this.LJI;
        if (c0ubh != null && (str = c0ubh.LIZIZ) != null && str.length() != 0) {
            LJIIIZ(this.LJI, this.LJIILIIL);
        }
        super.LIZLLL();
    }

    public final int LJIIJ() {
        List<LiveEffect> listQr;
        InterfaceC769000UEo interfaceC769000UEo = this.LJIIZILJ;
        int iIndexOf = ((ArrayList) this.LIZJ.LL).indexOf((interfaceC769000UEo == null || (listQr = interfaceC769000UEo.qr(this.LJIILJJIL)) == null) ? null : C13LP.LJJJLL(listQr));
        if (iIndexOf == -1) {
            return 0;
        }
        return iIndexOf;
    }

    public final void LJIIJJI() {
        if (((ArrayList) this.LIZJ.LL).isEmpty()) {
            C500260Jjc.LLFFF(this.LJIIL);
            C500260Jjc.LJIILIIL(this.LJIIJ);
            C500260Jjc.LJIILIIL(this.LJIIJJI);
            LJIIIIZZ();
            C500260Jjc.LJIILIIL(this.LJIIIZ);
        }
    }

    public final void LJIIIZ(C0UBH c0ubh, boolean z) {
        if (c0ubh == null || System.currentTimeMillis() - this.LJIJJLI < 1000) {
            return;
        }
        this.LJIJJLI = System.currentTimeMillis();
        if (c0ubh.LIZIZ.length() == 0) {
            LJIIJJI();
            return;
        }
        if (Intrinsics.LJFF(this.LJIILJJIL, C0UD4.LJ) && z) {
            List<LiveEffect> value = ((MultiGuestStickerViewModel) this.LJIJ.getValue()).LLILLJJLI.getValue();
            if (value != null) {
                LJIIL(value, c0ubh, true, false);
                return;
            }
            return;
        }
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this.LJIILLIIL), null, null, new C767930UAl(this, c0ubh, null), 3);
    }

    public C767860UAe(ViewGroup viewGroup, InterfaceC769000UEo interfaceC769000UEo, StickerEffectViewModel stickerEffectViewModel, DataChannel dataChannel) {
        C0U9B c0u9b = new C0U9B(dataChannel, stickerEffectViewModel);
        SpannedGridLayoutManager spannedGridLayoutManager = new SpannedGridLayoutManager(EnumC769180UFg.VERTICAL);
        super(viewGroup, dataChannel, R.layout.gff, c0u9b, spannedGridLayoutManager);
        this.LJIILLIIL = stickerEffectViewModel;
        this.LJIIZILJ = interfaceC769000UEo;
        this.LJIJ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(229));
        spannedGridLayoutManager.LLJI = new C0UBG(new AwS591S0100000_12(this, 676));
        spannedGridLayoutManager.requestLayout();
        spannedGridLayoutManager.LLJ = true;
        C786410Ut5.I7(new ACListenerS147S0100000_12(this, 284), this.LJIIL);
        this.LJIJI = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(stickerEffectViewModel), null, null, new C767870UAf(this, null), 3);
        C500260Jjc.LLFFF(this.LJIIJJI);
        LJII();
        C500260Jjc.LJIILIIL(this.LJIIL);
        C500260Jjc.LJIILIIL(this.LJIIIZ);
        C500260Jjc.LJIILIIL(this.LJIIJ);
    }

    @Override // X.AbstractC767840UAc
    public final void LJI(C0UBH c0ubh, boolean z, String str, AwS626S0100000_12 awS626S0100000_12) {
        String str2;
        String str3;
        super.LJI(c0ubh, z, str, awS626S0100000_12);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZJ.getItemCount());
        sbLIZ.append(", ");
        C0UBH c0ubh2 = this.LJI;
        if (c0ubh2 == null || (str2 = c0ubh2.LIZIZ) == null) {
            str2 = "";
        }
        sbLIZ.append(str2);
        C20441214yg.LIZIZ("EffectMonitor#loadmore", C2188811AlT.LIZIZ(sbLIZ));
        if (LiveEffectLoadOptSetting.INSTANCE.allowPageLoad()) {
            C0UBH c0ubh3 = this.LJI;
            if (c0ubh3 != null) {
                str3 = c0ubh3.LIZIZ;
            } else {
                str3 = null;
            }
            if (Intrinsics.LJFF(str3, "trending")) {
                this.LJIIIZ.clearOnScrollListeners();
                this.LJIIIZ.addOnScrollListener(new AsS39S0100000_12(this, 3));
            }
        }
    }

    public final void LJIIL(List<? extends LiveEffect> list, C0UBH c0ubh, boolean z, boolean z2) {
        LiveEffect liveEffect;
        LiveEffect liveEffect2;
        int iIndexOf;
        List<LiveEffect> listQr;
        String str;
        if (list.isEmpty()) {
            C500260Jjc.LLFFF(this.LJIIJ);
            C500260Jjc.LJIILIIL(this.LJIIJJI);
            LJIIIIZZ();
            C500260Jjc.LJIILIIL(this.LJIIL);
            C500260Jjc.LJIILIIL(this.LJIIIZ);
            return;
        }
        C500260Jjc.LLFFF(this.LJIIIZ);
        C500260Jjc.LJIILIIL(this.LJIIJ);
        C500260Jjc.LJIILIIL(this.LJIIJJI);
        C500260Jjc.LJIILIIL(this.LJIIL);
        Iterator<? extends LiveEffect> it2 = list.iterator();
        while (true) {
            liveEffect = null;
            String str2 = null;
            if (!it2.hasNext()) {
                break;
            }
            LiveEffect next = it2.next();
            if (c0ubh != null) {
                str = c0ubh.LIZ;
            } else {
                str = null;
            }
            next.LLJLIL(str);
            if (c0ubh != null) {
                str2 = c0ubh.LIZIZ;
            }
            next.LJIIJJI(str2);
        }
        C0U9B c0u9b = this.LIZJ;
        InterfaceC769000UEo interfaceC769000UEo = this.LJIIZILJ;
        if (interfaceC769000UEo != null && (listQr = interfaceC769000UEo.qr(this.LJIILJJIL)) != null) {
            liveEffect2 = (LiveEffect) C13LP.LJJJLL(listQr);
        } else {
            liveEffect2 = null;
        }
        c0u9b.LLZLI(list, z, liveEffect2, this.LJIILJJIL, this.LIZ.getContext());
        if (LJIL) {
            this.LIZLLL.scrollToPosition(LJIIJ());
            LJIL = false;
            return;
        }
        C767640U9i c767640U9iP71 = C767630U9h.LL.p71("");
        if (c767640U9iP71 != null) {
            liveEffect = c767640U9iP71.LIZ;
        }
        if (this.LJIILIIL) {
            ((ArrayList) this.LIZJ.LL).indexOf(liveEffect);
        }
        if (C500260Jjc.LJIL() && this.LJIILIIL && ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).w9() && liveEffect != null && (iIndexOf = C767630U9h.LJI("").indexOf(liveEffect)) > 0) {
            this.LIZLLL.scrollToPosition(iIndexOf);
        } else {
            if (!z || !z2) {
                return;
            }
            this.LIZLLL.scrollToPosition(1);
        }
    }
}
