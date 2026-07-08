package X;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS609S0100000_30;
import kotlin.jvm.internal.Intrinsics;
import p2.j1;

/* JADX INFO: renamed from: X.13dJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC20053913dJ {
    public final InterfaceC20054413dO LIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;
    public InterfaceC20054413dO LJII;
    public boolean LIZIZ = true;
    public final Map<C115T, Integer> LJIIIIZZ = new HashMap();

    public abstract long LIZIZ(j1 j1Var, long j);

    public abstract Map<C115T, Integer> LIZJ(j1 j1Var);

    public abstract int LIZLLL(j1 j1Var, C115T c115t);

    public final void LJI() {
        this.LIZIZ = true;
        InterfaceC20054413dO interfaceC20054413dOLJJJLZIJ = this.LIZ.LJJJLZIJ();
        if (interfaceC20054413dOLJJJLZIJ == null) {
            return;
        }
        if (this.LIZJ) {
            interfaceC20054413dOLJJJLZIJ.LJJJLL();
        } else if (this.LJ || this.LIZLLL) {
            interfaceC20054413dOLJJJLZIJ.requestLayout();
        }
        if (this.LJFF) {
            this.LIZ.LJJJLL();
        }
        if (this.LJI) {
            this.LIZ.requestLayout();
        }
        interfaceC20054413dOLJJJLZIJ.LJIILL().LJI();
    }

    public final boolean LJ() {
        return this.LIZJ || this.LJ || this.LJFF || this.LJI;
    }

    public final void LJII() {
        ((HashMap) this.LJIIIIZZ).clear();
        this.LIZ.LJJJZ(new AwS609S0100000_30(this, 270));
        ((HashMap) this.LJIIIIZZ).putAll(LIZJ(this.LIZ.LJJJJLI()));
        this.LIZIZ = false;
    }

    public final boolean LJFF() {
        LJIIIIZZ();
        return this.LJII != null;
    }

    public final void LJIIIIZZ() {
        InterfaceC20054413dO interfaceC20054413dO;
        AbstractC20053913dJ abstractC20053913dJLJIILL;
        AbstractC20053913dJ abstractC20053913dJLJIILL2;
        if (LJ()) {
            interfaceC20054413dO = this.LIZ;
        } else {
            InterfaceC20054413dO interfaceC20054413dOLJJJLZIJ = this.LIZ.LJJJLZIJ();
            if (interfaceC20054413dOLJJJLZIJ == null) {
                return;
            }
            interfaceC20054413dO = interfaceC20054413dOLJJJLZIJ.LJIILL().LJII;
            if (interfaceC20054413dO == null || !interfaceC20054413dO.LJIILL().LJ()) {
                InterfaceC20054413dO interfaceC20054413dO2 = this.LJII;
                if (interfaceC20054413dO2 == null || interfaceC20054413dO2.LJIILL().LJ()) {
                    return;
                }
                InterfaceC20054413dO interfaceC20054413dOLJJJLZIJ2 = interfaceC20054413dO2.LJJJLZIJ();
                if (interfaceC20054413dOLJJJLZIJ2 != null && (abstractC20053913dJLJIILL2 = interfaceC20054413dOLJJJLZIJ2.LJIILL()) != null) {
                    abstractC20053913dJLJIILL2.LJIIIIZZ();
                }
                InterfaceC20054413dO interfaceC20054413dOLJJJLZIJ3 = interfaceC20054413dO2.LJJJLZIJ();
                interfaceC20054413dO = (interfaceC20054413dOLJJJLZIJ3 == null || (abstractC20053913dJLJIILL = interfaceC20054413dOLJJJLZIJ3.LJIILL()) == null) ? null : abstractC20053913dJLJIILL.LJII;
            }
        }
        this.LJII = interfaceC20054413dO;
    }

    public AbstractC20053913dJ(InterfaceC20054413dO interfaceC20054413dO) {
        this.LIZ = interfaceC20054413dO;
    }

    public static final void LIZ(AbstractC20053913dJ abstractC20053913dJ, C115T c115t, int i, j1 j1Var) {
        float fIntBitsToFloat;
        abstractC20053913dJ.getClass();
        float f = i;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
        while (true) {
            jFloatToRawIntBits = abstractC20053913dJ.LIZIZ(j1Var, jFloatToRawIntBits);
            j1Var = j1Var.LLJJIII;
            if (Intrinsics.LJFF(j1Var, abstractC20053913dJ.LIZ.LJJJJLI())) {
                break;
            }
            if (abstractC20053913dJ.LIZJ(j1Var).containsKey(c115t)) {
                float fLIZLLL = abstractC20053913dJ.LIZLLL(j1Var, c115t);
                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fLIZLLL)) << 32) | (((long) Float.floatToRawIntBits(fLIZLLL)) & 4294967295L);
            }
        }
        if (c115t instanceof C115S) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
        } else {
            fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        }
        int iRound = Math.round(fIntBitsToFloat);
        HashMap map = (HashMap) abstractC20053913dJ.LJIIIIZZ;
        if (map.containsKey(c115t)) {
            iRound = c115t.LIZ.invoke(Integer.valueOf(((Number) C2097608Jq.LJFF(c115t, abstractC20053913dJ.LJIIIIZZ)).intValue()), Integer.valueOf(iRound)).intValue();
        }
        map.put(c115t, Integer.valueOf(iRound));
    }
}
