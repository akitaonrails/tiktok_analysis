package X;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;

/* JADX INFO: renamed from: X.0614, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class AnonymousClass0614 {
    public static final AnonymousClass0614 LIZ = new AnonymousClass0614();

    public static CharSequence LIZJ() {
        C0I0B.LJFF.LIZJ();
        return C894660Z7w.LIZ().getResources().getString(2131848458, " ");
    }

    public static String LIZIZ(C869590Y9l c869590Y9l) {
        String strValueOf;
        if (c869590Y9l == null) {
            C0I0B.LJFF.LIZJ();
            return C894660Z7w.LIZ().getResources().getString(2131848390, " ");
        }
        long sender = c869590Y9l.getSender();
        IMContactApi.LIZ.getClass();
        IMUser iMUserLJIIL = C069P.LIZ().LJ().LJIIL(String.valueOf(sender), "", "im_local_db");
        if (iMUserLJIIL == null || (strValueOf = C892130YzD.LIZ(iMUserLJIIL, c869590Y9l.getConversationId())) == null) {
            strValueOf = String.valueOf(sender);
        }
        C0I0B.LJFF.LIZJ();
        return C894660Z7w.LIZ().getResources().getString(2131848459, strValueOf);
    }

    public static C370650Eg3 LIZ(float f, int i) {
        Context contextLJFF;
        int iIntValue;
        Activity activityLIZIZ;
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if ((abstractC1387200mCcLJ == null || (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) == null || (contextLJFF = C1388190mED.LIZ(activityLIZIZ)) == null) && (contextLJFF = C2214201BlK.LJFF()) == null) {
            C0I0B.LJFF.LIZJ();
            contextLJFF = C894660Z7w.LIZ();
        }
        Integer numLIZJ = C1308910kAL.LIZJ(i, contextLJFF);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        AnonymousClass0615 anonymousClass0615 = new AnonymousClass0615();
        anonymousClass0615.LIZ = iIntValue;
        return new C370650Eg3(C418440Gaw.LIZIZ(Float.valueOf(f)), anonymousClass0615.LIZ);
    }
}
