package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V71, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V71 implements InterfaceC792030V5d {
    public final /* synthetic */ C0V70 LL;

    @Override // X.InterfaceC792030V5d
    public final void LIZ() {
    }

    public C0V71(C0V70 c0v70) {
        this.LL = c0v70;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0V72] */
    @Override // X.InterfaceC792030V5d
    public final void LJFF(JSONObject jSONObject, final boolean z) {
        if (jSONObject == null) {
            return;
        }
        try {
            if (C792190V5t.LIZ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onRefresh:");
                sbLIZ.append(z);
                sbLIZ.append(" ");
                sbLIZ.append(jSONObject);
                C792910V8n.LIZ("APM-Config", C2188811AlT.LIZIZ(sbLIZ));
            }
            if (C792420V6q.LJIILJJIL() && this.LL.LIZJ != null && z) {
                return;
            }
            final JSONObject jSONObject2 = new JSONObject(C786410Ut5.J3(jSONObject));
            this.LL.LJI = new AbstractRunnableC792500V6y() { // from class: X.0V72
                public final void LIZ() {
                    try {
                        C792490V6x.LIZ(EnumC792970V8t.LIGHT_WEIGHT).LIZIZ(this.LLILZLL.LL.LJI);
                        C0V70 c0v70 = this.LLILZLL.LL;
                        c0v70.LJI = null;
                        c0v70.LIZLLL(jSONObject2, z);
                        if (C792190V5t.LIZ()) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("updateCurrentConfig:");
                            sbLIZ2.append(jSONObject2);
                            C792910V8n.LIZ("APM-Config", C2188811AlT.LIZIZ(sbLIZ2));
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C792910V8n.LIZJ("APM-Config", "onConfigChanged", e);
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ConfigManager@4b73.init$2$onRefresh$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ConfigManager@4b73.init$2$onRefresh$1");
                }
            };
            C792490V6x.LIZ(EnumC792970V8t.LIGHT_WEIGHT).LIZJ(this.LL.LJI);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
