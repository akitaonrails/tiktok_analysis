package Y;

import X.C089E;
import X.C09RO;
import X.C13GE;
import X.C13GL;
import X.C13GU;
import X.C13H1;
import X.C13H3;
import X.C13HG;
import X.C19981813Ge;
import X.C19983113Gr;
import X.C19983713Gx;
import X.C19983813Gy;
import X.C19983913Gz;
import X.InterfaceC19983313Gt;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.tts.oecverify.BdTuring;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS431S0200000_30;

/* JADX INFO: loaded from: classes31.dex */
public class AObjectS404S0100000_30 implements Function0 {
    public final int $t;
    public Object l0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS404S0100000_30 aObjectS404S0100000_30) {
        C19983813Gy c19983813Gy = (C19983813Gy) aObjectS404S0100000_30.l0;
        return Integer.valueOf(C19983713Gx.LIZ(c19983813Gy, c19983813Gy.LJIIJ));
    }

    public static final Object invoke$1(AObjectS404S0100000_30 aObjectS404S0100000_30) {
        C13HG<?>[] c13hgArrChildSerializers;
        C13H1<?> c13h1 = ((C19983913Gz) aObjectS404S0100000_30.l0).LIZIZ;
        if (c13h1 == null || (c13hgArrChildSerializers = c13h1.childSerializers()) == null) {
            return C13H3.LIZ;
        }
        return c13hgArrChildSerializers;
    }

    public static final Object invoke$2(AObjectS404S0100000_30 aObjectS404S0100000_30) {
        ArrayList arrayList;
        C13HG<?>[] c13hgArrTypeParametersSerializers;
        C13H1<?> c13h1 = ((C19983913Gz) aObjectS404S0100000_30.l0).LIZIZ;
        if (c13h1 != null && (c13hgArrTypeParametersSerializers = c13h1.typeParametersSerializers()) != null) {
            arrayList = new ArrayList(c13hgArrTypeParametersSerializers.length);
            for (C13HG<?> c13hg : c13hgArrTypeParametersSerializers) {
                arrayList.add(c13hg.getDescriptor());
            }
        } else {
            arrayList = null;
        }
        return C13GE.LIZIZ(arrayList);
    }

    public static final Object invoke$3(AObjectS404S0100000_30 aObjectS404S0100000_30) {
        C19983913Gz c19983913Gz = (C19983913Gz) aObjectS404S0100000_30.l0;
        return Integer.valueOf(C19983713Gx.LIZ(c19983913Gz, (InterfaceC19983313Gt[]) c19983913Gz.LJIIIZ.getValue()));
    }

    public static final Object invoke$4(AObjectS404S0100000_30 aObjectS404S0100000_30) {
        return new C089E((Object[]) aObjectS404S0100000_30.l0);
    }

    public static final Object invoke$5(AObjectS404S0100000_30 aObjectS404S0100000_30) {
        Function0 function0;
        WeakReference weakReference = (WeakReference) ((AwS431S0200000_30) aObjectS404S0100000_30.l0).l1;
        if (weakReference != null && (function0 = (Function0) weakReference.get()) != null) {
            function0.invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AObjectS404S0100000_30 aObjectS404S0100000_30) {
        C13GU c13gu = (C13GU) aObjectS404S0100000_30.l0;
        return new C19983113Gr(C19981813Ge.LIZIZ("kotlinx.serialization.Polymorphic", new C13GL() { // from class: X.13GM
        }, new InterfaceC19983313Gt[0], new AObjectS373S0100000_30(c13gu, 8)), c13gu.LIZ);
    }

    public static final Object invoke$7(AObjectS404S0100000_30 aObjectS404S0100000_30) {
        return ((C09RO) ListProtector.get((List) aObjectS404S0100000_30.l0, 0)).LJFF();
    }

    public static final Object invoke$8(AObjectS404S0100000_30 aObjectS404S0100000_30) {
        return ((C09RO) ListProtector.get((List) aObjectS404S0100000_30.l0, 0)).LJFF();
    }

    public static final Object invoke$9(AObjectS404S0100000_30 aObjectS404S0100000_30) {
        return ((C09RO) ListProtector.get((List) aObjectS404S0100000_30.l0, 0)).LJFF();
    }

    public AObjectS404S0100000_30(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
