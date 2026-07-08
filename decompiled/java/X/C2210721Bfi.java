package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bfi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2210721Bfi {
    public static String LIZ(EnumC2210521BfO enumC2210521BfO, JSONObject jSONObject) {
        if (jSONObject != null && enumC2210521BfO != null && enumC2210521BfO == EnumC2210521BfO.USER_ID) {
            return jSONObject.optString("user_id", CardStruct.IStatusCode.DEFAULT);
        }
        return "";
    }
}
