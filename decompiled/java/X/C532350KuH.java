package X;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KuH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipeline.framework.FlowGraph$run$2$1$1", f = "FlowGraph.kt", l = {176}, m = "invokeSuspend")
public final class C532350KuH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C532540Kua<FLOW_CONTEXT> LLILLJJLI;
    public final /* synthetic */ C532440KuQ<FLOW_CONTEXT, ?, ?> LLILLL;
    public final /* synthetic */ FLOW_CONTEXT LLILZ;
    public final /* synthetic */ ConcurrentHashMap<String, InterfaceC532390KuL<Object>> LLILZIL;
    public final /* synthetic */ Map<String, C05XL<InterfaceC532390KuL<Object>>> LLILZLL;
    public final /* synthetic */ InterfaceC532530KuZ LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C532350KuH(C532540Kua<FLOW_CONTEXT> c532540Kua, C532440KuQ<FLOW_CONTEXT, ?, ?> c532440KuQ, FLOW_CONTEXT flow_context, ConcurrentHashMap<String, InterfaceC532390KuL<Object>> concurrentHashMap, Map<String, ? extends C05XL<InterfaceC532390KuL<Object>>> map, InterfaceC532530KuZ interfaceC532530KuZ, InterfaceC1364105Vn<? super C532350KuH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c532540Kua;
        this.LLILLL = c532440KuQ;
        this.LLILZ = flow_context;
        this.LLILZIL = concurrentHashMap;
        this.LLILZLL = map;
        this.LLIZ = interfaceC532530KuZ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C532350KuH(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FlowGraph@bf8f.run$2$1$1");
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
            C532540Kua<FLOW_CONTEXT> c532540Kua = this.LLILLJJLI;
            Object obj2 = this.LLILLL;
            FLOW_CONTEXT flow_context = this.LLILZ;
            ConcurrentHashMap<String, InterfaceC532390KuL<Object>> concurrentHashMap = this.LLILZIL;
            Map<String, ? extends C05XL<InterfaceC532390KuL<Object>>> map = this.LLILZLL;
            InterfaceC532530KuZ interfaceC532530KuZ = this.LLIZ;
            this.LL = 1;
            obj = c532540Kua.LIZLLL(obj2, flow_context, concurrentHashMap, map, interfaceC532530KuZ, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("FlowGraph@bf8f.run$2$1$1");
                return objLJFF;
            }
        }
        this.LLILZIL.put(this.LLILLL.LIZIZ(), obj);
        ((C05XL) C2097608Jq.LJFF(this.LLILLL.LIZIZ(), this.LLILZLL)).LJIIZILJ(obj);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FlowGraph@bf8f.run$2$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
