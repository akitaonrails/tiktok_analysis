package X;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS574S0100000_30;
import njp.a;

/* JADX INFO: renamed from: X.05KJ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.fyp.affiliate.button.manager.EcProductAddShowManager$initSQLHelper$1", f = "EcProductAddShowManager.kt", l = {}, m = "invokeSuspend")
public final class C05KJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Context LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05KJ(Context context, InterfaceC1364105Vn<? super C05KJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05KJ(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcProductAddShowManager@5747.initSQLHelper$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ConcurrentHashMap<String, Object> concurrentHashMap = C1892170zL5.LIZ;
        C1892170zL5.LIZLLL("init", new AwS574S0100000_30(this.LL, 336));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcProductAddShowManager@5747.initSQLHelper$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
