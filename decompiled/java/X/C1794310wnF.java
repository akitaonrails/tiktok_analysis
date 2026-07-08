package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wnF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1794310wnF implements InterfaceC1794350wnJ {
    public InterfaceC1794320wnG LIZ = new InterfaceC1794320wnG() { // from class: X.0wnD
        @Override // X.InterfaceC1794320wnG
        public final void LIZ(EnumC1794330wnH enumC1794330wnH, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
            JSONObject jSONObject4;
            if (enumC1794330wnH != EnumC1794330wnH.MONITOR) {
                try {
                    Map<String, String> mapLIZJ = C117100cT.LIZJ(jSONObject);
                    Map<String, String> mapLIZJ2 = C117100cT.LIZJ(jSONObject2);
                    Map<String, String> mapLIZJ3 = C117100cT.LIZJ(jSONObject3);
                    HashMap map = (HashMap) mapLIZJ;
                    map.putAll(mapLIZJ2);
                    map.putAll(mapLIZJ3);
                    jSONObject4 = new JSONObject(mapLIZJ);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    jSONObject4 = null;
                }
            } else {
                jSONObject4 = null;
            }
            int i = C1794300wnE.LIZ[enumC1794330wnH.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        ((C1795850wpj) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LJFF()).LIZ(str, jSONObject, jSONObject2, jSONObject3);
                        ((C1796060wq4) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZIZ()).onEventV3(str, jSONObject4);
                        return;
                    }
                    return;
                }
                ((C1796060wq4) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZIZ()).onEventV3(str, jSONObject4);
                return;
            }
            ((C1795850wpj) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LJFF()).LIZ(str, jSONObject, jSONObject2, jSONObject3);
        }
    };

    @Override // X.InterfaceC1794320wnG
    public final void LIZ(EnumC1794330wnH enumC1794330wnH, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        this.LIZ.LIZ(enumC1794330wnH, str, jSONObject, jSONObject2, jSONObject3);
    }
}
