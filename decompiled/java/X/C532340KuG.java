package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KuG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipeline.framework.FlowGraph$run$2", f = "FlowGraph.kt", l = {}, m = "invokeSuspend")
public final class C532340KuG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C532540Kua<FLOW_CONTEXT> LLILLJJLI;
    public final /* synthetic */ FLOW_CONTEXT LLILLL;
    public final /* synthetic */ ConcurrentHashMap<String, InterfaceC532390KuL<Object>> LLILZ;
    public final /* synthetic */ Map<String, C05XL<InterfaceC532390KuL<Object>>> LLILZIL;
    public final /* synthetic */ InterfaceC532530KuZ LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C532340KuG(C532540Kua<FLOW_CONTEXT> c532540Kua, FLOW_CONTEXT flow_context, ConcurrentHashMap<String, InterfaceC532390KuL<Object>> concurrentHashMap, Map<String, ? extends C05XL<InterfaceC532390KuL<Object>>> map, InterfaceC532530KuZ interfaceC532530KuZ, InterfaceC1364105Vn<? super C532340KuG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c532540Kua;
        this.LLILLL = flow_context;
        this.LLILZ = concurrentHashMap;
        this.LLILZIL = map;
        this.LLILZLL = interfaceC532530KuZ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C532340KuG c532340KuG = new C532340KuG(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c532340KuG.LL = obj;
        return c532340KuG;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FlowGraph@bf8f.run$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        C532540Kua<FLOW_CONTEXT> c532540Kua = this.LLILLJJLI;
        List<C532440KuQ<FLOW_CONTEXT, ?, ?>> list = c532540Kua.LIZIZ;
        FLOW_CONTEXT flow_context = this.LLILLL;
        ConcurrentHashMap<String, InterfaceC532390KuL<Object>> concurrentHashMap = this.LLILZ;
        Map<String, C05XL<InterfaceC532390KuL<Object>>> map = this.LLILZIL;
        InterfaceC532530KuZ interfaceC532530KuZ = this.LLILZLL;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C23250099c.LIZLLL(interfaceC497601wk, null, null, new C532350KuH(c532540Kua, (C532440KuQ) it2.next(), flow_context, concurrentHashMap, map, interfaceC532530KuZ, null), 3);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FlowGraph@bf8f.run$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
