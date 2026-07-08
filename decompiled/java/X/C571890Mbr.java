package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.performance.IAVPerformance;

/* JADX INFO: renamed from: X.0Mbr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C571890Mbr extends AbstractC1585810rMx {
    public static final /* synthetic */ int LLILZ = 0;
    public final String LL;
    public boolean LLILLJJLI;
    public final IAVPerformance LLILLL;

    public C571890Mbr(String str) {
        IAVPerformance iAVPerformanceProvideAVPerformance;
        this.LL = str;
        IExternalService iExternalService = (IExternalService) ServiceManager.get().getService(IExternalService.class);
        if (iExternalService != null) {
            iAVPerformanceProvideAVPerformance = iExternalService.provideAVPerformance();
        } else {
            iAVPerformanceProvideAVPerformance = null;
        }
        this.LLILLL = iAVPerformanceProvideAVPerformance;
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        boolean z;
        IAVPerformance iAVPerformance;
        IAVPerformance iAVPerformance2;
        if (i == 0) {
            if (this.LLILLJJLI && (iAVPerformance2 = this.LLILLL) != null) {
                iAVPerformance2.stopPerformanceMonitor(this.LL);
            }
            z = false;
        } else {
            if (!this.LLILLJJLI && (iAVPerformance = this.LLILLL) != null) {
                iAVPerformance.startPerformanceMonitor(this.LL, 500, -1L);
            }
            z = true;
        }
        this.LLILLJJLI = z;
    }
}
