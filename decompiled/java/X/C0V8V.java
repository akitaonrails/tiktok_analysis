package X;

import Y.ARunnableS113S0100000_13;
import Y.ARunnableS18S1100000_13;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V8V, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0V8V extends AbstractBinderC805280ViQ {
    @Override // X.C0V8X
    public final void LJJIJLIJ(String str) {
        if (C792190V5t.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("stopMetric ");
            sbLIZ.append(str);
            C792910V8n.LIZLLL("APM-Traffic-Detail", C2188811AlT.LIZIZ(sbLIZ));
        }
        C0V5I.LIZ.LJJIJLIJ(str);
    }

    @Override // X.C0V8X
    public final void LJJLIIIJ(String str) {
        if (C792190V5t.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("initCustomMetricBizTrafficStats ");
            sbLIZ.append(str);
            C792910V8n.LIZLLL("APM-Traffic-Detail", C2188811AlT.LIZIZ(sbLIZ));
        }
        C0V8S.LIZ.LJJLIIIJ(str);
    }

    @Override // X.C0V8X
    public final void LJLIIL(String str) {
        if (C792190V5t.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("httpImageApiTrafficStats ");
            sbLIZ.append(str);
            C792910V8n.LIZLLL("APM-Traffic-Detail", C2188811AlT.LIZIZ(sbLIZ));
        }
        try {
            C787900UvU.LIZ.LIZJ(new ARunnableS113S0100000_13(new JSONObject(str), 58));
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.C0V8X
    public final void LJJLJLI(String str, boolean z) {
        if (C792190V5t.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("startMetric ");
            sbLIZ.append(str);
            sbLIZ.append(", ");
            sbLIZ.append(z);
            C792910V8n.LIZLLL("APM-Traffic-Detail", C2188811AlT.LIZIZ(sbLIZ));
        }
        C0V5I.LIZ.LJJLJLI(str, z);
    }

    @Override // X.C0V8X
    public final void LLILII(String str, String str2) {
        if (C792190V5t.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("httpApiTrafficStats ");
            sbLIZ.append(str);
            sbLIZ.append(", ");
            sbLIZ.append(str2);
            C792910V8n.LIZLLL("APM-Traffic-Detail", C2188811AlT.LIZIZ(sbLIZ));
        }
        try {
            C787900UvU.LIZ.LIZJ(new ARunnableS18S1100000_13(str, new JSONObject(str2), 1));
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.C0V8X
    public final void Q(long j, String str, String str2, String str3, String str4, String str5) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (C792190V5t.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("trafficStats ");
            sbLIZ.append(j);
            sbLIZ.append(", ");
            sbLIZ.append(str);
            sbLIZ.append(", ");
            sbLIZ.append(str2);
            sbLIZ.append(", ");
            sbLIZ.append(str3);
            sbLIZ.append(", ");
            sbLIZ.append(str4);
            sbLIZ.append(", ");
            sbLIZ.append(str5);
            C792910V8n.LIZLLL("APM-Traffic-Detail", C2188811AlT.LIZIZ(sbLIZ));
        }
        try {
            jSONObject = new JSONObject(str4);
            try {
                jSONObject2 = new JSONObject(str5);
            } catch (JSONException e) {
                e = e;
                TryCatchGuardChecker.doCheck(e);
                jSONObject2 = null;
            }
        } catch (JSONException e2) {
            e = e2;
            jSONObject = null;
        }
        C0V8S.LIZ.LJFF(j, str, str2, str3, jSONObject, jSONObject2);
    }
}
