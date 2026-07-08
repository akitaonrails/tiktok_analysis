package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.resource.EcomResourceBystander;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS286S0000000_3;
import njp.a;

/* JADX INFO: renamed from: X.08Vs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.page.ai.EcAISearchImagePreloadHelper$prefetchImageForChunk$1", f = "EcAISearchImagePreloadHelper.kt", l = {}, m = "invokeSuspend")
public final class C2129008Vs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ n LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2129008Vs(String str, n nVar, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = nVar;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2129008Vs(this.LLILLJJLI, this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcAISearchImagePreloadHelper@4a83.prefetchImageForChunk$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
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
                Pair pair = new Pair((String) entry2.getKey(), entry2.getValue());
                linkedHashMap2.put(pair.getFirst(), pair.getSecond());
            }
            EcomResourceBystander ecomResourceBystander = EcomResourceBystander.LIZ;
            String str = this.LLILLJJLI;
            AFwS286S0000000_3 aFwS286S0000000_3 = AFwS286S0000000_3.get$arr$(2);
            ecomResourceBystander.getClass();
            EcomResourceBystander.LJIILLIIL(linkedHashMap2, "/aweme/v1/search_ecom/chat/stream/", null, str, aFwS286S0000000_3);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcAISearchImagePreloadHelper@4a83.prefetchImageForChunk$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
