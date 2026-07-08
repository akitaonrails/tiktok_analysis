package Y;

import X.AbstractC1676270tir;
import X.C1670520tZa;
import X.C1675860tiC;
import X.C1680770tq7;
import X.C1695210uDP;
import X.InterfaceC1669010tX9;
import X.InterfaceC1675870tiD;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public class AObjectS35S0100100_25 implements Function1 {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS35S0100100_25 aObjectS35S0100100_25, Object obj) {
        long j = aObjectS35S0100100_25.j1;
        AbstractC1676270tir abstractC1676270tir = (AbstractC1676270tir) aObjectS35S0100100_25.l0;
        InterfaceC1675870tiD interfaceC1675870tiD = (InterfaceC1675870tiD) obj;
        C1675860tiC.LIZLLL(interfaceC1675870tiD, j, 0.0f, 0L, 0.0f, null, 126);
        float fLJJJJLL = interfaceC1675870tiD.LJJJJLL(3);
        interfaceC1675870tiD.LJLJI().LIZ.LJII(fLJJJJLL, fLJJJJLL);
        try {
            float fLJJJJLL2 = interfaceC1675870tiD.LJJJJLL(10);
            abstractC1676270tir.LJI(interfaceC1675870tiD, (((long) Float.floatToRawIntBits(fLJJJJLL2)) << 32) | (((long) Float.floatToRawIntBits(fLJJJJLL2)) & 4294967295L), 1.0f, null);
            float f = -fLJJJJLL;
            interfaceC1675870tiD.LJLJI().LIZ.LJII(f, f);
            return Unit.LIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            float f2 = -fLJJJJLL;
            interfaceC1675870tiD.LJLJI().LIZ.LJII(f2, f2);
            throw th;
        }
    }

    public static final Object invoke$1(AObjectS35S0100100_25 aObjectS35S0100100_25, Object obj) {
        float f;
        C1670520tZa c1670520tZa = (C1670520tZa) aObjectS35S0100100_25.l0;
        long j = aObjectS35S0100100_25.j1;
        InterfaceC1669010tX9 interfaceC1669010tX9 = (InterfaceC1669010tX9) obj;
        float fLJJJJLL = interfaceC1669010tX9.LJJJJLL(1);
        if (Float.compare(c1670520tZa.LIZ, 64) < 0) {
            f = 2.0f;
        } else {
            f = 1.0f;
        }
        float f2 = fLJJJJLL / f;
        C1675860tiC.LIZLLL(interfaceC1669010tX9, j, (C1680770tq7.LIZJ(interfaceC1669010tX9.LIZIZ()) / 2.0f) + (f2 / 2.0f), 0L, 0.0f, new C1695210uDP(f2, 0.0f, 0, 0, null, 30), 108);
        interfaceC1669010tX9.LLIIJLIL();
        return Unit.LIZ;
    }

    public AObjectS35S0100100_25(long j, Object obj, int i) {
        this.$t = i;
        this.j1 = j;
        this.l0 = obj;
    }
}
