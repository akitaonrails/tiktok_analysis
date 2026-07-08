package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.158S, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C158S extends C158J {
    public List<C916720Zxm> LLJ;
    public long LLJI;

    @Override // X.C158J
    public final JSONArray LJFF() {
        List<C916720Zxm> list = this.LLJ;
        if (list == null) {
            C20441214yg.LJ("GroupLiveMatchEffectPresenter", "getLayoutInfoForEffectJsonArray: null");
            return new JSONArray();
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<C916720Zxm> it2 = list.iterator();
        while (it2.hasNext()) {
            jSONArray.put(it2.next().LIZ());
        }
        return jSONArray;
    }

    public C158S(DataChannel dataChannel) {
        super(dataChannel);
    }

    @Override // X.C158J
    public final void LIZIZ(JSONObject jSONObject) {
        LJ(jSONObject);
    }

    @Override // X.C158J
    public final void LJ(JSONObject jSONObject) {
        try {
            jSONObject.putOpt("effect_scene", "group_live");
            jSONObject.putOpt("pk_id", String.valueOf(this.LLJI));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C20441214yg.LJFF("GroupLiveMatchEffectPresenter", "generateJsonForFEReport error:", th);
        }
    }
}
