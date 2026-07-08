package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.search.result.api.EcSearchApi;
import com.ss.android.ugc.aweme.ecommerce.search.result.ui.DynamicSearchStoreVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS589S0100000_10;
import njp.a;

/* JADX INFO: renamed from: X.0Qeb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.result.ui.DynamicSearchStoreVM$fetchSearchDataList$1", f = "StoreSearchResultTempConstants.kt", l = {}, m = "invokeSuspend")
public final class C675510Qeb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C674800QdS LLILLJJLI;
    public final /* synthetic */ DynamicSearchStoreVM LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C675510Qeb(C674800QdS c674800QdS, DynamicSearchStoreVM dynamicSearchStoreVM, InterfaceC1364105Vn<? super C675510Qeb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c674800QdS;
        this.LLILLL = dynamicSearchStoreVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C675510Qeb c675510Qeb = new C675510Qeb(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c675510Qeb.LL = obj;
        return c675510Qeb;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        n nVarLJII;
        C1C7U.LIZ("DynamicSearchStoreVM@beb4.fetchSearchDataList$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        try {
            EcSearchApi ecSearchApi = EcSearchApi.LIZ;
            nVarLJII = EcSearchApi.LJII(this.LLILLJJLI);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILLL.setState(new AwS589S0100000_10(e, 396));
        }
        if (!C23118094a.LJIIIIZZ(interfaceC497601wk.getCoroutineContext())) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("DynamicSearchStoreVM@beb4.fetchSearchDataList$1");
            return unit;
        }
        this.LLILLL.setState(new AwS589S0100000_10(nVarLJII, 395));
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("DynamicSearchStoreVM@beb4.fetchSearchDataList$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
