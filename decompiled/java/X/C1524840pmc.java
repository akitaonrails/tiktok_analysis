package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pmc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class C1524840pmc extends C2217421BqW implements Function2<JSONObject, Integer, C2220181Buy> {
    public C1524840pmc(C1525160pn8 c1525160pn8) {
        super(2, c1525160pn8, C1525160pn8.class, "operateDownload", "operateDownload(Lorg/json/JSONObject;I)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0pmT] */
    @Override // kotlin.jvm.functions.Function2
    public final C2220181Buy invoke(JSONObject jSONObject, Integer num) {
        final InterfaceC1524580pmC interfaceC1524580pmC;
        JSONObject jSONObject2 = jSONObject;
        num.intValue();
        C1525160pn8 c1525160pn8 = (C1525160pn8) this.receiver;
        c1525160pn8.getClass();
        try {
            C1525040pmw c1525040pmw = c1525160pn8.LIZ;
            if (c1525040pmw != null) {
                interfaceC1524580pmC = c1525040pmw.LIZ;
            } else {
                interfaceC1524580pmC = null;
            }
            new Object(interfaceC1524580pmC) { // from class: X.0pmT
                public final InterfaceC1524580pmC LIZ;

                {
                    this.LIZ = interfaceC1524580pmC;
                }

                public final void LIZ(JSONObject jSONObject3) throws JSONException {
                    int iOptInt = jSONObject3.optInt("downloadTaskId", 0);
                    if (jSONObject3.optInt("operationType", 0) == 0) {
                        this.LIZ.cancel(iOptInt);
                        C1525140pn6 c1525140pn6 = new C1525140pn6();
                        c1525140pn6.LIZ.put("downloadTaskId", iOptInt);
                        C1524690pmN.LIZJ("DownloadTask.abort:ok", c1525140pn6.LIZ);
                        return;
                    }
                    C1524690pmN.LIZIZ("DownloadTask.abort:fail", new Throwable("operationType is inValid!"));
                }
            }.LIZ(jSONObject2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            th.getMessage();
        }
        return C2220181Buy.LJ;
    }
}
