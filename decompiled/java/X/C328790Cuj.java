package X;

import com.bytedance.ies.im.core.bridge.init.queryexp.QueryExpManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Cuj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.ies.im.core.bridge.init.queryexp.QueryExpManager$afterSDKLogin$1", f = "QueryExpManager.kt", l = {}, m = "invokeSuspend")
public final class C328790Cuj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C328790Cuj(InterfaceC1364105Vn<? super C328790Cuj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C328790Cuj(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("QueryExpManager@84cc.afterSDKLogin$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (C328780Cui.LIZ().forceClearEnabled) {
            synchronized (C328840Cuo.LIZ) {
                C328840Cuo.LIZ().clear();
            }
        } else {
            QueryExpManager queryExpManager = QueryExpManager.LIZIZ;
            QueryExpManager.LJFF();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("QueryExpManager@84cc.afterSDKLogin$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C328790Cuj(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
