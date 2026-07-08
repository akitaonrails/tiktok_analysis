package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: renamed from: X.06fC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1662806fC {
    public static final InterfaceC1662906fD LIZ;

    static {
        InterfaceC2661011f interfaceC2661011fLIZ;
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) PluggableExtentionKt.pluggableSpi$default(IRetrofitFactory.class, false, false, false, 14, null);
        LIZ = (iRetrofitFactory == null || (interfaceC2661011fLIZ = iRetrofitFactory.LIZ(C0CQT.LIZJ)) == null) ? null : (InterfaceC1662906fD) interfaceC2661011fLIZ.create(InterfaceC1662906fD.class);
    }
}
