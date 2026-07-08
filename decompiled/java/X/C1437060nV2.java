package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IToolsVQEvaluationService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0nV2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1437060nV2 {
    public final VideoPublishEditModel LIZ;
    public final C1437400nVa LIZIZ;
    public final C1154760g9i LIZJ;
    public final AbstractC1435110nRt LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;

    public final boolean LIZ() {
        IToolsVQEvaluationService iToolsVQEvaluationService = (IToolsVQEvaluationService) ServiceManager.get().getService(IToolsVQEvaluationService.class);
        if (iToolsVQEvaluationService != null) {
            iToolsVQEvaluationService.LIZLLL();
        }
        return this.LIZJ.LIZ && C1433000nOU.LIZ(this.LIZ);
    }

    public /* synthetic */ C1437060nV2(VideoPublishEditModel videoPublishEditModel, C1437400nVa c1437400nVa, C1154760g9i c1154760g9i) {
        this(videoPublishEditModel, c1437400nVa, c1154760g9i, C1435130nRv.LIZIZ, false, false);
    }

    public C1437060nV2(VideoPublishEditModel videoPublishEditModel, C1437400nVa c1437400nVa, C1154760g9i c1154760g9i, AbstractC1435110nRt abstractC1435110nRt, boolean z, boolean z2) {
        this.LIZ = videoPublishEditModel;
        this.LIZIZ = c1437400nVa;
        this.LIZJ = c1154760g9i;
        this.LIZLLL = abstractC1435110nRt;
        this.LJ = z;
        this.LJFF = z2;
    }
}
