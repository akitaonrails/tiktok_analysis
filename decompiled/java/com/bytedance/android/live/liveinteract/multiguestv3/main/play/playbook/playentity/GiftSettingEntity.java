package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity;

import X.AbstractC20356314kz;
import X.C01GW;
import X.C13BV;
import X.C1697810uHb;
import X.C19322110iZ;
import X.C20357914lF;
import X.C20361214lm;
import X.C20361314ln;
import X.C20424814w2;
import X.C259800zU;
import X.C334801Rq;
import X.C452501pT;
import X.C497740JfY;
import X.C748880TZe;
import X.C916490ZxP;
import X.C922770a7X;
import X.C930480aJy;
import X.C935370aRr;
import X.C937280aUw;
import X.C941700ac4;
import X.C946060aj6;
import X.C979120baQ;
import X.InterfaceC20354714kj;
import X.InterfaceC941720ac6;
import X.InterfaceC979390bar;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.LinkMicAbilityManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookGiftSettingDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.util.PlayEntityUtilKt;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS224S0300000_15;
import kotlin.jvm.internal.AwS259S0300000_15;
import kotlin.jvm.internal.AwS293S0300000_15;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class GiftSettingEntity extends AbstractC20356314kz {
    public final C20357914lF LLJJJJJIL = new C20357914lF("gift_threshold_link", 0, 35600000, 0, C1697810uHb.LJIIJJI("priority_gift_ongoing", "priority_gift_finished", "never"), null, 20464);
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS559S0100000_15(this, 318));

    @Override // X.AbstractC20356314kz
    public final void LJJIL() {
        LinkMicAbilityManager.LJIIIZ.getClass();
        InterfaceC941720ac6 interfaceC941720ac6LIZIZ = C941700ac4.LIZIZ();
        if (interfaceC941720ac6LIZIZ != null) {
            interfaceC941720ac6LIZIZ.LJIIJJI((C979120baQ) this.LLJJJJLIIL.getValue());
        }
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
    public final boolean LJJJJLI(String str) {
        return C922770a7X.LIZ();
    }

    @Override // X.AbstractC20356314kz
    public final void LJJLI(C20361214lm c20361214lm) {
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ;
        MultiGuestDataHolder multiGuestDataHolderLIZJ = C916490ZxP.LIZJ();
        if (multiGuestDataHolderLIZJ != null && (multiLiveAnchorPanelSettingsLIZIZ = multiGuestDataHolderLIZJ.LIZIZ()) != null && multiLiveAnchorPanelSettingsLIZIZ.applierSortGiftScoreThreshold > 0) {
            LJJIJ();
            return;
        }
        LinkMicAbilityManager.LJIIIZ.getClass();
        InterfaceC941720ac6 interfaceC941720ac6LIZIZ = C941700ac4.LIZIZ();
        if (interfaceC941720ac6LIZIZ != null) {
            interfaceC941720ac6LIZIZ.LIZ((C979120baQ) this.LLJJJJLIIL.getValue());
        }
    }

    @Override // X.AbstractC20356314kz
    public final C20361314ln LJJJLIIL(C20424814w2 c20424814w2, int i) {
        return new C20361314ln(C497740JfY.LJIJI(2131843373), C497740JfY.LJIJI(2131843373), R.attr.dtb, R.attr.dtb, C13BV.INSTANCE, null, i, null, false, null, 3968);
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final boolean LJIJJ(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, boolean z) {
        DataChannel dataChannel = this.LLJ;
        if (dataChannel == null) {
            return false;
        }
        C930480aJy c930480aJy = C930480aJy.LIZ;
        AwS259S0300000_15 awS259S0300000_15 = new AwS259S0300000_15(this, c20361214lm, interfaceC20354714kj, 11);
        c930480aJy.getClass();
        return C930480aJy.LJJJI(dataChannel, awS259S0300000_15, z);
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void LJJIIZ(C20361214lm c20361214lm, InterfaceC979390bar interfaceC979390bar, LifecycleOwner lifecycleOwner) {
        super.LJJIIZ(c20361214lm, interfaceC979390bar, lifecycleOwner);
        interfaceC979390bar.LJFF();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC20356314kz
    public final void LJJJLL(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, LifecycleOwner lifecycleOwner, String str, Long l, String str2, String str3) {
        FragmentManager fragmentManager;
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = interfaceC20354714kj;
        if (lifecycleOwner != null) {
            PlaybookUtilKt.LJJII(lifecycleOwner, new AwS559S0100000_15(c259800zU, (C259800zU<InterfaceC20354714kj>) 319));
        }
        C946060aj6 c946060aj6 = new C946060aj6(C937280aUw.LIZJ(C935370aRr.class, c20361214lm.LJI, new C935370aRr(0)), str3, new AwS293S0300000_15(this, (GiftSettingEntity) c20361214lm, (C20361214lm) c259800zU, (C259800zU<InterfaceC20354714kj>) 6), new AwS224S0300000_15(this, (GiftSettingEntity) c20361214lm, (C20361214lm) c259800zU, (C259800zU<InterfaceC20354714kj>) 12), new AwS559S0100000_15(this, 320), new AwS224S0300000_15(this, (GiftSettingEntity) c20361214lm, (C20361214lm) c259800zU, (C259800zU<InterfaceC20354714kj>) 13), null, null, false, this.LLIZ, null, new C334801Rq(str, l, str2), 6032);
        PlayEntityUtilKt.LJFF(this, c20361214lm, (InterfaceC20354714kj) c259800zU.element, lifecycleOwner);
        DataChannel dataChannel = this.LLJ;
        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
            if (C19322110iZ.LJFF(fragmentManager, new PlaybookGiftSettingDialog(dataChannel, c946060aj6), this.LLJJJJJIL.LIZ, null, 0) > 0) {
                PlayEntityUtilKt.LJII(this, 2, c20361214lm, (InterfaceC20354714kj) c259800zU.element, true);
            } else {
                PlayEntityUtilKt.LJI(this, c20361214lm, (InterfaceC20354714kj) c259800zU.element, null, null, 0L, 56);
            }
        }
    }
}
