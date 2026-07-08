package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0zhf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1906170zhf {
    public static final C1906170zhf LIZ = new C1906170zhf();

    public static void LIZ(Object obj, User user, BaseNotice baseNotice) {
        boolean z;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String uid = user.getUid();
        if (uid != null && uid.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            linkedHashMap.put("invalid_u", "1");
        }
        String secUid = user.getSecUid();
        if (secUid == null || secUid.length() == 0) {
            linkedHashMap.put("invalid_sec_u", "1");
        }
        if (!linkedHashMap.isEmpty()) {
            linkedHashMap.put("caller", obj.getClass().getSimpleName());
            if (baseNotice != null) {
                String str = baseNotice.nid;
                if (str == null) {
                    str = "";
                }
                linkedHashMap.put("nid", str);
                linkedHashMap.put("type", String.valueOf(baseNotice.type));
            }
            C20684815ws.LJIILLIIL("inbox_vh_invalid_user", linkedHashMap);
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZ("NameSpanMonitor", "check, invalid user: " + linkedHashMap);
        }
    }
}
