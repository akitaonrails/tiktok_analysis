package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewStickerHelper;
import com.bytedance.android.livesdk.dataChannel.BeforeStickerSelectedEvent;
import com.bytedance.android.livesdk.dataChannel.StickerCancelChannel;
import com.bytedance.android.livesdk.dataChannel.StickerDialogShowChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.SupportBillboardOverlaySetting;
import com.bytedance.android.livesdk.model.LiveEffectAutoRestoreConfig;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.host.IHostCommerce;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0UEf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C768910UEf implements InterfaceC767730U9r {
    public final /* synthetic */ PreviewStickerHelper LIZ;

    @Override // X.InterfaceC767730U9r
    public final void onDestroy() {
        InterfaceC768930UEh interfaceC768930UEh = this.LIZ.LLJI;
        if (interfaceC768930UEh != null) {
            interfaceC768930UEh.onDestroy();
        }
    }

    public C768910UEf(PreviewStickerHelper previewStickerHelper) {
        C0UA9 ecEffectHelper;
        this.LIZ = previewStickerHelper;
        if (((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getEcEffectHelper() != null) {
            C0UBQ.LIZJ = new WeakReference<>(this);
        }
        ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveGoalEffectHelper();
        if (!C0UFI.LIZLLL() && (ecEffectHelper = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getEcEffectHelper()) != null) {
            C0UBQ c0ubq = (C0UBQ) ecEffectHelper;
            LiveEffectAutoRestoreConfig liveEffectAutoRestoreConfigLIZIZ = InterfaceC766480U4w.LJJIZ.LIZIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tryInitEffectWhenEnteringPreview currentSticker = ");
            sbLIZ.append(liveEffectAutoRestoreConfigLIZIZ);
            C20441214yg.LIZIZ("LiveEcEffectHelper", C2188811AlT.LIZIZ(sbLIZ));
            if (C500260Jjc.LJJIIZ(liveEffectAutoRestoreConfigLIZIZ.resourceId)) {
                c0ubq.LIZJ(liveEffectAutoRestoreConfigLIZIZ.resourceId, liveEffectAutoRestoreConfigLIZIZ.categoryKey, new AwS591S0100000_12(liveEffectAutoRestoreConfigLIZIZ, 692));
            }
        }
    }

    @Override // X.InterfaceC767730U9r
    public final void LJ(String str) {
        PreviewStickerHelper previewStickerHelper = this.LIZ;
        C0UJY c0ujy = previewStickerHelper.LLILZIL;
        InterfaceC768930UEh interfaceC768930UEh = previewStickerHelper.LLJI;
        if (interfaceC768930UEh != null) {
            interfaceC768930UEh.LJ(str);
        }
        c0ujy.LJ(str);
        C770220UJg c770220UJg = C770220UJg.LIZ;
        C770220UJg.LJ(C13LE.LIZ(StickerDialogShowChannel.class));
    }

    @Override // X.InterfaceC767730U9r
    public final void LJFF(LiveEffect liveEffect) {
        C768460UCm.LIZIZ().sr();
        if (SupportBillboardOverlaySetting.INSTANCE.enable() && ((IHostCommerce) C1161920gLG.LIZJ(IHostCommerce.class)).wg(liveEffect.getResourceId())) {
            ((C769050UEt) this.LIZ.LLJILJILJ.getValue()).LIZJ();
        }
        this.LIZ.LIZIZ(liveEffect);
        this.LIZ.LLIZ = null;
    }

    @Override // X.InterfaceC767730U9r
    public final void LJIIJJI(String str) {
        PreviewStickerHelper previewStickerHelper = this.LIZ;
        C0UJY c0ujy = previewStickerHelper.LLILZIL;
        InterfaceC768930UEh interfaceC768930UEh = previewStickerHelper.LLJI;
        if (interfaceC768930UEh != null) {
            interfaceC768930UEh.LJI(null, str);
        }
        c0ujy.LJIIJJI(str);
        C770220UJg c770220UJg = C770220UJg.LIZ;
        C770220UJg.LIZLLL(C13LE.LIZ(StickerDialogShowChannel.class));
    }

    @Override // X.InterfaceC767730U9r
    public final void LJIIL(LiveEffect liveEffect) {
        PreviewStickerHelper previewStickerHelper = this.LIZ;
        previewStickerHelper.LL.LC0(BeforeStickerSelectedEvent.class, new C0UCF(liveEffect, C0UD4.LIZIZ, previewStickerHelper.LLJILJIL, false));
    }

    @Override // X.InterfaceC767730U9r
    public final void LJIILJJIL(LiveEffect liveEffect) {
        Boolean boolValueOf;
        InterfaceC768930UEh interfaceC768930UEh;
        PreviewStickerHelper previewStickerHelper = this.LIZ;
        C0UJY c0ujy = previewStickerHelper.LLILZIL;
        String str = C0UD4.LIZIZ;
        c0ujy.LJIILLIIL(liveEffect, str);
        C768460UCm.LIZIZ().lr(str);
        InterfaceC768930UEh interfaceC768930UEh2 = previewStickerHelper.LLJI;
        if (interfaceC768930UEh2 != null) {
            boolValueOf = Boolean.valueOf(interfaceC768930UEh2.LJIIIIZZ(liveEffect));
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf) && (interfaceC768930UEh = previewStickerHelper.LLJI) != null) {
            interfaceC768930UEh.LIZJ();
        }
        View view = previewStickerHelper.LLILZ;
        if (view != null) {
            C500260Jjc.LLFFF(view);
        }
        C465520INi.LIZ.sw0("sticker");
        previewStickerHelper.LL.LC0(StickerCancelChannel.class, liveEffect);
        C1276840jKc.LIZ.getClass();
        C1276840jKc.LJIIL("");
        C1276840jKc.LJIILL("");
        C1276840jKc.LJIILIIL.put("effect_resource_id", "");
        C1276840jKc.LJIIJ(liveEffect, true);
    }

    @Override // X.InterfaceC767730U9r
    public final void LJIILL(ViewGroup viewGroup) {
        InterfaceC768930UEh interfaceC768930UEh = this.LIZ.LLJI;
        if (interfaceC768930UEh != null) {
            interfaceC768930UEh.LJIIIZ(viewGroup, false);
        }
    }

    @Override // X.InterfaceC767730U9r
    public final int LJIILIIL(String str, String str2) {
        C769020UEq.LIZ = str;
        C769020UEq.LIZIZ = str2;
        return this.LIZ.LLILZIL.LJJZ(str, str2);
    }

    @Override // X.InterfaceC767730U9r
    public final int LJIILLIIL(String str, String str2) {
        C0UCT c0uctLIZLLL;
        int iLJJZ = this.LIZ.LLILZIL.LJJZ(str, str2);
        InterfaceC769000UEo interfaceC769000UEoLIZIZ = C768460UCm.LIZIZ();
        interfaceC769000UEoLIZIZ.rr(str);
        interfaceC769000UEoLIZIZ.LIZIZ(str2);
        if (str2.length() == 0 && (c0uctLIZLLL = C0UF5.LIZLLL()) != null) {
            c0uctLIZLLL.LIZ = null;
        }
        return iLJJZ;
    }

    @Override // X.InterfaceC767730U9r
    public final void LJIIZILJ(String str, String str2) {
        this.LIZ.LLJILJIL = str;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_pm_live_sticker_tab_change");
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        c474500IjALIZ.LJJII(dataChannelGlobal.gg0(C931040aKs.class), "enter_from");
        c474500IjALIZ.LJJII(dataChannelGlobal.gg0(C930950aKj.class), "banner_id");
        c474500IjALIZ.LJJII(dataChannelGlobal.gg0(C930960aKk.class), "banner_from");
        c474500IjALIZ.LJIJJLI(this.LIZ.LL);
        c474500IjALIZ.LJJII(str2, "tab");
        c474500IjALIZ.LIZ();
    }
}
