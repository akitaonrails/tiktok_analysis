package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.consent.PNSBeforeConsentActionInvoker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Qxq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.consent.PNSBeforeConsentActionInvoker$doPreInvoke$1", f = "PNSBeforeConsentActionInvoker.kt", l = {}, m = "invokeSuspend")
public final class C687440Qxq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;

    public C687440Qxq(InterfaceC1364105Vn<? super C687440Qxq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C687440Qxq c687440Qxq = new C687440Qxq(interfaceC1364105Vn);
        c687440Qxq.LL = obj;
        return c687440Qxq;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("PNSBeforeConsentActionInvoker@e6e9.doPreInvoke$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C1915720zx4 c1915720zx4 = C1915720zx4.LIZ;
            String key = EnumC683800Qry.DEVICE_CONSENT.getKey();
            c1915720zx4.getClass();
            c098200Yq = C1915720zx4.LIZ(key, null);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            PNSBeforeConsentActionInvoker.primed = true;
        } else {
            PNSBeforeConsentActionInvoker.primingScheduled.set(false);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PNSBeforeConsentActionInvoker@e6e9.doPreInvoke$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
