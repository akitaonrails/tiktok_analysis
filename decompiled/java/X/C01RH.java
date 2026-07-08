package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01RH, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.hybrid.impl.AbsAdHybridSparkLoader$optimizeTaskExecute$1", f = "AbsAdHybridSparkLoader.kt", l = {790}, m = "invokeSuspend")
public final class C01RH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ Function0<T> LLILLL;
    public final /* synthetic */ Function1<T, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01RH(InterfaceC1364105Vn interfaceC1364105Vn, Function0 function0, Function1 function1) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = function0;
        this.LLILZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01RH(interfaceC1364105Vn, this.LLILLL, this.LLILZ);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
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
        C1C7U.LIZ("AbsAdHybridSparkLoader@ddb.optimizeTaskExecute$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                th = (Throwable) this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C259800zU c259800zU = new C259800zU();
            try {
                ?? Invoke = this.LLILLL.invoke();
                c259800zU.element = Invoke;
                this.LLILZ.invoke(Invoke);
            } catch (Throwable th) {
                th = th;
                TryCatchGuardChecker.doCheck(th);
                C1DFH c1dfh = C0PEM.LIZ;
                AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                C01RG c01rg = new C01RG(c259800zU, this.LLILZ, this.LLILLL, null);
                this.LL = th;
                this.LLILLJJLI = 1;
                if (C23250099c.LJI(this, abstractC2238408pq, c01rg) == objLJFF) {
                    C1C7U.LIZIZ("AbsAdHybridSparkLoader@ddb.optimizeTaskExecute$1");
                    return objLJFF;
                }
                C1AF0.LJFF(th, "CommerceFluencyOptimization_isOptimizeRenderAtSubThread");
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("AbsAdHybridSparkLoader@ddb.optimizeTaskExecute$1");
            return unit;
        }
        C1AF0.LJFF(th, "CommerceFluencyOptimization_isOptimizeRenderAtSubThread");
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AbsAdHybridSparkLoader@ddb.optimizeTaskExecute$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
