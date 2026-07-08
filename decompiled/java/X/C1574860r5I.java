package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.series.feed.api.MiniDramaReportRequest;
import com.ss.android.ugc.aweme.series.feed.api.SeriesListApi;

/* JADX INFO: renamed from: X.0r5I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1574860r5I {
    public static void LIZ() {
        C11NZ<BaseResponse> c11nzReport;
        MiniDramaReportRequest miniDramaReportRequest = new MiniDramaReportRequest(Integer.valueOf(EnumC995350c0b.MINI_DRAMA_REPORT_EVENT_TYPE_ENTER_DRAMA_CENTER.getValue()), null, null);
        SeriesListApi.GetSeriesCenterListApi getSeriesCenterListApiLIZIZ = C1576960r8g.LIZIZ();
        if (getSeriesCenterListApiLIZIZ == null || (c11nzReport = getSeriesCenterListApiLIZIZ.report(miniDramaReportRequest)) == null) {
            return;
        }
        c11nzReport.LJL(C11S5.LIZ()).LJJLL(new C09JN() { // from class: X.00Om
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("SeriesListApi$Companion@fdf5.reportCommit$1");
                C1C7U.LIZIZ("SeriesListApi$Companion@fdf5.reportCommit$1");
            }
        }, new C09JN() { // from class: X.00On
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("SeriesListApi$Companion@fdf5.reportCommit$2");
                C1C7U.LIZIZ("SeriesListApi$Companion@fdf5.reportCommit$2");
            }
        });
    }
}
