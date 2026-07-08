package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.series.promote.SeriesPromoteApi;

/* JADX INFO: renamed from: X.0rFC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1581000rFC {
    public static final /* synthetic */ C1581000rFC LIZ = new C1581000rFC();

    public static SeriesPromoteApi LIZ() {
        return (SeriesPromoteApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(Api.LIZ).create(SeriesPromoteApi.class);
    }
}
