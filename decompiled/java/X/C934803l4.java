package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.03l4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.core.services.ECAddressService$initAddress$1", f = "ECAddressService.kt", l = {80}, m = "invokeSuspend")
public final class C934803l4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C934803l4(InterfaceC1364105Vn<? super C934803l4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C934803l4(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        int iIntValue;
        C1C7U.LIZ("ECAddressService@5f43.initAddress$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C934703l3 c934703l3 = C934703l3.LL;
                c934703l3.getClass();
                boolean z2 = false;
                if (System.currentTimeMillis() - C934703l3.LLILZLL.getLong("LAST_OSP_FLOW_TYPE_CACHE_TIME", -1L) <= C934703l3.LLILZIL) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    C934703l3.LLILLJJLI = null;
                    C934703l3.LLILLL = null;
                    C934703l3.LJFF(0, false);
                } else {
                    Integer numLIZLLL = C934703l3.LIZLLL();
                    if (numLIZLLL != null) {
                        iIntValue = numLIZLLL.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    if (iIntValue != 0) {
                        z2 = true;
                    }
                }
                if (!z2) {
                    this.LL = 1;
                    if (c934703l3.LIZIZ(this) == objLJFF) {
                        C1C7U.LIZIZ("ECAddressService@5f43.initAddress$1");
                        return objLJFF;
                    }
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECAddressService@5f43.initAddress$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C934803l4(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
