package X;

import com.ss.android.ugc.aweme.profile.model.AwemeUnreadInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hdX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1211690hdX {
    public static String LIZIZ;
    public static final C1211690hdX LIZ = new C1211690hdX();
    public static final Map<String, List<String>> LIZJ = new LinkedHashMap();

    public static List LIZ(User user) {
        List<String> list;
        List list2;
        AwemeUnreadInfo awemeUnreadInfo = user.getAwemeUnreadInfo();
        if (awemeUnreadInfo == null || (list = awemeUnreadInfo.unreadIdList) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (user.getUid() != null) {
                C1211690hdX c1211690hdX = LIZ;
                String uid = user.getUid();
                c1211690hdX.getClass();
                String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
                if (curUserId != null) {
                    if (!Intrinsics.LJFF(curUserId, LIZIZ)) {
                        LIZIZ = curUserId;
                        ((LinkedHashMap) LIZJ).clear();
                    }
                    Map<String, List<String>> map = LIZJ;
                    if (!map.containsKey(uid) || (list2 = (List) ((LinkedHashMap) map).get(uid)) == null || !list2.contains(str)) {
                    }
                }
                arrayList.add(str);
            }
        }
        return new ArrayList(arrayList);
    }
}
