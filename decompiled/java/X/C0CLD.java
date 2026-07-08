package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.abmock.IAbMockService;

/* JADX INFO: renamed from: X.0CLD, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public class C0CLD extends C307970C5j {
    @Override // X.C307970C5j, X.InterfaceC292790Bdl
    public final boolean LIZIZ() {
        return false;
    }

    @Override // X.C307970C5j, X.InterfaceC292790Bdl
    public final void onEvent() {
    }

    @Override // X.C307970C5j, X.InterfaceC292790Bdl
    public final String getCurrentUid() {
        try {
            String strLIZIZ = ((Boolean) C0B7K.LIZ.getValue()).booleanValue() ? C0XQ7.LIZIZ() : ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            return strLIZIZ != null ? strLIZIZ : "";
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return "";
        }
    }

    @Override // X.C307970C5j, X.InterfaceC292790Bdl
    public final C0C5H LIZ() {
        return ((IAbMockService) ServiceManager.get().getService(IAbMockService.class, false, false)).LIZ();
    }

    @Override // X.C307970C5j, X.InterfaceC292790Bdl
    public final void LIZJ(String str) {
        if (!C05GY.LIZ()) {
            str = C086700Uf.LIZ(str);
        }
        AppLog.setAbSDKVersion(str);
    }
}
