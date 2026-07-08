package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.List;

/* JADX INFO: renamed from: X.0i9q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1231720i9q {
    public static final int LIZ(List<? extends IMContact> list) {
        int conversationMemberCount = 0;
        for (IMContact iMContact : list) {
            if (iMContact instanceof IMConversation) {
                conversationMemberCount += ((IMConversation) iMContact).getConversationMemberCount();
            } else if (iMContact instanceof IMUser) {
                conversationMemberCount++;
            }
        }
        return conversationMemberCount;
    }
}
