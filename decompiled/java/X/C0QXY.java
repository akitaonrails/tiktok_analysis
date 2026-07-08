package X;

import com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ISearchService;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0QXY, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QXY {
    public static final C0QXY LIZ = new C0QXY();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(658));

    public static String LIZIZ() {
        String strLJIJ = ((ICommonFeedApiService) ServiceManager.get().getService(ICommonFeedApiService.class)).LJIJ();
        return (strLJIJ == null || strLJIJ.length() == 0) ? "" : strLJIJ;
    }

    public static AbstractC19484711Kz LIZ(C0QYL c0qyl) {
        return ((InterfaceC668070QIj) LIZIZ.getValue()).LIZ(null, LIZIZ(), LIZIZ(), null, ((ISearchService) ServiceManager.get().getService(ISearchService.class)).q0(), c0qyl.LIZ, c0qyl.LIZJ, c0qyl.LIZLLL, c0qyl.LJ, c0qyl.LJFF, c0qyl.LJI, c0qyl.LJII, c0qyl.LJIIIIZZ);
    }
}
