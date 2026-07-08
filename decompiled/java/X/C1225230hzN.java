package X;

import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hzN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1225230hzN {
    public static final IMUser LIZ(C1224840hyk c1224840hyk) {
        Object obj = c1224840hyk.LLJI.get("contact");
        if (obj instanceof IMUser) {
            return (IMUser) obj;
        }
        return null;
    }

    public static final boolean LIZIZ(C1224840hyk c1224840hyk) {
        return Intrinsics.LJFF(c1224840hyk.LLJI.get("is_search_page_item"), "1");
    }

    public static final Pair<List<String>, List<String>> LIZJ(List<C1224840hyk> list) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            Object obj = ((C1224840hyk) it2.next()).LLJI.get("contact");
            if ((obj instanceof IMUser) && obj != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList) {
            C2201941BFw c2201941BFw = IMUser.Companion;
            int followStatus = ((IMUser) obj2).getFollowStatus();
            c2201941BFw.getClass();
            if (C2201941BFw.LIZLLL(followStatus)) {
                arrayList2.add(obj2);
            } else {
                arrayList3.add(obj2);
            }
        }
        Pair pair = new Pair(arrayList2, arrayList3);
        List list2 = (List) pair.getFirst();
        List list3 = (List) pair.getSecond();
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            String uid = ((BaseContact) it3.next()).getUid();
            if (uid != null) {
                arrayList4.add(uid);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it4 = list3.iterator();
        while (it4.hasNext()) {
            String uid2 = ((BaseContact) it4.next()).getUid();
            if (uid2 != null) {
                arrayList5.add(uid2);
            }
        }
        return new Pair<>(arrayList4, arrayList5);
    }
}
