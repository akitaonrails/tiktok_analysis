package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0iGd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1235930iGd {
    public static final void LIZ(SharePackage sharePackage, List<? extends IMContact> list) {
        ArrayList arrayList = new ArrayList();
        for (IMContact iMContact : list) {
            if (iMContact instanceof IMUser) {
                arrayList.add(iMContact);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((BaseContact) it2.next()).getUid());
        }
        String string = arrayList2.toString();
        String strSubstring = string.substring(1, string.length() - 1);
        ArrayList arrayList3 = new ArrayList();
        for (IMContact iMContact2 : list) {
            if (iMContact2 instanceof IMConversation) {
                arrayList3.add(iMContact2);
            }
        }
        ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((IMConversation) it3.next()).getConversationId());
        }
        String string2 = arrayList3.toString();
        String strSubstring2 = string2.substring(1, string2.length() - 1);
        int size = arrayList.size();
        int size2 = list.size() - size;
        Bundle bundle = sharePackage.extras;
        C786410Ut5.LJJJI("shareIdList", strSubstring, bundle);
        bundle.putStringArray("shared_users_id_list", (String[]) arrayList2.toArray(new String[0]));
        C786410Ut5.LJJJI("conversationIdList", strSubstring2, bundle);
        bundle.putStringArray("shared_conversation_id_list", (String[]) arrayList4.toArray(new String[0]));
        bundle.putInt("contact_count", list.size());
        bundle.putInt("chat_cnt", size);
        bundle.putInt("group_chat_cnt", size2);
    }
}
