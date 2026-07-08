package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;

/* JADX INFO: renamed from: X.0IAn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C462190IAn {
    public static final /* synthetic */ int LIZ = 0;

    public static AnonymousClass0956 LIZ(SessionInfo sessionInfo, C869590Y9l c869590Y9l, InterfaceC462200IAo interfaceC462200IAo, LifecycleCoroutineScope lifecycleCoroutineScope) {
        IMContactApi.LIZ.getClass();
        IMUser iMUserLJ = C069P.LIZ().LJ().LJ(String.valueOf(c869590Y9l.getSender()), null);
        if (iMUserLJ != null) {
            interfaceC462200IAo.LIZIZ(iMUserLJ);
            return null;
        }
        return C23250099c.LIZLLL(lifecycleCoroutineScope, C0PEM.LIZJ, null, new C462240IAs(c869590Y9l, sessionInfo, interfaceC462200IAo, lifecycleCoroutineScope, null), 2);
    }
}
