package X;

import com.ss.android.ugc.aweme.base.share.QuickShareCandidate;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0lgU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1367280lgU {
    public static final C1367280lgU LIZ = new C1367280lgU();

    public static String LIZJ(IMContact iMContact) {
        String str = "";
        if (iMContact instanceof IMUser) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("0:");
            String uid = iMContact.getUid();
            if (uid != null) {
                str = uid;
            }
            sbLIZ.append(str);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (!(iMContact instanceof IMConversation)) {
            return "";
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("1:");
        String conversationId = ((IMConversation) iMContact).getConversationId();
        if (conversationId != null) {
            str = conversationId;
        }
        sbLIZ2.append(str);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public static C790310UzN LIZ(List list, List list2) {
        HashMap map = new HashMap(list2.size() * 2);
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i >= 0) {
                QuickShareCandidate quickShareCandidate = (QuickShareCandidate) obj;
                Integer numValueOf = Integer.valueOf(i);
                LIZ.getClass();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(quickShareCandidate.type);
                sbLIZ.append(':');
                String str = quickShareCandidate.candidateId;
                if (str == null) {
                    str = "";
                }
                sbLIZ.append(str);
                map.put(C2188811AlT.LIZIZ(sbLIZ), numValueOf);
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        IMContact[] iMContactArr = new IMContact[list2.size()];
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            IMContact iMContact = (IMContact) it2.next();
            Integer num = (Integer) map.remove(LIZJ(iMContact));
            if (num != null) {
                iMContact.setInfo(C1367140lgG.LIZ(iMContact.getInfo(), null, false, null, null, null, false, "quick_share", 63));
                iMContactArr[num.intValue()] = iMContact;
            } else {
                arrayList.add(iMContact);
            }
        }
        return new C790310UzN(C13LQ.LJIJI(iMContactArr), arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x02d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LIZIZ(java.util.List r14, com.ss.android.ugc.aweme.sharer.model.SharePackage r15, com.ss.android.ugc.aweme.base.share.QuickShareAIInfo r16) {
        /*
            Method dump skipped, instruction units count: 997
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1367280lgU.LIZIZ(java.util.List, com.ss.android.ugc.aweme.sharer.model.SharePackage, com.ss.android.ugc.aweme.base.share.QuickShareAIInfo):java.util.List");
    }
}
