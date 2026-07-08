package com.bytedance.android.live.effect.playentity;

import X.AbstractC20356314kz;
import X.C01GW;
import X.C0UIM;
import X.C1161920gLG;
import X.C13BV;
import X.C1697810uHb;
import X.C20351414kC;
import X.C20357914lF;
import X.C20361214lm;
import X.C20361314ln;
import X.C20424814w2;
import X.C259800zU;
import X.C452501pT;
import X.C497740JfY;
import X.C500260Jjc;
import X.C946060aj6;
import X.EnumC1779270wOz;
import X.EnumC771230UNd;
import X.EnumC773040UUc;
import X.InterfaceC20354714kj;
import X.InterfaceC979390bar;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreModelKt;
import com.bytedance.android.livesdk.model.EnhanceChannel;
import com.bytedance.android.livesdk.util.PlayEntityUtilKt;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS240S0300000_31;
import kotlin.jvm.internal.AwS275S0300000_31;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class EnhanceEntity extends AbstractC20356314kz {
    public final C20357914lF LLJJJJJIL = new C20357914lF("enhance", 0, 39000003, 0, C1697810uHb.LJIIJJI("enhance_ongoing", "enhance_finish_setting", "enhance_finished", "never"), null, 20464);
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 110));

    @Override // X.AbstractC20356314kz
    public final void LJJIL() {
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).removeHostToolsCallback(EnumC773040UUc.ENHANCE, (C20351414kC) this.LLJJJJLIIL.getValue());
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
        EnumC773040UUc enumC773040UUc = EnumC773040UUc.ENHANCE;
        if (iBroadcastService.getHostToolsCurrentStatus(enumC773040UUc).LIZ == EnumC771230UNd.APPLYING) {
            LJJIJ();
        } else {
            iBroadcastService.addHostToolsCallback(enumC773040UUc, (C20351414kC) this.LLJJJJLIIL.getValue());
        }
    }

    @Override // X.AbstractC20356314kz
    public final C20361314ln LJJJLIIL(C20424814w2 c20424814w2, int i) {
        boolean z;
        String strLJIJI = C497740JfY.LJIJI(C0UIM.LIZLLL());
        String strLJIJI2 = C497740JfY.LJIJI(C0UIM.LIZLLL());
        C13BV c13bv = C13BV.INSTANCE;
        EnumC1779270wOz enumC1779270wOz = EnumC1779270wOz.ATTR;
        if (!C500260Jjc.LJJIL() && !LinkCoreModelKt.currentUserIsAnchor()) {
            z = false;
        } else {
            z = true;
        }
        return new C20361314ln(strLJIJI, strLJIJI2, R.attr.d60, R.attr.d60, c13bv, null, i, enumC1779270wOz, z, null, 3584);
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void LJJIIZ(C20361214lm c20361214lm, InterfaceC979390bar interfaceC979390bar, LifecycleOwner lifecycleOwner) {
        super.LJJIIZ(c20361214lm, interfaceC979390bar, lifecycleOwner);
        interfaceC979390bar.LJFF();
    }

    @Override // X.AbstractC20356314kz
    public final void LJJJZ(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, LifecycleOwner lifecycleOwner, String str) {
        LJJLIIIJ(c20361214lm, interfaceC20354714kj, lifecycleOwner, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJLIIIJ(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, LifecycleOwner lifecycleOwner, String str) {
        Context contextLJIIIIZZ = C497740JfY.LJIIIIZZ();
        if (contextLJIIIIZZ == null) {
            PlayEntityUtilKt.LJI(this, c20361214lm, interfaceC20354714kj, null, null, 0L, 56);
            return;
        }
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = interfaceC20354714kj;
        if (lifecycleOwner != null) {
            PlayEntityUtilKt.LJIILL(lifecycleOwner, new AwS575S0100000_31(c259800zU, (C259800zU<InterfaceC20354714kj>) 111));
        }
        PlayEntityUtilKt.LJFF(this, c20361214lm, (InterfaceC20354714kj) c259800zU.element, lifecycleOwner);
        DataChannel dataChannel = this.LLJ;
        if (dataChannel != null) {
            dataChannel.zW(EnhanceChannel.class, new C946060aj6(null, str, null, null, new AwS575S0100000_31(this, 112), new AwS240S0300000_31(this, (EnhanceEntity) c20361214lm, (C20361214lm) c259800zU, (C259800zU<InterfaceC20354714kj>) 8), null, new AwS240S0300000_31(this, (EnhanceEntity) c20361214lm, (C20361214lm) c259800zU, (C259800zU<InterfaceC20354714kj>) 9), false, this.LLIZ, new AwS275S0300000_31(this, (EnhanceEntity) c20361214lm, (C20361214lm) c259800zU, (C259800zU<InterfaceC20354714kj>) 4), null, 9880));
        }
        ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).openEnhanceDialog(this.LLJ, contextLJIIIIZZ);
    }

    @Override // X.AbstractC20356314kz
    public final void LJJJLL(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, LifecycleOwner lifecycleOwner, String str, Long l, String str2, String str3) {
        LJJLIIIJ(c20361214lm, interfaceC20354714kj, lifecycleOwner, str3);
    }
}
