package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;

/* JADX INFO: renamed from: X.05yr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1529905yr {
    public static final String LIZ(IMContact iMContact) {
        if (iMContact instanceof IMUser) {
            return "private";
        }
        if (iMContact instanceof IMConversation) {
            return "group";
        }
        return null;
    }

    public static final String LIZIZ(IMContact iMContact) {
        if (iMContact instanceof IMConversation) {
            return ((IMConversation) iMContact).getConversationId();
        }
        if (iMContact instanceof IMUser) {
            return C0YNP.LJ(iMContact.getUid());
        }
        return null;
    }
}
