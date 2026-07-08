package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pme, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class C1524860pme extends C2217421BqW implements Function2<JSONObject, Integer, C2220181Buy> {
    public C1524860pme(C1525170pn9 c1525170pn9) {
        super(2, c1525170pn9, C1525170pn9.class, "operateRequest", "operateRequest(Lorg/json/JSONObject;I)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0pmd] */
    @Override // kotlin.jvm.functions.Function2
    public final C2220181Buy invoke(JSONObject jSONObject, Integer num) {
        final InterfaceC1304870k3p interfaceC1304870k3p;
        JSONObject jSONObject2 = jSONObject;
        num.intValue();
        C1525170pn9 c1525170pn9 = (C1525170pn9) this.receiver;
        c1525170pn9.getClass();
        try {
            C1525060pmy c1525060pmy = c1525170pn9.LIZ;
            if (c1525060pmy != null) {
                interfaceC1304870k3p = c1525060pmy.LIZ;
            } else {
                interfaceC1304870k3p = null;
            }
            new Object(interfaceC1304870k3p) { // from class: X.0pmd
                public final InterfaceC1304870k3p LIZ;

                {
                    this.LIZ = interfaceC1304870k3p;
                }

                public final void LIZ(JSONObject jSONObject3) throws JSONException {
                    C1525240pnG c1525240pnG = EnumC1524870pmf.Companion;
                    int iOptInt = jSONObject3.optInt("operationType", 0);
                    c1525240pnG.getClass();
                    Object objLJJIIZ = C13LQ.LJJIIZ(iOptInt, EnumC1524870pmf.values());
                    if (objLJJIIZ == null) {
                        objLJJIIZ = EnumC1524870pmf.ABORT;
                    }
                    int iOptInt2 = jSONObject3.optInt("requestTaskId", 0);
                    if (objLJJIIZ == EnumC1524870pmf.ABORT) {
                        this.LIZ.cancel(iOptInt2);
                        C1525140pn6 c1525140pn6 = new C1525140pn6();
                        c1525140pn6.LIZ.put("requestTaskId", iOptInt2);
                        C1524690pmN.LIZJ("RequestTask.abort:ok", c1525140pn6.LIZ);
                        return;
                    }
                    C1524690pmN.LIZIZ("RequestTask.abort:fail", new Throwable("operationType is inValid!"));
                }
            }.LIZ(jSONObject2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            th.getMessage();
        }
        return C2220181Buy.LJ;
    }
}
