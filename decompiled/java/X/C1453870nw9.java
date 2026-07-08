package X;

import X.InterfaceC385700FAi;
import com.bytedance.als.h0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0nw9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1453870nw9<T extends InterfaceC385700FAi> {
    public int LIZIZ;
    public long LIZLLL;
    public final Map<Integer, h0<Boolean>> LIZ = new HashMap();
    public long LIZJ = System.currentTimeMillis();

    public final void LIZ(EnumC1453850nw7 enumC1453850nw7) {
        if (!(enumC1453850nw7 instanceof InterfaceC1454660nxQ)) {
            C201955140j.LJIIL("dispatchNonSeqScreenState must be non seq state!");
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dispatchNonSeqScreenState current State:");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append("  target State: ");
        sbLIZ.append(enumC1453850nw7);
        C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
        if (this.LIZIZ == enumC1453850nw7.getValue()) {
            return;
        }
        LJ("dispatchNonSeqScreenState before update");
        LIZJ(enumC1453850nw7.getValue()).LJII(Boolean.TRUE);
        LJ("dispatchNonSeqScreenState after update");
    }

    public final void LIZIZ(T t) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dispatchScreenState current State:");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append("  target State: ");
        sbLIZ.append(t);
        C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
        if (this.LIZIZ >= t.getValue()) {
            return;
        }
        while (this.LIZIZ < t.getValue()) {
            LJ("dispatchScreenState before update");
            int i = this.LIZIZ + 1;
            this.LIZIZ = i;
            LIZJ(i).LJII(Boolean.TRUE);
            LJ("dispatchScreenState after update");
        }
    }

    public final h0<Boolean> LIZJ(int i) {
        h0<Boolean> h0Var = (h0) ((HashMap) this.LIZ).get(Integer.valueOf(i));
        if (h0Var == null) {
            h0<Boolean> h0Var2 = new h0<>(Boolean.FALSE);
            ((HashMap) this.LIZ).put(Integer.valueOf(i), h0Var2);
            return h0Var2;
        }
        return h0Var;
    }

    public final h0 LIZLLL(InterfaceC385700FAi interfaceC385700FAi) {
        return LIZJ(interfaceC385700FAi.getValue());
    }

    public final void LJ(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C20102213l6 c20102213l6 = C20102213l6.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(' ');
        sbLIZ.append(jCurrentTimeMillis - this.LIZJ);
        C201955140j.LJIILJJIL(c20102213l6, C2188811AlT.LIZIZ(sbLIZ));
        this.LIZJ = jCurrentTimeMillis;
    }
}
