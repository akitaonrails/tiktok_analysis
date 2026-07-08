package X;

import Y.ARunnableS17S1200000_12;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftStickerMonitorSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UIO, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UIO implements InterfaceC1137650fi7 {
    public final String LIZ;
    public final boolean LIZIZ;
    public InterfaceC769940UIe LIZJ;
    public InterfaceC1268640j7O LIZLLL;

    @Override // X.InterfaceC1137650fi7
    public final InterfaceC1268640j7O getFilterManager() {
        return this.LIZLLL;
    }

    public static String LIZLLL(LiveEffect liveEffect) {
        String panel;
        if (liveEffect == null || (panel = liveEffect.getPanel()) == null || panel.length() == 0) {
            return "effect_gift";
        }
        return panel;
    }

    @Override // X.InterfaceC1137650fi7
    public final void LIZ(LiveEffect liveEffect) {
        long effectId;
        boolean zLLLF = liveEffect.LLLF();
        InterfaceC769000UEo interfaceC769000UEoBaseComposerManager = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).baseComposerManager();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("gift_sticker_v2_");
        sbLIZ.append(this.LIZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("finishPlayStickerGift, release channel, panel = ");
        sbLIZ2.append(liveEffect.getPanel());
        sbLIZ2.append(" , isFilterManagerLocalTemp=");
        sbLIZ2.append(false);
        sbLIZ2.append(", liveEffect = ");
        sbLIZ2.append(Integer.valueOf(liveEffect.hashCode()));
        sbLIZ2.append(", enableReplay=");
        sbLIZ2.append(zLLLF);
        sbLIZ2.append(", baseComposer=");
        sbLIZ2.append(interfaceC769000UEoBaseComposerManager.hashCode());
        C20441214yg.LJIIIZ(strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2));
        if (Intrinsics.LJFF("effect_gift_music", LIZLLL(liveEffect))) {
            interfaceC769000UEoBaseComposerManager.setRenderCacheString("music_res_dir", "");
        }
        if (zLLLF) {
            InterfaceC1268640j7O interfaceC1268640j7O = this.LIZLLL;
            if (interfaceC1268640j7O != null) {
                try {
                    n nVar = new n();
                    nVar.LJJIIJ("effect_id", String.valueOf(liveEffect.getEffectId()));
                    nVar.LJJIIJ("path", liveEffect.getFilePath());
                    nVar.LJJIIJ("msg_id", String.valueOf(liveEffect.getMsgId()));
                    int iSendEffectMsg = interfaceC1268640j7O.sendEffectMsg(57, 3, 1, nVar.toString());
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("sendReplayHideGiftEffectMsg, commonArg=");
                    sbLIZ3.append(nVar);
                    sbLIZ3.append(", result=");
                    sbLIZ3.append(iSendEffectMsg);
                    C20441214yg.LIZIZ("StickerGiftEffectSDKHelper", C2188811AlT.LIZIZ(sbLIZ3));
                } catch (IllegalStateException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } else {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("sendReplayHideGiftEffectMsg, filterManager = ");
                sbLIZ4.append(interfaceC1268640j7O);
                sbLIZ4.append(", liveEffect=");
                sbLIZ4.append(liveEffect);
                C20441214yg.LJ("StickerGiftEffectSDKHelper", C2188811AlT.LIZIZ(sbLIZ4));
            }
        } else {
            interfaceC769000UEoBaseComposerManager.lr(LIZLLL(liveEffect));
        }
        LiveGiftStickerMonitorSetting liveGiftStickerMonitorSetting = LiveGiftStickerMonitorSetting.INSTANCE;
        if (liveGiftStickerMonitorSetting.isEnabled() && liveGiftStickerMonitorSetting.isLoadOnGift()) {
            C0UIT.LIZ.getClass();
            List<LiveEffect> listLJ = C0UIQ.LIZ().LJ("gift_monitor");
            if (!listLJ.isEmpty()) {
                LiveEffect liveEffect2 = (LiveEffect) C13LP.LJJJLZIJ(0, listLJ);
                if (liveEffect2 != null) {
                    effectId = liveEffect2.getEffectId();
                } else {
                    effectId = -1;
                }
                C0UIQ.LIZ().lr("gift_monitor");
                C474500IjA c474500IjALIZ = C0IJT.LIZ("gift_sticker_monitor_effect_remove");
                C0UIT.LIZ(c474500IjALIZ, effectId);
                c474500IjALIZ.LIZ();
            }
        }
    }

    @Override // X.InterfaceC1137650fi7
    public final void LIZIZ(LiveEffect liveEffect) {
        Integer numValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EffectMonitor#gift_");
        sbLIZ.append(this.LIZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("liveEffect = ");
        String panel = null;
        if (liveEffect != null) {
            numValueOf = Integer.valueOf(liveEffect.hashCode());
        } else {
            numValueOf = null;
        }
        sbLIZ2.append(numValueOf);
        sbLIZ2.append(", panel=");
        if (liveEffect != null) {
            panel = liveEffect.getPanel();
        }
        sbLIZ2.append(panel);
        C20441214yg.LIZIZ(strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2));
        if (liveEffect == null) {
            return;
        }
        ARunnableS17S1200000_12 aRunnableS17S1200000_12 = new ARunnableS17S1200000_12(this, liveEffect, LIZLLL(liveEffect), 7);
        LiveGiftStickerMonitorSetting liveGiftStickerMonitorSetting = LiveGiftStickerMonitorSetting.INSTANCE;
        if (liveGiftStickerMonitorSetting.isEnabled() && liveGiftStickerMonitorSetting.isLoadOnGift()) {
            C0UIT.LIZ.getClass();
            C0UIT.LIZIZ(aRunnableS17S1200000_12, true);
        } else {
            aRunnableS17S1200000_12.run();
        }
    }

    @Override // X.InterfaceC1137650fi7
    public final boolean LIZJ(LiveEffect liveEffect) {
        return C0UIQ.LIZ().LJJIIJZLJL(liveEffect, LIZLLL(liveEffect));
    }

    public C0UIO(String str, boolean z) {
        this.LIZ = str;
        this.LIZIZ = z;
    }

    public final void LJ(String str, String str2) {
        InterfaceC1268640j7O interfaceC1268640j7O;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("gift_sticker_v2_EffectMonitor#gift_");
        sbLIZ.append(this.LIZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("set custom sticker image, renderCacheKey=");
        sbLIZ2.append(str);
        sbLIZ2.append(", imagePath=");
        sbLIZ2.append(str2);
        C20441214yg.LIZIZ(strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2));
        if (str != null && str.length() != 0 && str2 != null && str2.length() != 0 && (interfaceC1268640j7O = this.LIZLLL) != null) {
            interfaceC1268640j7O.setCustomEffect(str, str2);
        }
    }
}
