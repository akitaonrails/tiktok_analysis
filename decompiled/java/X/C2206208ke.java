package X;

import com.ss.android.ugc.aweme.affinity.service.AffinityTaskServiceImpl;
import com.ss.android.ugc.aweme.affinity.service.IAffinityTaskService;
import java.util.Map;

/* JADX INFO: renamed from: X.08ke, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2206208ke implements IAffinityTaskService {
    public static final C2206208ke LIZIZ = new C2206208ke();
    public final /* synthetic */ IAffinityTaskService LIZ;

    @Override // com.ss.android.ugc.aweme.affinity.service.IAffinityTaskService
    public final C0CCZ LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.affinity.service.IAffinityTaskService
    public final void LIZIZ(Map<?, ?> map) {
        this.LIZ.LIZIZ(map);
    }

    public C2206208ke() {
        IAffinityTaskService iAffinityTaskService;
        Object objLIZ = C04TD.LIZ(IAffinityTaskService.class, false);
        if (objLIZ != null) {
            iAffinityTaskService = (IAffinityTaskService) objLIZ;
        } else {
            if (C04TD.LJZ == null) {
                synchronized (IAffinityTaskService.class) {
                    if (C04TD.LJZ == null) {
                        C04TD.LJZ = new AffinityTaskServiceImpl();
                    }
                }
            }
            iAffinityTaskService = C04TD.LJZ;
        }
        this.LIZ = iAffinityTaskService;
    }
}
