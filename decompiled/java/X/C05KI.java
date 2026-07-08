package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS219S0000000_30;

/* JADX INFO: renamed from: X.05KI, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.fyp.affiliate.button.manager.EcProductAddShowManager$hideButtonIfConditionMet$1$1$1", f = "EcProductAddShowManager.kt", l = {}, m = "invokeSuspend")
public final class C05KI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public C05KI(InterfaceC1364105Vn<? super C05KI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05KI(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcProductAddShowManager@5747.hideButtonIfConditionMet$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ConcurrentHashMap<String, Object> concurrentHashMap = C1892170zL5.LIZ;
        Object objLIZLLL = C1892170zL5.LIZLLL("query", AFwS219S0000000_30.get$arr$(254));
        C1C7U.LIZIZ("EcProductAddShowManager@5747.hideButtonIfConditionMet$1$1$1");
        return objLIZLLL;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return new C05KI(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
