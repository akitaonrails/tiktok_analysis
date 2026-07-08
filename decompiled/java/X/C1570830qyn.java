package X;

import android.app.Activity;
import android.view.View;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.homepage.IHomePageService;

/* JADX INFO: renamed from: X.0qyn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1570830qyn {
    public static final View LIZ(Activity activity) {
        C19EG c19eg;
        IHomePageService iHomePageService;
        InterfaceC1570600qyQ interfaceC1570600qyQLJIILL;
        if (!C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLFII() || !(activity instanceof C19EG) || (c19eg = (C19EG) activity) == null || (iHomePageService = (IHomePageService) PluggableExtentionKt.pluggableSpi$default(IHomePageService.class, false, false, false, 14, null)) == null || (interfaceC1570600qyQLJIILL = iHomePageService.LJIILL(c19eg)) == null) {
            return null;
        }
        View viewZn2 = interfaceC1570600qyQLJIILL.Zn2();
        if (viewZn2 == null) {
            return interfaceC1570600qyQLJIILL.GA();
        }
        return viewZn2;
    }
}
