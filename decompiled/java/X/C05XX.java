package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05XX, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "androidx.room.CoroutinesRoom$Companion$execute$4$job$1", f = "CoroutinesRoom.kt", l = {}, m = "invokeSuspend")
public final class C05XX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Callable<Object> LL;
    public final /* synthetic */ InterfaceC20236714Gf<Object> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05XX(Callable<Object> callable, InterfaceC20236714Gf<Object> interfaceC20236714Gf, InterfaceC1364105Vn<? super C05XX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = callable;
        this.LLILLJJLI = interfaceC20236714Gf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05XX(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            Object objCall = this.LL.call();
            InterfaceC20236714Gf<Object> interfaceC20236714Gf = this.LLILLJJLI;
            C189200o6.m2constructorimpl(objCall);
            interfaceC20236714Gf.resumeWith(objCall);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            InterfaceC20236714Gf<Object> interfaceC20236714Gf2 = this.LLILLJJLI;
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            interfaceC20236714Gf2.resumeWith(c098200Yq);
        }
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
