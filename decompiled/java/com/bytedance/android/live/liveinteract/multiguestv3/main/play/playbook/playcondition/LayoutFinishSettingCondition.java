package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playcondition;

import X.AbstractC20358214lI;
import X.C20361214lm;
import X.C940770aaZ;
import X.C947860am0;
import X.C952220at2;
import X.InterfaceC940760aaY;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playcondition.LayoutFinishSettingCondition;
import java.util.List;
import kotlin.jvm.internal.AwS594S0100000_15;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.common.MultiGuestLayoutExtra;
import tikcast.linkmic.common.SpotInfo;

/* JADX INFO: loaded from: classes16.dex */
public final class LayoutFinishSettingCondition extends AbstractC20358214lI {
    public final C952220at2 LJFF = new InterfaceC940760aaY() { // from class: X.0at2
        @Override // X.InterfaceC940760aaY
        public final void LJFF(int i, String str) {
        }

        @Override // X.InterfaceC940760aaY
        public final void LJIJI(LayoutState layoutState, List<SpotInfo> list, MultiGuestLayoutExtra multiGuestLayoutExtra) {
        }

        @Override // X.InterfaceC940760aaY
        public final void LJJI(String str) {
        }

        @Override // X.InterfaceC940760aaY
        public final void LJJII(String str) {
        }

        @Override // X.InterfaceC940760aaY
        public final void LJJIII(List<C957020b0m> list) {
        }

        @Override // X.InterfaceC940760aaY
        public final void LJJIJ(String str) {
        }

        @Override // X.InterfaceC940760aaY
        public final void LJJIJIIJIL(String str) {
        }

        @Override // X.InterfaceC940760aaY
        public final void LJJIIJZLJL(C942080acg c942080acg) {
            C20441214yg.LIZIZ("PlaybookDecoration", "onLayoutRenderSuccessEnd");
            LayoutFinishSettingCondition layoutFinishSettingCondition = this.LIZ;
            C20361214lm c20361214lm = layoutFinishSettingCondition.LIZJ;
            if (c20361214lm != null) {
                C947860am0.LIZJ(C947860am0.LIZ(c20361214lm.LJI), new AwS594S0100000_15(layoutFinishSettingCondition, 390));
            }
        }
    };

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final String LIZJ() {
        return "layout_finish_setting";
    }

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final void LIZLLL() {
        C20361214lm c20361214lm = this.LIZJ;
        if (C947860am0.LIZJ(c20361214lm != null ? C947860am0.LIZ(c20361214lm.LJI) : null, new AwS594S0100000_15(this, 392))) {
            return;
        }
        C940770aaZ.LIZ().LJIIZILJ(this.LJFF);
        LIZ();
    }

    @Override // X.AbstractC20358214lI, com.bytedance.android.livesdk.condition.PlayCondition
    public final void LJIIIIZZ() {
        super.LJIIIIZZ();
        C940770aaZ.LIZ().LJJ(this.LJFF);
    }

    @Override // X.AbstractC20358214lI
    public final void LJIIJ(C20361214lm c20361214lm) {
        C947860am0.LIZJ(C947860am0.LIZ(c20361214lm.LJI), new AwS594S0100000_15(this, 391));
    }
}
