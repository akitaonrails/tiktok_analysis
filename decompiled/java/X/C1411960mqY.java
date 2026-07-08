package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.tools.AVApi;

/* JADX INFO: renamed from: X.0mqY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1411960mqY {
    public static final /* synthetic */ C1411960mqY LIZ = new C1411960mqY();

    public static InterfaceC19216410Fu LIZ() {
        return (InterfaceC19216410Fu) C0CHQ.LIZ().getNetworkService().createRetrofit(((AVApi) ServiceManager.get().getService(AVApi.class)).LIZ(), true, InterfaceC19216410Fu.class);
    }
}
