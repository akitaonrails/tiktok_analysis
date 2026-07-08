package X;

import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01zi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C516001zi implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
        }
    }

    public static final void accept$0(C516001zi c516001zi, Object obj) {
        C1C7U.LIZ("RootPageImpl@f0fe.monitorNextPageStayMs$4");
        C438101n9.LIZIZ((C259800zU) c516001zi.l3, (AbstractC1387200mCc) obj, new C438201nA((Function1) c516001zi.l0, (C238400w2) c516001zi.l1, (C11NJ) c516001zi.l2));
        C1C7U.LIZIZ("RootPageImpl@f0fe.monitorNextPageStayMs$4");
    }

    public static final void accept$1(C516001zi c516001zi, Object obj) {
        C1C7U.LIZ("RootPageImpl@f0fe.monitorCurrentPageDismissMs$2");
        WeakReference weakReference = (WeakReference) c516001zi.l3;
        C438301nB c438301nB = new C438301nB((C259800zU) c516001zi.l0, (Function1) c516001zi.l1, (C11NJ) c516001zi.l2);
        if (Intrinsics.LJFF(weakReference.get(), obj)) {
            c438301nB.invoke();
        }
        C1C7U.LIZIZ("RootPageImpl@f0fe.monitorCurrentPageDismissMs$2");
    }

    public static final void accept$2(C516001zi c516001zi, Object obj) {
        C1C7U.LIZ("RootPageImpl@f0fe.monitorCurrentPageDismissMs$3");
        WeakReference weakReference = (WeakReference) c516001zi.l3;
        C438401nC c438401nC = new C438401nC((C259800zU) c516001zi.l0, (Function1) c516001zi.l1, (C11NJ) c516001zi.l2);
        if (Intrinsics.LJFF(weakReference.get(), obj)) {
            c438401nC.invoke();
        }
        C1C7U.LIZIZ("RootPageImpl@f0fe.monitorCurrentPageDismissMs$3");
    }

    public C516001zi(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
