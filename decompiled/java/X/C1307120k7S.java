package X;

import com.bytedance.android.starship.engine.graph.foundation.Task;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0k7S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.bytedance.android.starship.engine.graph.scheduling.SerialScheduler$runStrategy$3", f = "SerialScheduler.kt", l = {253}, m = "invokeSuspend")
public final class C1307120k7S extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C05XL<Task.Output> LLILLJJLI;
    public final /* synthetic */ InterfaceC1307160k7W LLILLL;
    public final /* synthetic */ C05XL<Task.Output> LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1307120k7S(C05XL<Task.Output> c05xl, InterfaceC1307160k7W interfaceC1307160k7W, C05XL<Task.Output> c05xl2, String str, InterfaceC1364105Vn<? super C1307120k7S> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c05xl;
        this.LLILLL = interfaceC1307160k7W;
        this.LLILZ = c05xl2;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1307120k7S(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC1307160k7W interfaceC1307160k7W;
        C1C7U.LIZ("SerialScheduler@9e09.runStrategy$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C05XL<Task.Output> c05xl = this.LLILLJJLI;
                this.LL = 1;
                obj = c05xl.LJLIIIL(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("SerialScheduler@9e09.runStrategy$3");
                    return objLJFF;
                }
            }
            Task.Output output = (Task.Output) obj;
            InterfaceC1307160k7W interfaceC1307160k7W2 = this.LLILLL;
            if (interfaceC1307160k7W2 != null) {
                interfaceC1307160k7W2.LLIIIILZ("output", output);
            }
            this.LLILZ.LJIIZILJ(output);
            interfaceC1307160k7W = this.LLILLL;
        } catch (Throwable th) {
            try {
                TryCatchGuardChecker.doCheck(th);
                InterfaceC1307160k7W interfaceC1307160k7W3 = this.LLILLL;
                if (interfaceC1307160k7W3 != null) {
                    String message = th.getMessage();
                    if (message == null) {
                        message = "unknown";
                    }
                    interfaceC1307160k7W3.LJJIJIL("error_msg", message);
                }
                this.LLILZ.LJJJJJ(th);
                interfaceC1307160k7W = this.LLILLL;
                if (interfaceC1307160k7W != null) {
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                InterfaceC1307160k7W interfaceC1307160k7W4 = this.LLILLL;
                if (interfaceC1307160k7W4 != null) {
                    String str = this.LLILZIL;
                    interfaceC1307160k7W4.close();
                    C1307170k7X.LIZ(interfaceC1307160k7W4, str);
                }
                throw th2;
            }
        }
        if (interfaceC1307160k7W != null) {
            String str2 = this.LLILZIL;
            interfaceC1307160k7W.close();
            C1307170k7X.LIZ(interfaceC1307160k7W, str2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SerialScheduler@9e09.runStrategy$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
