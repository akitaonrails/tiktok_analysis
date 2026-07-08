package X;

import com.ss.android.ugc.aweme.ecommerce.network.IECRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.05WQ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05WQ {
    public static final /* synthetic */ C05WQ LIZ = new C05WQ();
    public static final C01K1 LIZIZ = ((IECRetrofitFactory) ServiceManager.get().getService(IECRetrofitFactory.class)).createBuilder("https://oec-api.tiktokv.com/").build();
}
