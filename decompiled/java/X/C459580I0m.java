package X;

import android.os.SystemClock;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.PausingDispatcherKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0I0m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.main.MainFragmentAssemKt$launchOnViewCreated$1", f = "MainFragmentAssem.kt", l = {185}, m = "invokeSuspend")
public final class C459580I0m extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ AbstractC738140SxQ LLILZ;
    public final /* synthetic */ Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C459580I0m(AbstractC738140SxQ abstractC738140SxQ, Function2<? super InterfaceC497601wk, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function2, InterfaceC1364105Vn<? super C459580I0m> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = abstractC738140SxQ;
        this.LLILZIL = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C459580I0m c459580I0m = new C459580I0m(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c459580I0m.LLILLL = obj;
        return c459580I0m;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        long jElapsedRealtimeNanos;
        C1C7U.LIZ("MainFragmentAssemKt@d7c0.launchOnViewCreated$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                jElapsedRealtimeNanos = this.LL;
                obj2 = this.LLILLL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            obj2 = this.LLILLL;
            jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            LifecycleRegistry lifecycle = this.LLILZ.getLifecycle();
            Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> function2 = this.LLILZIL;
            this.LLILLL = obj2;
            this.LL = jElapsedRealtimeNanos;
            this.LLILLJJLI = 1;
            if (PausingDispatcherKt.whenCreated(lifecycle, function2, this) == objLJFF) {
                C1C7U.LIZIZ("MainFragmentAssemKt@d7c0.launchOnViewCreated$1");
                return objLJFF;
            }
        }
        C08TN.LIZ().LIZIZ(SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos, obj2.getClass().getSimpleName());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MainFragmentAssemKt@d7c0.launchOnViewCreated$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
