package X;

import com.bytedance.hybrid.spark.security.impl.SparkSecurityTTNetIntercept;
import com.bytedance.i18n.region.StoreRegionSource;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.pumbaa.hybrid.governance.network.HybridTrafficColoringInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.sandbox.api.services.ISandboxService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.legoImp.task.pumbaa.ThirdNetMonitorInterceptor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Wvw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C839140Wvw extends C09AY implements Function1<Object, Unit> {
    public C839140Wvw() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Object obj) {
        C1515200pX4 c1515200pX4 = (C1515200pX4) obj;
        c1515200pX4.LIZJ(new SparkSecurityTTNetIntercept());
        if (C822030WMn.LIZ().enabled) {
            c1515200pX4.LIZJ(new HybridTrafficColoringInterceptor());
        }
        StoreRegionSource.LIZ.getClass();
        c1515200pX4.LIZJ(StoreRegionSource.LJ);
        InterfaceC1904907d9 interfaceC1904907d9LIZJ = ((ISandboxService) ServiceManager.get().getService(ISandboxService.class)).LIZJ();
        if (interfaceC1904907d9LIZJ != null) {
            c1515200pX4.LIZJ(interfaceC1904907d9LIZJ);
        }
        try {
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("bpea_3rd_network_event", false)) {
                c1515200pX4.LIZJ(new ThirdNetMonitorInterceptor());
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return Unit.LIZ;
    }
}
