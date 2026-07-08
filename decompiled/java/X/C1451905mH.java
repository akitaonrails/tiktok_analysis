package X;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05mH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1451905mH {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.ArrayList] */
    public static final InterfaceC703670Riv LIZ(Object obj, Function1 function1, Function2 function2) {
        if (function1 != null) {
            return (InterfaceC703670Riv) ((InterfaceC1631620sYq) function1.invoke(new C1452005mI())).invoke(function2, obj, null);
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
        return new InterfaceC703670Riv<Object>(c013c, c259800zU2, c259800zU, c259800zU4, c259800zU3) { // from class: X.05mE
            public final C1451805mG LIZ;
            public Function1<? super InterfaceC700750ReD, ? extends InterfaceC700750ReD> LIZIZ;
            public final C1451405mC LIZJ;
            public final C1451705mF LIZLLL;

            @Override // X.InterfaceC703670Riv
            public final Object getState() {
                return LJ().invoke();
            }

            @Override // X.InterfaceC703670Riv
            public final Function1<InterfaceC700750ReD, InterfaceC700750ReD> LIZ() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC703670Riv
            public final /* bridge */ /* synthetic */ Function1<Function2<? super Object, ? super InterfaceC700750ReD, ? extends Object>, Unit> LIZJ() {
                return this.LIZLLL;
            }

            @Override // X.InterfaceC703670Riv
            public final /* bridge */ /* synthetic */ Function1 LIZLLL() {
                return this.LIZJ;
            }

            @Override // X.InterfaceC703670Riv
            public final /* bridge */ /* synthetic */ Function0<Object> LJ() {
                return this.LIZ;
            }

            @Override // X.InterfaceC703670Riv
            public final void LIZIZ(Function1<? super InterfaceC700750ReD, ? extends InterfaceC700750ReD> function12) {
                this.LIZIZ = function12;
            }

            {
                this.LIZ = new C1451805mG(c259800zU2);
                this.LIZIZ = new C1451505mD(c013c, c259800zU2, c259800zU, c259800zU4, c259800zU3);
                this.LIZJ = new C1451405mC(c259800zU4, c259800zU3);
                this.LIZLLL = new C1451705mF(c259800zU);
            }
        };
    }
}
