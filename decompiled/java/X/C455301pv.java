package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01pv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.amg.minigameruntime.module.StorageJSWrapKeva$init$1", f = "StorageModule.kt", l = {}, m = "invokeSuspend")
public final class C455301pv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1849390yE5 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C455301pv(C1849390yE5 c1849390yE5, InterfaceC1364105Vn<? super C455301pv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1849390yE5;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C455301pv c455301pv = new C455301pv(this.LLILLJJLI, interfaceC1364105Vn);
        c455301pv.LL = obj;
        return c455301pv;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StorageJSWrapKeva@7dec.init$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C1849210yDn c1849210yDnLIZ = this.LLILLJJLI.LIZ();
            Unit unit = null;
            if (c1849210yDnLIZ != null) {
                C23250099c.LIZLLL(c1849210yDnLIZ.LIZ, null, null, new C455001ps(c1849210yDnLIZ, null), 3);
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("StorageJSWrapKeva@7dec.init$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
