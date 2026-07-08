package X;

import com.ss.android.ugc.aweme.ecommerce.search.bubble.aftersearch.EcSearchQuery;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0QaV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.bubble.aftersearch.EcSearchQueryManager$init$1", f = "EcSearchQueryManager.kt", l = {30}, m = "invokeSuspend")
public final class C672970QaV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C672970QaV(InterfaceC1364105Vn<? super C672970QaV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C672970QaV(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EcSearchQuery ecSearchQuery;
        C1C7U.LIZ("EcSearchQueryManager@123b.init$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C672990QaX c672990QaX = C672980QaW.LLILLL;
            ecSearchQuery = null;
            if (c672990QaX != null) {
                this.LL = 1;
                obj = C23250099c.LJI(this, C0PEM.LIZJ, new C672960QaU(c672990QaX, null));
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("EcSearchQueryManager@123b.init$1");
                    return objLJFF;
                }
            }
            C672980QaW.LLILZ = ecSearchQuery;
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("EcSearchQueryManager@123b.init$1");
            return unit;
        }
        ecSearchQuery = (EcSearchQuery) obj;
        C672980QaW.LLILZ = ecSearchQuery;
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("EcSearchQueryManager@123b.init$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C672970QaV(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
