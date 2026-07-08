package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.011i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2664011i {
    public static boolean LIZ(String str, JSONObject jSONObject) {
        Boolean bool;
        Object objOpt = jSONObject.opt(str);
        if (objOpt instanceof Boolean) {
            bool = (Boolean) objOpt;
        } else if (objOpt instanceof Integer) {
            Integer num = (Integer) objOpt;
            if (num.intValue() == 1) {
                bool = Boolean.TRUE;
            } else if (num.intValue() == 0) {
                bool = Boolean.FALSE;
            } else {
                return false;
            }
        } else if (objOpt instanceof String) {
            String str2 = (String) objOpt;
            if (!"true".equalsIgnoreCase(str2) && !"1".equals(str2)) {
                if ("false".equalsIgnoreCase(str2) || CardStruct.IStatusCode.DEFAULT.equals(str2)) {
                    bool = Boolean.FALSE;
                } else {
                    return false;
                }
            } else {
                bool = Boolean.TRUE;
            }
        } else {
            return false;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
