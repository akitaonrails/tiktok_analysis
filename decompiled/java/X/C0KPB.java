package X;

import com.bytedance.android.livesdk.revenue.level.impl.superfan.payment.api.IRevenueApi;
import tikcast.api.fans.PolingSuperFanContractStatusResult;

/* JADX INFO: renamed from: X.0KPB, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KPB extends AbstractC516390KMz<PolingSuperFanContractStatusResult> {
    public final /* synthetic */ C0KP7 LIZ;

    public C0KPB(C0KP7 c0kp7) {
        this.LIZ = c0kp7;
    }

    public final C11NZ<C470590Icr<PolingSuperFanContractStatusResult>> LJ(String str, String str2) {
        int i;
        if (this.LIZ.LIZ == null) {
            return null;
        }
        C480460Ism.LIZ().getClass();
        IRevenueApi iRevenueApi = (IRevenueApi) C480460Ism.LIZLLL(IRevenueApi.class);
        if (this.LIZ.LIZ.LJII == 5) {
            i = 1;
        } else {
            i = 0;
        }
        return iRevenueApi.queryContractStatus(str, str2, i).LJIILIIL(new C0UO0());
    }
}
