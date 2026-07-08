package X;

import com.bytedance.android.livesdk.revenue.level.impl.superfan.payment.api.IRevenueApi;
import tikcast.api.fans.GetNonFansUserDataResponse;

/* JADX INFO: renamed from: X.0KSQ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KSQ extends AbstractC516030KLp<GetNonFansUserDataResponse.Data> {
    public final /* synthetic */ C0KSS LIZ;

    public final C11O8 LIZJ() {
        C480460Ism.LIZ().getClass();
        IRevenueApi iRevenueApi = (IRevenueApi) C480460Ism.LIZLLL(IRevenueApi.class);
        C0KSK<GetNonFansUserDataResponse.Data> c0ksk = this.LIZ.LIZ;
        return iRevenueApi.getFansUserData(c0ksk.LIZJ, c0ksk.LJIIJJI, c0ksk.LJ, c0ksk.LJI, c0ksk.LJIIIZ).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ());
    }

    public C0KSQ(C0KSS c0kss) {
        this.LIZ = c0kss;
    }
}
