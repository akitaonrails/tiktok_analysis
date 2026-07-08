package X;

import com.ss.android.ugc.aweme.explore.assem.ExploreAssem;
import com.ss.android.ugc.aweme.explore.monitor.ff.Explore0VVTrackerMonitor;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS276S0000000_31;
import njp.a;

/* JADX INFO: renamed from: X.15UO, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.explore.assem.ExploreAssem$StartupStateListener$onStateChange$3", f = "ExploreAssem.kt", l = {}, m = "invokeSuspend")
public final class C15UO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ExploreAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15UO(ExploreAssem exploreAssem, InterfaceC1364105Vn<? super C15UO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = exploreAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15UO(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ExploreAssem$StartupStateListener@9286.onStateChange$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2153908cD c2153908cD = C2153908cD.LIZ;
        this.LL.getClass();
        if (((Boolean) C276650Asp.LIZ.getValue()).booleanValue()) {
            Explore0VVTrackerMonitor.INSTANCE.networkStatus(C15UN.TRIGGER_TASK);
            if (C1583440rJ8.LIZ != 0) {
                if (C0B1Z.LIZ()) {
                    C1306930k79.LIZ.LIZ(AFwS276S0000000_31.get$arr$(326));
                } else if (C0BK3.LIZ()) {
                    C15TX.LLILZLL.LIZIZ(EnumC1568370qup.SERVER_PREFETCH.getValue());
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ExploreAssem$StartupStateListener@9286.onStateChange$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
