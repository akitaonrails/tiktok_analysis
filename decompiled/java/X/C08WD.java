package X;

import com.google.gson.n;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08WD, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.page.mix.container.repo.MixPreloadHandler$executeContentRefreshPreload$1", f = "MixPreloadHandler.kt", l = {}, m = "invokeSuspend")
public final class C08WD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ n LL;
    public final /* synthetic */ C08YL LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C08WD(n nVar, C08YL c08yl, String str, InterfaceC1364105Vn<? super C08WD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = nVar;
        this.LLILLJJLI = c08yl;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C08WD(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MixPreloadHandler@2fe2.executeContentRefreshPreload$1");
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
        this.LLILLJJLI.LJII(null, -100, this.LLILLL, linkedHashMap2);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MixPreloadHandler@2fe2.executeContentRefreshPreload$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
