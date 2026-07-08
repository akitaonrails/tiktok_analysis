package X;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05QB, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.performance.core.model.ABPreloadHelper$preloadForSearchLaunch$1", f = "ABPreloadHelper.kt", l = {493}, m = "invokeSuspend")
public final class C05QB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;

    public C05QB(InterfaceC1364105Vn<? super C05QB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05QB c05qb = new C05QB(interfaceC1364105Vn);
        c05qb.LLILLJJLI = obj;
        return c05qb;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Iterator it2;
        C1C7U.LIZ("ABPreloadHelper@4d04.preloadForSearchLaunch$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                it2 = (Iterator) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            int size = (((ArrayList) C05QG.LJFF.getValue()).size() / C05QG.LJ) + 1;
            ArrayList arrayList = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(C23250099c.LIZLLL(interfaceC497601wk, C0PEM.LIZ, null, new C05QC(i2, null), 2));
            }
            it2 = arrayList.iterator();
        }
        while (it2.hasNext()) {
            C09AE c09ae = (C09AE) it2.next();
            this.LLILLJJLI = it2;
            this.LL = 1;
            if (c09ae.LJJZ(this) == objLJFF) {
                C1C7U.LIZIZ("ABPreloadHelper@4d04.preloadForSearchLaunch$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ABPreloadHelper@4d04.preloadForSearchLaunch$1");
        return unit;
    }
}
