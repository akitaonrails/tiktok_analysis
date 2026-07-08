package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.tns.audiencecontrol.UserRecordActionApi;

/* JADX INFO: renamed from: X.0TWQ, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TWQ {
    public static final /* synthetic */ C0TWQ LIZ = new C0TWQ();
    public static final UserRecordActionApi LIZIZ;

    static {
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class);
        String str = C344670DfF.LIZ;
        LIZIZ = (UserRecordActionApi) iRetrofitFactory.LIZ(C344670DfF.LIZ).create(UserRecordActionApi.class);
    }
}
