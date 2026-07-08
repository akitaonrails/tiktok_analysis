package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Wdv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.bytedance.amg.minigameruntime.common.platform_misc.FilePlatformMiscMultithread$runAsync$1", f = "FilePlatformMiscMultithread.kt", l = {}, m = "invokeSuspend")
public final class C827970Wdv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C2221081BwQ LL;
    public final /* synthetic */ Function1<T, Unit> LLILLJJLI;
    public final /* synthetic */ Function0<T> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C827970Wdv(C2221081BwQ c2221081BwQ, Function1<? super T, Unit> function1, Function0<? extends T> function0, InterfaceC1364105Vn<? super C827970Wdv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c2221081BwQ;
        this.LLILLJJLI = function1;
        this.LLILLL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C827970Wdv(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

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
        Object objLJLJL;
        C1C7U.LIZ("FilePlatformMiscMultithread@6f22.runAsync$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C2221081BwQ c2221081BwQ = this.LL;
            Function0<T> function0 = this.LLILLL;
            if (!c2221081BwQ.LJIIJ.get()) {
                c2221081BwQ.LJIIJJI.incrementAndGet();
                try {
                    if (!c2221081BwQ.LJIIJ.get()) {
                        objLJLJL = function0.invoke();
                        c2221081BwQ.LJIIL.lock();
                        try {
                            if (c2221081BwQ.LJIIJJI.decrementAndGet() == 0) {
                                c2221081BwQ.LJIILIIL.signalAll();
                            }
                            c2221081BwQ.LJIIL.unlock();
                        } finally {
                        }
                    } else {
                        throw new IllegalStateException("FileService closed");
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c2221081BwQ.LJIIL.lock();
                    try {
                        if (c2221081BwQ.LJIIJJI.decrementAndGet() == 0) {
                            c2221081BwQ.LJIILIIL.signalAll();
                        }
                        c2221081BwQ.LJIIL.unlock();
                        throw th;
                    } finally {
                    }
                }
            } else {
                throw new IllegalStateException("FileService closed");
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            objLJLJL = C2221081BwQ.LJLJL(th2, null);
        }
        this.LLILLJJLI.invoke(objLJLJL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FilePlatformMiscMultithread@6f22.runAsync$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
