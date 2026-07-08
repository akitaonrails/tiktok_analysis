package X;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jaU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1286680jaU implements InterfaceC480660It6 {
    public static int LJII = -1;
    public boolean LIZ;
    public int LIZIZ;
    public int LIZJ;
    public String LIZLLL;
    public String LJ;
    public boolean LJFF = true;
    public int LJI = -1;

    public static int LIZIZ(Context context) {
        try {
            int i = LJII;
            if (i > 0) {
                return i;
            }
            Bundle bundle = C786410Ut5.V3(context.getPackageManager(), context.getPackageName(), 128).metaData;
            if (bundle != null) {
                LJII = bundle.getInt("UPDATE_VERSION_CODE");
            }
            return LJII;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJI("LivePlayerLog", e);
            return LJII;
        }
    }

    public static void LIZJ(int i, Throwable th) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put(Scene.SCENE_SERVICE, i);
            jSONObject2.put("error_msg", th.getMessage());
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1CC2.LJ("ttlive_stream_upload_error", jSONObject, jSONObject2, new JSONObject());
    }

    @Override // X.InterfaceC480660It6
    public final void LIZ(String str, JSONObject jSONObject) {
        boolean zLJI = MethodIDManager.LJI(202540);
        C2339809Eu c2339809EuLIZJ = C2339809Eu.LIZJ();
        int i = this.LIZIZ;
        int i2 = this.LIZJ;
        String str2 = this.LIZLLL;
        String str3 = this.LJ;
        HashMap map = new HashMap();
        if (this.LJFF) {
            map.put("live_end_successful", CardStruct.IStatusCode.DEFAULT);
        } else {
            map.put("live_end_successful", "1");
        }
        map.put("end_reason", String.valueOf(this.LJI));
        c2339809EuLIZJ.LIZ(new CallableC1286660jaS(i, i2, str2, str3, jSONObject, str, map));
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
