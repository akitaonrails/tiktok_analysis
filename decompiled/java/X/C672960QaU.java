package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.search.bubble.aftersearch.EcSearchQuery;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0QaU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.bubble.aftersearch.EcSearchQueryKeva$getLastEcSearchQueryFromLocal$2", f = "EcSearchQueryKeva.kt", l = {}, m = "invokeSuspend")
public final class C672960QaU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super EcSearchQuery>, Object> {
    public final /* synthetic */ C672990QaX LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C672960QaU(C672990QaX c672990QaX, InterfaceC1364105Vn<? super C672960QaU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c672990QaX;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C672960QaU(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcSearchQueryKeva@5b00.getLastEcSearchQueryFromLocal$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        EcSearchQuery ecSearchQuery = null;
        try {
            C672990QaX c672990QaX = this.LL;
            String string = c672990QaX.LIZIZ.getString(c672990QaX.LIZ, null);
            if (string != null) {
                C1227904rF.LIZ.getClass();
                ecSearchQuery = (EcSearchQuery) C1227904rF.LIZIZ(string, EcSearchQuery.class);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1C7U.LIZIZ("EcSearchQueryKeva@5b00.getLastEcSearchQueryFromLocal$2");
        return ecSearchQuery;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super EcSearchQuery> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
