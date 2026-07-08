package com.bytedance.android.live.effect.playentity;

import X.AbstractC20356314kz;
import X.C013C;
import X.C01GW;
import X.C1161920gLG;
import X.C13BV;
import X.C1697810uHb;
import X.C20347814jc;
import X.C20357914lF;
import X.C20361214lm;
import X.C20361314ln;
import X.C20424814w2;
import X.C259800zU;
import X.C452501pT;
import X.C497740JfY;
import X.C946060aj6;
import X.EnumC771230UNd;
import X.EnumC773040UUc;
import X.InterfaceC20354714kj;
import X.InterfaceC979390bar;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdk.model.SoundEffectChannel;
import com.bytedance.android.livesdk.util.PlayEntityUtilKt;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS158S0400000_31;
import kotlin.jvm.internal.AwS240S0300000_31;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class SoundEffectsEntity extends AbstractC20356314kz {
    public final C20357914lF LLJJJJJIL = new C20357914lF("sound_effects", 0, 39000003, 0, C1697810uHb.LJIIJJI("sound_effect_ongoing", "never"), null, 20464);
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 119));

    @Override // X.AbstractC20356314kz
    public final void LJJIL() {
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).removeHostToolsCallback(EnumC773040UUc.SOUND_EFFECTS, (C20347814jc) this.LLJJJJLIIL.getValue());
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

    @Override // X.AbstractC20356314kz
    public final void LJJLI(C20361214lm c20361214lm) {
        IBroadcastService iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
        EnumC773040UUc enumC773040UUc = EnumC773040UUc.SOUND_EFFECTS;
        if (iBroadcastService.getHostToolsCurrentStatus(enumC773040UUc).LIZ == EnumC771230UNd.APPLYING) {
            LJJIJ();
        } else {
            ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).addHostToolsCallback(enumC773040UUc, (C20347814jc) this.LLJJJJLIIL.getValue());
        }
    }

    @Override // X.AbstractC20356314kz
    public final C20361314ln LJJJLIIL(C20424814w2 c20424814w2, int i) {
        return new C20361314ln(C497740JfY.LJIJI(2131844087), C497740JfY.LJIJI(2131844087), R.attr.e5o, R.attr.e5o, C13BV.INSTANCE, null, i, null, false, null, 3968);
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void LJJIIZ(C20361214lm c20361214lm, InterfaceC979390bar interfaceC979390bar, LifecycleOwner lifecycleOwner) {
        super.LJJIIZ(c20361214lm, interfaceC979390bar, lifecycleOwner);
        interfaceC979390bar.LJFF();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC20356314kz
    public final void LJJJLL(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, LifecycleOwner lifecycleOwner, String str, Long l, String str2, String str3) {
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = interfaceC20354714kj;
        if (lifecycleOwner != null) {
            PlayEntityUtilKt.LJIILL(lifecycleOwner, new AwS575S0100000_31(c259800zU, (C259800zU<InterfaceC20354714kj>) 120));
        }
        PlayEntityUtilKt.LJFF(this, c20361214lm, (InterfaceC20354714kj) c259800zU.element, lifecycleOwner);
        C013C c013c = new C013C();
        c013c.element = true;
        DataChannel dataChannel = this.LLJ;
        if (dataChannel != null) {
            dataChannel.zW(SoundEffectChannel.class, new C946060aj6(null, str3, null, null, new AwS575S0100000_31(this, 121), new AwS240S0300000_31(this, (SoundEffectsEntity) c20361214lm, (C20361214lm) c259800zU, (C259800zU<InterfaceC20354714kj>) 14), null, new AwS240S0300000_31(this, (SoundEffectsEntity) c20361214lm, (C20361214lm) c259800zU, (C259800zU<InterfaceC20354714kj>) 15), false, this.LLIZ, new AwS158S0400000_31(this, c20361214lm, interfaceC20354714kj, c013c, 0), null, 9880));
        }
        ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).openSoundEffectDialog(this.LLJ);
    }
}
