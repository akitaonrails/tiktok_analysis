package com.bytedance.android.live.effect.playentity;

import X.AbstractC20356314kz;
import X.C013C;
import X.C01GW;
import X.C0UA2;
import X.C0UFI;
import X.C1161920gLG;
import X.C13BV;
import X.C1697810uHb;
import X.C20353414kW;
import X.C20357914lF;
import X.C20361214lm;
import X.C20361314ln;
import X.C20365714mV;
import X.C20424814w2;
import X.C259800zU;
import X.C334801Rq;
import X.C452501pT;
import X.C497740JfY;
import X.C500260Jjc;
import X.C5180020c;
import X.C748880TZe;
import X.C755530TkN;
import X.C766270U4b;
import X.C769040UEs;
import X.C924810aAp;
import X.C937280aUw;
import X.C946060aj6;
import X.EnumC20429014wi;
import X.EnumC771230UNd;
import X.EnumC773040UUc;
import X.InterfaceC20354714kj;
import X.InterfaceC761540Tu4;
import X.InterfaceC953350aur;
import X.InterfaceC979390bar;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEffectBackgroundCoexistSetting;
import com.bytedance.android.livesdk.model.ShareBgSoloEffectChannel;
import com.bytedance.android.livesdk.model.SharedEffect;
import com.bytedance.android.livesdk.util.PlayEntityUtilKt;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS126S0400000_31;
import kotlin.jvm.internal.AwS180S0400000_31;
import kotlin.jvm.internal.AwS240S0300000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public final class BackgroundEffectEntity extends AbstractC20356314kz {
    public final C20357914lF LLJJJJJIL = new C20357914lF("background", 0, 35600000, 0, C1697810uHb.LJIIJJI("background_ongoing", "background_finish_setting", "background_finished", "never"), "background_finish_setting", 4080);
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(61));
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 107));

    @Override // X.AbstractC20356314kz
    public final void LJJIL() {
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).removeHostToolsCallback(EnumC773040UUc.BACKGROUND, (C20353414kW) this.LLJJL.getValue());
    }

    @Override // X.AbstractC20356314kz
    public final void LJJJJZI() {
        LJJIL();
        super.LJJJJZI();
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void destroy() {
        LJJIL();
        super.destroy();
    }

    @Override // X.AbstractC20356314kz
    public final C20357914lF LJJJIL() {
        return this.LLJJJJJIL;
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void LJIILLIIL(String str) {
        if (isRunning() && LJJJ()) {
            LJJLIIIJILLIZJL((SharedEffect) C937280aUw.LIZJ(SharedEffect.class, str, new SharedEffect("", "", null)));
        }
    }

    @Override // X.AbstractC20356314kz
    public final boolean LJJJJLI(String str) {
        if (!this.LLJIJIL) {
            return true;
        }
        if (!(!((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).rl2(C924810aAp.LJ().LJIILJJIL)) || !((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).o1()) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC20356314kz
    public final void LJJLI(C20361214lm c20361214lm) {
        if (!LJJLIIIJILLIZJL((SharedEffect) C937280aUw.LIZJ(SharedEffect.class, c20361214lm.LJI, new SharedEffect("", "", null)))) {
            ((C20353414kW) this.LLJJL.getValue()).LIZ = c20361214lm;
            ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).addHostToolsCallback(EnumC773040UUc.BACKGROUND, (C20353414kW) this.LLJJL.getValue());
        }
    }

    public final boolean LJJLIIIJ(Object obj) {
        if (!(obj instanceof String)) {
            obj = null;
        }
        LiveEffect currentBgEffect = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getCurrentBgEffect();
        if (currentBgEffect != null && !Intrinsics.LJFF(currentBgEffect.getResourceId(), obj)) {
            return true;
        }
        return false;
    }

    public final boolean LJJLIIIJILLIZJL(SharedEffect sharedEffect) {
        IBroadcastService iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
        EnumC773040UUc enumC773040UUc = EnumC773040UUc.BACKGROUND;
        EnumC771230UNd enumC771230UNd = iBroadcastService.getHostToolsCurrentStatus(enumC773040UUc).LIZ;
        String str = iBroadcastService.getHostToolsCurrentStatus(enumC773040UUc).LIZIZ;
        if (sharedEffect != null && sharedEffect.id.length() != 0) {
            if (enumC771230UNd == EnumC771230UNd.APPLYING && Intrinsics.LJFF(str, sharedEffect.id)) {
                LJJIJ();
                return true;
            }
        } else if (enumC771230UNd == EnumC771230UNd.APPLYING) {
            LJJIJ();
            return true;
        }
        return false;
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final boolean LJJIJL(C20361214lm c20361214lm, boolean z) {
        return C500260Jjc.LJJIIZ(((SharedEffect) C937280aUw.LIZJ(SharedEffect.class, c20361214lm.LJI, new SharedEffect("", "", null))).id);
    }

    @Override // X.AbstractC20356314kz
    public final C20361314ln LJJJLIIL(C20424814w2 c20424814w2, int i) {
        C20365714mV c20365714mV = null;
        String str = ((SharedEffect) C937280aUw.LIZJ(SharedEffect.class, c20424814w2.LJII, new SharedEffect("", "", null))).id;
        if (!a0.LJJJIL(str)) {
            c20365714mV = new C20365714mV(null, 0, 0.0f, new C5180020c(str, 8), str, null, 0.0f, 207);
        }
        return new C20361314ln(C497740JfY.LJIJI(2131842511), C497740JfY.LJIJI(2131842511), R.attr.dvp, R.attr.dvp, C13BV.INSTANCE, c20365714mV, 0, null, false, null, 4032);
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final boolean LJIJJ(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, boolean z) {
        C013C c013c = new C013C();
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).disableFunctionAccordingLevel(this.LLJ, AFwS276S0000000_31.get$arr$(8), new AwS126S0400000_31(this, c20361214lm, interfaceC20354714kj, c013c, 0), AFwS276S0000000_31.get$arr$(9), C497740JfY.LJIJI(2131842511), Boolean.FALSE, null, Boolean.valueOf(z));
        return c013c.element;
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void LJJIIZ(final C20361214lm c20361214lm, final InterfaceC979390bar interfaceC979390bar, LifecycleOwner lifecycleOwner) {
        FragmentManager fragmentManager;
        super.LJJIIZ(c20361214lm, interfaceC979390bar, lifecycleOwner);
        SharedEffect sharedEffect = (SharedEffect) C937280aUw.LIZJ(SharedEffect.class, c20361214lm.LJI, new SharedEffect("", "", null));
        try {
            DataChannel dataChannel = this.LLJ;
            if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
                ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).openSingleToolSelectorDialog(fragmentManager, new C0UA2(sharedEffect.id, EnumC20429014wi.BACKGROUND_EFFECT, new InterfaceC761540Tu4() { // from class: X.14kV
                    public boolean LIZ;

                    @Override // X.InterfaceC761540Tu4
                    public final void LIZ() {
                        InterfaceC979390bar interfaceC979390bar2 = interfaceC979390bar;
                        if (interfaceC979390bar2 != null) {
                            interfaceC979390bar2.LIZ(false);
                        }
                    }

                    @Override // X.InterfaceC761540Tu4
                    public final void LIZIZ() {
                        InterfaceC979390bar interfaceC979390bar2;
                        if (this.LIZ || (interfaceC979390bar2 = interfaceC979390bar) == null) {
                            return;
                        }
                        interfaceC979390bar2.LIZJ();
                    }

                    @Override // X.InterfaceC761540Tu4
                    public final void LIZJ(C20355014km c20355014km) {
                        if (c20355014km == null) {
                            InterfaceC979390bar interfaceC979390bar2 = interfaceC979390bar;
                            if (interfaceC979390bar2 != null) {
                                interfaceC979390bar2.LJI(c20361214lm.LIZIZ, null, !this.LIZ);
                            }
                        } else {
                            Gson gson = C19748512Ol.LIZJ;
                            this.getClass();
                            String str = c20355014km.LIZ;
                            String str2 = "";
                            if (str != null) {
                                str2 = str;
                            }
                            String json = GsonProtectorUtils.toJson(gson, new SharedEffect(str2, str2, null));
                            InterfaceC979390bar interfaceC979390bar3 = interfaceC979390bar;
                            if (interfaceC979390bar3 != null) {
                                interfaceC979390bar3.LJI(c20361214lm.LIZIZ, json, !this.LIZ);
                            }
                        }
                        this.LIZ = true;
                    }
                }));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            interfaceC979390bar.LIZLLL(c20361214lm.LIZIZ, "");
        }
    }

    @Override // X.AbstractC20356314kz
    public final void LJJIZ(C20361214lm c20361214lm, String str, C334801Rq c334801Rq, InterfaceC953350aur interfaceC953350aur, Context context) throws JSONException {
        SharedEffect sharedEffect = (SharedEffect) C937280aUw.LIZJ(SharedEffect.class, c20361214lm.LJI, new SharedEffect("", "", null));
        if (Intrinsics.LJFF(str, "liveCenter")) {
            ((C20353414kW) this.LLJJL.getValue()).LIZ = c20361214lm;
            ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).addHostToolsCallback(EnumC773040UUc.BACKGROUND, (C20353414kW) this.LLJJL.getValue());
        }
        IBroadcastService iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
        EnumC773040UUc enumC773040UUc = EnumC773040UUc.BACKGROUND;
        DataChannel dataChannel = this.LLJ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("resource_id", sharedEffect.id);
        iBroadcastService.openOrApplyHostToolsAbility(enumC773040UUc, dataChannel, context, jSONObject);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC20356314kz
    public final void LJJJLL(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, LifecycleOwner lifecycleOwner, String str, Long l, String str2, String str3) {
        Context contextLJIIIIZZ;
        ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveGameEffectHelper();
        if (C769040UEs.LIZJ()) {
            C766270U4b.LIZLLL(2131844624);
            return;
        }
        if (LiveEffectBackgroundCoexistSetting.INSTANCE.enable()) {
            ((IEffectService) this.LLJJJJLIIL.getValue()).getLiveGoalEffectHelper();
            if (C0UFI.LJIIIIZZ()) {
                C766270U4b.LIZLLL(2131842413);
                return;
            }
        }
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = interfaceC20354714kj;
        if (lifecycleOwner != null) {
            PlayEntityUtilKt.LJIILL(lifecycleOwner, new AwS575S0100000_31(c259800zU, (C259800zU<InterfaceC20354714kj>) 108));
            if (lifecycleOwner != null && (contextLJIIIIZZ = PlayEntityUtilKt.LJIIIIZZ(lifecycleOwner)) != null) {
                SharedEffect sharedEffect = (SharedEffect) C937280aUw.LIZJ(SharedEffect.class, c20361214lm.LJI, new SharedEffect("", "", null));
                if (LJJLIIIJ(sharedEffect.id)) {
                    C766270U4b.LIZLLL(2131854098);
                }
                PlayEntityUtilKt.LJFF(this, c20361214lm, (InterfaceC20354714kj) c259800zU.element, lifecycleOwner);
                C013C c013c = new C013C();
                c013c.element = true;
                DataChannel dataChannel = this.LLJ;
                if (dataChannel != null) {
                    dataChannel.zW(ShareBgSoloEffectChannel.class, new C946060aj6(sharedEffect, str3, new AwS180S0400000_31(this, (BackgroundEffectEntity) c20361214lm, (C20361214lm) c259800zU, (C259800zU<InterfaceC20354714kj>) c013c, (C013C) 0), null, new AwS575S0100000_31(this, 109), new AwS240S0300000_31(this, (BackgroundEffectEntity) c20361214lm, (C20361214lm) c259800zU, (C259800zU<InterfaceC20354714kj>) 5), new AwS240S0300000_31(this, (BackgroundEffectEntity) c20361214lm, (C20361214lm) c259800zU, (C259800zU<InterfaceC20354714kj>) 6), new AwS240S0300000_31(this, (BackgroundEffectEntity) c20361214lm, (C20361214lm) c259800zU, (C259800zU<InterfaceC20354714kj>) 7), false, this.LLIZ, null, null, 13848));
                }
                DataChannel dataChannel2 = this.LLJ;
                if (dataChannel2 != null) {
                    dataChannel2.SX0(C755530TkN.class, Boolean.FALSE);
                }
                ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).showBackgroundPanel(contextLJIIIIZZ, this.LLJ, null);
                return;
            }
        }
        PlayEntityUtilKt.LJI(this, c20361214lm, (InterfaceC20354714kj) c259800zU.element, null, null, 0L, 56);
    }
}
