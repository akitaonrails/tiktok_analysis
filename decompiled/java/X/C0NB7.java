package X;

import Y.AObjectS190S0300000_9;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.api.AwemeStatsApi;
import com.ss.android.ugc.aweme.feed.controller.PlayerController;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0NB7, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C0NB7 implements Runnable {
    public final /* synthetic */ PlayerController LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ Aweme LLILZ;
    public final /* synthetic */ C0SZ8 LLILZIL;

    public /* synthetic */ C0NB7(PlayerController playerController, String str, int i, Aweme aweme, C0SZ8 c0sz8) {
        this.LL = playerController;
        this.LLILLJJLI = str;
        this.LLILLL = i;
        this.LLILZ = aweme;
        this.LLILZIL = c0sz8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PlayerController playerController = this.LL;
        final String str = this.LLILLJJLI;
        final int i = this.LLILLL;
        Aweme aweme = this.LLILZ;
        C0SZ8 c0sz8 = this.LLILZIL;
        playerController.getClass();
        C1C7U.LIZ("PlayerController@7763.reportAwemeShowStats$1L");
        System.currentTimeMillis();
        C1387270mCj.LIZIZ(playerController.mEventType, playerController.mPageType, str, i, aweme, aweme == null ? C0N2Q.LIZIZ(playerController.LJJLIIIJJIZ()) : aweme.getRequestId(), new AObjectS190S0300000_9(playerController, aweme, c0sz8, 0));
        if (TextUtils.equals("from_follow_often_watch", playerController.mFrom)) {
            final int i2 = playerController.mPageType;
            C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0WiK
                @Override // X.InterfaceC1478005qU
                public final void subscribe(C09AJ c09aj) {
                    int i3 = i2;
                    String str2 = str;
                    int i4 = i;
                    C1C7U.LIZ("AwemeStatsReportUtils@28a8.reportFastAwemeShowStats$1L");
                    try {
                        try {
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        if (i3 != 14000) {
                            C2344809Gs.LIZ(new IllegalArgumentException("wrong pageType argument"));
                            c09aj.onComplete();
                            C1C7U.LIZIZ("AwemeStatsReportUtils@28a8.reportFastAwemeShowStats$1L");
                        } else {
                            AwemeStatsApi.LIZ.awemeFastStatsReport(str2, 21, i4, "").get();
                            c09aj.onComplete();
                            C1C7U.LIZIZ("AwemeStatsReportUtils@28a8.reportFastAwemeShowStats$1L");
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c09aj.onComplete();
                        throw th;
                    }
                }
            }).LJL(C11S5.LIZ()).LJJLJ();
        }
        C1C7U.LIZIZ("PlayerController@7763.reportAwemeShowStats$1L");
    }
}
