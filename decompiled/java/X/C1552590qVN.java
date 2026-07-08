package X;

import Y.ARunnableS123S0100000_23;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tiktok.geckox.ng.model.Event;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qVN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1552590qVN {
    public final C1552740qVc LIZ;
    public final C1552730qVb LIZIZ;
    public EnumC993890byF LIZJ;
    public EnumC1552690qVX LIZLLL;
    public final long LJ = SystemClock.elapsedRealtime();
    public long LJFF;
    public long LJI;
    public long LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;
    public long LJIIJ;

    public final void LIZIZ() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.LJFF;
        if (j == 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LIZ);
            sbLIZ.append(" timeStartWaitUpdate==0");
            C1553130qWF.LIZ("GeckoNG", C2188811AlT.LIZIZ(sbLIZ));
        } else {
            this.LJIIIIZZ = jElapsedRealtime - j;
        }
        this.LJI = jElapsedRealtime;
    }

    public final void LIZ(EnumC1552690qVX enumC1552690qVX) {
        this.LIZLLL = enumC1552690qVX;
        if (C13LP.LJJJJ(this.LIZLLL, C1697810uHb.LJIIJJI(EnumC1552690qVX.CHECK_UPDATE_SUCCEED, EnumC1552690qVX.CHECK_UPDATE_FAILED, EnumC1552690qVX.INVALID_CHANNEL, EnumC1552690qVX.BLOCKED_BY_THROTTLE)) && this.LJI > 0) {
            this.LJIIIZ = SystemClock.elapsedRealtime() - this.LJI;
        }
        this.LJIIJ = SystemClock.elapsedRealtime() - this.LIZIZ.LIZIZ;
        C1551780qU4 c1551780qU4 = C1551780qU4.LIZ;
        InterfaceC1553330qWZ interfaceC1553330qWZ = new InterfaceC1553330qWZ() { // from class: X.0qVQ
            @Override // X.InterfaceC1553330qWZ
            public final JSONObject LIZ() throws JSONException {
                Object c098200Yq;
                JSONObject jSONObject = new JSONObject();
                Event event = this.LIZ.LIZIZ.LIZ;
                jSONObject.put("event_name", event.name);
                Map<String, ? extends Object> map = event.params;
                if (map != null) {
                    try {
                        c098200Yq = jSONObject.put("event_params", C1551400qTS.LIZIZ.LIZ.LJIILL(map));
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    C189200o6.m1boximpl(c098200Yq);
                }
                jSONObject.put("gecko_channel", this.LIZ.LIZ.LIZIZ);
                jSONObject.put("access_key", this.LIZ.LIZ.LIZ);
                EnumC993890byF enumC993890byF = this.LIZ.LIZJ;
                jSONObject.put("file_status", enumC993890byF != null ? Integer.valueOf(enumC993890byF.getCode()) : null);
                EnumC1552690qVX enumC1552690qVX2 = this.LIZ.LIZLLL;
                jSONObject.put("check_update_result", enumC1552690qVX2 != null ? Integer.valueOf(enumC1552690qVX2.getCode()) : null);
                jSONObject.put("dur_event_match", this.LIZ.LIZIZ.LIZLLL);
                jSONObject.put("dur_decision", this.LIZ.LJII);
                jSONObject.put("dur_wait_update", this.LIZ.LJIIIIZZ);
                jSONObject.put("dur_check_update", this.LIZ.LJIIIZ);
                jSONObject.put("dur_total", this.LIZ.LJIIJ);
                return jSONObject;
            }
        };
        c1551780qU4.getClass();
        C1551500qTc.LIZIZ(new ARunnableS123S0100000_23(interfaceC1553330qWZ, 169));
    }

    public C1552590qVN(C1552740qVc c1552740qVc, C1552730qVb c1552730qVb) {
        this.LIZ = c1552740qVc;
        this.LIZIZ = c1552730qVb;
    }
}
