package X;

import com.ss.android.ugc.aweme.im.activity.status.sdk.api.ActivityStatusExternalToolService;
import com.ss.android.ugc.aweme.im.activity.status.sdk.core.ActivityStatusExternalToolServiceImpl;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04TA, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C04TA extends C09AY implements Function0<ActivityStatusExternalToolService> {
    public C04TA() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.im.activity.status.sdk.api.ActivityStatusExternalToolService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final ActivityStatusExternalToolService invoke() {
        ?? LIZ = C04TD.LIZ(ActivityStatusExternalToolService.class, false);
        if (LIZ != 0) {
            return LIZ;
        }
        if (C04TD.T0 == null) {
            synchronized (ActivityStatusExternalToolService.class) {
                if (C04TD.T0 == null) {
                    C04TD.T0 = new ActivityStatusExternalToolServiceImpl();
                }
            }
        }
        return C04TD.T0;
    }
}
