package Y;

import X.C1668690tWd;
import X.C341440Da2;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes26.dex */
public class AObjectS0S0112001_25 implements Function2 {
    public final int $t;
    public float f4;
    public int i2;
    public int i3;
    public Object l0;
    public boolean z1;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS0S0112001_25 aObjectS0S0112001_25, Object obj, Object obj2) {
        InterfaceC1685750ty9 interfaceC1685750ty9 = (InterfaceC1685750ty9) aObjectS0S0112001_25.l0;
        boolean z = aObjectS0S0112001_25.z1;
        float f = aObjectS0S0112001_25.f4;
        int i = aObjectS0S0112001_25.i2;
        ((Integer) obj2).intValue();
        C1668690tWd.LIZIZ(f, C341440Da2.LIZ(i | 1), aObjectS0S0112001_25.i3, (InterfaceC1680500tpg) obj, interfaceC1685750ty9, z);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS0S0112001_25 aObjectS0S0112001_25, Object obj, Object obj2) {
        boolean z = aObjectS0S0112001_25.z1;
        float f = aObjectS0S0112001_25.f4;
        InterfaceC1685750ty9 interfaceC1685750ty9 = (InterfaceC1685750ty9) aObjectS0S0112001_25.l0;
        int i = aObjectS0S0112001_25.i2;
        ((Integer) obj2).intValue();
        C1668690tWd.LIZ(f, C341440Da2.LIZ(i | 1), aObjectS0S0112001_25.i3, (InterfaceC1680500tpg) obj, interfaceC1685750ty9, z);
        return Unit.LIZ;
    }

    public AObjectS0S0112001_25(float f, int i, int i2, InterfaceC1685750ty9 interfaceC1685750ty9, boolean z, int i3) {
        this.$t = i3;
        if (i3 != 0) {
            this.z1 = z;
            this.f4 = f;
            this.l0 = interfaceC1685750ty9;
            this.i2 = i;
            this.i3 = i2;
            return;
        }
        this.l0 = interfaceC1685750ty9;
        this.z1 = z;
        this.f4 = f;
        this.i2 = i;
        this.i3 = i2;
    }
}
