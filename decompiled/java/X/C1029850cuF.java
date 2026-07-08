package X;

import com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend;
import com.ss.android.ugc.aweme.commercialize.ad.service.ICommercializeAdService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0cuF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1029850cuF {
    public static final C1029850cuF LIZ = new C1029850cuF();
    public static final IAdCommentDepend LIZIZ;

    static {
        ICommercializeAdService iCommercializeAdService = (ICommercializeAdService) ServiceManager.get().getService(ICommercializeAdService.class);
        LIZIZ = (IAdCommentDepend) (iCommercializeAdService != null ? iCommercializeAdService.Q(5) : null);
    }
}
