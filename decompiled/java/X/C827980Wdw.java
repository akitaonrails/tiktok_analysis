package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Wdw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C827980Wdw {
    public static C827990Wdx LIZ(JSONObject jSONObject) throws JSONException {
        String strOptString;
        JSONArray jSONArray = jSONObject.getJSONObject("permissions").getJSONArray("data");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int length = jSONArray.length();
        if (length > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                String strOptString2 = jSONObjectOptJSONObject.optString("permission");
                if (strOptString2.length() != 0 && !Intrinsics.LJFF(strOptString2, "installed") && (strOptString = jSONObjectOptJSONObject.optString(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)) != null) {
                    int iHashCode = strOptString.hashCode();
                    if (iHashCode != -1309235419) {
                        if (iHashCode != 280295099) {
                            if (iHashCode == 568196142 && strOptString.equals("declined")) {
                                arrayList2.add(strOptString2);
                            }
                        } else if (strOptString.equals("granted")) {
                            arrayList.add(strOptString2);
                        }
                    } else if (strOptString.equals("expired")) {
                        arrayList3.add(strOptString2);
                    }
                }
                if (i2 >= length) {
                    break;
                }
                i = i2;
            }
        }
        return new C827990Wdx(arrayList, arrayList2, arrayList3);
    }
}
