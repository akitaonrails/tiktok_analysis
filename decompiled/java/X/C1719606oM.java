package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.06oM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1719606oM {
    public static C1719506oL LIZ;
    public static final ConcurrentHashMap<String, String> LIZIZ = new ConcurrentHashMap<>();

    public static String LIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String str2 = LIZIZ.get(str);
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        return str2;
    }

    public static String LIZIZ(IMUser iMUser) {
        if (iMUser != null && !TextUtils.isEmpty(iMUser.getUid())) {
            if (TextUtils.isEmpty(iMUser.getSecUid())) {
                IMContactApi.LIZ.getClass();
                IMUser iMUserLJIIL = C069P.LIZ().LJ().LJIIL(iMUser.getUid(), null, "im_local_db");
                if (iMUserLJIIL != null && !TextUtils.isEmpty(iMUserLJIIL.getSecUid())) {
                    return iMUserLJIIL.getSecUid();
                }
                return LIZ(iMUser.getUid());
            }
            return iMUser.getSecUid();
        }
        return "";
    }
}
