package X;

import Y.AfS171S0100000_2;
import Y.AfS176S0100000_7;
import com.bytedance.android.livesdk.chatroom.api.EndPageRecommendRetrofitApi;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;

/* JADX INFO: renamed from: X.0ILZ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0ILZ {
    public static void LIZ(BPEAHandler bPEAHandler, long j, long j2) {
        boolean zLJI = MethodIDManager.LJI(137976);
        C480460Ism.LIZ().getClass();
        ((EndPageRecommendRetrofitApi) C480460Ism.LIZLLL(EndPageRecommendRetrofitApi.class)).getRecommendV2("live_end_recommend", "78", 4L, 0L, j, j2).LJIILIIL(new C0UO0()).LJJLL(new AfS176S0100000_7(bPEAHandler, 284), new AfS171S0100000_2(bPEAHandler, 69));
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
