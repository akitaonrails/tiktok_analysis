package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity;

import X.AbstractC20356314kz;
import X.C01EE;
import X.C01EG;
import X.C01EI;
import X.C1697810uHb;
import X.C1850730yGF;
import X.C19322110iZ;
import X.C1AZW;
import X.C20357914lF;
import X.C20361214lm;
import X.C20361314ln;
import X.C20424814w2;
import X.C259800zU;
import X.C497740JfY;
import X.C748880TZe;
import X.C766270U4b;
import X.C915980Zwa;
import X.C927800aFe;
import X.C930480aJy;
import X.C937280aUw;
import X.C945450ai7;
import X.C979190baX;
import X.C979200baY;
import X.EnumC945500aiC;
import X.EnumC979240bac;
import X.InterfaceC20354714kj;
import X.InterfaceC421301kR;
import X.InterfaceC954180awC;
import X.InterfaceC979390bar;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookSelectionDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.util.PlayEntityUtilKt;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS224S0300000_15;
import kotlin.jvm.internal.AwS259S0300000_15;
import kotlin.jvm.internal.AwS293S0300000_15;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class CountDownSingleEntity extends AbstractC20356314kz {
    public final C20357914lF LLJJJJJIL = new C20357914lF("count_down_single", 0, 35600000, 0, C1697810uHb.LJIIJJI("countdown_ongoing_one", "countdown_finished_one", "countdown_finished_all", "never"), null, 20464);
    public final C979200baY LLJJJJLIIL = new C01EE() { // from class: X.0baY
        @Override // X.C01EE
        public final void LIZ(C01E9 c01e9) {
        }

        @Override // X.C01EE
        public final void LIZJ(C299601Ec c299601Ec) {
        }

        @Override // X.C01EE
        public final void LIZIZ(C299601Ec c299601Ec) {
            this.LIZ.LJJIJ();
        }

        @Override // X.C01EE
        public final void LIZLLL(C299601Ec c299601Ec) {
            this.LIZ.LJJIJ();
        }
    };

    @Override // X.AbstractC20356314kz
    public final void LJJIL() {
        InterfaceC421301kR interfaceC421301kRLIZIZ = C01EG.LIZIZ();
        if (interfaceC421301kRLIZIZ != null) {
            interfaceC421301kRLIZIZ.LJIILL(this.LLJJJJLIIL);
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
        return C927800aFe.LIZIZ();
    }

    @Override // X.AbstractC20356314kz
    public final void LJJLI(C20361214lm c20361214lm) {
        InterfaceC421301kR interfaceC421301kRLIZIZ = C01EG.LIZIZ();
        if (interfaceC421301kRLIZIZ != null) {
            interfaceC421301kRLIZIZ.LJIL(this.LLJJJJLIIL);
        }
    }

    @Override // X.AbstractC20356314kz
    public final C20361314ln LJJJLIIL(C20424814w2 c20424814w2, int i) {
        CountDownSingleEntityConfig countDownSingleEntityConfig = (CountDownSingleEntityConfig) C937280aUw.LIZJ(CountDownSingleEntityConfig.class, c20424814w2.LJII, new CountDownSingleEntityConfig(0L, false, 0L));
        ArrayList arrayList = new ArrayList();
        long j = countDownSingleEntityConfig.duration;
        if (j > 0) {
            arrayList.add(C497740JfY.LJIJJ(2131854127, String.valueOf(j / ((long) 60))));
        }
        long j2 = countDownSingleEntityConfig.targetScore;
        if (j2 > 0) {
            arrayList.add(C497740JfY.LJIJJ(2131854128, C1850730yGF.LJFF(j2)));
        }
        return new C20361314ln(C497740JfY.LJIJI(2131843217), C497740JfY.LJIJI(2131843217), R.attr.ekw, R.attr.ekw, arrayList, null, i, null, false, null, 3968);
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final boolean LJIJJ(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, boolean z) {
        DataChannel dataChannel = this.LLJ;
        if (dataChannel == null) {
            return false;
        }
        C930480aJy c930480aJy = C930480aJy.LIZ;
        AwS259S0300000_15 awS259S0300000_15 = new AwS259S0300000_15(this, c20361214lm, interfaceC20354714kj, 9);
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
        int size;
        List<LinkUser> listLIZLLL;
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null && (listLIZLLL = interfaceC954180awCLLJLL.LIZLLL()) != null) {
            size = listLIZLLL.size();
        } else {
            size = 0;
        }
        if (size < 2) {
            C1AZW.LJIILL(C01EI.LIZ(69, this.LLJJJJJIL.LIZ), "no guest", null, null);
            C766270U4b.LIZLLL(2131854136);
            PlayEntityUtilKt.LJI(this, c20361214lm, interfaceC20354714kj, EnumC979240bac.NO_GUESTS, "no guests", 0L, 32);
            return;
        }
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = interfaceC20354714kj;
        if (lifecycleOwner != null) {
            PlaybookUtilKt.LJJII(lifecycleOwner, new AwS559S0100000_15(c259800zU, (C259800zU<InterfaceC20354714kj>) 316));
        }
        PlayEntityUtilKt.LJFF(this, c20361214lm, (InterfaceC20354714kj) c259800zU.element, lifecycleOwner);
        DataChannel dataChannel = this.LLJ;
        if (dataChannel == null) {
            return;
        }
        FragmentManager fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class);
        if (fragmentManager != null) {
            String str4 = PlaybookSelectionDialog._pnsPageId;
            if (C19322110iZ.LJFF(fragmentManager, C945450ai7.LIZ(EnumC945500aiC.COUNTDOWN, dataChannel, "CountDownTool", new C979190baX(this, c20361214lm, c259800zU, str, l, str2, str3), new AwS293S0300000_15(this, c20361214lm, interfaceC20354714kj, 4), new AwS224S0300000_15(this, (CountDownSingleEntity) c20361214lm, (C20361214lm) c259800zU, (C259800zU<InterfaceC20354714kj>) 10)), "PlaybookSelectionDialog", null, 0) > 0) {
                PlayEntityUtilKt.LJII(this, 2, c20361214lm, (InterfaceC20354714kj) c259800zU.element, true);
                return;
            } else {
                PlayEntityUtilKt.LJI(this, c20361214lm, (InterfaceC20354714kj) c259800zU.element, EnumC979240bac.NORMAL_ERROR, "token <= 0", 0L, 32);
                return;
            }
        }
        PlayEntityUtilKt.LJI(this, c20361214lm, (InterfaceC20354714kj) c259800zU.element, EnumC979240bac.NORMAL_ERROR, "FragmentManagerData == null", 0L, 32);
    }
}
