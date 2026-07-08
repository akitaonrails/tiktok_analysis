package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;
import ud7.b;

/* JADX INFO: renamed from: X.1ANy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2178561ANy implements InterfaceC2178571ANz {
    public final /* synthetic */ int LIZ;
    public final /* synthetic */ int LIZIZ;
    public final /* synthetic */ boolean LIZJ = false;
    public final /* synthetic */ boolean LIZLLL = true;
    public final /* synthetic */ long LJ;
    public final /* synthetic */ InterfaceC2178571ANz LJFF;

    @Override // X.InterfaceC2178571ANz
    public final void LIZ(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            String str = "vesdk_event_recorder_shot_screen";
            jSONObject.put("width", this.LIZ);
            jSONObject.put("height", this.LIZIZ);
            jSONObject.put("resultCode", i);
            if (this.LIZJ) {
                str = "vesdk_event_recorder_take_picture";
            }
            jSONObject.put("is_effect", this.LIZLLL);
            jSONObject.put("duration", System.currentTimeMillis() - this.LJ);
            b.LIZIZ(str, "business", jSONObject, true);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        this.LJFF.LIZ(i);
    }

    public C2178561ANy(int i, int i2, long j, InterfaceC2178571ANz interfaceC2178571ANz) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LJ = j;
        this.LJFF = interfaceC2178571ANz;
    }
}
