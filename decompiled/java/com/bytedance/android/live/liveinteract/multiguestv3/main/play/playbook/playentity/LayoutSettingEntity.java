package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity;

import X.AbstractC20356314kz;
import X.C1697810uHb;
import X.C19322110iZ;
import X.C20357914lF;
import X.C20361214lm;
import X.C259800zU;
import X.C334801Rq;
import X.C748880TZe;
import X.C930480aJy;
import X.C940770aaZ;
import X.C946060aj6;
import X.C947860am0;
import X.C979360bao;
import X.InterfaceC20354714kj;
import X.InterfaceC947990amD;
import X.InterfaceC953350aur;
import X.InterfaceC979390bar;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookLayoutSettingDialogV3;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.livesdk.util.PlayEntityUtilKt;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS224S0300000_15;
import kotlin.jvm.internal.AwS259S0300000_15;
import kotlin.jvm.internal.AwS293S0300000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class LayoutSettingEntity extends AbstractC20356314kz {
    public LayoutConfig LLJJJJJIL;
    public final C20357914lF LLJJJJLIIL = new C20357914lF("layout", 0, 35600000, 0, C1697810uHb.LJIIJJI("layout_finish_setting", "layout_ongoing", "never"), "layout_finish_setting", 4080);
    public final C979360bao LLJJL = new C979360bao(this);

    @Override // X.AbstractC20356314kz
    public final void LJJIJLIJ() {
        this.LLJJJJJIL = null;
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void LJIJ() {
        this.LLJJJJJIL = C947860am0.LIZIZ();
    }

    @Override // X.AbstractC20356314kz
    public final void LJJIL() {
        C940770aaZ.LIZ().LJJ(this.LLJJL);
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
        return this.LLJJJJLIIL;
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void LJI(Function2 function2) {
        LayoutConfig layoutConfig = this.LLJJJJJIL;
        if (layoutConfig != null) {
            C947860am0.LIZLLL(layoutConfig, function2);
        } else {
            function2.invoke(Boolean.TRUE, "no snapshot, skip");
        }
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void LJIILLIIL(String str) {
        if (isRunning() && LJJJ()) {
            C947860am0.LIZJ(C947860am0.LIZ(str), new AwS594S0100000_15(this, 404));
        }
    }

    @Override // X.AbstractC20356314kz
    public final void LJJLI(C20361214lm c20361214lm) {
        if (!C947860am0.LIZJ(C947860am0.LIZ(c20361214lm.LJI), new AwS594S0100000_15(this, 406))) {
            this.LLJJL.LIZ = c20361214lm;
            C940770aaZ.LIZ().LJIIZILJ(this.LLJJL);
        }
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final boolean LJJIJL(C20361214lm c20361214lm, boolean z) {
        if (C947860am0.LIZ(c20361214lm.LJI) != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d6  */
    @Override // X.AbstractC20356314kz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C20361314ln LJJJLIIL(X.C20424814w2 r13, int r14) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.LayoutSettingEntity.LJJJLIIL(X.14w2, int):X.14ln");
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final boolean LJIJJ(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, boolean z) {
        DataChannel dataChannel = this.LLJ;
        if (dataChannel == null) {
            return false;
        }
        C930480aJy c930480aJy = C930480aJy.LIZ;
        AwS259S0300000_15 awS259S0300000_15 = new AwS259S0300000_15(this, c20361214lm, interfaceC20354714kj, 13);
        c930480aJy.getClass();
        return C930480aJy.LJJJI(dataChannel, awS259S0300000_15, z);
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void LJJIIZ(C20361214lm c20361214lm, final InterfaceC979390bar interfaceC979390bar, LifecycleOwner lifecycleOwner) {
        super.LJJIIZ(c20361214lm, interfaceC979390bar, lifecycleOwner);
        DataChannel dataChannel = this.LLJ;
        if (dataChannel == null) {
            return;
        }
        LayoutConfig layoutConfigLIZ = C947860am0.LIZ(c20361214lm.LJI);
        C259800zU c259800zU = new C259800zU();
        C946060aj6 c946060aj6 = new C946060aj6(layoutConfigLIZ, "playbook_edit", new AwS293S0300000_15(c20361214lm, interfaceC979390bar, c259800zU, 8), null, new AwS559S0100000_15(this, 323), new AwS224S0300000_15(c20361214lm, interfaceC979390bar, c259800zU, 17), null, null, false, this.LLIZ, null, null, 14232);
        interfaceC979390bar.LIZIZ(c20361214lm.LIZIZ, c20361214lm.LJI);
        FragmentManager fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class);
        if (fragmentManager != null && C19322110iZ.LJFF(fragmentManager, new PlaybookLayoutSettingDialogV3(dataChannel, c946060aj6, new InterfaceC947990amD() { // from class: X.0baq
            @Override // X.InterfaceC947990amD
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC947990amD
            public final void LIZ() {
                InterfaceC979390bar interfaceC979390bar2 = interfaceC979390bar;
                if (interfaceC979390bar2 != null) {
                    interfaceC979390bar2.LIZ(false);
                }
            }
        }), this.LLJJJJLIIL.LIZ, null, 0) <= 0) {
            interfaceC979390bar.LIZLLL(c20361214lm.LIZIZ, "");
        }
    }

    @Override // X.AbstractC20356314kz
    public final void LJJIZ(C20361214lm c20361214lm, String str, C334801Rq c334801Rq, InterfaceC953350aur interfaceC953350aur, Context context) {
        int i;
        LayoutConfig layoutConfigLIZ = C947860am0.LIZ(c20361214lm.LJI);
        if (layoutConfigLIZ == null || (i = layoutConfigLIZ.panelLayoutType) <= 0) {
            return;
        }
        C940770aaZ.LIZ().getAction().LJFF(i, layoutConfigLIZ.micCount + 1, new AwS594S0100000_15(interfaceC953350aur, 402), new AwS594S0100000_15(interfaceC953350aur, 403));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC20356314kz
    public final void LJJJLL(final C20361214lm c20361214lm, final InterfaceC20354714kj interfaceC20354714kj, LifecycleOwner lifecycleOwner, String str, Long l, String str2, String str3) {
        DataChannel dataChannel = this.LLJ;
        if (dataChannel == null) {
            return;
        }
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = interfaceC20354714kj;
        if (lifecycleOwner != null) {
            PlaybookUtilKt.LJJII(lifecycleOwner, new AwS559S0100000_15(c259800zU, (C259800zU<InterfaceC20354714kj>) 324));
        }
        C946060aj6 c946060aj6 = new C946060aj6(C947860am0.LIZ(c20361214lm.LJI), str3, new AwS293S0300000_15(this, (LayoutSettingEntity) c20361214lm, (C20361214lm) c259800zU, (C259800zU<InterfaceC20354714kj>) 9), new AwS224S0300000_15(this, (LayoutSettingEntity) c20361214lm, (C20361214lm) c259800zU, (C259800zU<InterfaceC20354714kj>) 18), new AwS559S0100000_15(this, 325), new AwS224S0300000_15(this, (LayoutSettingEntity) c20361214lm, (C20361214lm) c259800zU, (C259800zU<InterfaceC20354714kj>) 19), null, null, false, this.LLIZ, null, null, 14224);
        PlayEntityUtilKt.LJFF(this, c20361214lm, (InterfaceC20354714kj) c259800zU.element, lifecycleOwner);
        FragmentManager fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class);
        if (fragmentManager != null && C19322110iZ.LJFF(fragmentManager, new PlaybookLayoutSettingDialogV3(dataChannel, c946060aj6, new InterfaceC947990amD() { // from class: X.0bap
            @Override // X.InterfaceC947990amD
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC947990amD
            public final void LIZ() {
                PlayEntityUtilKt.LJII(this.LIZ, 2, c20361214lm, interfaceC20354714kj, true);
            }
        }), this.LLJJJJLIIL.LIZ, null, 0) <= 0) {
            PlayEntityUtilKt.LJI(this, c20361214lm, (InterfaceC20354714kj) c259800zU.element, null, null, 0L, 56);
        }
    }
}
