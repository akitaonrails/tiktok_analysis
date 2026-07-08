package X;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS547S0100000_3;
import njp.a;

/* JADX INFO: renamed from: X.098B, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "kotlinx.coroutines.rx2.RxConvertKt$asFlow$1", f = "RxConvert.kt", l = {95}, m = "invokeSuspend")
public final class C098B extends C09AX implements Function2<C094D<Object>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C098D<Object> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C098B(C098D<Object> c098d, InterfaceC1364105Vn<? super C098B> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c098d;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C098B c098b = new C098B(this.LLILLL, interfaceC1364105Vn);
        c098b.LLILLJJLI = obj;
        return c098b;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
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
            final C094D c094d = (C094D) this.LLILLJJLI;
            final AtomicReference atomicReference = new AtomicReference();
            this.LLILLL.LIZIZ(new InterfaceC626120Oh8<Object>() { // from class: X.098A
                @Override // X.InterfaceC626120Oh8
                public final void onComplete() {
                    c094d.LJIIJJI(null);
                }

                @Override // X.InterfaceC626120Oh8
                public final void onError(Throwable th) {
                    c094d.LJIIJJI(th);
                }

                @Override // X.InterfaceC626120Oh8
                public final void onNext(Object obj2) {
                    try {
                        C094C.LIZIZ(c094d, obj2);
                    } catch (InterruptedException unused) {
                    }
                }

                @Override // X.InterfaceC626120Oh8
                public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                    AtomicReference<InterfaceC420801kM> atomicReference2 = atomicReference;
                    while (!atomicReference2.compareAndSet(null, interfaceC420801kM)) {
                        if (atomicReference2.get() != null) {
                            interfaceC420801kM.dispose();
                            return;
                        }
                    }
                }
            });
            AwS547S0100000_3 awS547S0100000_3 = new AwS547S0100000_3(atomicReference, (AtomicReference<InterfaceC420801kM>) 158);
            this.LL = 1;
            if (C23128094k.LIZ(c094d, awS547S0100000_3, this) == objLJFF) {
                return objLJFF;
            }
        }
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C094D<Object> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c094d, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
