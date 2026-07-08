package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchApiNew;

/* JADX INFO: renamed from: X.0QAO, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QAO {
    public static final C0QAO LIZ = new C0QAO();
    public static final InterfaceC665790Q9p LIZIZ;

    static {
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class);
        SearchApiNew.LIZ.getClass();
        LIZIZ = (InterfaceC665790Q9p) iRetrofitFactory.createBuilder(SearchApiNew.LIZIZ).build().retrofit.LIZ(InterfaceC665790Q9p.class);
    }
}
