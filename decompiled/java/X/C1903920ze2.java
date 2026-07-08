package X;

import com.ss.android.ugc.aweme.websocket.api.service.IWsMonitorService;
import com.ss.android.ugc.aweme.websocket.bridge.WsMonitor;

/* JADX INFO: renamed from: X.0ze2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1903920ze2 implements IWsMonitorService {
    public static final C1903920ze2 LIZIZ = new C1903920ze2();
    public final /* synthetic */ IWsMonitorService LIZ;

    @Override // com.ss.android.ugc.aweme.websocket.api.service.IWsMonitorService
    public final void LIZ(EnumC1781820wT6 enumC1781820wT6) {
        this.LIZ.LIZ(enumC1781820wT6);
    }

    @Override // com.ss.android.ugc.aweme.websocket.api.service.IWsMonitorService
    public final void LIZIZ(EnumC1781820wT6 enumC1781820wT6) {
        this.LIZ.LIZIZ(enumC1781820wT6);
    }

    public C1903920ze2() {
        IWsMonitorService iWsMonitorService;
        Object objLIZ = C04TD.LIZ(IWsMonitorService.class, false);
        if (objLIZ != null) {
            iWsMonitorService = (IWsMonitorService) objLIZ;
        } else {
            if (C04TD.h6 == null) {
                synchronized (IWsMonitorService.class) {
                    if (C04TD.h6 == null) {
                        C04TD.h6 = new WsMonitor();
                    }
                }
            }
            iWsMonitorService = C04TD.h6;
        }
        this.LIZ = iWsMonitorService;
    }
}
