package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0hUo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1206280hUo {
    public static final /* synthetic */ C1206280hUo LIZ = new C1206280hUo();

    public static InterfaceC1206270hUn LIZ() {
        return (InterfaceC1206270hUn) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(Api.LIZ).create(InterfaceC1206270hUn.class);
    }
}
