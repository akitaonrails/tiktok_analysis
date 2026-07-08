package X;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0j51, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1267170j51 implements InterfaceC1267260j5A, InterfaceC1267250j59 {
    public int LIZ = -1;
    public int LIZIZ = -1;
    public final Map<Integer, C1267240j58> LIZJ = new HashMap();

    @Override // X.InterfaceC1267260j5A
    public final /* synthetic */ EnumC1268000j6M LIZIZ(InterfaceC1267260j5A interfaceC1267260j5A) {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TTLHVideoStrategyFeature(");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("channels=");
        sbLIZ.append(this.LIZJ);
        sb.append(C2188811AlT.LIZIZ(sbLIZ));
        sb.append(")");
        return sb.toString();
    }

    @Override // X.InterfaceC1267250j59
    public final List<String> LIZ(InterfaceC1267260j5A interfaceC1267260j5A) {
        return C1697810uHb.LJIILJJIL("encode_params_adaptive_strategy");
    }

    @Override // X.InterfaceC1267260j5A
    public final void LIZJ(InterfaceC1267260j5A interfaceC1267260j5A) {
        if (interfaceC1267260j5A instanceof C1267170j51) {
            ((HashMap) this.LIZJ).clear();
            C1267170j51 c1267170j51 = (C1267170j51) interfaceC1267260j5A;
            ((HashMap) this.LIZJ).putAll(c1267170j51.LIZJ);
            this.LIZ = c1267170j51.LIZ;
            this.LIZIZ = c1267170j51.LIZIZ;
        }
    }
}
