package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Pcm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C648900Pcm extends AbstractC648910Pcn {
    @Override // X.AbstractC648910Pcn
    public final String LIZ() {
        return "loadMoreLive";
    }

    @Override // X.AbstractC648910Pcn
    public final void LIZIZ(JSONObject jSONObject, C651960Phi c651960Phi) throws JSONException {
        try {
            C1440005kM.LIZ(new C648890Pcl());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            c651960Phi.LIZ(e.getMessage());
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", 1);
        c651960Phi.LIZIZ(jSONObject2);
    }
}
