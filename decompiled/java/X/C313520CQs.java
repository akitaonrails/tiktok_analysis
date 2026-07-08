package X;

import Y.AkS469S0100000_4;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.boot.live.LiveRevenueApi;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.ILiveOuterService;

/* JADX INFO: renamed from: X.0CQs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C313520CQs {
    public final C557050Lt1 LIZ = new C557050Lt1(false);
    public final BPEAHandler LIZIZ = new BPEAHandler(Looper.getMainLooper(), new Handler.Callback() { // from class: X.0CQu
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            LiveRevenueApi liveRevenueApi;
            C313520CQs c313520CQs = this.LL;
            c313520CQs.getClass();
            C1C7U.LIZ("LiveFeedManager@5524.<init>$1L");
            int i = message.what;
            if ((i == 1 || i == 2) && C804420Vh2.LJ(C1BWL.LIZ()).isAvailable() && c313520CQs.LIZ.LIZ(false, true)) {
                C313520CQs.LIZ(1, "live_revenue_disable_cache_request");
                ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi(ILiveOuterService.class);
                if (iLiveOuterService != null && (liveRevenueApi = (LiveRevenueApi) iLiveOuterService.getService(LiveRevenueApi.class)) != null) {
                    liveRevenueApi.request().LJL(C11S5.LIZ()).LJJJJZI(new AkS469S0100000_4(c313520CQs, 4)).LIZIZ(new C346520DiE(c313520CQs, 0));
                    return true;
                }
            }
            return true;
        }
    });

    public static void LIZ(final int i, final String str) {
        if (((Boolean) C259910AGn.LIZ.getValue()).booleanValue()) {
            C20684815ws.LJFF().execute(new Runnable() { // from class: X.01Yp
                @Override // java.lang.Runnable
                public final void run() {
                    String str2 = str;
                    int i2 = i;
                    C1C7U.LIZ("LiveFeedManager@5524.report$1L");
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LIZJ(i2, str2);
                    C20684815ws.LJIILLIIL("live_revenue_event", c2344009Gk.LIZ);
                    C1C7U.LIZIZ("LiveFeedManager@5524.report$1L");
                }
            });
        }
    }
}
