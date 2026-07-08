package X;

import com.ss.android.ugc.aweme.appdiff.IDramaSharedApiPathService;
import com.ss.android.ugc.aweme.series.feed.api.SeriesCenterListResponse;
import com.ss.android.ugc.aweme.series.feed.api.SeriesListApi;
import com.ss.android.ugc.aweme.series.feed.model.SeriesCenterSceneEnum;
import com.ss.android.ugc.aweme.service.MiniDramaHostService;

/* JADX INFO: renamed from: X.0r8g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1576960r8g {
    public static SeriesListApi.GetSeriesCenterListApi LIZIZ() {
        if (SeriesListApi.LIZ == null) {
            MiniDramaHostService.LIZ.getClass();
            MiniDramaHostService miniDramaHostServiceLIZ = C1573890r3j.LIZ();
            SeriesListApi.LIZ = miniDramaHostServiceLIZ != null ? (SeriesListApi.GetSeriesCenterListApi) miniDramaHostServiceLIZ.LIZLLL(SeriesListApi.GetSeriesCenterListApi.class) : null;
        }
        return SeriesListApi.LIZ;
    }

    public static C11NZ LIZ(SeriesCenterSceneEnum seriesCenterSceneEnum, String str, String str2, Integer num, Boolean bool, Boolean bool2, int i) {
        Integer num2;
        C11NZ<SeriesCenterListResponse> seriesCenterList;
        String str3 = str2;
        Boolean bool3 = bool2;
        Boolean bool4 = bool;
        Integer num3 = 0;
        if ((i & 8) != 0) {
            num2 = num3;
        } else {
            num2 = null;
        }
        if ((i & 16) == 0) {
            num3 = num;
        }
        if ((i & 32) != 0) {
            bool4 = Boolean.FALSE;
        }
        if ((i & 64) != 0) {
            bool3 = Boolean.FALSE;
        }
        SeriesListApi.GetSeriesCenterListApi getSeriesCenterListApiLIZIZ = LIZIZ();
        if (getSeriesCenterListApiLIZIZ != null) {
            if (num3 != null && num3.intValue() == 1) {
                int value = seriesCenterSceneEnum.getValue();
                if (seriesCenterSceneEnum != SeriesCenterSceneEnum.CATEGORY) {
                    str3 = "";
                }
                IDramaSharedApiPathService.LIZ.getClass();
                seriesCenterList = getSeriesCenterListApiLIZIZ.getSeriesCenterListPreload(C1573560r3C.LIZ().LIZ(EnumC1578460rB6.MINI_DRAMA_CENTER_PRELOAD), str, 15, str3, value, num2, num3, bool4, bool3);
            } else {
                int value2 = seriesCenterSceneEnum.getValue();
                if (seriesCenterSceneEnum != SeriesCenterSceneEnum.CATEGORY) {
                    str3 = "";
                }
                IDramaSharedApiPathService.LIZ.getClass();
                seriesCenterList = getSeriesCenterListApiLIZIZ.getSeriesCenterList(C1573560r3C.LIZ().LIZ(EnumC1578460rB6.MINI_DRAMA_CENTER), str, 15, str3, value2, num2, num3, bool4, bool3);
            }
            if (seriesCenterList != null) {
                return seriesCenterList;
            }
        }
        return C11IR.LL;
    }
}
