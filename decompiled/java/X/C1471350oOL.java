package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oOL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1471350oOL {
    public int LIZ = EnumC1471360oOM.UNKNOWN.getValue();
    public int LIZIZ = 0;
    public final List<InterfaceC1471380oOO> LIZJ = new CopyOnWriteArrayList();

    public final synchronized int LIZ() {
        int i;
        i = this.LIZIZ + 1;
        this.LIZIZ = i;
        return i;
    }

    public final void LIZLLL() {
        LIZ();
        int i = this.LIZ;
        this.LIZ = EnumC1471360oOM.WIFI.getValue();
        C790230UzF.LIZ.LIZJ().businessEvent(11000, 0);
        C1471340oOK.LIZ.LIZIZ(i, this.LIZ);
        int i2 = C2187451AjH.LIZ;
        TTVideoEngineLog.d("[NetStrategy]", "MultiNetworkSelector start");
    }

    public final void LJ() {
        LIZ();
        int i = this.LIZ;
        this.LIZ = EnumC1471360oOM.UNKNOWN.getValue();
        C790230UzF.LIZ.LIZJ().businessEvent(11001, 0);
        C1471340oOK.LIZ.LIZIZ(i, this.LIZ);
        int i2 = C2187451AjH.LIZ;
        TTVideoEngineLog.d("[NetStrategy]", "MultiNetworkSelector stop");
    }

    public final void LJFF() {
        LIZ();
        int i = this.LIZ;
        int value = EnumC1471360oOM.CELL.getValue();
        this.LIZ = value;
        C1471340oOK.LIZ.LIZIZ(i, value);
        C790230UzF.LIZ.LIZJ().businessEvent(11002, 0);
        int i2 = C2187451AjH.LIZ;
        TTVideoEngineLog.d("[NetStrategy]", "switch to cellular");
    }

    public final void LJI() {
        LIZ();
        int i = this.LIZ;
        this.LIZ = EnumC1471360oOM.WIFI.getValue();
        C790230UzF.LIZ.LIZJ().businessEvent(11003, 0);
        C1471340oOK.LIZ.LIZIZ(i, this.LIZ);
        int i2 = C2187451AjH.LIZ;
        TTVideoEngineLog.d("[NetStrategy]", "switch to wifi");
    }

    public final void LIZIZ(int i, int i2) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LIZJ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1471380oOO) it2.next()).LIZ(EnumC1471370oON.PLAYER.getValue(), i, i2);
        }
    }

    public static void LIZJ(int i, int i2, int i3, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("source", i);
            jSONObject2.put("previous", i2);
            jSONObject2.put("current", i3);
            jSONObject2.put("extra", jSONObject);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            int i4 = C2187451AjH.LIZ;
            C1471660oOq.LIZJ("[NetStrategy]", "MultiNetworkSelector message json make fail.");
        }
        C790230UzF.LIZ.LIZJ().businessEvent(11004, jSONObject2);
    }
}
