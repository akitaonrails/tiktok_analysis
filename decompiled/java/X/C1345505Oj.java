package X;

import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.MAFIMUser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: renamed from: X.05Oj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1345505Oj {
    public static List LIZ(ArrayList arrayList, List list) {
        ArrayList arrayList2 = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            BaseContact baseContact = (BaseContact) it2.next();
            String str = "";
            if (baseContact instanceof MAFIMUser) {
                if (!C13LP.LJJJJ(baseContact.getUid(), linkedHashSet)) {
                    String uid = baseContact.getUid();
                    if (uid != null) {
                        str = uid;
                    }
                    linkedHashSet.add(str);
                    arrayList2.add(baseContact);
                } else if (arrayList != null) {
                    arrayList.add(baseContact);
                }
            } else if (baseContact instanceof IMUser) {
                String uid2 = baseContact.getUid();
                if (uid2 != null) {
                    str = uid2;
                }
                linkedHashSet.add(str);
                arrayList2.add(baseContact);
            } else {
                arrayList2.add(baseContact);
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("filter MaFIMUser, after list size: ");
        sbLIZ.append(arrayList2.size());
        C2188811AlT.LIZIZ(sbLIZ);
        return arrayList2;
    }
}
