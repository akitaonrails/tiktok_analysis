package X;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS327S0000000_2;

/* JADX INFO: renamed from: X.05mn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1455105mn {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.ArrayList] */
    public static final InterfaceC1380590m1x LIZ(Object obj, Function1 function1, Function2 function2) {
        if (function1 != null) {
            return (InterfaceC1380590m1x) ((InterfaceC1631620sYq) function1.invoke(AFwS327S0000000_2.get$arr$(4))).invoke(function2, obj, null);
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
        return new InterfaceC1380590m1x<Object>(c013c, c259800zU2, c259800zU, c259800zU4, c259800zU3) { // from class: X.05mk
            public final C1455005mm LIZ;
            public Function1<? super InterfaceC1380500m1o, ? extends InterfaceC1380500m1o> LIZIZ;
            public final C1454905ml LIZJ;
            public final C1454705mj LIZLLL;

            @Override // X.InterfaceC1380590m1x
            public final Function1<InterfaceC1380500m1o, InterfaceC1380500m1o> LIZ() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC1380590m1x
            public final /* bridge */ /* synthetic */ Function1<Function2<? super Object, ? super InterfaceC1380500m1o, ? extends Object>, Unit> LIZJ() {
                return this.LIZLLL;
            }

            @Override // X.InterfaceC1380590m1x
            public final /* bridge */ /* synthetic */ Function1 LIZLLL() {
                return this.LIZJ;
            }

            @Override // X.InterfaceC1380590m1x
            public final /* bridge */ /* synthetic */ Function0<Object> LJ() {
                return this.LIZ;
            }

            @Override // X.InterfaceC1380590m1x
            public final void LIZIZ(Function1<? super InterfaceC1380500m1o, ? extends InterfaceC1380500m1o> function12) {
                this.LIZIZ = function12;
            }

            {
                this.LIZ = new C1455005mm(c013c, c259800zU2);
                this.LIZIZ = new C1454605mi(c013c, c259800zU2, c259800zU, c259800zU4, c259800zU3);
                this.LIZJ = new C1454905ml(c013c, c259800zU4, c259800zU3);
                this.LIZLLL = new C1454705mj(c259800zU);
            }
        };
    }
}
