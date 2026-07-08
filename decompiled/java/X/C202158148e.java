package X;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.148e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C202158148e implements InterfaceC20221414Ai {
    public final Activity LIZ;

    public C202158148e(Activity activity) {
        this.LIZ = activity;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0054  */
    @Override // X.InterfaceC20221414Ai
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C14AH r6) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202158148e.LIZ(X.14AH):void");
    }

    public final void LIZIZ(String str, String str2) {
        if (this.LIZ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("smsto:");
            sbLIZ.append(str);
            Intent intent = new Intent("android.intent.action.SENDTO", UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ)));
            intent.putExtra("sms_body", str2);
            intent.putExtra("pns.sandbox.dataflow_id", 1207960578);
            Activity activity = this.LIZ;
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Context_startActivity_1");
            C1701330uNH.LIZ(intent, activity);
            C2204961BRm.LJIILLIIL(activity, intent, new C0WZX("dzBzEgAjS8/YVFkiQFyGYn7cm4RGPat/hSiLEKalLrg8eSyPGtg8MxNr6fxtEhHv5Q==", null));
        }
    }

    public static void LIZJ(JSONObject jSONObject, AnonymousClass1490 anonymousClass1490, Activity activity) {
        if (!jSONObject.has("app_name")) {
            jSONObject.put("app_name", anonymousClass1490.LIZLLL);
        }
        if (!jSONObject.has("app_version")) {
            jSONObject.put("app_version", anonymousClass1490.LJII);
        }
        if (!jSONObject.has("aid")) {
            jSONObject.put("aid", anonymousClass1490.LIZIZ);
        }
        if (!jSONObject.has("iid")) {
            jSONObject.put("iid", anonymousClass1490.LJI);
        }
        if (!jSONObject.has("device_id")) {
            jSONObject.put("device_id", anonymousClass1490.LJIIIIZZ);
        }
        if (!jSONObject.has("device_model")) {
            jSONObject.put("device_model", C202159148f.LIZIZ);
        }
        if (!jSONObject.has("device_brand")) {
            jSONObject.put("device_brand", C202159148f.LIZ);
        }
        if (!jSONObject.has("os_type")) {
            jSONObject.put("os_type", 0);
        }
        if (!jSONObject.has("os_version")) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("");
            sbLIZ.append(C202159148f.LIZJ);
            jSONObject.put("os_version", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (!jSONObject.has("channel")) {
            jSONObject.put("channel", anonymousClass1490.LJ);
        }
        if (!jSONObject.has("region")) {
            jSONObject.put("region", anonymousClass1490.LIZ);
        }
        if (!jSONObject.has("sdk_version")) {
            jSONObject.put("sdk_version", "2.4.2.i18n");
        }
        if (!jSONObject.has("language")) {
            jSONObject.put("language", anonymousClass1490.LIZJ);
        }
        if (!jSONObject.has("time")) {
            jSONObject.put("time", System.currentTimeMillis());
        }
        if (!jSONObject.has("locale")) {
            jSONObject.put("locale", anonymousClass1490.LIZ());
        }
        if (!jSONObject.has("resolution") && activity != null) {
            jSONObject.put("resolution", C148N.LJI(activity));
        }
    }
}
