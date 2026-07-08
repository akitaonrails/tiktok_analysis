package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QOK, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QOK extends C0QOL {
    public static final C0QOK LIZ = new C0QOK();

    @Override // X.C0QOL
    public final void LIZ() {
        C0QOM c0qom = C0QOM.LIZ;
        C0QRG c0qrg = new C0QRG();
        c0qom.getClass();
        C0QOM.LIZJ(c0qrg);
    }

    public static void LIZIZ(JSONObject jSONObject, String str, Map map) {
        String strLIZ;
        boolean zLJFF;
        if (!Intrinsics.LJFF(str, "video_play")) {
            return;
        }
        if ((jSONObject == null || (strLIZ = C0QRR.LIZIZ(jSONObject)) == null) && (map == null || (strLIZ = C0QRR.LIZ(map)) == null)) {
            return;
        }
        if (jSONObject != null) {
            zLJFF = Intrinsics.LJFF(jSONObject.optString("is_fullscreen"), "1");
        } else if (map != null) {
            zLJFF = Intrinsics.LJFF(map.get("is_search_scene"), "1");
        } else {
            zLJFF = false;
        }
        C0Q3E.LJI().fe(new C0P9J(zLJFF, strLIZ));
    }
}
