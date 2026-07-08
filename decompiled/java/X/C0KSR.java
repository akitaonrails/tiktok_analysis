package X;

import com.bytedance.android.livesdk.revenue.level.impl.superfan.payment.api.IRevenueApi;
import tikcast.api.fans.GetSuperFansTreasureBoxDataRequest;
import tikcast.api.fans.GetSuperFansTreasureBoxDataResponse;

/* JADX INFO: renamed from: X.0KSR, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KSR extends AbstractC516030KLp<GetSuperFansTreasureBoxDataResponse.Data> {
    public final /* synthetic */ C0KST LIZ;

    public final C11O8 LIZJ() {
        C480460Ism.LIZ().getClass();
        IRevenueApi iRevenueApi = (IRevenueApi) C480460Ism.LIZLLL(IRevenueApi.class);
        GetSuperFansTreasureBoxDataRequest getSuperFansTreasureBoxDataRequest = new GetSuperFansTreasureBoxDataRequest();
        C0KSK<GetSuperFansTreasureBoxDataResponse.Data> c0ksk = this.LIZ.LIZ;
        getSuperFansTreasureBoxDataRequest.anchorId = c0ksk.LIZJ;
        getSuperFansTreasureBoxDataRequest.iapCountryCode = c0ksk.LJIIJJI;
        getSuperFansTreasureBoxDataRequest.roomId = c0ksk.LIZLLL;
        return iRevenueApi.getFansTreasureBox(getSuperFansTreasureBoxDataRequest).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ());
    }

    public C0KSR(C0KST c0kst) {
        this.LIZ = c0kst;
    }
}
