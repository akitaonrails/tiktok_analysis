package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity;

import X.AbstractC20356314kz;
import X.C01FQ;
import X.C1161920gLG;
import X.C13BV;
import X.C1697810uHb;
import X.C19322110iZ;
import X.C20357914lF;
import X.C20361214lm;
import X.C20361314ln;
import X.C20424814w2;
import X.C497740JfY;
import X.C500260Jjc;
import X.C748880TZe;
import X.C766270U4b;
import X.C915980Zwa;
import X.C924230a9t;
import X.C930480aJy;
import X.C930540aK4;
import X.C945450ai7;
import X.EnumC945500aiC;
import X.EnumC979240bac;
import X.InterfaceC20354714kj;
import X.InterfaceC302601Fg;
import X.InterfaceC954180awC;
import X.InterfaceC979390bar;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookSelectionDialog;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowConfigSetting;
import com.bytedance.android.livesdk.model.MultiGuestExpandEvent;
import com.bytedance.android.livesdk.util.PlayEntityUtilKt;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS224S0300000_15;
import kotlin.jvm.internal.AwS22S2200000_15;
import kotlin.jvm.internal.AwS259S0300000_15;
import kotlin.jvm.internal.AwS293S0300000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class ExpandEntity extends AbstractC20356314kz {
    public final C20357914lF LLJJJJJIL = new C20357914lF("enlarge_grid", 0, 35600000, 0, C1697810uHb.LJIIJJI("expand_ongoing", "expand_finished", "never"), null, 20464);
    public C20361214lm LLJJJJLIIL;
    public InterfaceC20354714kj LLJJL;

    @Override // X.AbstractC20356314kz
    public final void LJJIL() {
        DataChannel dataChannel = this.LLJ;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void destroy() {
        C500260Jjc.LJJLIIIJILLIZJL(new AwS559S0100000_15(this, 317));
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
    public final boolean LJJJJLI(String str) {
        return true ^ C924230a9t.LIZ(1);
    }

    @Override // X.AbstractC20356314kz
    public final void LJJLI(C20361214lm c20361214lm) {
        DataChannel dataChannel = this.LLJ;
        if (dataChannel != null) {
            dataChannel.CQ2(MultiGuestExpandEvent.class, this, new AwS594S0100000_15(this, 399));
        }
    }

    @Override // X.AbstractC20356314kz
    public final C20361314ln LJJJLIIL(C20424814w2 c20424814w2, int i) {
        return new C20361314ln(C497740JfY.LJIJI(2131854129), C497740JfY.LJIJI(2131854129), R.attr.dst, R.attr.dst, C13BV.INSTANCE, null, i, null, false, null, 3968);
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final boolean LJIJJ(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, boolean z) {
        DataChannel dataChannel = this.LLJ;
        if (dataChannel == null) {
            return false;
        }
        C930480aJy c930480aJy = C930480aJy.LIZ;
        AwS259S0300000_15 awS259S0300000_15 = new AwS259S0300000_15(this, c20361214lm, interfaceC20354714kj, 10);
        c930480aJy.getClass();
        return C930480aJy.LJJJI(dataChannel, awS259S0300000_15, z);
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void LJJIIZ(C20361214lm c20361214lm, InterfaceC979390bar interfaceC979390bar, LifecycleOwner lifecycleOwner) {
        super.LJJIIZ(c20361214lm, interfaceC979390bar, lifecycleOwner);
        interfaceC979390bar.LJFF();
    }

    @Override // X.AbstractC20356314kz
    public final void LJJJLL(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, LifecycleOwner lifecycleOwner, String str, Long l, String str2, String str3) {
        List<LinkUser> listLIZLLL;
        FragmentManager fragmentManager;
        InterfaceC302601Fg interfaceC302601FgLIZ;
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null && (listLIZLLL = interfaceC954180awCLLJLL.LIZLLL()) != null && listLIZLLL.size() >= 2) {
            if (((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).o52(this.LLJ) && C930540aK4.LIZJ()) {
                C766270U4b.LIZLLL(2131841399);
                PlayEntityUtilKt.LJI(this, c20361214lm, interfaceC20354714kj, null, "during draw guess", 0L, 40);
                return;
            }
            if (MultiGuestLiveShowConfigSetting.INSTANCE.isOpenLiveShow() && (interfaceC302601FgLIZ = C01FQ.LIZ()) != null && interfaceC302601FgLIZ.LJIJI()) {
                C766270U4b.LIZLLL(2131843582);
                PlayEntityUtilKt.LJI(this, c20361214lm, interfaceC20354714kj, null, "during live show", 0L, 40);
                return;
            }
            this.LLJJJJLIIL = c20361214lm;
            this.LLJJL = interfaceC20354714kj;
            PlayEntityUtilKt.LJFF(this, c20361214lm, interfaceC20354714kj, lifecycleOwner);
            DataChannel dataChannel = this.LLJ;
            if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
                String str4 = PlaybookSelectionDialog._pnsPageId;
                if (C19322110iZ.LJFF(fragmentManager, C945450ai7.LIZ(EnumC945500aiC.EXPAND, dataChannel, C497740JfY.LJIJI(2131843610), new AwS22S2200000_15(this, str, l, str2, 0), new AwS293S0300000_15(this, c20361214lm, interfaceC20354714kj, 5), new AwS224S0300000_15(this, c20361214lm, interfaceC20354714kj, 11)), "PlaybookSelectionDialog", null, 0) > 0) {
                    PlayEntityUtilKt.LJII(this, 2, c20361214lm, interfaceC20354714kj, true);
                    return;
                } else {
                    PlayEntityUtilKt.LJI(this, c20361214lm, interfaceC20354714kj, null, null, 0L, 56);
                    return;
                }
            }
            return;
        }
        C766270U4b.LIZLLL(2131854136);
        PlayEntityUtilKt.LJI(this, c20361214lm, interfaceC20354714kj, EnumC979240bac.NO_GUESTS, null, 0L, 48);
    }
}
