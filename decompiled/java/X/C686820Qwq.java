package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;

/* JADX INFO: renamed from: X.0Qwq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C686820Qwq {
    public static final int LIZ() {
        C0O0L c0o0l = C036E.LIZ.LIZJ;
        if (c0o0l != null) {
            int i = C0XHS.LIZIZ[c0o0l.ordinal()];
            if (i == 1) {
                return EnumC686830Qwr.NOT_AVAILABLE.getStatus();
            }
            if (i == 2) {
                return EnumC686830Qwr.FAKE.getStatus();
            }
        }
        return ((INetworkStateService) ServiceManager.get().getService(INetworkStateService.class)).isWeakNetwork() ? EnumC686830Qwr.WEAK.getStatus() : EnumC686830Qwr.STRONG.getStatus();
    }

    public static final int LIZIZ(EnumC325100Com enumC325100Com) {
        int i = C0XHS.LIZ[enumC325100Com.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return EnumC686830Qwr.STRONG.getStatus();
                    }
                    throw new C1954807lC();
                }
                return EnumC686830Qwr.WEAK.getStatus();
            }
            return EnumC686830Qwr.FAKE.getStatus();
        }
        return EnumC686830Qwr.NOT_AVAILABLE.getStatus();
    }
}
