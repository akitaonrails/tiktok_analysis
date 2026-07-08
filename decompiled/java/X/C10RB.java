package X;

import com.ss.android.ugc.aweme.plugin.journey.NewUserInterestStruct;
import java.util.LinkedList;
import java.util.List;
import kotlin.Pair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.10RB, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10RB {
    public static final Pair LIZ(InterfaceC19246610Rk interfaceC19246610Rk) throws JSONException {
        List<NewUserInterestStruct> listLJJJJJ = interfaceC19246610Rk.LJJJJJ();
        JSONArray jSONArray = new JSONArray();
        LinkedList linkedList = new LinkedList();
        int i = 0;
        for (NewUserInterestStruct newUserInterestStruct : listLJJJJJ) {
            i++;
            NewUserInterestStruct newUserInterestStruct2 = new NewUserInterestStruct(newUserInterestStruct.id, null, null, null, null, null, newUserInterestStruct.type);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("select_rank", i);
            jSONObject.put("show_rank", interfaceC19246610Rk.LJLLJ(newUserInterestStruct) + 1).put("interest", newUserInterestStruct.id).put("category", newUserInterestStruct.id);
            jSONArray.put(jSONObject);
            linkedList.add(newUserInterestStruct2);
        }
        return new Pair(linkedList, jSONArray);
    }
}
