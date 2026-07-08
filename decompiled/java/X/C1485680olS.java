package X;

import com.ss.android.ugc.aweme.service.ICLAPerfETService;
import com.ss.android.ugc.aweme.service.perfetservice.ICLAPerfETServiceImpl;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0olS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1485680olS extends C09AY implements Function0<ICLAPerfETService> {
    public C1485680olS() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.service.ICLAPerfETService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final ICLAPerfETService invoke() {
        ?? LIZ = C04TD.LIZ(ICLAPerfETService.class, false);
        if (LIZ != 0) {
            return LIZ;
        }
        if (C04TD.r4 == null) {
            synchronized (ICLAPerfETService.class) {
                if (C04TD.r4 == null) {
                    C04TD.r4 = new ICLAPerfETServiceImpl();
                }
            }
        }
        return C04TD.r4;
    }
}
