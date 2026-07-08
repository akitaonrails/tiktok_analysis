package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06WP, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "androidx.compose.ui.SessionMutex$withSessionCancellingPrevious$2", f = "SessionMutex.kt", l = {61, 63}, m = "invokeSuspend")
public final class C06WP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<Object>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Function1<InterfaceC497601wk, Object> LLILLL;
    public final /* synthetic */ AtomicReference<C06WQ<Object>> LLILZ;
    public final /* synthetic */ Function2<Object, InterfaceC1364105Vn<Object>, Object> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06WP(AtomicReference atomicReference, InterfaceC1364105Vn interfaceC1364105Vn, Function1 function1, Function2 function2) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = function1;
        this.LLILZ = atomicReference;
        this.LLILZIL = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C06WP c06wp = new C06WP(this.LLILZ, interfaceC1364105Vn, this.LLILLL, this.LLILZIL);
        c06wp.LLILLJJLI = obj;
        return c06wp;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C06WQ<Object> c06wq;
        Object obj2;
        AtomicReference<C06WQ<Object>> atomicReference;
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            try {
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            Object obj3 = this.LLILLJJLI;
                            C155000ia.LIZIZ(obj);
                            obj2 = obj3;
                            atomicReference = this.LLILZ;
                            while (!atomicReference.compareAndSet((C06WQ<Object>) obj2, null) && atomicReference.get() == obj2) {
                            }
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C06WQ<Object> c06wq2 = (C06WQ) this.LLILLJJLI;
                    C155000ia.LIZIZ(obj);
                    c06wq = c06wq2;
                } else {
                    C155000ia.LIZIZ(obj);
                    InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                    C06WQ<Object> c06wq3 = new C06WQ<>(C23118094a.LJII(interfaceC497601wk.getCoroutineContext()), this.LLILLL.invoke(interfaceC497601wk));
                    C06WQ<Object> andSet = this.LLILZ.getAndSet(c06wq3);
                    c06wq = c06wq3;
                    if (andSet != null) {
                        C09AE c09ae = andSet.LIZ;
                        c06wq = c06wq3;
                        if (c09ae != null) {
                            this.LLILLJJLI = c06wq3;
                            this.LL = 1;
                            c06wq = c06wq3;
                            if (C23118094a.LIZLLL(c09ae, this) == objLJFF) {
                                return objLJFF;
                            }
                        }
                    }
                }
                Function2<Object, InterfaceC1364105Vn<Object>, Object> function2 = this.LLILZIL;
                Object obj4 = c06wq.LIZIZ;
                this.LLILLJJLI = c06wq;
                this.LL = 2;
                obj = function2.invoke(obj4, this);
                obj2 = c06wq;
                if (obj == objLJFF) {
                    return objLJFF;
                }
                atomicReference = this.LLILZ;
                while (!atomicReference.compareAndSet((C06WQ<Object>) obj2, null)) {
                }
                return obj;
            } catch (Throwable th) {
                th = th;
                TryCatchGuardChecker.doCheck(th);
                AtomicReference<C06WQ<Object>> atomicReference2 = this.LLILZ;
                while (!atomicReference2.compareAndSet(c06wq, null) && atomicReference2.get() == c06wq) {
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<Object> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
