package X;

import com.ss.android.ugc.aweme.ecommerce.network.IECRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0NwM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C610080NwM {
    public static final /* synthetic */ C610080NwM LIZ = new C610080NwM();
    public static final InterfaceC610090NwN LIZIZ = (InterfaceC610090NwN) ((IECRetrofitFactory) ServiceManager.get().getService(IECRetrofitFactory.class)).createBuilder("https://oec-api.tiktokv.com/").build().create(InterfaceC610090NwN.class);
}
