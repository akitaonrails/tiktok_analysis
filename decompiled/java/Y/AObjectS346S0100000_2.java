package Y;

import X.C1445105lB;
import X.C197039127h;
import X.C384050F3z;
import X.C418440Gaw;
import X.C528310Knl;
import X.InterfaceC1449905lx;
import X.InterfaceC1631620sYq;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public class AObjectS346S0100000_2 implements Function1 {
    public final int $t;
    public Object l0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            default:
                return null;
        }
    }

    public AObjectS346S0100000_2(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object invoke$0(AObjectS346S0100000_2 aObjectS346S0100000_2, Object obj) {
        C528310Knl c528310Knl = (C528310Knl) aObjectS346S0100000_2.l0;
        c528310Knl.getClass();
        C384050F3z c384050F3z = new C384050F3z();
        float fLIZIZ = C418440Gaw.LIZIZ(8);
        c384050F3z.LJIIIIZZ = Float.valueOf(fLIZIZ);
        c384050F3z.LJIIIZ = Float.valueOf(fLIZIZ);
        c384050F3z.LJIIJ = Float.valueOf(fLIZIZ);
        c384050F3z.LJIIJJI = Float.valueOf(fLIZIZ);
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.bx);
        ((C197039127h) obj).setBackground(c384050F3z.LIZ(c528310Knl.requireActivity()));
        return null;
    }

    public static final Object invoke$1(AObjectS346S0100000_2 aObjectS346S0100000_2, Object obj) {
        C528310Knl c528310Knl = (C528310Knl) aObjectS346S0100000_2.l0;
        c528310Knl.getClass();
        C384050F3z c384050F3z = new C384050F3z();
        float fLIZIZ = C418440Gaw.LIZIZ(8);
        c384050F3z.LJIIIIZZ = Float.valueOf(fLIZIZ);
        c384050F3z.LJIIIZ = Float.valueOf(fLIZIZ);
        c384050F3z.LJIIJ = Float.valueOf(fLIZIZ);
        c384050F3z.LJIIJJI = Float.valueOf(fLIZIZ);
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.bx);
        ((C197039127h) obj).setBackground(c384050F3z.LIZ(c528310Knl.requireActivity()));
        return null;
    }

    public static final Object invoke$2(AObjectS346S0100000_2 aObjectS346S0100000_2, Object obj) {
        return new AObjectS308S0200000_2((InterfaceC1449905lx) obj, (InterfaceC1631620sYq) aObjectS346S0100000_2.l0, 1);
    }

    public static final Object invoke$3(AObjectS346S0100000_2 aObjectS346S0100000_2, Object obj) {
        final Function1[] function1Arr = (Function1[]) aObjectS346S0100000_2.l0;
        final InterfaceC1631620sYq interfaceC1631620sYq = (InterfaceC1631620sYq) obj;
        return new InterfaceC1631620sYq() { // from class: X.05lm
            @Override // X.InterfaceC1631620sYq
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                InterfaceC1631620sYq interfaceC1631620sYq2 = interfaceC1631620sYq;
                Function1[] function1Arr2 = function1Arr;
                InterfaceC1449905lx interfaceC1449905lx = (InterfaceC1449905lx) interfaceC1631620sYq2.invoke(obj2, obj3, obj4);
                Object objLIZ = interfaceC1449905lx.LIZ();
                interfaceC1449905lx.LIZIZ(new Function1() { // from class: X.05ln
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) throws Exception {
                        throw new Exception();
                    }
                });
                ArrayList arrayList = new ArrayList(function1Arr2.length);
                for (Function1 function1 : function1Arr2) {
                    arrayList.add(function1.invoke(interfaceC1449905lx));
                }
                if (!arrayList.isEmpty()) {
                    ListIterator listIterator = arrayList.listIterator(arrayList.size());
                    while (listIterator.hasPrevious()) {
                        objLIZ = ((Function1) listIterator.previous()).invoke(objLIZ);
                    }
                }
                interfaceC1449905lx.LIZIZ((Function1) objLIZ);
                return interfaceC1449905lx;
            }
        };
    }

    public static final Object invoke$4(AObjectS346S0100000_2 aObjectS346S0100000_2, Object obj) {
        Function0<Unit> function0 = ((C1445105lB) aObjectS346S0100000_2.l0).LIZJ;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.LIZ;
    }
}
