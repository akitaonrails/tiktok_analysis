package X;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08fJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.loadretreat.EcomLoadRetreatManager$lifecycleExit$2", f = "EcomLoadRetreatManager.kt", l = {}, m = "invokeSuspend")
public final class C2173108fJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<String> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2173108fJ(List<String> list, InterfaceC1364105Vn<? super C2173108fJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2173108fJ(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcomLoadRetreatManager@da7f.lifecycleExit$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        CopyOnWriteArraySet<InterfaceC2173208fK> copyOnWriteArraySet = C1507830pLB.LJIIIIZZ;
        List<String> list = this.LL;
        Iterator<InterfaceC2173208fK> it2 = copyOnWriteArraySet.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(list);
        }
        List<String> list2 = this.LL;
        Iterator<String> it3 = list2.iterator();
        while (it3.hasNext()) {
            CopyOnWriteArraySet<InterfaceC2173208fK> copyOnWriteArraySet2 = C1507830pLB.LJIIIZ.get(it3.next());
            if (copyOnWriteArraySet2 != null) {
                Iterator<InterfaceC2173208fK> it4 = copyOnWriteArraySet2.iterator();
                while (it4.hasNext()) {
                    it4.next().LIZ(list2);
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcomLoadRetreatManager@da7f.lifecycleExit$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
