package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05bC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "androidx.compose.material.InternalMutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", l = {177, 99}, m = "invokeSuspend")
public final class C1383205bC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<Object>, Object> {
    public InterfaceC383701eN LL;
    public Object LLILLJJLI;
    public C1381805ay LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ EnumC1384205bM LLILZLL;
    public final /* synthetic */ C1381805ay LLIZ;
    public final /* synthetic */ Function1<InterfaceC1364105Vn<Object>, Object> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1383205bC(EnumC1384205bM enumC1384205bM, C1381805ay c1381805ay, Function1<? super InterfaceC1364105Vn<Object>, ? extends Object> function1, InterfaceC1364105Vn<? super C1383205bC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = enumC1384205bM;
        this.LLIZ = c1381805ay;
        this.LLIZLLLIL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1383205bC c1383205bC = new C1383205bC(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c1383205bC.LLILZIL = obj;
        return c1383205bC;
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x00e1: INVOKE (r4 I:X.01eN), (r2 I:java.lang.Object) INTERFACE call: X.01eN.LIZIZ(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:16777441), block:B:59:0x00e1 */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC383701eN interfaceC383701eNLIZIZ;
        C1383305bD c1383305bD;
        boolean z;
        C1381805ay c1381805ay;
        InterfaceC383701eN interfaceC383701eN;
        Function1<InterfaceC1364105Vn<Object>, Object> function1;
        boolean z2;
        Object obj2;
        AtomicReference<C1383305bD> atomicReference;
        Object obj3;
        AtomicReference<C1383305bD> atomicReference2;
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZ;
        try {
            try {
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            c1381805ay = (C1381805ay) this.LLILLJJLI;
                            interfaceC383701eN = this.LL;
                            obj2 = this.LLILZIL;
                            try {
                                C155000ia.LIZIZ(obj);
                                obj3 = obj2;
                                atomicReference2 = c1381805ay.LIZ;
                                while (!atomicReference2.compareAndSet((C1383305bD) obj3, null) && atomicReference2.get() == obj3) {
                                }
                                interfaceC383701eN.LIZIZ(null);
                                return obj;
                            } catch (Throwable th) {
                                th = th;
                                while (true) {
                                    try {
                                        TryCatchGuardChecker.doCheck(th);
                                        break;
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                }
                                atomicReference = c1381805ay.LIZ;
                                while (!atomicReference.compareAndSet((C1383305bD) obj2, null)) {
                                }
                                throw th;
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1381805ay = this.LLILLL;
                    function1 = (Function1) this.LLILLJJLI;
                    interfaceC383701eN = this.LL;
                    Object obj4 = this.LLILZIL;
                    C155000ia.LIZIZ(obj);
                    obj2 = obj4;
                } else {
                    C155000ia.LIZIZ(obj);
                    C1383305bD c1383305bD2 = new C1383305bD(this.LLILZLL, (C09AE) ((InterfaceC497601wk) this.LLILZIL).getCoroutineContext().get(C09AE.LJJLJ));
                    C1381805ay c1381805ay2 = this.LLIZ;
                    do {
                        c1383305bD = c1381805ay2.LIZ.get();
                        z = false;
                        if (c1383305bD != null) {
                            if (c1383305bD2.LIZ.compareTo(c1383305bD.LIZ) >= 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (!z2) {
                                throw new CancellationException("Current mutation had a higher priority");
                            }
                        }
                        AtomicReference<C1383305bD> atomicReference3 = c1381805ay2.LIZ;
                        while (true) {
                            if (atomicReference3.compareAndSet(c1383305bD, c1383305bD2)) {
                                z = true;
                                break;
                            }
                            if (atomicReference3.get() != c1383305bD) {
                                break;
                            }
                        }
                    } while (!z);
                    if (c1383305bD != null) {
                        c1383305bD.LIZIZ.LIZIZ(null);
                    }
                    c1381805ay = this.LLIZ;
                    interfaceC383701eN = c1381805ay.LIZIZ;
                    function1 = this.LLIZLLLIL;
                    this.LLILZIL = c1383305bD2;
                    this.LL = interfaceC383701eN;
                    this.LLILLJJLI = function1;
                    this.LLILLL = c1381805ay;
                    this.LLILZ = 1;
                    obj2 = c1383305bD2;
                    if (interfaceC383701eN.LIZLLL(null, this) == objLJFF) {
                        return objLJFF;
                    }
                }
                this.LLILZIL = obj2;
                this.LL = interfaceC383701eN;
                this.LLILLJJLI = c1381805ay;
                this.LLILLL = null;
                this.LLILZ = 2;
                obj = function1.invoke(this);
                obj3 = obj2;
                if (obj == objLJFF) {
                    return objLJFF;
                }
                atomicReference2 = c1381805ay.LIZ;
                while (!atomicReference2.compareAndSet((C1383305bD) obj3, null)) {
                }
                interfaceC383701eN.LIZIZ(null);
                return obj;
            } catch (Throwable th3) {
                th = th3;
                while (true) {
                    TryCatchGuardChecker.doCheck(th);
                    break;
                    break;
                }
                atomicReference = c1381805ay.LIZ;
                while (!atomicReference.compareAndSet((C1383305bD) obj2, null) && atomicReference.get() == obj2) {
                }
                throw th;
            }
        } catch (Throwable th4) {
            TryCatchGuardChecker.doCheck(th4);
            interfaceC383701eNLIZIZ.LIZIZ(null);
            throw th4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<Object> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
