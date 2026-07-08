package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05CE, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.probe.core.EventCacheManager$saveCache$1", f = "EventCacheManager.kt", l = {}, m = "invokeSuspend")
public final class C05CE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<AnonymousClass1489> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05CE(List<AnonymousClass1489> list, InterfaceC1364105Vn<? super C05CE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05CE(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("EventCacheManager@9091.saveCache$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<AnonymousClass1489> list = this.LL;
        try {
            C1227904rF.LIZ.getClass();
            C05CF.LIZ.storeString("probe_sdk_cache_key", C1227904rF.LJI(list));
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            Keva keva = C05CF.LIZ;
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C05CD(null), 2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EventCacheManager@9091.saveCache$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
