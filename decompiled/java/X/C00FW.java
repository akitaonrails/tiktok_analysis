package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00FW, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00FW {
    public static final JSONObject LIZ(int i, User user, boolean z) throws JSONException {
        Object obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        int i2 = 1;
        if (i != 1 || z) {
            i2 = 0;
        }
        jSONObject2.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, i2);
        if (user != null) {
            List urls = user.getAvatarThumb().getUrls();
            if (urls != null) {
                obj = ListProtector.get(urls, 0);
            } else {
                obj = null;
            }
            jSONObject2.put("top_user_avatar", obj);
            jSONObject2.put("top_user_name", C0KVU.LIZ(user));
        }
        jSONObject.put("data", jSONObject2);
        return jSONObject;
    }
}
