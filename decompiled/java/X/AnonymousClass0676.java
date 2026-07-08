package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pipo.probe.IProbeService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0676, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.init.ProbeApplogObserverBootTask$start$1", f = "ProbeApplogObserverBootTask.kt", l = {}, m = "invokeSuspend")
public final class AnonymousClass0676 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public AnonymousClass0676(InterfaceC1364105Vn<? super AnonymousClass0676> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new AnonymousClass0676(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("ProbeApplogObserverBootTask@73cf.start$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            IProbeService iProbeService = (IProbeService) PluggableExtentionKt.pluggableSpi$default(IProbeService.class, false, false, false, 14, null);
            if (iProbeService != null) {
                AnonymousClass0677.LIZ("start_applog_observer", "");
                iProbeService.LIZIZ();
            } else {
                AnonymousClass0677.LIZ("sdk_unavailable", "");
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            AtomicBoolean atomicBoolean = AnonymousClass0677.LIZ;
            String message = thM5exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "unknown";
            }
            AnonymousClass0677.LIZ("boot_task_exception", message);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ProbeApplogObserverBootTask@73cf.start$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new AnonymousClass0676(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
