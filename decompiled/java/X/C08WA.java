package X;

import com.google.gson.n;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08WA, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.page.mix.container.repo.BaseMixLoadMoreRepo$doWork$2$2", f = "BaseMixLoadMoreRepo.kt", l = {}, m = "invokeSuspend")
public final class C08WA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ n LL;
    public final /* synthetic */ AbstractC677510Qhp LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C08WA(n nVar, AbstractC677510Qhp abstractC677510Qhp, InterfaceC1364105Vn<? super C08WA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = nVar;
        this.LLILLJJLI = abstractC677510Qhp;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C08WA(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseMixLoadMoreRepo@9cb2.doWork$2$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1920707fh c1920707fh = new C1920707fh(this.LL);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Object> entry : c1920707fh.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set<Map.Entry> setEntrySet = linkedHashMap.entrySet();
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(setEntrySet, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iLIZIZ);
        for (Map.Entry entry2 : setEntrySet) {
            Pair pair = new Pair(entry2.getKey(), entry2.getValue());
            linkedHashMap2.put(pair.getFirst(), pair.getSecond());
        }
        this.LLILLJJLI.getClass();
        AbstractC677510Qhp.LJIIJJI("/aweme/v1/search/single/bff/ecom/", linkedHashMap2);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseMixLoadMoreRepo@9cb2.doWork$2$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
