package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.appdiff.IDramaSharedApiPathService;
import com.ss.android.ugc.aweme.series.profileentrance.api.SeriesProfileApi;
import com.ss.android.ugc.aweme.service.MiniDramaHostService;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: X.0rB7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1578470rB7 {
    public static C11NZ LIZ(long j, long j2) {
        SeriesProfileApi.GetSeriesProfileTabApi getSeriesProfileTabApi;
        try {
            if (SeriesProfileApi.LIZ == null) {
                MiniDramaHostService.LIZ.getClass();
                MiniDramaHostService miniDramaHostServiceLIZ = C1573890r3j.LIZ();
                if (miniDramaHostServiceLIZ != null) {
                    getSeriesProfileTabApi = (SeriesProfileApi.GetSeriesProfileTabApi) miniDramaHostServiceLIZ.LIZLLL(SeriesProfileApi.GetSeriesProfileTabApi.class);
                } else {
                    getSeriesProfileTabApi = null;
                }
                SeriesProfileApi.LIZ = getSeriesProfileTabApi;
            }
            SeriesProfileApi.GetSeriesProfileTabApi getSeriesProfileTabApi2 = SeriesProfileApi.LIZ;
            if (getSeriesProfileTabApi2 != null) {
                Map mapLIZIZ = C1578480rB8.LIZIZ.LIZIZ(j2);
                String str = (String) mapLIZIZ.get("collection_id");
                String str2 = (String) mapLIZIZ.get("video_id");
                if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
                    str = null;
                    str2 = null;
                }
                IDramaSharedApiPathService.LIZ.getClass();
                return getSeriesProfileTabApi2.getSeriesProfileTabApi(C1573560r3C.LIZ().LIZ(EnumC1578460rB6.COLLECTION_MINI_DRAMA_LIST), j2, j, 3, str, str2);
            }
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            AbstractC2126608Uu.getCompatibleException(e);
        }
        return C11IR.LL;
    }
}
