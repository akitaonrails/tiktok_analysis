package X;

import com.bytedance.touchpoint.api.model.TaskEvent;
import com.bytedance.touchpoint.api.service.IInteractiveService;
import com.bytedance.touchpoint.api.service.IMultiDomainService;
import com.bytedance.touchpoint.api.service.IWatchVideoService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0zUg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1898120zUg extends C09AY implements Function0<Unit> {
    public C1898120zUg() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1898110zUf c1898110zUf = C1898110zUf.LL;
        C1898110zUf.LJIIJ();
        C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
        List<TaskEvent> list = C2178808gE.LIZ().LIZIZ;
        if (list != null && !list.isEmpty()) {
            List<InterfaceC1898130zUh> list2 = C1898110zUf.LLILZ;
            Map<Integer, InterfaceC1898470zVF<TaskEvent>> map = C1898110zUf.LLILZIL;
            IWatchVideoService.LIZ.getClass();
            IWatchVideoService iWatchVideoServiceLIZ = C1898160zUk.LIZ();
            if (iWatchVideoServiceLIZ != null) {
                iWatchVideoServiceLIZ.LIZIZ(list2, list, map);
            }
            ((IInteractiveService) ServiceManager.get().getService(IInteractiveService.class)).LIZJ(list2, list);
            ((IMultiDomainService) ServiceManager.get().getService(IMultiDomainService.class)).LIZIZ(list2, list, map);
        }
        return Unit.LIZ;
    }
}
