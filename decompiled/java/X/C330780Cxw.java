package X;

import com.ss.android.ugc.aweme.comment.viewerlist.ViewerListServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.viewerlist.IViewerListService;

/* JADX INFO: renamed from: X.0Cxw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C330780Cxw implements IViewerListService {
    public static final C330780Cxw LIZIZ = new C330780Cxw();
    public final /* synthetic */ IViewerListService LIZ;

    @Override // com.ss.android.ugc.aweme.viewerlist.IViewerListService
    public final Object LIZ(Aweme aweme, long j, long j2, boolean z, String str, Boolean bool, Boolean bool2) {
        return this.LIZ.LIZ(aweme, j, j2, z, str, bool, bool2);
    }

    @Override // com.ss.android.ugc.aweme.viewerlist.IViewerListService
    public final boolean LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    public C330780Cxw() {
        IViewerListService iViewerListService;
        Object objLIZ = C04TD.LIZ(IViewerListService.class, false);
        if (objLIZ != null) {
            iViewerListService = (IViewerListService) objLIZ;
        } else {
            if (C04TD.LLJJIII == null) {
                synchronized (IViewerListService.class) {
                    if (C04TD.LLJJIII == null) {
                        C04TD.LLJJIII = new ViewerListServiceImpl();
                    }
                }
            }
            iViewerListService = C04TD.LLJJIII;
        }
        this.LIZ = iViewerListService;
    }
}
