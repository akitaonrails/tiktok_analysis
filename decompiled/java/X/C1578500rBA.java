package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: renamed from: X.0rBA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1578500rBA {
    public static final C1578500rBA LIZ = new C1578500rBA();

    public static InterfaceC1577430r9R LIZ() {
        InterfaceC2661011f interfaceC2661011fLIZ;
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) PluggableExtentionKt.pluggableSpi$default(IRetrofitFactory.class, false, false, false, 14, null);
        if (iRetrofitFactory == null || (interfaceC2661011fLIZ = iRetrofitFactory.LIZ(C0CQT.LIZJ)) == null) {
            return null;
        }
        return (InterfaceC1577430r9R) interfaceC2661011fLIZ.create(InterfaceC1577430r9R.class);
    }
}
