package X;

import com.bytedance.ies.ugc.aweme.commwecialize.ba.api.BACouponApi;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0dS1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1050790dS1 {
    public static final /* synthetic */ C1050790dS1 LIZ = new C1050790dS1();

    public static BACouponApi LIZ() {
        return (BACouponApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C0CQT.LIZJ).build().retrofit.LIZ(BACouponApi.class);
    }
}
