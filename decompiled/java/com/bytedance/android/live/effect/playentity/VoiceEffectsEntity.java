package com.bytedance.android.live.effect.playentity;

import X.AbstractC20356314kz;
import X.C013C;
import X.C01GW;
import X.C0U40;
import X.C0U61;
import X.C0UA2;
import X.C1161920gLG;
import X.C13BV;
import X.C1697810uHb;
import X.C20352414kM;
import X.C20352614kO;
import X.C20357914lF;
import X.C20361214lm;
import X.C20361314ln;
import X.C20424814w2;
import X.C23250099c;
import X.C259800zU;
import X.C452501pT;
import X.C497740JfY;
import X.C500260Jjc;
import X.C748880TZe;
import X.C760850Tsx;
import X.C761440Ttu;
import X.C761850TuZ;
import X.C766010U3b;
import X.C766050U3f;
import X.C766270U4b;
import X.C768290UBv;
import X.C937280aUw;
import X.C946060aj6;
import X.EnumC20429014wi;
import X.EnumC771230UNd;
import X.EnumC773040UUc;
import X.InterfaceC20354714kj;
import X.InterfaceC760840Tsw;
import X.InterfaceC761540Tu4;
import X.InterfaceC979390bar;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.effect.playentity.VoiceEffectsEntity;
import com.bytedance.android.live.effect.playentity.VoiceEntityConfig;
import com.bytedance.android.live.effect.voiceeffect.VoiceEffectViewModel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.model.VoiceEffectChannel;
import com.bytedance.android.livesdk.util.PlayEntityUtilKt;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS126S0400000_31;
import kotlin.jvm.internal.AwS180S0400000_31;
import kotlin.jvm.internal.AwS240S0300000_31;
import kotlin.jvm.internal.AwS275S0300000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class VoiceEffectsEntity extends AbstractC20356314kz {
    public final C20357914lF LLJJJJJIL = new C20357914lF("voice_effects", 0, 39000003, 0, C1697810uHb.LJIIJJI("voice_effect_ongoing", "voice_effect_finish_setting", "voice_effect_finished", "never"), null, 20464);
    public final HashMap<String, String> LLJJJJLIIL = new HashMap<>();
    public final C20352414kM LLJJL = new InterfaceC760840Tsw() { // from class: X.14kM
        @Override // X.InterfaceC760840Tsw
        public final void onFail() {
        }

        @Override // X.InterfaceC760840Tsw
        public final void LIZ(LiveEffect liveEffect) {
            String resourceId;
            String name = null;
            if (liveEffect != null) {
                resourceId = liveEffect.getResourceId();
                name = liveEffect.getName();
            } else {
                resourceId = null;
            }
            VoiceEffectsEntity voiceEffectsEntity = this.LIZ;
            if (resourceId != null && name != null) {
                voiceEffectsEntity.LLJJJJLIIL.put(resourceId, name);
                voiceEffectsEntity.LJJJJJ(new C20361314ln(C497740JfY.LJIJI(2131842883), C497740JfY.LJIJI(2131842883), R.attr.d2b, R.attr.d2b, voiceEffectsEntity.LJJLIIIJ(resourceId), null, 0, null, false, null, 3968), voiceEffectsEntity.LLJJJJJIL.LIZLLL);
            }
        }
    };
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 127));

    @Override // X.AbstractC20356314kz
    public final void LJJIL() {
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).removeHostToolsCallback(EnumC773040UUc.VOICE_EFFECTS, (C20352614kO) this.LLJJLIIIJLLLLLLLZ.getValue());
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
            LJJLIIIJILLIZJL((VoiceEntityConfig) C937280aUw.LIZJ(VoiceEntityConfig.class, str, new VoiceEntityConfig(null)));
        }
    }

    @Override // X.AbstractC20356314kz
    public final boolean LJJJJLI(String str) {
        Boolean bool;
        DataChannel dataChannel = this.LLJ;
        if (dataChannel != null) {
            bool = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class);
        } else {
            bool = null;
        }
        if (C500260Jjc.LJJJI(bool)) {
            ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getHostToolsUtil();
            return C768290UBv.LJ(this.LLJ);
        }
        return true;
    }

    @Override // X.AbstractC20356314kz
    public final void LJJLI(C20361214lm c20361214lm) {
        if (!LJJLIIIJILLIZJL((VoiceEntityConfig) C937280aUw.LIZJ(VoiceEntityConfig.class, c20361214lm.LJI, new VoiceEntityConfig(null)))) {
            ((C20352614kO) this.LLJJLIIIJLLLLLLLZ.getValue()).LIZ = c20361214lm;
            ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).addHostToolsCallback(EnumC773040UUc.VOICE_EFFECTS, (C20352614kO) this.LLJJLIIIJLLLLLLLZ.getValue());
        }
    }

    public final List<String> LJJLIIIJ(String str) {
        String str2 = this.LLJJJJLIIL.get(str);
        if (str2 != null && str2.length() != 0) {
            return C1697810uHb.LJ(str2);
        }
        return C13BV.INSTANCE;
    }

    public final boolean LJJLIIIJILLIZJL(VoiceEntityConfig voiceEntityConfig) {
        String str;
        IBroadcastService iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
        EnumC773040UUc enumC773040UUc = EnumC773040UUc.VOICE_EFFECTS;
        EnumC771230UNd enumC771230UNd = iBroadcastService.getHostToolsCurrentStatus(enumC773040UUc).LIZ;
        String str2 = iBroadcastService.getHostToolsCurrentStatus(enumC773040UUc).LIZIZ;
        if (voiceEntityConfig != null && (str = voiceEntityConfig.resourceId) != null) {
            if (enumC771230UNd == EnumC771230UNd.APPLYING && Intrinsics.LJFF(str, str2)) {
                LJJIJ();
                return true;
            }
            return false;
        }
        if (enumC771230UNd == EnumC771230UNd.APPLYING) {
            LJJIJ();
            return true;
        }
        return false;
    }

    @Override // X.AbstractC20356314kz
    public final C20361314ln LJJJLIIL(C20424814w2 c20424814w2, int i) {
        VoiceEntityConfig voiceEntityConfig = (VoiceEntityConfig) C937280aUw.LIZJ(VoiceEntityConfig.class, c20424814w2.LJII, new VoiceEntityConfig(null));
        String str = voiceEntityConfig.resourceId;
        if (str != null && this.LLJJJJLIIL.get(str) == null) {
            C0U40 liveEffectDataProvider = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveEffectDataProvider();
            String str2 = voiceEntityConfig.resourceId;
            WeakReference weakReference = new WeakReference(this.LLJJL);
            liveEffectDataProvider.getClass();
            VoiceEffectViewModel voiceEffectViewModel = (VoiceEffectViewModel) C0U61.LIZ(new C761440Ttu(new C766010U3b(), new C766050U3f())).get(VoiceEffectViewModel.class);
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(voiceEffectViewModel), null, null, new C760850Tsx(voiceEffectViewModel, weakReference, str2, null), 3);
        }
        return new C20361314ln(C497740JfY.LJIJI(2131842883), C497740JfY.LJIJI(2131842883), R.attr.d2b, R.attr.d2b, LJJLIIIJ(voiceEntityConfig.resourceId), null, i, null, false, null, 3968);
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final boolean LJIJJ(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, boolean z) {
        C013C c013c = new C013C();
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).disableFunctionAccordingLevel(this.LLJ, AFwS276S0000000_31.get$arr$(13), new AwS126S0400000_31(this, c20361214lm, interfaceC20354714kj, c013c, 2), AFwS276S0000000_31.get$arr$(14), C497740JfY.LJIJI(2131842883), Boolean.FALSE, null, Boolean.valueOf(z));
        return c013c.element;
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void LJJIIZ(final C20361214lm c20361214lm, final InterfaceC979390bar interfaceC979390bar, LifecycleOwner lifecycleOwner) {
        FragmentManager fragmentManager;
        super.LJJIIZ(c20361214lm, interfaceC979390bar, lifecycleOwner);
        VoiceEntityConfig voiceEntityConfig = (VoiceEntityConfig) C937280aUw.LIZJ(VoiceEntityConfig.class, c20361214lm.LJI, new VoiceEntityConfig(null));
        try {
            DataChannel dataChannel = this.LLJ;
            if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
                ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).openSingleToolSelectorDialog(fragmentManager, new C0UA2(voiceEntityConfig.resourceId, EnumC20429014wi.VOICE_EFFECT, new InterfaceC761540Tu4() { // from class: X.14kN
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
                            String json = GsonProtectorUtils.toJson(gson, new VoiceEntityConfig(c20355014km.LIZ));
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC20356314kz
    public final void LJJJLL(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, LifecycleOwner lifecycleOwner, String str, Long l, String str2, String str3) {
        String str4;
        ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getHostToolsUtil();
        if (C500260Jjc.LJJIJIIJIL(Boolean.valueOf(C768290UBv.LIZJ(this.LLJ)))) {
            return;
        }
        boolean zUsingVoiceEffect = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).usingVoiceEffect();
        if (zUsingVoiceEffect) {
            C766270U4b.LIZLLL(2131854098);
        }
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = interfaceC20354714kj;
        if (lifecycleOwner != null) {
            PlayEntityUtilKt.LJIILL(lifecycleOwner, new AwS575S0100000_31(c259800zU, (C259800zU<InterfaceC20354714kj>) 128));
        }
        PlayEntityUtilKt.LJFF(this, c20361214lm, (InterfaceC20354714kj) c259800zU.element, lifecycleOwner);
        VoiceEntityConfig voiceEntityConfig = (VoiceEntityConfig) C937280aUw.LIZJ(VoiceEntityConfig.class, c20361214lm.LJI, new VoiceEntityConfig(null));
        C013C c013c = new C013C();
        c013c.element = true;
        DataChannel dataChannel = this.LLJ;
        if (dataChannel != null) {
            dataChannel.zW(VoiceEffectChannel.class, new C946060aj6(new C761850TuZ(voiceEntityConfig.resourceId, null), str3, new AwS180S0400000_31(this, (VoiceEffectsEntity) c20361214lm, (C20361214lm) c259800zU, (C259800zU<InterfaceC20354714kj>) c013c, (C013C) 4), null, new AwS575S0100000_31(this, 129), new AwS240S0300000_31(this, (VoiceEffectsEntity) c20361214lm, (C20361214lm) c259800zU, (C259800zU<InterfaceC20354714kj>) 19), null, new AwS240S0300000_31(this, (VoiceEffectsEntity) c20361214lm, (C20361214lm) c259800zU, (C259800zU<InterfaceC20354714kj>) 20), false, this.LLIZ, new AwS275S0300000_31(this, (VoiceEffectsEntity) c20361214lm, (C20361214lm) c259800zU, (C259800zU<InterfaceC20354714kj>) 6), null, 9880));
        }
        IEffectService iEffectService = (IEffectService) C1161920gLG.LIZJ(IEffectService.class);
        DataChannel dataChannel2 = this.LLJ;
        if (zUsingVoiceEffect) {
            str4 = "";
        } else {
            str4 = voiceEntityConfig.resourceId;
        }
        iEffectService.openVoiceEffectDialog(dataChannel2, str4);
    }
}
