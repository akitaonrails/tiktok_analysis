package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pq4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1526980pq4 implements InterfaceC1527530pqx {
    public final Context LL;

    public abstract int LJLIL();

    public AbstractC1526980pq4(Context context) {
        this.LL = context;
    }

    public final void LJLILLLLZI(C1527500pqu c1527500pqu) {
        String str;
        try {
            if (c1527500pqu.LJ != 3) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            C1499090p75.LIZJ("ev_name", C1527180pqO.LIZIZ(c1527500pqu.LIZ), jSONObject);
            String str2 = "http";
            if (LJLIL() != 1) {
                str = "http";
            } else {
                str = "frontier";
            }
            C1499090p75.LIZJ("ev_channel", str, jSONObject);
            C1499090p75.LIZJ("src", "client", jSONObject);
            int i = c1527500pqu.LJ;
            if (i == 1) {
                str2 = "cold";
            } else if (i == 2) {
                str2 = "timer";
            } else if (i == 3) {
                str2 = "switch";
            } else if (i == 4) {
                str2 = "reconnect";
            } else if (i == 5) {
                str2 = "data";
            } else if (i != 7) {
                if (i != 8) {
                    str2 = "";
                } else {
                    str2 = "biz";
                }
            }
            C1499090p75.LIZJ("reason", str2, jSONObject);
            C1499090p75.LIZIZ("start_ms", System.currentTimeMillis(), jSONObject);
            if (!C08MU.LIZLLL(this.LL)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("process", C08MU.LIZJ(this.LL));
                C1499090p75.LIZJ("extra", C786410Ut5.J3(jSONObject2), jSONObject);
            }
            C1525750po5.LIZJ("sync_sdk_event_send", jSONObject);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LJLJI(C1527500pqu c1527500pqu, int i, int i2, boolean z) {
        AbstractC1527490pqt abstractC1527490pqt = c1527500pqu.LIZLLL;
        if (abstractC1527490pqt != null) {
            abstractC1527490pqt.LIZ = LJLIL();
            abstractC1527490pqt.LIZIZ = i;
            abstractC1527490pqt.LIZJ = i2;
            abstractC1527490pqt.LIZLLL = z ? 1 : 0;
            abstractC1527490pqt.LIZ();
        }
        try {
            if (EnumC1527170pqN.Sync.getValue() == i2) {
                ((InterfaceC1526030poX) C808470VnZ.LIZ(InterfaceC1526030poX.class)).LJJIIJZLJL(LJLIL(), System.currentTimeMillis());
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
