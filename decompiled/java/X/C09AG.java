package X;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09AG, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "kotlinx.coroutines.InterruptibleKt$runInterruptible$2", f = "Interruptible.kt", l = {}, m = "invokeSuspend")
public final class C09AG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<Object>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ Function0<Object> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09AG(Function0<Object> function0, InterfaceC1364105Vn<? super C09AG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C09AG c09ag = new C09AG(this.LLILLJJLI, interfaceC1364105Vn);
        c09ag.LL = obj;
        return c09ag;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        CoroutineContext coroutineContext = ((InterfaceC497601wk) this.LL).getCoroutineContext();
        Function0<Object> function0 = this.LLILLJJLI;
        try {
            C09AE c09aeLJII = C23118094a.LJII(coroutineContext);
            C09AH c09ah = new C09AH(c09aeLJII);
            c09ah.LLILLL = c09aeLJII.LJJJJ(c09ah, true, true);
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C09AH.LLILZ;
            while (true) {
                int i = atomicIntegerFieldUpdater.get(c09ah);
                if (i == 0) {
                    if (C09AH.LLILZ.compareAndSet(c09ah, i, 0)) {
                        break;
                    }
                } else if (i != 2 && i != 3) {
                    C09AH.LIZIZ(i);
                    throw null;
                }
            }
            try {
                return function0.invoke();
            } finally {
                c09ah.LIZ();
            }
        } catch (InterruptedException e) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<Object> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
