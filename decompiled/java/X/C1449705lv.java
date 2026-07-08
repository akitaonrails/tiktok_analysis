package X;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05lv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1449705lv {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.ArrayList] */
    public static InterfaceC1449905lx LIZ(Object obj, Function1 function1, Function2 function2) {
        if (function1 != null) {
            return (InterfaceC1449905lx) ((InterfaceC1631620sYq) function1.invoke(new InterfaceC1631620sYq() { // from class: X.05ls
                @Override // X.InterfaceC1631620sYq
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return C1449705lv.LIZ(obj3, null, (Function2) obj2);
                }
            })).invoke(function2, obj, null);
        }
        final C259800zU c259800zU = new C259800zU();
        c259800zU.element = function2;
        final C259800zU c259800zU2 = new C259800zU();
        c259800zU2.element = obj;
        final C259800zU c259800zU3 = new C259800zU();
        c259800zU3.element = new ArrayList();
        final C259800zU c259800zU4 = new C259800zU();
        c259800zU4.element = c259800zU3.element;
        final C013C c013c = new C013C();
        final C1451205mA c1451205mA = new C1451205mA();
        return new InterfaceC1449905lx<Object>(c1451205mA, c013c, c259800zU2, c259800zU, c259800zU3, c259800zU4) { // from class: X.05m6
            public final C1450705m5 LIZ;
            public Function1<? super InterfaceC1445905lJ, ? extends InterfaceC1445905lJ> LIZIZ;
            public final C1451305mB LIZJ;
            public final C1450905m7 LIZLLL;

            @Override // X.InterfaceC1449905lx
            public final Object getState() {
                return LJ().invoke();
            }

            @Override // X.InterfaceC1449905lx
            public final Function1<InterfaceC1445905lJ, InterfaceC1445905lJ> LIZ() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC1449905lx
            public final /* bridge */ /* synthetic */ Function1<Function2<? super Object, ? super InterfaceC1445905lJ, ? extends Object>, Unit> LIZJ() {
                return this.LIZLLL;
            }

            @Override // X.InterfaceC1449905lx
            public final /* bridge */ /* synthetic */ Function2<Boolean, Function1<? super Object, Unit>, Function0<Unit>> LIZLLL() {
                return this.LIZJ;
            }

            @Override // X.InterfaceC1449905lx
            public final /* bridge */ /* synthetic */ Function0<Object> LJ() {
                return this.LIZ;
            }

            @Override // X.InterfaceC1449905lx
            public final void LIZIZ(Function1<? super InterfaceC1445905lJ, ? extends InterfaceC1445905lJ> function12) {
                this.LIZIZ = function12;
            }

            {
                this.LIZ = new C1450705m5(c259800zU2);
                this.LIZIZ = new C1451005m8(c1451205mA, c013c, c259800zU2, c259800zU, c259800zU3, c259800zU4);
                this.LIZJ = new C1451305mB(c1451205mA, c259800zU2, c259800zU4, c259800zU3);
                this.LIZLLL = new C1450905m7(c259800zU);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    public static Function0 LIZIZ(final InterfaceC1449905lx interfaceC1449905lx, final C2217481Bqc c2217481Bqc, final Function1 function1) {
        Function2 function2LIZLLL = interfaceC1449905lx.LIZLLL();
        Boolean bool = Boolean.FALSE;
        final C259800zU c259800zU = new C259800zU();
        c259800zU.element = c2217481Bqc.get(interfaceC1449905lx.getState());
        final C013C c013c = new C013C();
        c013c.element = false;
        return (Function0) function2LIZLLL.invoke(bool, new Function1() { // from class: X.05lw
            /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                C013C c013c2 = c013c;
                Function1 function12 = function1;
                InterfaceC1844700y6W interfaceC1844700y6W = c2217481Bqc;
                InterfaceC1449905lx interfaceC1449905lx2 = interfaceC1449905lx;
                C259800zU c259800zU2 = c259800zU;
                if (c013c2.element) {
                    c013c2.element = false;
                    function12.invoke(obj);
                } else {
                    ?? r1 = interfaceC1844700y6W.get(interfaceC1449905lx2.getState());
                    if (!Intrinsics.LJFF(r1, c259800zU2.element)) {
                        c259800zU2.element = r1;
                        function12.invoke(interfaceC1449905lx2.getState());
                    }
                }
                return Unit.LIZ;
            }
        });
    }
}
