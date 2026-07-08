package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0oHO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1467040oHO {
    public final Map<Integer, Integer> LIZ = new ConcurrentHashMap();
    public final Map<Integer, Long> LIZIZ = new ConcurrentHashMap();
    public final Map<Integer, Float> LIZJ = new ConcurrentHashMap();
    public final Map<Integer, String> LIZLLL = new ConcurrentHashMap();

    public final void LIZ(InterfaceC1467950oIr interfaceC1467950oIr) {
        if (interfaceC1467950oIr == null) {
            return;
        }
        try {
            for (Map.Entry entry : ((ConcurrentHashMap) this.LIZ).entrySet()) {
                ((C1470430oMr) interfaceC1467950oIr).LIZJ(((Integer) entry.getKey()).intValue(), ((Integer) entry.getValue()).intValue());
            }
            for (Map.Entry entry2 : ((ConcurrentHashMap) this.LIZIZ).entrySet()) {
                ((C1470430oMr) interfaceC1467950oIr).LIZIZ(((Integer) entry2.getKey()).intValue(), ((Long) entry2.getValue()).longValue());
            }
            for (Map.Entry entry3 : ((ConcurrentHashMap) this.LIZJ).entrySet()) {
                int iIntValue = ((Integer) entry3.getKey()).intValue();
                ((C1470430oMr) interfaceC1467950oIr).LJIL(((Float) entry3.getValue()).floatValue(), iIntValue);
            }
            for (Map.Entry entry4 : ((ConcurrentHashMap) this.LIZLLL).entrySet()) {
                ((C1470430oMr) interfaceC1467950oIr).LIZ(((Integer) entry4.getKey()).intValue(), (String) entry4.getValue());
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i = C2187451AjH.LIZ;
            C1471660oOq.LIZIZ("OptionHolder", e.getMessage());
        }
    }

    public final int LIZIZ(int i, int i2) {
        if (((ConcurrentHashMap) this.LIZ).containsKey(Integer.valueOf(i))) {
            Integer num = (Integer) ((ConcurrentHashMap) this.LIZ).get(Integer.valueOf(i));
            if (num != null) {
                return num.intValue();
            }
        }
        return i2;
    }

    public final void LIZJ(int i, int i2) {
        ((ConcurrentHashMap) this.LIZ).put(Integer.valueOf(i), Integer.valueOf(i2));
    }
}
