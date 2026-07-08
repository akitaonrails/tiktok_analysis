package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playcondition;

import X.AbstractC20358214lI;
import X.C2188811AlT;
import X.C940770aaZ;
import X.C952190asz;
import X.InterfaceC940760aaY;
import X.InterfaceC946300ajU;
import java.util.List;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.common.MultiGuestLayoutExtra;
import tikcast.linkmic.common.SpotInfo;

/* JADX INFO: loaded from: classes16.dex */
public final class ExpandOngoingCondition extends AbstractC20358214lI {
    public final C952190asz LJFF = new InterfaceC940760aaY() { // from class: X.0asz
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
            this.LIZ.LJIIJJI();
        }
    };

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final String LIZJ() {
        return "expand_ongoing";
    }

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final void LIZLLL() {
        if (LJIIJJI()) {
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

    public final boolean LJIIJJI() {
        boolean zLJIILJJIL = C940770aaZ.LIZ().getDataSource().LJIILJJIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("conditionMatch - ");
        sbLIZ.append("expand_ongoing");
        sbLIZ.append(", isInZoom: ");
        sbLIZ.append(zLJIILJJIL);
        LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC946300ajU interfaceC946300ajU = this.LJ;
        if (interfaceC946300ajU != null) {
            interfaceC946300ajU.LIZ(zLJIILJJIL, false);
        }
        return zLJIILJJIL;
    }
}
