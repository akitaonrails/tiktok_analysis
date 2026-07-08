package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Uzo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C790580Uzo implements InterfaceC792320V6g {
    public final String LIZ;
    public final String LIZIZ;
    public final float LIZJ;

    @Override // X.InterfaceC792320V6g
    public final boolean LIZIZ() {
        return false;
    }

    @Override // X.InterfaceC792320V6g
    public final String LIZLLL() {
        return "timer";
    }

    @Override // X.InterfaceC792320V6g
    public final String LJ() {
        return "timer";
    }

    @Override // X.InterfaceC792320V6g
    public final JSONObject LIZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", this.LIZ);
            jSONObject.put("key", this.LIZIZ);
            jSONObject.put("value", this.LIZJ);
            return jSONObject;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.InterfaceC792320V6g
    public final boolean LIZJ(JSONObject jSONObject) {
        return C790620Uzs.LIZ.LIZJ(this.LIZ);
    }

    public C790580Uzo(String str, String str2, float f) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = f;
    }
}
