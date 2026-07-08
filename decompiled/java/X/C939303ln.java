package X;

import com.ss.android.ugc.aweme.ecommerce.network.IECRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.03ln, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C939303ln {
    public static final /* synthetic */ C939303ln LIZ = new C939303ln();
    public static final C01K1 LIZIZ = ((IECRetrofitFactory) ServiceManager.get().getService(IECRetrofitFactory.class)).createBuilder("https://oec-api.tiktokv.com/").build();
}
