package X;

import com.ss.android.ugc.aweme.ecommerce.event.monitor.IPageNodeMonitorService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0vnV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1756030vnV {
    public static final void LIZ(InterfaceC1740480vOQ interfaceC1740480vOQ) {
        ((IPageNodeMonitorService) ServiceManager.get().getService(IPageNodeMonitorService.class)).LIZ(interfaceC1740480vOQ.getPageName());
    }

    public static final boolean LIZJ(InterfaceC1740480vOQ interfaceC1740480vOQ, Function0<Unit> function0, Function0<Unit> function02) {
        return ((IPageNodeMonitorService) ServiceManager.get().getService(IPageNodeMonitorService.class)).LJ(interfaceC1740480vOQ.getPageName(), function0, function02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZIZ(InterfaceC1740480vOQ interfaceC1740480vOQ, List list, EnumC1756020vnU enumC1756020vnU, HashMap map, int i) {
        if ((i & 1) != 0) {
            list = C13BV.INSTANCE;
        }
        if ((i & 2) != 0) {
            enumC1756020vnU = EnumC1756020vnU.UNDEFINE;
        }
        if ((i & 4) != 0) {
            map = null;
        }
        ((IPageNodeMonitorService) ServiceManager.get().getService(IPageNodeMonitorService.class)).LJFF(interfaceC1740480vOQ.getPageName(), C1748730vbj.LIZIZ(interfaceC1740480vOQ, "lib_track_builtin_lane_business"), map);
        ((IPageNodeMonitorService) ServiceManager.get().getService(IPageNodeMonitorService.class)).LJI(interfaceC1740480vOQ.getPageName(), list, enumC1756020vnU);
    }
}
