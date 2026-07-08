package X;

import com.bytedance.amg.minigameruntime.api.IClientAdapterService;
import com.bytedance.amg.minigameruntime.api.IClientLogger;

/* JADX INFO: renamed from: X.0k2W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1304060k2W implements InterfaceC1288380jdE {
    public final IClientLogger LIZ;

    public C1304060k2W(C1303970k2N c1303970k2N) {
        IClientLogger appLogger;
        IClientAdapterService iClientAdapterServiceLIZIZ = c1303970k2N.LIZ.LIZ.LIZIZ();
        this.LIZ = (iClientAdapterServiceLIZIZ == null || (appLogger = iClientAdapterServiceLIZIZ.getAppLogger()) == null) ? C1304100k2a.LIZ : appLogger;
    }

    @Override // X.InterfaceC1288380jdE
    public final void d(String str, String str2) {
        if (str2 != null) {
            IClientLogger iClientLogger = this.LIZ;
            if (str == null) {
                str = "MiniGameRuntime";
            }
            iClientLogger.d(str, str2);
        }
    }

    @Override // X.InterfaceC1288380jdE
    public final void e(String str, String str2) {
        if (str2 != null) {
            IClientLogger iClientLogger = this.LIZ;
            if (str == null) {
                str = "MiniGameRuntime";
            }
            iClientLogger.e(str, str2);
        }
    }

    @Override // X.InterfaceC1288380jdE
    public final void i(String str, String str2) {
        if (str2 != null) {
            IClientLogger iClientLogger = this.LIZ;
            if (str == null) {
                str = "MiniGameRuntime";
            }
            iClientLogger.i(str, str2);
        }
    }

    @Override // X.InterfaceC1288380jdE
    public final void w(String str, String str2) {
        if (str2 != null) {
            IClientLogger iClientLogger = this.LIZ;
            if (str == null) {
                str = "MiniGameRuntime";
            }
            iClientLogger.w(str, str2);
        }
    }
}
