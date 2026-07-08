package X;

import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.framework.services.ServiceProvider;
import com.ss.android.ugc.aweme.search.ISearchDynamicService;
import com.ss.android.ugc.aweme.search.core.communicate.SearchDynamicServiceImpl;
import com.ss.android.ugc.aweme.search.voice.core.service.SearchDynamicServiceDefaultImpl;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0QsI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C684000QsI implements ISearchDynamicService {
    public static final C684000QsI LIZIZ = new C684000QsI();
    public final /* synthetic */ ISearchDynamicService LIZ;

    @Override // com.ss.android.ugc.aweme.search.ISearchDynamicService
    public final void LIZ(TuxIconView tuxIconView, Fragment fragment, C681130Qnf c681130Qnf, HashMap map, C681290Qnv c681290Qnv) {
        this.LIZ.LIZ(tuxIconView, fragment, c681130Qnf, map, c681290Qnv);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchDynamicService
    public final void LIZIZ(C19EG c19eg, Fragment fragment, HashMap<String, String> map, boolean z, C0QMK c0qmk, String str, int i) {
        this.LIZ.LIZIZ(c19eg, fragment, map, z, c0qmk, "search", i);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchDynamicService
    public final void LIZJ(TuxIconView tuxIconView, Fragment fragment, C0QMK c0qmk, HashMap<String, String> map) {
        this.LIZ.LIZJ(tuxIconView, fragment, c0qmk, map);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchDynamicService
    public final boolean LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    public C684000QsI() {
        ISearchDynamicService searchDynamicServiceDefaultImpl;
        Object c098200Yq;
        try {
            searchDynamicServiceDefaultImpl = SearchDynamicServiceImpl.LJ();
            if (searchDynamicServiceDefaultImpl instanceof SearchDynamicServiceDefaultImpl) {
                try {
                    c098200Yq = Class.forName("com.ss.android.ugc.aweme.search.core.communicate.SearchDynamicServiceImpl");
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                final Class cls = (Class) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
                if (cls != null) {
                    ServiceManager.get().bind(ISearchDynamicService.class, new ServiceProvider() { // from class: X.0QsJ
                        @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
                        public final Object get() {
                            return cls.newInstance();
                        }
                    }).asSingleton();
                }
                searchDynamicServiceDefaultImpl = SearchDynamicServiceImpl.LJ();
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            searchDynamicServiceDefaultImpl = new SearchDynamicServiceDefaultImpl();
        }
        this.LIZ = searchDynamicServiceDefaultImpl;
    }
}
