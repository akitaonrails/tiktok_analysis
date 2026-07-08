package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NUw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "androidx.compose.foundation.MutatorMutex$mutate$2", f = "MutatorMutex.kt", l = {210, 125}, m = "invokeSuspend")
public final class C594880NUw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<Object>, Object> {
    public InterfaceC383701eN LL;
    public Object LLILLJJLI;
    public C594890NUx LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ EnumC1384205bM LLILZLL;
    public final /* synthetic */ C594890NUx LLIZ;
    public final /* synthetic */ Function1<InterfaceC1364105Vn<Object>, Object> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C594880NUw(EnumC1384205bM enumC1384205bM, C594890NUx c594890NUx, Function1<? super InterfaceC1364105Vn<Object>, ? extends Object> function1, InterfaceC1364105Vn<? super C594880NUw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = enumC1384205bM;
        this.LLIZ = c594890NUx;
        this.LLIZLLLIL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C594880NUw c594880NUw = new C594880NUw(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c594880NUw.LLILZIL = obj;
        return c594880NUw;
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x00a7: INVOKE (r4 I:X.01eN), (r2 I:java.lang.Object) INTERFACE call: X.01eN.LIZIZ(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:16777383), block:B:39:0x00a7 */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC383701eN interfaceC383701eNLIZIZ;
        C594890NUx c594890NUx;
        InterfaceC383701eN interfaceC383701eN;
        Function1<InterfaceC1364105Vn<Object>, Object> function1;
        Object obj2;
        AtomicReference<C594900NUy> atomicReference;
        Object obj3;
        AtomicReference<C594900NUy> atomicReference2;
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZ;
        try {
            try {
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            c594890NUx = (C594890NUx) this.LLILLJJLI;
                            interfaceC383701eN = this.LL;
                            obj2 = this.LLILZIL;
                            try {
                                C155000ia.LIZIZ(obj);
                                obj3 = obj2;
                                atomicReference2 = c594890NUx.LIZ;
                                while (!atomicReference2.compareAndSet((C594900NUy) obj3, null) && atomicReference2.get() == obj3) {
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
                                atomicReference = c594890NUx.LIZ;
                                while (!atomicReference.compareAndSet((C594900NUy) obj2, null) && atomicReference.get() == obj2) {
                                }
                                throw th;
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c594890NUx = this.LLILLL;
                    function1 = (Function1) this.LLILLJJLI;
                    interfaceC383701eN = this.LL;
                    Object obj4 = this.LLILZIL;
                    C155000ia.LIZIZ(obj);
                    obj2 = obj4;
                } else {
                    C155000ia.LIZIZ(obj);
                    C594900NUy c594900NUy = new C594900NUy(this.LLILZLL, (C09AE) ((InterfaceC497601wk) this.LLILZIL).getCoroutineContext().get(C09AE.LJJLJ));
                    C594890NUx.LIZ(this.LLIZ, c594900NUy);
                    c594890NUx = this.LLIZ;
                    interfaceC383701eN = c594890NUx.LIZIZ;
                    function1 = this.LLIZLLLIL;
                    this.LLILZIL = c594900NUy;
                    this.LL = interfaceC383701eN;
                    this.LLILLJJLI = function1;
                    this.LLILLL = c594890NUx;
                    this.LLILZ = 1;
                    obj2 = c594900NUy;
                    if (interfaceC383701eN.LIZLLL(null, this) == objLJFF) {
                        return objLJFF;
                    }
                }
                this.LLILZIL = obj2;
                this.LL = interfaceC383701eN;
                this.LLILLJJLI = c594890NUx;
                this.LLILLL = null;
                this.LLILZ = 2;
                obj = function1.invoke(this);
                obj3 = obj2;
                if (obj == objLJFF) {
                    return objLJFF;
                }
                atomicReference2 = c594890NUx.LIZ;
                while (!atomicReference2.compareAndSet((C594900NUy) obj3, null)) {
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
                atomicReference = c594890NUx.LIZ;
                while (!atomicReference.compareAndSet((C594900NUy) obj2, null)) {
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
