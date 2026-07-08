package X;

import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.service.IIMContactUtilService;

/* JADX INFO: renamed from: X.0Zbt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C903150Zbt {
    public static final C903150Zbt LIZ = new C903150Zbt();

    public static final IMUser LIZ(IMContact iMContact) {
        if (iMContact instanceof IMUser) {
            return (IMUser) iMContact;
        }
        String strLJIIJ = null;
        if (iMContact instanceof IMConversation) {
            IMConversation iMConversation = (IMConversation) iMContact;
            if (iMConversation.getConversationType() == AbstractC1711506n3.LIZ) {
                long jLJII = C0YNP.LJII(iMConversation.getConversationId());
                IMContactApi.LIZ.getClass();
                C1BGS c1bgsLJ = C069P.LIZ().LJ();
                String strValueOf = String.valueOf(jLJII);
                IIMContactUtilService.LIZ.getClass();
                IIMContactUtilService iIMContactUtilServiceLIZ = C913380ZsO.LIZ();
                if (iIMContactUtilServiceLIZ != null) {
                    strLJIIJ = iIMContactUtilServiceLIZ.LJIIJ(iMConversation.getConversationId());
                }
                return c1bgsLJ.LIZLLL(strValueOf, strLJIIJ, "im_share");
            }
        }
        return null;
    }
}
