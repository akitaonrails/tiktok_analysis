package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.component.fanticket.model.FanTicketModel;

/* JADX INFO: renamed from: X.0ac1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C941670ac1 implements InterfaceC941900acO {
    public C941600abu LL;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC941900acO
    public final void LIZJ(C01EL c01el, String str) {
        switch (str.hashCode()) {
            case -983286850:
                if (!str.equals("count_down_for_all")) {
                    return;
                }
                break;
            case 473355093:
                if (!str.equals("count_down_single")) {
                    return;
                }
                break;
            case 1008965232:
                if (!str.equals("live_show")) {
                    return;
                }
                break;
            case 1886539686:
                if (!str.equals("guest_showdown")) {
                    return;
                }
                break;
            default:
                return;
        }
        if (c01el == C01EL.START) {
            C941600abu c941600abu = this.LL;
            if (c941600abu == null) {
                return;
            }
            FanTicketModel fanTicketModel = c941600abu.LIZ;
            fanTicketModel.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onSceneStart, scene: ");
            sbLIZ.append(str);
            C320901Mh.LIZ("FanTicketModel", C2188811AlT.LIZIZ(sbLIZ));
            fanTicketModel.LIZ();
            return;
        }
        C941600abu c941600abu2 = this.LL;
        if (c941600abu2 == null) {
            return;
        }
        FanTicketModel fanTicketModel2 = c941600abu2.LIZ;
        fanTicketModel2.getClass();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onSceneStop, scene: ");
        sbLIZ2.append(str);
        C320901Mh.LIZ("FanTicketModel", C2188811AlT.LIZIZ(sbLIZ2));
        fanTicketModel2.LIZ();
    }
}
