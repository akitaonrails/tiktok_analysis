package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.series.serieslist.api.SeriesListApi;

/* JADX INFO: renamed from: X.0rBB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1578510rBB {
    public static SeriesListApi.GetPaidCollectionListApi LIZ() {
        if (SeriesListApi.LIZ == null) {
            SeriesListApi.LIZ = (SeriesListApi.GetPaidCollectionListApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(C0CQT.LIZJ).create(SeriesListApi.GetPaidCollectionListApi.class);
        }
        return SeriesListApi.LIZ;
    }
}
