package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import tikcast.api.epiphron.UploadFeatureRequest;

/* JADX INFO: renamed from: X.0eS7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1089290eS7 {
    public final boolean LIZ;
    public UploadFeatureRequest LIZIZ;
    public final List<C1089730eSp> LIZJ = new ArrayList();

    public C1089290eS7(boolean z) {
        this.LIZ = z;
    }

    public static String LIZJ(List list) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (C1089730eSp c1089730eSp : (ArrayList) list) {
                String str = c1089730eSp.LIZ;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("value", c1089730eSp.LIZIZ);
                jSONObject2.put("rule_id", c1089730eSp.LIZLLL);
                jSONObject.put(str, C786410Ut5.J3(jSONObject2));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return C786410Ut5.J3(jSONObject);
    }

    public static boolean LIZ(Map map, Map map2) {
        if (map.size() != map2.size()) {
            return true;
        }
        for (Map.Entry entry : map.entrySet()) {
            Object obj = map2.get(entry.getKey());
            if (obj == null || !Intrinsics.LJFF(obj, entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    public static boolean LIZIZ(UploadFeatureRequest uploadFeatureRequest, UploadFeatureRequest uploadFeatureRequest2) {
        if (uploadFeatureRequest2 == null || LIZ(uploadFeatureRequest.userAction, uploadFeatureRequest2.userAction) || LIZ(uploadFeatureRequest.baseInfo, uploadFeatureRequest2.baseInfo) || LIZ(uploadFeatureRequest.performance, uploadFeatureRequest2.performance) || LIZ(uploadFeatureRequest.userProfile, uploadFeatureRequest2.userProfile) || LIZ(uploadFeatureRequest.roomFeature, uploadFeatureRequest2.roomFeature)) {
            return true;
        }
        return false;
    }
}
