package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dlF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1062710dlF extends C10EU {
    public static void LJIJI(JSONObject jSONObject) {
        long j;
        String uniqueId;
        String bindPhone;
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        boolean z = false;
        if (curUser != null && ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            j = CastLongProtector.parseLong(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
            if (TextUtils.isEmpty(curUser.getUniqueId())) {
                uniqueId = curUser.getShortId();
            } else {
                uniqueId = curUser.getUniqueId();
            }
            bindPhone = curUser.getBindPhone();
            UrlModel avatarMedium = curUser.getAvatarMedium();
            if (avatarMedium != null && avatarMedium.getUrlList() != null && !avatarMedium.getUrlList().isEmpty()) {
                jSONObject.put("avatar_url", ListProtector.get(avatarMedium.getUrlList(), 0));
            }
            z = true;
        } else {
            j = -1;
            uniqueId = "";
            bindPhone = "";
        }
        jSONObject.put("is_login", z);
        jSONObject.put("success", z);
        jSONObject.put("user_id", String.valueOf(j));
        jSONObject.put("nickname", "");
        jSONObject.put("unique_id", uniqueId);
        jSONObject.put("bind_phone", bindPhone);
        jSONObject.put("code", 1);
        Long lLIZ = C1062350dkf.LIZ(curUser);
        if (lLIZ != null) {
            jSONObject.put("decoration_id", lLIZ);
        }
    }
}
