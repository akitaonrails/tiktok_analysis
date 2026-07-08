package X;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01NS, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.network.EcomTaskManager$onNetworkCallback$1", f = "EcomTaskManager.kt", l = {32}, m = "invokeSuspend")
public final class C01NS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ List<C01NT> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01NS(List<C01NT> list, InterfaceC1364105Vn<? super C01NS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01NS(this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Iterator<C01NT> it2;
        C1C7U.LIZ("EcomTaskManager@7f34.onNetworkCallback$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                it2 = (Iterator) this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            List<C01NT> list = this.LLILLL;
            if (list != null) {
                it2 = list.iterator();
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("EcomTaskManager@7f34.onNetworkCallback$1");
            return unit;
        }
        while (it2.hasNext()) {
            C01NT next = it2.next();
            this.LL = it2;
            this.LLILLJJLI = 1;
            if (next.LIZ() == objLJFF) {
                C1C7U.LIZIZ("EcomTaskManager@7f34.onNetworkCallback$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("EcomTaskManager@7f34.onNetworkCallback$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
