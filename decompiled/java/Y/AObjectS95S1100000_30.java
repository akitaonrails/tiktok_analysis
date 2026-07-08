package Y;

import X.C13HR;
import X.C19981013Fw;
import X.C19981813Ge;
import X.C19982813Go;
import X.C19983913Gz;
import X.InterfaceC19983313Gt;
import Y.AObjectS127S0000000_30;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public class AObjectS95S1100000_30 implements Function0 {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS95S1100000_30 aObjectS95S1100000_30) {
        C19981013Fw c19981013Fw = (C19981013Fw) aObjectS95S1100000_30.l1;
        final String str = aObjectS95S1100000_30.s0;
        c19981013Fw.getClass();
        final int length = c19981013Fw.LIZ.length;
        C19983913Gz c19983913Gz = new C19983913Gz(str, length) { // from class: X.13Gp
            public final C13GS LJIIJJI;
            public final C01GW LJIIL;

            @Override // X.C19983913Gz
            public final int hashCode() {
                int iHashCode = this.LIZ.hashCode();
                Iterator<InterfaceC19983313Gt> it2 = new C20307914dB(this, 1).iterator();
                int iHashCode2 = 1;
                while (true) {
                    C20307814dA c20307814dA = (C20307814dA) it2;
                    if (!c20307814dA.hasNext()) {
                        return (iHashCode * 31) + iHashCode2;
                    }
                    int i = iHashCode2 * 31;
                    String str2 = (String) c20307814dA.next();
                    iHashCode2 = i + (str2 != null ? str2.hashCode() : 0);
                }
            }

            @Override // X.C19983913Gz
            public final String toString() {
                C20307914dB c20307914dB = new C20307914dB(this, 1);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LIZ);
                sbLIZ.append('(');
                return C13LP.LJJLIIIJ(c20307914dB, ", ", C2188811AlT.LIZIZ(sbLIZ), ")", 0, null, null, 56);
            }

            @Override // X.C19983913Gz, X.InterfaceC19983313Gt
            public final C13GW LIZIZ() {
                return this.LJIIJJI;
            }

            @Override // X.C19983913Gz, X.InterfaceC19983313Gt
            public final InterfaceC19983313Gt LJIIIIZZ(int i) {
                return ((InterfaceC19983313Gt[]) this.LJIIL.getValue())[i];
            }

            @Override // X.C19983913Gz
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || !(obj instanceof InterfaceC19983313Gt)) {
                    return false;
                }
                InterfaceC19983313Gt interfaceC19983313Gt = (InterfaceC19983313Gt) obj;
                if (interfaceC19983313Gt.LIZIZ() == C13GS.LIZ && Intrinsics.LJFF(this.LIZ, interfaceC19983313Gt.LJI()) && Intrinsics.LJFF(C13GE.LIZ(this), C13GE.LIZ(interfaceC19983313Gt))) {
                    return true;
                }
                return false;
            }

            {
                super(str, null, length);
                this.LJIIJJI = C13GS.LIZ;
                this.LJIIL = C452501pT.LIZIZ(new Function0() { // from class: X.13Gh
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i = length;
                        String str2 = str;
                        C19982913Gp c19982913Gp = this;
                        InterfaceC19983313Gt[] interfaceC19983313GtArr = new InterfaceC19983313Gt[i];
                        for (int i2 = 0; i2 < i; i2++) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(str2);
                            sbLIZ.append('.');
                            sbLIZ.append(c19982913Gp.LJ[i2]);
                            interfaceC19983313GtArr[i2] = C19981813Ge.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), C19982813Go.LIZ, new InterfaceC19983313Gt[0], new AObjectS127S0000000_30(0));
                        }
                        return interfaceC19983313GtArr;
                    }
                });
            }
        };
        for (Enum r0 : c19981013Fw.LIZ) {
            c19983913Gz.LJIIJ(r0.name(), false);
        }
        return c19983913Gz;
    }

    public static final Object invoke$1(AObjectS95S1100000_30 aObjectS95S1100000_30) {
        return C19981813Ge.LIZIZ(aObjectS95S1100000_30.s0, C19982813Go.LIZ, new InterfaceC19983313Gt[0], new AObjectS373S0100000_30((C13HR) aObjectS95S1100000_30.l1, 1));
    }

    public AObjectS95S1100000_30(C13HR c13hr, int i) {
        this.$t = i;
        this.s0 = "kotlin.Unit";
        this.l1 = c13hr;
    }

    public AObjectS95S1100000_30(C19981013Fw c19981013Fw, String str, int i) {
        this.$t = i;
        this.l1 = c19981013Fw;
        this.s0 = str;
    }
}
