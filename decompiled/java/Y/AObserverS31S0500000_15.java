package Y;

import X.C974910bTd;
import X.C974930bTf;
import X.EnumC976390bW1;
import androidx.lifecycle.Observer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public class AObserverS31S0500000_15 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
        }
    }

    public static final void onChanged$0(AObserverS31S0500000_15 aObserverS31S0500000_15, Object obj) {
        C974930bTf c974930bTf = (C974930bTf) obj;
        if (c974930bTf.LIZ != null) {
            ((C974910bTd) aObserverS31S0500000_15.l0).LJJJI((Function0) aObserverS31S0500000_15.l1);
        }
        Throwable th = c974930bTf.LIZIZ;
        if (th != null) {
            ((C974910bTd) aObserverS31S0500000_15.l0).LJIILJJIL(th, (Function1) aObserverS31S0500000_15.l2);
        }
        EnumC976390bW1 enumC976390bW1 = c974930bTf.LIZJ;
        if (enumC976390bW1 != null) {
            ((C974910bTd) aObserverS31S0500000_15.l0).LJJJJ(enumC976390bW1, (Function1) aObserverS31S0500000_15.l3);
        }
        EnumC976390bW1 enumC976390bW12 = c974930bTf.LIZLLL;
        if (enumC976390bW12 != null) {
            ((C974910bTd) aObserverS31S0500000_15.l0).LJJJIL(enumC976390bW12, (Function1) aObserverS31S0500000_15.l4);
        }
    }

    public static final void onChanged$1(AObserverS31S0500000_15 aObserverS31S0500000_15, Object obj) {
        C974930bTf c974930bTf = (C974930bTf) obj;
        if (c974930bTf.LIZ != null) {
            ((C974910bTd) aObserverS31S0500000_15.l0).LJJJI((Function0) aObserverS31S0500000_15.l1);
        }
        Throwable th = c974930bTf.LIZIZ;
        if (th != null) {
            ((C974910bTd) aObserverS31S0500000_15.l0).LJIILJJIL(th, (Function1) aObserverS31S0500000_15.l2);
        }
        EnumC976390bW1 enumC976390bW1 = c974930bTf.LIZJ;
        if (enumC976390bW1 != null) {
            ((C974910bTd) aObserverS31S0500000_15.l0).LJJJJ(enumC976390bW1, (Function1) aObserverS31S0500000_15.l3);
        }
        EnumC976390bW1 enumC976390bW12 = c974930bTf.LIZLLL;
        if (enumC976390bW12 != null) {
            ((C974910bTd) aObserverS31S0500000_15.l0).LJJJIL(enumC976390bW12, (Function1) aObserverS31S0500000_15.l4);
        }
    }

    public AObserverS31S0500000_15(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
        this.l4 = obj5;
    }
}
