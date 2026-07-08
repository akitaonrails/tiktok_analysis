package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tts.oecverify.BdTuringCallback;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.149o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C202194149o extends C202173148t {
    public boolean LIZ = true;
    public final /* synthetic */ C14AC LIZIZ;

    public C202194149o(C14AC c14ac) {
        this.LIZIZ = c14ac;
    }

    @Override // X.C202173148t
    public final void LIZJ(C14AL c14al) {
        C14AC c14ac = this.LIZIZ;
        synchronized (c14ac) {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < c14ac.LLJJJJJIL.size(); i++) {
                try {
                    jSONArray.put(c14ac.LLJJJJJIL.get(i).LIZ());
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            jSONObject.put("gy2", jSONArray);
            jSONObject.put("load_time", c14ac.LLJL);
            jSONObject.put("tql", c14ac.LLJJJJLIIL);
            c14al.LIZLLL(1, jSONObject);
        }
    }

    @Override // X.C202173148t
    public final void LIZLLL(int i, String str, String str2) {
        boolean z;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        String strLJIIJ = this.LIZIZ.LLJLLIL.LJIIJ();
        String strLJII = this.LIZIZ.LLJLLIL.LJII();
        String strLJFF = this.LIZIZ.LLJLLIL.LJFF();
        C14AC c14ac = this.LIZIZ;
        C202191149l.LJIILL(i, strLJIIJ, c14ac.LLJLLL, strLJII, strLJFF, 0, c14ac.LLJLLIL.LJ());
        BdTuringCallback bdTuringCallback = this.LIZIZ.LLJILLL;
        if (bdTuringCallback != null) {
            if (z) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("token", str);
                    jSONObject.put("mobile", str2);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C14A6.LIZIZ();
                }
                this.LIZIZ.LLJILLL.onSuccess(i, jSONObject);
            } else {
                bdTuringCallback.onFail(i, null);
            }
            this.LIZIZ.LLJILLL = null;
        }
        C14AC c14ac2 = this.LIZIZ;
        c14ac2.LLJI = true;
        c14ac2.dismiss();
        C785410UrT.LIZ(c14ac2);
    }
}
