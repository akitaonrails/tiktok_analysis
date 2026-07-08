package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NUv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "androidx.compose.foundation.MutatorMutex$mutateWith$2", f = "MutatorMutex.kt", l = {210, 165}, m = "invokeSuspend")
public final class C594870NUv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<Object>, Object> {
    public InterfaceC383701eN LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public C594890NUx LLILZ;
    public int LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ EnumC1384205bM LLIZ;
    public final /* synthetic */ C594890NUx LLIZLLLIL;
    public final /* synthetic */ Function2<Object, InterfaceC1364105Vn<Object>, Object> LLJ;
    public final /* synthetic */ Object LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C594870NUv(EnumC1384205bM enumC1384205bM, C594890NUx c594890NUx, Function2<Object, ? super InterfaceC1364105Vn<Object>, ? extends Object> function2, Object obj, InterfaceC1364105Vn<? super C594870NUv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = enumC1384205bM;
        this.LLIZLLLIL = c594890NUx;
        this.LLJ = function2;
        this.LLJI = obj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C594870NUv c594870NUv = new C594870NUv(this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
        c594870NUv.LLILZLL = obj;
        return c594870NUv;
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x00af: INVOKE (r4 I:X.01eN), (r2 I:java.lang.Object) INTERFACE call: X.01eN.LIZIZ(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:16777391), block:B:39:0x00af */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC383701eN interfaceC383701eNLIZIZ;
        C594890NUx c594890NUx;
        InterfaceC383701eN interfaceC383701eN;
        Function2<Object, InterfaceC1364105Vn<Object>, Object> function2;
        Object obj2;
        Object obj3;
        AtomicReference<C594900NUy> atomicReference;
        Object obj4;
        AtomicReference<C594900NUy> atomicReference2;
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZIL;
        try {
            try {
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            c594890NUx = (C594890NUx) this.LLILLJJLI;
                            interfaceC383701eN = this.LL;
                            obj3 = this.LLILZLL;
                            try {
                                C155000ia.LIZIZ(obj);
                                obj4 = obj3;
                                atomicReference2 = c594890NUx.LIZ;
                                while (!atomicReference2.compareAndSet((C594900NUy) obj4, null) && atomicReference2.get() == obj4) {
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
                                while (!atomicReference.compareAndSet((C594900NUy) obj3, null)) {
                                }
                                throw th;
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c594890NUx = this.LLILZ;
                    obj2 = this.LLILLL;
                    function2 = (Function2) this.LLILLJJLI;
                    interfaceC383701eN = this.LL;
                    Object obj5 = this.LLILZLL;
                    C155000ia.LIZIZ(obj);
                    obj3 = obj5;
                } else {
                    C155000ia.LIZIZ(obj);
                    C594900NUy c594900NUy = new C594900NUy(this.LLIZ, (C09AE) ((InterfaceC497601wk) this.LLILZLL).getCoroutineContext().get(C09AE.LJJLJ));
                    C594890NUx.LIZ(this.LLIZLLLIL, c594900NUy);
                    c594890NUx = this.LLIZLLLIL;
                    interfaceC383701eN = c594890NUx.LIZIZ;
                    function2 = this.LLJ;
                    obj2 = this.LLJI;
                    this.LLILZLL = c594900NUy;
                    this.LL = interfaceC383701eN;
                    this.LLILLJJLI = function2;
                    this.LLILLL = obj2;
                    this.LLILZ = c594890NUx;
                    this.LLILZIL = 1;
                    obj3 = c594900NUy;
                    if (interfaceC383701eN.LIZLLL(null, this) == objLJFF) {
                        return objLJFF;
                    }
                }
                this.LLILZLL = obj3;
                this.LL = interfaceC383701eN;
                this.LLILLJJLI = c594890NUx;
                this.LLILLL = null;
                this.LLILZ = null;
                this.LLILZIL = 2;
                obj = function2.invoke(obj2, this);
                obj4 = obj3;
                if (obj == objLJFF) {
                    return objLJFF;
                }
                atomicReference2 = c594890NUx.LIZ;
                while (!atomicReference2.compareAndSet((C594900NUy) obj4, null)) {
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
                while (!atomicReference.compareAndSet((C594900NUy) obj3, null) && atomicReference.get() == obj3) {
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
