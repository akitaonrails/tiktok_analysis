package X;

import Y.ARunnableS92S0200000_23;
import com.bytedance.sync.v4.compensate.CompensatorImplV4;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pqf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1527350pqf implements InterfaceC1527530pqx {
    public final /* synthetic */ C1526970pq3 LL;
    public final /* synthetic */ CompensatorImplV4 LLILLJJLI;

    @Override // X.InterfaceC1527530pqx
    public final boolean LJIIIIZZ() {
        return false;
    }

    @Override // X.InterfaceC1527530pqx
    public final void LJJLIIIJL(C1527500pqu c1527500pqu) {
        CompensatorImplV4 compensatorImplV4 = this.LLILLJJLI;
        final boolean z = compensatorImplV4.LLIZ;
        final InterfaceC1527480pqs interfaceC1527480pqs = compensatorImplV4.LLILZLL;
        c1527500pqu.LIZLLL = new AbstractC1527490pqt(z, interfaceC1527480pqs) { // from class: X.0pqc
            public final boolean LJ;
            public final int LJFF;

            @Override // X.AbstractC1527490pqt
            public final void LIZ() {
                JSONObject jSONObject = new JSONObject();
                C1499090p75.LIZ(this.LIZ, "send_method", jSONObject);
                C1499090p75.LIZ(this.LIZIZ, "send_result", jSONObject);
                try {
                    jSONObject.put("is_foreground", this.LJ);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                C1499090p75.LIZ(this.LJFF, "strategy", jSONObject);
                C1499090p75.LIZ(this.LIZJ, "send_msg_type", jSONObject);
                C1499090p75.LIZ(this.LIZLLL, "ws_connect", jSONObject);
                C1526300poy.LIZ("sync_sdk_compensator_net_monitor", jSONObject, null, null);
            }

            {
                int iLIZLLL;
                this.LJ = z;
                if (interfaceC1527480pqs != null) {
                    iLIZLLL = interfaceC1527480pqs.LIZLLL();
                } else {
                    iLIZLLL = 0;
                }
                this.LJFF = iLIZLLL;
            }
        };
        c1527500pqu.LJ = 2;
        C1527560pr0.LIZ.LIZIZ(new Object[0]).submit(new ARunnableS92S0200000_23(c1527500pqu, this, 16));
    }

    public C1527350pqf(CompensatorImplV4 compensatorImplV4, C1526970pq3 c1526970pq3) {
        this.LLILLJJLI = compensatorImplV4;
        this.LL = c1526970pq3;
    }
}
