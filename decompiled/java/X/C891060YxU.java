package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.push.impl.alerttone.net.IMAlertToneNetAPI;

/* JADX INFO: renamed from: X.0YxU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C891060YxU {
    public static final /* synthetic */ C891060YxU LIZ = new C891060YxU();
    public static final IMAlertToneNetAPI LIZIZ;

    static {
        InterfaceC2661011f interfaceC2661011fLIZ;
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) PluggableExtentionKt.pluggableSpi$default(IRetrofitFactory.class, false, false, false, 14, null);
        LIZIZ = (iRetrofitFactory == null || (interfaceC2661011fLIZ = iRetrofitFactory.LIZ(C1477305qN.LIZ)) == null) ? null : (IMAlertToneNetAPI) interfaceC2661011fLIZ.create(IMAlertToneNetAPI.class);
    }
}
