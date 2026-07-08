package Y;

import X.C0MXE;
import X.C13D2;
import X.C1665930tSB;
import X.C1668040tVa;
import X.C1669430tXp;
import X.C1675980tiO;
import X.C1685720ty6;
import X.InterfaceC1668050tVb;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import X.InterfaceC20032213Zo;
import X.InterfaceC20053113dB;
import androidx.compose.foundation.layout.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: loaded from: classes26.dex */
public class AObjectS38S0100100_25 implements Function2 {
    public final int $t;
    public long j1;
    public Object l0;

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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0003: IPUT (r2 I:long), (r0 I:Y.AObjectS38S0100100_25) (LINE:50331651) Y.AObjectS38S0100100_25.j1 long, block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0005: IPUT (r4 I:java.lang.Object), (r0 I:Y.AObjectS38S0100100_25) (LINE:50331653) Y.AObjectS38S0100100_25.l0 java.lang.Object, block:B:2:0x0000 */
    /* JADX WARN: Type inference failed for: r1v0, types: [Y.AObjectS38S0100100_25, java.lang.Object] */
    public AObjectS38S0100100_25(long j, long j2, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2) {
        long j3;
        Object obj;
        obj.$t = function2;
        obj.j1 = j3;
        obj.l0 = obj;
        ?? obj2 = new Object();
    }

    public static final Object invoke$0(AObjectS38S0100100_25 aObjectS38S0100100_25, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = C1675980tiO.LIZIZ(c.LIZLLL(InterfaceC1685750ty9.LIZ), aObjectS38S0100100_25.j1, C1669430tXp.LIZ);
            Function2 function2 = (Function2) aObjectS38S0100100_25.l0;
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LIZIZ, false);
            int iLIZ = C0MXE.LIZ(interfaceC1680500tpg);
            C13D2 c13d2LJJIFFI = interfaceC1680500tpg.LJJIFFI();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(interfaceC1680500tpg, interfaceC1685750ty9LIZIZ);
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
                function2.invoke(interfaceC1680500tpg, 0);
                interfaceC1680500tpg.LJIIIZ();
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(Y.AObjectS38S0100100_25 r6, java.lang.Object r7, java.lang.Object r8) {
        /*
            X.0tpg r7 = (X.InterfaceC1680500tpg) r7
            java.lang.Number r8 = (java.lang.Number) r8
            int r0 = r8.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L19
            boolean r0 = r7.LIZ()
            if (r0 == 0) goto L19
            r7.LIZJ()
        L16:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L19:
            X.13DR r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.LJFF
            java.lang.Object r0 = r7.LJJIL(r0)
            android.view.View r0 = (android.view.View) r0
            android.view.ViewParent r1 = r0.getParent()
            boolean r0 = r1 instanceof X.InterfaceC1670680tZq
            r5 = 0
            if (r0 == 0) goto L32
            X.0tZq r1 = (X.InterfaceC1670680tZq) r1
            if (r1 == 0) goto L32
            android.view.Window r5 = r1.getWindow()
        L32:
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r7.LJJIIJZLJL(r0)
            boolean r0 = r7.LJJIIJ(r5)
            java.lang.Object r4 = r7.LJJ()
            if (r0 != 0) goto L4b
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r4 != r0) goto L55
        L4b:
            X.0tZr r4 = new X.0tZr
            r4.<init>()
            r4.LIZ = r5
            r7.LJJIJIIJI(r4)
        L55:
            r7.LJ()
            long r2 = r6.j1
            X.0tyP r1 = new X.0tyP
            r1.<init>(r2)
            r0 = 2577732(0x275544, float:3.612172E-39)
            r7.LJIIL(r0, r1)
            if (r5 == 0) goto L70
            long r0 = r6.j1
            float r0 = X.C1685910tyP.LJFF(r0)
            r5.setDimAmount(r0)
        L70:
            r7.LJJIJL()
            X.13DR r0 = X.C1670630tZl.LIZ
            X.13DO r2 = r0.LIZJ(r4)
            X.05aW r1 = new X.05aW
            java.lang.Object r0 = r6.l0
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r1.<init>()
            r0 = 1866461486(0x6f3ff12e, float:5.9403205E28)
            X.12De r1 = X.C13Z4.LIZJ(r0, r1, r7)
            r0 = 56
            X.C13ZT.LIZ(r2, r1, r7, r0)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObjectS38S0100100_25.invoke$1(Y.AObjectS38S0100100_25, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
