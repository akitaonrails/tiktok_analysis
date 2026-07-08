package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.pns.activitycenter.searchhistory.PnSSearchHistoryApi;

/* JADX INFO: renamed from: X.0CQM, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CQM {
    public static final /* synthetic */ C0CQM LIZ = new C0CQM();
    public static final PnSSearchHistoryApi LIZIZ = (PnSSearchHistoryApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C0CQT.LIZJ).build().retrofit.LIZ(PnSSearchHistoryApi.class);
}
