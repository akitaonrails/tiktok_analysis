package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Yzx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tars.impl.TarsPipeLine$downloadResource$1$results$1$1$1", f = "TarsPipeLine.kt", l = {190}, m = "invokeSuspend")
public final class C892590Yzx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends C0Z03, ? extends C189200o6<? extends Object>>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0Z03 LLILLL;
    public final /* synthetic */ C0Z0A LLILZ;
    public final /* synthetic */ InterfaceC882520Yji LLILZIL;
    public final /* synthetic */ AtomicBoolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C892590Yzx(C0Z03 c0z03, C0Z0A c0z0a, InterfaceC882520Yji interfaceC882520Yji, AtomicBoolean atomicBoolean, InterfaceC1364105Vn<? super C892590Yzx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0z03;
        this.LLILZ = c0z0a;
        this.LLILZIL = interfaceC882520Yji;
        this.LLILZLL = atomicBoolean;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C892590Yzx c892590Yzx = new C892590Yzx(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c892590Yzx.LLILLJJLI = obj;
        return c892590Yzx;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
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
        C0Z03 c0z03;
        Object obj2;
        C1C7U.LIZ("TarsPipeLine@e947.downloadResource$1$results$1$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                c0z03 = this.LLILLJJLI;
                try {
                    C155000ia.LIZIZ(obj);
                    c0z03 = c0z03;
                } catch (Throwable th) {
                    th = th;
                    TryCatchGuardChecker.doCheck(th);
                    obj = new C098200Yq(th);
                    C189200o6.m2constructorimpl(obj);
                    obj2 = c0z03;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            c0z03 = this.LLILLL;
            C0Z0A c0z0a = this.LLILZ;
            InterfaceC882520Yji interfaceC882520Yji = this.LLILZIL;
            AtomicBoolean atomicBoolean = this.LLILZLL;
            try {
                this.LLILLJJLI = c0z03;
                this.LL = 1;
                obj = c0z0a.LIZ(c0z03, interfaceC882520Yji, atomicBoolean, this);
                c0z03 = c0z03;
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("TarsPipeLine@e947.downloadResource$1$results$1$1$1");
                    return objLJFF;
                }
            } catch (Throwable th2) {
                th = th2;
                TryCatchGuardChecker.doCheck(th);
                obj = new C098200Yq(th);
                C189200o6.m2constructorimpl(obj);
                obj2 = c0z03;
            }
        }
        C189200o6.m2constructorimpl(obj);
        obj2 = c0z03;
        Pair pair = new Pair(obj2, C189200o6.m1boximpl(obj));
        C1C7U.LIZIZ("TarsPipeLine@e947.downloadResource$1$results$1$1$1");
        return pair;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends C0Z03, ? extends C189200o6<? extends Object>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
