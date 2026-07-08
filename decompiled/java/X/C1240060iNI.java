package X;

import com.ss.android.ugc.aweme.account.login.rememberaccount.LoginMethodListFragment;
import com.ss.android.ugc.aweme.account.oneclicklogin.IOneClickLoginService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0iNI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1240060iNI {
    public static List LIZ() {
        ArrayList arrayList = new ArrayList(((IOneClickLoginService) ServiceManager.get().getService(IOneClickLoginService.class)).LJIIIZ(null));
        C0XUD.LIZ.getClass();
        LoginMethodListFragment.LLLILZ = C0XUD.LJIIIZ + C0XUD.LJIIIIZZ;
        return arrayList;
    }
}
