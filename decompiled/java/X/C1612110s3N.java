package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.model.PineDramaMidInsertRequest;
import com.ss.android.ugc.aweme.series.seriesdetail.api.SeriesDetailApi;
import java.util.List;

/* JADX INFO: renamed from: X.0s3N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1612110s3N {
    public static SeriesDetailApi.GetPaidCollectionDetailApi LIZ() {
        if (SeriesDetailApi.LIZ == null) {
            SeriesDetailApi.LIZ = (SeriesDetailApi.GetPaidCollectionDetailApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(C0CQT.LIZJ).create(SeriesDetailApi.GetPaidCollectionDetailApi.class);
        }
        return SeriesDetailApi.LIZ;
    }

    public static C11NZ LIZIZ(PineDramaMidInsertRequest pineDramaMidInsertRequest, C1612380s3o c1612380s3o, Boolean bool, String str, String str2, String str3, List list, List list2) {
        SeriesDetailApi.AppDiffProtocol.LIZ.getClass();
        return C1612440s3u.LIZIZ.getValue().LIZ(new C1612130s3P(pineDramaMidInsertRequest, c1612380s3o, bool, str2, str, str3, list, list2));
    }
}
