package Y;

import X.C1668330tW3;
import X.C341440Da2;
import X.InterfaceC1680500tpg;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public class AObjectS0S1112000_19 implements Function2 {
    public final int $t;
    public int i3;
    public int i4;
    public Object l1;
    public String s0;
    public boolean z2;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS0S1112000_19 aObjectS0S1112000_19, Object obj, Object obj2) {
        String str = aObjectS0S1112000_19.s0;
        boolean z = aObjectS0S1112000_19.z2;
        Function0 function0 = (Function0) aObjectS0S1112000_19.l1;
        int i = aObjectS0S1112000_19.i3;
        ((Integer) obj2).intValue();
        C1668330tW3.LJIIIZ(C341440Da2.LIZ(i | 1), aObjectS0S1112000_19.i4, (InterfaceC1680500tpg) obj, str, function0, z);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS0S1112000_19 aObjectS0S1112000_19, Object obj, Object obj2) {
        String str = aObjectS0S1112000_19.s0;
        boolean z = aObjectS0S1112000_19.z2;
        Function0 function0 = (Function0) aObjectS0S1112000_19.l1;
        int i = aObjectS0S1112000_19.i3;
        ((Integer) obj2).intValue();
        C1668330tW3.LJIIIIZZ(C341440Da2.LIZ(i | 1), aObjectS0S1112000_19.i4, (InterfaceC1680500tpg) obj, str, function0, z);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AObjectS0S1112000_19 aObjectS0S1112000_19, Object obj, Object obj2) {
        String str = aObjectS0S1112000_19.s0;
        boolean z = aObjectS0S1112000_19.z2;
        Function0 function0 = (Function0) aObjectS0S1112000_19.l1;
        int i = aObjectS0S1112000_19.i3;
        ((Integer) obj2).intValue();
        C1668330tW3.LJII(C341440Da2.LIZ(i | 1), aObjectS0S1112000_19.i4, (InterfaceC1680500tpg) obj, str, function0, z);
        return Unit.LIZ;
    }

    public AObjectS0S1112000_19(int i, int i2, String str, Function0 function0, boolean z, int i3) {
        this.$t = i3;
        this.s0 = str;
        this.z2 = z;
        this.l1 = function0;
        this.i3 = i;
        this.i4 = i2;
    }
}
