package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.search.bubble.aftersearch.EcSearchQuery;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0QaT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.bubble.aftersearch.EcSearchQueryKeva$updateLastEcSearchQueryIntoLocal$2", f = "EcSearchQueryKeva.kt", l = {}, m = "invokeSuspend")
public final class C672950QaT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ EcSearchQuery LL;
    public final /* synthetic */ C672990QaX LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C672950QaT(EcSearchQuery ecSearchQuery, C672990QaX c672990QaX, InterfaceC1364105Vn<? super C672950QaT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = ecSearchQuery;
        this.LLILLJJLI = c672990QaX;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C672950QaT(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C1C7U.LIZ("EcSearchQueryKeva@5b00.updateLastEcSearchQueryIntoLocal$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C1227904rF c1227904rF = C1227904rF.LIZ;
            EcSearchQuery ecSearchQuery = this.LL;
            c1227904rF.getClass();
            String strLJI = C1227904rF.LJI(ecSearchQuery);
            if (strLJI != null) {
                C672990QaX c672990QaX = this.LLILLJJLI;
                c672990QaX.LIZIZ.storeString(c672990QaX.LIZ, strLJI);
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
            unit = Unit.LIZ;
        }
        C1C7U.LIZIZ("EcSearchQueryKeva@5b00.updateLastEcSearchQueryIntoLocal$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
