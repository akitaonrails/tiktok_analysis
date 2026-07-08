package X;

import com.bytedance.android.live.wallet.model.LocationObject;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.19up, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21691319up {
    public static void LIZ(LocationObject locationObject, JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = JSONArrayProtectorUtils.getJSONObject(jSONArray, i);
            LocationObject locationObject2 = new LocationObject(locationObject, JSONObjectProtectorUtils.getString(jSONObject, "name"), JSONObjectProtectorUtils.getString(jSONObject, "code"), JSONObjectProtectorUtils.getString(jSONObject, "asci_name"), JSONObjectProtectorUtils.getInt(jSONObject, "geoname_id"), JSONObjectProtectorUtils.getString(jSONObject, "description"));
            arrayList.add(locationObject2);
            if (jSONObject.has("sub_region")) {
                LIZ(locationObject2, JSONObjectProtectorUtils.getJSONArray(jSONObject, "sub_region"));
            }
        }
        locationObject.subRegion = arrayList;
    }
}
