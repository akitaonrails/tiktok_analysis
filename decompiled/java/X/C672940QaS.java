package X;

import com.ss.android.ugc.aweme.ecommerce.search.bubble.aftersearch.EcSearchQuery;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0QaS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.bubble.aftersearch.EcSearchQueryManager$updateLastEcSearchQuery$1", f = "EcSearchQueryManager.kt", l = {58}, m = "invokeSuspend")
public final class C672940QaS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EcSearchQuery LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C672940QaS(EcSearchQuery ecSearchQuery, InterfaceC1364105Vn<? super C672940QaS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = ecSearchQuery;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C672940QaS(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcSearchQueryManager@123b.updateLastEcSearchQuery$1");
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
            if (c672990QaX != null) {
                EcSearchQuery ecSearchQuery = this.LLILLJJLI;
                this.LL = 1;
                if (C23250099c.LJI(this, C0PEM.LIZJ, new C672950QaT(ecSearchQuery, c672990QaX, null)) == objLJFF) {
                    C1C7U.LIZIZ("EcSearchQueryManager@123b.updateLastEcSearchQuery$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcSearchQueryManager@123b.updateLastEcSearchQuery$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
