package X;

import com.ss.android.ugc.aweme.featureeffectvideo.repo.FeatureVideoApi;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0OBw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C615420OBw {
    public static final C615420OBw LIZ = new C615420OBw();
    public static final FeatureVideoApi LIZIZ;

    static {
        FeatureVideoApi.LIZ.getClass();
        LIZIZ = (FeatureVideoApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(C0CQT.LIZJ).create(FeatureVideoApi.class);
    }
}
