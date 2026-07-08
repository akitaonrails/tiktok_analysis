package X;

import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.services.editeffect.model.EditEffectReuseDetails;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0189, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnonymousClass0189 {
    public static List LIZ(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(jSONObject.optString("effect_duration"));
            C531650Kt9 it2 = C13LZ.LJIILJJIL(0, jSONArray.length()).iterator();
            while (it2.LLILLL) {
                JSONObject jSONObject2 = JSONArrayProtectorUtils.getJSONObject(jSONArray, it2.nextInt());
                double dOptDouble = jSONObject2.optDouble("start_time");
                double d = LSPassThroughRecordSizeConfig.DEFAULT;
                arrayList.add(new EditEffectReuseDetails(C814420VxA.LIZJ(dOptDouble * d), C814420VxA.LIZJ(jSONObject2.optDouble("end_time") * d)));
            }
            return arrayList;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Unable to parse edit effect duration ");
            sbLIZ.append(e);
            C2188811AlT.LIZIZ(sbLIZ);
            return null;
        }
    }
}
