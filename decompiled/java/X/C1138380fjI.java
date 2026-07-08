package X;

import android.graphics.Rect;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0fjI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1138380fjI {
    public static JSONObject LIZ() {
        InterfaceC1138400fjK interfaceC1138400fjK;
        JSONObject jSONObject = new JSONObject();
        WeakReference<InterfaceC1138400fjK> weakReference = C1136290ffv.LJI;
        if (weakReference != null && (interfaceC1138400fjK = weakReference.get()) != null) {
            try {
                Rect rectLIZ = interfaceC1138400fjK.LIZ();
                Map<Integer, String> map = C1138350fjF.LIZ;
                jSONObject.put("renderRect", new JSONArray(new int[]{rectLIZ.left, rectLIZ.top, rectLIZ.width(), rectLIZ.height()}));
                Rect rectLIZIZ = interfaceC1138400fjK.LIZIZ();
                jSONObject.put("frameRect", new JSONArray(new int[]{rectLIZIZ.left, rectLIZIZ.top, rectLIZIZ.width(), rectLIZIZ.height()}));
                List<C916720Zxm> listLIZJ = interfaceC1138400fjK.LIZJ();
                JSONArray jSONArray = new JSONArray();
                if (listLIZJ != null) {
                    for (C916720Zxm c916720Zxm : listLIZJ) {
                        if (c916720Zxm != null) {
                            jSONArray.put(c916720Zxm.LIZ());
                        }
                    }
                }
                jSONObject.put("layout", jSONArray);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJFF("multi_layout", "buildCurrentMultiLayoutJson error", e);
            }
        }
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("linkmic layout:");
            sbLIZ.append(jSONObject);
            C20441214yg.LJIIIZ("multi_layout", C2188811AlT.LIZIZ(sbLIZ));
        }
        return jSONObject;
    }
}
