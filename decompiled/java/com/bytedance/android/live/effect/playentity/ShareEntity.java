package com.bytedance.android.live.effect.playentity;

import X.AbstractC20356314kz;
import X.C1161920gLG;
import X.C13BV;
import X.C1697810uHb;
import X.C20357914lF;
import X.C20361214lm;
import X.C20361314ln;
import X.C20424814w2;
import X.C497740JfY;
import X.C771680UOw;
import X.InterfaceC20354714kj;
import X.InterfaceC481170Itv;
import X.InterfaceC771710UOz;
import X.InterfaceC979390bar;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.OpenSharePanelChannel;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.livesdk.dataChannel.ShareJoinInGoodyBag;
import com.bytedance.android.livesdk.livesetting.linkmic.PlaybookEntitiesIterationEnabledSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.util.PlayEntityUtilKt;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class ShareEntity extends AbstractC20356314kz {
    public final C20357914lF LLJJJJJIL = new C20357914lF("share", 0, 44500000, 0, C1697810uHb.LJIIJJI("share_panel_open", "live_shared", "never"), null, 28656);

    @Override // X.AbstractC20356314kz
    public final C20357914lF LJJJIL() {
        return this.LLJJJJJIL;
    }

    @Override // X.AbstractC20356314kz
    public final boolean LJJJJJL(String str) {
        return PlaybookEntitiesIterationEnabledSetting.INSTANCE.getValue();
    }

    @Override // X.AbstractC20356314kz
    public final void LJJLI(C20361214lm c20361214lm) {
        DataChannel dataChannel = this.LLJ;
        if (dataChannel != null) {
            dataChannel.BQ2(LJJJJ(), ShareJoinInGoodyBag.class, new AwS610S0100000_31(this, 23));
        }
    }

    @Override // X.AbstractC20356314kz
    public final C20361314ln LJJJLIIL(C20424814w2 c20424814w2, int i) {
        boolean z;
        int i2 = i;
        String strLJIJI = C497740JfY.LJIJI(2131842930);
        String strLJIJI2 = C497740JfY.LJIJI(2131842930);
        C13BV c13bv = C13BV.INSTANCE;
        if (UserService.getInstance().user().LJIJJLI().getSecret() == 1) {
            i2 = 4;
        }
        if (!this.LLJILJILJ && !this.LLJIJIL) {
            z = false;
        } else {
            z = true;
        }
        return new C20361314ln(strLJIJI, strLJIJI2, R.attr.cre, R.attr.cre, c13bv, null, i2, null, z, null, 3744);
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void LJJIIZ(C20361214lm c20361214lm, InterfaceC979390bar interfaceC979390bar, LifecycleOwner lifecycleOwner) {
        super.LJJIIZ(c20361214lm, interfaceC979390bar, lifecycleOwner);
        interfaceC979390bar.LJFF();
    }

    @Override // X.AbstractC20356314kz
    public final void LJJJZ(final C20361214lm c20361214lm, final InterfaceC20354714kj interfaceC20354714kj, LifecycleOwner lifecycleOwner, String str) {
        InterfaceC771710UOz broadcastKit = ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getBroadcastKit();
        InterfaceC481170Itv interfaceC481170Itv = new InterfaceC481170Itv() { // from class: X.14kd
            @Override // X.InterfaceC481170Itv
            public final void LIZ() {
                PlayEntityUtilKt.LJII(this.LIZ, 2, c20361214lm, interfaceC20354714kj, true);
            }

            @Override // X.InterfaceC481170Itv
            public final void LIZIZ() {
                PlayEntityUtilKt.LJI(this.LIZ, c20361214lm, interfaceC20354714kj, null, null, 0L, 56);
            }

            @Override // X.InterfaceC481170Itv
            public final void LIZJ() {
                PlayEntityUtilKt.LJ(this.LIZ, 2, c20361214lm, interfaceC20354714kj);
            }
        };
        broadcastKit.getClass();
        DataChannel dataChannel = C771680UOw.LIZIZ;
        if (dataChannel != null) {
            dataChannel.zW(OpenSharePanelChannel.class, interfaceC481170Itv);
        }
    }

    @Override // X.AbstractC20356314kz
    public final void LJJJLL(final C20361214lm c20361214lm, final InterfaceC20354714kj interfaceC20354714kj, LifecycleOwner lifecycleOwner, String str, Long l, String str2, String str3) {
        InterfaceC771710UOz broadcastKit = ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getBroadcastKit();
        InterfaceC481170Itv interfaceC481170Itv = new InterfaceC481170Itv() { // from class: X.14kc
            @Override // X.InterfaceC481170Itv
            public final void LIZ() {
                PlayEntityUtilKt.LJII(this.LIZ, 2, c20361214lm, interfaceC20354714kj, true);
            }

            @Override // X.InterfaceC481170Itv
            public final void LIZIZ() {
                PlayEntityUtilKt.LJI(this.LIZ, c20361214lm, interfaceC20354714kj, null, null, 0L, 56);
            }

            @Override // X.InterfaceC481170Itv
            public final void LIZJ() {
                PlayEntityUtilKt.LJ(this.LIZ, 2, c20361214lm, interfaceC20354714kj);
            }
        };
        broadcastKit.getClass();
        DataChannel dataChannel = C771680UOw.LIZIZ;
        if (dataChannel != null) {
            dataChannel.zW(OpenSharePanelChannel.class, interfaceC481170Itv);
        }
    }
}
