package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.livesetting.level.TextConfig;
import com.bytedance.android.livesdk.livesetting.level.TextFormat;
import java.util.ArrayList;
import java.util.Set;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0eXN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1092550eXN {
    public static final Set<String> LIZ = C13LQ.LJLIIL(new String[]{"capsule", "publish_screen", "fan_club_entrance", "room_info_entrance", "guide_gift_bubble"});

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.bytedance.android.live.base.model.ImageModel] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    public static ImageModel LIZIZ(JSONObject jSONObject) {
        ?? arrayList;
        String strLIZ = LIZ(jSONObject, "uri");
        if (strLIZ == null) {
            return null;
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("url_list");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            ArrayList arrayList2 = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList2.add(jSONArrayOptJSONArray.optString(i));
            }
            arrayList = new ArrayList();
            for (Object obj : arrayList2) {
                if (!a0.LJJJIL((String) obj)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        ?? imageModel = new ImageModel();
        imageModel.setUri(strLIZ);
        imageModel.setUrls(arrayList);
        imageModel.width = jSONObject.optInt("width", 0);
        imageModel.height = jSONObject.optInt("height", 0);
        return imageModel;
    }

    public static TextConfig LIZJ(JSONObject jSONObject) {
        TextFormat textFormat;
        String strLIZ = LIZ(jSONObject, "key");
        if (strLIZ == null) {
            strLIZ = "";
        }
        String strLIZ2 = LIZ(jSONObject, "default_pattern");
        if (strLIZ2 == null) {
            strLIZ2 = "";
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("default_format");
        if (jSONObjectOptJSONObject != null) {
            textFormat = new TextFormat(jSONObjectOptJSONObject.optString("color", ""), jSONObjectOptJSONObject.optInt("weight", 0), jSONObjectOptJSONObject.optInt("font_size", 0));
        } else {
            textFormat = null;
        }
        if (a0.LJJJIL(strLIZ) && a0.LJJJIL(strLIZ2) && textFormat == null) {
            return null;
        }
        return new TextConfig(strLIZ, strLIZ2, textFormat);
    }

    public static String LIZ(JSONObject jSONObject, String str) {
        if (jSONObject.has(str) && !jSONObject.isNull(str)) {
            String strOptString = jSONObject.optString(str);
            if (!a0.LJJJIL(strOptString)) {
                return strOptString;
            }
            return null;
        }
        return null;
    }
}
