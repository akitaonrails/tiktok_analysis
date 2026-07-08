package X;

import android.app.Application;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.push.task.SendTokenTask;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Vo7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class RunnableC808810Vo7 implements Runnable {
    public final String LL;
    public final InterfaceC808820Vo8 LLILLJJLI;

    public final void LIZ() {
        if (TextUtils.isEmpty(this.LL)) {
            return;
        }
        Application application = C809360Vp0.LIZ;
        synchronized (C808840VoA.class) {
            C808840VoA.LIZ(application);
            Map<Integer, C808830Vo9> map = C808840VoA.LIZ;
            if (map == null) {
                return;
            }
            Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
            if (mapUnmodifiableMap == null || mapUnmodifiableMap.isEmpty()) {
                return;
            }
            JSONArray jSONArray = new JSONArray();
            for (C808830Vo9 c808830Vo9 : mapUnmodifiableMap.values()) {
                if (c808830Vo9 == null || c808830Vo9.LJ <= 0 || TextUtils.isEmpty(c808830Vo9.LIZLLL)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("invalid cache : ");
                    sbLIZ.append(c808830Vo9);
                    C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("sender_id", c808830Vo9.LJ);
                        jSONObject.put("token", c808830Vo9.LIZLLL);
                        jSONArray.put(jSONObject);
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
            Map<String, String> mapLJI = ((C809030VoT) this.LLILLJJLI).LJI();
            ((HashMap) mapLJI).put("update_event", this.LL);
            String strLIZIZ = C0V4R.LIZIZ(C1128604bE.LIZ("/service/1/update_token/"), mapLJI);
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Pair("sender_token_list", jSONArray.toString()));
            int i = 0;
            do {
                try {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("request url = ");
                    sbLIZ2.append(strLIZIZ);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    if ("success".equals(new JSONObject(AbstractC808800Vo6.LIZ.LIZJ(strLIZIZ, arrayList)).optString("message"))) {
                        return;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                i++;
            } while (i < 2);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("SyncUidAndTokenTask@31c8.run");
        try {
            synchronized (SendTokenTask.LLILZLL) {
                try {
                    LIZ();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SyncUidAndTokenTask@31c8.run");
    }

    public RunnableC808810Vo7(InterfaceC808820Vo8 interfaceC808820Vo8, String str) {
        this.LLILLJJLI = interfaceC808820Vo8;
        this.LL = str;
    }
}
