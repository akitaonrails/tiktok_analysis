package Y;

import X.C05P0;
import X.C13Z4;
import X.C1670410tZP;
import X.InterfaceC1680500tpg;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes26.dex */
public class AObjectS0S0440001_25 implements Function2 {
    public final int $t;
    public float f8;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public boolean z4;
    public boolean z5;
    public boolean z6;
    public boolean z7;

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

    public static final Object invoke$0(AObjectS0S0440001_25 aObjectS0S0440001_25, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1670410tZP.LIZ(null, null, null, null, null, null, C13Z4.LIZJ(-1857898675, new AObjectS0S0440001_25(aObjectS0S0440001_25.z4, (Function0) aObjectS0S0440001_25.l0, (C05P0) aObjectS0S0440001_25.l1, aObjectS0S0440001_25.z5, aObjectS0S0440001_25.z6, aObjectS0S0440001_25.f8, (Function2) aObjectS0S0440001_25.l2, (Function2) aObjectS0S0440001_25.l3, aObjectS0S0440001_25.z7, 1), interfaceC1680500tpg), interfaceC1680500tpg, 1572864, 63);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(Y.AObjectS0S0440001_25 r22, java.lang.Object r23, java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 738
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObjectS0S0440001_25.invoke$1(Y.AObjectS0S0440001_25, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AObjectS0S0440001_25(boolean z, boolean z2, Function0<Unit> function0, C05P0<Boolean> c05p0, boolean z3, boolean z4, float f, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function22, boolean z5) {
        this.$t = z5 ? 1 : 0;
        this.z4 = z;
        this.l0 = z2;
        this.l1 = function0;
        this.z5 = c05p0;
        this.z6 = z3;
        this.f8 = z4 ? 1.0f : 0.0f;
        this.l2 = f;
        this.l3 = function2;
        this.z7 = function22;
    }
}
