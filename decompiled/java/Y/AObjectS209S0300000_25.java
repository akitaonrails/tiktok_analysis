package Y;

import X.C05P1;
import X.C0MXE;
import X.C13D2;
import X.C13Z4;
import X.C1665900tS8;
import X.C1665910tS9;
import X.C1665930tSB;
import X.C1668040tVa;
import X.C1670410tZP;
import X.C1672220tcK;
import X.C1685720ty6;
import X.InterfaceC1631620sYq;
import X.InterfaceC1665870tS5;
import X.InterfaceC1668050tVb;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import X.InterfaceC20032213Zo;
import X.InterfaceC20053113dB;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: loaded from: classes26.dex */
public class AObjectS209S0300000_25 implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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

    public static final Object invoke$0(AObjectS209S0300000_25 aObjectS209S0300000_25, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1670410tZP.LIZ(null, null, null, null, null, null, C13Z4.LIZJ(547883465, new AObjectS209S0300000_25((C05P1) aObjectS209S0300000_25.l0, (C05P1) aObjectS209S0300000_25.l1, (InterfaceC1631620sYq) aObjectS209S0300000_25.l2, 1), interfaceC1680500tpg), interfaceC1680500tpg, 1572864, 63);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS209S0300000_25 aObjectS209S0300000_25, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            InterfaceC1685750ty9 interfaceC1685750ty9LIZ = C1665900tS8.LIZ(InterfaceC1685750ty9.LIZ, ((Number) ((C05P1) aObjectS209S0300000_25.l0).getValue()).floatValue());
            float fFloatValue = ((Number) ((C05P1) aObjectS209S0300000_25.l1).getValue()).floatValue();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZ2 = C1665910tS9.LIZ(interfaceC1685750ty9LIZ, fFloatValue, fFloatValue);
            InterfaceC1631620sYq interfaceC1631620sYq = (InterfaceC1631620sYq) aObjectS209S0300000_25.l2;
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LIZIZ, false);
            int iLIZ = C0MXE.LIZ(interfaceC1680500tpg);
            C13D2 c13d2LJJIFFI = interfaceC1680500tpg.LJJIFFI();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(interfaceC1680500tpg, interfaceC1685750ty9LIZ2);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (interfaceC1680500tpg.LJIIJJI() instanceof InterfaceC20032213Zo) {
                interfaceC1680500tpg.LJJIII();
                if (interfaceC1680500tpg.LJJIIZ()) {
                    interfaceC1680500tpg.LJJI(aFwS214S0000000_25);
                } else {
                    interfaceC1680500tpg.LJIILJJIL();
                }
                C1665930tSB.LIZ(interfaceC1680500tpg, interfaceC20053113dBLIZLLL, g.a.LJI);
                C1665930tSB.LIZ(interfaceC1680500tpg, c13d2LJJIFFI, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (interfaceC1680500tpg.LJJIIZ() || !Intrinsics.LJFF(interfaceC1680500tpg.LJJ(), Integer.valueOf(iLIZ))) {
                    interfaceC1680500tpg.LJJIJIIJI(Integer.valueOf(iLIZ));
                    interfaceC1680500tpg.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                C1665930tSB.LIZ(interfaceC1680500tpg, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                C1672220tcK c1672220tcK = C1672220tcK.LIZ;
                interfaceC1680500tpg.LJJIIJZLJL(195715631);
                if (interfaceC1631620sYq != null) {
                    interfaceC1631620sYq.invoke(c1672220tcK, interfaceC1680500tpg, 6);
                }
                interfaceC1680500tpg.LJ();
                interfaceC1680500tpg.LJIIIZ();
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AObjectS209S0300000_25(Object obj, C05P1<Float> c05p1, C05P1<Float> c05p12, InterfaceC1631620sYq<? super InterfaceC1665870tS5, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631620sYq) {
        this.$t = interfaceC1631620sYq;
        this.l0 = obj;
        this.l1 = c05p1;
        this.l2 = c05p12;
    }
}
