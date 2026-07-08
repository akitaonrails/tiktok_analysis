package X;

import com.bytedance.android.starship.engine.graph.foundation.Task;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0k7T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.bytedance.android.starship.engine.graph.scheduling.SerialScheduler$scheduleForNode$1$1", f = "SerialScheduler.kt", l = {310}, m = "invokeSuspend")
public final class C1307130k7T extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Task LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ InterfaceC1307160k7W LLILZ;
    public final /* synthetic */ C1307150k7V LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1307130k7T(Task task, long j, InterfaceC1307160k7W interfaceC1307160k7W, C1307150k7V c1307150k7V, InterfaceC1364105Vn<? super C1307130k7T> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = task;
        this.LLILLL = j;
        this.LLILZ = interfaceC1307160k7W;
        this.LLILZIL = c1307150k7V;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1307130k7T(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SerialScheduler@9e09.scheduleForNode$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            try {
                if (i != 0) {
                    if (i == 1) {
                        C155000ia.LIZIZ(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    C155000ia.LIZIZ(obj);
                    C099F c099fLIZIZ = C090F.LIZIZ();
                    this.LLILLJJLI.LLIZ.add(new C1307190k7Z(this.LLILLL, c099fLIZIZ));
                    this.LL = 1;
                    if (c099fLIZIZ.LJLIIIL(this) == objLJFF) {
                        C1C7U.LIZIZ("SerialScheduler@9e09.scheduleForNode$1$1");
                        return objLJFF;
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                InterfaceC1307160k7W interfaceC1307160k7W = this.LLILLJJLI.LLIZLLLIL;
                if (interfaceC1307160k7W != null) {
                    String message = e.getMessage();
                    if (message == null) {
                        message = "unknown";
                    }
                    interfaceC1307160k7W.LJJIJIL("error_msg", message);
                }
            }
            this.LLILZ.close();
            C1307170k7X.LIZ(this.LLILZ, this.LLILZIL.LIZ);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SerialScheduler@9e09.scheduleForNode$1$1");
            return unit;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILZ.close();
            C1307170k7X.LIZ(this.LLILZ, this.LLILZIL.LIZ);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
