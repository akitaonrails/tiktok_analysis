package X;

import com.ss.android.ugc.aweme.im.ai.impl.smartreply.feedback.FeedbackPanelConfig;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.Collection;
import kotlin.jvm.internal.AFwS229S0000000_2;

/* JADX INFO: renamed from: X.0608, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class AnonymousClass0608 {
    public static final AnonymousClass0608 LIZ = new AnonymousClass0608();
    public static final C054G LIZIZ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));

    public static String LIZ(String str) {
        String string;
        long jLJII = C0YNP.LJII(str);
        if (jLJII <= 0) {
            return "";
        }
        IMContactApi.LIZ.getClass();
        IMUser iMUserLJIIL = C069P.LIZ().LJ().LJIIL(String.valueOf(jLJII), null, "im_local_db");
        if (iMUserLJIIL == null || (string = Integer.valueOf(iMUserLJIIL.getFollowStatus()).toString()) == null) {
            return "";
        }
        return string;
    }

    public static String LIZJ(Collection collection) {
        if (collection.isEmpty()) {
            return "";
        }
        return C13LP.LJJLIIIJ(collection, ",", null, null, 0, null, AFwS229S0000000_2.get$arr$(919), 30);
    }

    public static void LIZIZ(FeedbackPanelConfig feedbackPanelConfig, String str, String str2, boolean z) {
        C23250099c.LIZLLL(LIZIZ, null, null, new AnonymousClass0607(feedbackPanelConfig, str, str2, z, null), 3);
    }
}
