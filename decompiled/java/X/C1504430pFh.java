package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0pFh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.perf.prefetch.MinisPrefetcher$getPrefetchedResult$1", f = "MinisPrefetcher.kt", l = {}, m = "invokeSuspend")
public final class C1504430pFh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1504440pFi LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Function1<C1504480pFm, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1504430pFh(C1504440pFi c1504440pFi, String str, Function1<? super C1504480pFm, Unit> function1, InterfaceC1364105Vn<? super C1504430pFh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1504440pFi;
        this.LLILLJJLI = str;
        this.LLILLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1504430pFh(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MinisPrefetcher@40be.getPrefetchedResult$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1504440pFi c1504440pFi = this.LL;
        String str = this.LLILLJJLI;
        Function1<C1504480pFm, Unit> function1 = this.LLILLL;
        Iterator it2 = ((LinkedHashMap) c1504440pFi.LIZJ).values().iterator();
        while (true) {
            if (it2.hasNext()) {
                C1504330pFX c1504330pFX = (C1504330pFX) ((LinkedHashMap) ((C1504450pFj) it2.next()).LIZLLL).get(str);
                if (c1504330pFX != null) {
                    C1504480pFm c1504480pFm = c1504330pFX.LJFF;
                    if (c1504480pFm != null) {
                        function1.invoke(c1504480pFm);
                    } else {
                        c1504330pFX.LJ = function1;
                    }
                }
            } else {
                function1.invoke(C1504480pFm.LJI);
                break;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MinisPrefetcher@40be.getPrefetchedResult$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
