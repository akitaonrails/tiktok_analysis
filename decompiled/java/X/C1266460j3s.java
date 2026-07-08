package X;

import android.text.TextUtils;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0j3s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1266460j3s implements InterfaceC1267460j5U {
    public final /* synthetic */ C1266350j3h LIZ;

    public C1266460j3s(C1266350j3h c1266350j3h) {
        this.LIZ = c1266350j3h;
    }

    public final void LIZ(String str, JSONObject jSONObject) {
        try {
            if (!TextUtils.isEmpty(this.LIZ.LLILZLL.LJJJJZ)) {
                jSONObject.put("room_id", this.LIZ.LLILZLL.LJJJJZ);
            }
            C1269160j8E c1269160j8E = this.LIZ.LLILZLL;
            if (c1269160j8E != null && c1269160j8E.LJJII() == 3) {
                jSONObject.put(Scene.SCENE_SERVICE, EnumC1268000j6M.GAME_LIVE.getName());
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        InterfaceC1266960j4g interfaceC1266960j4g = this.LIZ.LLJI;
        if (interfaceC1266960j4g != null) {
            interfaceC1266960j4g.LIZ(str, jSONObject);
        }
    }
}
