package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity;

import X.AbstractC20356314kz;
import X.C13BV;
import X.C1697810uHb;
import X.C20357914lF;
import X.C20361214lm;
import X.C20361314ln;
import X.C20424814w2;
import X.C259800zU;
import X.C497740JfY;
import X.C500260Jjc;
import X.C930480aJy;
import X.C946060aj6;
import X.InterfaceC20354714kj;
import X.InterfaceC979390bar;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.model.MultiGuestManageGuestOperationEvent;
import com.bytedance.android.livesdk.model.ShowMultiGuestAnchorListChannel;
import com.bytedance.android.livesdk.util.PlayEntityUtilKt;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS240S0300000_31;
import kotlin.jvm.internal.AwS275S0300000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class ManageGuestEntity extends AbstractC20356314kz {
    public final C20357914lF LLJJJJJIL = new C20357914lF("manage_guest", 0, 35600000, 0, C1697810uHb.LJIIJJI("check_mic_camera", "guest_new_joined", "guest_kick_out", "guest_count", "max_guest_count_reached", "never"), null, 20464);

    @Override // X.AbstractC20356314kz
    public final void LJJIL() {
        DataChannel dataChannel = this.LLJ;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void destroy() {
        C500260Jjc.LJJLIIIJILLIZJL(new AwS575S0100000_31(this, 160));
        super.destroy();
    }

    @Override // X.AbstractC20356314kz
    public final void LJJJJZI() {
        LJJIL();
        super.LJJJJZI();
    }

    @Override // X.AbstractC20356314kz
    public final C20357914lF LJJJIL() {
        return this.LLJJJJJIL;
    }

    @Override // X.AbstractC20356314kz
    public final void LJJLI(C20361214lm c20361214lm) {
        DataChannel dataChannel = this.LLJ;
        if (dataChannel != null) {
            dataChannel.CQ2(MultiGuestManageGuestOperationEvent.class, this, new AwS610S0100000_31(this, 62));
        }
    }

    @Override // X.AbstractC20356314kz
    public final C20361314ln LJJJLIIL(C20424814w2 c20424814w2, int i) {
        return new C20361314ln(C497740JfY.LJIJI(2131854125), C497740JfY.LJIJI(2131854125), R.attr.elp, R.attr.elp, C13BV.INSTANCE, null, i, null, false, null, 3968);
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final boolean LJIJJ(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, boolean z) {
        DataChannel dataChannel = this.LLJ;
        if (dataChannel == null) {
            return false;
        }
        C930480aJy c930480aJy = C930480aJy.LIZ;
        AwS275S0300000_31 awS275S0300000_31 = new AwS275S0300000_31(this, c20361214lm, interfaceC20354714kj, 10);
        c930480aJy.getClass();
        return C930480aJy.LJJJI(dataChannel, awS275S0300000_31, z);
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void LJJIIZ(C20361214lm c20361214lm, InterfaceC979390bar interfaceC979390bar, LifecycleOwner lifecycleOwner) {
        interfaceC979390bar.LJFF();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC20356314kz
    public final void LJJJLL(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, LifecycleOwner lifecycleOwner, String str, Long l, String str2, String str3) {
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = interfaceC20354714kj;
        if (lifecycleOwner != null) {
            PlayEntityUtilKt.LJIILL(lifecycleOwner, new AwS575S0100000_31(c259800zU, (C259800zU<InterfaceC20354714kj>) 161));
        }
        PlayEntityUtilKt.LJFF(this, c20361214lm, (InterfaceC20354714kj) c259800zU.element, lifecycleOwner);
        DataChannel dataChannel = this.LLJ;
        if (dataChannel != null) {
            dataChannel.zW(ShowMultiGuestAnchorListChannel.class, new C946060aj6(Unit.LIZ, str3, null, null, new AwS575S0100000_31(this, 162), new AwS240S0300000_31(this, (ManageGuestEntity) c20361214lm, (C20361214lm) c259800zU, (C259800zU<InterfaceC20354714kj>) 23), null, new AwS240S0300000_31(this, (ManageGuestEntity) c20361214lm, (C20361214lm) c259800zU, (C259800zU<InterfaceC20354714kj>) 24), false, this.LLIZ, null, null, 13980));
        }
    }
}
