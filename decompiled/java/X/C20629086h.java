package X;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.086h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20629086h {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(final String str, final String str2, final String str3, final String str4, final String str5, final Throwable th) {
        if (!((Boolean) C1832507Fr.LIZ.getValue()).booleanValue()) {
            return;
        }
        C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new Runnable() { // from class: X.0Cnh
            public final void LIZ() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                String str6 = str;
                String str7 = str2;
                String str8 = str3;
                String str9 = str4;
                jSONObject.put("reason", str6);
                jSONObject.put("save_null_stage", str7);
                jSONObject.put("from_top", str8);
                jSONObject.put("from_bottom", str9);
                C1586120rNS c1586120rNS = C1586120rNS.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(jSONObject);
                sbLIZ.append(", ");
                sbLIZ.append(str5);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c1586120rNS.getClass();
                C1586120rNS.LIZIZ.LJFF("TabRecreateRestoreDiagnostics", strLIZIZ);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("TabRecreateRestoreNoSnapshotException:");
                sbLIZ2.append(str);
                C1AF0.LJFF(new Exception(C2188811AlT.LIZIZ(sbLIZ2), th), C786410Ut5.J3(jSONObject));
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("TabRecreateRestoreDiagnostics@7f6b.reportNoSnapshot$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("TabRecreateRestoreDiagnostics@7f6b.reportNoSnapshot$1");
            }
        });
    }
}
