package X;

import android.text.TextUtils;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import java.util.HashMap;
import java.util.Map;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.1BO2, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BO2 implements InterfaceC1542670qFN {
    public final Map<String, C1542480qF4> LIZ = new HashMap();

    @Override // X.InterfaceC1542670qFN
    public final void LIZ(C1542480qF4 c1542480qF4) {
        boolean zLJI = MethodIDManager.LJI(196634);
        C1BO0 c1bo0 = C1BO0.LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[EnvService] initialize cost: start=");
        sbLIZ.append(c1bo0.LIZ);
        sbLIZ.append(", end=");
        sbLIZ.append(c1bo0.LIZIZ);
        sbLIZ.append(e3.d);
        C1BPP.LJ(C2188811AlT.LIZIZ(sbLIZ));
        if (c1542480qF4 == null) {
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        String str = c1542480qF4.LIZ;
        if (TextUtils.isEmpty(str)) {
            NullPointerException nullPointerException = new NullPointerException();
            if (zLJI) {
                MethodIDManager.LJ();
                throw nullPointerException;
            }
            throw nullPointerException;
        }
        ((HashMap) this.LIZ).put(str, c1542480qF4);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final C1542480qF4 LIZIZ(String str) {
        C1542480qF4 c1542480qF4 = (C1542480qF4) ((HashMap) this.LIZ).get(str);
        if (c1542480qF4 == null) {
            return new C1542480qF4();
        }
        return c1542480qF4;
    }
}
