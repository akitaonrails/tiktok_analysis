package X;

import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Pkw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C653960Pkw extends AbstractC648910Pcn {
    @Override // X.AbstractC648910Pcn
    public final String LIZ() {
        return "searchEnterLiveFlow";
    }

    @Override // X.AbstractC648910Pcn
    public final void LIZIZ(JSONObject jSONObject, C651960Phi c651960Phi) throws JSONException {
        EnterRoomConfig enterRoomConfig;
        boolean z;
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("log_extra");
            if (jSONObjectOptJSONObject != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    linkedHashMap.put(next, JSONObjectProtectorUtils.getString(jSONObjectOptJSONObject, next));
                }
                C651970Phj.LLILLL.getClass();
                C651980Phk.LJFF(linkedHashMap, false);
                enterRoomConfig = new EnterRoomConfig();
                enterRoomConfig.mLogData.search_id = jSONObjectOptJSONObject.optString("search_id");
                enterRoomConfig.mLogData.search_keyword = jSONObjectOptJSONObject.optString("search_keyword");
                enterRoomConfig.mLogData.search_type = jSONObjectOptJSONObject.optString("search_type");
                enterRoomConfig.mLogData.requestId = jSONObjectOptJSONObject.optString("search_id");
                enterRoomConfig.mRoomsData.userId = jSONObjectOptJSONObject.optString("anchor_id");
                enterRoomConfig.mRoomsData.enterMethod = jSONObjectOptJSONObject.optString("enter_method");
                enterRoomConfig.mRoomsData.enterFromMerge = jSONObjectOptJSONObject.optString("enter_from");
            } else {
                enterRoomConfig = null;
            }
            long jOptLong = jSONObject.optLong("start_cursor");
            if (jSONObject.optInt("has_more") == 1) {
                z = true;
            } else {
                z = false;
            }
            LiveRoomStruct liveRoomStruct = (LiveRoomStruct) C09C2.LIZ().LJII(jSONObject.optString("cur_raw_data"), LiveRoomStruct.class);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("raw_data_list");
            ArrayList arrayList = new ArrayList();
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayList.add(C09C2.LIZ().LJII(jSONArrayOptJSONArray.get(i).toString(), LiveRoomStruct.class));
            }
            C1440005kM.LIZ(new C0PZ7(liveRoomStruct, arrayList, jOptLong, enterRoomConfig, Boolean.valueOf(z)));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            c651960Phi.LIZ(e.getMessage());
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", 1);
        c651960Phi.LIZIZ(jSONObject2);
    }
}
