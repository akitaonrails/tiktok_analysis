package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0CX8, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CX8 {
    public static List LIZ(List list, Integer num) {
        String uid;
        String nickname;
        String uid2;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        int i = 0;
        while (it2.hasNext()) {
            Aweme aweme = (Aweme) it2.next();
            User author = aweme.getAuthor();
            if (author != null && (num == null || i < num.intValue())) {
                if (C726860SfE.LIZ(aweme, author)) {
                    i++;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("getUidForPreload: uid = ");
                    User author2 = aweme.getAuthor();
                    if (author2 != null) {
                        uid = author2.getUid();
                    } else {
                        uid = null;
                    }
                    sbLIZ.append(uid);
                    sbLIZ.append(", nickname = ");
                    User author3 = aweme.getAuthor();
                    if (author3 != null) {
                        nickname = author3.getNickname();
                    } else {
                        nickname = null;
                    }
                    sbLIZ.append(nickname);
                    C2188811AlT.LIZIZ(sbLIZ);
                    User author4 = aweme.getAuthor();
                    if (author4 != null && (uid2 = author4.getUid()) != null) {
                        arrayList.add(uid2);
                    }
                }
            }
        }
        return arrayList;
    }

    public static void LIZIZ(C0CX5 c0cx5, List<? extends Aweme> list) {
        List listLIZJ = c0cx5.LIZJ(null, list);
        if (listLIZJ != null) {
            Iterator it2 = listLIZJ.iterator();
            while (it2.hasNext()) {
                c0cx5.LIZIZ((String) it2.next());
            }
        }
    }
}
