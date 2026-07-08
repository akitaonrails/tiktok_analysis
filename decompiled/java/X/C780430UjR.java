package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0UjR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.notification.governor.ActionRegistry$actions$20$1", f = "ActionRegistry.kt", l = {}, m = "invokeSuspend")
public final class C780430UjR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C780430UjR(InterfaceC1364105Vn<? super C780430UjR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C780430UjR(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ActionRegistry@a77c.actions$20$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C792720V7u c792720V7u = C787960Uva.LIZ;
        synchronized (c792720V7u.LL) {
            try {
                c792720V7u.LL.clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ActionRegistry@a77c.actions$20$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C780430UjR(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
