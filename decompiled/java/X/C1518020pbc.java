package X;

import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiEventStream;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiStreamOperation;
import com.tiktok.strategycenterengineimpl.storagecenter.model.TTMStreamModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pbc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1518020pbc {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, String str2, List list, List list2) throws JSONException {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            CaiEventStream caiEventStream = (CaiEventStream) it2.next();
            JSONArray jSONArray = new JSONArray();
            for (CaiStreamOperation caiStreamOperation : caiEventStream.ops) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("op", caiStreamOperation.op.intValue());
                jSONObject.put("par", caiStreamOperation.param);
                jSONArray.put(jSONObject);
            }
            ((ArrayList) list2).add(new TTMStreamModel(str, str2, caiEventStream.key, jSONArray.toString()));
        }
    }
}
