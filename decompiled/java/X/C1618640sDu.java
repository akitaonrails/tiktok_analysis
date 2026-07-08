package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0sDu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1618640sDu {
    public static final /* synthetic */ C1618640sDu LIZ = new C1618640sDu();

    public static InterfaceC1618650sDv LIZ() {
        return (InterfaceC1618650sDv) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(Api.LIZ).build().retrofit.LIZ(InterfaceC1618650sDv.class);
    }
}
